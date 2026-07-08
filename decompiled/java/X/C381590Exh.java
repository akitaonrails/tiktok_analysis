package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0Exh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381590Exh {
    public static final void LIZ(View view) {
        float f = 2;
        view.setPivotX(view.getWidth() / f);
        view.setPivotY(view.getHeight() / f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        animatorSet.start();
    }
}
