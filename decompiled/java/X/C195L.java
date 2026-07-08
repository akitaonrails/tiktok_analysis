package X;

import Y.ALAdapterS0S0700001_32;
import Y.ALAdapterS0S0800000_32;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: renamed from: X.195L, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C195L extends AbstractC214793194d {
    public boolean LJIIL() {
        return this instanceof C195U;
    }

    public abstract Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2);

    public abstract Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2);

    @Override // X.AbstractC214793194d
    public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        C214816195a c214816195aLIZLLL;
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        C214816195a c214816195aLIZLLL2 = null;
        if (c214795194f.LIZLLL) {
            c214816195aLIZLLL = C195Z.LIZLLL(view);
        } else {
            C195Z.LJ(view);
            c214816195aLIZLLL = null;
        }
        if (c214795194f2.LIZLLL) {
            c214816195aLIZLLL2 = C195Z.LIZLLL(view2);
        } else {
            C195Z.LJ(view2);
        }
        C786410Ut5.LJLLLLLL(0, view);
        if (!this.LIZLLL) {
            this.LIZ.getOverlay().add(view);
        }
        final Animator animatorLJIILIIL = LJIILIIL(c214795194f, c214795194f2);
        if (!LJIIL()) {
            animatorLJIILIIL.setDuration(300L);
        }
        animatorLJIILIIL.addListener(new ALAdapterS0S0800000_32(this, c214795194f2, view2, c214816195aLIZLLL2, runnable, c214795194f, view, c214816195aLIZLLL, 1));
        animatorLJIILIIL.start();
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195O
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                animatorLJIILIIL.end();
            }
        });
    }

    @Override // X.AbstractC214793194d
    public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        C214816195a c214816195aLIZLLL;
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        C214816195a c214816195aLIZLLL2 = null;
        if (c214795194f.LIZLLL) {
            c214816195aLIZLLL = C195Z.LIZLLL(view);
        } else {
            C195Z.LJ(view);
            c214816195aLIZLLL = null;
        }
        if (c214795194f2.LIZLLL) {
            c214816195aLIZLLL2 = C195Z.LIZLLL(view2);
        } else {
            C195Z.LJ(view2);
        }
        C786410Ut5.LJLLLLLL(0, view);
        float fLJIIIIZZ = C14K9.LJIIIIZZ(view);
        if (fLJIIIIZZ > 0.0f) {
            C14K9.LJIJ(view, 0.0f);
        }
        final Animator animatorLJIILJJIL = LJIILJJIL(c214795194f, c214795194f2);
        if (!LJIIL()) {
            animatorLJIILJJIL.setDuration(300L);
        }
        animatorLJIILJJIL.addListener(new ALAdapterS0S0700001_32(c214795194f2, view, fLJIIIIZZ, c214795194f, c214816195aLIZLLL, view2, c214816195aLIZLLL2, runnable, 1));
        animatorLJIILJJIL.start();
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195N
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                animatorLJIILJJIL.end();
            }
        });
    }
}
