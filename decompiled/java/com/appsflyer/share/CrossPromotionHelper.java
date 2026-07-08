package com.appsflyer.share;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1vSDK;
import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.internal.AFj1mSDK;
import com.appsflyer.internal.AFj1qSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class CrossPromotionHelper {
    public static String valueOf = "https://%simpression.%s";

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != 96801) {
                if (iHashCode == 120623625 && key.equals("impression")) {
                    valueOf = value;
                }
            } else if (key.equals("app")) {
                AFj1qSDK.AFKeystoreWrapper = value;
            }
        }
    }

    public static void AFInAppEventParameterName(String str, Context context, AFj1mSDK aFj1mSDK) {
        AFb1vSDK aFb1vSDKAFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
        aFb1vSDKAFKeystoreWrapper.valueOf(context);
        AFd1kSDK aFd1kSDKAFInAppEventParameterName = aFb1vSDKAFKeystoreWrapper.AFInAppEventParameterName();
        AFf1vSDK aFf1vSDK = new AFf1vSDK(aFd1kSDKAFInAppEventParameterName, str, aFj1mSDK);
        AFe1cSDK aFe1cSDKAfInfoLog = aFd1kSDKAFInAppEventParameterName.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFf1vSDK));
    }

    public static void logAndOpenStore(Context context, String str, String str2) throws Throwable {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) throws Throwable {
        LinkGenerator linkGeneratorAFInAppEventType = AFInAppEventType(context, str, str2, map, C786410Ut5.j4(AFj1qSDK.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()}));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.INSTANCE.i(AFg1aSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1aSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        C2204961BRm.LLJZ(AppsFlyerLib.getInstance(), context, "af_cross_promotion", map, new C0WZX("dzBzEgMqT9naWU4kV1yXbiF8TJaHS5ZszvWtVThVpjdzGp1dB0k85A==", new String[]{"01c45"}));
        AFInAppEventParameterName(linkGeneratorAFInAppEventType.generateLink(), context, new AFj1mSDK(context));
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.INSTANCE.i(AFg1aSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1aSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFInAppEventParameterName(AFInAppEventType(context, str, str2, map, C786410Ut5.j4(valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()})).generateLink(), context, null);
        }
    }

    public static LinkGenerator AFInAppEventType(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFKeystoreWrapper = str3;
        linkGenerator.valueOf = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }
}
