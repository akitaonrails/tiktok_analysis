package com.appsflyer.internal;

import X.C1C7U;
import android.net.TrafficStats;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFe1dSDK<Result> implements Comparable<AFe1dSDK<?>>, Callable<AFe1bSDK> {
    public static final AtomicInteger unregisterClient = new AtomicInteger();
    public final Set<AFf1zSDK> AFInAppEventParameterName;
    public final AFf1zSDK AFInAppEventType;
    public volatile int AFKeystoreWrapper;
    public long AFLogger;
    public Throwable d;
    public final int e;
    public boolean i;
    public final String registerClient;
    public final Set<AFf1zSDK> valueOf;
    public AFe1bSDK values;

    public abstract long AFInAppEventParameterName();

    public void AFInAppEventParameterName(Throwable th) {
    }

    public void AFInAppEventType() {
    }

    public abstract AFe1bSDK AFKeystoreWrapper();

    public abstract boolean valueOf();

    public void values() {
        this.i = true;
    }

    public final AFe1bSDK AFLogger() {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.values = null;
        this.d = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.AFKeystoreWrapper++;
        try {
            AFe1bSDK aFe1bSDKAFKeystoreWrapper = AFKeystoreWrapper();
            this.values = aFe1bSDKAFKeystoreWrapper;
            this.AFLogger = System.currentTimeMillis() - jCurrentTimeMillis;
            AFInAppEventType();
            return aFe1bSDKAFKeystoreWrapper;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                this.d = th;
                this.values = AFe1bSDK.FAILURE;
                AFInAppEventParameterName(th);
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.AFLogger = System.currentTimeMillis() - jCurrentTimeMillis;
                AFInAppEventType();
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public /* synthetic */ AFe1bSDK call() {
        C1C7U.LIZ("AFe1dSDK@acae.call");
        AFe1bSDK aFe1bSDKAFLogger = AFLogger();
        C1C7U.LIZIZ("AFe1dSDK@acae.call");
        return aFe1bSDKAFLogger;
    }

    public final int hashCode() {
        return (this.AFInAppEventType.hashCode() * 31) + this.registerClient.hashCode();
    }

    public String toString() {
        String str = this.AFInAppEventType + "-" + this.registerClient;
        if (String.valueOf(this.e).equals(this.registerClient)) {
            return str;
        }
        return str + "-" + this.e;
    }

    public final boolean d() {
        return this.i;
    }

    public final Throwable unregisterClient() {
        return this.d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1dSDK<?> aFe1dSDK) {
        int i = this.AFInAppEventType.AFPurchaseDetails - aFe1dSDK.AFInAppEventType.AFPurchaseDetails;
        if (i == 0) {
            if (this.registerClient.equals(aFe1dSDK.registerClient)) {
                return 0;
            }
            return this.e - aFe1dSDK.e;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1dSDK aFe1dSDK = (AFe1dSDK) obj;
        if (this.AFInAppEventType != aFe1dSDK.AFInAppEventType) {
            return false;
        }
        return this.registerClient.equals(aFe1dSDK.registerClient);
    }

    public AFe1dSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.valueOf = hashSet;
        this.AFInAppEventParameterName = new HashSet();
        int iIncrementAndGet = unregisterClient.incrementAndGet();
        this.e = iIncrementAndGet;
        this.i = false;
        this.AFKeystoreWrapper = 0;
        this.AFInAppEventType = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.registerClient = str;
        } else {
            this.registerClient = String.valueOf(iIncrementAndGet);
        }
    }
}
