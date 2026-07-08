package com.appsflyer.internal;

import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1vSDK {
    public String AFInAppEventParameterName;
    public Intent AFInAppEventType;
    public List<List<String>> AFKeystoreWrapper = new ArrayList();
    public final List<String> AFLogger = new ArrayList();
    public final AFd1kSDK e;
    public long registerClient;
    public String[] unregisterClient;
    public DeepLinkListener valueOf;
    public Map<String, String> values;

    public AFc1vSDK(AFd1kSDK aFd1kSDK) {
        this.e = aFd1kSDK;
    }

    public static Bundle INVOKEVIRTUAL_com_appsflyer_internal_AFc1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void AFKeystoreWrapper(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.valueOf != null) {
            try {
                try {
                    DeepLink deepLinkValues = DeepLink.values(map);
                    deepLinkValues.AFKeystoreWrapper.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(deepLinkValues, null);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AFLogger.INSTANCE.e(AFg1aSDK.DDL, "Error occurred", e, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                values(deepLinkResult);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                values(new DeepLinkResult(null, null));
                throw th;
            }
        }
        values(map);
    }

    public final void values(DeepLinkResult deepLinkResult) {
        if (this.valueOf != null) {
            AFLogger.INSTANCE.d(AFg1aSDK.DDL, "Calling onDeepLinking with:\n" + deepLinkResult.toString());
            try {
                this.valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFg1aSDK.DDL, "skipping, no callback registered");
    }

    public static void AFKeystoreWrapper(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    public static void values(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private Uri values(Object obj, Iterator<String> it2) {
        while (obj != JSONObject.NULL) {
            if (!it2.hasNext()) {
                Uri uri = UriProtector.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it2.next());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void values(String str, DeepLinkResult.Error error) {
        if (this.valueOf != null) {
            AFLogger.INSTANCE.d(AFg1aSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            values(new DeepLinkResult(null, error));
        } else {
            AFKeystoreWrapper(str);
        }
    }

    private boolean AFInAppEventType(Intent intent, Context context, AFc1oSDK aFc1oSDK) {
        Uri data;
        Uri data2;
        String string;
        Uri uriValues;
        Uri uri = null;
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            data = intent.getData();
        } else {
            data = null;
        }
        Intent intent2 = this.AFInAppEventType;
        if (intent2 != null && "android.intent.action.VIEW".equals(intent2.getAction())) {
            data2 = intent2.getData();
        } else {
            data2 = null;
        }
        if (intent != null) {
            Bundle bundleINVOKEVIRTUAL_com_appsflyer_internal_AFc1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_appsflyer_internal_AFc1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
            if (!this.AFKeystoreWrapper.isEmpty() && bundleINVOKEVIRTUAL_com_appsflyer_internal_AFc1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
                Iterator<List<String>> it2 = this.AFKeystoreWrapper.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    List<String> next = it2.next();
                    if (next != null) {
                        Iterator<String> it3 = next.iterator();
                        if (it3.hasNext() && (string = bundleINVOKEVIRTUAL_com_appsflyer_internal_AFc1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString(it3.next())) != null && (uriValues = values(string, it3)) != null) {
                            AFb1vSDK.AFInAppEventParameterName(aFc1oSDK.AFInAppEventParameterName).put("payloadKey", this.AFKeystoreWrapper);
                            AFc1kSDK aFc1kSDK = aFc1oSDK.values;
                            if (aFc1kSDK != null) {
                                aFc1kSDK.values(aFc1oSDK.AFInAppEventParameterName);
                            }
                            uri = uriValues;
                        }
                    }
                }
            }
        }
        if (data != null) {
            AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
            if (aFj1ySDK.values("af_consumed")) {
                return false;
            }
            aFj1ySDK.AFInAppEventParameterName("af_consumed", System.currentTimeMillis());
            AFKeystoreWrapper(context, aFc1oSDK, data);
            return true;
        }
        if (data2 != null) {
            AFj1ySDK aFj1ySDK2 = new AFj1ySDK(this.AFInAppEventType);
            if (aFj1ySDK2.values("af_consumed")) {
                return false;
            }
            aFj1ySDK2.AFInAppEventParameterName("af_consumed", System.currentTimeMillis());
            AFKeystoreWrapper(context, aFc1oSDK, data2);
            return true;
        }
        if (uri != null) {
            AFj1ySDK aFj1ySDK3 = new AFj1ySDK(intent);
            if (!aFj1ySDK3.values("af_consumed")) {
                aFj1ySDK3.AFInAppEventParameterName("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, aFc1oSDK, uri);
                return true;
            }
        }
        return false;
    }

    public final void AFInAppEventParameterName(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1nSDK aFd1nSDK = (AFd1nSDK) this.e;
        if (context != null) {
            aFd1nSDK.AFInAppEventParameterName.AFKeystoreWrapper = C786410Ut5.N3(context);
        }
        if (!AFInAppEventType(intent, context, aFc1oSDK) && this.valueOf != null && this.e.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) == 0 && !this.e.valueOf().AFInAppEventType("ddl_sent")) {
            AFc1jSDK aFc1jSDK = new AFc1jSDK();
            AFe1cSDK aFe1cSDKAfInfoLog = this.e.afInfoLog();
            aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(new AFf1kSDK(aFc1jSDK, this.e)));
        }
        this.e.valueOf().valueOf("ddl_sent", true);
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri) {
        AFf1jSDK aFf1jSDK = new AFf1jSDK(context, aFc1oSDK, uri, this.AFLogger);
        AFe1cSDK aFe1cSDKAfInfoLog = this.e.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFf1jSDK));
        this.AFInAppEventType = null;
    }
}
