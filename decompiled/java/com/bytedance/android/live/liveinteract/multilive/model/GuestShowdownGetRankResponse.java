package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownGetRankResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("config")
        public GuestShowdownConfig config;

        @C09CT("running_play_users")
        public List<GuestShowdownGetRankUser> runningPlayUsers = new ArrayList();

        @C09CT("leave_play_users")
        public List<GuestShowdownGetRankUser> leavePlayUsers = new ArrayList();

        @C09CT("contributors")
        public List<GuestShowdownGetRankContributor> contributors = new ArrayList();
    }
}
