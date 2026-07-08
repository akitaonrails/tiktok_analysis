package Y;

import X.C195L;
import X.C195M;
import X.C195Z;
import X.C214795194f;
import X.C214816195a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS0S0800000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

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

    public static final void onAnimationEnd$0(ALAdapterS0S0800000_32 aLAdapterS0S0800000_32, Animator animator) {
        super.onAnimationEnd(animator);
        if (((C195M) aLAdapterS0S0800000_32.l7).LIZLLL) {
            if (((C214795194f) aLAdapterS0S0800000_32.l0).LIZLLL) {
                C195Z.LJFF((View) aLAdapterS0S0800000_32.l1, (C214816195a) aLAdapterS0S0800000_32.l2);
            } else {
                C195Z.LJ((View) aLAdapterS0S0800000_32.l1);
            }
            ((Runnable) aLAdapterS0S0800000_32.l3).run();
            return;
        }
        if (((C214795194f) aLAdapterS0S0800000_32.l4).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0800000_32.l5, (C214816195a) aLAdapterS0S0800000_32.l6);
        } else {
            C195Z.LJ((View) aLAdapterS0S0800000_32.l5);
        }
        if (((C214795194f) aLAdapterS0S0800000_32.l0).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0800000_32.l1, (C214816195a) aLAdapterS0S0800000_32.l2);
        } else {
            C195Z.LJ((View) aLAdapterS0S0800000_32.l1);
        }
        ((C195M) aLAdapterS0S0800000_32.l7).LIZ.getOverlay().remove((View) aLAdapterS0S0800000_32.l5);
        ((Runnable) aLAdapterS0S0800000_32.l3).run();
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0800000_32 aLAdapterS0S0800000_32, Animator animator) {
        super.onAnimationEnd(animator);
        if (((C195L) aLAdapterS0S0800000_32.l7).LIZLLL) {
            if (((C214795194f) aLAdapterS0S0800000_32.l0).LIZLLL) {
                C195Z.LJFF((View) aLAdapterS0S0800000_32.l1, (C214816195a) aLAdapterS0S0800000_32.l2);
            } else {
                C195Z.LJ((View) aLAdapterS0S0800000_32.l1);
            }
            ((Runnable) aLAdapterS0S0800000_32.l3).run();
            return;
        }
        if (((C214795194f) aLAdapterS0S0800000_32.l4).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0800000_32.l5, (C214816195a) aLAdapterS0S0800000_32.l6);
        } else {
            C195Z.LJ((View) aLAdapterS0S0800000_32.l5);
        }
        if (((C214795194f) aLAdapterS0S0800000_32.l0).LIZLLL) {
            C195Z.LJFF((View) aLAdapterS0S0800000_32.l1, (C214816195a) aLAdapterS0S0800000_32.l2);
        } else {
            C195Z.LJ((View) aLAdapterS0S0800000_32.l1);
        }
        ((C195L) aLAdapterS0S0800000_32.l7).LIZ.getOverlay().remove((View) aLAdapterS0S0800000_32.l5);
        ((Runnable) aLAdapterS0S0800000_32.l3).run();
    }

    public ALAdapterS0S0800000_32(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.$t = i;
        this.l7 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
        this.l3 = obj5;
        this.l4 = obj6;
        this.l5 = obj7;
        this.l6 = obj8;
    }
}
