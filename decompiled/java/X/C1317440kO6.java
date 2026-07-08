package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0kO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317440kO6 {
    public static final C1317440kO6 LIZLLL = new C1317440kO6();
    public final BPEAHandler LIZ;
    public final BPEAHandler LIZIZ;
    public final HandlerThread LIZJ;

    public C1317440kO6() {
        HandlerThread handlerThread = new HandlerThread("sdui_handler");
        this.LIZJ = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("sdui_network");
        handlerThread.start();
        handlerThread2.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread2));
        Process.setThreadPriority(handlerThread2.getThreadId(), 10);
    }

    public final void LIZ(Runnable runnable) {
        if (Looper.myLooper() == this.LIZ.getLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(this.LIZ, runnable);
        }
    }
}
