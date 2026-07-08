package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* JADX INFO: renamed from: X.0DJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJ0 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, Context context) {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        int[] iArr = {i};
        if (context == null || (theme = context.getTheme()) == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(iArr)) == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }
}
