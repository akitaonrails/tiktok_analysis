package X;

import Y.ALAdapterS9S0100000_12;
import Y.AUListenerS254S0100000_4;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740320T2g {
    public static final ValueAnimator LIZ(View view, float f, float f2, long j, Function0 function0) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS254S0100000_4(view, 19));
        valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(function0, 46));
        return valueAnimatorOfFloat;
    }
}
