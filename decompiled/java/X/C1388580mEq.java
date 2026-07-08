package X;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: renamed from: X.0mEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388580mEq {
    public static boolean LIZIZ(Context context) {
        if (context == null || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public static int LIZ(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
