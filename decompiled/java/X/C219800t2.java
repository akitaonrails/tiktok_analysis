package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00t2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C219800t2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Map map, Map.Entry entry) {
        Boolean boolValueOf;
        Object obj = map.get(entry.getKey());
        if (obj != null && (boolValueOf = Boolean.valueOf(Intrinsics.LJFF(obj, entry.getValue()))) != null) {
            return boolValueOf.booleanValue();
        }
        if (entry.getValue() == null && map.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Map map, Map map2) {
        if (map.size() == map2.size()) {
            if (!map2.isEmpty()) {
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    if (!LIZ(map, (Map.Entry) it2.next())) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
