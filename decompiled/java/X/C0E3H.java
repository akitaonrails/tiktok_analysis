package X;

/* JADX INFO: renamed from: X.0E3H, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3H {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0E3H() {
        long j = 0;
        this(j, j, j, j, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E3H)) {
            return false;
        }
        C0E3H c0e3h = (C0E3H) obj;
        return this.LIZ == c0e3h.LIZ && this.LIZIZ == c0e3h.LIZIZ && this.LIZJ == c0e3h.LIZJ && this.LIZLLL == c0e3h.LIZLLL && this.LJ == c0e3h.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundAdjustRange(videoStart=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoEnd=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", audioStart=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", audioEnd=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", modified=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0E3H(long j, long j2, long j3, long j4, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, false);
    }

    public C0E3H(long j, long j2, long j3, long j4, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = z;
    }
}
