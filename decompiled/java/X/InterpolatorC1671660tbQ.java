package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0tbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class InterpolatorC1671660tbQ implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin((((double) (f - (2.3f / 4))) * 6.283185307179586d) / ((double) 2.3f))) + ((double) 1));
    }
}
