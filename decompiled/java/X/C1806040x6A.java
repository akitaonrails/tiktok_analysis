package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806040x6A implements InterfaceC1806820x7Q {
    public final InterfaceC1807440x8Q LIZ;
    public final InterfaceC1807440x8Q LIZIZ;
    public final InterfaceC1806620x76 LIZJ;
    public final String LIZLLL;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1806040x6A)) {
            return false;
        }
        C1806040x6A c1806040x6A = (C1806040x6A) obj;
        return Intrinsics.LJFF(this.LIZ, c1806040x6A.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1806040x6A.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1806040x6A.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1806040x6A.LIZLLL);
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 10;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC1806620x76 interfaceC1806620x76 = this.LIZJ;
        int iHashCode2 = (iHashCode + (interfaceC1806620x76 == null ? 0 : interfaceC1806620x76.hashCode())) * 31;
        String str = this.LIZLLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrengthenWebBannerGuideData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionBtnText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", actionBtnIcon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1806040x6A(C1807410x8N c1807410x8N, C1807410x8N c1807410x8N2, C1807340x8G c1807340x8G, String str) {
        this.LIZ = c1807410x8N;
        this.LIZIZ = c1807410x8N2;
        this.LIZJ = c1807340x8G;
        this.LIZLLL = str;
    }
}
