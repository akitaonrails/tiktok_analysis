package X;

/* JADX INFO: renamed from: X.0E3I, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3I {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E3I)) {
            return false;
        }
        C0E3I c0e3i = (C0E3I) obj;
        return this.LIZ == c0e3i.LIZ && this.LIZIZ == c0e3i.LIZIZ && this.LIZJ == c0e3i.LIZJ && this.LIZLLL == c0e3i.LIZLLL && this.LJ == c0e3i.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundTrimModel(originBgmDuration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bgmStartTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bgmEndTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bgmTimeClipStart=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bgmTimeClipEnd=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0E3I(long j, long j2, long j3, long j4, long j5) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
    }
}
