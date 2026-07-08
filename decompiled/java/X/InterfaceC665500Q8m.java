package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyDetailResponse;

/* JADX INFO: renamed from: X.0Q8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC665500Q8m {
    @InterfaceC1501240pAY("/aweme/v1/search/survey/submit/")
    @InterfaceC1485505rh
    C15O7<BaseResponse> LIZ(@InterfaceC1501100pAK("survey_id") String str, @InterfaceC1501100pAK("search_id") String str2, @InterfaceC1501100pAK("survey_answer_rating") int i, @InterfaceC1501100pAK("keyword") String str3);

    @InterfaceC1501240pAY("/aweme/v1/search/survey/detail/")
    @InterfaceC1485505rh
    C15O7<SurveyDetailResponse> LIZIZ(@InterfaceC1501100pAK("survey_id") String str);
}
