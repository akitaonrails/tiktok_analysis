package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1iSDK extends AFf1nSDK<String> {
    public final AFh1qSDK unregisterClient;

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return this.unregisterClient.values;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        ResponseNetwork responseNetwork;
        AFf1zSDK aFf1zSDK = this.unregisterClient.v;
        if (aFf1zSDK == null) {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        return (aFf1zSDK == AFf1zSDK.ARS_VALIDATE && (responseNetwork = ((AFf1nSDK) this).registerClient) != null && responseNetwork.getStatusCode() == 424) || super.valueOf();
    }

    public static String AFInAppEventType(AFh1qSDK aFh1qSDK) {
        try {
            return new URL(aFh1qSDK.registerClient).getHost();
        } catch (MalformedURLException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        ((AFf1nSDK) this).e.valueOf(this.unregisterClient.registerClient, Base64.encodeToString(this.unregisterClient.AFKeystoreWrapper(), 2));
        return ((AFf1nSDK) this).AFLogger.AFInAppEventType(this.unregisterClient);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFf1iSDK(AFh1qSDK aFh1qSDK, AFd1kSDK aFd1kSDK) {
        AFf1zSDK aFf1zSDK = aFh1qSDK.v;
        aFf1zSDK = aFf1zSDK == null ? AFf1zSDK.CACHED_EVENT : aFf1zSDK;
        super(aFf1zSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, aFh1qSDK.AFKeystoreWrapper + "-" + AFInAppEventType(aFh1qSDK), aFh1qSDK.AFKeystoreWrapper);
        this.unregisterClient = aFh1qSDK;
    }
}
