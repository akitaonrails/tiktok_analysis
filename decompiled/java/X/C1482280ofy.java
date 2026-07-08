package X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0ofy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482280ofy implements InterfaceC1482240ofu {
    public final Queue<Runnable> LIZ = new ConcurrentLinkedQueue();
    public final ExecutorService LIZIZ;
    public final C1481920ofO LIZJ;

    public C1482280ofy(ExecutorService executorService) {
        this.LIZIZ = null;
        ((Number) C1474810oTv.F3.getValue()).intValue();
        this.LIZJ = new C1481920ofO();
        new Object(this) { // from class: X.0ofz
        };
        this.LIZIZ = executorService;
    }

    public final void LIZ(Runnable runnable) {
        if (this.LIZJ.LIZ) {
            runnable.run();
        } else {
            ((ConcurrentLinkedQueue) this.LIZ).offer(runnable);
        }
    }
}
