package X;

import com.ss.android.ugc.aweme.discover.model.SearchMinis;
import com.ss.android.ugc.aweme.discover.model.SearchMinisItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682730QqF {
    public static final C682730QqF LIZ = new C682730QqF();

    public static void LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_method", "search");
        if (str != null) {
            c2344009Gk.LJFF("client_key", str);
        }
        c2344009Gk.LJFF("minis_type", str2);
        C20684815ws.LJIILLIIL("minis_entrance_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_method", "search");
        if (str != null) {
            c2344009Gk.LJFF("client_key", str);
        }
        c2344009Gk.LJFF("minis_type", str2);
        C20684815ws.LJIILLIIL("minis_entrance_show", c2344009Gk.LIZ);
    }

    public static void LJ(String str, HashMap map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (String str2 : map.keySet()) {
            c2344009Gk.LJFF(str2, (String) map.get(str2));
        }
        c2344009Gk.LJFF("click_actions", "click_back");
        c2344009Gk.LJFF("minis_type", str);
        C20684815ws.LJIILLIIL("search_minis_details_click", c2344009Gk.LIZ);
    }

    public static void LJFF(String str, HashMap map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (String str2 : map.keySet()) {
            c2344009Gk.LJFF(str2, (String) map.get(str2));
        }
        c2344009Gk.LJFF("minis_type", str);
        C20684815ws.LJIILLIIL("search_minis_details_show", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, HashMap map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (String str3 : map.keySet()) {
            c2344009Gk.LJFF(str3, (String) map.get(str3));
        }
        c2344009Gk.LJFF("minis_type", str2);
        if (Intrinsics.LJFF(str2, "mini_game")) {
            c2344009Gk.LJFF("click_actions", "play_game");
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click_");
            sbLIZ.append(str);
            c2344009Gk.LJFF("click_actions", C2188811AlT.LIZIZ(sbLIZ));
        }
        C20684815ws.LJIILLIIL("search_minis_details_click", c2344009Gk.LIZ);
    }

    public static HashMap LIZ(SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility, C646370PWx c646370PWx, FirstScreenHelperAbility firstScreenHelperAbility, String str) {
        SearchMixFeed searchMixFeed;
        SearchMixFeed searchMixFeed2;
        SearchMixFeed searchMixFeed3;
        SearchMinis searchMinis;
        SearchMinis searchMinis2;
        C644910PRh c644910PRhLIZJ;
        String str2;
        C644910PRh c644910PRhLIZJ2;
        String str3;
        HashMap map = new HashMap();
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ != null && (c644910PRhLIZJ2 = interfaceC649890PeNLIZ.LIZJ()) != null && (str3 = c644910PRhLIZJ2.LIZ) != null) {
            map.put("search_id", str3);
        }
        InterfaceC649890PeN interfaceC649890PeNLIZ2 = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ2 != null && (c644910PRhLIZJ = interfaceC649890PeNLIZ2.LIZJ()) != null && (str2 = c644910PRhLIZJ.LIZIZ) != null) {
            map.put("search_keyword", str2);
        }
        if (c646370PWx != null) {
            Integer num = c646370PWx.LLJILJIL;
            if (num != null) {
                map.put("universal_rank", String.valueOf(num.intValue()));
            }
            map.put("rank", String.valueOf(c646370PWx.LLILZLL));
        }
        map.put("enter_from", "general_search");
        if (searchServiceCenter$CardCommonAbility != null) {
            InterfaceC594520NTm interfaceC594520NTmCB2 = searchServiceCenter$CardCommonAbility.cB2();
            Long lValueOf = null;
            if (interfaceC594520NTmCB2 instanceof SearchMixFeed) {
                searchMixFeed = (SearchMixFeed) interfaceC594520NTmCB2;
            } else {
                searchMixFeed = null;
            }
            if (searchMixFeed != null && (searchMinis2 = searchMixFeed.minis) != null && (!searchMinis2.minisItems.isEmpty())) {
                map.put("minis_lst", C13LP.LJJLIIIJ(searchMinis2.minisItems, ",", null, null, 0, null, AFwS241S0000000_10.get$arr$(485), 30));
                map.put("minis_cnt", String.valueOf(searchMinis2.minisItems.size()));
                map.put("token_type", "minis");
                map.put("list_result_type", "minis");
            }
            InterfaceC594520NTm interfaceC594520NTmCB22 = searchServiceCenter$CardCommonAbility.cB2();
            if ((interfaceC594520NTmCB22 instanceof SearchMixFeed) && (searchMixFeed3 = (SearchMixFeed) interfaceC594520NTmCB22) != null && (searchMinis = searchMixFeed3.miniGame) != null && (!searchMinis.minisItems.isEmpty())) {
                map.put("minis_lst", C13LP.LJJLIIIJ(searchMinis.minisItems, ",", null, null, 0, null, AFwS241S0000000_10.get$arr$(486), 30));
                map.put("minis_cnt", String.valueOf(searchMinis.minisItems.size()));
                map.put("token_type", "mini_games");
                map.put("list_result_type", "mini_games");
                int i = 0;
                for (SearchMinisItem searchMinisItem : searchMinis.minisItems) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (Intrinsics.LJFF(searchMinisItem.getClientKey(), str)) {
                            map.put("item_rank", String.valueOf(i));
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            InterfaceC594520NTm interfaceC594520NTmCB23 = searchServiceCenter$CardCommonAbility.cB2();
            if ((interfaceC594520NTmCB23 instanceof SearchMixFeed) && (searchMixFeed2 = (SearchMixFeed) interfaceC594520NTmCB23) != null) {
                lValueOf = Long.valueOf(searchMixFeed2.getDocId());
            }
            String strValueOf = String.valueOf(lValueOf);
            map.put("search_result_id", strValueOf);
            if (firstScreenHelperAbility != null) {
                String strKz0 = firstScreenHelperAbility.Kz0(strValueOf, str);
                if (strKz0 == null) {
                    strKz0 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_first_screen", strKz0);
            }
        }
        if (str != null) {
            map.put("list_item_id", str);
        }
        String strLLJJIJIL = C1ER1.LIZIZ.LLJJIJIL();
        if (strLLJJIJIL != null) {
            map.put("end_to_end_search_session_id", strLLJJIJIL);
        }
        return map;
    }

    public static void LJI(String str, String str2, String str3, HashMap map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (String str4 : map.keySet()) {
            c2344009Gk.LJFF(str4, (String) map.get(str4));
        }
        c2344009Gk.LJFF("button_type", str);
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click_");
            sbLIZ.append(str2);
            c2344009Gk.LJFF("click_actions", C2188811AlT.LIZIZ(sbLIZ));
            c2344009Gk.LJFF("client_key", str2);
            c2344009Gk.LJFF("list_item_id", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("item_rank", str3);
        }
        C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
    }

    public static void LJII(SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility, C646370PWx c646370PWx, FirstScreenHelperAbility firstScreenHelperAbility, String str) {
        HashMap mapLIZ = LIZ(searchServiceCenter$CardCommonAbility, c646370PWx, firstScreenHelperAbility, str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (String str2 : mapLIZ.keySet()) {
            c2344009Gk.LJFF(str2, (String) mapLIZ.get(str2));
        }
        C20684815ws.LJIILLIIL("search_result_show", c2344009Gk.LIZ);
    }
}
