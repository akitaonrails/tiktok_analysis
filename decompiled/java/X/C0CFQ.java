package X;

import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0CFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFQ {
    public static final BPEAHandler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("AsyncInflateHandler");
        handlerThread.start();
        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }
}
