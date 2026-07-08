package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GameSummaryInfoResp {

    @C09CT("data")
    public ResponseData data;

    public static final class GameUser {

        @C09CT("game_score")
        public long gameScore;

        @C09CT("rank")
        public long rank;

        @C09CT("user")
        public User user;
    }

    public static final class ResponseData {

        @C09CT("game_users")
        public List<GameUser> gameUsers = new ArrayList();
    }
}
