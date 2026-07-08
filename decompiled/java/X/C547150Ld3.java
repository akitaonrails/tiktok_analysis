package X;

/* JADX INFO: renamed from: X.0Ld3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547150Ld3 {
    public static final String LIZIZ(Throwable th) {
        if (th == null) {
            return "";
        }
        return C13LP.LJJLIIIJ(C13LQ.LJJLIIIJJIZ(5, th.getStackTrace()), "\n", null, null, 0, null, null, 62);
    }

    public static final String LIZ(String str, String str2, String str3) {
        if (str.length() >= 4) {
            str = str.substring(str.length() - 4);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("][");
        sbLIZ.append(str2);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('[');
            sbLIZ2.append(str3);
            sbLIZ2.append(']');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }
}
