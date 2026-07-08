package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecom.data.ShopTabInfo;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260891DeR {
    public ShopTabInfo LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI = true;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LIZIZ() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2260891DeR.LIZIZ():java.lang.CharSequence");
    }

    public final void LIZ(C1845940y8W c1845940y8W) {
        C1845930y8V c1845930y8V;
        String str;
        ShopTabInfo shopTabInfo = this.LIZ;
        if (shopTabInfo != null) {
            int i = shopTabInfo.shopTabType;
            if (!this.LIZIZ && c1845940y8W != null && (c1845930y8V = c1845940y8W.LJFF) != null && C1256150inF.LIZIZ(c1845930y8V)) {
                LIZJ("tiktokec_search_tab_guide_show", AFwS283S0000000_35.get$arr$(150));
                if (i == EnumC1782600wUM.RED_DOT.getType()) {
                    str = "reddot";
                } else {
                    if (i == EnumC1782600wUM.TEXT_RED_DOT.getType()) {
                        str = "textreddot";
                    }
                    this.LIZIZ = true;
                }
                ((IEcomGeneralSearchService) ServiceManager.get().getService(IEcomGeneralSearchService.class)).LJIJ(12, str);
                this.LIZIZ = true;
            }
        }
    }

    public final void LIZLLL(SearchResultParam searchResultParam) {
        ShopTabInfo shopTabInfo;
        if (searchResultParam != null && (shopTabInfo = this.LIZ) != null) {
            int i = shopTabInfo.shopTabType;
            if (i == EnumC1782600wUM.RED_DOT.getType()) {
                searchResultParam.setSearchGuideType("red_dot");
            } else if (i == EnumC1782600wUM.TEXT_RED_DOT.getType()) {
                searchResultParam.setSearchGuideType("red_dot_text");
                searchResultParam.setSearchGuideTextType("shoptab");
            } else if (i == EnumC1782600wUM.ALIENATION.getType()) {
                searchResultParam.setSearchGuideType("alienation_tab");
                searchResultParam.setSearchGuideTextType("shoptab");
            }
            searchResultParam.setIsSearchGuideClick("1");
        }
    }

    public final void LIZJ(String str, Function1<? super JSONObject, Unit> function1) throws JSONException {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("search_entrance", "homepage_hot");
        jSONObject.put("search_guide_position", "outmall_search_shoptab");
        jSONObject.put("is_search_guide_pic_show", 0);
        C644560PPy.LIZ.getClass();
        jSONObject.put("tab_index", C644560PPy.LJIIZILJ());
        String str2 = this.LJ;
        if (str2 != null) {
            jSONObject.put("search_id", str2);
        }
        String str3 = this.LJFF;
        if (str3 != null) {
            jSONObject.put("enter_method", str3);
        }
        ShopTabInfo shopTabInfo = this.LIZ;
        if (shopTabInfo != null) {
            int i = shopTabInfo.shopTabType;
            if (i == EnumC1782600wUM.RED_DOT.getType()) {
                jSONObject.put("search_guide_type", "red_dot");
                jSONObject.put("is_search_guide_text_show", 0);
                jSONObject.put("is_search_guide_clickable", 1);
            } else if (i == EnumC1782600wUM.TEXT_RED_DOT.getType()) {
                jSONObject.put("search_guide_type", "red_dot_text");
                jSONObject.put("search_guide_text_type", "shoptab");
                jSONObject.put("is_search_guide_text_show", 1);
                jSONObject.put("search_guide_text", shopTabInfo.text);
                jSONObject.put("is_search_guide_clickable", 1);
            } else if (i == EnumC1782600wUM.ALIENATION.getType()) {
                jSONObject.put("search_guide_type", "alienation_tab");
                jSONObject.put("search_guide_text_type", "shoptab");
                jSONObject.put("is_search_guide_text_show", 1);
                jSONObject.put("search_guide_text", shopTabInfo.text);
                jSONObject.put("is_search_guide_clickable", 1);
            }
        }
        function1.invoke(jSONObject);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }
}
