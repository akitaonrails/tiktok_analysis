package X;

/* JADX INFO: renamed from: X.0XvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864230XvJ {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public C864230XvJ() {
        this(false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C864230XvJ)) {
            return false;
        }
        C864230XvJ c864230XvJ = (C864230XvJ) obj;
        return this.LIZ == c864230XvJ.LIZ && this.LIZIZ == c864230XvJ.LIZIZ && this.LIZJ == c864230XvJ.LIZJ && this.LIZLLL == c864230XvJ.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UndoFeatureConfig(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", recallReEditWindowMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deleteUndoWindowMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", deleteCommitGracePeriodMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C864230XvJ(boolean z, int i) {
        long j;
        long j2;
        z = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            j = 300000;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = 3000;
        } else {
            j2 = 0;
        }
        long j3 = (i & 8) != 0 ? 1000L : 0L;
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
