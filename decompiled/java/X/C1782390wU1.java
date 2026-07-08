package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wU1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782390wU1 implements InterfaceC1780010wQB {
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC1183504k5 LIZJ;
    public final InterfaceC1183504k5 LIZLLL;
    public final boolean LJ;
    public final Float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782390wU1)) {
            return false;
        }
        C1782390wU1 c1782390wU1 = (C1782390wU1) obj;
        return Intrinsics.LJFF(this.LIZ, c1782390wU1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782390wU1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1782390wU1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1782390wU1.LIZLLL) && this.LJ == c1782390wU1.LJ && Intrinsics.LJFF(this.LJFF, c1782390wU1.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC1183504k5 interfaceC1183504k5 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (interfaceC1183504k5 == null ? 0 : interfaceC1183504k5.hashCode())) * 31;
        InterfaceC1183504k5 interfaceC1183504k52 = this.LIZLLL;
        int iHashCode4 = (((iHashCode3 + (interfaceC1183504k52 == null ? 0 : interfaceC1183504k52.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Float f = this.LJFF;
        return iHashCode4 + (f != null ? f.hashCode() : 0);
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
        sbLIZ.append(", forceTextSizeDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1782390wU1(String str, String str2, InterfaceC1183504k5 interfaceC1183504k5, int i) {
        boolean z;
        InterfaceC1183504k5 interfaceC1183504k52 = interfaceC1183504k5;
        String str3 = (i & 2) != 0 ? null : str2;
        interfaceC1183504k52 = (i & 4) != 0 ? null : interfaceC1183504k52;
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(str, str3, interfaceC1183504k52, null, z, null);
    }

    public C1782390wU1(String str, String str2, InterfaceC1183504k5 interfaceC1183504k5, InterfaceC1183504k5 interfaceC1183504k52, boolean z, Float f) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC1183504k5;
        this.LIZLLL = interfaceC1183504k52;
        this.LJ = z;
        this.LJFF = f;
    }
}
