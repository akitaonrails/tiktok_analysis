package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.19PZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PZ implements Interpolator {
    public final float LIZ;

    public C19PZ() {
        this.LIZ = 0.5f;
        this.LIZ = 4.0f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f != 0.0f && f != 1.0f) {
            double dPow = Math.pow(2.0d, (-10) * f);
            float f2 = this.LIZ;
            return (float) ((dPow * Math.sin(((((double) f) - (((double) f2) / 4.0d)) * 6.283185307179586d) / ((double) f2))) + ((double) 1));
        }
        return f;
    }
}
