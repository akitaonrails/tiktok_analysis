package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.share.LinkGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFInAppEventType("onInstallConversionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFInAppEventType("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    private void AFInAppEventType(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failure");
            jSONObject.put("data", str2);
            int iHashCode = str.hashCode();
            if (iHashCode != -1390007222) {
                if (iHashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    onInstallConversionFailureNative(jSONObject);
                    return;
                }
                return;
            }
            if (str.equals("onAttributionFailure")) {
                onAttributionFailureNative(jSONObject);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.INSTANCE.e(AFg1aSDK.OTHER, "2dx error", e, false, false);
        }
    }
}
