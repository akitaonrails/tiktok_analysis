package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.056z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13003056z {
    public static final C13003056z LIZ = new C13003056z();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1134));
    public static final Object LIZJ = new Object();
    public static volatile ScheduledFuture<?> LIZLLL;

    public static Long LIZIZ() {
        C13002056y.LIZ.getClass();
        C13002056y.LIZJ();
        long j = C13002056y.LJFF;
        if (j <= 0 || j == -1) {
            return null;
        }
        if (j < 10) {
            j = 10;
        }
        return Long.valueOf(j);
    }

    public static void LIZLLL() {
        synchronized (LIZJ) {
            try {
                ScheduledFuture<?> scheduledFuture = LIZLLL;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                LIZLLL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Long LIZ(X.C13003056z r13) {
        /*
            X.053y r0 = X.C12924053y.LIZ
            r0.getClass()
            long r11 = X.C12924053y.LIZ()
            r13.getClass()
            java.lang.Long r0 = LIZIZ()
            r10 = 0
            if (r0 == 0) goto L62
            long r8 = r0.longValue()
            X.056y r0 = X.C13002056y.LIZ
            r0.getClass()
            X.C13002056y.LIZJ()
            java.lang.Object r1 = X.C13002056y.LIZJ
            monitor-enter(r1)
            X.0571 r0 = X.C13002056y.LIZLLL     // Catch: java.lang.Throwable -> L25
            goto L2b
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            throw r0
        L2b:
            monitor-exit(r1)
            r4 = -1
            r6 = 0
            if (r0 == 0) goto L65
            com.bytedance.keva.Keva r1 = r0.LIZ()
            java.lang.String r0 = "last_full_batch_sync_ms"
            long r0 = r1.getLong(r0, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            long r1 = r3.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L63
            r0 = 1
        L49:
            if (r0 == 0) goto L4c
            r10 = r3
        L4c:
            if (r10 == 0) goto L65
            long r2 = r10.longValue()
        L52:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L77
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L77
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L68
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
        L62:
            return r10
        L63:
            r0 = 0
            goto L49
        L65:
            r2 = 0
            goto L52
        L68:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            long r11 = r11 - r2
            long r8 = r8 - r11
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L72
            r6 = r8
        L72:
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            return r10
        L77:
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13003056z.LIZ(X.056z):java.lang.Long");
    }

    public final void LIZJ(boolean z) {
        Long lLIZIZ = LIZIZ();
        if (lLIZIZ == null) {
            LIZLLL();
            return;
        }
        Long lLIZ = LIZ(this);
        if (lLIZ != null) {
            long jLongValue = lLIZ.longValue();
            long jLongValue2 = lLIZIZ.longValue();
            if (z) {
                if (jLongValue2 < 3600) {
                    jLongValue2 = 3600;
                }
                jLongValue = Math.max(jLongValue, jLongValue2 * 1000);
            }
            synchronized (LIZJ) {
                try {
                    ScheduledFuture<?> scheduledFuture = LIZLLL;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    LIZ.getClass();
                    LIZLLL = ((ScheduledExecutorService) LIZIZ.getValue()).schedule(new Runnable() { // from class: X.0572
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FullBatchSyncScheduler@4555.scheduleNextTick$1$1");
                            try {
                                C12998056u.LIZLLL();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FullBatchSyncScheduler@4555.scheduleNextTick$1$1");
                        }
                    }, jLongValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        LIZLLL();
    }
}
