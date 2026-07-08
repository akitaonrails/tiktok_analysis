package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04IH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04IH implements InterfaceC997603vC {
    public final Integer LL;
    public final String LLILLJJLI;
    public final List<ReviewFilterStruct> LLILLL;
    public final Boolean LLILZ;
    public final int LLILZIL = EnumC1752690vi7.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04IH)) {
            return false;
        }
        C04IH c04ih = (C04IH) obj;
        return Intrinsics.LJFF(this.LL, c04ih.LL) && Intrinsics.LJFF(this.LLILLJJLI, c04ih.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c04ih.LLILLL) && Intrinsics.LJFF(this.LLILZ, c04ih.LLILZ);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewFilterStruct> list = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.LLILZ;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpShopReviewTitleVO(reviewCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reviewCountStr=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reviewFilters=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showDivider=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILZIL;
    }

    public C04IH(Boolean bool, Integer num, String str, List list) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = bool;
    }
}
