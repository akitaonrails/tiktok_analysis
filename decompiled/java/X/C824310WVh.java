package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824310WVh {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2119308Rz());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C824280WVe());

    public static final void LIZ(Runnable runnable) {
        ((ExecutorService) LIZJ.getValue()).execute(new C0W89(runnable));
    }

    public static final void LIZIZ(Runnable runnable) {
        C1520380pfQ.LIZ.getClass();
        if (C1520380pfQ.LJIIJJI) {
            LIZ(runnable);
        } else {
            LIZJ(runnable);
        }
    }

    public static final void LIZJ(Runnable runnable) {
        C0W89 c0w89 = new C0W89(runnable);
        Looper looperMyLooper = Looper.myLooper();
        C01GW c01gw = LIZIZ;
        if (Intrinsics.LJFF(looperMyLooper, ((Handler) c01gw.getValue()).getLooper())) {
            c0w89.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) c01gw.getValue(), c0w89);
        }
    }

    public static final C0W89 LIZLLL(Runnable runnable) {
        C0W89 c0w89 = new C0W89(runnable);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c0w89.run();
            return c0w89;
        }
        C786410Ut5.LJJZZIII(LIZ, c0w89);
        return c0w89;
    }
}
