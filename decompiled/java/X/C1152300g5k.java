package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152300g5k {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(5);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(5);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.LINKMIC;
        map.put("voice_chat_layout_refactor_anchor", scopeValue);
        this.LIZIZ.put("voice_chat_layout_refactor_audience", scopeValue);
        this.LIZIZ.put("linkmic_cohost_when_guest_anchor", scopeValue);
        this.LIZIZ.put("linkmic_cohost_when_guest_audience", scopeValue);
        this.LIZIZ.put("live_cohost_audience_new_layout", scopeValue);
        return this.LIZIZ;
    }
}
