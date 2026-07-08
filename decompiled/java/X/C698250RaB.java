package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698250RaB {
    public final Function2<Long, String, Boolean> LIZ;
    public final HandlerThread LIZIZ;
    public final BPEAHandler LIZJ;
    public volatile boolean LIZLLL;
    public volatile C698280RaE LJ;
    public volatile C698770Rb1 LJFF;

    public C698250RaB(C698270RaD c698270RaD) {
        this.LIZ = c698270RaD;
        HandlerThread handlerThread = new HandlerThread("FcpSlotStrategyCoordinator");
        handlerThread.start();
        this.LIZIZ = handlerThread;
        this.LIZJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
