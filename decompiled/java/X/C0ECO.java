package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0ECO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECO implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin((((double) (f - (4.0f / 4))) * 6.283185307179586d) / ((double) 4.0f))) + ((double) 1));
    }
}
