package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04IE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04IE implements InterfaceC997603vC {
    public final Float LL;
    public final Integer LLILLJJLI;
    public final List<ReviewFilterStruct> LLILLL;
    public final String LLILZ;
    public final List<ReviewAspectPercentageCard> LLILZIL;
    public final ProductDetailReview LLILZLL;
    public final String LLIZ;
    public final FeedbackVoteData LLIZLLLIL;
    public final int LLJ = EnumC1752690vi7.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04IE)) {
            return false;
        }
        C04IE c04ie = (C04IE) obj;
        return Intrinsics.LJFF(this.LL, c04ie.LL) && Intrinsics.LJFF(this.LLILLJJLI, c04ie.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c04ie.LLILLL) && Intrinsics.LJFF(this.LLILZ, c04ie.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c04ie.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c04ie.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c04ie.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c04ie.LLIZLLLIL);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        Float f = this.LL;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewFilterStruct> list = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewAspectPercentageCard> list2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FeedbackVoteData feedbackVoteData = this.LLIZLLLIL;
        return iHashCode7 + (feedbackVoteData != null ? feedbackVoteData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpReviewTitleVO(rating=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reviewCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reviewFilters=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", reviewCountStr=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", reviewAspectPercentageCard=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", productDetailReview=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", ratingPolicyPageSchema=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", feedbackVoteData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJ;
    }

    public C04IE(Float f, Integer num, List<ReviewFilterStruct> list, String str, List<ReviewAspectPercentageCard> list2, ProductDetailReview productDetailReview, String str2, FeedbackVoteData feedbackVoteData) {
        this.LL = f;
        this.LLILLJJLI = num;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = list2;
        this.LLILZLL = productDetailReview;
        this.LLIZ = str2;
        this.LLIZLLLIL = feedbackVoteData;
    }
}
