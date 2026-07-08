package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.OptimizeCheckoutConfig;

/* JADX INFO: renamed from: X.03an, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C871103an {
    public static final OptimizeCheckoutConfig LIZ = new OptimizeCheckoutConfig(false, false, false);

    public static boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        OptimizeCheckoutConfig optimizeCheckoutConfig = LIZ;
        OptimizeCheckoutConfig optimizeCheckoutConfig2 = (OptimizeCheckoutConfig) c0c64LJIILLIIL.LJJII(OptimizeCheckoutConfig.class, optimizeCheckoutConfig, "ecom_optimize_checkout_process_sea", true);
        if (optimizeCheckoutConfig2 != null) {
            optimizeCheckoutConfig = optimizeCheckoutConfig2;
        }
        return optimizeCheckoutConfig.enablePayOptimize;
    }
}
