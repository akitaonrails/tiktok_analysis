package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.TextHeaderPlayContent;

/* JADX INFO: loaded from: classes.dex */
public final class TextHeaderCreateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_exists")
        public boolean isExists;

        @C09CT("text_header_content")
        public TextHeaderPlayContent textHeaderContent;
    }
}
