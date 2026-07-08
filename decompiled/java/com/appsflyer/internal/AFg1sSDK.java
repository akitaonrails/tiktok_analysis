package com.appsflyer.internal;

import X.C2097908Jt;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1sSDK implements AFg1tSDK {
    public final AppsFlyerProperties AFInAppEventType;
    public final AFd1pSDK AFKeystoreWrapper;
    public final AFg1vSDK valueOf;

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void values(Map<String, Object> map, AFf1zSDK aFf1zSDK) {
        boolean z;
        AFg1qSDK aFg1qSDKValueOf = this.valueOf.valueOf();
        AppsFlyerConsent appsFlyerConsent = this.AFKeystoreWrapper.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", Boolean.valueOf(appsFlyerConsent.isUserSubjectToGDPR()));
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", Boolean.valueOf(hasConsentForDataUsage.booleanValue()));
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", Boolean.valueOf(hasConsentForAdsPersonalization.booleanValue()));
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (aFg1qSDKValueOf != null) {
            if (appsFlyerConsent != null) {
                z = true;
            } else {
                z = false;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(aFg1qSDKValueOf.AFKeystoreWrapper));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(aFg1qSDKValueOf.values));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(aFg1qSDKValueOf.valueOf));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(aFg1qSDKValueOf.AFInAppEventType));
                linkedHashMap3.put("tcstring", aFg1qSDKValueOf.AFInAppEventParameterName);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFf1zSDK == AFf1zSDK.CONVERSION && this.AFInAppEventType.getString("enableTCFDataCollection") != null) {
            AFb1vSDK.AFInAppEventParameterName(map).put("api", C2097908Jt.LIZJ(new Pair("enableTCFDataCollection", this.AFInAppEventType.getString("enableTCFDataCollection"))));
        }
    }

    public AFg1sSDK(AFg1vSDK aFg1vSDK, AFd1pSDK aFd1pSDK, AppsFlyerProperties appsFlyerProperties) {
        this.valueOf = aFg1vSDK;
        this.AFKeystoreWrapper = aFd1pSDK;
        this.AFInAppEventType = appsFlyerProperties;
    }
}
