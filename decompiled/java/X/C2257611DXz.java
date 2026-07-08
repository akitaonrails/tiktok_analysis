package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1DXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257611DXz implements C1DY3 {
    public static final List<InterfaceC2257601DXy> LIZJ = Collections.singletonList(new C1DY7() { // from class: X.1DY4
    });
    public final List<C1DY3> LIZ;
    public C1DY2 LIZIZ;

    @Override // X.C1DY1
    public final void cancel() {
        Iterator<C1DY3> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    @Override // X.C1DY1
    public final void start() {
        C1DY2 c1dy2 = new C1DY2(this) { // from class: X.1DY0
            public final C2257611DXz LIZ;
            public int LIZIZ;
            public int LIZJ;
            public boolean LIZLLL;

            @Override // X.C1DY2
            public final void LIZ() {
                C1DY2 c1dy22;
                int i = this.LIZJ + 1;
                this.LIZJ = i;
                if (i != this.LIZ.LIZ.size() || (c1dy22 = this.LIZ.LIZIZ) == null) {
                    return;
                }
                c1dy22.LIZ();
            }

            @Override // X.C1DY2
            public final void LIZIZ() {
                C1DY2 c1dy22;
                int i = this.LIZIZ + 1;
                this.LIZIZ = i;
                if (i != this.LIZ.LIZ.size() || (c1dy22 = this.LIZ.LIZIZ) == null) {
                    return;
                }
                c1dy22.LIZIZ();
            }

            @Override // X.C1DY2
            public final void LIZJ() {
                if (this.LIZLLL) {
                    return;
                }
                C1DY2 c1dy22 = this.LIZ.LIZIZ;
                if (c1dy22 != null) {
                    c1dy22.LIZJ();
                }
                this.LIZLLL = true;
            }

            {
                this.LIZ = this;
            }
        };
        for (C1DY3 c1dy3 : this.LIZ) {
            c1dy3.LIZ(c1dy2);
            c1dy3.start();
        }
    }

    public C2257611DXz(List list) {
        this.LIZ = list;
    }

    @Override // X.C1DY1
    public final void LIZ(C1DY2 c1dy2) {
        this.LIZIZ = c1dy2;
    }
}
