package com.appsflyer.internal;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.content.Context;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFa1aSDK implements Runnable {
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final WeakReference<Context> AFKeystoreWrapper;
    public final Map<String, String> AFLogger;
    public final String d;
    public final AFd1sSDK e;
    public final String unregisterClient;
    public final String valueOf;
    public final String values;

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("AFa1aSDK@731c.run");
        com_appsflyer_internal_AFa1aSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("AFa1aSDK@731c.run");
    }

    public final void com_appsflyer_internal_AFa1aSDK__run$___twin___() {
        String str;
        String str2 = this.AFInAppEventType;
        if (str2 == null || str2.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFKeystoreWrapper.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.d);
            map.put("sig-data", this.valueOf);
            map.put("signature", this.unregisterClient);
            Object map2 = new HashMap(map);
            Object obj = this.AFLogger;
            String strAFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().valueOf().AFKeystoreWrapper("referrer", "");
            AFh1lSDK aFh1lSDK = new AFh1lSDK();
            aFh1lSDK.unregisterClient = strAFKeystoreWrapper;
            AFb1vSDK aFb1vSDKAFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
            Map<String, Object> mapAFKeystoreWrapper = aFb1vSDKAFKeystoreWrapper.AFKeystoreWrapper(aFh1lSDK);
            mapAFKeystoreWrapper.put("price", this.AFInAppEventParameterName);
            mapAFKeystoreWrapper.put("currency", this.values);
            mapAFKeystoreWrapper.put("receipt_data", map2);
            if (obj != null) {
                mapAFKeystoreWrapper.put("extra_prms", obj);
            }
            mapAFKeystoreWrapper.putAll(aFb1vSDKAFKeystoreWrapper.AFInAppEventParameterName().i().AFInAppEventParameterName());
            aFh1lSDK.valueOf((Map<String, ?>) mapAFKeystoreWrapper);
            aFh1lSDK.valueOf(new AFj1xSDK(this.e).AFInAppEventParameterName(aFh1lSDK));
            values(context, aFh1lSDK);
            map.put("dev_key", this.AFInAppEventType);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1uSDK aFh1uSDK = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().AFInAppEventType.AFLogger;
            if (aFh1uSDK != null && (str = new AFb1zSDK(aFh1uSDK.AFKeystoreWrapper, aFh1uSDK.AFInAppEventParameterName).AFInAppEventParameterName) != null) {
                map.put("advertiserId", str);
            }
            AFh1nSDK aFh1nSDK = new AFh1nSDK();
            aFh1nSDK.valueOf(map);
            aFh1nSDK.valueOf(new AFj1xSDK(this.e).AFInAppEventParameterName(aFh1nSDK));
            final AFf1lSDK aFf1lSDKValues = values(context, aFh1nSDK);
            aFh1nSDK.values = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1aSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1nSDK) aFf1lSDKValues).registerClient.getBody());
                        boolean zOptBoolean = jSONObject.optBoolean("result");
                        AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                        AFa1aSDK.AFInAppEventParameterName(zOptBoolean, aFa1aSDK.valueOf, aFa1aSDK.AFInAppEventParameterName, aFa1aSDK.values, C786410Ut5.J3(jSONObject));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        AFa1aSDK aFa1aSDK2 = AFa1aSDK.this;
                        AFa1aSDK.AFInAppEventParameterName(false, aFa1aSDK2.valueOf, aFa1aSDK2.AFInAppEventParameterName, aFa1aSDK2.values, e.getMessage());
                    }
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, String str3) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFf1nSDK) aFf1lSDKValues).registerClient) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                    AFa1aSDK.AFInAppEventParameterName(false, aFa1aSDK.valueOf, aFa1aSDK.AFInAppEventParameterName, aFa1aSDK.values, str3);
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (AFb1vSDK.AFKeystoreWrapper != null) {
                AFInAppEventParameterName(false, this.valueOf, this.AFInAppEventParameterName, this.values, th.getMessage());
            }
        }
    }

    public static void com_appsflyer_internal_AFa1aSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AFa1aSDK aFa1aSDK) {
        try {
            aFa1aSDK.com_appsflyer_internal_AFa1aSDK__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static AFf1lSDK values(Context context, AFh1kSDK aFh1kSDK) {
        AFb1vSDK.AFKeystoreWrapper().valueOf(context);
        AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        aFh1kSDK.AFInAppEventType(aFd1kSDKAFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0));
        AFf1lSDK aFf1lSDK = new AFf1lSDK(aFh1kSDK, aFd1kSDKAFInAppEventParameterName);
        AFe1cSDK aFe1cSDKAfInfoLog = aFd1kSDKAFInAppEventParameterName.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFf1lSDK));
        return aFf1lSDK;
    }

    public static void AFInAppEventParameterName(boolean z, String str, String str2, String str3, String str4) {
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1vSDK.AFKeystoreWrapper;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            if (z) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInApp();
                return;
            }
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public AFa1aSDK(Context context, String str, AFd1sSDK aFd1sSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.d = str2;
        this.valueOf = str4;
        this.AFInAppEventParameterName = str5;
        this.values = str6;
        this.AFLogger = map;
        this.unregisterClient = str3;
        this.e = aFd1sSDK;
    }
}
