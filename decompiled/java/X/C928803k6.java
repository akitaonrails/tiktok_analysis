package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.03k6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C928803k6 {
    public static String LIZ(String str, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
        if (!c1724150uy5.LJIIJJI) {
            return "";
        }
        String strLIZ = ((C931203kU) c1724150uy5.LIZ()).LIZ(str);
        if (strLIZ != null && strLIZ.contains("{the_field}") && strArr.length > 0) {
            return strLIZ.replace("{the_field}", ((C931203kU) c1724150uy5.LIZ()).LIZ(strArr[0]));
        }
        return strLIZ;
    }
}
