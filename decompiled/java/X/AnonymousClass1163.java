package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import java.util.Map;

/* JADX INFO: renamed from: X.1163, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface AnonymousClass1163 {
    @InterfaceC1501200pAU("/aweme/v1/commerce/challenge/detail/")
    C15O7<ChallengeDetail> LIZ(@InterfaceC1501120pAM("ch_id") String str, @InterfaceC1501120pAM("hashtag_name") String str2, @InterfaceC1501120pAM("query_type") int i, @InterfaceC1501120pAM("click_reason") int i2);

    @InterfaceC1501200pAU("/aweme/v1/challenge/detail/")
    C15O7<ChallengeDetail> LIZIZ(@InterfaceC1501120pAM("ch_id") String str, @InterfaceC1501120pAM("hashtag_name") String str2, @InterfaceC1501120pAM("query_type") int i, @InterfaceC1501120pAM("click_reason") int i2);

    @InterfaceC1501200pAU("/aweme/v1/recommend/challenge/")
    ListenableFuture<ChallengeList> LIZJ(@InterfaceC1501260pAa Map<String, String> map);

    @InterfaceC1501200pAU
    ListenableFuture<ChallengeDetail> LIZLLL(@InterfaceC1485705rj String str, @InterfaceC1501260pAa Map<String, String> map);

    @InterfaceC1501240pAY("/aweme/v1/search/challengesug/")
    @InterfaceC1485505rh
    ListenableFuture<SearchSugChallengeList> LJ(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("is_non_personalized_search") Integer num);

    @InterfaceC1501200pAU
    ListenableFuture<ChallengeAwemeList> LJFF(@InterfaceC1485705rj String str, @InterfaceC1501260pAa Map<String, String> map);
}
