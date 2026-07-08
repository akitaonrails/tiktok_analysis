package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152210g5b {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(9);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(9);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.BROADCAST;
        map.put("enable_fallback_audio_old_chain", scopeValue);
        this.LIZIZ.put("ttlive_game_internal_record_detect_config", scopeValue);
        this.LIZIZ.put("mobile_game_feedback_analyse_info", scopeValue);
        this.LIZIZ.put("high_ping_adjust_bitrate", scopeValue);
        this.LIZIZ.put("mobile_high_ping_optimize_config", scopeValue);
        this.LIZIZ.put("game_feed_half_fragment_upgrade_for_full_types", ScopeValue.FEED);
        this.LIZIZ.put("game_test_ab_vid", ScopeValue.OTHER);
        this.LIZIZ.put("show_low_performance_tips_inapp_duartion_time", scopeValue);
        this.LIZIZ.put("show_tip_low_end_device_max", scopeValue);
        return this.LIZIZ;
    }
}
