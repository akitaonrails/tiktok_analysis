package X;

/* JADX INFO: renamed from: X.0tln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678090tln implements InterfaceC1671020taO {
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1678090tln)) {
            return false;
        }
        C1678090tln c1678090tln = (C1678090tln) obj;
        return C1682440tso.LIZ(this.LIZIZ, c1678090tln.LIZIZ) && C1682440tso.LIZ(this.LIZJ, c1678090tln.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RangeBased(maxTextSize=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZIZ));
        sbLIZ.append(", minTextSize=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        long j = this.LIZIZ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        return (C786410Ut5.Y2(j) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public C1678090tln(long j, long j2) {
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
