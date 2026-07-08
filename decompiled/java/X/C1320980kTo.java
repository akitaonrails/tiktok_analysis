package X;

import X.InterfaceC1316360kMM;
import Y.ARunnableS120S0100000_20;
import java.util.Collections;

/* JADX INFO: renamed from: X.0kTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320980kTo<DH extends InterfaceC1316360kMM> {
    public volatile boolean LIZ;
    public boolean LIZIZ;
    public DH LIZJ;
    public C1320970kTn LIZLLL;

    public final DH LIZ() {
        C1325860kbg.LIZLLL(this.LIZJ != null, null, null, Collections.emptyMap());
        return this.LIZJ;
    }

    public final boolean LIZIZ() {
        C1320970kTn c1320970kTn = this.LIZLLL;
        return c1320970kTn != null && c1320970kTn.LIZLLL == this.LIZJ;
    }

    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZ("controllerAttached", this.LIZ);
        c1320100kSOLIZIZ.LIZ("holderAttached", this.LIZIZ);
        return c1320100kSOLIZIZ.toString();
    }

    public C1320980kTo(C1331070kk5 c1331070kk5) {
        boolean zLIZIZ = LIZIZ();
        Collections.emptyMap();
        this.LIZJ = c1331070kk5;
        if (zLIZIZ) {
            this.LIZLLL.LJI(c1331070kk5);
        }
    }

    public final void LIZJ(C1320970kTn c1320970kTn) {
        boolean z = this.LIZ;
        if (z && this.LIZ) {
            this.LIZ = false;
            C1321060kTw.LJ(new ARunnableS120S0100000_20(this, 403));
        }
        if (LIZIZ()) {
            this.LIZLLL.LJI(null);
        }
        this.LIZLLL = c1320970kTn;
        if (c1320970kTn != null) {
            c1320970kTn.LJI(this.LIZJ);
        }
        if (z && !this.LIZ) {
            this.LIZ = true;
            C1321060kTw.LJ(new ARunnableS120S0100000_20(this, 402));
        }
    }
}
