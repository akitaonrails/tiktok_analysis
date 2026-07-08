package X;

/* JADX INFO: renamed from: X.0d8M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038600d8M {
    public final boolean LIZ;
    public final long LIZIZ;

    public C1038600d8M() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1038600d8M)) {
            return false;
        }
        C1038600d8M c1038600d8M = (C1038600d8M) obj;
        return this.LIZ == c1038600d8M.LIZ && this.LIZIZ == c1038600d8M.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipShowStrategy(startShowWithInteractMask=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maskDelayHideMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1038600d8M(boolean z, int i) {
        long j;
        z = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            j = 2000;
        } else {
            j = 0;
        }
        this(z, j);
    }

    public C1038600d8M(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
