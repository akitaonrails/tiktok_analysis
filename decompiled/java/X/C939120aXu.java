package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0aXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939120aXu {
    public static boolean LIZIZ(String str) {
        String strValueOf = String.valueOf(4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\"scene\":");
        sbLIZ.append(strValueOf);
        if (!a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\"scene\": ");
            sbLIZ2.append(strValueOf);
            if (!a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("\\\"scene\\\":");
                sbLIZ3.append(strValueOf);
                if (!a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ3), false)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("\\\"scene\\\": ");
                    sbLIZ4.append(strValueOf);
                    if (!a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ4), false)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append(str2);
        sbLIZ.append('\"');
        if (!a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\\\"");
            sbLIZ2.append(str2);
            sbLIZ2.append("\\\"");
            if (!a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                return false;
            }
        }
        return true;
    }
}
