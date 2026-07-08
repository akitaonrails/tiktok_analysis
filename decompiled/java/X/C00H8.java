package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00H8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00H8 {
    public static boolean LIZ(Object obj) {
        if (obj != null && !(obj instanceof Boolean) && !(obj instanceof String)) {
            if (obj instanceof Number) {
                if (Math.abs(((Number) obj).doubleValue()) > Double.MAX_VALUE) {
                    return false;
                }
            } else if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return true;
                }
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (!LIZ(it2.next())) {
                        return false;
                    }
                }
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (!(key instanceof String) || !LIZ(value)) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
