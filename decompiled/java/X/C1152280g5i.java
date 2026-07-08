package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152280g5i {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(5);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(5);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.REVENUE;
        map.put("crm_lynx_widget_setting_2", scopeValue);
        this.LIZIZ.put("crm_lynx_widget_setting_2_lazyload", scopeValue);
        this.LIZIZ.put("full_screen_cs_companion_fold_delay", scopeValue);
        this.LIZIZ.put("full_screen_optimization", scopeValue);
        this.LIZIZ.put("live_hide_crm_tips_widget", ScopeValue.OTHER);
        return this.LIZIZ;
    }
}
