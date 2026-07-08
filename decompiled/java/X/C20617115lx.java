package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20617115lx implements InterfaceC0148002o {
    public final List<C20618015m6> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final C20617715m3 LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20617115lx)) {
            return false;
        }
        C20617115lx c20617115lx = (C20617115lx) obj;
        return Intrinsics.LJFF(this.LL, c20617115lx.LL) && this.LLILLJJLI == c20617115lx.LLILLJJLI && this.LLILLL == c20617115lx.LLILLL && this.LLILZ == c20617115lx.LLILZ && Intrinsics.LJFF(this.LLILZIL, c20617115lx.LLILZIL) && this.LLILZLL == c20617115lx.LLILZLL && this.LLIZ == c20617115lx.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c20617115lx.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        C291001Au<Boolean> c291001Au = this.LLIZLLLIL;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactSelectState(editShareSelectDataList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showGoToChat=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showNoResult=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scrollToTopCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", openSendToPanelBundle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showMoreFriends=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", loadFinish=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", toggleSearchModeEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20617115lx(List<C20618015m6> list, boolean z, boolean z2, int i, C20617715m3 c20617715m3, boolean z3, boolean z4, C291001Au<Boolean> c291001Au) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = i;
        this.LLILZIL = c20617715m3;
        this.LLILZLL = z3;
        this.LLIZ = z4;
        this.LLIZLLLIL = c291001Au;
    }

    public static C20617115lx LIZ(C20617115lx c20617115lx, List list, boolean z, boolean z2, int i, C20617715m3 c20617715m3, boolean z3, boolean z4, int i2) {
        C291001Au<Boolean> c291001Au;
        boolean z5 = z4;
        boolean z6 = z3;
        C20617715m3 c20617715m32 = c20617715m3;
        int i3 = i;
        boolean z7 = z2;
        boolean z8 = z;
        List list2 = list;
        if ((i2 & 1) != 0) {
            list2 = c20617115lx.LL;
        }
        if ((i2 & 2) != 0) {
            z8 = c20617115lx.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z7 = c20617115lx.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i3 = c20617115lx.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c20617715m32 = c20617115lx.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z6 = c20617115lx.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z5 = c20617115lx.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c291001Au = c20617115lx.LLIZLLLIL;
        } else {
            c291001Au = null;
        }
        c20617115lx.getClass();
        return new C20617115lx(list2, z8, z7, i3, c20617715m32, z6, z5, c291001Au);
    }
}
