package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19876912pr extends AbstractC19877212pu<Comparable<?>> implements Serializable {
    public static final C19876912pr LL = new C19876912pr();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    private Object readResolve() {
        return LL;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        obj2.getClass();
        return comparable.compareTo(obj2);
    }
}
