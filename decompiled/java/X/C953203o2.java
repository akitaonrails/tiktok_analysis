package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.OSPPreloadConfig;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03o2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C953203o2 {
    public static final OSPPreloadConfig LIZ = new OSPPreloadConfig(false, null, 0, Float.valueOf(0.0f), Float.valueOf(0.0f));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(355));

    public static OSPPreloadConfig LIZLLL() {
        return (OSPPreloadConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        return C03RU.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_cart_to_osp_preload_full_data", true, false);
    }

    public static boolean LIZIZ() {
        if (!LIZLLL().enable) {
            if (C953303o3.LIZJ == -1.0f) {
                C1323740kYG.LIZ.getClass();
                C953303o3.LIZJ = C1323740kYG.LIZ();
            }
            float f = C953303o3.LIZJ;
            if (f == -1.0f || f >= C953303o3.LIZ || f < C953303o3.LIZIZ) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_pdp_to_osp_preload_full_data", true, false) || LIZ();
    }
}
