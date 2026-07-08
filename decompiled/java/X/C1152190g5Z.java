package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152190g5Z {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(2);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(2);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        LiveSettingModel liveSettingModel = new LiveSettingModel("multi_guest_all_layout_corner_opt_audience", "boolean", new q(Boolean.TRUE));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestAllLayoutCornerOptAudienceSetting", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("multi_guest_all_panel_layout_nick_name_min_width", "int", new q((Number) 18));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestAllPanelFloatNickNameMinWidthSetting", liveSettingModel2);
        return this.LIZ;
    }
}
