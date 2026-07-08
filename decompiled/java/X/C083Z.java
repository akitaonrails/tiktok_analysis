package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.083Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C083Z {
    public static volatile BPEAHandler LIZ;
    public static final C083Z LIZIZ = new C083Z();

    static {
        new BPEAHandler(Looper.getMainLooper());
    }

    public final Handler LIZ() {
        if (LIZ == null) {
            synchronized (this) {
                try {
                    if (LIZ == null) {
                        HandlerThread handlerThread = new HandlerThread("SExecutor");
                        handlerThread.start();
                        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
