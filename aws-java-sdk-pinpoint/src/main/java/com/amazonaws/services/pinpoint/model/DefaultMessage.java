/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Default Message across push notification, email, and sms.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultMessage implements Serializable, Cloneable, StructuredPojo {

    /** The message body of the notification, the email body or the text message. */
    private String body;
    /** Default message substitutions. Can be overridden by individual address substitutions. */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @param body
     *        The message body of the notification, the email body or the text message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @return The message body of the notification, the email body or the text message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @param body
     *        The message body of the notification, the email body or the text message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @return Default message substitutions. Can be overridden by individual address substitutions.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    public DefaultMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultMessage == false)
            return false;
        DefaultMessage other = (DefaultMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        return hashCode;
    }

    @Override
    public DefaultMessage clone() {
        try {
            return (DefaultMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.DefaultMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
