package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SuggestGuestsResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("suggested_friends")
        public List<SuggestUser> suggestedFriends = new ArrayList();

        @C09CT("suggested_users")
        public List<SuggestUser> suggestedUsers = new ArrayList();

        public static final class SuggestUser {

            @C09CT("recall_reason")
            public String recallReason = "";

            @C09CT("user")
            public User user;
        }
    }
}
