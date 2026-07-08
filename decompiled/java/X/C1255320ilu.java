package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0ilu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255320ilu {
    public static final C1255320ilu LIZ = new C1255320ilu();
    public static C1255330ilv LIZIZ;
    public static HashMap<String, Long> LIZJ;

    public static long LIZ(String str) {
        HashMap<String, Long> map;
        Long l;
        if (str != null && str.length() != 0 && (map = LIZJ) != null && (l = map.get(str)) != null) {
            return l.longValue();
        }
        return 0L;
    }
}
