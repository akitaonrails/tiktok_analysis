package X;

import Y.ARunnableS84S0000000_4;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: renamed from: X.0C6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308160C6c {
    public static volatile BPEAThread LIZ;
    public static final BlockingQueue<String> LIZIZ = new LinkedTransferQueue();
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static void LIZ(String str) {
        if (LIZLLL) {
            return;
        }
        ((LinkedTransferQueue) LIZIZ).offer(str);
        if (!LIZJ) {
            if (LIZJ && LIZ != null) {
                return;
            }
            LIZJ = true;
            LIZ = new BPEAThread(new ARunnableS84S0000000_4(17), "ABMockRecord");
            BPEAThread bPEAThread = LIZ;
            if (bPEAThread == null) {
                return;
            }
            bPEAThread.start();
        }
    }
}
