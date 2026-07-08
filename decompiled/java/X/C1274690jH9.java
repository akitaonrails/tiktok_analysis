package X;

import Y.ARunnableS113S0100000_13;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274690jH9 {
    public static HandlerThread LIZ;
    public static HandlerThread LIZIZ;
    public static BPEAHandler LIZJ;
    public static Handler LIZLLL;
    public static boolean LJ;

    public static synchronized void LIZ() {
        BPEAHandler bPEAHandler = LIZJ;
        LIZJ = null;
        HandlerThread handlerThread = LIZ;
        LIZ = null;
        if (handlerThread != null && bPEAHandler != null) {
            ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13((Object) handlerThread, 276);
            if (LJ) {
                C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS113S0100000_13);
            } else {
                aRunnableS113S0100000_13.run();
            }
        }
        LIZLLL = null;
        HandlerThread handlerThread2 = LIZIZ;
        LIZIZ = null;
        if (handlerThread2 != null) {
            try {
                handlerThread2.quitSafely();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                handlerThread2.quit();
            }
            AVLog.logKibana(4, "InteractThreadUtils", "destroyThread", null);
        } else {
            AVLog.logKibana(4, "InteractThreadUtils", "destroyThread", null);
        }
    }

    public static synchronized Handler LIZIZ() {
        return LIZLLL;
    }

    public static synchronized Handler LIZJ() {
        return LIZJ;
    }

    public static synchronized void LJ(Runnable runnable) {
        Handler handler = LIZLLL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, runnable);
        }
    }

    public static synchronized void LJFF(Runnable runnable) {
        BPEAHandler bPEAHandler = LIZJ;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, runnable);
        }
    }

    public static synchronized void LJI(Runnable runnable) {
        Handler handler = LIZLLL;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static synchronized void LJII(Runnable runnable) {
        if (LIZ != null) {
            LIZJ.removeCallbacks(runnable);
        }
    }

    public static synchronized void LIZLLL(long j, Runnable runnable) {
        Handler handler = LIZLLL;
        if (handler != null) {
            C786410Ut5.LJLIIL(j, handler, runnable);
        }
    }
}
