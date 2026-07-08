package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: renamed from: X.08OP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OP {
    public static boolean LIZ(Context context, String str, C0VSJ c0vsj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lib");
        sbLIZ.append(str);
        sbLIZ.append(".so.tmp");
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String strLIZ = C08OO.LIZ(c0vsj2, applicationInfo.sourceDir, str);
        if (strLIZ != null) {
            String[] strArr = applicationInfo.splitSourceDirs;
            if (strArr != null) {
                for (String str2 : strArr) {
                    strLIZ = C08OO.LIZ(c0vsj2, str2, str);
                    if (strLIZ != null) {
                    }
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" unpack error: ");
            sbLIZ2.append(strLIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("lib");
        sbLIZ3.append(str);
        sbLIZ3.append(".so");
        return c0vsj2.renameTo(new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ3)));
    }
}
