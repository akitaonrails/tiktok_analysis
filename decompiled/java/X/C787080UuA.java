package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0UuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787080UuA {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static boolean LIZ() {
        return Looper.getMainLooper() == Looper.myLooper() && Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }

    public static void LIZIZ(Runnable runnable) {
        C786410Ut5.LJJZZIII(LIZ, runnable);
    }
}
