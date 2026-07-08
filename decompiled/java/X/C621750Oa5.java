package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.AnchorPinCardEducationConfigItem;

/* JADX INFO: renamed from: X.0Oa5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621750Oa5 {
    public static final AnchorPinCardEducationConfigItem LIZ = new AnchorPinCardEducationConfigItem(1000, 10000, false);

    public static AnchorPinCardEducationConfigItem LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AnchorPinCardEducationConfigItem anchorPinCardEducationConfigItem = LIZ;
        AnchorPinCardEducationConfigItem anchorPinCardEducationConfigItem2 = (AnchorPinCardEducationConfigItem) settingsManagerLIZLLL.LJIIIIZZ("ec_live_anchor_pin_card_education_config", AnchorPinCardEducationConfigItem.class, anchorPinCardEducationConfigItem);
        return anchorPinCardEducationConfigItem2 != null ? anchorPinCardEducationConfigItem2 : anchorPinCardEducationConfigItem;
    }
}
