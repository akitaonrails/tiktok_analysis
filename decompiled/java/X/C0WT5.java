package X;

import Y.AObjectS66S0000000_13;
import Y.ARunnableS0S3100000_13;
import Y.ARunnableS9S1100000_3;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.lifeguard.ILifeguard;
import java.io.PrintStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WT5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WT5 {
    public static final Gson LIZ = new Gson();
    public static volatile boolean LIZIZ = false;
    public static double LIZJ = 0.5d;
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ(Context context) {
        try {
            if (!LIZIZ) {
                h hVar = (h) SettingsManager.LIZLLL().LJIIIIZZ("lifeguard_config", h.class, null);
                LIZJ(context, hVar);
                if (hVar != null) {
                    LIZJ = ((Number) C0C6K.LIZ.getValue()).doubleValue();
                }
                LIZIZ = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0WT6] */
    public static void LIZIZ(final Context context, h hVar) {
        try {
            Class<?> cls = Class.forName("jv6.a");
            cls.getDeclaredMethod("install", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            System.err.println(th);
        }
        ((ILifeguard) PluggableExtentionKt.pluggableSpi(ILifeguard.class)).LIZIZ(context, hVar);
        ((ILifeguard) PluggableExtentionKt.pluggableSpi(ILifeguard.class)).LIZ(new C0WT7() { // from class: X.0WT6
        });
        C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "", new AObjectS66S0000000_13(4), true));
    }

    public static void LIZJ(Context context, h hVar) {
        if (hVar == null) {
            return;
        }
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lifeguard config:");
        sbLIZ.append(hVar);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        try {
            LIZIZ(context, hVar);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream2 = System.out;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("lifeguard init failed:");
            sbLIZ2.append(th);
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("lifeguard init failed:");
            sbLIZ3.append(th);
            C805380Via.LJFF("LaunchProtectException", "LifeguardProtect", new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
        }
    }

    public static void LIZLLL(String str, String str2) {
        try {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("event_name", str);
            c0lab.LJ("method", str2);
            C20684815ws.LJIILLIIL("lifeguard_protect_event", c0lab.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C805380Via.LJFF("LaunchProtectException", "LifeguardManager", new RuntimeException("report event to tea failed" + th));
        }
    }

    public static void LJ(Context context, String str) {
        try {
            if (((Boolean) C282450B5f.LIZ.getValue()).booleanValue()) {
                ARunnableS9S1100000_3 aRunnableS9S1100000_3 = new ARunnableS9S1100000_3(context, str, 9);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aRunnableS9S1100000_3.run();
                } else {
                    C786410Ut5.LJJZZIII(LIZLLL, aRunnableS9S1100000_3);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            System.out.println("lifeguard show toast failed:" + th);
        }
    }

    public static void LJFF(String str, String str2, String str3) {
        if (ThreadLocalRandom.current().nextDouble() < LIZJ) {
            if (!Npth.isInit()) {
                ScheduledExecutorService scheduledExecutorServiceLJ = C807400Vlq.LJ();
                scheduledExecutorServiceLJ.schedule(new ARunnableS0S3100000_13(scheduledExecutorServiceLJ, str, str2, str3, 0), 8000L, TimeUnit.MILLISECONDS);
            } else {
                LIZLLL(str, str2);
                C805380Via.LJFF("LaunchProtectException", "LifeguardProtect", new RuntimeException(str3));
            }
        }
    }
}
