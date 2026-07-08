package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.ab.FanSpotlightGuideConfig;

/* JADX INFO: renamed from: X.0Opw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631580Opw {
    public static final FanSpotlightGuideConfig LIZ = new FanSpotlightGuideConfig();

    public static FanSpotlightGuideConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FanSpotlightGuideConfig fanSpotlightGuideConfig = LIZ;
        FanSpotlightGuideConfig fanSpotlightGuideConfig2 = (FanSpotlightGuideConfig) settingsManagerLIZLLL.LJIIIIZZ("fan_spotlight_tutorial_popup_config", FanSpotlightGuideConfig.class, fanSpotlightGuideConfig);
        return fanSpotlightGuideConfig2 != null ? fanSpotlightGuideConfig2 : fanSpotlightGuideConfig;
    }
}
