package X;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: X.12pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19877112pt<T> extends AbstractC19877212pu<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator<T> LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        return this.LL.toString();
    }

    public C19877112pt(Comparator<T> comparator) {
        comparator.getClass();
        this.LL = comparator;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19877112pt) {
            return this.LL.equals(((C19877112pt) obj).LL);
        }
        return false;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.LL.compare(t, t2);
    }
}
