package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.experiment.RiskyRetryReportStrategy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.084l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20581084l {
    public static final Object LIZ = new Object();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(744));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(745));

    public static C1910107dz LIZ(String str) {
        boolean z;
        RiskyRetryReportStrategy riskyRetryReportStrategy = (RiskyRetryReportStrategy) C20583084n.LIZIZ.getValue();
        double d = riskyRetryReportStrategy.qpsThreshold;
        if (d < 1.0E-4d) {
            d = 1.0E-4d;
        }
        double d2 = 1000.0d / d;
        long j = riskyRetryReportStrategy.backoffInitialMs;
        if (j < 1) {
            j = 1;
        }
        int i = riskyRetryReportStrategy.backoffMaxLevel;
        if (i < 1) {
            i = 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (LIZ) {
            try {
                C01GW c01gw = LIZJ;
                C20582084m c20582084m = (C20582084m) ((LinkedHashMap) c01gw.getValue()).get(str);
                if (c20582084m == null) {
                    c20582084m = new C20582084m();
                    ((LinkedHashMap) c01gw.getValue()).put(str, c20582084m);
                    if (((LinkedHashMap) c01gw.getValue()).size() > ((Number) LIZIZ.getValue()).intValue()) {
                        ((LinkedHashMap) c01gw.getValue()).remove((String) ((LinkedHashMap) c01gw.getValue()).keySet().iterator().next());
                    }
                }
                if (c20582084m.LIZ != 0 && jCurrentTimeMillis - r0 <= d2) {
                    z = true;
                } else {
                    z = false;
                }
                long j2 = c20582084m.LIZJ;
                if (j2 == 0) {
                    c20582084m.LIZIZ = jCurrentTimeMillis;
                }
                c20582084m.LIZJ = j2 + 1;
                c20582084m.LIZ = jCurrentTimeMillis;
                if (!z) {
                    c20582084m.LIZLLL = 0;
                    c20582084m.LJ = 0L;
                    return LIZIZ(c20582084m, jCurrentTimeMillis);
                }
                int i2 = c20582084m.LIZLLL;
                if (i2 == 0) {
                    c20582084m.LIZLLL = 1;
                    c20582084m.LJ = (j << (C13LZ.LJ(1, 1, i) - 1)) + jCurrentTimeMillis;
                    return LIZIZ(c20582084m, jCurrentTimeMillis);
                }
                if (jCurrentTimeMillis >= c20582084m.LJ) {
                    int i3 = i2 + 1;
                    if (i3 > i) {
                        i3 = i;
                    }
                    c20582084m.LIZLLL = i3;
                    c20582084m.LJ = (j << (C13LZ.LJ(i3, 1, i) - 1)) + jCurrentTimeMillis;
                    return LIZIZ(c20582084m, jCurrentTimeMillis);
                }
                return new C1910107dz(0L, false, 0.0d);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C1910107dz LIZIZ(C20582084m c20582084m, long j) {
        double d;
        long j2 = c20582084m.LIZJ;
        long j3 = 1;
        if (j2 > 1) {
            long j4 = j - c20582084m.LIZIZ;
            if (j4 >= 1) {
                j3 = j4;
            }
            d = (j2 * 1000.0d) / j3;
        } else {
            d = 0.0d;
        }
        c20582084m.LIZJ = 0L;
        return new C1910107dz(j2, true, d);
    }
}
