package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.1C7W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7W {
    public C1C7Z LIZ;
    public ConcurrentLinkedQueue<C1869680yko> LIZIZ = new ConcurrentLinkedQueue<>();
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZIZ() {
        if (this.LIZLLL) {
            ConcurrentLinkedQueue<C1C7W> concurrentLinkedQueue = C1C7V.LIZIZ;
            concurrentLinkedQueue.remove(this);
            if (concurrentLinkedQueue.size() == 0) {
                C1C7V.LIZJ = false;
                C1C7V.LJII = 0;
                C1C7V.LIZ(this, true);
                C1C7V.LIZ = new ConcurrentHashMap<>(64);
            } else {
                C1C7V.LIZ(this, false);
            }
            ConcurrentLinkedQueue<C1869680yko> concurrentLinkedQueue2 = this.LIZIZ;
            this.LJ = false;
            this.LIZIZ = new ConcurrentLinkedQueue<>();
            C1C7Z c1c7z = this.LIZ;
            if (c1c7z != null) {
                c1c7z.onLongRunnableCallback(concurrentLinkedQueue2);
            }
            this.LIZLLL = false;
        }
    }

    public final void LIZ(boolean z) {
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            this.LJ = z;
            if (this.LIZJ == 0) {
                this.LIZJ = System.currentTimeMillis();
            }
            C1C7V.LIZIZ.add(this);
            C1C7V.LIZJ = true;
            C1C7V.LJI = System.currentTimeMillis();
        }
    }

    public final void LIZJ(C1869680yko c1869680yko) {
        if (this.LJ) {
            c1869680yko.LJII = C07KM.LIZLLL.invoke();
            c1869680yko.LJIIIZ = C07KM.LJFF.invoke();
        }
        long j = c1869680yko.LIZLLL - this.LIZJ;
        c1869680yko.LIZLLL = j;
        if (j < 0) {
            c1869680yko.LIZLLL = 0L;
        }
        this.LIZIZ.add(c1869680yko);
    }
}
