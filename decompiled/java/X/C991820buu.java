package X;

/* JADX INFO: renamed from: X.0buu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991820buu implements InterfaceC1785520wZ4 {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991820buu)) {
            return false;
        }
        C991820buu c991820buu = (C991820buu) obj;
        return this.LIZ == c991820buu.LIZ && this.LIZIZ == c991820buu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstTabSelected(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991820buu(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
