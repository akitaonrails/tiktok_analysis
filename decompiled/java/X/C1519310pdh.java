package X;

/* JADX INFO: renamed from: X.0pdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519310pdh {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1519310pdh)) {
            return false;
        }
        C1519310pdh c1519310pdh = (C1519310pdh) obj;
        return this.LIZ == c1519310pdh.LIZ && this.LIZIZ == c1519310pdh.LIZIZ && this.LIZJ == c1519310pdh.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupDeferralSnapshot(untilNujFinishes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", untilLoginPanelDismissed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", untilPostRegistrationFinishes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1519310pdh(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
