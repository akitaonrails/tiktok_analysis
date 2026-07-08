package X;

import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0DnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349670DnJ {
    public static final String LIZ(List<C349800DnW> list) {
        String strLIZIZ = "";
        for (C349800DnW c349800DnW : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append('{');
            sbLIZ.append(c349800DnW.LIZIZ);
            sbLIZ.append(',');
            sbLIZ.append(c349800DnW.LIZJ);
            sbLIZ.append("} \"");
            sbLIZ.append(u.LJJIFFI(c349800DnW.LIZ, "\n", "#", false));
            sbLIZ.append("\"\n");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }
}
