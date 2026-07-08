package X;

/* JADX INFO: renamed from: X.0V05, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V05 {
    public final boolean LIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0V05) && this.LIZ == ((C0V05) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PayloadInviteStatus(invited=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
