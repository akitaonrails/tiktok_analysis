package X;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.195G, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195G implements Interpolator {
    public final Interpolator LIZ;

    public C195G() {
        this(new LinearInterpolator());
    }

    public C195G(Interpolator interpolator) {
        this.LIZ = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.LIZ.getInterpolation(f);
    }
}
