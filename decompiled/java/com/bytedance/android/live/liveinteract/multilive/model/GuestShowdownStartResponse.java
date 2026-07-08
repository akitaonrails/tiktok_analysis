package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownStartResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_exists")
        public boolean isExists;

        @C09CT("play_content")
        public GuestShowdownContent playContent;
    }
}
