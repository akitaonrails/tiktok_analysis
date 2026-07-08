package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.AnchorPanelStyleConfig;

/* JADX INFO: renamed from: X.18OX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18OX {
    public static final AnchorPanelStyleConfig LIZ = new AnchorPanelStyleConfig(0, 0);

    public static final AnchorPanelStyleConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AnchorPanelStyleConfig anchorPanelStyleConfig = LIZ;
        AnchorPanelStyleConfig anchorPanelStyleConfig2 = (AnchorPanelStyleConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_panel", AnchorPanelStyleConfig.class, anchorPanelStyleConfig);
        return anchorPanelStyleConfig2 != null ? anchorPanelStyleConfig2 : anchorPanelStyleConfig;
    }
}
