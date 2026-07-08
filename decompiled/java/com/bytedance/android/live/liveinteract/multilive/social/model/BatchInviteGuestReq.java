package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class BatchInviteGuestReq {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("source")
    public String source = "";

    @C09CT("invite_users")
    public List<InviteUser> inviteUsers = new ArrayList();

    public static final class InviteUser {

        @C09CT("invite_user_type")
        public int inviteUserType;

        @C09CT("user_id")
        public long userId;
    }
}
