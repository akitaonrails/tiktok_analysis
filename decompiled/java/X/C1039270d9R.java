package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutCSPConfigModel;

/* JADX INFO: renamed from: X.0d9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039270d9R {
    public static final ShopifyCheckoutCSPConfigModel LIZ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new ShopifyCheckoutCSPConfigModel(bool, bool, bool, Boolean.TRUE);
    }

    public static ShopifyCheckoutCSPConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ShopifyCheckoutCSPConfigModel shopifyCheckoutCSPConfigModel = LIZ;
        ShopifyCheckoutCSPConfigModel shopifyCheckoutCSPConfigModel2 = (ShopifyCheckoutCSPConfigModel) settingsManagerLIZLLL.LJIIIIZZ("shopify_csp_config", ShopifyCheckoutCSPConfigModel.class, shopifyCheckoutCSPConfigModel);
        return shopifyCheckoutCSPConfigModel2 != null ? shopifyCheckoutCSPConfigModel2 : shopifyCheckoutCSPConfigModel;
    }
}
