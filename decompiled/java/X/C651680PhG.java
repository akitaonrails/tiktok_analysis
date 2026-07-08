package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651680PhG {
    public static final HashMap LIZ(String str, Map map) {
        Object obj;
        HashMap map2;
        String str2 = null;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        if ((obj instanceof HashMap) && (map2 = (HashMap) obj) != null) {
            return map2;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        }
        return C1741890vQh.LJIIJ(str2);
    }
}
