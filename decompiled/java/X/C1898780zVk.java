package X;

import Y.ARunnableS128S0100000_28;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0zVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898780zVk {
    public final C1898700zVc LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final int LIZLLL;
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
        animatorSet.addListener(new C1898900zVw() { // from class: X.0zVl
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C786410Ut5.LJLLLLLL(8, this.LL.LIZIZ);
                this.LL.LIZ.setCanDrag(true);
            }
        });
        animatorSet.start();
    }

    public final void LIZIZ() {
        this.LIZ.setCanDrag(false);
        View view = this.LIZIZ;
        view.setPivotX(0.0f);
        view.setPivotY(this.LIZJ.getHeight() / 2.0f);
        C786410Ut5.LJLLLLLL(0, view);
        this.LJ = false;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZIZ, "scaleX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LIZIZ, "scaleY", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(250L);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(200L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.addListener(new C1898900zVw() { // from class: X.0zVm
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1898780zVk c1898780zVk = this.LL;
                HandlerHook.viewPostDelay(c1898780zVk.LIZIZ, new ARunnableS128S0100000_28(c1898780zVk, 82), ((long) c1898780zVk.LIZLLL) * 1000);
            }
        });
        animatorSet.start();
    }

    public C1898780zVk(C1898700zVc c1898700zVc, View view, View view2, int i) {
        this.LIZ = c1898700zVc;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = i;
    }
}
