package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582480rHa implements InterfaceC1203260hPw {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    public C1582480rHa() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582480rHa)) {
            return false;
        }
        C1582480rHa c1582480rHa = (C1582480rHa) obj;
        return Intrinsics.LJFF(this.LIZ, c1582480rHa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1582480rHa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1582480rHa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1582480rHa.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LIZLLL;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleSelect(customBackgroundColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customForegroundColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customUnselectedBackgroundColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", customUnselectedForegroundColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1203260hPw
    public final Integer LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1203260hPw
    public final Integer LIZIZ() {
        return this.LIZJ;
    }

    public C1582480rHa(Integer num, Integer num2, Integer num3, Integer num4) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
        this.LIZLLL = num4;
    }
}
