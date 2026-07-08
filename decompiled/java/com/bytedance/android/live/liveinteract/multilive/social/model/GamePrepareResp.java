package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class GamePrepareResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("game_session_id")
        public long gameSessionId;

        @C09CT("session_changed")
        public boolean sessionChanged;
    }
}
