package X;

/* JADX INFO: renamed from: X.0d8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038620d8O {
    public final int LIZ;
    public final long LIZIZ;

    public C1038620d8O() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1038620d8O)) {
            return false;
        }
        C1038620d8O c1038620d8O = (C1038620d8O) obj;
        return this.LIZ == c1038620d8O.LIZ && this.LIZIZ == c1038620d8O.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipReplayStrategy(maxReplayCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", autoCloseDelayMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1038620d8O(int i, int i2) {
        long j;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 2) != 0) {
            j = 3000;
        } else {
            j = 0;
        }
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
