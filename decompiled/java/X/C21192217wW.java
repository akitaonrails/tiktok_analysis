package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.EcommerceRegionData;

/* JADX INFO: renamed from: X.17wW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21192217wW {
    public static final EcommerceRegionData LIZ = new EcommerceRegionData();

    public static final EcommerceRegionData LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            EcommerceRegionData ecommerceRegionData = LIZ;
            EcommerceRegionData ecommerceRegionData2 = (EcommerceRegionData) c0c64LJIILLIIL.LJJII(EcommerceRegionData.class, ecommerceRegionData, "live_ecommerce_region_switch", true);
            return ecommerceRegionData2 != null ? ecommerceRegionData2 : ecommerceRegionData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2370109Ql.LIZ(e, "EcommerceRegionConfig");
            return LIZ;
        }
    }
}
