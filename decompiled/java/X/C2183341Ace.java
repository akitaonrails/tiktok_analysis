package X;

import android.util.Log;

/* JADX INFO: renamed from: X.1Ace, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183341Ace {
    public static String LIZ = "VESDK-";
    public static byte LIZIZ = 7;
    public static volatile InterfaceC1305670k57 LIZJ = new C2183351Acf();

    public static void LIZ(String str, String str2) {
        if ((LIZIZ & 8) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            LIZJ.LIZ((byte) 8, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            LIZJ.LIZ((byte) 1, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LIZLLL(String str, String str2) {
        if ((LIZIZ & 4) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            LIZJ.LIZ((byte) 4, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LJ(String str, String str2) {
        if ((LIZIZ & 2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            LIZJ.LIZ((byte) 2, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1305670k57 interfaceC1305670k57 = LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("\n***StackTrace***\n");
            sbLIZ2.append(Log.getStackTraceString(th));
            interfaceC1305670k57.LIZ((byte) 1, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LJFF(String str, String str2, Throwable th) {
        if ((LIZIZ & 2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1305670k57 interfaceC1305670k57 = LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("\n***StackTrace***\n");
            sbLIZ2.append(Log.getStackTraceString(th));
            interfaceC1305670k57.LIZ((byte) 2, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
