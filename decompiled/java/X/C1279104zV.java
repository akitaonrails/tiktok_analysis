package X;

/* JADX INFO: renamed from: X.04zV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279104zV {
    public final long LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279104zV)) {
            return false;
        }
        C1279104zV c1279104zV = (C1279104zV) obj;
        return this.LIZ == c1279104zV.LIZ && this.LIZIZ == c1279104zV.LIZIZ && this.LIZJ == c1279104zV.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesProfileFragmentArgs(creatorUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isMyProfile=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isMainState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1279104zV(long j, boolean z, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
