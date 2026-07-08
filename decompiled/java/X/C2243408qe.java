package X;

import java.io.File;
import java.security.MessageDigest;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2243408qe {
    public static final C2243408qe LIZ = new C2243408qe();

    public static File LIZJ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CREATION_PRELOAD_ASSET, "", true);
    }

    public static String LIZIZ(String str) {
        int iLJJJJ = a0.LJJJJ(str, '.', 0, 6);
        if (iLJJJJ < 0) {
            return "";
        }
        String strSubstring = str.substring(iLJJJJ);
        int length = strSubstring.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strSubstring.charAt(i);
            if (cCharAt == '?' || cCharAt == '#') {
                if (i > 0) {
                    return strSubstring.substring(0, i);
                }
                return strSubstring;
            }
        }
        return strSubstring;
    }

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ(str));
        sbLIZ.append(LIZIZ(str));
        return new C0VSJ(LIZJ(), C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
    }

    public static String LJ(String str) {
        return C13LQ.LJJIJIL(MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8)), "", AFwS231S0000000_3.get$arr$(13));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r21, java.lang.String r22, java.util.List r23, X.InterfaceC1364105Vn r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2243408qe.LIZ(java.lang.String, java.lang.String, java.util.List, X.05Vn, boolean):java.lang.Object");
    }
}
