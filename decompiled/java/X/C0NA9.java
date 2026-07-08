package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0NA9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NA9 {
    public final BPEAHandler LIZ;

    public C0NA9() {
        HandlerThread handlerThread = new HandlerThread("com.bytedance.pythia.scheduler");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
