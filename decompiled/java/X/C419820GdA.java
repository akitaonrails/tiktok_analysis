package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0GdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419820GdA {
    public static void LIZ(TuxIconView tuxIconView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(700L);
        animatorSet.setInterpolator(new Interpolator() { // from class: X.0GdB
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin((((double) (f - (0.4f / 4))) * 6.283185307179586d) / ((double) 0.4f))) + ((double) 1));
            }
        });
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }
}
