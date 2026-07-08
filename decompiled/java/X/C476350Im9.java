package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Im9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476350Im9 {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(7);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(7);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.LINKMIC;
        map.put("live_disable_change_tab_trans", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.WATCHLIVE;
        map2.put("live_fix_scroll_black_exp", scopeValue2);
        this.LIZIZ.put("live_fragment_select_hide_bg_exp", scopeValue2);
        this.LIZIZ.put("live_inner_black_screen_fix_exp", scopeValue2);
        this.LIZIZ.put("live_inner_surfaceview_remove_trans", scopeValue);
        this.LIZIZ.put("live_inner_watch_efficiency_log", scopeValue2);
        this.LIZIZ.put("surfaceview_android10_workaround", scopeValue2);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.livesdk.workaround.LiveDisableChangeTabTrasView", new LiveSettingModel("live_disable_change_tab_trans", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.workaround.LiveFixScrollBlackExp", new LiveSettingModel("live_fix_scroll_black_exp", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.workaround.LiveFragmentSelectHideBgExp", new LiveSettingModel("live_fragment_select_hide_bg_exp", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.workaround.LiveInnerBlackScreenFixExp", new LiveSettingModel("live_inner_black_screen_fix_exp", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.livesdk.workaround.LiveInnerSurfaceRemoveTransSetting", new LiveSettingModel("live_inner_surfaceview_remove_trans", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.workaround.LiveInnerWatchEfficiencyLogSetting", new LiveSettingModel("live_inner_watch_efficiency_log", "boolean", new q(Boolean.TRUE)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("surfaceview_android10_workaround", "Options", new q(""));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround", liveSettingModel);
        return this.LIZ;
    }
}
