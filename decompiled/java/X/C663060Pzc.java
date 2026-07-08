package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EComSearchStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ShopStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663060Pzc {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(ISearchContextAbility iSearchContextAbility, C643110PKj c643110PKj) {
        String str;
        String str2;
        EComSearchStruct eComSearchStruct;
        ShopStruct shopStruct;
        String str3;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str4 = "";
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str = c0prc.LLILLL) == null) {
            str = "";
        }
        linkedHashMap.put("search_id", str);
        linkedHashMap.put("enter_from", "general_search");
        if (c643110PKj == null || (str2 = c643110PKj.LLILLL) == null) {
            str2 = "";
        }
        linkedHashMap.put("search_result_id", str2);
        if (c643110PKj != null && (eComSearchStruct = c643110PKj.LL) != null && (shopStruct = eComSearchStruct.productInfo) != null && (str3 = shopStruct.productIdStr) != null) {
            str4 = str3;
        }
        linkedHashMap.put("product_id", str4);
        return linkedHashMap;
    }

    public static void LIZIZ(Map map, ISearchContextAbility iSearchContextAbility) {
        String str;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        map.put("page_name", "general_search");
        map.put("entrance_form", "search_pure_goods_card");
        map.put("source_page_type", "general_search");
        if (iSearchContextAbility == null || (c0pcyWw1 = iSearchContextAbility.Ww1()) == null || (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) == null || (str = c663990Q2r.LL) == null) {
            str = "";
        }
        map.put("search_entrance", str);
    }

    public static void LIZJ(Map map, ISearchContextAbility iSearchContextAbility, C643110PKj c643110PKj) {
        String str;
        String string;
        String str2;
        EComSearchStruct eComSearchStruct;
        Integer num;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str = c0prc.LLIZLLLIL) == null) {
            str = "";
        }
        map.put("search_keyword", str);
        map.put("token_type", "ecom_arget_goods");
        if (c643110PKj == null || (num = c643110PKj.LLILZ) == null || (string = num.toString()) == null) {
            string = "-1";
        }
        map.put("rank", string);
        if (c643110PKj != null && (eComSearchStruct = c643110PKj.LL) != null && Intrinsics.LJFF(eComSearchStruct.isPrecisionSearch, Boolean.FALSE)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        map.put("if_accurate_search", str2);
    }
}
