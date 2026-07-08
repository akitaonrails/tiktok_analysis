package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: X.0eWO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091940eWO {
    public static SoftReference<Handler> LIZ;

    public static Handler LIZ() {
        Handler handler;
        SoftReference<Handler> softReference = LIZ;
        if (softReference != null && (handler = softReference.get()) != null) {
            return handler;
        }
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        LIZ = new SoftReference<>(bPEAHandler);
        return bPEAHandler;
    }

    public static void LIZIZ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, LIZ(), runnable);
    }
}
