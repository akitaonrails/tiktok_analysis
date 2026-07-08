package com.bytedance.android.live.liveinteract.match.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleInviteRequestParams {

    @C09CT("anchor_gift_type")
    public int anchorGiftType;

    @C09CT("auto_match_scene")
    public int autoMatchScene;

    @C09CT("cancel_auto_match")
    public boolean cancelAutoMatch;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("gameplay_option")
    public int gameplayOption;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("invite_type")
    public int inviteType;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("source_type")
    public int sourceType;

    @C09CT("target_user_id")
    public Long targetUserId;

    @C09CT("anchor_gift_id_map")
    public String anchorGiftIdMap = "";

    @C09CT("tracking_extra")
    public String trackingExtra = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.append(", invite_type=");
        sb.append(this.inviteType);
        if (this.targetUserId != null) {
            sb.append(", target_user_id=");
            sb.append(this.targetUserId);
        }
        sb.replace(0, 2, "BattleInviteRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
