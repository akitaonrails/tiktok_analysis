package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1sSDK {
    public static JSONObject valueOf(String str) {
        JSONObject jSONObjectValues = AFa1oSDK.values(str);
        if (jSONObjectValues != null) {
            try {
                if (jSONObjectValues.has("ol_id")) {
                    String strOptString = jSONObjectValues.optString("ol_scheme", null);
                    String strOptString2 = jSONObjectValues.optString("ol_domain", null);
                    String strOptString3 = jSONObjectValues.optString("ol_ver", null);
                    if (strOptString != null) {
                        AppsFlyerProperties.getInstance().set("onelinkScheme", strOptString);
                    }
                    if (strOptString2 != null) {
                        AppsFlyerProperties.getInstance().set("onelinkDomain", strOptString2);
                    }
                    if (strOptString3 != null) {
                        AppsFlyerProperties.getInstance().set("onelinkVersion", strOptString3);
                        return jSONObjectValues;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AFLogger.afErrorLogForExcManagerOnly("Error in handleResponse: " + th.getMessage(), th);
                AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().v().AFKeystoreWrapper();
                AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().v().AFInAppEventType();
            }
        }
        return jSONObjectValues;
    }
}
