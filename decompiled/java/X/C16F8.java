package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* JADX INFO: renamed from: X.16F8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16F8 {
    public static ColorStateList LIZ(Context context, TypedArray typedArray, int i) {
        if (typedArray == null || !typedArray.hasValue(i)) {
            return null;
        }
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            if (context == null) {
                return null;
            }
            return C838410Wul.LIZIZ(resourceId, context);
        }
        return typedArray.getColorStateList(i);
    }
}
