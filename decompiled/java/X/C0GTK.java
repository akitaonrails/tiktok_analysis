package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: X.0GTK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTK {
    public static DisplayMetrics LIZ;

    public static final float LIZ(float f, Context context) {
        if (context != null) {
            if (LIZ == null) {
                LIZ = context.getResources().getDisplayMetrics();
            }
            float f2 = 3.0f;
            if (LIZ.density < 3.0f) {
                f2 = 2.0f;
            }
            return (f * f2) + 0.5f;
        }
        return f;
    }
}
