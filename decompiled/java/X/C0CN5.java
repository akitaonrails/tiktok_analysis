package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS10S1100000_4;
import Y.ARunnableS73S0200000_4;
import Y.ARunnableS7S0210000_4;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0CN5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CN5 {
    public static final ConcurrentHashMap<String, Runnable> LIZ = new ConcurrentHashMap<>();
    public static volatile boolean LIZIZ = false;
    public static volatile boolean LIZJ = false;
    public static final IDowngradeApi LIZLLL = (IDowngradeApi) PluggableExtentionKt.pluggableSpi(IDowngradeApi.class);
    public static final IStartupConfigApi LJ = (IStartupConfigApi) PluggableExtentionKt.pluggableSpi(IStartupConfigApi.class);
    public static boolean LJFF = false;
    public static boolean LJI = false;

    public static boolean LJI() {
        try {
            AbstractC2201091BCp abstractC2201091BCpLJ = C1BCA.LJ(EnumC312610CNf.SATRTUP);
            if (abstractC2201091BCpLJ == null) {
                return false;
            }
            Object objLJIIIZ = abstractC2201091BCpLJ.LJIIIZ();
            if (objLJIIIZ instanceof C1602200rnO) {
                return ((C1602200rnO) objLJIIIZ).LIZIZ();
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LJII() {
        try {
            AbstractC2201091BCp abstractC2201091BCpLJ = C1BCA.LJ(EnumC312610CNf.SATRTUP);
            if (abstractC2201091BCpLJ == null) {
                return false;
            }
            Object objLJIIIZ = abstractC2201091BCpLJ.LJIIIZ();
            if (objLJIIIZ instanceof C1602200rnO) {
                return ((C1602200rnO) objLJIIIZ).LIZJ();
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static IDowngradeApi LJFF() {
        if (!LJFF) {
            IStartupConfigApi iStartupConfigApi = LJ;
            LJI = iStartupConfigApi != null && iStartupConfigApi.LIZ();
            LJFF = true;
        }
        return LJI ? LIZLLL : (IDowngradeApi) PluggableExtentionKt.pluggableSpi(IDowngradeApi.class);
    }

    public static void LJIIIIZZ(Runnable runnable) {
        C823050WQl.LIZIZ().execute(new ARunnableS104S0100000_4(runnable, 71));
    }

    public static void LJIIIZ(String str) {
        Runnable runnableRemove;
        if (!C275760ArO.LIZ() || (runnableRemove = LIZ.remove(str)) == null) {
            return;
        }
        runnableRemove.run();
    }

    public static void LIZIZ(Long l, Runnable runnable) {
        if (C0CN6.LIZIZ.LIZIZ() && LIZLLL != null) {
            LJFF().LIZ(l.longValue(), new RunnableC2080408Da(runnable), runnable.getClass().getName());
            return;
        }
        LIZJ(l, runnable, true);
    }

    public static void LIZJ(Long l, Runnable runnable, boolean z) {
        if (C0CN6.LIZIZ.LIZIZ() && LIZLLL != null) {
            if (z) {
                LJFF().LJ(l.longValue(), runnable.getClass().getName(), 2, new RunnableC2080408Da(runnable));
                return;
            } else {
                LJFF().LJ(l.longValue(), runnable.getClass().getName(), 1, runnable);
                return;
            }
        }
        LJ(l, z, null, runnable);
    }

    public static void LIZLLL(Long l, String str, Runnable runnable) {
        if (C275760ArO.LIZ()) {
            LJ(l, true, str, runnable);
        } else {
            LIZIZ(l, runnable);
        }
    }

    public static void LIZ(final boolean z, final boolean z2, long j, final Runnable runnable) {
        if (C0CN6.LIZIZ.LIZIZ() && LIZLLL != null) {
            if (z) {
                LJFF().LIZJ(j, new RunnableC2080408Da(runnable), runnable.getClass().getName());
            }
            if (z2) {
                LJFF().LIZ(j, new RunnableC2080408Da(runnable), runnable.getClass().getName());
                return;
            }
            return;
        }
        if (LJII()) {
            runnable.run();
            return;
        }
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        InterfaceC1006670cIr<C1602200rnO> interfaceC1006670cIr = new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CN4
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                C1602200rnO c1602200rnO3 = c1602200rnO2;
                if (z) {
                    if (c1602200rnO3.LIZIZ()) {
                        bPEAHandler.removeCallbacksAndMessages(null);
                        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                        C0CN5.LJIIIIZZ(runnable);
                        return;
                    }
                    return;
                }
                if (!z2 || !c1602200rnO3.LIZJ()) {
                    return;
                }
                bPEAHandler.removeCallbacksAndMessages(null);
                C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                C0CN5.LJIIIIZZ(runnable);
            }
        };
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, interfaceC1006670cIr);
        C786410Ut5.LJLIIL(j, bPEAHandler, new ARunnableS73S0200000_4(interfaceC1006670cIr, runnable, 30));
    }

    public static void LJ(Long l, final boolean z, final String str, final Runnable runnable) {
        if (LJII()) {
            runnable.run();
            return;
        }
        if (str != null) {
            if (C275760ArO.LIZ()) {
                LIZ.put(str, runnable);
            }
            if (C275760ArO.LIZ()) {
                runnable = new ARunnableS10S1100000_4(runnable, str, 4);
            }
        }
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        InterfaceC1006670cIr<C1602200rnO> interfaceC1006670cIr = new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CN3
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                if (c1602200rnO2.LIZJ()) {
                    bPEAHandler.removeCallbacksAndMessages(null);
                    C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                    if (str != null && C275760ArO.LIZ()) {
                        C0CN5.LIZ.remove(str);
                    }
                    if (z) {
                        C0CN5.LJIIIIZZ(runnable);
                    } else {
                        runnable.run();
                    }
                }
            }
        };
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, interfaceC1006670cIr);
        C786410Ut5.LJLIIL(l.longValue(), bPEAHandler, new ARunnableS7S0210000_4(interfaceC1006670cIr, runnable, z, 1));
    }
}
