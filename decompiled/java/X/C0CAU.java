package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0CAU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAU {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static boolean LIZ() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void LIZIZ(Runnable runnable) {
        if (LIZ()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(LIZ, runnable);
        }
    }
}
