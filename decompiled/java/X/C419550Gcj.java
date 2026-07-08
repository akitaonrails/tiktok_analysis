package X;

import Y.AAListenerS317S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0Gcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419550Gcj {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZ(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(C1619980sG4.LJ());
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", 2.0f, 0.7777778f).setDuration(350L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", 2.0f, 0.7777778f).setDuration(350L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "scaleX", 0.7777778f, 1.2222222f).setDuration(120L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleY", 0.7777778f, 1.2222222f).setDuration(120L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleX", 1.2222222f, 1.0f).setDuration(120L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "scaleY", 1.2222222f, 1.0f).setDuration(120L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(C1619980sG4.LJ());
        animatorSet2.play(duration).before(duration3);
        animatorSet2.play(duration3).before(duration5);
        animatorSet2.play(duration2).before(duration4);
        animatorSet2.play(duration4).before(duration6);
        animatorSet2.play(duration).with(duration2);
        AnimatorSet.Builder builderPlay = animatorSet.play(animatorSet2);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(150L);
        duration7.setInterpolator(C1619980sG4.LJ());
        AnimatorSet.Builder builderWith = builderPlay.with(duration7);
        Float fValueOf = Float.valueOf(-54.0f);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(view, "translationY", C418440Gaw.LIZIZ(Float.valueOf(-46.0f)), C418440Gaw.LIZIZ(fValueOf)).setDuration(150L);
        ObjectAnimator duration9 = ObjectAnimator.ofFloat(view, "translationY", C418440Gaw.LIZIZ(fValueOf), C418440Gaw.LIZIZ(Float.valueOf(0.0f))).setDuration(200L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(C1619980sG4.LJ());
        animatorSet3.play(duration8).before(duration9);
        builderWith.with(animatorSet3);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0Gck
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        animatorSet.addListener(new AAListenerS317S0100000_6(view, 69));
        return animatorSet;
    }
}
