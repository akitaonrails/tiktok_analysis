package X;

/* JADX INFO: renamed from: X.08dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2164308dt {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2164308dt)) {
            return false;
        }
        C2164308dt c2164308dt = (C2164308dt) obj;
        return this.LIZ == c2164308dt.LIZ && this.LIZIZ == c2164308dt.LIZIZ && this.LIZJ == c2164308dt.LIZJ && this.LIZLLL == c2164308dt.LIZLLL && this.LJ == c2164308dt.LJ && this.LJFF == c2164308dt.LJFF && this.LJI == c2164308dt.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WeakNetworkContext(isWeakNetwork=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSpeedTestTimeout=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isTtnetSlow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ttnetNqeLevel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", uploadProbeSpeed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", speedToGetEncodeSetting=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", elapsedMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2164308dt(boolean z, boolean z2, boolean z3, int i, long j, long j2, long j3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = i;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = j3;
    }
}
