package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomOspPrivacyPopupConfig;

/* JADX INFO: renamed from: X.03Vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C854903Vr {
    public static final EcomOspPrivacyPopupConfig LIZ = new EcomOspPrivacyPopupConfig(true, true, true, null);

    public static final EcomOspPrivacyPopupConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomOspPrivacyPopupConfig ecomOspPrivacyPopupConfig = LIZ;
        EcomOspPrivacyPopupConfig ecomOspPrivacyPopupConfig2 = (EcomOspPrivacyPopupConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_osp_privacy_popup_fallback_settings", EcomOspPrivacyPopupConfig.class, ecomOspPrivacyPopupConfig);
        return ecomOspPrivacyPopupConfig2 != null ? ecomOspPrivacyPopupConfig2 : ecomOspPrivacyPopupConfig;
    }
}
