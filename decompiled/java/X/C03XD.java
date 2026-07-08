package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.DeviceScoreLimit;
import com.ss.android.ugc.aweme.ecommerce.core.ab.DynamicPreloadXmlConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspXmlPreloadConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03XD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XD {
    public static final OspXmlPreloadConfig LIZ;

    static {
        Boolean bool = Boolean.FALSE;
        Float fValueOf = Float.valueOf(0.0f);
        LIZ = new OspXmlPreloadConfig(bool, 0, null, new DeviceScoreLimit(fValueOf, fValueOf), null, null);
    }

    public static boolean LIZ() {
        return Intrinsics.LJFF(LIZJ().appListPreloadEvent, "bill_info_preload");
    }

    public static OspXmlPreloadConfig LIZJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        OspXmlPreloadConfig ospXmlPreloadConfig = LIZ;
        OspXmlPreloadConfig ospXmlPreloadConfig2 = (OspXmlPreloadConfig) c0c64LJIILLIIL.LJJII(OspXmlPreloadConfig.class, ospXmlPreloadConfig, "ecom_osp_xml_preload", true);
        return ospXmlPreloadConfig2 != null ? ospXmlPreloadConfig2 : ospXmlPreloadConfig;
    }

    public static boolean LIZIZ(String str) {
        DynamicPreloadXmlConfig dynamicPreloadXmlConfig;
        if (Intrinsics.LJFF(str, "scene_full_page")) {
            DynamicPreloadXmlConfig dynamicPreloadXmlConfig2 = LIZJ().dynamicPreloadXmlConfig;
            if (dynamicPreloadXmlConfig2 != null) {
                return Intrinsics.LJFF(dynamicPreloadXmlConfig2.enableFullScreenPreload, Boolean.TRUE);
            }
            return false;
        }
        if (Intrinsics.LJFF(str, "scene_combine_sku_page") && (dynamicPreloadXmlConfig = LIZJ().dynamicPreloadXmlConfig) != null) {
            return Intrinsics.LJFF(dynamicPreloadXmlConfig.enableOneStepCheckoutPreload, Boolean.TRUE);
        }
        return false;
    }
}
