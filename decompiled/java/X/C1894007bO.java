package X;

import android.os.Build;

/* JADX INFO: renamed from: X.07bO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1894007bO {
    public static void LIZ(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TRuntime.");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ.length() > 23) {
                strLIZIZ.substring(0, 23);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TRuntime.");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
