package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2485509ob {
    public static SoftReference<Handler> LIZ;

    public static boolean LIZ() {
        return Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()) && Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }

    public static void LIZIZ(Runnable runnable) {
        Handler bPEAHandler;
        SoftReference<Handler> softReference = LIZ;
        if (softReference == null || (bPEAHandler = softReference.get()) == null) {
            bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            LIZ = new SoftReference<>(bPEAHandler);
        }
        C786410Ut5.LJJZZIII(bPEAHandler, runnable);
    }
}
