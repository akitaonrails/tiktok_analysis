package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardTemplateDeleteResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_success")
        public boolean isSuccess;

        @C09CT("noticeboard_template_id")
        public long noticeboardTemplateId;
    }
}
