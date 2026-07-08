package X;

import Y.AAListenerS260S0200000_5;
import Y.AUListenerS0S0300002_5;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS29S0100001_5;

/* JADX INFO: renamed from: X.0Efz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370610Efz {
    public static final /* synthetic */ int LIZ = 0;

    public static ValueAnimator LIZ(C1322110kVd c1322110kVd, float f, float f2, long j, Interpolator interpolator, Function1 function1, Function0 function0, int i) {
        ValueAnimator valueAnimatorOfFloat;
        Function1 function12 = function1;
        Interpolator accelerateInterpolator = interpolator;
        if ((i & 16) != 0) {
            j = 0;
        }
        if ((i & 32) != 0) {
            accelerateInterpolator = new AccelerateInterpolator(2.0f);
        }
        Function0 function02 = null;
        if ((i & 64) != 0) {
            function12 = null;
        }
        if ((i & 128) == 0) {
            function02 = function0;
        }
        if (f < f2) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0300002_5(valueAnimatorOfFloat, f, f2, c1322110kVd, function12, 0));
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0300002_5(valueAnimatorOfFloat, f, f2, c1322110kVd, function12, 1));
        }
        valueAnimatorOfFloat.setInterpolator(accelerateInterpolator);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addListener(new AAListenerS260S0200000_5(new AwS29S0100001_5(c1322110kVd, f, 4), function02, 2));
        return valueAnimatorOfFloat;
    }
}
