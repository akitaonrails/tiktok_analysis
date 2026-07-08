package X;

import android.view.View;

/* JADX INFO: renamed from: X.19W3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19W3 extends C21550819Vq {
    public final /* synthetic */ C19W2 LIZ;

    @Override // X.C19WE
    public final void LIZ() {
        View view;
        C19W2 c19w2 = this.LIZ;
        if (c19w2.LJIILL && (view = c19w2.LJI) != null) {
            C786410Ut5.ed(view, 0.0f);
            C21545619Tq c21545619Tq = this.LIZ.LIZLLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545619Tq);
            c21545619Tq.setTranslationY(0.0f);
        }
        C21545619Tq c21545619Tq2 = this.LIZ.LIZLLL;
        int visibility = c21545619Tq2.getVisibility();
        c21545619Tq2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21545619Tq2);
        this.LIZ.LIZLLL.setTransitioning(false);
        C19W2 c19w22 = this.LIZ;
        c19w22.LJIJJ = null;
        InterfaceC21549419Vc interfaceC21549419Vc = c19w22.LJIIJ;
        if (interfaceC21549419Vc != null) {
            interfaceC21549419Vc.LIZJ(c19w22.LJIIIZ);
            c19w22.LJIIIZ = null;
            c19w22.LJIIJ = null;
        }
        C19W6 c19w6 = this.LIZ.LIZJ;
        if (c19w6 != null) {
            C20097313kJ.LIZJ(c19w6);
        }
    }

    public C19W3(C19W2 c19w2) {
        this.LIZ = c19w2;
    }
}
