package Y;

import X.C14K9;
import X.C195Z;
import X.C214795194f;
import X.C214816195a;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS0S0700001_32 extends AnimatorListenerAdapter {
    public final int $t;
    public float f7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                super.onAnimationStart(animator);
                break;
            case 1:
                super.onAnimationStart(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0700001_32 aLAdapterS0S0700001_32, Animator animator) {
        super.onAnimationEnd(animator);
        if (!((C214795194f) aLAdapterS0S0700001_32.l0).LIZLLL) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS0S0700001_32.l1);
        }
        float f = aLAdapterS0S0700001_32.f7;
        if (f > 0.0f) {
            C14K9.LJIJ((View) aLAdapterS0S0700001_32.l1, f);
        }
        if (((C214795194f) aLAdapterS0S0700001_32.l2).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0700001_32.l1, (C214816195a) aLAdapterS0S0700001_32.l3);
        } else {
            C195Z.LJ((View) aLAdapterS0S0700001_32.l1);
        }
        if (((C214795194f) aLAdapterS0S0700001_32.l0).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0700001_32.l4, (C214816195a) aLAdapterS0S0700001_32.l5);
        } else {
            C195Z.LJ((View) aLAdapterS0S0700001_32.l4);
        }
        ((Runnable) aLAdapterS0S0700001_32.l6).run();
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0700001_32 aLAdapterS0S0700001_32, Animator animator) {
        super.onAnimationEnd(animator);
        if (!((C214795194f) aLAdapterS0S0700001_32.l0).LIZLLL) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS0S0700001_32.l1);
        }
        float f = aLAdapterS0S0700001_32.f7;
        if (f > 0.0f) {
            C14K9.LJIJ((View) aLAdapterS0S0700001_32.l1, f);
        }
        if (((C214795194f) aLAdapterS0S0700001_32.l2).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0700001_32.l1, (C214816195a) aLAdapterS0S0700001_32.l3);
        } else {
            C195Z.LJ((View) aLAdapterS0S0700001_32.l1);
        }
        if (((C214795194f) aLAdapterS0S0700001_32.l0).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0700001_32.l4, (C214816195a) aLAdapterS0S0700001_32.l5);
        } else {
            C195Z.LJ((View) aLAdapterS0S0700001_32.l4);
        }
        ((Runnable) aLAdapterS0S0700001_32.l6).run();
    }

    public ALAdapterS0S0700001_32(C214795194f c214795194f, View view, float f, C214795194f c214795194f2, C214816195a c214816195a, View view2, C214816195a c214816195a2, Runnable runnable, int i) {
        this.$t = i;
        this.l0 = c214795194f;
        this.l1 = view;
        this.f7 = f;
        this.l2 = c214795194f2;
        this.l3 = c214816195a;
        this.l4 = view2;
        this.l5 = c214816195a2;
        this.l6 = runnable;
    }
}
