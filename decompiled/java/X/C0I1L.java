package X;

/* JADX INFO: renamed from: X.0I1L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1L {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0I1L)) {
            return false;
        }
        C0I1L c0i1l = (C0I1L) obj;
        if (this.LIZ != c0i1l.LIZ || this.LIZIZ != c0i1l.LIZIZ) {
            return false;
        }
        return true;
    }

    public C0I1L(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
