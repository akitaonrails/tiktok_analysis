package com.bytedance.android.live.broadcast.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.broadcast.model.SurveyResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public interface AcademySurveyApi {
    @InterfaceC1501160pAQ("/webcast/live_center/academy/course_theme/")
    C11NZ<C470590Icr<SurveyResponse>> fetchAcademySurvey(@InterfaceC1501070pAH("course_theme_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/feedback/2/post_message/")
    C11NZ<FeedbackResponse> postFeedBack(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501170pAR("/webcast/anchor/survey/submit/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<Object>> postSurveyAnswer(@InterfaceC1485405rg SubmitSurveyAnswerRequest submitSurveyAnswerRequest);
}
