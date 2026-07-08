package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.amazon.model.AmazonConfigSettingModel;

/* JADX INFO: renamed from: X.0DHE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DHE {
    public static final AmazonConfigSettingModel LIZ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new AmazonConfigSettingModel(bool, "ETF1c8ID1o2vUvYyCOWES4YSTrA7AUKo931bY54M", "amzn1.application-oa2-client.1f48737b5c6043faac96a2ea9b359aa9", "https://www.tiktok.com/third-party-oauth-redirect/commerce/buy-with-amazon", bool, ".shop-external.amazon,.social.amazon.com,.social.amazon.ca,social.amazon.com,social.amazon.ca");
    }

    public static AmazonConfigSettingModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AmazonConfigSettingModel amazonConfigSettingModel = LIZ;
        AmazonConfigSettingModel amazonConfigSettingModel2 = (AmazonConfigSettingModel) settingsManagerLIZLLL.LJIIIIZZ("amazon_native_checkout_config", AmazonConfigSettingModel.class, amazonConfigSettingModel);
        return amazonConfigSettingModel2 != null ? amazonConfigSettingModel2 : amazonConfigSettingModel;
    }
}
