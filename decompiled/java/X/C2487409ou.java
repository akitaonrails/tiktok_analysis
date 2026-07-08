package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: X.09ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2487409ou {
    public static SoftReference<Handler> LIZ;

    public static Handler LIZIZ() {
        Handler handler;
        SoftReference<Handler> softReference = LIZ;
        if (softReference != null && (handler = softReference.get()) != null) {
            return handler;
        }
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        LIZ = new SoftReference<>(bPEAHandler);
        return bPEAHandler;
    }

    public static void LIZ(Runnable runnable) {
        LIZIZ().removeCallbacks(runnable);
    }

    public static void LIZJ(Runnable runnable) {
        C786410Ut5.LJJZZIII(LIZIZ(), runnable);
    }

    public static void LIZLLL(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, LIZIZ(), runnable);
    }
}
