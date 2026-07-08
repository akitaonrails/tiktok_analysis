package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02uT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C738302uT extends AbstractC756202xM {
    public final C722902rz LLILZLL;
    public final C719302rP LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI = "logistics_module";
    public final String LLJIJIL = "logistics_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C738302uT)) {
            return false;
        }
        C738302uT c738302uT = (C738302uT) obj;
        return Intrinsics.LJFF(this.LLILZLL, c738302uT.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c738302uT.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c738302uT.LLIZLLLIL) && this.LLJ == c738302uT.LLJ;
    }

    public final int hashCode() {
        C722902rz c722902rz = this.LLILZLL;
        int iHashCode = (c722902rz == null ? 0 : c722902rz.hashCode()) * 31;
        C719302rP c719302rP = this.LLIZ;
        int iHashCode2 = (iHashCode + (c719302rP == null ? 0 : c719302rP.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USHalfLogisticsVO(halfMainOrderInfoVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", aggregationOrderVO=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", logisticsTitle=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", available=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJI;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C738302uT;
    }

    public C738302uT(C722902rz c722902rz, C719302rP c719302rP, String str, boolean z) {
        this.LLILZLL = c722902rz;
        this.LLIZ = c719302rP;
        this.LLIZLLLIL = str;
        this.LLJ = z;
    }
}
