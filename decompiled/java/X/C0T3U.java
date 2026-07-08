package X;

import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0T3U, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3U {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS112S0100000_12(th, 474));
            throw th;
        }
    }
}
