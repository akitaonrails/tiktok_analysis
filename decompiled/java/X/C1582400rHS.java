package X;

/* JADX INFO: renamed from: X.0rHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582400rHS {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582400rHS)) {
            return false;
        }
        C1582400rHS c1582400rHS = (C1582400rHS) obj;
        return this.LIZ == c1582400rHS.LIZ && this.LIZIZ == c1582400rHS.LIZIZ && this.LIZJ == c1582400rHS.LIZJ && this.LIZLLL == c1582400rHS.LIZLLL && this.LJ == c1582400rHS.LJ && this.LJFF == c1582400rHS.LJFF && this.LJI == c1582400rHS.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingShown(elapsedAtShown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wallMsAtShown=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coldBootBegin=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", itemCountBefore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasMoreBefore=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1582400rHS(boolean z, long j, long j2, int i, long j3, long j4, int i2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = z;
    }
}
