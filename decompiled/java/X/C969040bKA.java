package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0bKA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969040bKA {
    public static final C969040bKA LIZJ = C969050bKB.LIZ;
    public final BPEAHandler LIZ;
    public final HandlerThread LIZIZ;

    public C969040bKA() {
        HandlerThread handlerThread = new HandlerThread("Link-Mic-Layer-Thread");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZIZ = handlerThread;
    }
}
