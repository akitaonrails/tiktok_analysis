package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q22, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q22 implements C0Q28 {
    public final int LIZ;
    public final View LIZIZ;
    public Product LIZJ;
    public C0Q24 LIZLLL;
    public final C0R4N LJ = new C0R4N(0);

    @Override // X.C0Q28
    public final void LIZ() {
        LIZJ("search_result_show", new AwS589S0100000_10(this, 3));
        LIZIZ("tiktokec_product_show", AFwS241S0000000_10.get$arr$(3));
    }

    public final void LIZIZ(String str, Function1<? super JSONObject, Unit> function1) {
        String searchId;
        Long l;
        String searchResultId;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source_page_type", "general_search");
        jSONObject.put("enter_from", "general_search");
        C0Q24 c0q24 = this.LIZLLL;
        String str2 = "";
        if (c0q24 == null || (searchId = c0q24.getSearchId()) == null) {
            searchId = "";
        }
        jSONObject.put("search_id", searchId);
        C0Q24 c0q242 = this.LIZLLL;
        if (c0q242 != null && (searchResultId = c0q242.getSearchResultId()) != null) {
            str2 = searchResultId;
        }
        jSONObject.put("search_result_id", str2);
        Product product = this.LIZJ;
        if (product != null) {
            l = product.productId;
        } else {
            l = null;
        }
        jSONObject.put("list_item_id", l);
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a2270.b6880.c7013.d29458_i");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        PageFinder pageFinderVia = PageFinder.via(this.LIZIZ);
        c1507790pL7.getClass();
        C1507790pL7.LJ(str, jSONObject, strLIZIZ, pageFinderVia);
    }

    public final void LIZJ(String str, Function1<? super JSONObject, Unit> function1) {
        String searchId;
        Long l;
        String strLIZLLL;
        String searchResultId;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "general_search");
        C0Q24 c0q24 = this.LIZLLL;
        String str2 = "";
        if (c0q24 == null || (searchId = c0q24.getSearchId()) == null) {
            searchId = "";
        }
        jSONObject.put("search_id", searchId);
        C0Q24 c0q242 = this.LIZLLL;
        if (c0q242 != null && (searchResultId = c0q242.getSearchResultId()) != null) {
            str2 = searchResultId;
        }
        jSONObject.put("search_result_id", str2);
        jSONObject.put("token_type", "hot_user");
        Product product = this.LIZJ;
        String rank = null;
        if (product != null) {
            l = product.productId;
        } else {
            l = null;
        }
        jSONObject.put("list_item_id", l);
        jSONObject.put("list_result_type", "user_goods");
        C0Q24 c0q243 = this.LIZLLL;
        if (c0q243 != null) {
            strLIZLLL = c0q243.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        jSONObject.put("search_keyword", strLIZLLL);
        C0Q24 c0q244 = this.LIZLLL;
        if (c0q244 != null) {
            rank = c0q244.getRank();
        }
        jSONObject.put("rank", rank);
        jSONObject.put("aladdin_rank", this.LIZ);
        function1.invoke(jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a2270.b6880.c7013.d29458_i");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        PageFinder pageFinderVia = PageFinder.via(this.LIZIZ);
        c1507790pL7.getClass();
        C1507790pL7.LJ(str, jSONObject, strLIZIZ, pageFinderVia);
    }

    public C0Q22(int i, int i2, ViewGroup viewGroup) {
        this.LIZ = i2;
        this.LIZIZ = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bsc, viewGroup, false);
    }
}
