package X;

import Y.ALAdapterS15S0100000_19;
import Y.AUListenerS71S0101000_19;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0hgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213440hgM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams.gravity = 17;
        C786410Ut5.W5(view, layoutParams);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new InterpolatorC1088790eRJ(0.25d, 0.1d, 0.25d, 1.0d));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS71S0101000_19((int) C11VU.LIZIZ(32.0f, context), view, 0));
        valueAnimatorOfFloat.addListener(new ALAdapterS15S0100000_19(view, 2));
        valueAnimatorOfFloat.start();
    }
}
