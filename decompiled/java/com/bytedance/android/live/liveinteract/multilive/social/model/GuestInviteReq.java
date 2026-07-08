package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestInviteReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("invitee_user_id")
    public long inviteeUserId;

    @C09CT("online_status")
    public int onlineStatus;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
