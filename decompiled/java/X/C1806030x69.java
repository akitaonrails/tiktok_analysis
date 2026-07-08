package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806030x69 implements InterfaceC1806810x7P {
    public final C1803830x2b LIZ;
    public final C1797200wru LIZIZ;
    public final InterfaceC1807440x8Q LIZJ;
    public final InterfaceC1807440x8Q LIZLLL;
    public final InterfaceC1806620x76 LJ;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1806030x69)) {
            return false;
        }
        C1806030x69 c1806030x69 = (C1806030x69) obj;
        return Intrinsics.LJFF(this.LIZ, c1806030x69.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1806030x69.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1806030x69.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1806030x69.LIZLLL) && Intrinsics.LJFF(this.LJ, c1806030x69.LJ);
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 9;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC1807440x8Q interfaceC1807440x8Q = this.LIZJ;
        int iHashCode2 = (iHashCode + (interfaceC1807440x8Q == null ? 0 : interfaceC1807440x8Q.hashCode())) * 31;
        InterfaceC1807440x8Q interfaceC1807440x8Q2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (interfaceC1807440x8Q2 == null ? 0 : interfaceC1807440x8Q2.hashCode())) * 31;
        InterfaceC1806620x76 interfaceC1806620x76 = this.LJ;
        return iHashCode3 + (interfaceC1806620x76 != null ? interfaceC1806620x76.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargeErrorItemData(rechargeDialogConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1806030x69(C1803830x2b c1803830x2b, C1797200wru c1797200wru, C1807410x8N c1807410x8N, C1807410x8N c1807410x8N2, C1807340x8G c1807340x8G) {
        this.LIZ = c1803830x2b;
        this.LIZIZ = c1797200wru;
        this.LIZJ = c1807410x8N;
        this.LIZLLL = c1807410x8N2;
        this.LJ = c1807340x8G;
    }
}
