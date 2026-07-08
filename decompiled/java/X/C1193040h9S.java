package X;

import com.ss.android.ugc.aweme.poi.osp.repo.model.GuidelinePopupData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceBreakdownData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193040h9S implements InterfaceC0148002o {
    public final EnumC1192930h9H LL;
    public final PriceBreakdownData LLILLJJLI;
    public final GuidelinePopupData LLILLL;
    public final C1193050h9T LLILZ;

    public C1193040h9S() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193040h9S)) {
            return false;
        }
        C1193040h9S c1193040h9S = (C1193040h9S) obj;
        return this.LL == c1193040h9S.LL && Intrinsics.LJFF(this.LLILLJJLI, c1193040h9S.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1193040h9S.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1193040h9S.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        PriceBreakdownData priceBreakdownData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (priceBreakdownData == null ? 0 : priceBreakdownData.hashCode())) * 31;
        GuidelinePopupData guidelinePopupData = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (guidelinePopupData == null ? 0 : guidelinePopupData.hashCode())) * 31;
        C1193050h9T c1193050h9T = this.LLILZ;
        return iHashCode3 + (c1193050h9T != null ? c1193050h9T.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiOrderSubmitSheetState(showSheetType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", priceBreakdownData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", guidelinePopupData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", placeOrderButtonInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1193040h9S(int i) {
        this(EnumC1192930h9H.NONE, null, null, null);
    }

    public C1193040h9S(EnumC1192930h9H enumC1192930h9H, PriceBreakdownData priceBreakdownData, GuidelinePopupData guidelinePopupData, C1193050h9T c1193050h9T) {
        this.LL = enumC1192930h9H;
        this.LLILLJJLI = priceBreakdownData;
        this.LLILLL = guidelinePopupData;
        this.LLILZ = c1193050h9T;
    }

    public static C1193040h9S LIZ(C1193040h9S c1193040h9S, EnumC1192930h9H enumC1192930h9H, PriceBreakdownData priceBreakdownData, GuidelinePopupData guidelinePopupData, C1193050h9T c1193050h9T, int i) {
        if ((i & 1) != 0) {
            enumC1192930h9H = c1193040h9S.LL;
        }
        if ((i & 2) != 0) {
            priceBreakdownData = c1193040h9S.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            guidelinePopupData = c1193040h9S.LLILLL;
        }
        if ((i & 8) != 0) {
            c1193050h9T = c1193040h9S.LLILZ;
        }
        c1193040h9S.getClass();
        return new C1193040h9S(enumC1192930h9H, priceBreakdownData, guidelinePopupData, c1193050h9T);
    }
}
