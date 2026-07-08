package X;

import Y.AUListenerS1S0200001_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.19kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21629119kn {
    public Animator LIZ;
    public C466310IQj LIZIZ;
    public Animator LIZJ;
    public RunnableC514801zW LIZLLL;

    public final void LIZIZ() {
        boolean z = (this.LIZ == null && this.LIZJ == null && this.LIZIZ == null) ? false : true;
        RunnableC514801zW runnableC514801zW = this.LIZLLL;
        if (runnableC514801zW != null) {
            C473410IhP.LIZ().removeCallbacks(runnableC514801zW);
        }
        this.LIZLLL = null;
        Animator animator = this.LIZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LIZ = null;
        Animator animator2 = this.LIZJ;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LIZJ = null;
        C466310IQj c466310IQj = this.LIZIZ;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LIZIZ = null;
        if (z) {
            C20441214yg.LJIIIZ("ttlive_preview_Highlight_Anim", "releaseAnim");
        }
    }

    public final void LIZ(final float f, final View view, final View view2, final AbstractC21629819ku abstractC21629819ku) {
        if (C0BTA.LIZ()) {
            abstractC21629819ku.LIZIZ();
            if (view2 != null) {
                C339190DRl.LIZIZ(view2);
            }
            if (view != null) {
                C786410Ut5.ed(view, 0.0f);
            }
            if (view2 != null) {
                C786410Ut5.ed(view2, 0.0f);
            }
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
            abstractC21629819ku.LIZ();
            return;
        }
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -f);
        valueAnimatorOfFloat.setDuration(371L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS1S0200001_6(view, view2, f, 0));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.19kr
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                AbstractC21629819ku abstractC21629819ku2 = abstractC21629819ku;
                if (abstractC21629819ku2 != null) {
                    abstractC21629819ku2.LIZIZ();
                }
                View view3 = view;
                if (view3 != null) {
                    C786410Ut5.ed(view3, f);
                }
                C339190DRl.LIZLLL(view);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2, boolean z) {
                View view3 = view;
                if (view3 != null) {
                    C786410Ut5.ed(view3, 0.0f);
                }
                C339190DRl.LIZIZ(view2);
                View view4 = view2;
                if (view4 != null) {
                    C786410Ut5.ed(view4, 0.0f);
                }
                AbstractC21629819ku abstractC21629819ku2 = abstractC21629819ku;
                if (abstractC21629819ku2 != null) {
                    abstractC21629819ku2.LIZ();
                }
            }
        });
        valueAnimatorOfFloat.start();
        this.LIZJ = valueAnimatorOfFloat;
    }
}
