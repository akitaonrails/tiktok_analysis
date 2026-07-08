package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class SubmitSurveyAnswerRequest {

    @C09CT("answers")
    public final List<SurveyAnswer> answers;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("survey_target")
    public final String survey_target;

    public SubmitSurveyAnswerRequest(String str, List<SurveyAnswer> list, Map<String, String> map) {
        this.survey_target = str;
        this.answers = list;
        this.extra = map;
    }
}
