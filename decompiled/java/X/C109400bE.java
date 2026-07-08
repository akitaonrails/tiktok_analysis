package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00bE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C109400bE {
    public static final C109400bE LIZ = new C109400bE();

    public static void LIZ(String str, String str2, String str3, int i, String str4, Boolean bool) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", str), new Pair("card_type", str2), new Pair("schema", str3), new Pair("error_code", String.valueOf(i)));
        if (str4 != null) {
            mapLJIIJ.put("error_msg", str4);
        }
        if (bool != null) {
            mapLJIIJ.put("is_delete_current_card", String.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C20684815ws.LJIILLIIL("mini_drama_inner_feed_card_load_failed", mapLJIIJ);
    }
}
