package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615610s91 implements InterfaceC1614510s7F {
    public final String LIZ;
    public final String LIZIZ = null;
    public final InterfaceC1182904jz LIZJ = null;
    public final InterfaceC1182904jz LIZLLL = null;
    public final boolean LJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1615610s91)) {
            return false;
        }
        C1615610s91 c1615610s91 = (C1615610s91) obj;
        return Intrinsics.LJFF(this.LIZ, c1615610s91.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1615610s91.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1615610s91.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1615610s91.LIZLLL) && this.LJ == c1615610s91.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC1182904jz interfaceC1182904jz = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (interfaceC1182904jz == null ? 0 : interfaceC1182904jz.hashCode())) * 31;
        InterfaceC1182904jz interfaceC1182904jz2 = this.LIZLLL;
        return ((iHashCode3 + (interfaceC1182904jz2 != null ? interfaceC1182904jz2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleSegment(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", leadingIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trailingIcon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1615610s91(String str) {
        this.LIZ = str;
    }
}
