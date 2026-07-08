package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.CountdownContent;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownStartResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("countdown_content")
        public CountdownContent countdownContent;

        @C09CT("countdown_exists")
        public boolean countdownExists;
    }
}
