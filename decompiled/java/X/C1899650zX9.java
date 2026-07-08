package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0zX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899650zX9 {
    public final C1899490zWt LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final Integer LIZLLL;
    public boolean LJ = true;

    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZIZ, "scaleX", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LIZIZ, "scaleY", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(250L);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(200L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.addListener(new C1898900zVw() { // from class: X.0zX8
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C786410Ut5.LJLLLLLL(8, this.LL.LIZIZ);
                this.LL.LIZ.setCanDrag(true);
            }
        });
        animatorSet.start();
    }

    public C1899650zX9(C1899490zWt c1899490zWt, View view, View view2, Integer num) {
        this.LIZ = c1899490zWt;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = num;
    }
}
