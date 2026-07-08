package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152110g5R {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(14);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(14);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.PUBLICSCREEN;
        map.put("live_improve_hot_comments_safety", scopeValue);
        this.LIZIZ.put("live_audience_wave_animation_opt", scopeValue);
        this.LIZIZ.put("livesdk_comment_emote_click_adapt", scopeValue);
        this.LIZIZ.put("live_enable_comment_close_v2", scopeValue);
        this.LIZIZ.put("live_public_screen_buffer_unload", scopeValue);
        this.LIZIZ.put("live_pin_comment_style_v2_enable", scopeValue);
        this.LIZIZ.put("live_public_screen_self_comment_update_opt", scopeValue);
        this.LIZIZ.put("live_public_screen_tag_frequency", scopeValue);
        this.LIZIZ.put("live_super_fan_emotes_update_toast", scopeValue);
        this.LIZIZ.put("live_wave_animation_config", scopeValue);
        this.LIZIZ.put("live_chat_line_margin", scopeValue);
        this.LIZIZ.put("live_public_screen_animator_with_layer", scopeValue);
        this.LIZIZ.put("live_public_screen_chain_log_config", scopeValue);
        this.LIZIZ.put("live_public_screen_log_interval", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.live.commentcombo.LiveImproveHotCommentsSafetySetting", new LiveSettingModel("live_improve_hot_comments_safety", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LiveAudienceWaveAnimationOptSetting", new LiveSettingModel("live_audience_wave_animation_opt", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LiveCommentEmoteClickOptSetting", new LiveSettingModel("livesdk_comment_emote_click_adapt", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LiveCommentOffKeepPublicScreenSetting", new LiveSettingModel("live_enable_comment_close_v2", "boolean", new q(bool)));
        Boolean bool2 = Boolean.TRUE;
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenBufferUnloadSetting", new LiveSettingModel("live_public_screen_buffer_unload", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenPinOptimizeSetting", new LiveSettingModel("live_pin_comment_style_v2_enable", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_public_screen_self_comment_update_opt", "int", new q((Number) 0));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenSelfCommentUpdateOptSetting", liveSettingModel);
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenTagFrequencySetting", new LiveSettingModel("live_public_screen_tag_frequency", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LiveSuperFanEmotesUpdateToastSetting", new LiveSettingModel("live_super_fan_emotes_update_toast", "java.lang.String", new q("ttlive_fanClub_superFanEmotes_error_updateApp_toast")));
        this.LIZ.put("com.bytedance.android.live.publicscreen.impl.setting.LiveWaveAnimationConfigSetting", new LiveSettingModel("live_wave_animation_config", "WaveAnimationConfig", new q("")));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_chat_line_margin", "int", new q((Number) (-1)));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatLineMarginSetting", liveSettingModel2);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAnimatorWithLayerSetting", new LiveSettingModel("live_public_screen_animator_with_layer", "int", new q((Number) 0)));
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_public_screen_chain_log_config", "SettingConfig", new q(""));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenChainLogConfigSetting", liveSettingModel3);
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_public_screen_log_interval", "int", new q((Number) 60));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenLogIntervalSetting", liveSettingModel4);
        return this.LIZ;
    }
}
