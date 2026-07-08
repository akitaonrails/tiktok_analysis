package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0KOO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KOO {
    public static final C0KOO LIZ = new C0KOO();

    public static void LIZ(Map map) {
        Integer numLJIIJJI;
        Long lLJIILIIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = (String) map.get("action_type");
        if (str != null) {
            c2344009Gk.LJFF("action_type", str);
        }
        String str2 = (String) map.get("collection_id");
        if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            c2344009Gk.LIZLLL(lLJIILIIL.longValue(), "collection_id");
        }
        String str3 = (String) map.get("previous_page");
        if (str3 != null) {
            c2344009Gk.LJFF("previous_page", str3);
        }
        String str4 = (String) map.get("enter_from");
        if (str4 != null) {
            c2344009Gk.LJFF("enter_from", str4);
        }
        String str5 = (String) map.get("series_enter_entrance");
        if (str5 != null) {
            c2344009Gk.LJFF("series_enter_entrance", str5);
        }
        String str6 = (String) map.get("business_type");
        if (str6 != null) {
            c2344009Gk.LJFF("business_type", str6);
        }
        String str7 = (String) map.get("subscribe_state");
        if (str7 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str7)) != null) {
            c2344009Gk.LIZJ(numLJIIJJI.intValue(), "subscribe_state");
        }
        String str8 = (String) map.get("payment_type");
        if (str8 != null) {
            c2344009Gk.LJFF("payment_type", str8);
        }
        String str9 = (String) map.get("show_type");
        if (str9 != null) {
            c2344009Gk.LJFF("show_type", str9);
        }
        String str10 = (String) map.get("click_position");
        if (str10 != null) {
            c2344009Gk.LJFF("click_position", str10);
        }
        String str11 = (String) map.get("error_code");
        if (str11 != null) {
            c2344009Gk.LJFF("error_code", str11);
        }
        String str12 = (String) map.get("error_msg");
        if (str12 != null) {
            c2344009Gk.LJFF("error_msg", str12);
        }
        C20684815ws.LJIILLIIL("collection_failed_pop", c2344009Gk.LIZ);
    }
}
