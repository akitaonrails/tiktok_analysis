package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545530qJz {
    public static String LIZJ(String str) {
        if (a0.LJJLIIIJJIZ(str, '/')) {
            return str.substring(1);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1545570qK3 LIZ(com.bytedance.hybrid.spark.SparkContext r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1545530qJz.LIZ(com.bytedance.hybrid.spark.SparkContext, java.lang.String):X.0qK3");
    }

    public static String LIZIZ(String str, String str2) {
        String strLIZIZ;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (!a0.LJJIJIIJIL(str, '/') && !a0.LJJLIIIJJIZ(str2, '/')) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('/');
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            return LIZJ(strLIZIZ);
        }
        return null;
    }
}
