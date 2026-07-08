package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;

/* JADX INFO: renamed from: X.0vnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756210vnn {
    public static final boolean LIZIZ(ProductPackStruct productPackStruct) {
        if (productPackStruct != null && productPackStruct.blockPageInfo == null) {
            return true;
        }
        return false;
    }

    public static final void LIZ(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
        String str;
        C1758040vqk c1758040vqkLIZ;
        if (pdpEnterParam != null && (str = pdpEnterParam.trackId) != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            if (z) {
                c1758040vqkLIZ.LJFF("t_close_pdp", true);
            }
            if (!c1758040vqkLIZ.LIZLLL.getAndSet(true)) {
                C1018703yb.LJ("rd_tiktokec_pdp_perf_page_render", c1758040vqkLIZ.LIZIZ());
            }
        }
    }

    public static final void LIZJ(IPdpStarter.PdpEnterParam pdpEnterParam, int i) {
        String str;
        C1758040vqk c1758040vqkLIZ;
        if (pdpEnterParam != null && (str = pdpEnterParam.trackId) != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            if (i != 23002002) {
                if (i != 23002102) {
                    if (i != 23004009) {
                        c1758040vqkLIZ.LIZLLL(EnumC1756220vno.OTHER_ERROR);
                        return;
                    } else {
                        c1758040vqkLIZ.LIZLLL(EnumC1756220vno.UNDER_AGE_GATE);
                        return;
                    }
                }
                c1758040vqkLIZ.LIZLLL(EnumC1756220vno.REGION_ERROR);
                return;
            }
            c1758040vqkLIZ.LIZLLL(EnumC1756220vno.NOT_EXIT);
        }
    }

    public static final void LJFF(IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct) {
        String str;
        C1758040vqk c1758040vqkLIZ;
        if (pdpEnterParam != null && LIZIZ(productPackStruct) && (str = pdpEnterParam.trackId) != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            c1758040vqkLIZ.LJFF("t_handle_online_data_end", false);
        }
    }

    public static final void LIZLLL(IPdpStarter.PdpEnterParam pdpEnterParam, EnumC1756170vnj enumC1756170vnj, ProductPackStruct productPackStruct) {
        String str;
        C1758040vqk c1758040vqkLIZ;
        if (pdpEnterParam != null && (str = pdpEnterParam.trackId) != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            c1758040vqkLIZ.LIZJ(enumC1756170vnj.getValue(), "before_online_page_status", false);
            if (LIZIZ(productPackStruct)) {
                c1758040vqkLIZ.LJFF("t_cache_render_start", false);
            }
        }
    }

    public static final void LJ(IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, EnumC1756200vnm enumC1756200vnm) {
        String str;
        C1758040vqk c1758040vqkLIZ;
        if (pdpEnterParam != null && (str = pdpEnterParam.trackId) != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            c1758040vqkLIZ.LIZJ(enumC1756200vnm.getValue(), "online_data_ready_stage", false);
            if (LIZIZ(productPackStruct)) {
                c1758040vqkLIZ.LIZJ(Boolean.TRUE, "after_online_render_success", false);
            } else if (productPackStruct != null && productPackStruct.blockPageInfo != null) {
                c1758040vqkLIZ.LIZLLL(EnumC1756220vno.BLOCK);
            }
            if (!LIZIZ(productPackStruct)) {
                LIZ(pdpEnterParam, false);
            } else {
                c1758040vqkLIZ.LJFF("t_online_render_start", false);
            }
        }
    }

    public static final void LJI(IPdpStarter.PdpEnterParam pdpEnterParam, String str, boolean z) {
        String str2;
        C1758040vqk c1758040vqkLIZ;
        if (pdpEnterParam != null && (str2 = pdpEnterParam.trackId) != null && (c1758040vqkLIZ = C10287040n.LIZ(str2)) != null) {
            c1758040vqkLIZ.LJFF(str, z);
        }
    }
}
