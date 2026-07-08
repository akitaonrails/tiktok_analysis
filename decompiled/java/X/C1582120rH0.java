package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0rH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582120rH0 {
    public static Set<String> LIZ;

    public static void LIZ() {
        Set<String> set = LIZ;
        if (set != null) {
            set.clear();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZ = linkedHashSet;
        linkedHashSet.clear();
    }
}
