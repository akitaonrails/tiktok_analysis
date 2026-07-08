package X;

import Y.ARunnableS0S0600001_32;
import Y.ARunnableS40S0400000_32;
import android.app.Activity;
import android.view.View;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.195I, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195I extends C195S {
    public final C195F LJIIIZ;
    public final C195F LJIIJ;
    public final C195F LJIIJJI;
    public final C195F LJIIL;

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    public C195I(int i, Activity activity, int i2) {
        if (i != 0) {
            this.LJIIIZ = C195F.LJ(i, activity);
            C195F c195fLJ = C195F.LJ(i, activity);
            this.LJIIJJI = c195fLJ;
            c195fLJ.LJFF();
        }
        if (i2 != 0) {
            this.LJIIJ = C195F.LJ(i2, activity);
            C195F c195fLJ2 = C195F.LJ(i2, activity);
            this.LJIIL = c195fLJ2;
            c195fLJ2.LJFF();
        }
    }

    @Override // X.C195S
    public final void LJIIL(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        if (this.LJIIJJI == null && this.LJIIL == null) {
            runnable.run();
            return;
        }
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        C195Z.LJ(view);
        C195Z.LJ(view2);
        C786410Ut5.LJLLLLLL(0, view);
        if (!this.LIZLLL) {
            this.LIZ.getOverlay().add(view);
        }
        C0TB1 c0tb1 = new C0TB1(new ARunnableS40S0400000_32(view, view2, runnable, this, 1));
        C195F c195f = this.LJIIJJI;
        if (c195f != null) {
            c195f.LIZ(c0tb1);
            this.LJIIJJI.LIZIZ(view);
            this.LJIIJJI.LJII(view);
        } else {
            c0tb1.run();
        }
        C195F c195f2 = this.LJIIL;
        if (c195f2 != null) {
            c195f2.LIZ(c0tb1);
            this.LJIIL.LIZIZ(view2);
            this.LJIIL.LJII(view2);
        } else {
            c0tb1.run();
        }
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195J
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                C195I c195i = this.LIZ;
                C195F c195f3 = c195i.LJIIJJI;
                if (c195f3 != null) {
                    c195f3.LIZJ();
                }
                C195F c195f4 = c195i.LJIIL;
                if (c195f4 != null) {
                    c195f4.LIZJ();
                }
            }
        });
    }

    @Override // X.C195S
    public final void LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        if (this.LJIIIZ == null && this.LJIIJ == null) {
            runnable.run();
            return;
        }
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
        C0TB1 c0tb1 = new C0TB1(new ARunnableS0S0600001_32(this, c214795194f2, view, fLJIIIIZZ, view2, c214795194f, runnable, 0));
        C195F c195f = this.LJIIIZ;
        if (c195f != null) {
            c195f.LIZ(c0tb1);
            this.LJIIIZ.LIZIZ(view2);
            this.LJIIIZ.LJII(view2);
        } else {
            c0tb1.run();
        }
        C195F c195f2 = this.LJIIJ;
        if (c195f2 != null) {
            c195f2.LIZ(c0tb1);
            this.LJIIJ.LIZIZ(view);
            this.LJIIJ.LJII(view);
        } else {
            c0tb1.run();
        }
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195K
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                C195I c195i = this.LIZ;
                C195F c195f3 = c195i.LJIIIZ;
                if (c195f3 != null) {
                    c195f3.LIZJ();
                }
                C195F c195f4 = c195i.LJIIJ;
                if (c195f4 != null) {
                    c195f4.LIZJ();
                }
            }
        });
    }

    public C195I(Activity activity, int i, int i2, int i3, int i4) {
        if (i != 0) {
            this.LJIIIZ = C195F.LJ(i, activity);
        }
        if (i2 != 0) {
            this.LJIIJ = C195F.LJ(i2, activity);
        }
        if (i3 != 0) {
            this.LJIIJJI = C195F.LJ(i3, activity);
        }
        if (i4 != 0) {
            this.LJIIL = C195F.LJ(i4, activity);
        }
    }
}
