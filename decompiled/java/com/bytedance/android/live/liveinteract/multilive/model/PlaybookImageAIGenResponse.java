package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.PlayImage;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookImageAIGenResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("duration_second")
        public long durationSecond;

        @C09CT("play_image")
        public PlayImage playImage;
    }
}
