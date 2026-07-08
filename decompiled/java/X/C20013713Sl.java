package X;

/* JADX INFO: renamed from: X.13Sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20013713Sl {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final boolean LJII;

    public C20013713Sl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20013713Sl)) {
            return false;
        }
        C20013713Sl c20013713Sl = (C20013713Sl) obj;
        return this.LIZ == c20013713Sl.LIZ && this.LIZIZ == c20013713Sl.LIZIZ && this.LIZJ == c20013713Sl.LIZJ && this.LIZLLL == c20013713Sl.LIZLLL && this.LJ == c20013713Sl.LJ && this.LJFF == c20013713Sl.LJFF && this.LJI == c20013713Sl.LJI && this.LJII == c20013713Sl.LJII;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomCacheConfig(independentClean=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", useOldStrategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", expireMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", trimSize=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", expireMsForLowStorage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", expireMsForELowStorage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", removeDeadFiles=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20013713Sl(int i) {
        this(false, false, 0L, 0L, 0L, 0L, 0L, false);
    }

    public C20013713Sl(boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
        this.LJII = z3;
    }
}
