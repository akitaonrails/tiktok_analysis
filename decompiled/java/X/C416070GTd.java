package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0GTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416070GTd {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(double d, Context context) {
        if (context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
        }
        return 0;
    }
}
