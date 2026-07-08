package X;

import Y.ARunnableS0S0600001_32;
import Y.ARunnableS40S0400000_32;
import android.app.Activity;
import android.view.View;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.1954, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1954 extends AbstractC214793194d {
    public final C195F LJ;
    public final C195F LJFF;
    public final C195F LJI;
    public final C195F LJII;

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    @Override // X.AbstractC214793194d
    public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        if (this.LJI == null && this.LJII == null) {
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
        RunnableC741830T8b runnableC741830T8b = new RunnableC741830T8b(new ARunnableS40S0400000_32(view, view2, this, runnable, 7));
        C195F c195f = this.LJI;
        if (c195f != null) {
            c195f.LIZ(runnableC741830T8b);
            C195F c195f2 = this.LJI;
            if (c195f2 != null) {
                c195f2.LIZIZ(view);
            }
            C195F c195f3 = this.LJI;
            if (c195f3 != null) {
                c195f3.LJII(view);
            }
        } else {
            runnableC741830T8b.run();
        }
        C195F c195f4 = this.LJII;
        if (c195f4 != null) {
            c195f4.LIZ(runnableC741830T8b);
            C195F c195f5 = this.LJII;
            if (c195f5 != null) {
                c195f5.LIZIZ(view2);
            }
            C195F c195f6 = this.LJII;
            if (c195f6 != null) {
                c195f6.LJII(view2);
            }
        } else {
            runnableC741830T8b.run();
        }
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.1956
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                AnonymousClass1954 anonymousClass1954 = this.LIZ;
                C195F c195f7 = anonymousClass1954.LJI;
                if (c195f7 != null) {
                    c195f7.LIZJ();
                }
                C195F c195f8 = anonymousClass1954.LJII;
                if (c195f8 != null) {
                    c195f8.LIZJ();
                }
            }
        });
    }

    @Override // X.AbstractC214793194d
    public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        if (this.LJ == null && this.LJFF == null) {
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
        RunnableC741830T8b runnableC741830T8b = new RunnableC741830T8b(new ARunnableS0S0600001_32(runnable, c214795194f2, view, fLJIIIIZZ, view2, this, c214795194f, 3));
        C195F c195f = this.LJ;
        if (c195f != null) {
            c195f.LIZ(runnableC741830T8b);
            this.LJ.LIZIZ(view2);
            this.LJ.LJII(view2);
        } else {
            runnableC741830T8b.run();
        }
        C195F c195f2 = this.LJFF;
        if (c195f2 != null) {
            c195f2.LIZ(runnableC741830T8b);
            C195F c195f3 = this.LJFF;
            if (c195f3 != null) {
                c195f3.LIZIZ(view);
            }
            C195F c195f4 = this.LJFF;
            if (c195f4 != null) {
                c195f4.LJII(view);
            }
        } else {
            runnableC741830T8b.run();
        }
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.1955
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                AnonymousClass1954 anonymousClass1954 = this.LIZ;
                C195F c195f5 = anonymousClass1954.LJ;
                if (c195f5 != null) {
                    c195f5.LIZJ();
                }
                C195F c195f6 = anonymousClass1954.LJFF;
                if (c195f6 != null) {
                    c195f6.LIZJ();
                }
            }
        });
    }

    public AnonymousClass1954(Activity activity, int i, int i2, int i3, int i4) {
        C195F c195f;
        C195F c195f2;
        if (i != 0) {
            this.LJ = C195F.LJ(i, activity);
        }
        if (i2 != 0) {
            this.LJFF = C195F.LJ(i2, activity);
        }
        if (i3 != 0) {
            this.LJI = C195F.LJ(i3, activity);
        }
        if (i4 != 0) {
            this.LJII = C195F.LJ(i4, activity);
        }
        C195F c195f3 = this.LJ;
        if (c195f3 != null && (c195f2 = this.LJFF) != null) {
            AnonymousClass1957.LIZ(c195f3, c195f2);
        }
        C195F c195f4 = this.LJI;
        if (c195f4 != null && (c195f = this.LJII) != null) {
            AnonymousClass1957.LIZ(c195f4, c195f);
        }
    }
}
