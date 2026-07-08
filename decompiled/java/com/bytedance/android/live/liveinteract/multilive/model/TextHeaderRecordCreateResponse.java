package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;

/* JADX INFO: loaded from: classes.dex */
public final class TextHeaderRecordCreateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("success")
        public boolean success;

        @C09CT("text_header_record_info")
        public TextHeaderRecordInfo textHeaderRecordInfo;
    }
}
