package X;

/* JADX INFO: renamed from: X.0uAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693390uAT {
    public static final C1693390uAT LIZJ = new C1693390uAT(C1682430tsn.LJ(0), C1682430tsn.LJ(0));
    public final long LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        long j = this.LIZ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        return (C786410Ut5.Y2(j) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextIndent(firstLine=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZ));
        sbLIZ.append(", restLine=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693390uAT)) {
            return false;
        }
        C1693390uAT c1693390uAT = (C1693390uAT) obj;
        if (C1682440tso.LIZ(this.LIZ, c1693390uAT.LIZ) && C1682440tso.LIZ(this.LIZIZ, c1693390uAT.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1693390uAT(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
