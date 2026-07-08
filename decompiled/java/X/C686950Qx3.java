package X;

import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0Qx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686950Qx3 {
    public static final BPEAHandler LIZ;
    public static final C686970Qx5 LIZIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("AsyncInflateHandler");
        LIZIZ = new C686970Qx5();
        handlerThread.start();
        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }
}
