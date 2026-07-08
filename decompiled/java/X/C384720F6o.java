package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0F6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384720F6o {
    public static final int LIZ(double d, Context context) {
        if (context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
        }
        return 0;
    }
}
