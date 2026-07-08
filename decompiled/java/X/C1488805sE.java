package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.05sE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1488805sE {
    public static final BPEAHandler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("default-loc");
        handlerThread.start();
        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
