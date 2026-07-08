package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1056204Bc implements InterfaceC1755100vm0 {
    public final PromotionEntrance LL;
    public final boolean LLILLJJLI;
    public final List<RelateProduct> LLILLL;
    public final boolean LLILZ;

    @Override // X.InterfaceC1755100vm0
    public final String LIZ() {
        return "promotion";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056204Bc)) {
            return false;
        }
        C1056204Bc c1056204Bc = (C1056204Bc) obj;
        return Intrinsics.LJFF(this.LL, c1056204Bc.LL) && this.LLILLJJLI == c1056204Bc.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1056204Bc.LLILLL) && this.LLILZ == c1056204Bc.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        List<RelateProduct> list = this.LLILLL;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaProductPromotionForUSVO(promotionEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isShowSplitLine=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", relatedProduct=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", needPaddingTop=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1056204Bc(PromotionEntrance promotionEntrance) {
        this(promotionEntrance, false, null, true);
    }

    public C1056204Bc(PromotionEntrance promotionEntrance, boolean z, List<RelateProduct> list, boolean z2) {
        this.LL = promotionEntrance;
        this.LLILLJJLI = z;
        this.LLILLL = list;
        this.LLILZ = z2;
    }
}
