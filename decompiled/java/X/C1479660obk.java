package X;

import Y.ARunnableS27S1200000_23;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0obk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1479660obk implements InterfaceC1469410oLD {
    public final WeakReference<C1479490obT> LIZ;

    public final void LIZ() {
        C1479490obT c1479490obT = this.LIZ.get();
        if (c1479490obT != null) {
            String str = c1479490obT.LJIIIIZZ;
            c1479490obT.LJJIII.LIZ(new ARunnableS27S1200000_23(c1479490obT.LJJIIJ, c1479490obT.LJIIJJI(), str, 8));
        }
    }

    public final void LIZIZ() {
        C1479490obT c1479490obT = this.LIZ.get();
        if (c1479490obT != null) {
            String str = c1479490obT.LJIIIIZZ;
            c1479490obT.LJJIII.LIZ(new ARunnableS27S1200000_23(c1479490obT.LJJIIJ, c1479490obT.LJIIJJI(), str, 7));
        }
    }

    public C1479660obk(C1479490obT c1479490obT) {
        this.LIZ = new WeakReference<>(c1479490obT);
    }
}
