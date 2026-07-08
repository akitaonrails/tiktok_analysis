package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.089t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20719089t {
    public static C20719089t LIZJ;
    public HandlerThread LIZ;
    public BPEAHandler LIZIZ;

    public static synchronized C20719089t LIZ() {
        if (LIZJ == null) {
            C20719089t c20719089t = new C20719089t();
            LIZJ = c20719089t;
            if (c20719089t.LIZ == null) {
                HandlerThread handlerThread = new HandlerThread("Animax_Codec", -4);
                c20719089t.LIZ = handlerThread;
                handlerThread.start();
                c20719089t.LIZIZ = new BPEAHandler(C786410Ut5.W2(c20719089t.LIZ));
            }
        }
        return LIZJ;
    }
}
