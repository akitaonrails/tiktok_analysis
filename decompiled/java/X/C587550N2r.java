package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587550N2r {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZIZ(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(LIZ, runnable);
        }
    }

    public static final void LIZ(long j, Runnable runnable) {
        if (j <= 0) {
            LIZIZ(runnable);
        } else {
            C786410Ut5.LJLIIL(j, LIZ, runnable);
        }
    }
}
