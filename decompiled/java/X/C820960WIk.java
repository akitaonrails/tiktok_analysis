package X;

/* JADX INFO: renamed from: X.0WIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820960WIk<T> {
    public T LIZ;
    public T LIZIZ;

    public final int hashCode() {
        T t = this.LIZ;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.LIZIZ;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
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
        if (!(obj instanceof C0WIY)) {
            return false;
        }
        C0WIY c0wiy = (C0WIY) obj;
        F f = c0wiy.LIZ;
        Object obj2 = this.LIZ;
        if (f != obj2 && (f == 0 || !f.equals(obj2))) {
            return false;
        }
        S s = c0wiy.LIZIZ;
        Object obj3 = this.LIZIZ;
        if (s != obj3 && (s == 0 || !s.equals(obj3))) {
            return false;
        }
        return true;
    }
}
