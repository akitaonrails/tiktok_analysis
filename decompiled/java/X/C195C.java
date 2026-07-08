package X;

import Y.ARunnableS0S0600001_32;
import Y.ARunnableS40S0400000_32;
import android.animation.Animator;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.195C, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195C extends AbstractC214793194d {
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
        RunnableC741890T8h runnableC741890T8h = new RunnableC741890T8h(new ARunnableS40S0400000_32(view, view2, this, runnable, 3));
        C195F c195f = this.LJI;
        if (c195f != null) {
            c195f.LIZ(runnableC741890T8h);
            C195F c195f2 = this.LJI;
            if (c195f2 != null) {
                c195f2.LIZIZ(view);
            }
            C195F c195f3 = this.LJI;
            if (c195f3 != null) {
                c195f3.LJII(view);
            }
        } else {
            runnableC741890T8h.run();
        }
        C195F c195f4 = this.LJII;
        if (c195f4 != null) {
            c195f4.LIZ(runnableC741890T8h);
            C195F c195f5 = this.LJII;
            if (c195f5 != null) {
                c195f5.LIZIZ(view2);
            }
            C195F c195f6 = this.LJII;
            if (c195f6 != null) {
                c195f6.LJII(view2);
            }
        } else {
            runnableC741890T8h.run();
        }
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195D
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                C195F c195f7 = this.LIZ.LJI;
                if (c195f7 != null) {
                    c195f7.LIZJ();
                }
                C195F c195f8 = this.LIZ.LJII;
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
        RunnableC741890T8h runnableC741890T8h = new RunnableC741890T8h(new ARunnableS0S0600001_32(runnable, c214795194f2, view, fLJIIIIZZ, view2, this, c214795194f, 1));
        C195F c195f = this.LJ;
        if (c195f != null) {
            c195f.LIZ(runnableC741890T8h);
            c195f.LIZIZ(view2);
            c195f.LJII(view2);
        } else {
            runnableC741890T8h.run();
        }
        C195F c195f2 = this.LJFF;
        if (c195f2 != null) {
            c195f2.LIZ(runnableC741890T8h);
            c195f2.LIZIZ(view);
            c195f2.LJII(view);
        } else {
            runnableC741890T8h.run();
        }
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195E
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                C195F c195f3 = this.LIZ.LJ;
                if (c195f3 != null) {
                    c195f3.LIZJ();
                }
                C195F c195f4 = this.LIZ.LJFF;
                if (c195f4 != null) {
                    c195f4.LIZJ();
                }
            }
        });
    }

    public C195C(Activity activity, int i, int i2, int i3, int i4, long j) {
        if (i != 0) {
            C195F c195fLJ = C195F.LJ(i, activity);
            if (j >= 0) {
                Animation animation = c195fLJ.LIZ;
                if (animation != null) {
                    animation.setDuration(j);
                } else {
                    Animator animator = c195fLJ.LIZIZ;
                    if (animator != null) {
                        animator.setDuration(j);
                    } else {
                        throw new IllegalStateException("Animation or Animator not found");
                    }
                }
            }
            this.LJ = c195fLJ;
        }
        if (i2 != 0) {
            C195F c195fLJ2 = C195F.LJ(i2, activity);
            if (j >= 0) {
                Animation animation2 = c195fLJ2.LIZ;
                if (animation2 != null) {
                    animation2.setDuration(j);
                } else {
                    Animator animator2 = c195fLJ2.LIZIZ;
                    if (animator2 != null) {
                        animator2.setDuration(j);
                    } else {
                        throw new IllegalStateException("Animation or Animator not found");
                    }
                }
            }
            this.LJFF = c195fLJ2;
        }
        if (i3 != 0) {
            C195F c195fLJ3 = C195F.LJ(i3, activity);
            if (j >= 0) {
                Animation animation3 = c195fLJ3.LIZ;
                if (animation3 != null) {
                    animation3.setDuration(j);
                } else {
                    Animator animator3 = c195fLJ3.LIZIZ;
                    if (animator3 != null) {
                        animator3.setDuration(j);
                    } else {
                        throw new IllegalStateException("Animation or Animator not found");
                    }
                }
            }
            this.LJI = c195fLJ3;
        }
        if (i4 != 0) {
            C195F c195fLJ4 = C195F.LJ(i4, activity);
            if (j >= 0) {
                Animation animation4 = c195fLJ4.LIZ;
                if (animation4 != null) {
                    animation4.setDuration(j);
                } else {
                    Animator animator4 = c195fLJ4.LIZIZ;
                    if (animator4 != null) {
                        animator4.setDuration(j);
                    } else {
                        throw new IllegalStateException("Animation or Animator not found");
                    }
                }
            }
            this.LJII = c195fLJ4;
        }
    }
}
