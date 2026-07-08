package X;

import Y.ARunnableS72S0200000_3;
import Y.ARunnableS9S1100000_3;
import android.app.Activity;
import android.os.Debug;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09Pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2367309Pj {
    public static boolean LIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static Set<String> LJFF;
    public static HandlerThread LJIIIIZZ;
    public static BPEAHandler LJIIIZ;
    public static long LIZIZ = 10000;
    public static final Set<String> LJI = C13LQ.LJLIIL(new String[]{"MainActivity_com.ss.android.ugc.aweme.main.MainRootFragment", "MainActivity_MainRootFragment"});
    public static final ConcurrentHashMap<String, C2367409Pk> LJII = new ConcurrentHashMap<>();

    public static String LIZ(Object obj) {
        String simpleName;
        String name;
        Activity activityLIZ;
        if (obj instanceof C1397950mTx) {
            Activity activity = ((C1397950mTx) obj).LIZLLL;
            boolean z = LIZ;
            Class<?> cls = activity.getClass();
            if (z) {
                return cls.getSimpleName();
            }
            return cls.getName();
        }
        if (obj instanceof C1844400y62) {
            C1844400y62 c1844400y62 = (C1844400y62) obj;
            F f = c1844400y62.LIZLLL;
            Activity activityLIZIZ = c1844400y62.LIZIZ();
            if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                simpleName = activityLIZ.getClass().getSimpleName();
            } else {
                simpleName = "";
            }
            boolean z2 = LIZ;
            Class<?> cls2 = f.getClass();
            if (z2) {
                name = cls2.getSimpleName();
            } else {
                name = cls2.getName();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(simpleName);
            sbLIZ.append('_');
            sbLIZ.append(name);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return obj.toString();
    }

    public static void LIZIZ(String str) {
        if (LJI.contains(str)) {
            return;
        }
        Set<String> set = LJFF;
        if (set != null && !set.contains(str)) {
            return;
        }
        C2367409Pk c2367409Pk = new C2367409Pk(str);
        BPEAHandler bPEAHandler = null;
        if (((Boolean) C2367509Pl.LIZ.getValue()).booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c2367409Pk.LIZIZ = SystemClock.uptimeMillis();
            c2367409Pk.LIZLLL = C2367709Pn.LIZLLL();
            Map<String, String> runtimeStats = Debug.getRuntimeStats();
            c2367409Pk.LJ = C1937207iM.LIZ("art.gc.bytes-allocated", runtimeStats);
            c2367409Pk.LIZJ = c2367409Pk.LIZLLL;
            c2367409Pk.LJFF = C1937207iM.LIZ("art.gc.blocking-gc-count", runtimeStats);
            c2367409Pk.LJI = C1937207iM.LIZ("art.gc.blocking-gc-time", runtimeStats);
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            c2367409Pk.LJII = nativeHeapAllocatedSize;
            c2367409Pk.LJIIIIZZ = nativeHeapAllocatedSize;
            long[] jArrLJI = C2367709Pn.LJI();
            c2367409Pk.LJIIL = jArrLJI[0];
            c2367409Pk.LJIILIIL = jArrLJI[1];
            long[] jArrLJFF = C2367709Pn.LJFF();
            c2367409Pk.LJIILJJIL = jArrLJFF[0];
            c2367409Pk.LJIILL = jArrLJFF[1];
            if (!LIZLLL && !LIZJ && !LJ) {
                LJII.put(str, c2367409Pk);
            } else {
                BPEAHandler bPEAHandler2 = LJIIIZ;
                if (bPEAHandler2 == null) {
                    bPEAHandler2 = null;
                }
                C786410Ut5.LJJZZIII(bPEAHandler2, new ARunnableS9S1100000_3(c2367409Pk, str, 14));
            }
            C823050WQl.LIZLLL().execute(new RunnableC2087308Fr(true, System.currentTimeMillis() - jCurrentTimeMillis));
        } else {
            c2367409Pk.LIZIZ = SystemClock.uptimeMillis();
            c2367409Pk.LIZLLL = C2367709Pn.LIZLLL();
            Map<String, String> runtimeStats2 = Debug.getRuntimeStats();
            c2367409Pk.LJ = C1937207iM.LIZ("art.gc.bytes-allocated", runtimeStats2);
            c2367409Pk.LIZJ = c2367409Pk.LIZLLL;
            c2367409Pk.LJFF = C1937207iM.LIZ("art.gc.blocking-gc-count", runtimeStats2);
            c2367409Pk.LJI = C1937207iM.LIZ("art.gc.blocking-gc-time", runtimeStats2);
            long nativeHeapAllocatedSize2 = Debug.getNativeHeapAllocatedSize();
            c2367409Pk.LJII = nativeHeapAllocatedSize2;
            c2367409Pk.LJIIIIZZ = nativeHeapAllocatedSize2;
            long[] jArrLJI2 = C2367709Pn.LJI();
            c2367409Pk.LJIIL = jArrLJI2[0];
            c2367409Pk.LJIILIIL = jArrLJI2[1];
            long[] jArrLJFF2 = C2367709Pn.LJFF();
            c2367409Pk.LJIILJJIL = jArrLJFF2[0];
            c2367409Pk.LJIILL = jArrLJFF2[1];
            if (!LIZLLL && !LIZJ && !LJ) {
                LJII.put(str, c2367409Pk);
            } else {
                BPEAHandler bPEAHandler3 = LJIIIZ;
                if (bPEAHandler3 == null) {
                    bPEAHandler3 = null;
                }
                C786410Ut5.LJJZZIII(bPEAHandler3, new ARunnableS9S1100000_3(c2367409Pk, str, 14));
            }
        }
        ARunnableS9S1100000_3 aRunnableS9S1100000_3 = new ARunnableS9S1100000_3(c2367409Pk, str, 15);
        c2367409Pk.LJIJ = aRunnableS9S1100000_3;
        BPEAHandler bPEAHandler4 = LJIIIZ;
        if (bPEAHandler4 != null) {
            bPEAHandler = bPEAHandler4;
        }
        C786410Ut5.LJLIIL(LIZIZ, bPEAHandler, aRunnableS9S1100000_3);
    }

    public static void LIZJ(String str) {
        C2367409Pk c2367409PkRemove = LJII.remove(str);
        if (c2367409PkRemove == null) {
            return;
        }
        if (((Boolean) C2367509Pl.LIZ.getValue()).booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Runnable runnable = c2367409PkRemove.LJIJ;
            if (runnable != null) {
                BPEAHandler bPEAHandler = LJIIIZ;
                if (bPEAHandler == null) {
                    bPEAHandler = null;
                }
                bPEAHandler.removeCallbacks(runnable);
            }
            c2367409PkRemove.LJIJ = null;
            long jUptimeMillis = SystemClock.uptimeMillis() - c2367409PkRemove.LIZIZ;
            if (jUptimeMillis < LIZIZ) {
                return;
            }
            long j = jUptimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            long[] jArrLJI = C2367709Pn.LJI();
            long[] jArrLJFF = C2367709Pn.LJFF();
            long jLIZLLL = C2367709Pn.LIZLLL();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            Map<String, String> runtimeStats = Debug.getRuntimeStats();
            C2367609Pm c2367609Pm = new C2367609Pm(c2367409PkRemove.LIZ, j, (C1937207iM.LIZ("art.gc.bytes-allocated", runtimeStats) - c2367409PkRemove.LJ) / j, C08M9.LIZ(jLIZLLL - c2367409PkRemove.LIZLLL, true), C08M9.LIZ(Math.max(c2367409PkRemove.LIZJ, jLIZLLL), true), (C1937207iM.LIZ("art.gc.blocking-gc-count", runtimeStats) - c2367409PkRemove.LJFF) / j, (C1937207iM.LIZ("art.gc.blocking-gc-time", runtimeStats) - c2367409PkRemove.LJI) / j, C08M9.LIZ(nativeHeapAllocatedSize - c2367409PkRemove.LJII, true), C08M9.LIZ(Math.max(c2367409PkRemove.LJIIIIZZ, nativeHeapAllocatedSize), true), (jArrLJI[0] - c2367409PkRemove.LJIIL) / j, (jArrLJI[1] - c2367409PkRemove.LJIILIIL) / j, (jArrLJFF[0] - c2367409PkRemove.LJIILJJIL) / j, (jArrLJFF[1] - c2367409PkRemove.LJIILL) / j);
            BPEAHandler bPEAHandler2 = LJIIIZ;
            if (bPEAHandler2 == null) {
                bPEAHandler2 = null;
            }
            C786410Ut5.LJJZZIII(bPEAHandler2, new ARunnableS72S0200000_3(c2367609Pm, c2367409PkRemove, 37));
            C823050WQl.LIZLLL().execute(new RunnableC2087308Fr(false, System.currentTimeMillis() - jCurrentTimeMillis));
            return;
        }
        Runnable runnable2 = c2367409PkRemove.LJIJ;
        if (runnable2 != null) {
            BPEAHandler bPEAHandler3 = LJIIIZ;
            if (bPEAHandler3 == null) {
                bPEAHandler3 = null;
            }
            bPEAHandler3.removeCallbacks(runnable2);
        }
        c2367409PkRemove.LJIJ = null;
        long jUptimeMillis2 = SystemClock.uptimeMillis() - c2367409PkRemove.LIZIZ;
        if (jUptimeMillis2 < LIZIZ) {
            return;
        }
        long j2 = jUptimeMillis2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long[] jArrLJI2 = C2367709Pn.LJI();
        long[] jArrLJFF2 = C2367709Pn.LJFF();
        long jLIZLLL2 = C2367709Pn.LIZLLL();
        long nativeHeapAllocatedSize2 = Debug.getNativeHeapAllocatedSize();
        Map<String, String> runtimeStats2 = Debug.getRuntimeStats();
        C2367609Pm c2367609Pm2 = new C2367609Pm(c2367409PkRemove.LIZ, j2, (C1937207iM.LIZ("art.gc.bytes-allocated", runtimeStats2) - c2367409PkRemove.LJ) / j2, C08M9.LIZ(jLIZLLL2 - c2367409PkRemove.LIZLLL, true), C08M9.LIZ(Math.max(c2367409PkRemove.LIZJ, jLIZLLL2), true), (C1937207iM.LIZ("art.gc.blocking-gc-count", runtimeStats2) - c2367409PkRemove.LJFF) / j2, (C1937207iM.LIZ("art.gc.blocking-gc-time", runtimeStats2) - c2367409PkRemove.LJI) / j2, C08M9.LIZ(nativeHeapAllocatedSize2 - c2367409PkRemove.LJII, true), C08M9.LIZ(Math.max(c2367409PkRemove.LJIIIIZZ, nativeHeapAllocatedSize2), true), (jArrLJI2[0] - c2367409PkRemove.LJIIL) / j2, (jArrLJI2[1] - c2367409PkRemove.LJIILIIL) / j2, (jArrLJFF2[0] - c2367409PkRemove.LJIILJJIL) / j2, (jArrLJFF2[1] - c2367409PkRemove.LJIILL) / j2);
        BPEAHandler bPEAHandler4 = LJIIIZ;
        if (bPEAHandler4 == null) {
            bPEAHandler4 = null;
        }
        C786410Ut5.LJJZZIII(bPEAHandler4, new ARunnableS72S0200000_3(c2367609Pm2, c2367409PkRemove, 37));
    }
}
