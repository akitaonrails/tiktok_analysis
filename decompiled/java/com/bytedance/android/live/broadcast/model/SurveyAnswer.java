package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class SurveyAnswer {

    @C09CT("option_indexes")
    public final List<Integer> optionIndexes;

    @C09CT("question_id")
    public final String questionId;

    @C09CT("question_type")
    public final int questionType;

    public SurveyAnswer(String str, int i, List<Integer> list) {
        this.questionId = str;
        this.questionType = i;
        this.optionIndexes = list;
    }
}
