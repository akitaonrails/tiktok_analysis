package com.appsflyer.internal;

import X.C786410Ut5;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1lSDK extends AFf1nSDK<Map<String, Object>> {
    public static final List<String> unregisterClient = Arrays.asList("googleplay", "playstore", "googleplaystore");
    public Map<String, Object> afInfoLog;
    public String afWarnLog;
    public final AFh1wSDK force;
    public final AFd1qSDK i;
    public final AFd1sSDK v;
    public final AFe1ySDK w;

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        AFe1bSDK aFe1bSDK;
        if (((AFf1nSDK) this).d.AFKeystoreWrapper()) {
            this.afWarnLog = "'isStopTracking' enabled";
            throw new AFf1wSDK();
        }
        AFe1bSDK aFe1bSDKAFKeystoreWrapper = AFe1bSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.force.i = System.currentTimeMillis();
            try {
                try {
                    aFe1bSDKAFKeystoreWrapper = super.AFKeystoreWrapper();
                    ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
                    if (responseNetwork == null) {
                        continue;
                    } else {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z = false;
                        }
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.i.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                map.containsKey("af_channel");
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.i.AFInAppEventParameterName("attributionId", C786410Ut5.J3(new JSONObject(map)));
                            if (!this.i.AFInAppEventType("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afInfoLog = map;
                            aFe1bSDK = AFe1bSDK.SUCCESS;
                            this.force.valueOf(i);
                            return aFe1bSDK;
                        }
                        if (z2 || !z) {
                            this.afWarnLog = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1bSDK = AFe1bSDK.FAILURE;
                            this.force.valueOf(i);
                            return aFe1bSDK;
                        }
                    }
                } catch (AFe1aSDK e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.afWarnLog = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    AFLogger.afErrorLog("[GCD] Error: " + e2.getMessage(), e2, false, false);
                    aFe1bSDKAFKeystoreWrapper = AFe1bSDK.FAILURE;
                    if (z2) {
                        this.afWarnLog = e2.getMessage();
                        throw e2;
                    }
                }
                this.force.valueOf(i);
                i++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.force.valueOf(i);
                throw th;
            }
        }
        return aFe1bSDKAFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        Map<String, Object> map = this.afInfoLog;
        String str = this.afWarnLog;
        if (map != null) {
            AFg1kSDK.valueOf(map);
        } else if (str == null || str.isEmpty()) {
            AFg1kSDK.AFKeystoreWrapper("Unknown error");
        } else {
            AFg1kSDK.AFKeystoreWrapper(str);
        }
    }

    public AFg1lSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, "GCD-FETCH");
        this.w = aFd1kSDK.AFInAppEventParameterName();
        this.i = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.AFLogger();
        this.v = aFd1kSDK.AFInAppEventType();
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
        this.AFInAppEventParameterName.add(AFf1zSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(String str) {
        String strConcat;
        String strAFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper(this.i, this.v.d());
        if (strAFKeystoreWrapper != null && !strAFKeystoreWrapper.trim().isEmpty() && !unregisterClient.contains(strAFKeystoreWrapper.toLowerCase(Locale.getDefault()))) {
            strConcat = "-".concat(strAFKeystoreWrapper);
        } else {
            strConcat = "";
        }
        AFe1sSDK<Map<String, Object>> aFe1sSDKAFKeystoreWrapper = this.w.AFKeystoreWrapper(strConcat, str);
        AFb1mSDK.AFKeystoreWrapper("[GCD-B01] URL: " + aFe1sSDKAFKeystoreWrapper.AFInAppEventParameterName.values);
        return aFe1sSDKAFKeystoreWrapper;
    }
}
