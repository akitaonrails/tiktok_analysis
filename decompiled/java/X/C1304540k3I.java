package X;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0k3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304540k3I {
    public static Pair LIZ(Context context) {
        int i;
        DisplayMetrics displayMetricsLIZ = C14KZ.LIZ(context);
        if (displayMetricsLIZ != null && (i = displayMetricsLIZ.widthPixels) > 0 && displayMetricsLIZ.heightPixels > 0) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(displayMetricsLIZ.heightPixels));
        }
        DisplayMetrics displayMetrics = C786410Ut5.N3(context).getResources().getDisplayMetrics();
        return new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }
}
