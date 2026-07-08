package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0PRD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRD {
    public static void LIZIZ(C0PC0 c0pc0) {
        String str;
        boolean zLJI = MethodIDManager.LJI(138021);
        if (c0pc0.LLIZ > 0 && (str = c0pc0.LL) != null && str.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c0pc0.LLIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(c0pc0.LLIZLLLIL);
            c2344009Gk.LJIIIIZZ("search_id", c0pc0.LL);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            String str2 = c0pc0.LLILLJJLI;
            if (C123100dR.LIZ(str2) && str2 != null) {
                c2344009Gk.LJFF("entity_id", str2);
            }
            String str3 = c0pc0.LLILZ;
            if (C123100dR.LIZ(str3) && c0pc0.LLILLL != null && str3 != null) {
                c2344009Gk.LJ(c0pc0.LLILLL, "top_bar_type");
                c2344009Gk.LJFF("top_bar_id", str3);
                c2344009Gk.LJFF("top_bar_keyword", c0pc0.LLILZIL);
            }
            C20684815ws.LJIILLIIL("search_result_stay_time", c2344009Gk.LIZ);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static C0PC0 LIZ(C0PC0 c0pc0, String str) {
        ISearchContextAbility iSearchContextAbilityLJI;
        String strLJJIFFI;
        String strLJ;
        if (C07DT.LIZ()) {
            C646640PXy.LIZ.getClass();
            iSearchContextAbilityLJI = C646640PXy.LIZ().P0();
        } else {
            iSearchContextAbilityLJI = C0Q3E.LJI();
        }
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        if (c0prc.LLLF.length() > 0) {
            strLJJIFFI = c0prc.LLLF;
        } else {
            strLJJIFFI = u.LJJIFFI(c0prc.LLILLJJLI, "challenge", "tag", false);
        }
        if (Intrinsics.LJFF(c0prc.LLLFZ, "smart_search_title")) {
            return c0pc0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = c0prc.LLJLILLLLZIIL;
        Integer num = c0prc.LLILZ;
        String str3 = c0prc.LLILZIL;
        String str4 = c0prc.LLILZLL;
        Boolean bool = c0prc.LLIZ;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("search_keyword", c0prc.LLIZLLLIL);
        pairArr[1] = new Pair("search_type", strLJJIFFI);
        pairArr[2] = new Pair("enter_from", ((C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ()).LL);
        pairArr[3] = new Pair("enter_group_id", ((C0Q39) iSearchContextAbilityLJI.P70().LIZJ()).LLILLJJLI);
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService == null || (strLJ = iSearchService.LJ()) == null) {
            strLJ = "";
        }
        pairArr[4] = new Pair("group_id", strLJ);
        pairArr[5] = new Pair("enter_method", c0prc.LLJLL);
        pairArr[6] = new Pair("enter_from_channel", c0prc.LLLFZ);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String str5 = c0prc.LLLIIIIL;
        if (str5 != null) {
            mapLJIIJ.put("enter_group_id", str5);
        }
        String str6 = c0prc.LLLIIIL;
        if (str6 != null) {
            mapLJIIJ.put("req_search_enter_method", str6);
        }
        String str7 = c0prc.LLLIIL;
        if (str7 != null) {
            mapLJIIJ.put("req_search_enter_from", str7);
        }
        String str8 = c0prc.LLLLILI;
        if (str8.length() > 0) {
            mapLJIIJ.put("filter_show_type", str8);
        }
        return new C0PC0(str, str2, num, str3, str4, bool, jCurrentTimeMillis, mapLJIIJ);
    }
}
