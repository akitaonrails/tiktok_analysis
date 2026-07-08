package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.AnchorDynamicAnimationConfig;

/* JADX INFO: renamed from: X.18Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21276218Oa {
    public static final AnchorDynamicAnimationConfig LIZ = new AnchorDynamicAnimationConfig(false, 3, 0);

    public static final AnchorDynamicAnimationConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AnchorDynamicAnimationConfig anchorDynamicAnimationConfig = LIZ;
        AnchorDynamicAnimationConfig anchorDynamicAnimationConfig2 = (AnchorDynamicAnimationConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_dynamic_view_ads", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig);
        return anchorDynamicAnimationConfig2 != null ? anchorDynamicAnimationConfig2 : anchorDynamicAnimationConfig;
    }
}
