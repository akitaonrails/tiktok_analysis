package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19877012ps extends AbstractC19877212pu<Comparable<?>> implements Serializable {
    public static final C19877012ps LL = new C19877012ps();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private Object readResolve() {
        return LL;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        obj.getClass();
        if (obj == comparable) {
            return 0;
        }
        return comparable.compareTo(obj);
    }
}
