package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.07bI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1893407bI {
    public static boolean LIZ(String str) {
        if (str.length() > 0 && str.charAt(0) == ':') {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            if (((Map) obj).isEmpty()) {
                return false;
            }
        } else if ((obj instanceof List) && ((Collection) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(int i, Object obj) {
        if (obj == null || 2 <= i) {
            return false;
        }
        if (obj instanceof Map) {
            Set setEntrySet = ((Map) obj).entrySet();
            Iterator it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Object key = ((Map.Entry) it2.next()).getKey();
                if ((key instanceof String) && LIZ((String) key)) {
                    return true;
                }
            }
            Iterator it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                if (LIZIZ(i + 1, ((Map.Entry) it3.next()).getValue())) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof List) {
            Iterator it4 = ((Iterable) obj).iterator();
            while (it4.hasNext()) {
                if (LIZIZ(i + 1, it4.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
