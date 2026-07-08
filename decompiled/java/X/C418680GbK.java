package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0GbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418680GbK {
    public static void LIZ(View view, float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f, f2);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
