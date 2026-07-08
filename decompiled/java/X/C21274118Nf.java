package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.settings.AnchorDynamicAnimationConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.settings.AnchorStaticViewConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.18Nf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21274118Nf {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("ec_comment_shop_anchor", 0) == 1;
    }

    public static boolean LIZ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_shop_anchor_show_request_enable_ads", false)) {
                return true;
            }
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_shop_anchor_show_request_enable", false)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AnchorDynamicAnimationConfig anchorDynamicAnimationConfig = C18P0.LIZ;
            AnchorDynamicAnimationConfig anchorDynamicAnimationConfig2 = (AnchorDynamicAnimationConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_shop_anchor_dynamic_view_ads", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig);
            if (anchorDynamicAnimationConfig2 == null) {
                anchorDynamicAnimationConfig2 = anchorDynamicAnimationConfig;
            }
            if (anchorDynamicAnimationConfig2.enable) {
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig3 = (AnchorDynamicAnimationConfig) SettingsManager.LIZLLL().LJIIIIZZ("ec_shop_anchor_dynamic_view_ads", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig);
                if (anchorDynamicAnimationConfig3 != null) {
                    anchorDynamicAnimationConfig = anchorDynamicAnimationConfig3;
                }
                if (anchorDynamicAnimationConfig.delayShowSubtitle > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
        AnchorDynamicAnimationConfig anchorDynamicAnimationConfig4 = C18P2.LIZ;
        AnchorDynamicAnimationConfig anchorDynamicAnimationConfig5 = (AnchorDynamicAnimationConfig) settingsManagerLIZLLL2.LJIIIIZZ("ec_shop_anchor_dynamic_view", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig4);
        if (anchorDynamicAnimationConfig5 == null) {
            anchorDynamicAnimationConfig5 = anchorDynamicAnimationConfig4;
        }
        if (anchorDynamicAnimationConfig5.enable) {
            AnchorDynamicAnimationConfig anchorDynamicAnimationConfig6 = (AnchorDynamicAnimationConfig) SettingsManager.LIZLLL().LJIIIIZZ("ec_shop_anchor_dynamic_view", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig4);
            if (anchorDynamicAnimationConfig6 != null) {
                anchorDynamicAnimationConfig4 = anchorDynamicAnimationConfig6;
            }
            if (anchorDynamicAnimationConfig4.delayShowSubtitle > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int LIZLLL(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AnchorStaticViewConfig anchorStaticViewConfig = C18P1.LIZ;
            AnchorStaticViewConfig anchorStaticViewConfig2 = (AnchorStaticViewConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_shop_anchor_static_view_ads", AnchorStaticViewConfig.class, anchorStaticViewConfig);
            if (anchorStaticViewConfig2 == null) {
                anchorStaticViewConfig2 = anchorStaticViewConfig;
            }
            if (anchorStaticViewConfig2.enable) {
                AnchorStaticViewConfig anchorStaticViewConfig3 = (AnchorStaticViewConfig) SettingsManager.LIZLLL().LJIIIIZZ("ec_shop_anchor_static_view_ads", AnchorStaticViewConfig.class, anchorStaticViewConfig);
                if (anchorStaticViewConfig3 != null) {
                    anchorStaticViewConfig = anchorStaticViewConfig3;
                }
                return anchorStaticViewConfig.anchorIconStyle;
            }
            return C0TVM.ONLINE.ordinal();
        }
        SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
        AnchorStaticViewConfig anchorStaticViewConfig4 = C18P3.LIZ;
        AnchorStaticViewConfig anchorStaticViewConfig5 = (AnchorStaticViewConfig) settingsManagerLIZLLL2.LJIIIIZZ("ec_shop_anchor_static_view", AnchorStaticViewConfig.class, anchorStaticViewConfig4);
        if (anchorStaticViewConfig5 == null) {
            anchorStaticViewConfig5 = anchorStaticViewConfig4;
        }
        if (anchorStaticViewConfig5.enable) {
            AnchorStaticViewConfig anchorStaticViewConfig6 = (AnchorStaticViewConfig) SettingsManager.LIZLLL().LJIIIIZZ("ec_shop_anchor_static_view", AnchorStaticViewConfig.class, anchorStaticViewConfig4);
            if (anchorStaticViewConfig6 != null) {
                anchorStaticViewConfig4 = anchorStaticViewConfig6;
            }
            return anchorStaticViewConfig4.anchorIconStyle;
        }
        return C0TVM.ONLINE.ordinal();
    }
}
