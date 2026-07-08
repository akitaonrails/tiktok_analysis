package X;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: X.08Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084208Em {
    public static int LIZ;

    public static int LIZ(Context context) {
        int dimensionPixelSize;
        Resources resources;
        int iN3;
        int i = LIZ;
        if (i != 0) {
            return i;
        }
        if (context != null && (iN3 = C786410Ut5.n3((resources = context.getResources()), "status_bar_height", "dimen", "android")) > 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(iN3);
        } else {
            dimensionPixelSize = 0;
        }
        LIZ = dimensionPixelSize;
        return dimensionPixelSize;
    }
}
