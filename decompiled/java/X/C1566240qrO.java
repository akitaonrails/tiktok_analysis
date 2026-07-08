package X;

/* JADX INFO: renamed from: X.0qrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566240qrO {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1566240qrO)) {
            return false;
        }
        C1566240qrO c1566240qrO = (C1566240qrO) obj;
        return this.LIZ == c1566240qrO.LIZ && this.LIZIZ == c1566240qrO.LIZIZ && this.LIZJ == c1566240qrO.LIZJ && this.LIZLLL == c1566240qrO.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelTitleBarConfigInput(isFromSwitch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPortrait=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canRedirectV3=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isStrategyFirstRecharge=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1566240qrO(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
