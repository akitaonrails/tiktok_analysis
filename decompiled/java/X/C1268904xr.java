package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.internalshare.impl.experiment.SharePanelSearchDebugLabelConfig;
import com.ss.android.ugc.aweme.internalshare.impl.experiment.SocialShareSearchDebuggingConfig;

/* JADX INFO: renamed from: X.04xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1268904xr {
    public static final SocialShareSearchDebuggingConfig LIZ;

    static {
        new C1268904xr();
        LIZ = new SocialShareSearchDebuggingConfig(false, false);
    }

    public static final boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SocialShareSearchDebuggingConfig socialShareSearchDebuggingConfig = LIZ;
        SocialShareSearchDebuggingConfig socialShareSearchDebuggingConfig2 = (SocialShareSearchDebuggingConfig) settingsManagerLIZLLL.LJIIIIZZ("social_share_search_debugging", SocialShareSearchDebuggingConfig.class, socialShareSearchDebuggingConfig);
        if (socialShareSearchDebuggingConfig2 != null) {
            socialShareSearchDebuggingConfig = socialShareSearchDebuggingConfig2;
        }
        if (socialShareSearchDebuggingConfig.rankingLabels) {
            return true;
        }
        SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
        SharePanelSearchDebugLabelConfig sharePanelSearchDebugLabelConfig = C1268804xq.LIZ;
        SharePanelSearchDebugLabelConfig sharePanelSearchDebugLabelConfig2 = (SharePanelSearchDebugLabelConfig) settingsManagerLIZLLL2.LJIIIIZZ("share_panel_search_debug_label", SharePanelSearchDebugLabelConfig.class, sharePanelSearchDebugLabelConfig);
        if (sharePanelSearchDebugLabelConfig2 != null) {
            sharePanelSearchDebugLabelConfig = sharePanelSearchDebugLabelConfig2;
        }
        return sharePanelSearchDebugLabelConfig.enabled == 1;
    }
}
