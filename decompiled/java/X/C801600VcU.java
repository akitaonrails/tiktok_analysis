package X;

/* JADX INFO: renamed from: X.0VcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801600VcU<F, S> {
    public final F LIZ;
    public final S LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode() ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Pair{");
        sbLIZ.append(String.valueOf(this.LIZ));
        sbLIZ.append(" ");
        sbLIZ.append(String.valueOf(this.LIZIZ));
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C801600VcU)) {
            return false;
        }
        C801600VcU c801600VcU = (C801600VcU) obj;
        F f = c801600VcU.LIZ;
        F f2 = this.LIZ;
        if (f != f2 && (f == null || !f.equals(f2))) {
            return false;
        }
        S s = c801600VcU.LIZIZ;
        S s2 = this.LIZIZ;
        if (s != s2 && (s == null || !s.equals(s2))) {
            return false;
        }
        return true;
    }

    public C801600VcU(F f, S s) {
        this.LIZ = f;
        this.LIZIZ = s;
    }
}
