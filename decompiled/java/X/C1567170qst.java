package X;

/* JADX INFO: renamed from: X.0qst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567170qst {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567170qst)) {
            return false;
        }
        C1567170qst c1567170qst = (C1567170qst) obj;
        return this.LIZ == c1567170qst.LIZ && this.LIZIZ == c1567170qst.LIZIZ && this.LIZJ == c1567170qst.LIZJ && this.LIZLLL == c1567170qst.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyKey(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", countLimit=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dayLimit=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1567170qst() {
        this(0L, 0L, 0L, 0L);
    }

    public C1567170qst(long j, long j2, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
    }
}
