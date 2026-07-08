package X;

import Y.ARunnableS0S0600001_32;
import Y.ARunnableS40S0400000_32;
import android.app.Activity;
import android.view.View;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.1951, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1951 extends AbstractC214793194d {
    public final C195F LJ;
    public final C195F LJFF;

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    public AnonymousClass1951(int i, Activity activity, int i2) {
        this.LJ = C195F.LJ(i, activity);
        this.LJFF = C195F.LJ(i2, activity);
    }

    @Override // X.AbstractC214793194d
    public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        C195Z.LJ(view);
        C195Z.LJ(view2);
        C786410Ut5.LJLLLLLL(0, view);
        if (!this.LIZLLL) {
            this.LIZ.getOverlay().add(view);
        }
        C0C22 c0c22 = new C0C22(new ARunnableS40S0400000_32(view, view2, runnable, this, 6));
        this.LJ.LJFF();
        this.LJ.LIZ(c0c22);
        this.LJ.LJII(view);
        this.LJFF.LJFF();
        this.LJFF.LIZ(c0c22);
        this.LJFF.LJII(view2);
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.1953
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                this.LIZ.LJ.LIZJ();
                this.LIZ.LJFF.LIZJ();
            }
        });
    }

    @Override // X.AbstractC214793194d
    public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        C195Z.LJ(view);
        C195Z.LJ(view2);
        C786410Ut5.LJLLLLLL(0, view);
        float fLJIIIIZZ = C14K9.LJIIIIZZ(view);
        if (fLJIIIIZZ > 0.0f) {
            C14K9.LJIJ(view, 0.0f);
        }
        if (!this.LIZLLL && c214795194f.LIZJ.value < EnumC214943199x.VIEW_CREATED.value) {
            this.LIZ.getOverlay().add(view);
        }
        C0C22 c0c22 = new C0C22(new ARunnableS0S0600001_32(this, c214795194f2, view, fLJIIIIZZ, view2, c214795194f, runnable, 2));
        this.LJ.LIZ(c0c22);
        this.LJFF.LIZ(c0c22);
        this.LJFF.LJII(view);
        this.LJ.LJII(view2);
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.1952
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                this.LIZ.LJ.LIZJ();
                this.LIZ.LJFF.LIZJ();
            }
        });
    }
}
