package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0o3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458580o3k {
    public static String LIZ;
    public static String LIZIZ;
    public static final Map<String, List<String>> LIZJ = new LinkedHashMap();

    public static String LIZ(String str) {
        if (!C1458780o44.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(System.currentTimeMillis());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C123100dR.LIZ(LIZ)) {
            String str2 = LIZ;
            LIZIZ = str2;
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        LIZIZ = strLIZIZ;
        if (strLIZIZ == null) {
            return "";
        }
        return strLIZIZ;
    }
}
