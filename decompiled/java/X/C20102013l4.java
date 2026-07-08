package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.13l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20102013l4 {
    public static Pair LIZJ(String str) {
        C20102113l5 c20102113l5;
        C20101913l3 c20101913l3 = C20101913l3.LJFF.get(str);
        if (c20101913l3 != null && (c20102113l5 = c20101913l3.LIZJ) != null) {
            return new Pair(Integer.valueOf((int) c20102113l5.LIZ), Integer.valueOf((int) c20102113l5.LIZJ));
        }
        return new Pair(-1, -1);
    }

    public static void LIZ(String str, C20102113l5 c20102113l5, C20102113l5 c20102113l52) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("av-performance\nmonitor change value => \nscene = ");
        sbLIZ.append(str);
        sbLIZ.append("\napp memory change: ");
        sbLIZ.append(c20102113l5.LIZ - c20102113l52.LIZ);
        sbLIZ.append(" Mb, system memory change: ");
        sbLIZ.append(c20102113l5.LIZIZ - c20102113l52.LIZIZ);
        sbLIZ.append(" Mb, available memory change: ");
        sbLIZ.append(c20102113l5.LIZJ - c20102113l52.LIZJ);
        sbLIZ.append("Mb. ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('\n');
        sbLIZ2.append(strLIZIZ);
        C201955140j.LJIILJJIL(c20102213l6, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZIZ(String str, String str2, C20102113l5 c20102113l5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("av-performance\nmonitor instant value => \nscene = ");
        sbLIZ.append(str);
        sbLIZ.append(", action = ");
        sbLIZ.append(str2);
        sbLIZ.append("\ncurrent memory snapshot: app memory usage = ");
        sbLIZ.append(c20102113l5.LIZ);
        sbLIZ.append(" Mb, system memory usage = ");
        sbLIZ.append(c20102113l5.LIZIZ);
        sbLIZ.append(" Mb, available memory = ");
        sbLIZ.append(c20102113l5.LIZJ);
        sbLIZ.append(" Mb. ");
        C201955140j.LJIILJJIL(C20102213l6.LIZIZ, C2188811AlT.LIZIZ(sbLIZ));
    }
}
