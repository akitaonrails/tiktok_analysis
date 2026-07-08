package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.062u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C15442062u extends C093Y {
    public static final Set LJI(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            if (!z && Intrinsics.LJFF(obj2, obj)) {
                z = true;
            } else {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> LJII(Set<? extends T> set, Iterable<? extends T> iterable) {
        Collection<?> collectionLLIIII;
        if (iterable instanceof Collection) {
            collectionLLIIII = (Collection) iterable;
        } else {
            collectionLLIIII = C13LP.LLIIII(iterable);
        }
        if (collectionLLIIII.isEmpty()) {
            return C13LP.LLIIJI(set);
        }
        if (collectionLLIIII instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!((Set) collectionLLIIII).contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collectionLLIIII);
        return linkedHashSet2;
    }

    public static final Set LJIIIIZZ(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final <T> Set<T> LJIIIZ(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        Integer numValueOf;
        if ((iterable instanceof Collection) && (numValueOf = Integer.valueOf(((Collection) iterable).size())) != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(size));
        linkedHashSet.addAll(set);
        C19719612Di.LJJI(iterable, linkedHashSet);
        return linkedHashSet;
    }
}
