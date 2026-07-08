package X;

/* JADX INFO: renamed from: X.04xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1267904xh {
    public final boolean LIZ;

    public C1267904xh() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1267904xh) && this.LIZ == ((C1267904xh) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrayPolicyState(isExtendedGiftScreenActive=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1267904xh(boolean z) {
        this.LIZ = z;
    }
}
