package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0NuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608890NuR {
    public static final Set<String> LIZ = new LinkedHashSet();
    public static final Set<String> LIZIZ = new LinkedHashSet();
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static final LruCache<String, C609080Nuk> LIZLLL = new LruCache<>(100);
    public static final Set<String> LJ = new LinkedHashSet();
    public static final Map<String, Map<String, String>> LJFF = new LinkedHashMap();

    public static boolean LIZJ(String str) {
        if (str.length() == 0) {
            return false;
        }
        return LJFF.containsKey(str);
    }

    public static String LIZIZ(String str, String str2) {
        boolean z;
        Map map;
        String str3;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !LIZJ(str) || (map = (Map) ((LinkedHashMap) LJFF).get(str)) == null || (str3 = (String) map.get(str2)) == null) {
            return "";
        }
        return str3;
    }

    public static boolean LIZLLL(Aweme aweme, String str) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (aid == null || str == null) {
            return false;
        }
        if (C0R93.LIZ(str)) {
            C1374870lsj.LIZ.getClass();
            return C1374870lsj.LIZ(aweme, str);
        }
        return LIZJ.contains(aid);
    }

    public static void LJ(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        if (C0R93.LIZ(str2)) {
            C1374870lsj.LIZ.getClass();
            C1374870lsj.LJFF.LIZIZ(str);
        } else {
            LIZJ.remove(str);
        }
    }

    public static void LIZ(String str, String str2, String str3) {
        if (str.length() == 0) {
            return;
        }
        if (!LIZJ(str)) {
            Map<String, Map<String, String>> map = LJFF;
            map.put(str, new LinkedHashMap());
            Map map2 = (Map) ((LinkedHashMap) map).get(str);
            if (map2 != null) {
                map2.put(str2, str3);
                return;
            }
            return;
        }
        Map map3 = (Map) ((LinkedHashMap) LJFF).get(str);
        if (map3 == null) {
            return;
        }
        map3.put(str2, str3);
    }
}
