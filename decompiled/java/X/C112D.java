package X;

import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse;
import com.ss.android.ugc.gamora.editor.recommendhashtag.SearchRecommendChallengeList;

/* JADX INFO: renamed from: X.112D, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C112D {
    @InterfaceC1501240pAY("/aweme/v1/search/challenge/guide/")
    @InterfaceC1485505rh
    C11NZ<RecommendHashtagResponse> LIZ(@InterfaceC1501100pAK("zip_uri") String str, @InterfaceC1501100pAK("req_source") String str2, @InterfaceC1501100pAK("request_order") int i, @InterfaceC1501100pAK("edit_info") String str3);

    @InterfaceC1501240pAY("/aweme/v1/search/challenge/guide/")
    @InterfaceC1485505rh
    C11NZ<SearchRecommendChallengeList> LIZIZ(@InterfaceC1501100pAK("zip_uri") String str, @InterfaceC1501100pAK("req_source") String str2, @InterfaceC1501100pAK("request_order") int i, @InterfaceC1501100pAK("edit_info") String str3);
}
