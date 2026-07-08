package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zYC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900300zYC implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final C291001Au<EnumC1889520zGo> LLILLJJLI;
    public final AbstractC1623806Xk<List<InterfaceC1891350zJl>> LLILLL;
    public final C291001Au<Object> LLILZ;
    public final C291001Au<C1245080iVO> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<C1800330wwx> LLIZ;
    public final C291001Au<Integer> LLIZLLLIL;

    public C1900300zYC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900300zYC)) {
            return false;
        }
        C1900300zYC c1900300zYC = (C1900300zYC) obj;
        return Intrinsics.LJFF(this.LL, c1900300zYC.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1900300zYC.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1900300zYC.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1900300zYC.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1900300zYC.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1900300zYC.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1900300zYC.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1900300zYC.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Object> c291001Au = this.LLILZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C1245080iVO> c291001Au2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<C1800330wwx> c291001Au4 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Integer> c291001Au5 = this.LLIZLLLIL;
        return iHashCode5 + (c291001Au5 != null ? c291001Au5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerResultState(itemList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", requestStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showSheetEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", deleteStateEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isRefreshResponseReturn=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", showErrorToast=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", tabModelCountAssemEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1900300zYC(int i) {
        this(C13BV.INSTANCE, new C291001Au(EnumC1889520zGo.COMPLETE), C491101vh.LIZ, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1900300zYC(List<? extends InterfaceC1891350zJl> list, C291001Au<? extends EnumC1889520zGo> c291001Au, AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk, C291001Au<? extends Object> c291001Au2, C291001Au<C1245080iVO> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<C1800330wwx> c291001Au5, C291001Au<Integer> c291001Au6) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = abstractC1623806Xk;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = c291001Au4;
        this.LLIZ = c291001Au5;
        this.LLIZLLLIL = c291001Au6;
    }

    public static C1900300zYC LIZ(C1900300zYC c1900300zYC, List list, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, int i) {
        C291001Au c291001Au7 = c291001Au6;
        C291001Au c291001Au8 = c291001Au5;
        C291001Au c291001Au9 = c291001Au4;
        C291001Au c291001Au10 = c291001Au3;
        C291001Au c291001Au11 = c291001Au2;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C291001Au c291001Au12 = c291001Au;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c1900300zYC.LL;
        }
        if ((i & 2) != 0) {
            c291001Au12 = c1900300zYC.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c1900300zYC.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au11 = c1900300zYC.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au10 = c1900300zYC.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au9 = c1900300zYC.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au8 = c1900300zYC.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au7 = c1900300zYC.LLIZLLLIL;
        }
        c1900300zYC.getClass();
        return new C1900300zYC(list2, c291001Au12, abstractC1623806Xk2, c291001Au11, c291001Au10, c291001Au9, c291001Au8, c291001Au7);
    }
}
