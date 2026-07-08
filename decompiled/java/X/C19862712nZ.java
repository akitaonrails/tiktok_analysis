package X;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: X.12nZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19862712nZ extends AbstractC19863112nd implements Serializable {
    public final Comparator LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        return this.LL.toString();
    }

    public C19862712nZ(Comparator comparator) {
        comparator.getClass();
        this.LL = comparator;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19862712nZ) {
            return this.LL.equals(((C19862712nZ) obj).LL);
        }
        return false;
    }

    @Override // X.AbstractC19863112nd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.LL.compare(obj, obj2);
    }
}
