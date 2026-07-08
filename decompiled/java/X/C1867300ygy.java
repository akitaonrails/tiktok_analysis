package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings.ProductCardV2Config;

/* JADX INFO: renamed from: X.0ygy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867300ygy {
    public static final ProductCardV2Config LIZ = new ProductCardV2Config(false);

    public static boolean LIZ() {
        ProductCardV2Config productCardV2Config;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            productCardV2Config = LIZ;
            ProductCardV2Config productCardV2Config2 = (ProductCardV2Config) c0c64LJIILLIIL.LJJII(ProductCardV2Config.class, productCardV2Config, "ttec_pin_prodcut_card_v2", true);
            if (productCardV2Config2 != null) {
                productCardV2Config = productCardV2Config2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            productCardV2Config = LIZ;
        }
        return productCardV2Config.enable;
    }
}
