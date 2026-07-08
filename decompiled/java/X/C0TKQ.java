package X;

import Y.ALAdapterS9S0200000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKQ {
    public static AnimatorSet LIZ(View view, boolean z, Function0 function0, Function0 function02) {
        float f;
        float f2;
        float f3;
        float[] fArr = new float[2];
        float f4 = 0.5f;
        float f5 = 1.0f;
        if (z) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        float f6 = 0.8f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.8f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        objectAnimatorOfFloat.setDuration(450L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        float[] fArr2 = new float[2];
        if (!z) {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (z) {
            f6 = 1.0f;
        }
        fArr2[1] = f6;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fArr2);
        objectAnimatorOfFloat2.setDuration(450L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
        float[] fArr3 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr3[0] = f3;
        if (!z) {
            f5 = 0.0f;
        }
        fArr3[1] = f5;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", fArr3);
        objectAnimatorOfFloat3.setDuration(450L);
        objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LIZLLL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.addListener(new ALAdapterS9S0200000_12(function0, function02, 4));
        return animatorSet;
    }
}
