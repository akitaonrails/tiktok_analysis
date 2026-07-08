package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.08L0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08L0 {
    public final Thread LIZ = Looper.getMainLooper().getThread();
    public final BPEAHandler LIZIZ;
    public volatile String LIZJ;

    public C08L0() {
        HandlerThread handlerThread = new HandlerThread("loop-monitor-sampler");
        handlerThread.start();
        this.LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
