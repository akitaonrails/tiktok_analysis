package X;

/* JADX INFO: renamed from: X.0LN2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LN2 implements C0LN4 {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public C0LN2() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LN2)) {
            return false;
        }
        C0LN2 c0ln2 = (C0LN2) obj;
        return this.LIZ == c0ln2.LIZ && this.LIZIZ == c0ln2.LIZIZ && this.LIZJ == c0ln2.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cacheSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0LN2(int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(i2, 0L, 0L);
    }

    public C0LN2(int i, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
