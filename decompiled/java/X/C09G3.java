package X;

import android.util.Log;

/* JADX INFO: renamed from: X.09G3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09G3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Nows-");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str, String str2) {
        String strLIZJ = LIZJ(str);
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(3, strLIZJ, str2);
        }
    }

    public static void LIZIZ(String str, Throwable th) {
        String strLIZJ = LIZJ("NowPostCoverAssem");
        if (C2344809Gs.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(Log.getStackTraceString(th));
            C2344809Gs.LIZLLL(6, strLIZJ, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZLLL(String str, String str2) {
        String strLIZJ = LIZJ(str);
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, strLIZJ, str2);
        }
    }
}
