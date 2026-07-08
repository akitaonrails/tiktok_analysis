package X;

/* JADX INFO: renamed from: X.005A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005A {
    public static final /* synthetic */ int LJII = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C005A)) {
            return false;
        }
        C005A c005a = (C005A) obj;
        return this.LIZ == c005a.LIZ && this.LIZIZ == c005a.LIZIZ && this.LIZJ == c005a.LIZJ && this.LIZLLL == c005a.LIZLLL && this.LJ == c005a.LJ && this.LJFF == c005a.LJFF && this.LJI == c005a.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishASRResultMeta(sdkReceiveAtMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", audioStartMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", audioEndMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", audioDurationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", utteranceCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", latestUtteranceDefinite=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", latestUtteranceTextLen=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C005A(boolean z, long j, long j2, int i, long j3, long j4, int i2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = i2;
    }
}
