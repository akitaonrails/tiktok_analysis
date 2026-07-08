package X;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0TFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743890TFz {
    public static ValueAnimator LIZ(float f, float f2, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return valueAnimatorOfFloat;
    }
}
