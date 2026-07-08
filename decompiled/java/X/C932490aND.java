package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestSwitchSpotAnchorNewStyleSetting;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkLayoutRefactorAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0aND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932490aND {
    public static boolean LIZIZ() {
        return LIZ(LinkCoreModelKt.currentUserIsAnchor()) && MultiGuestSwitchSpotAnchorNewStyleSetting.INSTANCE.getValue();
    }

    public static final boolean LIZ(boolean z) {
        Integer numLJ;
        if (z) {
            if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_add_switch_spot") == 0) {
                return false;
            }
        } else if (!LinkmicSdkLayoutRefactorAudienceSetting.INSTANCE.getEnable() || (numLJ = C931820aM8.LJ("multi_guest_add_switch_spot")) == null || numLJ.intValue() == 0) {
            return false;
        }
        return true;
    }
}
