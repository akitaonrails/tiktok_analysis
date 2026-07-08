package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.085r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20613085r {
    public static final BPEAHandler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("hybrid_info_thread");
        handlerThread.start();
        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }

    public static void LIZ(Runnable runnable) {
        try {
            BPEAHandler bPEAHandler = LIZ;
            if (Intrinsics.LJFF(bPEAHandler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                C786410Ut5.LJJZZIII(bPEAHandler, runnable);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hybrid_info_thread exception: ");
            sbLIZ.append(th.getMessage());
            C2283308x5.LIZ(6, C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }
}
