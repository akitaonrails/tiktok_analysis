package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.01hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C405101hp {
    public static final C405101hp LIZJ;
    public static final C1701780uO0 LIZLLL;
    public final BPEAHandler LIZ;
    public final HandlerThread LIZIZ;

    static {
        C405101hp c405101hp = C405201hq.LIZ;
        LIZJ = c405101hp;
        LIZLLL = C1701940uOG.LIZ(C786410Ut5.W2(c405101hp.LIZIZ));
    }

    public C405101hp() {
        HandlerThread handlerThread = new HandlerThread("Link-Mic-Play-Thread");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZIZ = handlerThread;
    }
}
