package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289620jfE {
    public static volatile BPEAHandler LIZ;

    public static Handler LIZ() {
        if (LIZ == null) {
            synchronized (C1289620jfE.class) {
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

    public static boolean LIZIZ() {
        return Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }

    public static void LIZJ(Runnable runnable) {
        C786410Ut5.LJJZZIII(LIZ(), runnable);
    }

    public static void LIZLLL(Runnable runnable) {
        if (LIZIZ()) {
            runnable.run();
        } else {
            LIZJ(runnable);
        }
    }
}
