package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0CJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311710CJt {
    public static int LIZ() {
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("extra_vid_req_count_settings", 0);
        if (iLJ < 0) {
            return 0;
        }
        if (iLJ > 500) {
            return 500;
        }
        return iLJ;
    }
}
