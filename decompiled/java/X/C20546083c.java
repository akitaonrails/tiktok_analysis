package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.083c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20546083c {
    public static volatile BPEAHandler LIZIZ;
    public static final C20546083c LIZ = new C20546083c();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public final Handler LIZ() {
        if (((Boolean) C1474810oTv.o4.getValue()).booleanValue()) {
            if (LIZIZ == null) {
                HandlerThread handlerThread = new HandlerThread("SWorkThread");
                handlerThread.start();
                LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
            }
        } else if (LIZIZ == null) {
            synchronized (this) {
                try {
                    if (LIZIZ == null) {
                        HandlerThread handlerThread2 = new HandlerThread("SWorkThread");
                        handlerThread2.start();
                        LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread2));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
