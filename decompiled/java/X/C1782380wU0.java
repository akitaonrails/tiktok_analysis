package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782380wU0 implements InterfaceC1780030wQD {
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC1184004kA LIZJ;
    public final InterfaceC1184004kA LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782380wU0)) {
            return false;
        }
        C1782380wU0 c1782380wU0 = (C1782380wU0) obj;
        return Intrinsics.LJFF(this.LIZ, c1782380wU0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782380wU0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1782380wU0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1782380wU0.LIZLLL) && this.LJ == c1782380wU0.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC1184004kA interfaceC1184004kA = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (interfaceC1184004kA == null ? 0 : interfaceC1184004kA.hashCode())) * 31;
        InterfaceC1184004kA interfaceC1184004kA2 = this.LIZLLL;
        return ((iHashCode3 + (interfaceC1184004kA2 != null ? interfaceC1184004kA2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
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

    public C1782380wU0(String str, InterfaceC1184004kA interfaceC1184004kA, int i) {
        boolean z;
        interfaceC1184004kA = (i & 4) != 0 ? null : interfaceC1184004kA;
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = interfaceC1184004kA;
        this.LIZLLL = null;
        this.LJ = z;
    }
}
