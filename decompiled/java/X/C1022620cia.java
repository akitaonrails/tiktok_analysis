package X;

import android.util.Log;

/* JADX INFO: renamed from: X.0cia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022620cia {
    public static boolean LIZLLL() {
        return C1152810g6Z.LIZ() && C2344809Gs.LIZ;
    }

    public static void LJFF(String str) {
        if (str.length() > 4000) {
            int i = 0;
            while (i <= str.length() / 4000) {
                int i2 = i * 4000;
                i++;
                int length = i * 4000;
                if (length > str.length()) {
                    length = str.length();
                }
                str.substring(i2, length);
            }
        }
    }

    public static final void LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(']');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TTCommerce-");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJFF(strLIZIZ);
        if (LIZLLL()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TTCommerce-");
            sbLIZ3.append(str);
            C2344809Gs.LIZLLL(3, C2188811AlT.LIZIZ(sbLIZ3), strLIZIZ);
        }
    }

    public static final void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(']');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TTCommerce-");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJFF(strLIZIZ);
        if (LIZLLL()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TTCommerce-");
            sbLIZ3.append(str);
            C2344809Gs.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ3), strLIZIZ);
        }
    }

    public static final void LIZJ(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTCommerce-");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('[');
        sbLIZ2.append(C786410Ut5.u3().getName());
        sbLIZ2.append(']');
        sbLIZ2.append(th);
        LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        if (LIZLLL()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TTCommerce-");
            sbLIZ3.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append('[');
            sbLIZ4.append(C786410Ut5.u3().getName());
            sbLIZ4.append(']');
            sbLIZ4.append(Log.getStackTraceString(th));
            C2344809Gs.LIZLLL(6, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public static final void LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(']');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TTCommerce-");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJFF(strLIZIZ);
        if (LIZLLL()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TTCommerce-");
            sbLIZ3.append(str);
            C2344809Gs.LIZLLL(4, C2188811AlT.LIZIZ(sbLIZ3), strLIZIZ);
        }
    }
}
