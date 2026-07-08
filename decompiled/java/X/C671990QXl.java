package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0QXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671990QXl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, Map map) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("root_enter_from_type", str), new Pair("enter_from", str2));
        mapLJIIJ.putAll(map);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_search_middle_enter", mapLJIIJ);
    }

    public static void LIZ(String str, String str2, String str3, C672020QXo c672020QXo) {
        String str4;
        if (c672020QXo != null) {
            C0QYA c0qya = c672020QXo.LL;
            int i = 0;
            while (true) {
                if (c0qya != null && i < 70) {
                    if (c0qya.LIZLLL && c0qya.LJI == C0QUV.SUGGEST) {
                        Map<String, String> map = c0qya.LJII;
                        if (map == null || (str4 = map.get("blankpage_enter_method")) == null) {
                            break;
                        }
                    } else {
                        c0qya = c0qya.LIZ;
                        i++;
                    }
                } else {
                    break;
                }
            }
            str4 = "enter";
        } else {
            str4 = "enter";
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("root_enter_from_type", str), new Pair("enter_from", str2), new Pair("enter_method", str4), new Pair("words_source", str3));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_search_component_click", mapLJIIJ);
    }

    public static void LIZJ(String str, String str2, C672020QXo c672020QXo, Map map) {
        String str3;
        if (c672020QXo != null) {
            C0QYA c0qya = c672020QXo.LL;
            int i = 0;
            while (true) {
                if (c0qya != null && i < 70) {
                    if (c0qya.LIZLLL && c0qya.LJI == C0QUV.SUGGEST) {
                        Map<String, String> map2 = c0qya.LJII;
                        if (map2 == null || (str3 = map2.get("blankpage_enter_method")) == null) {
                            break;
                        }
                    } else {
                        c0qya = c0qya.LIZ;
                        i++;
                    }
                } else {
                    break;
                }
            }
            str3 = "enter";
        } else {
            str3 = "enter";
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("root_enter_from_type", str), new Pair("enter_from", str2), new Pair("enter_method", str3));
        mapLJIIJ.putAll(map);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_search_middle_leave", mapLJIIJ);
    }
}
