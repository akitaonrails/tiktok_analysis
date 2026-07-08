package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805590x5R implements InterfaceC1806790x7N {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805590x5R)) {
            return false;
        }
        C1805590x5R c1805590x5R = (C1805590x5R) obj;
        return Intrinsics.LJFF(this.LIZ, c1805590x5R.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1805590x5R.LIZIZ) && this.LIZJ == c1805590x5R.LIZJ && this.LIZLLL == c1805590x5R.LIZLLL && this.LJ == c1805590x5R.LJ;
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 13;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletBalanceInfoData(diamondBalance=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needCoinsText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showNegativeGuide=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasFrozenCoins=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showExchangeEntrance=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1805590x5R(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
