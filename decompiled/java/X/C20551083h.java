package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.083h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20551083h {
    public static final C20551083h LIZJ = C20552083i.LIZ;
    public final BPEAHandler LIZ;
    public final HandlerThread LIZIZ;

    public C20551083h() {
        HandlerThread handlerThread = new HandlerThread("Game-Dual-Device-Thread");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZIZ = handlerThread;
    }
}
