package X;

/* JADX INFO: renamed from: X.0sbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633550sbx {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public C1633550sbx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633550sbx)) {
            return false;
        }
        C1633550sbx c1633550sbx = (C1633550sbx) obj;
        return this.LIZ == c1633550sbx.LIZ && this.LIZIZ == c1633550sbx.LIZIZ && this.LIZJ == c1633550sbx.LIZJ && this.LIZLLL == c1633550sbx.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamRetryPolicy(maxRetries=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", retryEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1633550sbx(int i) {
        boolean z = !C04QV.LIZ();
        this.LIZ = 3;
        this.LIZIZ = 1000L;
        this.LIZJ = 20000L;
        this.LIZLLL = z;
    }
}
