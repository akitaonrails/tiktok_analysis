package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardOfficialTemplateCreateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_success")
        public boolean isSuccess;

        @C09CT("template")
        public NoticeboardTemplate template;
    }
}
