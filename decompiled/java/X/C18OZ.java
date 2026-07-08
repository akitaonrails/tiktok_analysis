package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.AnchorStaticViewConfig;

/* JADX INFO: renamed from: X.18OZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18OZ {
    public static final AnchorStaticViewConfig LIZ = new AnchorStaticViewConfig(0, false, false);

    public static final AnchorStaticViewConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AnchorStaticViewConfig anchorStaticViewConfig = LIZ;
        AnchorStaticViewConfig anchorStaticViewConfig2 = (AnchorStaticViewConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_static_view_ads", AnchorStaticViewConfig.class, anchorStaticViewConfig);
        return anchorStaticViewConfig2 != null ? anchorStaticViewConfig2 : anchorStaticViewConfig;
    }
}
