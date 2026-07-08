package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0C2H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2H {
    public final BPEAHandler LIZ;

    public C0C2H() {
        HandlerThread handlerThread = new HandlerThread("MonitorThreadHelper");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
