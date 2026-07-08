package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0pxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531890pxz {
    public static boolean LIZ(C1531860pxw c1531860pxw) {
        if (c1531860pxw != null) {
            Set<String> set = c1531860pxw.LIZIZ;
            if (set == null || set.isEmpty()) {
                HashSet<String> hashSet = c1531860pxw.LIZJ;
                if (hashSet != null && !hashSet.isEmpty()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
