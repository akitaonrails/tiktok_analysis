package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1BlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214151BlF extends AbstractC2214121BlC {
    public static int LJI(Context context, Context context2) throws Throwable {
        boolean z;
        if (context == null) {
            context = context2;
        }
        int i = 0;
        if (context.getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = C08ZD.LIZIZ;
        if (i2 <= 0) {
            C08ZD.LIZ(context);
            i2 = C08ZD.LIZIZ;
            if (i2 <= 0) {
                i2 = 0;
            }
        }
        int iLJII = LJII(i2, context);
        int i3 = C08ZD.LIZ;
        if (i3 <= 0) {
            C08ZD.LIZ(context);
            int i4 = C08ZD.LIZ;
            if (i4 > 0) {
                i = i4;
            }
            i3 = i;
        }
        int iLJII2 = LJII(i3, context);
        if (z) {
            return Math.min(iLJII, iLJII2);
        }
        return Math.max(iLJII, iLJII2);
    }

    public static int LJII(double d, Context context) {
        return (int) ((d / ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
    }
}
