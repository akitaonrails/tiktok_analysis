package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.00nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C188200nw {
    public static final String LIZ() {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1AQS.LIZIZ();
        int i = 0;
        for (Object obj : linkedHashMap.keySet()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            String str = (String) obj;
            if (i == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('/');
                sbLIZ.append((String) linkedHashMap.get(str));
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(' ');
                sbLIZ2.append(str);
                sbLIZ2.append('/');
                sbLIZ2.append((String) linkedHashMap.get(str));
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            i = i2;
        }
        return sb.toString();
    }
}
