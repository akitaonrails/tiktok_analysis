package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookUpdateActiveContentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("active_playbook")
        public ActivePlaybook activePlaybook;
    }
}
