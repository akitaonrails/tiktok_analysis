package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152120g5S {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(11);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(11);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.WATCHLIVE;
        map.put("live_chat_list_add_live_preview", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.OTHER;
        map2.put("live_chat_list_never_hide_cover", scopeValue2);
        this.LIZIZ.put("live_chat_list_player_delay_time", scopeValue2);
        this.LIZIZ.put("live_chat_list_player_reuse_enable", scopeValue2);
        HashMap<String, ScopeValue> map3 = this.LIZIZ;
        ScopeValue scopeValue3 = ScopeValue.BROADCAST;
        map3.put("live_replay_edit_opti", scopeValue3);
        this.LIZIZ.put("live_replay_use_sprite_image", scopeValue3);
        this.LIZIZ.put("live_replay_enable_opt_query_thumbnails", scopeValue3);
        this.LIZIZ.put("live_send_show_event_on_setup", scopeValue);
        this.LIZIZ.put("live_shop_add_permission_business", ScopeValue.SLOT);
        this.LIZIZ.put("live_mic_volume_config", scopeValue3);
        this.LIZIZ.put("live_broadcast_host_use_ttlh_ve", ScopeValue.PERFORMANCE);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.live.settings.LiveChatListAddLivePreviewSetting", new LiveSettingModel("live_chat_list_add_live_preview", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.settings.LiveChatListNeverHideCoverSetting", new LiveSettingModel("live_chat_list_never_hide_cover", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.settings.LiveChatListPlayerDelayTimeSetting", new LiveSettingModel("live_chat_list_player_delay_time", "long", new q((Number) 0L)));
        this.LIZ.put("com.bytedance.android.live.settings.LiveChatListPlayerReuseEnableSetting", new LiveSettingModel("live_chat_list_player_reuse_enable", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_replay_edit_opti", "LiveReplayUIConfig", new q(""));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.settings.LiveHostReplayUISettings", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_replay_use_sprite_image", "boolean", new q(bool));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.settings.LiveHostReplayEnableUseSprites", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_replay_enable_opt_query_thumbnails", "boolean", new q(bool));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.settings.LiveHostReplayEnableOptQueryThumbnails", liveSettingModel3);
        this.LIZ.put("com.bytedance.android.live.settings.LiveSendShowEventOnSetupSetting", new LiveSettingModel("live_send_show_event_on_setup", "LiveSendShowEventOnSetupConfig", new q("")));
        this.LIZ.put("com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting", new LiveSettingModel("live_shop_add_permission_business", "boolean", new q(Boolean.TRUE)));
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_mic_volume_config", "SpeakingVoiceConfig", new q(""));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveMicVoiceSetting", liveSettingModel4);
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("live_broadcast_host_use_ttlh_ve", "boolean", new q(bool));
        liveSettingModel5.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLHVE", liveSettingModel5);
        return this.LIZ;
    }
}
