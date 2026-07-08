package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.160C, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160C implements InterfaceC0148002o {
    public final C710840RuU LL;
    public final C160Z LLILLJJLI;
    public final C20703415zs LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C160C)) {
            return false;
        }
        C160C c160c = (C160C) obj;
        return Intrinsics.LJFF(this.LL, c160c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c160c.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c160c.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionViewState(captionDisplayUI=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tooltipState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", captionDebugData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C160C(C710840RuU c710840RuU, C160Z c160z, C20703415zs c20703415zs) {
        this.LL = c710840RuU;
        this.LLILLJJLI = c160z;
        this.LLILLL = c20703415zs;
    }

    public static C160C LIZ(C160C c160c, C710840RuU c710840RuU, C160Z c160z, C20703415zs c20703415zs, int i) {
        if ((i & 1) != 0) {
            c710840RuU = c160c.LL;
        }
        if ((i & 2) != 0) {
            c160z = c160c.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c20703415zs = c160c.LLILLL;
        }
        c160c.getClass();
        return new C160C(c710840RuU, c160z, c20703415zs);
    }
}
