package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710290ubj implements InterfaceC0148002o {
    public final C291001Au<List<Object>> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Object> LLILZ;
    public final C291001Au<String> LLILZIL;
    public final C291001Au<Object> LLILZLL;
    public final C291001Au<Object> LLIZ;
    public final C291001Au<Object> LLIZLLLIL;
    public final EnumC1709190uZx LLJ;
    public final C291001Au<Object> LLJI;

    public C1710290ubj() {
        this(null, false, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1710290ubj)) {
            return false;
        }
        C1710290ubj c1710290ubj = (C1710290ubj) obj;
        return Intrinsics.LJFF(this.LL, c1710290ubj.LL) && this.LLILLJJLI == c1710290ubj.LLILLJJLI && this.LLILLL == c1710290ubj.LLILLL && Intrinsics.LJFF(this.LLILZ, c1710290ubj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1710290ubj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1710290ubj.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1710290ubj.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1710290ubj.LLIZLLLIL) && this.LLJ == c1710290ubj.LLJ && Intrinsics.LJFF(this.LLJI, c1710290ubj.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C291001Au<Object> c291001Au = this.LLILZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<String> c291001Au2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Object> c291001Au3 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Object> c291001Au4 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Object> c291001Au5 = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        EnumC1709190uZx enumC1709190uZx = this.LLJ;
        int iHashCode7 = (iHashCode6 + (enumC1709190uZx == null ? 0 : enumC1709190uZx.hashCode())) * 31;
        C291001Au<Object> c291001Au6 = this.LLJI;
        return iHashCode7 + (c291001Au6 != null ? c291001Au6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierState(items=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bottomBtnEnabled=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateSection=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showNeedSelectOtherPMBlock=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", openDirectCheckoutCCDC=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", openIndependentCVV=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", dismissReason=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", selectedPaymentInfoChanged=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1710290ubj(C291001Au c291001Au, boolean z, C291001Au c291001Au2, int i) {
        this((i & 1) != 0 ? new C291001Au(C13BV.INSTANCE) : c291001Au, (i & 2) != 0 ? false : z, false, null, null, null, null, null, null, (i & 512) != 0 ? null : c291001Au2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1710290ubj(C291001Au<? extends List<? extends Object>> c291001Au, boolean z, boolean z2, C291001Au<? extends Object> c291001Au2, C291001Au<String> c291001Au3, C291001Au<? extends Object> c291001Au4, C291001Au<? extends Object> c291001Au5, C291001Au<? extends Object> c291001Au6, EnumC1709190uZx enumC1709190uZx, C291001Au<? extends Object> c291001Au7) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = c291001Au4;
        this.LLIZ = c291001Au5;
        this.LLIZLLLIL = c291001Au6;
        this.LLJ = enumC1709190uZx;
        this.LLJI = c291001Au7;
    }

    public static C1710290ubj LIZ(C1710290ubj c1710290ubj, C291001Au c291001Au, boolean z, boolean z2, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, EnumC1709190uZx enumC1709190uZx, C291001Au c291001Au6, int i) {
        C291001Au<Object> c291001Au7;
        C291001Au c291001Au8 = c291001Au6;
        EnumC1709190uZx enumC1709190uZx2 = enumC1709190uZx;
        C291001Au c291001Au9 = c291001Au5;
        C291001Au c291001Au10 = c291001Au4;
        C291001Au c291001Au11 = c291001Au3;
        C291001Au c291001Au12 = c291001Au2;
        boolean z3 = z2;
        boolean z4 = z;
        C291001Au c291001Au13 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au13 = c1710290ubj.LL;
        }
        if ((i & 2) != 0) {
            z4 = c1710290ubj.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z3 = c1710290ubj.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au7 = c1710290ubj.LLILZ;
        } else {
            c291001Au7 = null;
        }
        if ((i & 16) != 0) {
            c291001Au12 = c1710290ubj.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au11 = c1710290ubj.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au10 = c1710290ubj.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au9 = c1710290ubj.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            enumC1709190uZx2 = c1710290ubj.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au8 = c1710290ubj.LLJI;
        }
        c1710290ubj.getClass();
        return new C1710290ubj(c291001Au13, z4, z3, c291001Au7, c291001Au12, c291001Au11, c291001Au10, c291001Au9, enumC1709190uZx2, c291001Au8);
    }
}
