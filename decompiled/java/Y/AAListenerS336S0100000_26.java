package Y;

import X.C1709880ub4;
import X.C1710190ubZ;
import X.C1738480vLC;
import X.C1762730vyJ;
import X.C337180DJs;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.Animator;
import android.animation.ObjectAnimator;

/* JADX INFO: loaded from: classes27.dex */
public class AAListenerS336S0100000_26 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public AAListenerS336S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
        ((C1738480vLC) aAListenerS336S0100000_26.l0).getDraftSubmissionItemList().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        C786410Ut5.d5(((C1738480vLC) aAListenerS336S0100000_26.l0).getDraftSubmissionItemList(), 1.0f);
        C786410Ut5.LJZ(0, ((C1738480vLC) aAListenerS336S0100000_26.l0).getExpandingListContainer());
        ((C1738480vLC) aAListenerS336S0100000_26.l0).getDraftSubmissionItemList().requestLayout();
    }

    public static final void onAnimationEnd$1(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
        ObjectAnimator objectAnimator = ((C1762730vyJ) aAListenerS336S0100000_26.l0).LLILZ;
        if (objectAnimator != null) {
            C786410Ut5.Pd(objectAnimator);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
        C1710190ubZ needSelectedOtherBlockFromXml = ((C1709880ub4) aAListenerS336S0100000_26.l0).getNeedSelectedOtherBlockFromXml();
        if (needSelectedOtherBlockFromXml != null) {
            C337180DJs.LIZ(needSelectedOtherBlockFromXml);
        }
    }

    public static final void onAnimationStart$0(AAListenerS336S0100000_26 aAListenerS336S0100000_26, Animator animator) {
        ((C1738480vLC) aAListenerS336S0100000_26.l0).getDraftSubmissionItemList().getLayoutParams().height = 0;
        C786410Ut5.d5(((C1738480vLC) aAListenerS336S0100000_26.l0).getDraftSubmissionItemList(), 0.0f);
        C786410Ut5.LJZ(0, ((C1738480vLC) aAListenerS336S0100000_26.l0).getExpandingListContainer());
        C786410Ut5.LLIZLLLIL(((C1738480vLC) aAListenerS336S0100000_26.l0).getDraftSubmissionItemList(), 8);
        ((C1738480vLC) aAListenerS336S0100000_26.l0).getDraftSubmissionItemList().requestLayout();
    }
}
