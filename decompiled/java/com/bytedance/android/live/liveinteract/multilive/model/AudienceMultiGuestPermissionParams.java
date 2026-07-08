package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AudienceMultiGuestPermissionParams {

    @C09CT("app_id")
    public long appId;

    @C09CT("live_id")
    public long liveId;

    @C09CT("live_room_mode")
    public long liveRoomMode;

    @C09CT("room_id")
    public long roomId;

    public AudienceMultiGuestPermissionParams() {
        this(0L, 0L, 0L, 0L);
    }

    public AudienceMultiGuestPermissionParams(long j, long j2, long j3, long j4) {
        this.roomId = j;
        this.appId = j2;
        this.liveId = j3;
        this.liveRoomMode = j4;
    }
}
