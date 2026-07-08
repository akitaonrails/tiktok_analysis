package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.01hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C404501hj {
    public static final BPEAHandler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("loc-bg");
        handlerThread.start();
        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
