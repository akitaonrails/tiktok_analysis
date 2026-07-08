package X;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDZ {
    public static void LIZ(int i, String str, String str2, Map map) {
        HashMap map2;
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report: commandId=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", message=");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(", code=");
            sbLIZ3.append(i);
            C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(", specificParams=");
            sbLIZ4.append(map);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (map != null) {
            map2 = new HashMap(map);
        } else {
            map2 = null;
        }
        C794080VDa c794080VDa = new C794080VDa(str, map2);
        c794080VDa.LIZLLL = i;
        c794080VDa.LJ = str2;
        C0VDW.LIZJ(c794080VDa);
    }

    public static boolean LIZIZ(File file, String str, String str2, String str3) {
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("postFile: commandId=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("postFile=");
            sbLIZ2.append(file.getAbsolutePath());
            C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(", uploadMessage=");
            sbLIZ3.append(str3);
            C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(", fileType=");
            sbLIZ4.append(str2);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        return C2403709bP.LIZIZ(C2403709bP.LIZ, file, 1, str2, str, str3, System.currentTimeMillis(), null);
    }
}
