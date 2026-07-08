package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0a2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919610a2R {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return LiveAbLabelSetting.INSTANCE.getBooleanValue("manage_panel_refresh_optimize");
    }

    public static boolean LIZIZ() {
        Boolean boolLIZLLL = C931820aM8.LIZLLL("enable_revert_invite");
        if (boolLIZLLL != null) {
            return boolLIZLLL.booleanValue();
        }
        return false;
    }
}
