package X;

/* JADX INFO: renamed from: X.0g8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154040g8Y implements InterfaceC1154050g8Z {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154040g8Y)) {
            return false;
        }
        C1154040g8Y c1154040g8Y = (C1154040g8Y) obj;
        return this.LIZ == c1154040g8Y.LIZ && this.LIZIZ == c1154040g8Y.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected(modified=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromChild=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154040g8Y(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
