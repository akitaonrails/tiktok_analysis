package X;

import Y.ARunnableS92S0000000_13;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: renamed from: X.0VBB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBB {
    public static final List<C0VBC> LIZ = new CopyOnWriteArrayList();
    public static final List<C0VBE> LIZIZ = new CopyOnWriteArrayList();
    public static final List<C0VB0> LIZJ = new CopyOnWriteArrayList();
    public static final List<C0VB5> LJ = new ArrayList();
    public static final BlockingQueue<C0VB5> LIZLLL = new LinkedTransferQueue();
    public static volatile boolean LJFF = false;

    public static void LIZ(C0VB5 c0vb5) {
        if (c0vb5 == null) {
            return;
        }
        ((LinkedTransferQueue) LIZLLL).offer(c0vb5);
        if (!LJFF) {
            synchronized (C0VBB.class) {
                if (!LJFF) {
                    LJFF = true;
                    List<C0VB5> list = LJ;
                    if (((ArrayList) list).size() > 0) {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (it2.hasNext()) {
                            LIZ((C0VB5) it2.next());
                        }
                        ((ArrayList) LJ).clear();
                    }
                    new BPEAThread(new ARunnableS92S0000000_13(31), "APM-Monitor").start();
                }
            }
        }
    }
}
