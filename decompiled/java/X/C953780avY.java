package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0avY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953780avY {
    public static final C1701780uO0 LIZIZ = C1701940uOG.LIZ(C786410Ut5.W2(C953800ava.LIZ.LIZ));
    public final HandlerThread LIZ;

    public C953780avY() {
        HandlerThread handlerThread = new HandlerThread("Link-Mic-Avatar-Thread");
        handlerThread.start();
        new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZ = handlerThread;
    }
}
