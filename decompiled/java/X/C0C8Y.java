package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0C8Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8Y {
    public static String LIZ(String str) {
        String str2 = (String) C0C8W.LIZ.getValue();
        String str3 = (String) C0C8X.LIZ.getValue();
        if (str2.length() != 0 && str3.length() != 0) {
            if (u.LJJIIJZLJL(str, "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('/');
                sbLIZ.append(str3);
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append('/');
            sbLIZ2.append(str3);
            sbLIZ2.append('/');
            sbLIZ2.append(str);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return null;
    }
}
