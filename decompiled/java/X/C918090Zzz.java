package X;

import com.bytedance.android.live.liveinteract.linkroom.LinkMicFixGiftTargetWithModeratorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0Zzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918090Zzz {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        LiveAbLabelSetting liveAbLabelSetting = LiveAbLabelSetting.INSTANCE;
        return liveAbLabelSetting.getIntValue("enable_mic_view_manage_panel") == 2 || liveAbLabelSetting.getIntValue("enable_mic_view_manage_panel") == 1;
    }

    public static boolean LIZIZ() {
        Integer numLJ = C931820aM8.LJ("enable_mic_view_manage_panel");
        return (numLJ != null && numLJ.intValue() == 2) || LinkMicFixGiftTargetWithModeratorSetting.enable();
    }
}
