package X;

import android.content.Context;
import android.util.Size;

/* JADX INFO: renamed from: X.09Rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2372509Rj {
    public static final /* synthetic */ int LIZ = 0;

    public static final Size LIZ(Context context, int i, int i2, int i3, double d) {
        int iMax = Math.max(1, i);
        int iLJIIJ = ((C12ES.LJIIJ(context) - ((iMax - 1) * i2)) - (i3 * 2)) / iMax;
        return new Size(iLJIIJ, (int) (((double) iLJIIJ) * d));
    }
}
