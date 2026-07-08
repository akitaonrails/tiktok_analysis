package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152130g5T {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(7);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(7);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.COMMENT;
        map.put("live_comment_add_pull_stream_data", scopeValue);
        this.LIZIZ.put("live_comment_au_16_eligible", scopeValue);
        this.LIZIZ.put("live_comment_panel_custom_sys_emoji", scopeValue);
        this.LIZIZ.put("live_comment_panel_show_direct_time_config", scopeValue);
        this.LIZIZ.put("live_comment_preload_drawable_emoji", scopeValue);
        this.LIZIZ.put("live_comment_send_button_opt", scopeValue);
        this.LIZIZ.put("fansclub_emote_panel_width_redesign", ScopeValue.REVENUE);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.LiveCommentAddPullStreamDataSetting", new LiveSettingModel("live_comment_add_pull_stream_data", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.LiveCommentAu16EligibleSetting", new LiveSettingModel("live_comment_au_16_eligible", "boolean", new q(Boolean.TRUE)));
        this.LIZ.put("com.bytedance.android.LiveCommentPanelCustomSysEmojiSetting", new LiveSettingModel("live_comment_panel_custom_sys_emoji", "java.lang.String[]", new q("")));
        this.LIZ.put("com.bytedance.android.LiveCommentPanelShowDirectTimeThresholdSetting", new LiveSettingModel("live_comment_panel_show_direct_time_config", "LevelConfig", new q("")));
        this.LIZ.put("com.bytedance.android.LiveCommentPreloadDrawableEmojiSetting", new LiveSettingModel("live_comment_preload_drawable_emoji", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_comment_send_button_opt", "int", new q((Number) 0));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.LiveCommentSendButtonOptSetting", liveSettingModel);
        this.LIZ.put("emotes.util.FanClubEmotePanelSpanCountSetting", new LiveSettingModel("fansclub_emote_panel_width_redesign", "boolean", new q(bool)));
        return this.LIZ;
    }
}
