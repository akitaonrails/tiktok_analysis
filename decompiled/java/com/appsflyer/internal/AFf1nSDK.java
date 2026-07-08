package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFf1nSDK<Result> extends AFe1dSDK<AFe1jSDK<Result>> {
    public final AFe1ySDK AFLogger;
    public final AFg1wSDK d;
    public final AFb1bSDK e;
    public AFe1jSDK<Result> registerClient;
    public AFb1tSDK unregisterClient;
    public String v;

    @Override // com.appsflyer.internal.AFe1dSDK
    public long AFInAppEventParameterName() {
        return 60000L;
    }

    public abstract AFe1sSDK<Result> AFKeystoreWrapper(String str);

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener e();

    public abstract boolean i();

    @Override // com.appsflyer.internal.AFe1dSDK
    public void AFInAppEventType() {
        String str;
        if (this.values == AFe1bSDK.SUCCESS) {
            String str2 = this.v;
            if (str2 != null) {
                this.unregisterClient.values(str2);
                return;
            }
            return;
        }
        if (valueOf() || (str = this.v) == null) {
            return;
        }
        this.unregisterClient.values(str);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public AFe1bSDK AFKeystoreWrapper() {
        if (a_() && this.d.AFKeystoreWrapper()) {
            AppsFlyerRequestListener appsFlyerRequestListenerE = e();
            if (appsFlyerRequestListenerE != null) {
                appsFlyerRequestListenerE.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1wSDK();
        }
        String str = this.d.AFLogger;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerE2 = e();
            if (appsFlyerRequestListenerE2 != null) {
                appsFlyerRequestListenerE2.onError(41, "No dev key");
            }
            throw new AFe1aSDK();
        }
        AFe1sSDK<Result> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(str);
        if (aFe1sSDKAFKeystoreWrapper == null) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            return AFe1bSDK.FAILURE;
        }
        if (i()) {
            values(aFe1sSDKAFKeystoreWrapper.AFInAppEventParameterName);
        }
        AFe1jSDK<Result> aFe1jSDKAFInAppEventType = aFe1sSDKAFKeystoreWrapper.AFInAppEventType();
        this.registerClient = aFe1jSDKAFInAppEventType;
        this.e.AFKeystoreWrapper(aFe1sSDKAFKeystoreWrapper.AFInAppEventParameterName.values, aFe1jSDKAFInAppEventType.getStatusCode(), aFe1jSDKAFInAppEventType.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerE3 = e();
        if (appsFlyerRequestListenerE3 != null) {
            if (aFe1jSDKAFInAppEventType.isSuccessful()) {
                appsFlyerRequestListenerE3.onSuccess();
            } else {
                appsFlyerRequestListenerE3.onError(50, "Status code failure " + aFe1jSDKAFInAppEventType.getStatusCode());
            }
        }
        return aFe1jSDKAFInAppEventType.isSuccessful() ? AFe1bSDK.SUCCESS : AFe1bSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public boolean valueOf() {
        if (unregisterClient() instanceof AFf1wSDK) {
            return false;
        }
        if (this.values == AFe1bSDK.TIMEOUT) {
            return true;
        }
        Throwable thUnregisterClient = unregisterClient();
        return (thUnregisterClient instanceof IOException) && !(thUnregisterClient instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void values() {
        String str;
        super.values();
        if (!i() || (str = this.d.AFLogger) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1sSDK<Result> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(str);
        if (aFe1sSDKAFKeystoreWrapper != null) {
            values(aFe1sSDKAFKeystoreWrapper.AFInAppEventParameterName);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    private void values(AFe1nSDK aFe1nSDK) {
        String str = this.v;
        this.v = this.unregisterClient.AFInAppEventType(new AFb1qSDK(aFe1nSDK.values, aFe1nSDK.AFInAppEventParameterName(), "6.14.0", this.AFInAppEventType));
        if (str != null) {
            this.unregisterClient.values(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventParameterName(Throwable th) {
        boolean z = !(th instanceof HttpException);
        if (th instanceof AFf1wSDK) {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th, true, false);
        } else {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th)), th, true, true, z);
        }
        AppsFlyerRequestListener appsFlyerRequestListenerE = e();
        if (appsFlyerRequestListenerE != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerE.onError(40, message);
        }
    }

    public AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
    }

    public AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str, String str2) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
        this.v = str2;
    }

    public AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFe1ySDK aFe1ySDK, AFg1wSDK aFg1wSDK, AFb1bSDK aFb1bSDK, AFb1tSDK aFb1tSDK, String str) {
        super(aFf1zSDK, aFf1zSDKArr, str);
        this.AFLogger = aFe1ySDK;
        this.d = aFg1wSDK;
        this.e = aFb1bSDK;
        this.unregisterClient = aFb1tSDK;
    }
}
