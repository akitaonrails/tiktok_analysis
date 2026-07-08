package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: X.03SI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SI {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }
}
