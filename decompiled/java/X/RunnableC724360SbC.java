package X;

import com.bytedance.assem.arch.reused.optimize.ReverseQueueHandler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0SbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC724360SbC implements Runnable {
    public static final RunnableC724360SbC LL = new RunnableC724360SbC();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ReverseQueueHandler@eb60.flushTask$1");
        try {
            ReverseQueueHandler reverseQueueHandler = ReverseQueueHandler.LL;
            reverseQueueHandler.getClass();
            Iterator it2 = C13LP.LJLJJLL((CopyOnWriteArrayList) ReverseQueueHandler.LLILLJJLI.getValue()).iterator();
            while (it2.hasNext()) {
                reverseQueueHandler.postAtFrontOfQueue((Runnable) it2.next());
            }
            ((CopyOnWriteArrayList) ReverseQueueHandler.LLILLJJLI.getValue()).clear();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReverseQueueHandler@eb60.flushTask$1");
    }
}
