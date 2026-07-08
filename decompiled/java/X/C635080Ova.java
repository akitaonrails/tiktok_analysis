package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ova, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635080Ova {
    public static final C635080Ova LIZ = new C635080Ova();

    public static void LIZ(String str, String str2, String str3) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "brand_partnership_page"), new Pair("tab_name", str), new Pair("option_name", str2));
        if (str3 != null) {
            mapLJIIJ.put("action_type", str3);
        }
        C20684815ws.LJIILLIIL("message_filter_option_click", mapLJIIJ);
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        String str4;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("cell_type", "brand_partnership");
        pairArr[2] = new Pair("source", str3);
        if (z) {
            str4 = "subscribed";
        } else {
            str4 = "unsubscribed";
        }
        pairArr[3] = new Pair("type", str4);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str2 != null) {
            mapLJIIJ.put("tab_name", str2);
        }
        C20684815ws.LJIILLIIL("message_manage_click", mapLJIIJ);
    }
}
