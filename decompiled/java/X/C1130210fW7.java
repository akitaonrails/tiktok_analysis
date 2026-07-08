package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1130210fW7 {
    public final View LIZ;
    public final Function0<Unit> LIZIZ;
    public final long LIZJ = 200;
    public final long LIZLLL = 600;
    public int LJ;

    public final void LIZ() {
        this.LIZ.measure(View.MeasureSpec.makeMeasureSpec(C497740JfY.LJIIZILJ(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.LIZ.getMeasuredHeight();
        this.LJ = measuredHeight;
        if (measuredHeight <= 0) {
            C500260Jjc.LLFFF(this.LIZ);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.LIZJ);
        valueAnimatorOfFloat.setStartDelay(this.LIZLLL);
        valueAnimatorOfFloat.setInterpolator(new C1125420fOO());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 59));
        valueAnimatorOfFloat.start();
    }

    public C1130210fW7(View view, Function0 function0) {
        this.LIZ = view;
        this.LIZIZ = function0;
    }
}
