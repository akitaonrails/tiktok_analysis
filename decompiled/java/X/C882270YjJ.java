package X;

import X.InterfaceC887040Yr0;

/* JADX INFO: renamed from: X.0YjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882270YjJ<T, AREA extends InterfaceC887040Yr0<? super T>> {
    public final AbstractC886530YqB<T, AREA> LIZ;
    public T LIZIZ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        T t = this.LIZIZ;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public C882270YjJ(AbstractC886530YqB<T, AREA> abstractC886530YqB, T t) {
        this.LIZ = abstractC886530YqB;
        this.LIZIZ = t;
    }
}
