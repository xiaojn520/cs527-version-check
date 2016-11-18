// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.1,
// any modifications will be overwritten.
// ==============================================================

package org.codehaus.mojo.versions.model;

/**
 * 
 *         Describes a set of rules for how versions of artifacts
 * should be handled.
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class RuleSet
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field ignoreVersions.
     */
    private java.util.List<IgnoreVersion> ignoreVersions;

    /**
     * Field rules.
     */
    private java.util.List<Rule> rules;

    /**
     * The comparison method to use when no rule matches.
     */
    private String comparisonMethod;

    /**
     * Field modelEncoding.
     */
    private String modelEncoding = "UTF-8";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addIgnoreVersion.
     * 
     * @param ignoreVersion
     */
    public void addIgnoreVersion( IgnoreVersion ignoreVersion )
    {
        getIgnoreVersions().add( ignoreVersion );
    } //-- void addIgnoreVersion( IgnoreVersion )

    /**
     * Method addRule.
     * 
     * @param rule
     */
    public void addRule( Rule rule )
    {
        getRules().add( rule );
    } //-- void addRule( Rule )

    /**
     * Get the comparison method to use when no rule matches.
     * 
     * @return String
     */
    public String getComparisonMethod()
    {
        return this.comparisonMethod;
    } //-- String getComparisonMethod()

    /**
     * Method getIgnoreVersions.
     * 
     * @return List
     */
    public java.util.List<IgnoreVersion> getIgnoreVersions()
    {
        if ( this.ignoreVersions == null )
        {
            this.ignoreVersions = new java.util.ArrayList<IgnoreVersion>();
        }

        return this.ignoreVersions;
    } //-- java.util.List<IgnoreVersion> getIgnoreVersions()

    /**
     * Get the modelEncoding field.
     * 
     * @return String
     */
    public String getModelEncoding()
    {
        return this.modelEncoding;
    } //-- String getModelEncoding()

    /**
     * Method getRules.
     * 
     * @return List
     */
    public java.util.List<Rule> getRules()
    {
        if ( this.rules == null )
        {
            this.rules = new java.util.ArrayList<Rule>();
        }

        return this.rules;
    } //-- java.util.List<Rule> getRules()

    /**
     * Method removeIgnoreVersion.
     * 
     * @param ignoreVersion
     */
    public void removeIgnoreVersion( IgnoreVersion ignoreVersion )
    {
        getIgnoreVersions().remove( ignoreVersion );
    } //-- void removeIgnoreVersion( IgnoreVersion )

    /**
     * Method removeRule.
     * 
     * @param rule
     */
    public void removeRule( Rule rule )
    {
        getRules().remove( rule );
    } //-- void removeRule( Rule )

    /**
     * Set the comparison method to use when no rule matches.
     * 
     * @param comparisonMethod
     */
    public void setComparisonMethod( String comparisonMethod )
    {
        this.comparisonMethod = comparisonMethod;
    } //-- void setComparisonMethod( String )

    /**
     * Set version patterns to ignore for all artifacts.
     * 
     * @param ignoreVersions
     */
    public void setIgnoreVersions( java.util.List<IgnoreVersion> ignoreVersions )
    {
        this.ignoreVersions = ignoreVersions;
    } //-- void setIgnoreVersions( java.util.List )

    /**
     * Set the modelEncoding field.
     * 
     * @param modelEncoding
     */
    public void setModelEncoding( String modelEncoding )
    {
        this.modelEncoding = modelEncoding;
    } //-- void setModelEncoding( String )

    /**
     * Set the rules field.
     * 
     * @param rules
     */
    public void setRules( java.util.List<Rule> rules )
    {
        this.rules = rules;
    } //-- void setRules( java.util.List )

    
    /**
     * Creates a new empty rule set.
     */
    public RuleSet()
    {
        // enables no-arg construction
        comparisonMethod = "maven";
    }

          
    
    public String toString()
    {
        StringBuilder buf = new StringBuilder( 128 );
        buf.append( "RuleSet[rules = " );
        buf.append( rules );
        buf.append( ", comparisonMethod = \"" );
        buf.append( comparisonMethod );
        buf.append( "\"]" );
        return buf.toString();
    }
          
}
