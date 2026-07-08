package com.bytedance.android.live.liveinteract.match.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleInviteResult {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchors_info")
        public Map<Long, BattleUserInfo> anchorsInfo;

        @C09CT("battle_id")
        public Long battleId;

        @C09CT("inviter_gift_permission_type")
        public int inviterGiftPermissionType;

        @C09CT("league_info_map")
        public Map<Long, GiftGalleryBadgeInfo> leagueInfoMap;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.battleId != null) {
                sb.append(", battle_id=");
                sb.append(this.battleId);
            }
            sb.append(", inviter_gift_permission_type=");
            sb.append(this.inviterGiftPermissionType);
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "BattleInviteResult{");
        sb.append('}');
        return sb.toString();
    }
}
