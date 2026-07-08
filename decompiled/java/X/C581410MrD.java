package X;

/* JADX INFO: renamed from: X.0MrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581410MrD {
    public final boolean LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C581410MrD)) {
            return false;
        }
        C581410MrD c581410MrD = (C581410MrD) obj;
        return this.LIZ == c581410MrD.LIZ && this.LIZIZ == c581410MrD.LIZIZ && this.LIZJ == c581410MrD.LIZJ && this.LIZLLL == c581410MrD.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(shouldDelay=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", predictionStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", predictClass=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C581410MrD(int i, int i2, int i3) {
        this(false, 0L, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2);
    }

    public C581410MrD(boolean z, long j, int i, int i2) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
