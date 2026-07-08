package X;

import Y.ARunnableS134S0100000_34;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.1Bwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221321Bwo {
    public final HandlerThread LIZ;
    public final BPEAHandler LIZIZ;

    public C2221321Bwo() {
        HandlerThread handlerThread = new HandlerThread("PublishCommandExecutor");
        this.LIZ = handlerThread;
        handlerThread.start();
        this.LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }

    public final void LIZ(InterfaceC2221401Bww interfaceC2221401Bww) throws InterruptedException {
        if (this.LIZ.isAlive()) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS134S0100000_34(interfaceC2221401Bww, 38));
            return;
        }
        throw new InterruptedException("PublishCommandExecutor has quit");
    }
}
