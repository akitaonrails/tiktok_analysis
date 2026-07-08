package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SurveyQuestionOption {

    @C09CT("help_text")
    public final String helpText;

    @C09CT("option_index")
    public final int optionIndex;

    @C09CT("option_text")
    public final String optionText;

    @C09CT("sub_options")
    public final List<SurveyQuestionOption> subOptions;

    @C09CT("input_type")
    public final int type;

    public SurveyQuestionOption(int i, String str, String str2, int i2, List<SurveyQuestionOption> list) {
        this.optionIndex = i;
        this.optionText = str;
        this.helpText = str2;
        this.type = i2;
        this.subOptions = list;
    }
}
