package com.appsflyer.internal;

import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1fSDK {
    public final long AFInAppEventParameterName;
    public final int AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final int valueOf;

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.valueOf) * 31) + this.AFInAppEventType) * 31) + ((int) this.AFInAppEventParameterName);
    }

    public final String valueOf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFKeystoreWrapper);
            jSONObject.put("min", this.valueOf);
            jSONObject.put("expire", this.AFInAppEventType);
            jSONObject.put("ttl", this.AFInAppEventParameterName);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1fSDK.class == obj.getClass()) {
            AFh1fSDK aFh1fSDK = (AFh1fSDK) obj;
            if (this.valueOf == aFh1fSDK.valueOf && this.AFInAppEventType == aFh1fSDK.AFInAppEventType && this.AFInAppEventParameterName == aFh1fSDK.AFInAppEventParameterName && (str = this.AFKeystoreWrapper) != null && str.equals(aFh1fSDK.AFKeystoreWrapper)) {
                return true;
            }
        }
        return false;
    }

    public AFh1fSDK(String str, int i, int i2, long j) {
        this.AFKeystoreWrapper = str;
        this.valueOf = i;
        this.AFInAppEventType = i2;
        this.AFInAppEventParameterName = j;
    }
}
