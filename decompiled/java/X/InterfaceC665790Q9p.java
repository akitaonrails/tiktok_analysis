package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchReviewAggregationHorizontalLoadMoreResponse;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchReviewAggregationLoadMoreResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC665790Q9p {
    @InterfaceC1501240pAY("/aweme/v1/search/horizontal/loadmore/")
    @InterfaceC1485505rh
    C11NZ<SearchReviewAggregationHorizontalLoadMoreResponse> LIZ(@InterfaceC1501100pAK("backtrace") String str, @InterfaceC1501100pAK("logid") String str2, @InterfaceC1501190pAT Map<String, Object> map);

    @InterfaceC1501240pAY("/aweme/v1/search/loadmore/")
    @InterfaceC1485505rh
    C11NZ<SearchReviewAggregationLoadMoreResponse> LIZIZ(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("type") Integer num, @InterfaceC1501100pAK("cursor") Integer num2, @InterfaceC1501100pAK("count") Integer num3, @InterfaceC1501100pAK("review_aggregation_unique_id") String str2, @InterfaceC1501190pAT Map<String, Object> map);
}
