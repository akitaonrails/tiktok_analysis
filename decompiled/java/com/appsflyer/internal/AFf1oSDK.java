package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1oSDK extends AFe1dSDK<Boolean> {
    public static volatile boolean AFLogger;
    public Boolean d;
    public final AFd1kSDK e;
    public final AFb1tSDK registerClient;
    public final AFe1cSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        for (AFb1qSDK aFb1qSDK : this.registerClient.values()) {
            AFLogger.INSTANCE.i(AFg1aSDK.CACHE, "resending request: " + aFb1qSDK.valueOf);
            try {
                AFh1qSDK aFh1qSDK = new AFh1qSDK(valueOf(aFb1qSDK), aFb1qSDK.AFInAppEventType(), aFb1qSDK.AFInAppEventParameterName, aFb1qSDK.values);
                AFe1cSDK aFe1cSDK = this.unregisterClient;
                aFe1cSDK.valueOf.execute(aFe1cSDK.new AnonymousClass2(new AFf1iSDK(aFh1qSDK, this.e)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.INSTANCE.e(AFg1aSDK.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.d = Boolean.TRUE;
        AFLogger = true;
        return AFe1bSDK.SUCCESS;
    }

    public static boolean e() {
        return AFLogger;
    }

    public AFf1oSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.LOAD_CACHE, new AFf1zSDK[0], "LoadCachedRequests");
        this.registerClient = aFd1kSDK.afErrorLog();
        this.unregisterClient = aFd1kSDK.afInfoLog();
        this.e = aFd1kSDK;
    }

    public static String valueOf(AFb1qSDK aFb1qSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = CastLongProtector.parseLong(aFb1qSDK.AFInAppEventParameterName, 10);
        String string = aFb1qSDK.valueOf;
        try {
            string = UriProtector.parse(string).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j) / 1000)).toString();
            return string;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return string;
        }
    }
}
