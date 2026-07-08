package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class GuestInviteRejectReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("inviter_user_id")
    public long inviterUserId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
