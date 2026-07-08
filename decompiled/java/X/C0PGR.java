package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PGR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGR implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final SearchTopBarStruct LLILLL;
    public final C291001Au<SearchTopBarStruct> LLILZ;
    public final Integer LLILZIL;
    public final Integer LLILZLL;
    public final Boolean LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final int LLJ;

    public C0PGR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PGR)) {
            return false;
        }
        C0PGR c0pgr = (C0PGR) obj;
        return this.LL == c0pgr.LL && this.LLILLJJLI == c0pgr.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0pgr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0pgr.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0pgr.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0pgr.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0pgr.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0pgr.LLIZLLLIL) && this.LLJ == c0pgr.LLJ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        SearchTopBarStruct searchTopBarStruct = this.LLILLL;
        int iHashCode = (((iZ2 + (searchTopBarStruct == null ? 0 : searchTopBarStruct.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        Integer num = this.LLILZIL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.LLIZ;
        return ((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTopBarState(useCache=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isInternalRefresh=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cachedData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateDataEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", currentShowedHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", currentHidedHeight=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", returnFromDetailEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", firstViewHolderTopMargin=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0PGR(int i) {
        this(false, false, null, new C291001Au(null), null, null, null, new C291001Au(Boolean.FALSE), 8);
    }

    public C0PGR(boolean z, boolean z2, SearchTopBarStruct searchTopBarStruct, C291001Au<SearchTopBarStruct> c291001Au, Integer num, Integer num2, Boolean bool, C291001Au<Boolean> c291001Au2, int i) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = searchTopBarStruct;
        this.LLILZ = c291001Au;
        this.LLILZIL = num;
        this.LLILZLL = num2;
        this.LLIZ = bool;
        this.LLIZLLLIL = c291001Au2;
        this.LLJ = i;
    }

    public static C0PGR LIZ(C0PGR c0pgr, boolean z, boolean z2, SearchTopBarStruct searchTopBarStruct, C291001Au c291001Au, Integer num, Integer num2, Boolean bool, C291001Au c291001Au2, int i, int i2) {
        int i3 = i;
        C291001Au c291001Au3 = c291001Au2;
        Boolean bool2 = bool;
        Integer num3 = num2;
        Integer num4 = num;
        C291001Au c291001Au4 = c291001Au;
        SearchTopBarStruct searchTopBarStruct2 = searchTopBarStruct;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i2 & 1) != 0) {
            z4 = c0pgr.LL;
        }
        if ((i2 & 2) != 0) {
            z3 = c0pgr.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            searchTopBarStruct2 = c0pgr.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au4 = c0pgr.LLILZ;
        }
        if ((i2 & 16) != 0) {
            num4 = c0pgr.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            num3 = c0pgr.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            bool2 = c0pgr.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c291001Au3 = c0pgr.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            i3 = c0pgr.LLJ;
        }
        c0pgr.getClass();
        return new C0PGR(z4, z3, searchTopBarStruct2, c291001Au4, num4, num3, bool2, c291001Au3, i3);
    }
}
