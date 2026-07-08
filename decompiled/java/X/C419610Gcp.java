package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: X.0Gcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419610Gcp {
    public static final /* synthetic */ int LIZ = 0;

    public static AnimatorSet LIZ(View view) {
        float fLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        float fLIZIZ2 = (int) C497740JfY.LIZIZ(8.0f);
        float f = -fLIZIZ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.4f, 0.64f, 0.74f, 1.0f));
        objectAnimatorOfFloat.setDuration(250L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f, 0.0f);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.26f, 0.0f, 0.6f, 0.36f));
        objectAnimatorOfFloat.setDuration(250L);
        float f2 = -fLIZIZ2;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f2);
        objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.4f, 0.64f, 0.74f, 1.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f2, 0.0f);
        objectAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.26f, 0.0f, 0.6f, 0.36f));
        objectAnimatorOfFloat3.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        return animatorSet;
    }

    public static AnimatorSet LIZIZ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.08f);
        objectAnimatorOfFloat.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.08f);
        objectAnimatorOfFloat2.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
        objectAnimatorOfFloat3.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
        objectAnimatorOfFloat4.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        return animatorSet3;
    }
}
