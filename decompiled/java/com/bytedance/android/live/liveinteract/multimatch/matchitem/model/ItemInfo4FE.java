package com.bytedance.android.live.liveinteract.multimatch.matchitem.model;

import X.C09CT;
import X.C09DE;
import X.C1145010ftz;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.AnchorPair;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public final class ItemInfo4FE {

    @C09DE(deserialize = false, serialize = false)
    public int LIZ;

    @C09DE(deserialize = false, serialize = false)
    public CommunityHeartMeInfo LIZIZ;

    @C09CT("affected_anchor_pairs")
    @C09DE(deserialize = false, serialize = false)
    public List<AnchorPair> affectedAnchorPairs;

    @C09CT("anchor_community_level")
    public long anchorCommunityLevel;

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("pk_id")
    public long battleId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("anchor_id")
    public Long currentAnchorId;

    @C09CT("effect_last_duration")
    public long effectLastDuration;

    @C09CT("effect_time_sec")
    public long effectStartTimeSec;

    @C09CT("end_at")
    public long endAt;

    @C09CT("extra_duration_sec")
    public long extraDurationSec;

    @C09CT("is_team_match")
    public long isTeamMatch;

    @C09CT("is_team_mate_room")
    public boolean isTeamMate;

    @C09CT("top2_card_shown")
    public boolean isTop2cardShown;

    @C09CT("top3_card_shown")
    public boolean isTop3cardShown;

    @C09CT("item_image")
    public String itemImage;

    @C09CT("multiple")
    public long itemMultiple;

    @C09CT("item_name")
    public String itemName;

    @C09CT("probability_high")
    public long itemProbabilityHigh;

    @C09CT("probability_low")
    public long itemProbabilityLow;

    @C09CT("item_type")
    public int itemType;

    @C09CT("other_multiple")
    public long otherItemMultiple;

    @C09CT("real_effect_start_time_sec")
    public long realEffectStartTimeSec;

    @C09CT("send_time_sec")
    public long sendTimeSec;

    @C09CT("to_anchor_id")
    public String sendToAnchorId;

    @C09CT("send_user_id")
    public String senderUid;

    @C09CT("send_user_avatar_url")
    public String senderUserAvatar;

    @C09CT("send_user_name")
    public String senderUserName;

    @C09CT("item_id")
    @C09DE(deserialize = false, serialize = false)
    public UUID itemId = C1145010ftz.LIZ();

    @C09DE(deserialize = false, serialize = false)
    public String LIZJ = "";

    @C09CT("is_self_room")
    public boolean isSelfRoom = true;

    public final String toString() {
        return "ItemInfo4FE(senderUserAvatar=" + this.senderUserAvatar + ", avatarThumb=" + this.avatarThumb + ", itemId=" + ((Object) this.itemId.toString()) + ", itemType=" + this.itemType + ", itemImage=" + this.itemImage + ", itemName=" + this.itemName + ", senderUid=" + this.senderUid + ", senderUserName=" + this.senderUserName + ", endAt=" + this.endAt + ", itemProbabilityHigh=" + this.itemProbabilityHigh + ", itemProbabilityLow=" + this.itemProbabilityLow + ", itemMultiple=" + this.itemMultiple + ", sendTimeSec=" + this.sendTimeSec + ", effectStartTimeSec=" + this.effectStartTimeSec + ", effectLastDuration=" + this.effectLastDuration + ", battleId=" + this.battleId + ", channelId=" + this.channelId + ", currentAnchorId=" + this.currentAnchorId + ", isSelfRoom=" + this.isSelfRoom + ", isTeamMate=" + this.isTeamMate + ", isTeamMatch=" + this.isTeamMatch + ", sendToAnchorId=" + this.sendToAnchorId + ", extraDurationSec=" + this.extraDurationSec + ", realEffectStartTime=" + this.realEffectStartTimeSec + ", anchorCommunityLevel=" + this.anchorCommunityLevel + ", isTop2cardShown=" + this.isTop2cardShown + ", isTop3cardShown=" + this.isTop3cardShown + ')';
    }

    public final void LIZ(UUID uuid) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hhhhhhhhhhh setItemId: old itemId ");
        sbLIZ.append((Object) this.itemId.toString());
        sbLIZ.append(", new value ");
        sbLIZ.append((Object) uuid.toString());
        C20441214yg.LIZIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.itemId = uuid;
    }
}
