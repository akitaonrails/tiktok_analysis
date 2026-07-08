package X;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: X.0GWI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWI implements TimeInterpolator {
    public static final C0GWI LIZ = new C0GWI();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 0.7f) {
            return 1.0f;
        }
        return (((float) Math.cos(((double) ((f / 0.7f) + 1.0f)) * 3.141592653589793d)) / 2.0f) + 0.5f;
    }
}
