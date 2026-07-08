package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.1B9C, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B9C {
    public AtomicReference<C1B9B> LIZLLL;
    public int LJFF;
    public final C1B9D LIZ = new C1B9D();
    public volatile boolean LIZIZ = false;
    public final AtomicReference<C1B9B> LIZJ = new AtomicReference<>(C1B9B.UNKNOWN);
    public final ArrayList<C1B9E> LJ = new ArrayList<>();

    public final synchronized C1B9B LIZIZ() {
        C1B9D c1b9d = this.LIZ;
        if (c1b9d == null) {
            return C1B9B.UNKNOWN;
        }
        double d = c1b9d.LIZIZ;
        return d < 0.0d ? C1B9B.UNKNOWN : d < 150.0d ? C1B9B.POOR : d < 550.0d ? C1B9B.MODERATE : d < 2000.0d ? C1B9B.GOOD : C1B9B.EXCELLENT;
    }

    public final synchronized double LIZJ() {
        C1B9D c1b9d;
        c1b9d = this.LIZ;
        return c1b9d == null ? -1.0d : c1b9d.LIZIZ;
    }

    public final synchronized void LIZ(long j, long j2) {
        if (j2 != 0) {
            double d = ((j * 1.0d) / j2) * 8.0d;
            if (d >= 10.0d) {
                this.LIZ.LIZ(d);
                if (this.LIZIZ) {
                    this.LJFF++;
                    if (LIZIZ() != this.LIZLLL.get()) {
                        this.LIZIZ = false;
                        this.LJFF = 1;
                    }
                    if (this.LJFF >= 5.0d) {
                        this.LIZIZ = false;
                        this.LJFF = 1;
                        this.LIZJ.set(this.LIZLLL.get());
                        int size = this.LJ.size();
                        for (int i = 0; i < size; i++) {
                            C1B9E c1b9e = this.LJ.get(i);
                            this.LIZJ.get();
                            c1b9e.LIZ();
                        }
                    }
                    return;
                }
                if (this.LIZJ.get() != LIZIZ()) {
                    this.LIZIZ = true;
                    this.LIZLLL = new AtomicReference<>(LIZIZ());
                }
            }
        }
    }
}
