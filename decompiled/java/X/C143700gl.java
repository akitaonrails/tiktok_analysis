package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C143700gl {
    public static boolean LIZ(Map map, Map map2) {
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.LJFF(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
