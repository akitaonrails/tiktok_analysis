package X;

import android.os.Looper;
import com.bytedance.applog.AppLog;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0URt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772430URt {
    public static volatile boolean LIZ;
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC772420URs LIZJ = RunnableC772420URs.LL;

    public static void LIZ() {
        if (LIZ) {
            LIZ = false;
            LIZIZ.removeCallbacks(LIZJ);
            BlockHelper.endBlock();
            try {
                AppLog.flushAsync();
                C20441214yg.LIZIZ("BroadcastResOpt", "applog unblocked, flushAsync triggered");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("flushAsync invoke error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
