package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetLiveEventUserResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class InvitedListUser {

        @C09CT("user")
        public User user;
    }

    public static final class RegisteredListUser {

        @C09CT("already_read")
        public boolean alreadyRead;

        @C09CT("registered_time")
        public long registeredTime;

        @C09CT("user")
        public User user;
    }

    public static final class ResponseData {

        @C09CT("invited_users")
        public List<InvitedListUser> invitedUsers = new ArrayList();

        @C09CT("registered_users")
        public List<RegisteredListUser> registeredUsers = new ArrayList();
    }
}
