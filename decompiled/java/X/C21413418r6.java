package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: renamed from: X.18r6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21413418r6 {
    public ValueAnimator LIZ;
    public final OverScroller LIZIZ;

    public C21413418r6(Context context) {
        this.LIZIZ = new OverScroller(context, new Interpolator() { // from class: X.18r7
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        });
    }
}
