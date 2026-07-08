package X;

/* JADX INFO: renamed from: X.0WBE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WBE {
    public final C0WBF<?> LIZ;
    public final boolean LIZIZ;

    public C0WBE() {
        throw null;
    }

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.LIZIZ).hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0WBE)) {
            return false;
        }
        C0WBE c0wbe = (C0WBE) obj;
        if (!c0wbe.LIZ.equals(this.LIZ) || c0wbe.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    public C0WBE(C0WBF c0wbf, boolean z) {
        this.LIZ = c0wbf;
        this.LIZIZ = z;
    }
}
