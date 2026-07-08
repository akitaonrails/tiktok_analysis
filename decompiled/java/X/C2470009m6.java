package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.09m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2470009m6 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str.length() != 8 && str.length() != 9) {
            if (str.length() == 6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        if (u.LJJIIJZLJL(str, "#", false)) {
            str = C13LN.LJLJLJ(1, str);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C13LN.LL(2, str));
        sbLIZ2.append(C13LN.LJLL(2, str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('#');
        sbLIZ3.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
