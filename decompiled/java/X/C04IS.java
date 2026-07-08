package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;

/* JADX INFO: renamed from: X.04IS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04IS extends RuntimeException {
    public static final int $stable = 8;
    public final Response<ListReviewData> LL;

    public final Response<ListReviewData> getResponse() {
        return this.LL;
    }

    public C04IS(Response<ListReviewData> response, String str) {
        super(str);
        this.LL = response;
    }
}
