package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.015P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015P {
    public static boolean LIZ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.equals(str, str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('.');
            sbLIZ.append(str2);
            if (!str.endsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                return false;
            }
        }
        return true;
    }
}
