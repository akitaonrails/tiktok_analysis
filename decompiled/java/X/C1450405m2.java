package X;

import java.util.Set;

/* JADX INFO: renamed from: X.05m2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1450405m2 {
    public static final <T> float LIZ(Set<? extends T> set, Set<? extends T> set2) {
        if (!set.isEmpty() && !set2.isEmpty()) {
            return C13LP.LJJL(set, set2).size() / set2.size();
        }
        return 0.0f;
    }
}
