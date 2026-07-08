package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: loaded from: classes.dex */
public final class GetShowSettingsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("show_settings")
        public ShowConfig showSettings;
    }
}
