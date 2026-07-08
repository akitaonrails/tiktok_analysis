package com.bytedance.android.live.liveinteract.gamelink.utils.feedback;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GuestFeedbackSubmitResponse {

    @C09CT("err_code")
    public final int errorCode;

    @C09CT("feedback_id")
    public final String feedbackId;

    @C09CT("message")
    public final String message;

    public GuestFeedbackSubmitResponse() {
        this(null, null, Integer.MAX_VALUE);
    }

    public GuestFeedbackSubmitResponse(String str, String str2, int i) {
        this.message = str;
        this.feedbackId = str2;
        this.errorCode = i;
    }
}
