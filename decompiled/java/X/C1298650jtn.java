package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0jtn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298650jtn {
    public static void LIZ(Context context, String str, String str2) {
        boolean zLIZJ;
        C1298620jtk c1298620jtkLIZ = C1298630jtl.LIZ(context);
        if (str.length() == 0) {
            zLIZJ = c1298620jtkLIZ.LIZLLL(str2);
        } else {
            zLIZJ = c1298620jtkLIZ.LIZJ(str, str2);
        }
        if (zLIZJ) {
            C1298620jtk c1298620jtkLIZ2 = C1298630jtl.LIZ(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_TIME");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (str.length() == 0) {
                c1298620jtkLIZ2.LIZLLL(strLIZIZ);
            } else {
                c1298620jtkLIZ2.LIZJ(str, strLIZIZ);
            }
        }
    }
}
