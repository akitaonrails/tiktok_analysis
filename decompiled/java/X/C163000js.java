package X;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: renamed from: X.00js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_match_ai_commentary_anchor_enable")
public final class C163000js {
    public static boolean LIZ() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_ai_commentary_anchor_enable", false);
    }
}
