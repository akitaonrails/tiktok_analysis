package X;

/* JADX INFO: renamed from: X.0022, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0022 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0022)) {
            return false;
        }
        AnonymousClass0022 anonymousClass0022 = (AnonymousClass0022) obj;
        return this.LIZ == anonymousClass0022.LIZ && this.LIZIZ == anonymousClass0022.LIZIZ && this.LIZJ == anonymousClass0022.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixVideoOptCount(totalCnt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generatingCnt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", failedCnt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0022(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
