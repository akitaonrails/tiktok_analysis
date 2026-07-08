package X;

/* JADX INFO: renamed from: X.1AEG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AEG {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C1AEI LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1AEG() {
        boolean z = false;
        this(z, z, z, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1AEG)) {
            return false;
        }
        C1AEG c1aeg = (C1AEG) obj;
        return this.LIZ == c1aeg.LIZ && this.LIZIZ == c1aeg.LIZIZ && this.LIZJ == c1aeg.LIZJ && this.LIZLLL == c1aeg.LIZLLL && this.LJ == c1aeg.LJ && this.LJFF == c1aeg.LJFF && this.LJI == c1aeg.LJI && this.LJII == c1aeg.LJII;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LifecyclePolicy(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fixReleaseSemantic=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", destroyPageInvisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", destroyPlaySelection=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", destroyEnterInnerLive=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", destroyViewDetach=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", surfaceView=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", reusePlayDedupMode=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1AEG(boolean z, boolean z2, boolean z3, C1AEI c1aei, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, false, false, false, false, (i & 128) != 0 ? C1AEI.LL : c1aei);
    }

    public static C1AEG LIZ(C1AEG c1aeg, boolean z, boolean z2, boolean z3, boolean z4, C1AEI c1aei, int i) {
        boolean z5;
        boolean z6;
        C1AEI c1aei2 = c1aei;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        boolean z11 = false;
        if ((i & 1) != 0) {
            z5 = c1aeg.LIZ;
        } else {
            z5 = false;
        }
        if ((i & 2) != 0) {
            z6 = c1aeg.LIZIZ;
        } else {
            z6 = false;
        }
        if ((i & 4) != 0) {
            z11 = c1aeg.LIZJ;
        }
        if ((i & 8) != 0) {
            z10 = c1aeg.LIZLLL;
        }
        if ((i & 16) != 0) {
            z9 = c1aeg.LJ;
        }
        if ((i & 32) != 0) {
            z8 = c1aeg.LJFF;
        }
        if ((i & 64) != 0) {
            z7 = c1aeg.LJI;
        }
        if ((i & 128) != 0) {
            c1aei2 = c1aeg.LJII;
        }
        return new C1AEG(z5, z6, z11, z10, z9, z8, z7, c1aei2);
    }

    public C1AEG(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C1AEI c1aei) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
        this.LJFF = z6;
        this.LJI = z7;
        this.LJII = c1aei;
    }
}
