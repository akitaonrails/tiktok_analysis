package com.bytedance.android.live.liveinteract.match.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class BattleFinishRequest {

    @C09CT("battle_id")
    public Long battleId;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("cut_short")
    public Boolean cutShort;

    @C09CT("finish_cur_bitrate")
    public long finishCurBitrate;

    @C09CT("finish_is_background")
    public long finishIsBackground;

    @C09CT("finish_is_sdk")
    public long finishIsSdk;

    @C09CT("finish_network_quality")
    public long finishNetworkQuality;

    @C09CT("finish_source")
    public String finishSource = "";

    @C09CT("other_party_left")
    public Boolean otherPartyLeft;

    @C09CT("other_party_user_id")
    public Long otherPartyUserId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.cutShort != null) {
            sb.append(", cut_short=");
            sb.append(this.cutShort);
        }
        if (this.battleId != null) {
            sb.append(", battle_id=");
            sb.append(this.battleId);
        }
        if (this.otherPartyLeft != null) {
            sb.append(", other_party_left=");
            sb.append(this.otherPartyLeft);
        }
        if (this.otherPartyUserId != null) {
            sb.append(", other_party_user_id=");
            sb.append(this.otherPartyUserId);
        }
        sb.replace(0, 2, "BattleFinishRequest{");
        sb.append('}');
        return sb.toString();
    }
}
