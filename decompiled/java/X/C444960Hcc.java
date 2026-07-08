package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Hcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444960Hcc {
    public static boolean LIZIZ() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static String LIZ(Context context) {
        if (LIZJ(context)) {
            return "\u200f";
        }
        return "\u200e";
    }

    public static boolean LIZJ(Context context) {
        if (context == null || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\u2068");
        sbLIZ.append(str);
        sbLIZ.append("\u2069");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
