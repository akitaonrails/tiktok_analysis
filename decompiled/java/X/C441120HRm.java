package X;

/* JADX INFO: renamed from: X.0HRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441120HRm extends AbstractC440540HPg {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C441120HRm)) {
            return false;
        }
        C441120HRm c441120HRm = (C441120HRm) obj;
        return this.LIZ == c441120HRm.LIZ && this.LIZIZ == c441120HRm.LIZIZ && this.LIZJ == c441120HRm.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InProgress(static=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", animated=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", idType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC440540HPg
    public final int LIZ() {
        return this.LIZJ;
    }

    public C441120HRm(boolean z, boolean z2, int i) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
    }
}
