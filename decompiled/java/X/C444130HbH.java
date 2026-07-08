package X;

import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0HbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444130HbH {
    public static void LIZ(float f, View view, boolean z) {
        float f2;
        float[] fArr = new float[2];
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        fArr[0] = f2;
        if (!z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.start();
    }
}
