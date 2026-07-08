package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.083a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20544083a {
    public static final BPEAHandler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("prefetch_thread");
        handlerThread.start();
        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        new BPEAHandler(Looper.getMainLooper());
    }
}
