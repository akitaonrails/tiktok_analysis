package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820790xTx implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1820630xTh> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final Boolean LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<AbstractC1821320xUo> LLIZ;
    public final C291001Au<C1821160xUY> LLIZLLLIL;

    public C1820790xTx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1820790xTx)) {
            return false;
        }
        C1820790xTx c1820790xTx = (C1820790xTx) obj;
        return Intrinsics.LJFF(this.LL, c1820790xTx.LL) && this.LLILLJJLI == c1820790xTx.LLILLJJLI && this.LLILLL == c1820790xTx.LLILLL && this.LLILZ == c1820790xTx.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1820790xTx.LLILZIL) && this.LLILZLL == c1820790xTx.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1820790xTx.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1820790xTx.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C291001Au<AbstractC1821320xUo> c291001Au = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C1821160xUY> c291001Au2 = this.LLIZLLLIL;
        return iHashCode3 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneStopPageState(mainPageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFooterVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isButtonLoading=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isTopBarTransparent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isLeadOptInClickCompleted=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isUsingCache=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", scrollToTips=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1820790xTx(int i) {
        this(new C1623706Xj(), false, false, true, Boolean.FALSE, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1820790xTx(AbstractC1623806Xk<C1820630xTh> abstractC1623806Xk, boolean z, boolean z2, boolean z3, Boolean bool, boolean z4, C291001Au<? extends AbstractC1821320xUo> c291001Au, C291001Au<C1821160xUY> c291001Au2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = bool;
        this.LLILZLL = z4;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = c291001Au2;
    }

    public static C1820790xTx LIZ(C1820790xTx c1820790xTx, AbstractC1623806Xk abstractC1623806Xk, boolean z, boolean z2, boolean z3, Boolean bool, boolean z4, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        boolean z5 = z4;
        Boolean bool2 = bool;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1820790xTx.LL;
        }
        if ((i & 2) != 0) {
            z8 = c1820790xTx.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z7 = c1820790xTx.LLILLL;
        }
        if ((i & 8) != 0) {
            z6 = c1820790xTx.LLILZ;
        }
        if ((i & 16) != 0) {
            bool2 = c1820790xTx.LLILZIL;
        }
        if ((i & 32) != 0) {
            z5 = c1820790xTx.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au4 = c1820790xTx.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au3 = c1820790xTx.LLIZLLLIL;
        }
        c1820790xTx.getClass();
        return new C1820790xTx(abstractC1623806Xk2, z8, z7, z6, bool2, z5, c291001Au4, c291001Au3);
    }
}
