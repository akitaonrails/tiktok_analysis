package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152220g5c {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(3);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(3);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_decoration_disclaimer_switch", "boolean", new q(bool));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.broadcast.boards.LiveDecorationDisclaimerSwitchSetting", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_decoration_setting_page_entrance_switcher", "boolean", new q(bool));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.broadcast.boards.LiveDecorationSettingPageEntranceSwitcher", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("board_edit_text_opt_setting", "boolean", new q(bool));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.broadcast.preview.widget.boards.BoardEditTextOptSetting", liveSettingModel3);
        return this.LIZ;
    }
}
