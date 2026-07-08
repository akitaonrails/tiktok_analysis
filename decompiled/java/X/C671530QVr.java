package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671530QVr extends C0QW9 {
    @Override // X.C0QW9, X.InterfaceC671440QVi
    public final void LLIILII(SearchResultParam searchResultParam) throws JSONException {
        int iOrdinal;
        String enterSearchFrom;
        C0QUT c0qutZs2;
        super.LLIILII(searchResultParam);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "mall_skeleton_search");
        IPageSearchSubPageAbility iPageSearchSubPageAbility = this.LLJILJIL;
        if (iPageSearchSubPageAbility != null && (c0qutZs2 = iPageSearchSubPageAbility.Zs2()) != null) {
            iOrdinal = c0qutZs2.ordinal();
        } else {
            iOrdinal = -1;
        }
        jSONObject.put("is_native_request", iOrdinal);
        jSONObject.put("enter_method", searchResultParam.getEnterMethod());
        C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            enterSearchFrom = searchEnterParam.getEnterSearchFrom();
        } else {
            enterSearchFrom = null;
        }
        jSONObject.put("enter_from", enterSearchFrom);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
    }

    public C671530QVr(C0QWG c0qwg, Function0<? extends ISearchBarAbility> function0, Function0<? extends IPageSearchSubPageAbility> function02, Function0<? extends IPageSearchSubPageAbility> function03, Function0<? extends IPageSearchSubPageAbility> function04) {
        super(c0qwg, function0, function02, function03, function04, C1697810uHb.LJIILJJIL(C0QUT.SUGGEST, C0QUT.SUG, C0QUT.RESULT));
    }
}
