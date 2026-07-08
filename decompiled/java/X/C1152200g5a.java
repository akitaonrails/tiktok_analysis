package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152200g5a {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(13);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(13);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.PUBLICSCREEN;
        map.put("live_capsule_message_window_focus_experiment", scopeValue);
        this.LIZIZ.put("live_extend_screen_guide_test_setting", scopeValue);
        this.LIZIZ.put("live_extended_screen_gift_optimize", scopeValue);
        this.LIZIZ.put("live_public_screen_chat_holder_cache_config", scopeValue);
        this.LIZIZ.put("live_public_screen_click_close_keyboard", scopeValue);
        this.LIZIZ.put("live_public_screen_click_close_keyboard_anchor", scopeValue);
        this.LIZIZ.put("live_public_screen_mock_delay_load", scopeValue);
        this.LIZIZ.put("live_public_screen_sei_msg_sequence_config", scopeValue);
        this.LIZIZ.put("live_public_screen_shadow_optimization_anchor", scopeValue);
        this.LIZIZ.put("live_public_screen_shadow_optimization", scopeValue);
        this.LIZIZ.put("live_public_screen_management", scopeValue);
        this.LIZIZ.put("live_public_screen_xml_layer_opt", scopeValue);
        this.LIZIZ.put("live_public_screen_xml_layer_opt_anchor", scopeValue);
        return this.LIZIZ;
    }
}
