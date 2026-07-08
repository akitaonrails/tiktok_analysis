package X;

/* JADX INFO: renamed from: X.05sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1490405sU<T> {
    public final AbstractC1491605sg<T> LIZ;
    public T LIZIZ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        T t = this.LIZIZ;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public C1490405sU(AbstractC1491605sg<T> abstractC1491605sg, T t) {
        this.LIZ = abstractC1491605sg;
        this.LIZIZ = t;
    }
}
