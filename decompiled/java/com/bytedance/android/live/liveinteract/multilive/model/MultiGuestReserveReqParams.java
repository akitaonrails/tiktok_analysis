package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestReserveReqParams {

    @C09CT("app_id")
    public long appId;

    @C09CT("auto_follow")
    public boolean autoFollow;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT("live_id")
    public long liveId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("to_user_id")
    public long toUserId;

    @C09CT("type")
    public int type;
}
