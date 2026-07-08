package X;

/* JADX INFO: renamed from: X.0gD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156810gD1 implements InterfaceC1156820gD2 {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156810gD1)) {
            return false;
        }
        C1156810gD1 c1156810gD1 = (C1156810gD1) obj;
        return this.LIZ == c1156810gD1.LIZ && this.LIZIZ == c1156810gD1.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecUserPopNegativeFeedbackContext(didAction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalShowTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156810gD1() {
        this(false, 0L);
    }

    public C1156810gD1(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
