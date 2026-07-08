package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0fYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131770fYd {
    public InterfaceC1132060fZ6 LIZIZ;
    public C1132730faB LIZJ;
    public C1131400fY2 LIZLLL;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final C11NJ LJ = new C11NJ();

    public final void LIZ() {
        if (this.LIZ.getAndSet(false)) {
            this.LJ.LJ();
            C1131400fY2 c1131400fY2 = this.LIZLLL;
            if (c1131400fY2 != null) {
                c1131400fY2.LIZIZ();
            }
            this.LIZLLL = null;
            C1132730faB c1132730faB = this.LIZJ;
            if (c1132730faB != null) {
                c1132730faB.LIZJ();
            }
            this.LIZJ = null;
            this.LIZIZ = null;
        }
    }
}
