package com.bytedance.android.live.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSurveyState {

    @C09CT("show_timestamp")
    public Long showTimestamp;

    @C09CT("survey_id")
    public Long surveyId;

    public LiveSurveyState() {
        this(null, null);
    }

    public LiveSurveyState(Long l, Long l2) {
        this.surveyId = l;
        this.showTimestamp = l2;
    }
}
