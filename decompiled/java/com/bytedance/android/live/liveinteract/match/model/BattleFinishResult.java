package com.bytedance.android.live.liveinteract.match.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleFinishResult {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchors_info")
        public Map<Long, BattleUserInfo> anchorsInfo;

        @C09CT("armies")
        public Map<Long, BattleUserArmies> armies;

        @C09CT("battle_combo_v2")
        public Map<Long, BattleComboInfo> battleComboV2;

        @C09CT("battle_result")
        public Map<Long, BattleResult> battleResult;

        @C09CT("battle_settings")
        public BattleSetting battleSettings;

        @C09CT("match_punish_extra_info")
        public MatchPunishExtraInfo matchPunishExtraInfo;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Map<Long, BattleResult> map = this.battleResult;
            if (map != null && !map.isEmpty()) {
                sb.append(", battle_result=");
                sb.append(this.battleResult);
            }
            Map<Long, BattleUserArmies> map2 = this.armies;
            if (map2 != null && !map2.isEmpty()) {
                sb.append(", armies=");
                sb.append(this.armies);
            }
            Map<Long, BattleUserInfo> map3 = this.anchorsInfo;
            if (map3 != null && !map3.isEmpty()) {
                sb.append(", anchors_info=");
                sb.append(this.anchorsInfo);
            }
            Map<Long, BattleComboInfo> map4 = this.battleComboV2;
            if (map4 != null && !map4.isEmpty()) {
                sb.append(", battle_combo_v2=");
                sb.append(this.battleComboV2);
            }
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
        sb.replace(0, 2, "BattleFinishResult{");
        sb.append('}');
        return sb.toString();
    }
}
