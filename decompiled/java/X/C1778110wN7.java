package X;

/* JADX INFO: renamed from: X.0wN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778110wN7 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778110wN7)) {
            return false;
        }
        C1778110wN7 c1778110wN7 = (C1778110wN7) obj;
        return this.LIZ == c1778110wN7.LIZ && this.LIZIZ == c1778110wN7.LIZIZ && this.LIZJ == c1778110wN7.LIZJ && this.LIZLLL == c1778110wN7.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HostPosition(isLeft=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hostOrder=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkedHostCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isAnchorTeammate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778110wN7(boolean z, int i, int i2, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z2;
    }
}
