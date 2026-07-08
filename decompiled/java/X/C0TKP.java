package X;

import Y.ALAdapterS4S0110000_12;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TKP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKP {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZ(C21592519et c21592519et, Function0 function0, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c21592519et, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new ALAdapterS4S0110000_12(function0, 0));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }
}
