package X;

/* JADX INFO: renamed from: X.0IfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472230IfV {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        String strLIZ = C466640IRq.LIZJ().LIZ();
        return strLIZ == null ? "live_merge" : strLIZ;
    }

    public static String LIZIZ() {
        String strLIZIZ = C466640IRq.LIZJ().LIZIZ();
        return strLIZIZ == null ? "live_cover" : strLIZIZ;
    }

    public static String LIZJ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1882741760) {
                if (iHashCode != -710131922) {
                    if (iHashCode == 1081985277 && str.equals("search_history")) {
                        return "history";
                    }
                    return "normal";
                }
                if (str.equals("search_sug")) {
                    return "sug";
                }
                return "normal";
            }
            str.equals("normal_search");
            return "normal";
        }
        return "normal";
    }

    public static void LIZLLL(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_clear_all_history");
        c474500IjALIZ.LJJII(LIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(LIZIZ(), "enter_method");
        c474500IjALIZ.LJJII(str, "click_area");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enter_search_blankpage");
        c474500IjALIZ.LJJII(LIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(LIZIZ(), "enter_method");
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "keyword");
        c474500IjALIZ.LJJII(str2, "pre_enter_method");
        c474500IjALIZ.LIZ();
    }
}
