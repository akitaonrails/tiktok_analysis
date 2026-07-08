package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.0Gaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418440Gaw {
    public static final int LIZ(Number number) {
        return C814420VxA.LIZIZ(LIZIZ(number));
    }

    public static final float LIZIZ(Number number) {
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static final int LIZJ(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public static final int LIZLLL(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    public static final float LJ(Number number) {
        return TypedValue.applyDimension(2, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static final int LJFF(float f, Context context) {
        return C814420VxA.LIZIZ(f / context.getResources().getDisplayMetrics().density);
    }
}
