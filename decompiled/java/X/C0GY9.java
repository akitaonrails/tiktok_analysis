package X;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: X.0GY9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GY9 {
    public static Interpolator LIZJ(Path path) {
        return new PathInterpolator(path);
    }

    public static Interpolator LIZ(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static Interpolator LIZIZ(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }
}
