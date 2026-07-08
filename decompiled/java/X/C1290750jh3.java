package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290750jh3 {
    public static BPEAHandler LIZ;

    public static boolean LIZ() {
        return Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }

    public static void LIZIZ(Runnable runnable) {
        synchronized (C1290750jh3.class) {
            try {
                if (LIZ == null) {
                    LIZ = new BPEAHandler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZ.removeCallbacks(runnable);
    }

    public static void LIZLLL(Runnable runnable) {
        synchronized (C1290750jh3.class) {
            try {
                if (LIZ == null) {
                    LIZ = new BPEAHandler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJJZZIII(LIZ, runnable);
    }

    public static void LJ(Runnable runnable) {
        if (LIZ()) {
            runnable.run();
        } else {
            LIZLLL(runnable);
        }
    }

    public static void LIZJ(long j, Runnable runnable) {
        synchronized (C1290750jh3.class) {
            try {
                if (LIZ == null) {
                    LIZ = new BPEAHandler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJLIIL(j, LIZ, runnable);
    }
}
