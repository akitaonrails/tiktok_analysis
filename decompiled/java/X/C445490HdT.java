package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0HdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445490HdT {
    public static final double LIZ(Context context) {
        C1546210qL5.LIZ.getClass();
        return Integer.valueOf(C1546210qL5.LJII(context)).doubleValue() / ((double) context.getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final double LIZIZ(android.app.Activity r4, java.lang.Number r5) {
        /*
            android.view.Window r0 = r4.getWindow()     // Catch: java.lang.NullPointerException -> L1b
            if (r0 == 0) goto L1f
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.NullPointerException -> L1b
            r1.<init>()     // Catch: java.lang.NullPointerException -> L1b
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.NullPointerException -> L1b
            r0.getWindowVisibleDisplayFrame(r1)     // Catch: java.lang.NullPointerException -> L1b
            int r0 = r1.bottom     // Catch: java.lang.NullPointerException -> L1b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NullPointerException -> L1b
            if (r0 == 0) goto L1f
            goto L2a
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1f:
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            goto L2e
        L2a:
            int r0 = r0.intValue()
        L2e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            double r2 = r0.doubleValue()
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r0 = (double) r0
            double r2 = r2 / r0
            double r0 = r5.doubleValue()
            double r2 = r2 - r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C445490HdT.LIZIZ(android.app.Activity, java.lang.Number):double");
    }
}
