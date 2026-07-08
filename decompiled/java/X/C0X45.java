package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0X45, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X45<E> extends HashSet<E> {
    public C0X45(Set<E> set) {
        super(set);
    }

    public static <E> C0X45<E> copyOf(Set<E> set) {
        return new C0X45<>(set);
    }

    public static <E> C0X45<E> of(E... eArr) {
        HashSet hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return new C0X45<>(hashSet);
    }
}
