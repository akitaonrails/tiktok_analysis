package X;

/* JADX INFO: renamed from: X.0V9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793240V9u<F, S> {
    public final F LIZ;
    public final S LIZIZ;

    public final int hashCode() {
        F f = this.LIZ;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.LIZIZ;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Pair{");
        sbLIZ.append(String.valueOf(this.LIZ));
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C793240V9u)) {
            return false;
        }
        C793240V9u c793240V9u = (C793240V9u) obj;
        F f = c793240V9u.LIZ;
        F f2 = this.LIZ;
        if (f != f2 && (f == null || !f.equals(f2))) {
            return false;
        }
        S s = c793240V9u.LIZIZ;
        S s2 = this.LIZIZ;
        if (s != s2 && (s == null || !s.equals(s2))) {
            return false;
        }
        return true;
    }

    public C793240V9u(F f, S s) {
        this.LIZ = f;
        this.LIZIZ = s;
    }
}
