package X;

import java.util.List;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0mbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402640mbW {
    public static String LIZ(List list) {
        String strLJJLIIIJ;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(43), 31)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }

    public static String LIZIZ(List list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) obj;
                    if (i == 0) {
                        sb.append(str);
                    } else {
                        sb.append(",");
                        sb.append(str);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return sb.toString();
        }
        return "";
    }
}
