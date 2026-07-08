package X;

import android.content.Context;

/* JADX INFO: renamed from: X.00Ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C079800Ro {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, String str) {
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return "";
        }
        int iN3 = C786410Ut5.n3(context.getResources(), str, "string", context.getPackageName());
        if (iN3 != 0) {
            return context.getString(iN3);
        }
        return str;
    }
}
