package com.bytedance.android.live.broadcast.api;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class FeedbackResponse {

    @C09CT("err_code")
    public final int errorCode;

    @C09CT("feedback_id")
    public final String feedbackId;

    @C09CT("message")
    public final String message;

    public FeedbackResponse() {
        this(null, null, Integer.MAX_VALUE);
    }

    public FeedbackResponse(String str, String str2, int i) {
        this.message = str;
        this.feedbackId = str2;
        this.errorCode = i;
    }
}
