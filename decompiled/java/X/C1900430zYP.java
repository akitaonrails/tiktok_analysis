package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zYP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900430zYP implements InterfaceC0148002o {
    public final C291001Au<List<InterfaceC1891350zJl>> LL;
    public final EnumC1889520zGo LLILLJJLI;
    public final AbstractC1623806Xk<Unit> LLILLL;
    public final C291001Au<MusNotice> LLILZ;
    public final C291001Au<MusNotice> LLILZIL;
    public final C291001Au<Unit> LLILZLL;
    public final C291001Au<C1900610zYh> LLIZ;
    public final C291001Au<Unit> LLIZLLLIL;
    public final C291001Au<Unit> LLJ;
    public final List<Integer> LLJI;

    public C1900430zYP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900430zYP)) {
            return false;
        }
        C1900430zYP c1900430zYP = (C1900430zYP) obj;
        return Intrinsics.LJFF(this.LL, c1900430zYP.LL) && this.LLILLJJLI == c1900430zYP.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1900430zYP.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1900430zYP.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1900430zYP.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1900430zYP.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1900430zYP.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1900430zYP.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1900430zYP.LLJ) && Intrinsics.LJFF(this.LLJI, c1900430zYP.LLJI);
    }

    public final int hashCode() {
        C291001Au<List<InterfaceC1891350zJl>> c291001Au = this.LL;
        int iHashCode = (((((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<MusNotice> c291001Au2 = this.LLILZ;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<MusNotice> c291001Au3 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C1900610zYh> c291001Au5 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Unit> c291001Au6 = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<Unit> c291001Au7 = this.LLJ;
        int iHashCode7 = (iHashCode6 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        List<Integer> list = this.LLJI;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseNotificationResultState(itemList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", requestState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", deleteEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", longClickEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", netErrorToastEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", creatorTabChangeEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", clearAllTabUnReadCountEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", updateRedDotEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", resultFilterList=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1900430zYP(int i) {
        this(null, EnumC1889520zGo.COMPLETE, C491101vh.LIZ, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1900430zYP(C291001Au<? extends List<? extends InterfaceC1891350zJl>> c291001Au, EnumC1889520zGo enumC1889520zGo, AbstractC1623806Xk<Unit> abstractC1623806Xk, C291001Au<? extends MusNotice> c291001Au2, C291001Au<? extends MusNotice> c291001Au3, C291001Au<Unit> c291001Au4, C291001Au<C1900610zYh> c291001Au5, C291001Au<Unit> c291001Au6, C291001Au<Unit> c291001Au7, List<Integer> list) {
        this.LL = c291001Au;
        this.LLILLJJLI = enumC1889520zGo;
        this.LLILLL = abstractC1623806Xk;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = c291001Au4;
        this.LLIZ = c291001Au5;
        this.LLIZLLLIL = c291001Au6;
        this.LLJ = c291001Au7;
        this.LLJI = list;
    }

    public static C1900430zYP LIZ(C1900430zYP c1900430zYP, C291001Au c291001Au, EnumC1889520zGo enumC1889520zGo, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, List list, int i) {
        List list2 = list;
        C291001Au c291001Au8 = c291001Au7;
        C291001Au c291001Au9 = c291001Au6;
        C291001Au c291001Au10 = c291001Au5;
        C291001Au c291001Au11 = c291001Au4;
        C291001Au c291001Au12 = c291001Au3;
        C291001Au c291001Au13 = c291001Au2;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        EnumC1889520zGo enumC1889520zGo2 = enumC1889520zGo;
        C291001Au c291001Au14 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au14 = c1900430zYP.LL;
        }
        if ((i & 2) != 0) {
            enumC1889520zGo2 = c1900430zYP.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c1900430zYP.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au13 = c1900430zYP.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au12 = c1900430zYP.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au11 = c1900430zYP.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au10 = c1900430zYP.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au9 = c1900430zYP.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au8 = c1900430zYP.LLJ;
        }
        if ((i & 512) != 0) {
            list2 = c1900430zYP.LLJI;
        }
        c1900430zYP.getClass();
        return new C1900430zYP(c291001Au14, enumC1889520zGo2, abstractC1623806Xk2, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au9, c291001Au8, list2);
    }
}
