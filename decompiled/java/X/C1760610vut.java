package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760610vut extends C11T1<ReviewApi.ListShopReviewRequest, ListShopReviewData> {
    public final HashMap<ReviewApi.ListShopReviewRequest, ListShopReviewData> LIZIZ = new HashMap<>();

    @Override // X.C11T1
    public final List<Pair<ReviewApi.ListShopReviewRequest, ListShopReviewData>> LJ() {
        return C2097808Js.LJIL(this.LIZIZ);
    }

    public final void LJI() {
        this.LIZIZ.clear();
    }

    @Override // X.C11T1
    public final ListShopReviewData LIZ(ReviewApi.ListShopReviewRequest listShopReviewRequest) {
        return this.LIZIZ.get(listShopReviewRequest);
    }

    @Override // X.C11T1
    public final void LJFF(ReviewApi.ListShopReviewRequest listShopReviewRequest, ListShopReviewData listShopReviewData) {
        ListShopReviewData listShopReviewData2 = listShopReviewData;
        if (listShopReviewData2 != null && listShopReviewData2.reviewItems != null) {
            this.LIZIZ.put(listShopReviewRequest, listShopReviewData2);
        }
    }
}
