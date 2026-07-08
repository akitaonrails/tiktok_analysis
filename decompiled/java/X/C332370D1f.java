package X;

/* JADX INFO: renamed from: X.0D1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332370D1f {
    public final int LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C332370D1f() {
        this(0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332370D1f)) {
            return false;
        }
        C332370D1f c332370D1f = (C332370D1f) obj;
        return this.LIZ == c332370D1f.LIZ && this.LIZIZ == c332370D1f.LIZIZ && this.LIZJ == c332370D1f.LIZJ && this.LIZLLL == c332370D1f.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVideoPreloadConfig(maxConcurrentTasks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", preloadSizeBytes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332370D1f(int i, int i2) {
        int i3;
        long j;
        if ((i2 & 1) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            j = 30000;
        } else {
            j = 0;
        }
        int i4 = (i2 & 4) != 0 ? 3 : 0;
        i = (i2 & 8) != 0 ? 819200 : i;
        this.LIZ = i3;
        this.LIZIZ = j;
        this.LIZJ = i4;
        this.LIZLLL = i;
    }
}
