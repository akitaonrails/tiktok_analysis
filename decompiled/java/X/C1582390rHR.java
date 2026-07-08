package X;

/* JADX INFO: renamed from: X.0rHR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582390rHR {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final int LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582390rHR)) {
            return false;
        }
        C1582390rHR c1582390rHR = (C1582390rHR) obj;
        return this.LIZ == c1582390rHR.LIZ && this.LIZIZ == c1582390rHR.LIZIZ && this.LIZJ == c1582390rHR.LIZJ && this.LIZLLL == c1582390rHR.LIZLLL && this.LJ == c1582390rHR.LJ && this.LJFF == c1582390rHR.LJFF && this.LJI == c1582390rHR.LJI && this.LJII == c1582390rHR.LJII && this.LJIIIIZZ == c1582390rHR.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountedShownSnapshot(elapsedAtShown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wallMsAtShown=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coldBootBegin=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prfCnt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", durationFromLast=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", itemCountBefore=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", hasMoreBefore=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1582390rHR(long j, long j2, long j3, int i, long j4, long j5, int i2, int i3, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = i;
        this.LJ = j4;
        this.LJFF = j5;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = z;
    }
}
