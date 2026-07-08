package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ListByTypeParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("applier_list_pin_gift_score_threshold")
    public long applierListPinGiftScoreThreshold;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("list_type")
    public int listType;

    @C09CT("live_room_mode")
    public long liveRoomMode;

    @C09CT("open_panel_ntp_time_ms")
    public long openPanelNtpTimeMs;

    @C09CT("reason")
    public int reason;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("source")
    public int source;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        sb.append(", list_type=");
        sb.append(this.listType);
        sb.replace(0, 2, "ListByTypeParams{");
        sb.append('}');
        return sb.toString();
    }
}
