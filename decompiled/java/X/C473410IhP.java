package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473410IhP {
    public static BPEAHandler LIZ;

    public static Handler LIZ() {
        if (LIZ == null) {
            synchronized (C473410IhP.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new BPEAHandler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static void LJI() {
        LIZ().removeCallbacksAndMessages(null);
        ((Handler) C0C28.LIZ.getValue()).removeCallbacksAndMessages(null);
    }

    public static void LIZIZ(Runnable runnable) {
        C786410Ut5.LJJZZIII(LIZ(), runnable);
    }

    public static void LJ(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        LIZ().removeCallbacks(runnable);
    }

    public static void LIZJ(Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        C786410Ut5.LJLIIL(Math.max(j, 0L), LIZ(), runnable);
    }

    public static void LIZLLL(long j, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        LIZ().removeCallbacks(runnable);
        C786410Ut5.LJLIIL(Math.max(j, 0L), LIZ(), runnable);
    }

    public static void LJFF(Runnable runnable, boolean z) {
        if (runnable != null && z) {
            LIZ().removeCallbacks(runnable);
        }
    }
}
