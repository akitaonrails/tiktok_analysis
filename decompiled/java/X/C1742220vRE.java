package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomCartLynxImagePreloadModel;

/* JADX INFO: renamed from: X.0vRE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742220vRE {
    public static final boolean LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;

    static {
        EcomCartLynxImagePreloadModel ecomCartLynxImagePreloadModel = new EcomCartLynxImagePreloadModel(false, 0, 0);
        EcomCartLynxImagePreloadModel ecomCartLynxImagePreloadModel2 = (EcomCartLynxImagePreloadModel) C0C64.LJIILLIIL().LJJII(EcomCartLynxImagePreloadModel.class, ecomCartLynxImagePreloadModel, "ecom_cart_lynx_image_preload_precise", true);
        if (ecomCartLynxImagePreloadModel2 != null) {
            ecomCartLynxImagePreloadModel = ecomCartLynxImagePreloadModel2;
        }
        LIZ = ecomCartLynxImagePreloadModel.enable;
        LIZIZ = ecomCartLynxImagePreloadModel.productCount;
        LIZJ = ecomCartLynxImagePreloadModel.sellerCount;
    }
}
