package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760600vus extends C11T1<ReviewApi.ReviewRequest, ListReviewData> {
    public final HashMap<ReviewApi.ReviewRequest, ListReviewData> LIZIZ = new HashMap<>();

    @Override // X.C11T1
    public final List<Pair<ReviewApi.ReviewRequest, ListReviewData>> LJ() {
        return C2097808Js.LJIL(this.LIZIZ);
    }

    public final void LJI() {
        this.LIZIZ.clear();
    }

    @Override // X.C11T1
    public final ListReviewData LIZ(ReviewApi.ReviewRequest reviewRequest) {
        return this.LIZIZ.get(reviewRequest);
    }

    @Override // X.C11T1
    public final void LJFF(ReviewApi.ReviewRequest reviewRequest, ListReviewData listReviewData) {
        ListReviewData listReviewData2 = listReviewData;
        if (listReviewData2 != null && listReviewData2.reviewItems != null) {
            this.LIZIZ.put(reviewRequest, listReviewData2);
        }
    }
}
