package X;

/* JADX INFO: renamed from: X.0ZjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907780ZjM {
    public static void LIZJ(C907790ZjN c907790ZjN) {
        long j;
        String str;
        C0I0B.LJFF.LIZIZ();
        C13DA c13da = new C13DA();
        String str2 = c907790ZjN.LIZ;
        if (str2 != null) {
            c13da.put("sync_type", str2);
        }
        LIZ(Integer.valueOf(c907790ZjN.LIZIZ), "origin_data_count", c13da);
        LIZ(Integer.valueOf(c907790ZjN.LIZJ), "fts_data_count", c13da);
        LIZIZ(Long.valueOf(c907790ZjN.LIZLLL), "overall_cost", c13da);
        LIZIZ(Long.valueOf(c907790ZjN.LJ), "fetch_data_cost", c13da);
        LIZIZ(Long.valueOf(c907790ZjN.LJFF), "generate_fts_data_cost", c13da);
        LIZIZ(Long.valueOf(c907790ZjN.LJI), "md5_comparison_cost", c13da);
        if (c907790ZjN.LJII) {
            j = 1;
        } else {
            j = 0;
        }
        LIZIZ(Long.valueOf(j), "md5_skip", c13da);
        LIZIZ(Long.valueOf(c907790ZjN.LJI + c907790ZjN.LJIIIIZZ + c907790ZjN.LJIIJJI), "fts_data_overall_cost", c13da);
        LIZ(Integer.valueOf(c907790ZjN.LJIIIZ + c907790ZjN.LJIIL), "fts_data_overall_count", c13da);
        LIZ(Integer.valueOf(c907790ZjN.LJIIJ + c907790ZjN.LJIILIIL), "fts_data_overall_final_count", c13da);
        LIZIZ(Long.valueOf(c907790ZjN.LJIIIIZZ), "update_fts_data_cost", c13da);
        LIZ(Integer.valueOf(c907790ZjN.LJIIIZ), "update_fts_data_count", c13da);
        LIZ(Integer.valueOf(c907790ZjN.LJIIJ), "update_fts_data_final_count", c13da);
        LIZIZ(Long.valueOf(c907790ZjN.LJIIJJI), "delete_fts_data_cost", c13da);
        LIZ(Integer.valueOf(c907790ZjN.LJIILIIL), "delete_fts_data_final_count", c13da);
        LIZ(Integer.valueOf(c907790ZjN.LJIIL), "delete_fts_data_count", c13da);
        if (c907790ZjN.LJIILJJIL) {
            str = "manual";
        } else {
            str = "cold_start";
        }
        c13da.put("sync_stage", str);
        C20684815ws.LJIILLIIL("dm_search_sync_data_performance", c13da);
        c13da.build();
    }

    public static void LIZ(Integer num, String str, C13DA c13da) {
        String string;
        if (num != null && (string = num.toString()) != null) {
            c13da.put(str, string);
        }
    }

    public static void LIZIZ(Long l, String str, C13DA c13da) {
        String string;
        if (l != null && (string = l.toString()) != null) {
            c13da.put(str, string);
        }
    }
}
