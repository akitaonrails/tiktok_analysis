package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: X.0YE1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YE1 {
    public static final Set<Integer> LIZ;

    static {
        int i = 0;
        Object[] objArr = {2, 5, 6};
        HashSet hashSet = new HashSet(3);
        do {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
            i++;
        } while (i < 3);
        LIZ = Collections.unmodifiableSet(hashSet);
    }
}
