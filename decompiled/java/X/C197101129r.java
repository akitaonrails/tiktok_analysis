package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.129r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197101129r {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ(Integer num, String str, String str2) {
        String string;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "homepage_hot");
        String str3 = "";
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("prop_list", str);
        if (num != null && (string = num.toString()) != null) {
            str3 = string;
        }
        pairArr[2] = new Pair("card_position", str3);
        pairArr[3] = new Pair("card_type", "prop_card");
        pairArr[4] = new Pair("UI_type", str2);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static void LIZ(String str, Integer num, String str2, String str3, String str4, String str5) {
        Map mapLIZIZ = LIZIZ(num, str2, str3);
        if (str == null) {
            str = "";
        }
        mapLIZIZ.put("music_id", str);
        if (str4 != null) {
            mapLIZIZ.put("request_id", str4);
        }
        if (str5 != null) {
            mapLIZIZ.put("group_id", str5);
        }
        C1449260noi.LJ("prop_recommend_card_show", mapLIZIZ);
    }
}
