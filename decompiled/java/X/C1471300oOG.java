package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0oOG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471300oOG {
    public static String LIZIZ(C1474520oTS c1474520oTS) {
        StringBuilder sb = new StringBuilder("fileId=");
        String strLIZ = c1474520oTS.LIZ(28);
        String str = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        String strLIZ2 = c1474520oTS.LIZ(29);
        if (strLIZ2 != null) {
            str = strLIZ2;
        }
        sb.append(strLIZ);
        sb.append("&bitrate=");
        sb.append(c1474520oTS.LIZIZ(44));
        sb.append("&pcrc=");
        sb.append(C795730VJj.LJFF(str));
        return sb.toString();
    }

    public static void LIZ(C1471550oOf c1471550oOf, C1476320oWM c1476320oWM) {
        if (c1471550oOf.LJIIL != null) {
            if (c1476320oWM.LJI == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tag=");
                sbLIZ.append(C795730VJj.LJFF(c1471550oOf.LJIIL));
                c1476320oWM.LJI = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1476320oWM.LJI);
                sbLIZ2.append("&tag=");
                sbLIZ2.append(C795730VJj.LJFF(c1471550oOf.LJIIL));
                c1476320oWM.LJI = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        if (c1471550oOf.LJIILIIL != null) {
            if (c1476320oWM.LJI == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("stag=");
                sbLIZ3.append(C795730VJj.LJFF(c1471550oOf.LJIILIIL));
                c1476320oWM.LJI = C2188811AlT.LIZIZ(sbLIZ3);
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(c1476320oWM.LJI);
            sbLIZ4.append("&stag=");
            sbLIZ4.append(C795730VJj.LJFF(c1471550oOf.LJIILIIL));
            c1476320oWM.LJI = C2188811AlT.LIZIZ(sbLIZ4);
        }
    }

    public static String LIZJ(C1474520oTS c1474520oTS, C1471550oOf c1471550oOf) {
        StringBuilder sb = new StringBuilder("fileId=");
        String strLIZ = c1474520oTS.LIZ(28);
        String str = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        String strLIZ2 = c1474520oTS.LIZ(29);
        if (strLIZ2 != null) {
            str = strLIZ2;
        }
        int iLIZIZ = c1474520oTS.LIZIZ(44);
        sb.append(strLIZ);
        sb.append("&bitrate=");
        sb.append(iLIZIZ);
        sb.append("&pcrc=");
        sb.append(C795730VJj.LJFF(str));
        sb.append("&tag=");
        sb.append(C795730VJj.LJFF(c1471550oOf.LJIIL));
        if (!TextUtils.isEmpty(c1471550oOf.LJIILIIL)) {
            sb.append("&stag=");
            sb.append(C795730VJj.LJFF(c1471550oOf.LJIILIIL));
        }
        return sb.toString();
    }
}
