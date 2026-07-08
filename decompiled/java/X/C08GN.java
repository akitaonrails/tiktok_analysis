package X;

import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.08GN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GN {
    public static String LIZ(Object[] objArr) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append("#");
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public static boolean LIZIZ(List<?> list) {
        if (list != null && list.size() != 0) {
            return false;
        }
        return true;
    }

    public static Map<String, String> LIZJ(List<Pair<String, String>> list) {
        Object obj;
        if (LIZIZ(list)) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        for (Pair<String, String> pair : list) {
            if (pair != null && (obj = pair.first) != null) {
                map.put(obj, pair.second);
            }
        }
        return map;
    }
}
