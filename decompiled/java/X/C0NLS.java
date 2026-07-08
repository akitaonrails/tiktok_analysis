package X;

import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NLS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NLS {
    public static final C0NLS LIZ = new C0NLS();

    public static void LIZ(int i, long j) {
        C20684815ws.LJIILLIIL("icon_data_collect", C2097608Jq.LJIIIIZZ(new Pair("icon_size", String.valueOf(i)), new Pair("cost_time", String.valueOf(j))));
    }

    public static void LIZIZ(String str, String str2, EnumC592410NLj enumC592410NLj, boolean z, String str3, String str4, C0NLT c0nlt) {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("icon_id", str);
        pairArr[1] = new Pair("tab_key", str2);
        pairArr[2] = new Pair("tab_position", enumC592410NLj.name().toLowerCase(Locale.getDefault()));
        pairArr[3] = new Pair("is_success", C0NLO.LIZ(z));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("fail_reason", str3);
        pairArr[5] = new Pair("source", str4);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (c0nlt != null) {
            mapLJIIJ.put("is_first_screen", C0NLO.LIZ(c0nlt.LIZ));
            mapLJIIJ.put("is_dark", C0NLO.LIZ(c0nlt.LIZIZ));
            mapLJIIJ.put("is_selected", C0NLO.LIZ(c0nlt.LIZJ));
        }
        C20684815ws.LJIILLIIL("icon_show_result", mapLJIIJ);
    }
}
