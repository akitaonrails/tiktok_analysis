package X;

/* JADX INFO: renamed from: X.0M29, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M29 {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M29)) {
            return false;
        }
        C0M29 c0m29 = (C0M29) obj;
        return this.LIZ == c0m29.LIZ && this.LIZIZ == c0m29.LIZIZ && this.LIZJ == c0m29.LIZJ && this.LIZLLL == c0m29.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntroStats(totalCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oldCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", oldBytes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M29(int i, int i2, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
