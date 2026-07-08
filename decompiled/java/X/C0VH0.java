package X;

/* JADX INFO: renamed from: X.0VH0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VH0 {
    public final String LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VH0)) {
            return false;
        }
        C0VH0 c0vh0 = (C0VH0) obj;
        if (this.LIZIZ != c0vh0.LIZIZ) {
            return false;
        }
        return this.LIZ.equals(c0vh0.LIZ);
    }

    public C0VH0(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
