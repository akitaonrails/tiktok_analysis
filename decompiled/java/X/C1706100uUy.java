package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0uUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706100uUy {
    public long LIZ;
    public final /* synthetic */ C1706110uUz LIZIZ;

    public final void LJFF() {
        if (this.LIZ <= 0 || this.LIZIZ.LJIIIIZZ) {
            return;
        }
        this.LIZIZ.LJIIIIZZ = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel_name", this.LIZIZ.LIZ);
        linkedHashMap.put("category_name", this.LIZIZ.LIZIZ);
        linkedHashMap.put("panel_data_load_result_code", String.valueOf(this.LIZIZ.LIZJ));
        linkedHashMap.put("panel_data_sub_error_code", String.valueOf(this.LIZIZ.LIZLLL));
        this.LIZIZ.getClass();
        linkedHashMap.put("category_load_result_code", String.valueOf(1));
        this.LIZIZ.getClass();
        linkedHashMap.put("category_sub_error_code", String.valueOf(0));
        this.LIZIZ.getClass();
        linkedHashMap.put("sublist_load_result_code", String.valueOf(1));
        this.LIZIZ.getClass();
        linkedHashMap.put("sublist_sub_error_code", String.valueOf(0));
        linkedHashMap.put("asset_resource_from", this.LIZIZ.LJ);
        linkedHashMap.put("category_resource_from", this.LIZIZ.LJIIIZ);
        this.LIZIZ.getClass();
        linkedHashMap.put("sublist_resource_from", "");
        linkedHashMap.put("panel_data_load_time", String.valueOf(System.currentTimeMillis() - this.LIZ));
        linkedHashMap.put("result_list_cursor", String.valueOf(this.LIZIZ.LJFF));
        linkedHashMap.put("result_list_count", String.valueOf(this.LIZIZ.LJI));
        linkedHashMap.put("edit_mode", String.valueOf(this.LIZIZ.LJII));
        linkedHashMap.put("paginated_data", String.valueOf(this.LIZIZ.LJIIJ));
        linkedHashMap.put("loading_status", this.LIZIZ.LJIIJJI);
        C00YL c00ylLIZ = C1706400uVS.LIZ();
        if (c00ylLIZ != null) {
            c00ylLIZ.LIZ("ame_performance_paginated_data", linkedHashMap);
        }
    }

    public final void LJI() {
        this.LIZ = System.currentTimeMillis();
    }

    public C1706100uUy(C1706110uUz c1706110uUz) {
        this.LIZIZ = c1706110uUz;
    }

    public final void LIZ(boolean z) {
        this.LIZIZ.LJII = z ? 1 : 0;
    }

    public final void LIZIZ(boolean z) {
        this.LIZIZ.LJIIJ = z ? 1 : 0;
    }

    public final void LIZJ(String str) {
        this.LIZIZ.LJIIJJI = str;
    }

    public final void LIZLLL(int i) {
        this.LIZIZ.LIZJ = i;
    }

    public final void LJ(String str, String str2) {
        C1706110uUz c1706110uUz = this.LIZIZ;
        c1706110uUz.LIZ = str;
        if (str2 == null) {
            str2 = "all";
        }
        c1706110uUz.LIZIZ = str2;
    }
}
