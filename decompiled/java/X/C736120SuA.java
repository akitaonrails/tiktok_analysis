package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0SuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736120SuA {
    public static final C736120SuA LIZ = new C736120SuA();

    public static EnumC736040Su2 LIZ(float f, int i, Context context) {
        if (i <= 0 && context != null) {
            i = C0FV2.LIZIZ(context);
        }
        float f2 = C0A0M.LIZ;
        if (f2 <= 0.0f || f2 > 0.5f) {
            f2 = 0.25f;
        }
        float f3 = i;
        float f4 = (1 - f2) * f3;
        double d = f2 * f3;
        double d2 = f;
        if (0.0d <= d2 && d2 <= d) {
            return EnumC736040Su2.LEFT_HOT_ZONE;
        }
        if (f >= f4 && f <= f3) {
            return EnumC736040Su2.RIGHT_HOT_ZONE;
        }
        return EnumC736040Su2.INVALID_ZONE;
    }
}
