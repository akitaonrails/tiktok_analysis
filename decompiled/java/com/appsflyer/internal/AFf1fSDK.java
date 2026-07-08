package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1fSDK extends AFe1dSDK<AFf1gSDK> {
    public AFh1aSDK AFLogger;
    public final AFg1wSDK afInfoLog;
    public AFf1gSDK d;
    public final AFg1ySDK e;
    public final AFg1zSDK force;
    public final AFg1xSDK i;
    public final AFf1eSDK registerClient;
    public final AFd1sSDK unregisterClient;
    public final String v;
    public final AFe1ySDK w;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private AFf1gSDK registerClient() throws Throwable {
        AFh1gSDK aFh1gSDK;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.v;
        String str2 = this.afInfoLog.AFLogger;
        if (str2 == null || str2.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str == null) {
            AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            String strAFKeystoreWrapper = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.unregisterClient.valueOf.AFKeystoreWrapper.getPackageName()}), str2);
            if (strAFKeystoreWrapper != null) {
                try {
                    if (!this.force.AFInAppEventParameterName()) {
                        AFLogger.INSTANCE.d(AFg1aSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                        return AFf1gSDK.USE_CACHED;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK = AFg1aSDK.REMOTE_CONTROL;
                    aFLogger.i(aFg1aSDK, "Cached config is expired, updating...");
                    AFe1jSDK<AFi1zSDK> aFe1jSDKAFInAppEventType = this.w.AFInAppEventType(this.force.values(), this.force.AFKeystoreWrapper(), strAFKeystoreWrapper, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).AFInAppEventType();
                    if (!aFe1jSDKAFInAppEventType.isSuccessful()) {
                        AFInAppEventParameterName(strAFKeystoreWrapper, jCurrentTimeMillis, null, null, aFe1jSDKAFInAppEventType);
                        aFLogger.w(aFg1aSDK, "failed to fetch remote config from CDN with status code: " + aFe1jSDKAFInAppEventType.getStatusCode());
                        return AFf1gSDK.FAILURE;
                    }
                    AFi1zSDK body = aFe1jSDKAFInAppEventType.getBody();
                    String strAFInAppEventParameterName = aFe1jSDKAFInAppEventType.AFInAppEventParameterName("x-amz-meta-af-auth-v1");
                    String strAFInAppEventParameterName2 = aFe1jSDKAFInAppEventType.AFInAppEventParameterName("X-Af-Date");
                    String strAFInAppEventParameterName3 = aFe1jSDKAFInAppEventType.AFInAppEventParameterName("CF-Cache-Status");
                    String str3 = this.afInfoLog.AFLogger;
                    boolean zAFKeystoreWrapper = new AFf1aSDK().AFKeystoreWrapper(strAFInAppEventParameterName2);
                    if (str3 == null || str3.trim().length() == 0) {
                        aFLogger.w(aFg1aSDK, "Dev key is not set, SDK is not started.");
                        return AFf1gSDK.FAILURE;
                    }
                    AFh1dSDK aFh1dSDKValueOf = this.e.valueOf(body, strAFInAppEventParameterName, strAFKeystoreWrapper, str3);
                    if (!aFh1dSDKValueOf.AFInAppEventParameterName()) {
                        AFInAppEventParameterName(strAFKeystoreWrapper, jCurrentTimeMillis, aFh1dSDKValueOf.valueOf, strAFInAppEventParameterName3, aFe1jSDKAFInAppEventType);
                        aFLogger.w(aFg1aSDK, "fetched config is not valid (MITM?) refuse to use it.");
                        return AFf1gSDK.FAILURE;
                    }
                    if ((!zAFKeystoreWrapper) && (aFh1gSDK = body.AFInAppEventParameterName) != null) {
                        aFh1gSDK.AFInAppEventType = null;
                    }
                    long jAFInAppEventType = this.force.AFInAppEventType();
                    aFLogger.v(aFg1aSDK, "using max-age fallback: " + jAFInAppEventType + " seconds");
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    AFg1xSDK aFg1xSDK = this.i;
                    aFg1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("af_remote_config", Base64.encodeToString(body.values.getBytes(Charset.defaultCharset()), 2));
                    aFg1xSDK.values = aFg1xSDK.valueOf;
                    aFg1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_timestamp", jCurrentTimeMillis2);
                    aFg1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_max_age", jAFInAppEventType);
                    aFg1xSDK.valueOf = body;
                    aFg1xSDK.AFInAppEventType = jCurrentTimeMillis2;
                    aFg1xSDK.AFInAppEventParameterName = jAFInAppEventType;
                    aFLogger.d(aFg1aSDK, "Config successfully updated, timeToLive: " + jAFInAppEventType + " seconds");
                    AFInAppEventParameterName(strAFKeystoreWrapper, jCurrentTimeMillis, aFh1dSDKValueOf.valueOf, strAFInAppEventParameterName3, aFe1jSDKAFInAppEventType);
                    return AFf1gSDK.SUCCESS;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AFLogger.INSTANCE.e(AFg1aSDK.REMOTE_CONTROL, "failed to fetch remote config: " + e.getMessage(), e, true, false, false);
                    AFInAppEventParameterName(strAFKeystoreWrapper, jCurrentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                    if (e.getCause() instanceof InterruptedIOException) {
                        throw e.getCause();
                    }
                    return AFf1gSDK.FAILURE;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AFLogger.INSTANCE.e(AFg1aSDK.REMOTE_CONTROL, "failed to update remote config: " + th.getMessage(), th, true, false, false);
                    AFInAppEventParameterName(strAFKeystoreWrapper, jCurrentTimeMillis, null, null, null, null, th);
                    if (th.getCause() instanceof InterruptedException) {
                        throw th.getCause();
                    }
                    return AFf1gSDK.FAILURE;
                }
            }
        }
        AFLogger.INSTANCE.v(AFg1aSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
        return AFf1gSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() throws Throwable {
        try {
            AFf1gSDK aFf1gSDKRegisterClient = registerClient();
            this.d = aFf1gSDKRegisterClient;
            return aFf1gSDKRegisterClient == AFf1gSDK.FAILURE ? AFe1bSDK.FAILURE : AFe1bSDK.SUCCESS;
        } catch (InterruptedException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (SocketTimeoutException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (InterruptedIOException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        }
    }

    private void AFInAppEventParameterName(String str, long j, AFh1bSDK aFh1bSDK, String str2, AFe1jSDK<AFi1zSDK> aFe1jSDK) {
        AFi1zSDK body;
        String str3 = str2;
        if (aFe1jSDK != null) {
            body = aFe1jSDK.getBody();
        } else {
            body = null;
        }
        if (str3 == null) {
            str3 = null;
        }
        AFInAppEventParameterName(str, j, aFe1jSDK, body, aFh1bSDK, str3, null);
    }

    private void AFInAppEventParameterName(String str, long j, AFe1jSDK<?> aFe1jSDK, AFi1zSDK aFi1zSDK, AFh1bSDK aFh1bSDK, String str2, Throwable th) {
        long j2;
        int statusCode;
        Throwable cause;
        String str3;
        if (aFe1jSDK != null) {
            j2 = aFe1jSDK.AFInAppEventParameterName.AFKeystoreWrapper;
            statusCode = aFe1jSDK.getStatusCode();
        } else {
            j2 = 0;
            statusCode = 0;
        }
        if (th instanceof HttpException) {
            cause = th.getCause();
            j2 = ((HttpException) th).getMetrics().AFKeystoreWrapper;
        } else {
            cause = th;
        }
        if (aFi1zSDK != null) {
            str3 = aFi1zSDK.AFKeystoreWrapper;
        } else {
            str3 = null;
        }
        this.AFLogger = new AFh1aSDK(str3, str, j2, System.currentTimeMillis() - j, statusCode, aFh1bSDK, str2, cause);
    }

    public AFf1fSDK(AFg1ySDK aFg1ySDK, AFd1sSDK aFd1sSDK, AFg1wSDK aFg1wSDK, AFg1xSDK aFg1xSDK, AFe1ySDK aFe1ySDK, AFg1zSDK aFg1zSDK, String str, AFf1eSDK aFf1eSDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.e = aFg1ySDK;
        this.unregisterClient = aFd1sSDK;
        this.afInfoLog = aFg1wSDK;
        this.i = aFg1xSDK;
        this.w = aFe1ySDK;
        this.force = aFg1zSDK;
        this.v = str;
        this.registerClient = aFf1eSDK;
    }
}
