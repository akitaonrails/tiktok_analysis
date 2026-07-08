package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IK5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IK5 {
    public static BPEAHandler LIZ;

    public static Handler LIZ() {
        if (LIZ == null) {
            synchronized (C0IK5.class) {
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

    public static void LIZJ(Runnable runnable) {
        C786410Ut5.LJJZZIII(LIZ(), runnable);
    }

    public static void LIZLLL(Object obj) {
        LIZ().removeCallbacksAndMessages(obj);
    }

    public static void LIZIZ(Object obj, Runnable runnable) {
        C786410Ut5.LJLIIIL(LIZ(), runnable, obj, 2L);
    }
}
