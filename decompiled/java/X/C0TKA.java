package X;

import Y.ARunnableS104S0100000_4;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0TKA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKA {
    public static C0TKF LIZ;
    public static volatile C0TK8 LIZIZ;
    public static volatile Future LIZLLL;
    public static final Map<String, Object> LIZJ = new ConcurrentHashMap();
    public static volatile boolean LJ = false;
    public static volatile boolean LJFF = false;
    public static volatile boolean LJI = false;
    public static final Object LJII = new Object();
    public static final Map<String, String> LJIIIIZZ = new ConcurrentHashMap();
    public static final Set<String> LJIIIZ = new ConcurrentSkipListSet();
    public static final Map<String, String> LJIIJ = new ConcurrentHashMap();

    public static void LIZ() {
        boolean z = LJ;
        boolean z2 = LJFF;
        if (LIZLLL == null) {
            throw new RuntimeException("ExperimentManager has not been init");
        }
        try {
            LIZLLL.get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static void LJ() {
        LIZ();
        C0TK8 c0tk8 = LIZIZ;
        synchronized (c0tk8) {
            Future future = c0tk8.LJIIIIZZ;
            if (future != null) {
                future.cancel(true);
            }
            c0tk8.LJIIIIZZ = C0TKI.LIZ.scheduleWithFixedDelay(new ARunnableS104S0100000_4(c0tk8, 155), 0L, 3600000L, TimeUnit.MILLISECONDS);
        }
    }

    public static void LJFF(String str, Object obj, boolean z, String str2) {
        if (z && obj != null) {
            ((ConcurrentHashMap) LIZJ).put(str, obj);
        }
        ((ConcurrentHashMap) LJIIJ).put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZJ(final java.lang.String r15, java.lang.reflect.Type r16, java.lang.Object r17, boolean r18, boolean r19, X.C0TKB r20) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TKA.LIZJ(java.lang.String, java.lang.reflect.Type, java.lang.Object, boolean, boolean, X.0TKB):java.lang.Object");
    }

    public static void LIZLLL(final Application application, final C0T92 c0t92, final C0COZ c0coz, final InterfaceC1112904Wx interfaceC1112904Wx, final C0TKF c0tkf, final String str) {
        C0TK9.LJI.getClass();
        C0TK9.LIZIZ = application;
        if (!LJ) {
            Object obj = LJII;
            synchronized (obj) {
                try {
                    if (!LJ) {
                        LIZLLL = C0TKI.LIZ(new Runnable() { // from class: X.0CNu
                            public final /* synthetic */ boolean LLILLL = false;

                            public final void LIZ() {
                                C0TKA.LIZIZ = new C0TK8(application, str, this.LLILLL, interfaceC1112904Wx, c0t92, c0coz, C0TKA.LJIIIIZZ, C0TKA.LJIIIZ);
                                C0TKA.LIZ = c0tkf;
                                C0TKF c0tkf2 = C0TKA.LIZ;
                                C0TKA.LJI = true;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ExperimentManager@e711.init$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ExperimentManager@e711.init$1");
                            }
                        });
                        LJ = true;
                        LJFF = true;
                    }
                    obj.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        if (c0tkf != null) {
            LIZ = c0tkf;
        }
    }
}
