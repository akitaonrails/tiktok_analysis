package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1rSDK extends AFf1nSDK<String> {
    public final UUID afInfoLog;
    public final String force;
    public final LinkGenerator.ResponseListener i;
    public final String unregisterClient;
    public final Map<String, String> v;
    public final LinkGenerator w;

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        LinkGenerator.ResponseListener responseListener = this.i;
        if (responseListener != null) {
            if (this.values == AFe1bSDK.SUCCESS && (responseNetwork = ((AFf1nSDK) this).registerClient) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thUnregisterClient = unregisterClient();
            if (!(thUnregisterClient instanceof ParsingException)) {
                responseListener.onResponse(this.w.generateLink());
            } else if (((ParsingException) thUnregisterClient).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.w.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        return ((AFf1nSDK) this).AFLogger.AFInAppEventParameterName(this.unregisterClient, this.v, this.force, this.afInfoLog, str);
    }

    public AFf1rSDK(AFd1kSDK aFd1kSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.afInfoLog = uuid;
        this.unregisterClient = str;
        this.v = new HashMap(map);
        this.i = responseListener;
        this.force = str2;
        this.w = linkGenerator;
    }
}
