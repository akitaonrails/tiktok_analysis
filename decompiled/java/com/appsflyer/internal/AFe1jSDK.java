package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class AFe1jSDK<Body> implements ResponseNetwork<Body> {
    public final AFe1mSDK AFInAppEventParameterName;
    public final Map<String, List<String>> AFInAppEventType;
    public final int AFKeystoreWrapper;
    public final Body valueOf;
    public final boolean values;

    public int hashCode() {
        return (((((((this.valueOf.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.values ? 1 : 0)) * 31) + this.AFInAppEventType.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }

    public final String AFInAppEventParameterName(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField != null && !headerField.isEmpty()) {
            Iterator<String> it2 = headerField.iterator();
            StringBuilder sb = new StringBuilder(it2.next());
            while (it2.hasNext()) {
                sb.append(", ");
                sb.append(it2.next());
            }
            return sb.toString();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1jSDK aFe1jSDK = (AFe1jSDK) obj;
        if (this.AFKeystoreWrapper != aFe1jSDK.AFKeystoreWrapper || this.values != aFe1jSDK.values || !this.valueOf.equals(aFe1jSDK.valueOf) || !this.AFInAppEventType.equals(aFe1jSDK.AFInAppEventType)) {
            return false;
        }
        return this.AFInAppEventParameterName.equals(aFe1jSDK.AFInAppEventParameterName);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        for (String str2 : this.AFInAppEventType.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFInAppEventType.get(str2);
            }
        }
        return null;
    }

    public AFe1jSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFe1mSDK aFe1mSDK) {
        this.valueOf = body;
        this.AFKeystoreWrapper = i;
        this.values = z;
        this.AFInAppEventType = new HashMap(map);
        this.AFInAppEventParameterName = aFe1mSDK;
    }
}
