package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.19RN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RN {
    public static boolean LJ(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static ColorStateList LIZ(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListLIZIZ;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (colorStateListLIZIZ = C838410Wul.LIZIZ(resourceId, context)) != null) {
            return colorStateListLIZIZ;
        }
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList LIZIZ(Context context, C21411918qr c21411918qr, int i) {
        int iLJIIIIZZ;
        ColorStateList colorStateListLIZIZ;
        if (c21411918qr.LJIIJJI(i) && (iLJIIIIZZ = c21411918qr.LJIIIIZZ(i, 0)) != 0 && (colorStateListLIZIZ = C838410Wul.LIZIZ(iLJIIIIZZ, context)) != null) {
            return colorStateListLIZIZ;
        }
        return c21411918qr.LIZIZ(i);
    }

    public static Drawable LIZLLL(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableLIZ;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (drawableLIZ = C14MI.LIZ(context, resourceId)) != null) {
            return drawableLIZ;
        }
        return typedArray.getDrawable(i);
    }

    public static int LIZJ(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
            typedArrayObtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }
}
