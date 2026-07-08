package X;

import com.lynx.tasm.utils.DisplayMetricsHolder;

/* JADX INFO: renamed from: X.0kDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311130kDv {
    public static float LIZ(double d) {
        return LIZIZ((float) d, 0.0f);
    }

    public static float LIZJ(float f) {
        return f / DisplayMetricsHolder.LIZIZ().density;
    }

    public static float LIZIZ(float f, float f2) {
        if (f2 <= 0.0f) {
            f2 = DisplayMetricsHolder.LIZIZ().density;
        }
        return f * f2;
    }
}
