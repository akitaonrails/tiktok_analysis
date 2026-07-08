package X;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: X.0zXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900100zXs {
    public final String LIZ = "newpendant";

    public final String LIZ(String str) {
        String strLIZIZ;
        Context contextLJIIJJI;
        String path;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = this.LIZ;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null && (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            File fileX2 = C786410Ut5.x2(contextLJIIJJI);
            if (fileX2 == null && (fileX2 = C786410Ut5.w2(contextLJIIJJI)) == null) {
                path = null;
            } else {
                path = fileX2.getPath();
            }
            sbLIZ2.append(path);
            sbLIZ2.append(File.separator);
            sbLIZ2.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        if (z) {
            str2 = ".zip";
        } else {
            str2 = "";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ(str));
        sbLIZ.append(File.separator);
        sbLIZ.append(LIZIZ(str2, false));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ(str));
        sbLIZ.append(File.separator);
        sbLIZ.append(LIZIZ(str2, true));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
