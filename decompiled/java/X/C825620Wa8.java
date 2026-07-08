package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0Wa8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825620Wa8 {
    public static final C825620Wa8 LIZ = new C825620Wa8();
    public static final HandlerThread LIZIZ;
    public static BPEAHandler LIZJ;

    static {
        HandlerThread handlerThread = new HandlerThread("pns_engine_worker_thread");
        LIZIZ = handlerThread;
        handlerThread.start();
    }
}
