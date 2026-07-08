package X;

/* JADX INFO: renamed from: X.0gF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158110gF7 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158110gF7)) {
            return false;
        }
        C1158110gF7 c1158110gF7 = (C1158110gF7) obj;
        return this.LIZ == c1158110gF7.LIZ && this.LIZIZ == c1158110gF7.LIZIZ && this.LIZJ == c1158110gF7.LIZJ && this.LIZLLL == c1158110gF7.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Thresholds(low=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", medium=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", high=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extreme=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158110gF7(long j, long j2, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
    }
}
