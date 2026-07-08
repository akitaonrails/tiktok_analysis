package X;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: X.15Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20481315Ch implements TimeInterpolator {
    public final /* synthetic */ C20481415Ci LIZ;

    public C20481315Ch(C20481415Ci c20481415Ci) {
        this.LIZ = c20481415Ci;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fPow;
        double d = f;
        if (d < 0.7d) {
            fPow = f * ((float) Math.pow(0.7d, 3.0d));
            getClass();
        } else {
            fPow = (float) Math.pow(d, 4.0d);
            getClass();
        }
        return fPow * 90.0f;
    }
}
