package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0M66, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M66 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Looper LIZIZ = Looper.getMainLooper();

    public static void LIZ(Runnable runnable) {
        if (Looper.myLooper() == LIZIZ) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(LIZ, runnable);
        }
    }
}
