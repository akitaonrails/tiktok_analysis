package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1zSDK {
    public final AFh1gSDK AFInAppEventParameterName;
    public final AFh1iSDK AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final boolean valueOf;
    public final String values;

    public final int hashCode() {
        int iHashCode = ((((this.valueOf ? 1 : 0) * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.values.hashCode();
        AFh1gSDK aFh1gSDK = this.AFInAppEventParameterName;
        return aFh1gSDK != null ? (iHashCode * 31) + aFh1gSDK.hashCode() : iHashCode;
    }

    public AFi1zSDK(String str) throws JSONException {
        AFh1iSDK aFh1iSDK;
        AFh1gSDK aFh1gSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = JSONObjectProtectorUtils.getString(jSONObject, "ver");
                this.AFKeystoreWrapper = string;
                this.valueOf = jSONObject.optBoolean("test_mode");
                this.values = str;
                if (string.startsWith("default")) {
                    aFh1iSDK = AFh1iSDK.DEFAULT;
                } else {
                    aFh1iSDK = AFh1iSDK.CUSTOM;
                }
                this.AFInAppEventType = aFh1iSDK;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
                if (jSONObjectOptJSONObject != null) {
                    aFh1gSDK = new AFh1gSDK(jSONObjectOptJSONObject);
                } else {
                    aFh1gSDK = null;
                }
                this.AFInAppEventParameterName = aFh1gSDK;
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1zSDK.class != obj.getClass()) {
            return false;
        }
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        if (this.valueOf != aFi1zSDK.valueOf || !this.AFKeystoreWrapper.equals(aFi1zSDK.AFKeystoreWrapper)) {
            return false;
        }
        return this.values.equals(aFi1zSDK.values);
    }
}
