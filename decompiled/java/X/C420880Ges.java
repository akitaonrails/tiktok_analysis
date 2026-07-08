package X;

import Y.ARunnableS5S0301000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Ges, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420880Ges {
    public AnimatorSet LIZ;

    public final void LIZ(final int i, final View view) {
        int i2;
        if (i % 2 == 0) {
            i2 = -8;
        } else {
            i2 = 8;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i2));
        C786410Ut5.ed(view, fLIZIZ);
        float f = -fLIZIZ;
        final AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorLIZIZ = LIZIZ(fLIZIZ, f, view);
        ObjectAnimator objectAnimatorLIZIZ2 = LIZIZ(f, fLIZIZ, view);
        animatorSet.play(objectAnimatorLIZIZ);
        animatorSet.play(objectAnimatorLIZIZ2).after(objectAnimatorLIZIZ);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0Get
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                View view2 = view;
                C420880Ges c420880Ges = this;
                HandlerHook.viewPostDelay(view2, new ARunnableS5S0301000_6(i, animatorSet, view2, c420880Ges, 1), 100L);
            }
        });
        this.LIZ = animatorSet;
    }

    public static ObjectAnimator LIZIZ(float f, float f2, View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        return objectAnimatorOfFloat;
    }
}
