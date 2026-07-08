package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetShowRankResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("show_rank_users")
        public List<ShowRankUser> showRankUsers = new ArrayList();
    }

    public static final class ShowRankUser {

        @C09CT("avatar_thumb")
        public ImageModel avatarThumb;

        @C09CT("enigma_info")
        public User.EnigmaInfo enigmaInfo;

        @C09CT("follow_status")
        public long followStatus;

        @C09CT("nickname")
        public String nickname = "";

        @C09CT("order")
        public int order;

        @C09CT("score")
        public long score;

        @C09CT("user_id")
        public long userId;
    }
}
