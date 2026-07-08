package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P5U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P5U implements InterfaceC0148002o {
    public final Boolean LL;
    public final Boolean LLILLJJLI;

    public C0P5U() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P5U)) {
            return false;
        }
        C0P5U c0p5u = (C0P5U) obj;
        return Intrinsics.LJFF(this.LL, c0p5u.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0p5u.LLILLJJLI);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LLILLJJLI;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductVMState(enableReorderShopTab=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCurrentTabViewDrawEnd=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0P5U(Boolean bool, Boolean bool2) {
        this.LL = bool;
        this.LLILLJJLI = bool2;
    }
}
