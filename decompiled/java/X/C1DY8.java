package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1DY8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DY8 implements C1DY1 {
    public final List<C1DY1> LIZ;
    public C1DY2 LIZIZ;
    public boolean LIZJ;

    @Override // X.C1DY1
    public final void cancel() {
        Iterator<C1DY1> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
        this.LIZJ = false;
    }

    @Override // X.C1DY1
    public final void start() {
        if (this.LIZJ) {
            return;
        }
        LIZIZ(0);
        this.LIZJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1DY8(List<? extends C1DY1> list) {
        this.LIZ = list;
    }

    @Override // X.C1DY1
    public final void LIZ(C1DY2 c1dy2) {
        this.LIZIZ = c1dy2;
    }

    public final void LIZIZ(final int i) {
        C1DY1 c1dy1 = (C1DY1) C13LP.LJJJLZIJ(i, this.LIZ);
        if (c1dy1 == null) {
            return;
        }
        c1dy1.LIZ(new C1DY2() { // from class: X.1DY9
            @Override // X.C1DY2
            public final void LIZ() {
                C1DY2 c1dy2;
                if (i == this.LIZ.size() - 1 && (c1dy2 = this.LIZIZ) != null) {
                    c1dy2.LIZ();
                }
                this.LIZIZ(i + 1);
            }

            @Override // X.C1DY2
            public final void LIZIZ() {
                C1DY2 c1dy2;
                if (i != 0 || (c1dy2 = this.LIZIZ) == null) {
                    return;
                }
                c1dy2.LIZIZ();
            }

            @Override // X.C1DY2
            public final void LIZJ() {
                C1DY2 c1dy2 = this.LIZIZ;
                if (c1dy2 != null) {
                    c1dy2.LIZJ();
                }
            }
        });
        c1dy1.start();
    }
}
