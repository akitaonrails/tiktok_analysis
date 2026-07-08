package X;

import Y.ARunnableS104S0000000_31;
import Y.ARunnableS10S0000100_3;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.16Cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20737116Cr {
    public static long LIZIZ;
    public static long LIZJ;
    public static Pair<Long, String[]> LJ;
    public static Long LJFF;
    public static long LJI;
    public static final long LIZ = TimeUnit.SECONDS.toMillis(30);
    public static final long LIZLLL = 33554432;
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1325));

    public static float LIZ() {
        return ((Number) LJII.getValue()).floatValue();
    }

    public static boolean LIZIZ() {
        Object c098200Yq;
        long j = LIZLLL;
        if (j <= 0) {
            return false;
        }
        if (System.currentTimeMillis() >= LIZIZ + LIZ) {
            try {
                c098200Yq = Long.valueOf(Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = 0L;
            }
            long jLongValue = ((Number) c098200Yq).longValue();
            if (jLongValue > 0) {
                LIZIZ = System.currentTimeMillis();
                LIZJ = jLongValue;
            }
        }
        long j2 = LIZJ;
        return 1 <= j2 && j2 <= j;
    }

    public static boolean LIZJ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = LJI;
        if (j > 0) {
            return jElapsedRealtime - j <= 8000;
        }
        LJI = jElapsedRealtime;
        return true;
    }

    public static boolean LIZLLL() {
        float fLIZ = LIZ();
        if (fLIZ < 0.0f) {
            return true;
        }
        int i = C0SOK.LIZ().lowEndScore;
        if (i <= 0) {
            i = 7;
        }
        return fLIZ < ((float) i);
    }

    public static void LJFF() {
        if (LIZJ() || (C07TP.LIZ().value & 1) != 1) {
            return;
        }
        Long l = LJFF;
        if (l == null || SystemClock.uptimeMillis() - l.longValue() > 2000) {
            LJFF = Long.valueOf(SystemClock.uptimeMillis());
            try {
                C1702420uP2.LIZIZ(2000L, 2, 8);
                int i = AnonymousClass0810.LIZ.LIZJ;
                if (i == 1 || i == 2 || i == 3) {
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS10S0000100_3(2000L, 1));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LIZIZ();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJ(String[] strArr, long j, int i) {
        long j2;
        long j3 = 2000;
        if ((i & 2) != 0) {
            j2 = 2000;
        } else {
            j2 = 0;
        }
        if ((i & 4) == 0) {
            j3 = j;
        }
        if (!LIZJ()) {
            Pair<Long, String[]> pair = LJ;
            if (pair != null && SystemClock.uptimeMillis() - pair.getFirst().longValue() <= j3 && Arrays.equals(strArr, pair.getSecond())) {
                return;
            }
            LJ = new Pair<>(Long.valueOf(SystemClock.uptimeMillis()), strArr);
            try {
                for (String str : strArr) {
                    switch (str.hashCode()) {
                        case -1641276893:
                            if (str.equals("start_boot_finish") && (C07TP.LIZ().value & 32) == 32) {
                                C2187451AjH.LJ(j2);
                            }
                            break;
                        case -1574044000:
                            if (str.equals("start_jit_compile_opt") && (C07TP.LIZ().value & 8) == 8) {
                                C2187451AjH.LJJIJIIJIL(j2);
                            }
                            break;
                        case -1534296074:
                            if (str.equals("start_do_frame") && (C07TP.LIZ().value & 128) == 128) {
                                C0N5P.LIZ.LIZLLL("PostMode", new C0N5R(16L, 30L));
                            }
                            break;
                        case -1151354330:
                            if (str.equals("fresco_resume") && (C07TP.LIZ().value & 64) == 64 && C1322200kVm.LIZ().LJIILL()) {
                                C1322200kVm.LIZ().LJIJJ();
                            }
                            break;
                        case -987889088:
                            if (str.equals("stop_jit_compile_opt") && (C07TP.LIZ().value & 8) == 8) {
                                int i2 = C2187451AjH.LIZ;
                                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS104S0000000_31(1));
                            }
                            break;
                        case -873534013:
                            if (str.equals("stop_boot_finish") && (C07TP.LIZ().value & 32) == 32) {
                                int i3 = C2187451AjH.LIZ;
                                C799900VZk.LIZ.getClass();
                                C799900VZk.LIZIZ();
                            }
                            break;
                        case -609840717:
                            if (str.equals("main_thread_priority") && (C07TP.LIZ().value & 2) == 2) {
                                JatoXL.setPriority(Process.myTid(), -20);
                                JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
                            }
                            break;
                        case -249805149:
                            if (str.equals("reset_main_thread_priority") && (C07TP.LIZ().value & 2) == 2) {
                                JatoXL.resetPriority(Process.myTid());
                                JatoXL.resetRenderThread();
                            }
                            break;
                        case -181369264:
                            if (str.equals("reset_bind_big_core") && (C07TP.LIZ().value & 4) == 4) {
                                CpusetManager.resetCoreBind();
                            }
                            break;
                        case 237866304:
                            if (str.equals("bind_big_core") && (C07TP.LIZ().value & 4) == 4) {
                                CpusetManager.bindBigCore();
                            }
                            break;
                        case 515084509:
                            if (str.equals("fresco_pause") && (C07TP.LIZ().value & 64) == 64 && !C1322200kVm.LIZ().LJIILL()) {
                                C1322200kVm.LIZ().LJIILLIIL();
                            }
                            break;
                        case 696939573:
                            if (str.equals("start_log_block") && (C07TP.LIZ().value & 16) == 16) {
                                C2187451AjH.LJII(j2, true);
                            }
                            break;
                        case 858632149:
                            if (str.equals("stop_log_block") && (C07TP.LIZ().value & 16) == 16) {
                                C2187451AjH.LJJIIZ();
                            }
                            break;
                        case 1103319126:
                            if (str.equals("stop_do_frame") && (C07TP.LIZ().value & 128) == 128) {
                                C0N5P c0n5p = C0N5P.LIZ;
                                C0N5P.LJ("PostMode");
                            }
                            break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LIZIZ();
            }
        }
    }
}
