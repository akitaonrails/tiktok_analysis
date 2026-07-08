package X;

import Y.ARunnableS132S0100000_32;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.19AO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AO extends C19AA {
    public final InterfaceC21499419Bw LJIIJ;
    public final boolean LJIIJJI;
    public final View LJIIL;
    public final ViewGroup LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;

    @Override // X.C19AA
    public final void LIZIZ(boolean z) {
        if (!z || !this.LJIILJJIL) {
            return;
        }
        this.LJIILL = this.LJIIL.getVisibility();
        C786410Ut5.LJLLLLLL(0, this.LJIIL);
    }

    @Override // X.C19AA
    public final void LIZJ(boolean z) {
        final C195F c195fLIZ;
        if (!z || !this.LJIIJJI || (c195fLIZ = this.LJIIJ.LIZ()) == null) {
            return;
        }
        if (this.LJIILIIL != null && (this.LJIIL.getWidth() == 0 || this.LJIIL.getHeight() == 0)) {
            return;
        }
        c195fLIZ.LIZ(new ARunnableS132S0100000_32(this, 20));
        C19A4.LJIIIIZZ.put(this.LIZ, new C1447920nmY() { // from class: X.19BH
            @Override // X.C1447920nmY
            public final void LIZ() {
                super.LIZ();
                c195fLIZ.LIZJ();
            }
        });
        this.LJIILIIL.startViewTransition(this.LJIIL);
        c195fLIZ.LJII(this.LJIIL);
        this.LJIILJJIL = true;
    }

    public C19AO(C19A4 c19a4, Scene scene, InterfaceC21499419Bw interfaceC21499419Bw) {
        boolean z;
        super(c19a4, scene, -1, null, EnumC214943199x.NONE, false, false, true);
        this.LJIIJ = interfaceC21499419Bw;
        View view = scene.mView;
        if (view != null && view.getParent() != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJJI = z;
        if (z) {
            View view2 = scene.mView;
            this.LJIIL = view2;
            this.LJIILIIL = (ViewGroup) view2.getParent();
        } else {
            this.LJIIL = null;
            this.LJIILIIL = null;
        }
    }
}
