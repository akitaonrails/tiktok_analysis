package X;

import Y.AAListenerS327S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0c22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996240c22 {
    public static final float LIZ = C418440Gaw.LIZIZ(-20);

    public static Animator LIZ() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(500L);
        return valueAnimatorOfFloat;
    }

    static {
        C418440Gaw.LIZIZ(-16);
    }

    public static Animator LIZJ(View view, HorizontalScrollView horizontalScrollView) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -(ScreenUtils.getScreenWidth(view.getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)) * 2)));
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(horizontalScrollView, "scrollX", 0, horizontalScrollView.getChildAt(0).getWidth() - horizontalScrollView.getWidth());
        objectAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimatorOfInt.setDuration(500L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        return animatorSet;
    }

    public static Animator LIZLLL(View view, HorizontalScrollView horizontalScrollView) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", -(ScreenUtils.getScreenWidth(view.getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)) * 2)), 0.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(horizontalScrollView, "scrollX", horizontalScrollView.getChildAt(0).getWidth() - horizontalScrollView.getWidth(), 0);
        objectAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimatorOfInt.setDuration(500L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        return animatorSet;
    }

    public static Animator LIZIZ(View view, View view2, View view3) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "translationY", 0.0f, LIZ);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat2.setDuration(150L);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat3.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat4.setDuration(150L);
        objectAnimatorOfFloat4.addListener(new AAListenerS327S0100000_16(view3, 2));
        animatorSet.playTogether(animatorSet2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        return animatorSet;
    }
}
