package X;

import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PRU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRU {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str, String str2, String str3, EnumC645610PTz enumC645610PTz, ISearchContextAbility iSearchContextAbility) {
        String str4;
        String str5;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        String str6;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("impr_id", str);
        String str7 = "";
        if (iSearchContextAbility == null || (c0pcyPh12 = iSearchContextAbility.Ph1()) == null || (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) == null || (str4 = c0prc2.LLILLL) == null) {
            str4 = "";
        }
        pairArr[1] = new Pair("search_id", str4);
        pairArr[2] = new Pair("words_source", "ecom_click_search");
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str5 = c0prc.LLIZLLLIL) == null) {
            str5 = "";
        }
        pairArr[3] = new Pair("raw_query", str5);
        pairArr[4] = new Pair("search_position", "general");
        if (iSearchContextAbility != null && (c0pcyWw1 = iSearchContextAbility.Ww1()) != null && (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) != null && (str6 = c663990Q2r.LL) != null) {
            str7 = str6;
        }
        pairArr[5] = new Pair("search_entrance", str7);
        pairArr[6] = new Pair("enter_group_id", str2);
        pairArr[7] = new Pair("enter_product_id", str3);
        C0PUO.LIZ.getClass();
        pairArr[8] = new Pair("enter_group_type", C0PUO.LIZIZ(enumC645610PTz));
        pairArr[9] = new Pair("card_type", C0PUO.LIZ(enumC645610PTz));
        return C2097608Jq.LJIIJ(pairArr);
    }
}
