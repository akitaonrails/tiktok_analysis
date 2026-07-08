package X;

import com.bytedance.scene.Scene;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671500QVo implements InterfaceC736910SvR<InterfaceC673060Qae> {
    public final C671370QVb LL = new InterfaceC673060Qae() { // from class: X.0QVb
        @Override // X.InterfaceC673060Qae
        public final ListenableFuture<MiddleCouponModel> u() throws JSONException {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "request_banner");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_middle", jSONObject);
            EcSuggestWordsApi.LIZ.getClass();
            HashMap map = new HashMap();
            map.put("enable_banner", "1");
            map.put("page_name", "middle_page");
            return ((EcSuggestWordsApi.SuggestApi) EcSuggestWordsApi.LIZJ.getValue()).fetchCouponRequestData(map);
        }

        @Override // X.InterfaceC673060Qae
        public final List<SearchHistory> LJIJJLI(C0QER c0qer) {
            int intStrategy;
            ECSearchEntranceData ecSearchEntranceData;
            List<SearchHistory> listLL;
            ECSearchEntranceData ecSearchEntranceData2;
            if (c0qer != null && (ecSearchEntranceData2 = c0qer.getEcSearchEntranceData()) != null) {
                intStrategy = ecSearchEntranceData2.getIntStrategy("history_max_count");
            } else {
                intStrategy = 20;
            }
            ISearchService iSearchService = (ISearchService) ServiceManager.get().getService(ISearchService.class);
            if (c0qer != null) {
                ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData = null;
            }
            List<SearchHistory> listLJIIL = iSearchService.C(ecSearchEntranceData).LJIIL(0);
            if (listLJIIL != null && (listLL = C13LP.LL(listLJIIL, intStrategy)) != null) {
                return listLL;
            }
            return C13BV.INSTANCE;
        }

        @Override // X.InterfaceC673060Qae
        public final String h0(C0QWJ c0qwj, boolean z) {
            ECSearchEntranceData ecSearchEntranceData;
            C0QER c0qer;
            if (c0qwj != null && (c0qer = c0qwj.LIZ) != null) {
                ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData = null;
            }
            return C672200QYg.LIZLLL(ecSearchEntranceData, z);
        }

        @Override // X.InterfaceC673060Qae
        public final Object t0(C671380QVc c671380QVc, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
            EcSuggestWordsApi.LIZ.getClass();
            return EcSuggestWordsApi.LIZ(c671380QVc, interfaceC1364105Vn);
        }

        @Override // X.InterfaceC673060Qae
        public final void LLJJ(C0QER c0qer, String str, boolean z) {
            ECSearchEntranceData ecSearchEntranceData;
            if (c0qer != null) {
                ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData = null;
            }
            C672200QYg.LJFF(str, ecSearchEntranceData, z);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
