package com.appsflyer.internal;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1eSDK extends AFe1dSDK<Void> {
    public final Throwable d;
    public final AFe1jSDK<String> e;
    public final AFd1qSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private Map<String, Object> e() {
        String strAFKeystoreWrapper = this.unregisterClient.AFKeystoreWrapper("attributionId", (String) null);
        if (strAFKeystoreWrapper == null) {
            return null;
        }
        try {
            new AFe1tSDK();
            return AFe1tSDK.values(strAFKeystoreWrapper);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        this.unregisterClient.valueOf("appsFlyerCount", 0);
        long jValues = this.unregisterClient.values("appsflyerConversionDataCacheExpiration", 0L);
        if (jValues != 0 && System.currentTimeMillis() - jValues > 5184000000L) {
            this.unregisterClient.valueOf("sixtyDayConversionData", true);
            this.unregisterClient.AFInAppEventParameterName("attributionId", (String) null);
            this.unregisterClient.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapE = e();
        if (mapE != null) {
            try {
                if (!mapE.containsKey("is_first_launch")) {
                    mapE.put("is_first_launch", Boolean.FALSE);
                }
                AFg1kSDK.valueOf(mapE);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return AFe1bSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (this.d != null) {
            AFg1kSDK.AFKeystoreWrapper("Launch exception: " + this.d.getMessage());
            return AFe1bSDK.SUCCESS;
        }
        AFe1jSDK<String> aFe1jSDK = this.e;
        if (aFe1jSDK != null && !aFe1jSDK.isSuccessful()) {
            AFg1kSDK.AFKeystoreWrapper("Launch status code: " + this.e.getStatusCode());
            return AFe1bSDK.SUCCESS;
        }
        return AFe1bSDK.FAILURE;
    }

    public AFg1eSDK(AFf1cSDK aFf1cSDK, AFd1qSDK aFd1qSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.d = aFf1cSDK.unregisterClient();
        this.e = ((AFf1nSDK) aFf1cSDK).registerClient;
        this.unregisterClient = aFd1qSDK;
    }
}
