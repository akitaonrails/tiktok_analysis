package X;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.13Bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19969413Bk<E> extends AbstractC2253808sK<E> implements Set<E> {
    public static final C19969513Bl LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Bl] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LL = new Object(defaultConstructorMarker) { // from class: X.13Bl
        };
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        LL.getClass();
        Iterator<E> it2 = iterator();
        int iHashCode = 0;
        while (it2.hasNext()) {
            E next = it2.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        LL.getClass();
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }
}
