package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.AddToCartConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03U8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03U8 {
    public static final boolean LIZ;
    public static final boolean LIZIZ;

    static {
        AddToCartConfig addToCartConfig = new AddToCartConfig(false, false, false);
        AddToCartConfig addToCartConfig2 = (AddToCartConfig) C0C64.LJIILLIIL().LJJII(AddToCartConfig.class, addToCartConfig, "ecom_cart_decoupling_config", true);
        if (addToCartConfig2 != null) {
            addToCartConfig = addToCartConfig2;
        }
        LIZ = addToCartConfig.normalOsp;
        LIZIZ = addToCartConfig.combinedSkuOsp;
    }

    public static Boolean LIZ(String str) {
        if (Intrinsics.LJFF(str, "normal_checkout")) {
            return Boolean.valueOf(LIZ);
        }
        if (Intrinsics.LJFF(str, "one_step_checkout")) {
            return Boolean.valueOf(LIZIZ);
        }
        return null;
    }
}
