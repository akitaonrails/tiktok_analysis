package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0uV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706130uV1 {
    public long LIZ;
    public final /* synthetic */ C1706140uV2 LIZIZ;

    public final void LIZLLL() {
        C1706140uV2.LJ = null;
        if (this.LIZ > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("panel_name", this.LIZIZ.LIZ);
            linkedHashMap.put("category_name", this.LIZIZ.LIZIZ);
            linkedHashMap.put("panel_data_load_result_code", String.valueOf(this.LIZIZ.LIZJ));
            linkedHashMap.put("asset_resource_from", this.LIZIZ.LIZLLL);
            linkedHashMap.put("panel_data_load_time", String.valueOf(System.currentTimeMillis() - this.LIZ));
            this.LIZIZ.getClass();
            linkedHashMap.put("result_list_empty", String.valueOf(-1));
            C00YL c00ylLIZ = C1706400uVS.LIZ();
            if (c00ylLIZ != null) {
                c00ylLIZ.LIZ("ame_performance_load_panel_data", linkedHashMap);
            }
        }
    }

    public final void LJ() {
        this.LIZ = System.currentTimeMillis();
    }

    public C1706130uV1(C1706140uV2 c1706140uV2) {
        this.LIZIZ = c1706140uV2;
    }

    public final void LIZ(boolean z) {
        String str;
        C1706140uV2 c1706140uV2 = this.LIZIZ;
        if (z) {
            str = "cache";
        } else {
            str = "net";
        }
        c1706140uV2.LIZLLL = str;
    }

    public final void LIZIZ(String str, String str2) {
        C1706140uV2 c1706140uV2 = this.LIZIZ;
        c1706140uV2.LIZ = str;
        if (str2 == null) {
            str2 = "all";
        }
        c1706140uV2.LIZIZ = str2;
    }
}
