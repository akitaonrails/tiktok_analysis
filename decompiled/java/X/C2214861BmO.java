package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214861BmO {
    public static final C2214861BmO LIZ = new C2214861BmO();
    public static final Map<String, C2214881BmQ> LIZIZ = new LinkedHashMap();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2214901BmS());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2214891BmR());

    public static boolean LIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static void LIZJ(int i, String str) {
        C2214881BmQ c2214881BmQ;
        if (LIZ() && (c2214881BmQ = (C2214881BmQ) ((LinkedHashMap) LIZIZ).get(str)) != null) {
            c2214881BmQ.LIZIZ = i;
        }
    }

    public static void LIZIZ(Object obj, String str, String str2) {
        C2214881BmQ c2214881BmQ;
        Map<String, Object> map;
        if (LIZ() && (c2214881BmQ = (C2214881BmQ) ((LinkedHashMap) LIZIZ).get(str)) != null && (map = c2214881BmQ.LIZJ) != null) {
            map.put(str2, obj);
        }
    }
}
