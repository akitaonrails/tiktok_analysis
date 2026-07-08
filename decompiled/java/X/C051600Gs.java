package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C051600Gs {
    public static final boolean LIZ(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (obj != null && obj2 != null) {
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                if (((Number) obj).doubleValue() == ((Number) obj2).doubleValue()) {
                    return true;
                }
                return false;
            }
            if ((obj instanceof String) && (obj2 instanceof String)) {
                return Intrinsics.LJFF(obj, obj2);
            }
            if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
                return Intrinsics.LJFF(obj, obj2);
            }
            if ((obj instanceof List) && (obj2 instanceof List)) {
                if (((List) obj).size() != ((List) obj2).size()) {
                    return false;
                }
                List<Pair> listLLIILII = C13LP.LLIILII((Iterable) obj, (Iterable) obj2);
                if (!listLLIILII.isEmpty()) {
                    for (Pair pair : listLLIILII) {
                        if (!LIZ(pair.getFirst(), pair.getSecond())) {
                            return false;
                        }
                    }
                }
            } else if ((obj instanceof Map) && (obj2 instanceof Map)) {
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size() && Intrinsics.LJFF(map.keySet(), map2.keySet())) {
                    if (!map.isEmpty()) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!LIZ(entry.getValue(), map2.get(entry.getKey()))) {
                                return false;
                            }
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
