package Y;

import X.C1602160rnK;
import X.C1619980sG4;
import X.C418580GbA;
import X.C423150GiX;
import X.C435190H4r;
import X.C435270H4z;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.story.feed.common.sub.abroll.StoryAbRollComponent;

/* JADX INFO: loaded from: classes7.dex */
public class ALAdapterS1S0210000_6 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (5 - this.$t != 0) {
            super.onAnimationEnd(animator, z);
        } else {
            onAnimationEnd$0(this, animator, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
            case 3:
                onAnimationStart$2(this, animator);
                break;
            case 4:
                onAnimationStart$3(this, animator);
                break;
            case 5:
                onAnimationStart$4(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        super.onAnimationCancel(animator);
        if (!aLAdapterS1S0210000_6.z2) {
            C786410Ut5.LLF(4, (ViewOnAttachStateChangeListenerC20604515jv) aLAdapterS1S0210000_6.l0);
            C786410Ut5.LL(4, (ConstraintLayout) aLAdapterS1S0210000_6.l1);
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) aLAdapterS1S0210000_6.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.setTranslationY(0.0f);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        super.onAnimationEnd(animator);
        if (!aLAdapterS1S0210000_6.z2) {
            C786410Ut5.LLF(4, (ViewOnAttachStateChangeListenerC20604515jv) aLAdapterS1S0210000_6.l0);
            C786410Ut5.LL(4, (ConstraintLayout) aLAdapterS1S0210000_6.l1);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        View view;
        super.onAnimationEnd(animator);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) aLAdapterS1S0210000_6.l0, (Property<View, Float>) View.SCALE_X, 0.6f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(500L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        if (aLAdapterS1S0210000_6.z2 && (view = (View) aLAdapterS1S0210000_6.l0) != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS106S0100000_6((StoryAbRollComponent) aLAdapterS1S0210000_6.l1, 115), 2150L);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        super.onAnimationEnd(animator);
        if (!aLAdapterS1S0210000_6.z2) {
            C418580GbA c418580GbA = (C418580GbA) aLAdapterS1S0210000_6.l0;
            int visibility = c418580GbA.getVisibility();
            c418580GbA.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c418580GbA);
            ((C423150GiX) aLAdapterS1S0210000_6.l1).getClass();
            ((C423150GiX) aLAdapterS1S0210000_6.l1).onDestroy();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        if (!aLAdapterS1S0210000_6.z2) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS1S0210000_6.l0);
            ((C435190H4r) aLAdapterS1S0210000_6.l1).onDestroy();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        if (!aLAdapterS1S0210000_6.z2) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS1S0210000_6.l0);
            ((C435270H4z) aLAdapterS1S0210000_6.l1).onDestroy();
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        if (aLAdapterS1S0210000_6.z2) {
            AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) aLAdapterS1S0210000_6.l1;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(4, (View) aLAdapterS1S0210000_6.l0);
        AnimatorListenerAdapter animatorListenerAdapter2 = (AnimatorListenerAdapter) aLAdapterS1S0210000_6.l1;
        if (animatorListenerAdapter2 != null) {
            animatorListenerAdapter2.onAnimationEnd(animator);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        super.onAnimationStart(animator);
        if (aLAdapterS1S0210000_6.z2) {
            C786410Ut5.LLF(0, (ViewOnAttachStateChangeListenerC20604515jv) aLAdapterS1S0210000_6.l0);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        super.onAnimationStart(animator);
        if (aLAdapterS1S0210000_6.z2) {
            ((C423150GiX) aLAdapterS1S0210000_6.l1).getClass();
            C418580GbA c418580GbA = (C418580GbA) aLAdapterS1S0210000_6.l0;
            int visibility = c418580GbA.getVisibility();
            c418580GbA.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c418580GbA);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        super.onAnimationStart(animator);
        if (aLAdapterS1S0210000_6.z2) {
            C786410Ut5.LJLLLLLL(0, (View) aLAdapterS1S0210000_6.l0);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        super.onAnimationStart(animator);
        if (aLAdapterS1S0210000_6.z2) {
            C786410Ut5.LJLLLLLL(0, (View) aLAdapterS1S0210000_6.l0);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator) {
        if (!aLAdapterS1S0210000_6.z2) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS1S0210000_6.l0);
        AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) aLAdapterS1S0210000_6.l1;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0210000_6 aLAdapterS1S0210000_6, Animator animator, boolean z) {
        if (aLAdapterS1S0210000_6.z2) {
            AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) aLAdapterS1S0210000_6.l1;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(4, (View) aLAdapterS1S0210000_6.l0);
        AnimatorListenerAdapter animatorListenerAdapter2 = (AnimatorListenerAdapter) aLAdapterS1S0210000_6.l1;
        if (animatorListenerAdapter2 != null) {
            animatorListenerAdapter2.onAnimationEnd(animator);
        }
    }

    public ALAdapterS1S0210000_6(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
