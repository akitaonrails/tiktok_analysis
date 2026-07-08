package X;

import android.util.Base64;
import java.util.Random;

/* JADX INFO: renamed from: X.08Ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2094908Ip {
    public static String LIZ(String str) {
        String str2 = new String();
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            str2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        Random random = new Random();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(random.nextInt());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(System.currentTimeMillis());
        return Base64.encodeToString(C2188811AlT.LIZIZ(sbLIZ3).getBytes(), 2);
    }
}
