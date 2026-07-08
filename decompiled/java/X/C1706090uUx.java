package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0uUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706090uUx {
    public long LIZ;
    public final /* synthetic */ C1706050uUt LIZIZ;

    public final void LIZLLL() {
        C1706050uUt.LJIILIIL = null;
        if (this.LIZ > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("panel_name", this.LIZIZ.LIZ);
            linkedHashMap.put("category_name", this.LIZIZ.LIZIZ);
            linkedHashMap.put("panel_data_load_result_code", String.valueOf(this.LIZIZ.LIZJ));
            linkedHashMap.put("panel_data_sub_error_code", String.valueOf(this.LIZIZ.LIZLLL));
            linkedHashMap.put("category_load_result_code", String.valueOf(this.LIZIZ.LJIIIZ));
            linkedHashMap.put("category_sub_error_code", String.valueOf(this.LIZIZ.LJIIJ));
            linkedHashMap.put("sublist_load_result_code", String.valueOf(this.LIZIZ.LJIIJJI));
            linkedHashMap.put("sublist_sub_error_code", String.valueOf(this.LIZIZ.LJIIL));
            linkedHashMap.put("asset_resource_from", this.LIZIZ.LJ);
            linkedHashMap.put("category_resource_from", this.LIZIZ.LJII);
            linkedHashMap.put("sublist_resource_from", this.LIZIZ.LJIIIIZZ);
            linkedHashMap.put("panel_data_load_time", String.valueOf(System.currentTimeMillis() - this.LIZ));
            this.LIZIZ.getClass();
            linkedHashMap.put("result_list_cursor", String.valueOf(-1));
            this.LIZIZ.getClass();
            linkedHashMap.put("result_list_count", String.valueOf(-1));
            linkedHashMap.put("edit_mode", String.valueOf(this.LIZIZ.LJFF));
            linkedHashMap.put("paginated_data", String.valueOf(this.LIZIZ.LJI));
            C00YL c00ylLIZ = C1706400uVS.LIZ();
            if (c00ylLIZ != null) {
                c00ylLIZ.LIZ("ame_performance_paginated_data", linkedHashMap);
            }
        }
    }

    public final void LJ() {
        this.LIZ = System.currentTimeMillis();
    }

    public C1706090uUx(C1706050uUt c1706050uUt) {
        this.LIZIZ = c1706050uUt;
    }

    public final void LIZ(boolean z) {
        this.LIZIZ.LJFF = z ? 1 : 0;
    }

    public final void LIZIZ(boolean z) {
        this.LIZIZ.LJI = z ? 1 : 0;
    }

    public final void LIZJ(String str) {
        C1706050uUt c1706050uUt = this.LIZIZ;
        c1706050uUt.LIZ = str;
        c1706050uUt.LIZIZ = "first_page";
    }
}
