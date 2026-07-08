package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0SZC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZC {
    public static AbstractC1604130rqV LIZ() {
        return C207128163i.LJ.getValue();
    }

    public static void LIZIZ(String str) {
        LIZ().LJ(str);
    }

    public static void LIZJ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C603820NmG<String, Unit> c603820NmG = C207128163i.LJFF;
        if (c603820NmG.LIZJ(strLIZIZ) == null) {
            c603820NmG.LIZLLL(strLIZIZ, Unit.LIZ);
            LIZ().LJ(str3);
        }
    }
}
