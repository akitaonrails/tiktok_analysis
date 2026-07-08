package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestPushReq {

    @C09CT("app_id")
    public long appId;

    @C09CT("from_channel_id")
    public long fromChannelId;

    @C09CT("from_room_id")
    public long fromRoomId;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT("invite_user_out_of_room_params")
    public MultiGuestInviteUserOutOfRoomParams inviteUserOutOfRoomParams;

    @C09CT("live_id")
    public long liveId;

    @C09CT("push_scene")
    public int pushScene;

    @C09CT("push_type")
    public int pushType;
}
