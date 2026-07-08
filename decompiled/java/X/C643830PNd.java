package X;

import com.bytedance.common.utility.collection.WeakHandler;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0PNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643830PNd {
    public final WeakHandler LIZ;
    public final C0POK LIZIZ;
    public volatile boolean LIZLLL;
    public volatile boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public volatile int LJIIIZ;
    public final Queue<C643960PNq> LIZJ = new ConcurrentLinkedQueue();
    public final List<String> LJ = new CopyOnWriteArrayList();

    public final void LIZIZ() {
        C643960PNq c643960PNq;
        if ((!this.LIZLLL || this.LJII) && (c643960PNq = (C643960PNq) ((ConcurrentLinkedQueue) this.LIZJ).poll()) != null) {
            this.LIZLLL = true;
            if (!c643960PNq.LIZIZ && (c643960PNq.LIZLLL || this.LJFF || !this.LJI)) {
                WeakHandler weakHandler = this.LIZ;
                if (weakHandler != null) {
                    weakHandler.post(c643960PNq.LIZ);
                }
            } else if (this.LJII) {
                WeakHandler weakHandler2 = this.LIZ;
                if (weakHandler2 != null) {
                    Runnable runnable = c643960PNq.LIZ;
                    int i = this.LJIIIZ;
                    this.LJIIIZ = i + 1;
                    weakHandler2.postAtTime(runnable, i);
                }
            } else {
                WeakHandler weakHandler3 = this.LIZ;
                if (weakHandler3 != null) {
                    weakHandler3.postAtFrontOfQueue(c643960PNq.LIZ);
                }
            }
            ((CopyOnWriteArrayList) this.LJ).add(c643960PNq.LIZJ);
        }
    }

    public C643830PNd(WeakHandler weakHandler, C0POK c0pok) {
        boolean z;
        boolean z2;
        this.LIZ = weakHandler;
        this.LIZIZ = c0pok;
        C0P5M.LIZ.getClass();
        if (C0P5M.LIZ().enablePostFront == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
        if (((Number) C04SD.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJII = z2;
        this.LJIIIIZZ = ((Number) C1098304Rh.LIZ.getValue()).intValue() == 1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0PNi] */
    public final void LIZ(final Runnable runnable, boolean z, String str, boolean z2, int i) {
        ?? r2 = new Runnable() { // from class: X.0PNi
            public final void LIZ() {
                C643830PNd c643830PNd = this.LL;
                if (c643830PNd.LIZIZ.LLLII) {
                    ((ConcurrentLinkedQueue) c643830PNd.LIZJ).clear();
                    ((CopyOnWriteArrayList) c643830PNd.LJ).clear();
                    c643830PNd.LJIIIZ = 0;
                    return;
                }
                runnable.run();
                C643830PNd c643830PNd2 = this.LL;
                c643830PNd2.LIZLLL = false;
                if (c643830PNd2.LJFF || !c643830PNd2.LJIIIIZZ) {
                    c643830PNd2.LIZIZ();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ChunkScheduler@9ff6.postTask$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ChunkScheduler@9ff6.postTask$runnable$1");
            }
        };
        ((ConcurrentLinkedQueue) this.LIZJ).add(new C643960PNq(r2, z, str, z2));
        LIZIZ();
    }
}
