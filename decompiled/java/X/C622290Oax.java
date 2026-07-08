package X;

import android.util.Log;

/* JADX INFO: renamed from: X.0Oax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622290Oax {
    public static final C622290Oax LIZ = new C622290Oax();

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bulletin_board_db-");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJ(Throwable th) {
        if (!C625790Ogb.LIZ()) {
            C2276411E8h.LIZIZ.LIZJ("bulletin_board", 6, "bulletin_board_db", String.valueOf(Log.getStackTraceString(th)));
        }
    }

    public static final void LIZIZ(String str, String str2) {
        if (!C625790Ogb.LIZ()) {
            C2276411E8h.LIZIZ.LIZJ("bulletin_board", 6, LIZ(str), str2);
        }
    }

    public static final void LIZLLL(String str, Throwable th) {
        if (!C625790Ogb.LIZ()) {
            C2276411E8h.LIZIZ.LIZJ("bulletin_board", 6, LIZ(str), Log.getStackTraceString(th));
        }
    }

    public static final void LJFF(String str, String str2) {
        if (!C625790Ogb.LIZ()) {
            C2276411E8h.LIZIZ.LIZJ("bulletin_board", 4, LIZ(str), str2);
        }
    }

    public static final void LIZJ(String str, String str2, Throwable th) {
        if (!C625790Ogb.LIZ()) {
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            String strLIZ = LIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(": ");
            sbLIZ.append(Log.getStackTraceString(th));
            c2276411E8h.LIZJ("bulletin_board", 6, strLIZ, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
