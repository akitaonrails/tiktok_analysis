package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GuestMicCameraManageParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("change_scene")
    public int changeScene;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("guest_user_id")
    public Long guestUserId;

    @C09CT("op")
    public int op;

    @C09CT("operate_user_id")
    public long operateUserId;

    @C09CT("room_id")
    public Long roomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.guestUserId != null) {
            sb.append(", guest_user_id=");
            sb.append(this.guestUserId);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        sb.append(", op=");
        sb.append(this.op);
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        sb.replace(0, 2, "GuestMicCameraManageParams{");
        sb.append('}');
        return sb.toString();
    }
}
