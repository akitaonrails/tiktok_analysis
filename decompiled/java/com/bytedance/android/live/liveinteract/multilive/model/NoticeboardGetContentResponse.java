package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.NoticeboardContent;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardGetContentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("noticeboard_content")
        public NoticeboardContent noticeboardContent;
    }
}
