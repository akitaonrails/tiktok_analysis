package X;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.0HCL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HCL {
    public static int LIZ(float f, Context context) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float LIZIZ(float f, Context context) {
        return f / context.getResources().getDisplayMetrics().density;
    }
}
