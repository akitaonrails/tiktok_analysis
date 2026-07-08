package X;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: X.0XNP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XNP {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");

    public static final String LIZ(String str) {
        if (str != null && str.length() != 0) {
            if (str.length() < 30) {
                return "*****";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, 10));
            sbLIZ.append("*****");
            sbLIZ.append(str.substring(str.length() - 10, str.length()));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(str);
    }
}
