package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;

/* JADX INFO: renamed from: X.0vnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756150vnh {
    public C1756090vnb LIZ;
    public Long LIZIZ;

    public final void LIZ(boolean z) {
        C1756090vnb c1756090vnb = this.LIZ;
        if (c1756090vnb != null) {
            if (z) {
                c1756090vnb.LJII("t_close_pdp", true);
            }
            c1756090vnb.LIZLLL();
        }
    }

    public final void LIZIZ(EnumC1756160vni enumC1756160vni, ProductPackStruct productPackStruct) {
        C1756090vnb c1756090vnb = this.LIZ;
        if (c1756090vnb != null) {
            c1756090vnb.LJ(enumC1756160vni.getValue(), "before_online_page_status", false);
            if (C1756210vnn.LIZIZ(productPackStruct)) {
                c1756090vnb.LJII("t_cache_render_start", true);
                c1756090vnb.LJII("t_handle_cache_data_start", true);
            }
        }
    }

    public final void LIZJ(ProductPackStruct productPackStruct, EnumC1756190vnl enumC1756190vnl) {
        C1756090vnb c1756090vnb = this.LIZ;
        if (c1756090vnb != null) {
            c1756090vnb.LJ(enumC1756190vnl.getValue(), "online_data_ready_stage", false);
            if (productPackStruct != null) {
                if (productPackStruct.blockPageInfo == null) {
                    c1756090vnb.LJ(Boolean.TRUE, "after_online_render_success", false);
                } else if (productPackStruct.blockPageInfo != null) {
                    c1756090vnb.LJ(EnumC1756230vnp.BLOCK.getValue(), "after_online_error_status", false);
                }
                if (productPackStruct != null && productPackStruct.blockPageInfo == null) {
                    c1756090vnb.LJII("t_online_render_start", false);
                    return;
                }
            }
            LIZ(false);
        }
    }

    public final void LJ(String str, boolean z) {
        C1756090vnb c1756090vnb = this.LIZ;
        if (c1756090vnb != null) {
            c1756090vnb.LJII(str, z);
        }
    }

    public final void LIZLLL(Object obj, String str, boolean z) {
        C1756090vnb c1756090vnb = this.LIZ;
        if (c1756090vnb != null) {
            c1756090vnb.LJ(obj, str, z);
        }
    }
}
