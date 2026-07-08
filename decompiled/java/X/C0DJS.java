package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0DJS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJS {
    public static boolean LIZ() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("poi_enable_ttls_load_anchor_icon", 0) > 0) {
            return true;
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("disable_debug_optimize_anchor_icon", 0) == 0) {
                return true;
            }
        }
        return false;
    }
}
