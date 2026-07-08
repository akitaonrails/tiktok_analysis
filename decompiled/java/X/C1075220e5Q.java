package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.settings.AdLandingPagePrivacyPolicyConfigModel;

/* JADX INFO: renamed from: X.0e5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075220e5Q {
    public static final AdLandingPagePrivacyPolicyConfigModel LIZ = new AdLandingPagePrivacyPolicyConfigModel(Boolean.TRUE, "https://www.tiktok.com/legal/page/eea/privacy-policy/en", "https://www.tiktok.com/legal/privacy-policy", "https://www.tiktok.com/legal/page/us/privacy-policy/en");

    public static AdLandingPagePrivacyPolicyConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AdLandingPagePrivacyPolicyConfigModel adLandingPagePrivacyPolicyConfigModel = LIZ;
        AdLandingPagePrivacyPolicyConfigModel adLandingPagePrivacyPolicyConfigModel2 = (AdLandingPagePrivacyPolicyConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ad_iab_privacy_policy_config", AdLandingPagePrivacyPolicyConfigModel.class, adLandingPagePrivacyPolicyConfigModel);
        return adLandingPagePrivacyPolicyConfigModel2 != null ? adLandingPagePrivacyPolicyConfigModel2 : adLandingPagePrivacyPolicyConfigModel;
    }
}
