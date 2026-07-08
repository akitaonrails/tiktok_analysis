package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0OxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636120OxG {
    public static final C636120OxG LIZ = new C636120OxG();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();
    public static final Map<String, Pair<Boolean, String>> LIZJ = new LinkedHashMap();
    public static C2344009Gk LIZLLL = new C2344009Gk();
    public static long LJ;
    public static boolean LJFF;

    public static void LIZ(String str, String str2, boolean z) {
        Map<String, Long> map = LIZIZ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            map.put(str, Long.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        LIZJ.put(str, new Pair<>(Boolean.valueOf(z), str2));
    }
}
