package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08x9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2283708x9 {
    public static final BPEAHandler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("ssp_thread");
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
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ssp thread exception: ");
            sbLIZ.append(th.getMessage());
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "SspLifeCycle_");
        }
    }
}
