package X;

import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0iZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247760iZi {
    public static final C1247760iZi LIZ = new C1247760iZi();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r1 = X.C0XQ7.LJFF()
            r0 = 0
            if (r1 == 0) goto L36
            X.0XPy r1 = (X.AbstractC848400XPy) r1
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            if (r1 == 0) goto L13
            java.lang.String r0 = r1.getNickname()
        L13:
            boolean r0 = X.C736460Sui.LIZIZ(r0)
            r3 = 1
            if (r0 == 0) goto L34
            if (r1 == 0) goto L38
            int r0 = r1.getNickNameModifyTs()
            if (r0 <= 0) goto L34
            r2 = 1
        L23:
            if (r1 == 0) goto L31
            java.util.List<java.lang.String> r1 = r1.boldFields
            if (r1 == 0) goto L31
            java.lang.String r0 = "nickname"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L33
        L31:
            if (r2 == 0) goto L38
        L33:
            return r3
        L34:
            r2 = 0
            goto L23
        L36:
            r1 = r0
            goto L13
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1247760iZi.LIZJ():boolean");
    }

    public static String LIZIZ(String str, String str2) {
        if (str == null || (u.LJJIIJZLJL(str, "+", false) && (str = a0.LJLIIIL(str.substring(1)).toString()) == null)) {
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = str;
        }
        if (!C1EDI.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("+ ");
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str2;
    }

    public static final Object LIZ(int i, Object obj, Object[] objArr) {
        Object obj2;
        if (objArr != null && i >= 0 && i < objArr.length && (obj2 = objArr[i]) != null) {
            return obj2;
        }
        return obj;
    }
}
