package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0EZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366700EZg {
    public static int LIZ(double d) {
        return LIZIZ(d, C0CHQ.LIZ);
    }

    public static int LIZIZ(double d, Context context) {
        if (context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + 0.5d);
        }
        return 0;
    }
}
