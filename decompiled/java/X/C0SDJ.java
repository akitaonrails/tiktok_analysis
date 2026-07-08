package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDJ implements InterfaceC0148002o {
    public final Boolean LL;
    public final Boolean LLILLJJLI;
    public final Boolean LLILLL;
    public final EnumC21696919vj LLILZ;

    public C0SDJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SDJ)) {
            return false;
        }
        C0SDJ c0sdj = (C0SDJ) obj;
        return Intrinsics.LJFF(this.LL, c0sdj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0sdj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0sdj.LLILLL) && this.LLILZ == c0sdj.LLILZ;
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LLILLL;
        return ((iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellAreaState(isActive=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isExposed=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SDJ(int i) {
        this(null, null, null, EnumC21696919vj.INVALID);
    }

    public C0SDJ(Boolean bool, Boolean bool2, Boolean bool3, EnumC21696919vj enumC21696919vj) {
        this.LL = bool;
        this.LLILLJJLI = bool2;
        this.LLILLL = bool3;
        this.LLILZ = enumC21696919vj;
    }
}
