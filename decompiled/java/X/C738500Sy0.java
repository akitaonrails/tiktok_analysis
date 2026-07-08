package X;

import Y.ARunnableS80S0200000_11;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0Sy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738500Sy0 {
    public final ConcurrentLinkedQueue<C738490Sxz> LIZ = new ConcurrentLinkedQueue<>();

    public final void LIZIZ() {
        C738490Sxz c738490SxzPeek = this.LIZ.peek();
        if (c738490SxzPeek == null || !c738490SxzPeek.LIZLLL || c738490SxzPeek.LJ) {
            return;
        }
        c738490SxzPeek.LJ = true;
        if (c738490SxzPeek.LIZJ != null) {
            C725080ScM.LIZ().execute(new ARunnableS80S0200000_11(c738490SxzPeek, this, 1));
        } else {
            LIZJ(c738490SxzPeek, null);
        }
    }

    public final void LIZ(C738490Sxz c738490Sxz) {
        c738490Sxz.LIZLLL = this.LIZ.isEmpty();
        this.LIZ.offer(c738490Sxz);
        LIZIZ();
    }

    public final void LIZJ(C738490Sxz c738490Sxz, Object obj) {
        c738490Sxz.LIZIZ.apply(obj);
        this.LIZ.poll();
        C738490Sxz c738490SxzPeek = this.LIZ.peek();
        if (c738490SxzPeek != null) {
            c738490SxzPeek.LIZLLL = true;
        }
        LIZIZ();
    }
}
