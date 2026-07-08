package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class AFe1sSDK<ResponseBody> {
    public final AFe1nSDK AFInAppEventParameterName;
    public final AFe1qSDK AFInAppEventType;
    public final AtomicBoolean AFKeystoreWrapper = new AtomicBoolean(false);
    public final ExecutorService valueOf;
    public final AFe1iSDK<ResponseBody> values;

    public final AFe1jSDK<ResponseBody> AFInAppEventType() throws Throwable {
        if (this.AFKeystoreWrapper.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFe1jSDK<String> aFe1jSDKAFKeystoreWrapper = this.AFInAppEventType.AFKeystoreWrapper(this.AFInAppEventParameterName);
        try {
            return new AFe1jSDK<>(this.values.AFInAppEventType(aFe1jSDKAFKeystoreWrapper.getBody()), aFe1jSDKAFKeystoreWrapper.AFKeystoreWrapper, aFe1jSDKAFKeystoreWrapper.values, aFe1jSDKAFKeystoreWrapper.AFInAppEventType, aFe1jSDKAFKeystoreWrapper.AFInAppEventParameterName);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
            throw new ParsingException(e.getMessage(), e, aFe1jSDKAFKeystoreWrapper);
        }
    }

    public AFe1sSDK(AFe1nSDK aFe1nSDK, ExecutorService executorService, AFe1qSDK aFe1qSDK, AFe1iSDK<ResponseBody> aFe1iSDK) {
        this.AFInAppEventParameterName = aFe1nSDK;
        this.valueOf = executorService;
        this.AFInAppEventType = aFe1qSDK;
        this.values = aFe1iSDK;
    }
}
