package X;

import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlaybookNonMultiGuestConfigSetting;

/* JADX INFO: renamed from: X.0bZF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978390bZF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return (C930540aK4.LIZJ() || C500260Jjc.LJJIL()) ? PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && LinkMicPlaybookNonMultiGuestConfigSetting.INSTANCE.isCodeTechSwitchForAndroidEnable() : LinkMicPlaybookNonMultiGuestConfigSetting.INSTANCE.isCodeTechSwitchForAndroidEnable();
    }
}
