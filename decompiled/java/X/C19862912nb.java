package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19862912nb extends AbstractC19863112nd implements Serializable {
    public final AbstractC19863112nd LL;

    public C19862912nb(AbstractC19863112nd abstractC19863112nd) {
        this.LL = abstractC19863112nd;
    }

    @Override // X.AbstractC19863112nd
    public final AbstractC19863112nd LIZ() {
        return this.LL;
    }

    public final int hashCode() {
        return -this.LL.hashCode();
    }

    public final String toString() {
        return this.LL.toString().concat(".reverse()");
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19862912nb) {
            return this.LL.equals(((C19862912nb) obj).LL);
        }
        return false;
    }

    @Override // X.AbstractC19863112nd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.LL.compare(obj2, obj);
    }
}
