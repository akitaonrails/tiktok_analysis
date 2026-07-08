package Y;

import X.C1426520nE2;
import X.C1426750nEP;
import X.C370280EfS;
import X.C372520Ej4;
import X.C374370Em3;
import X.C374500EmG;
import X.C374830Emn;
import X.C380940Ewe;
import X.C383320F1e;
import X.C388210FJz;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS0S0110000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (6 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            this.z1 = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (8 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public ALAdapterS0S0110000_5(C388210FJz c388210FJz, int i) {
        this.$t = i;
        this.l0 = c388210FJz;
        this.z1 = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        int i;
        View view = ((C374370Em3) aLAdapterS0S0110000_5.l0).mView;
        if (view != null) {
            if (aLAdapterS0S0110000_5.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        int i;
        View view = ((C374830Emn) aLAdapterS0S0110000_5.l0).mView;
        if (view != null) {
            if (aLAdapterS0S0110000_5.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        int i;
        View view = ((C383320F1e) aLAdapterS0S0110000_5.l0).mView;
        if (view != null) {
            if (aLAdapterS0S0110000_5.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        int i;
        View view = ((C380940Ewe) aLAdapterS0S0110000_5.l0).mView;
        if (view != null) {
            if (aLAdapterS0S0110000_5.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        int i;
        View view = ((C374500EmG) aLAdapterS0S0110000_5.l0).mView;
        if (view != null) {
            if (aLAdapterS0S0110000_5.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((C372520Ej4) aLAdapterS0S0110000_5.l0).LJFF(aLAdapterS0S0110000_5.z1);
        ((C372520Ej4) aLAdapterS0S0110000_5.l0).LIZJ.LJFF.invoke();
        ((C372520Ej4) aLAdapterS0S0110000_5.l0).LIZIZ.LJII = null;
    }

    public static final void onAnimationEnd$6(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        if (!aLAdapterS0S0110000_5.z1) {
            C370280EfS c370280EfS = (C370280EfS) aLAdapterS0S0110000_5.l0;
            if (c370280EfS.LLILLJJLI == animator) {
                c370280EfS.LLILLJJLI = null;
                c370280EfS.LL.cancelAnimation();
                c370280EfS.LL.setProgress(0.0f);
                C786410Ut5.LLD(0, c370280EfS.LL);
                c370280EfS.LL.playAnimation();
            }
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        C1426520nE2 c1426520nE2;
        int i;
        View view = ((C1426750nEP) aLAdapterS0S0110000_5.l0).mView;
        if (view != null) {
            if (aLAdapterS0S0110000_5.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (!aLAdapterS0S0110000_5.z1 && (c1426520nE2 = ((C1426750nEP) aLAdapterS0S0110000_5.l0).LLJJJIL) != null) {
            c1426520nE2.zR0(false);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0110000_5 aLAdapterS0S0110000_5, Animator animator) {
        ((C388210FJz) aLAdapterS0S0110000_5.l0).LJIIIIZZ(aLAdapterS0S0110000_5.z1);
    }

    public ALAdapterS0S0110000_5(C370280EfS c370280EfS, int i) {
        this.$t = i;
        this.l0 = c370280EfS;
    }

    public ALAdapterS0S0110000_5(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
