package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152180g5Y {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(4);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(4);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.COMMENT;
        map.put("live_comment_emoji_panel_send_button", scopeValue);
        this.LIZIZ.put("live_opt_inner_comment_placeholder", scopeValue);
        this.LIZIZ.put("live_comment_panel_open_opt_v2", scopeValue);
        this.LIZIZ.put("live_comment_quick_emoji_setting", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.live.LiveCommentEmojiPanelSendSetting", new LiveSettingModel("live_comment_emoji_panel_send_button", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_opt_inner_comment_placeholder", "boolean", new q(bool));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.LiveCommentInnerHintSizeOptSetting", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_comment_panel_open_opt_v2", "int", new q((Number) 0));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.LiveCommentPanelOpenOptV2Setting", liveSettingModel2);
        this.LIZ.put("com.bytedance.android.live.LiveCommentQuickEmojiSetting", new LiveSettingModel("live_comment_quick_emoji_setting", "QuickEmojiConfig", new q("")));
        return this.LIZ;
    }
}
