package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578990rBx implements InterfaceC1203250hPv {
    public final String LIZ;
    public final InterfaceC1183304k3 LIZIZ = null;
    public final InterfaceC1183304k3 LIZJ = null;
    public final boolean LIZLLL = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1578990rBx)) {
            return false;
        }
        C1578990rBx c1578990rBx = (C1578990rBx) obj;
        return Intrinsics.LJFF(this.LIZ, c1578990rBx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1578990rBx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1578990rBx.LIZJ) && this.LIZLLL == c1578990rBx.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1183304k3 interfaceC1183304k3 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (interfaceC1183304k3 == null ? 0 : interfaceC1183304k3.hashCode())) * 31;
        InterfaceC1183304k3 interfaceC1183304k32 = this.LIZJ;
        return ((iHashCode2 + (interfaceC1183304k32 != null ? interfaceC1183304k32.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelChip(label=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leadingIcon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trailingIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1578990rBx(String str) {
        this.LIZ = str;
    }
}
