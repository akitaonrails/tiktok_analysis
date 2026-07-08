package X;

import android.view.View;

/* JADX INFO: renamed from: X.19v8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21693219v8 extends AbstractC21693019v6 {
    public final InterfaceC21693519vB LJIIJJI;
    public final C2189771An1 LJIIL;

    @Override // X.AbstractC21693019v6
    public final void LIZIZ() {
        super.LIZIZ();
        ViewOnTouchListenerC21650819oI viewOnTouchListenerC21650819oI = this.LIZJ;
        if (viewOnTouchListenerC21650819oI != null) {
            viewOnTouchListenerC21650819oI.setImageDisplayListener(null);
        }
    }

    public final void LIZJ(C1331670kl3 c1331670kl3) {
        this.LIZLLL = false;
        c1331670kl3.LJJ(this.LIZJ);
        c1331670kl3.LJIILJJIL = 0;
        c1331670kl3.LJIIJ(this.LJIIL);
    }

    public C21693219v8(InterfaceC21693319v9 interfaceC21693319v9, InterfaceC21693419vA interfaceC21693419vA, View view, C21692719v3 c21692719v3) {
        super(interfaceC21693319v9, interfaceC21693419vA, view);
        this.LJIIJJI = c21692719v3;
        this.LJIIL = new C2189771An1(this, 3);
    }
}
