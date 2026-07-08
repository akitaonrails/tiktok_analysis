package X;

/* JADX INFO: renamed from: X.0ITB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ITB {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ITB)) {
            return false;
        }
        C0ITB c0itb = (C0ITB) obj;
        return this.LIZ == c0itb.LIZ && this.LIZIZ == c0itb.LIZIZ && this.LIZJ == c0itb.LIZJ && this.LIZLLL == c0itb.LIZLLL && this.LJ == c0itb.LJ && this.LJFF == c0itb.LJFF && this.LJI == c0itb.LJI && this.LJII == c0itb.LJII;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerFlowHotRefreshGate(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", negativeSignalEnabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", feedTimeoutEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", foregroundEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", backgroundTriggerThresholdMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cooldownMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", recentFeedProtectMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", negativeSkipRecentFeedProtect=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ITB(boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, long j3, boolean z5) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = z5;
    }
}
