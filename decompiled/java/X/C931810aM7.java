package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.EnableTextHeaderForAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkLayoutRefactorAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTextHeaderTechSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0aM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931810aM7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ() {
        return MultiGuestTextHeaderTechSetting.INSTANCE.enable() && EnableTextHeaderForAudienceSetting.INSTANCE.getValue();
    }

    public static boolean LIZLLL() {
        Integer numLJ;
        Integer numValueOf;
        if (C930540aK4.LIZJ()) {
            if (!MultiGuestTextHeaderTechSetting.INSTANCE.enable() || (numValueOf = Integer.valueOf(LiveAbLabelSetting.INSTANCE.getIntValue("text_header_template_recommend_enable"))) == null || numValueOf.intValue() == 0) {
                return false;
            }
        } else if (!LIZIZ() || !LinkmicSdkLayoutRefactorAudienceSetting.INSTANCE.getEnable() || (numLJ = C931820aM8.LJ("text_header_template_recommend_enable")) == null || numLJ.intValue() == 0) {
            return false;
        }
        return true;
    }

    public static Integer LIZ(Boolean bool) {
        boolean zLIZLLL;
        if (bool != null) {
            zLIZLLL = bool.booleanValue();
        } else {
            zLIZLLL = LIZLLL();
        }
        if (zLIZLLL) {
            return 58;
        }
        return null;
    }

    public static final boolean LIZJ(boolean z) {
        Integer numLJ;
        if (z) {
            Integer numValueOf = Integer.valueOf(LiveAbLabelSetting.INSTANCE.getIntValue("enable_text_header"));
            if (numValueOf == null || numValueOf.intValue() == 0) {
                return false;
            }
        } else if (!LinkmicSdkLayoutRefactorAudienceSetting.INSTANCE.getEnable() || (numLJ = C931820aM8.LJ("enable_text_header")) == null || numLJ.intValue() == 0) {
            return false;
        }
        return true;
    }
}
