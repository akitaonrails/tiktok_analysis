package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Hs9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454590Hs9 {
    public static boolean LIZ(Context context) {
        if (context == null) {
            return false;
        }
        if (!C786410Ut5.t2(context.getResources().getConfiguration().locale).equals("ar") && context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
