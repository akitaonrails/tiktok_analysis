package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152140g5U {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(10);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(10);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.RANK;
        map.put("live_rank_lynx_config", scopeValue);
        this.LIZIZ.put("live_rank_type_config", scopeValue);
        this.LIZIZ.put("live_ranking_competitive_atmosphere_config", scopeValue);
        this.LIZIZ.put("live_ranking_entrance_loop_rule_config", scopeValue);
        this.LIZIZ.put("live_ranking_entrance_rise_and_fall_animation_config", scopeValue);
        this.LIZIZ.put("live_ranking_entrance_settlement_countdown_config", scopeValue);
        this.LIZIZ.put("live_rank_entrance_animation_config", scopeValue);
        this.LIZIZ.put("live_ranking_icon_setting", scopeValue);
        this.LIZIZ.put("live_friend_rank_capsule_max_miss", scopeValue);
        this.LIZIZ.put("live_rank_entrance_filter_rank_types", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_rank_lynx_config", "Config", new q(""));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_rank_type_config", "Config", new q(""));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_ranking_competitive_atmosphere_config", "Config", new q(""));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.LiveRankingCompetitiveAtmosphereConfig", liveSettingModel3);
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_ranking_entrance_loop_rule_config", "List<LoopRuleConfig>", new q(""));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.LiveRankingEntranceLoopRuleConfig", liveSettingModel4);
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("live_ranking_entrance_rise_and_fall_animation_config", "Config", new q(""));
        liveSettingModel5.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.LiveRankingEntranceRiseAndFallAnimationConfig", liveSettingModel5);
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("live_ranking_entrance_settlement_countdown_config", "Config", new q(""));
        liveSettingModel6.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.LiveRankingEntranceSettlementCountdownConfig", liveSettingModel6);
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("live_rank_entrance_animation_config", "Config", new q(""));
        liveSettingModel7.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.RankEntranceAnimationTypeConfig", liveSettingModel7);
        LiveSettingModel liveSettingModel8 = new LiveSettingModel("live_ranking_icon_setting", "Array<RankingIconConfig>", new q(""));
        liveSettingModel8.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.RankingIconSetting", liveSettingModel8);
        LiveSettingModel liveSettingModel9 = new LiveSettingModel("live_friend_rank_capsule_max_miss", "int", new q((Number) 99));
        liveSettingModel9.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.config.LiveFriendsRankingSuggestMatchCapsuleConfig", liveSettingModel9);
        LiveSettingModel liveSettingModel10 = new LiveSettingModel("live_rank_entrance_filter_rank_types", "List<Int>", new q(""));
        liveSettingModel10.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.rank.api.config.LiveRankingFilterTypesConfig", liveSettingModel10);
        return this.LIZ;
    }
}
