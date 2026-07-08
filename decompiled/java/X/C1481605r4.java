package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.05r4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1481605r4 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZIZ(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(LIZ, runnable);
        }
    }

    public static final void LIZ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, LIZ, runnable);
    }
}
