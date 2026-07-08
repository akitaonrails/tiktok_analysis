package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class HostCheckOtherAudienceMultiGuestPermissionParams {

    @C09CT("app_id")
    public long appId;

    @C09CT("check_user_id")
    public long checkUserId;

    @C09CT("live_id")
    public long liveId;

    @C09CT("live_room_mode")
    public long liveRoomMode;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
