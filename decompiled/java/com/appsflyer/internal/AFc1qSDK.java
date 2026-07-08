package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1qSDK implements AFe1iSDK<AFc1pSDK> {
    @Override // com.appsflyer.internal.AFe1iSDK
    public final /* synthetic */ AFc1pSDK AFInAppEventType(String str) throws JSONException {
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        DeepLink deepLinkAFInAppEventParameterName = null;
        if (!z) {
            JSONObject jSONObject = new JSONObject(str);
            boolean zOptBoolean = jSONObject.optBoolean("found", false);
            boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
            if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
                deepLinkAFInAppEventParameterName = DeepLink.AFInAppEventParameterName(jSONObjectOptJSONObject);
                deepLinkAFInAppEventParameterName.AFKeystoreWrapper.put("is_deferred", true);
            }
            return new AFc1pSDK(zOptBoolean2, deepLinkAFInAppEventParameterName);
        }
        return new AFc1pSDK(false, null, 3, null);
    }
}
