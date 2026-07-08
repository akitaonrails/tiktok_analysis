package X;

/* JADX INFO: renamed from: X.0qap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555970qap {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555970qap)) {
            return false;
        }
        C1555970qap c1555970qap = (C1555970qap) obj;
        return this.LIZ == c1555970qap.LIZ && this.LIZIZ == c1555970qap.LIZIZ && this.LIZJ == c1555970qap.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettlementPauseAction(isPause=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selfActive=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rivalActive=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555970qap(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
