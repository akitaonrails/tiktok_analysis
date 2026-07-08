package X;

/* JADX INFO: renamed from: X.0IQ0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQ0 {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IQ0)) {
            return false;
        }
        C0IQ0 c0iq0 = (C0IQ0) obj;
        return this.LIZ == c0iq0.LIZ && this.LIZIZ == c0iq0.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusDegradeNotifyContent(titleRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IQ0(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
