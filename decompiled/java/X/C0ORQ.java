package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0ORQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORQ implements Interpolator {
    public final float LIZ;

    public C0ORQ(float f) {
        this.LIZ = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double dPow = Math.pow(2.0d, (-10) * f);
        float f2 = this.LIZ;
        return (float) ((dPow * Math.sin((((double) (f - (f2 / 4))) * 6.283185307179586d) / ((double) f2))) + ((double) 1));
    }
}
