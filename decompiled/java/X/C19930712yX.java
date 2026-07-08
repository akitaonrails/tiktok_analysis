package X;

/* JADX INFO: renamed from: X.12yX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19930712yX {
    public final Object LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (System.identityHashCode(this.LIZ) * 65535) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19930712yX)) {
            return false;
        }
        C19930712yX c19930712yX = (C19930712yX) obj;
        if (this.LIZ != c19930712yX.LIZ || this.LIZIZ != c19930712yX.LIZIZ) {
            return false;
        }
        return true;
    }

    public C19930712yX(int i, Object obj) {
        this.LIZ = obj;
        this.LIZIZ = i;
    }
}
