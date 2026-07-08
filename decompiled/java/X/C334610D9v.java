package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0D9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334610D9v {
    public static String LIZ(String str) {
        String str2;
        Map<String, C0D4U> map = C2273421Dye.LIZ;
        C0D4U c0d4uLIZ = C2273421Dye.LIZ(C2273421Dye.LIZLLL(str));
        if (c0d4uLIZ.LIZLLL) {
            str2 = " ";
        } else {
            str2 = "";
        }
        if (c0d4uLIZ.LIZJ == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("--");
            sbLIZ.append(str2);
            sbLIZ.append(c0d4uLIZ.LIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0d4uLIZ.LIZ);
        sbLIZ2.append(str2);
        sbLIZ2.append("--");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
