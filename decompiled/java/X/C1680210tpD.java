package X;

/* JADX INFO: renamed from: X.0tpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680210tpD {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        long j = this.LIZ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        return (((C786410Ut5.Y2(j) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Placeholder(width=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZ));
        sbLIZ.append(", height=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZIZ));
        sbLIZ.append(", placeholderVerticalAlign=");
        int i = this.LIZJ;
        sbLIZ.append((Object) (i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid"));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1680210tpD)) {
            return false;
        }
        C1680210tpD c1680210tpD = (C1680210tpD) obj;
        if (C1682440tso.LIZ(this.LIZ, c1680210tpD.LIZ) && C1682440tso.LIZ(this.LIZIZ, c1680210tpD.LIZIZ) && this.LIZJ == c1680210tpD.LIZJ) {
            return true;
        }
        return false;
    }

    public C1680210tpD(long j, long j2, int i) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        if (C1682440tso.LIZIZ(j) == 0) {
            C1681000tqU.LIZ("width cannot be TextUnit.Unspecified");
        }
        if (C1682440tso.LIZIZ(j2) == 0) {
            C1681000tqU.LIZ("height cannot be TextUnit.Unspecified");
        }
    }
}
