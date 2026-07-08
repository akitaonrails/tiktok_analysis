package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AcademySurveyQuestion {

    @C09CT("options")
    public final List<SurveyQuestionOption> options;

    @C09CT("question_id")
    public final String questionId;

    @C09CT("question_type")
    public final int questionType;

    @C09CT("question_sub_title")
    public final String subTitle;

    @C09CT("question_title")
    public final String title;

    public AcademySurveyQuestion(String str, int i, String str2, List<SurveyQuestionOption> list, String str3) {
        this.questionId = str;
        this.questionType = i;
        this.title = str2;
        this.options = list;
        this.subTitle = str3;
    }
}
