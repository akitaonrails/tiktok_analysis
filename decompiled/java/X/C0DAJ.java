package X;

/* JADX INFO: renamed from: X.0DAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAJ extends C0DAW {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAJ) && this.LIZ == ((C0DAJ) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BuildCashierToken(isAcpScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAJ(boolean z) {
        this.LIZ = z;
    }
}
