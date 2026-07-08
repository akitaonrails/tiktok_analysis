package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.08Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2113708Pv {
    public static final ExecutorService LIZ = C807400Vlq.LIZ();

    static {
        HandlerThread handlerThread = new HandlerThread("unifycodec-thread");
        handlerThread.start();
        new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
