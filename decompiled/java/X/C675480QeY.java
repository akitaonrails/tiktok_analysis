package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.OrderVerticalVM;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.OrderVerticalVM$fetchData$3", f = "OrderVerticalVM.kt", l = {}, m = "invokeSuspend")
public final class C675480QeY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ OrderVerticalVM LLILLL;
    public final /* synthetic */ SearchResultParam LLILZ;
    public final /* synthetic */ C259800zU<Integer> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675480QeY(JSONObject jSONObject, OrderVerticalVM orderVerticalVM, SearchResultParam searchResultParam, C259800zU<Integer> c259800zU, String str, View view, InterfaceC1364105Vn<? super C675480QeY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
        this.LLILLL = orderVerticalVM;
        this.LLILZ = searchResultParam;
        this.LLILZIL = c259800zU;
        this.LLILZLL = str;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C675480QeY c675480QeY = new C675480QeY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c675480QeY.LL = obj;
        return c675480QeY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long endToEndSession;
        String keyword;
        n nVarLJFF;
        ISearchVerticalContext iSearchVerticalContext;
        String imprId;
        C0QER searchEnterParam;
        C1C7U.LIZ("OrderVerticalVM@d98a.fetchData$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        try {
            String strOptString = this.LLILLJJLI.optString("keyword");
            int iOptInt = this.LLILLJJLI.optInt("query_correct_type");
            String strOptString2 = this.LLILLJJLI.optString("enter_from");
            strOptString2.toString();
            String strOptString3 = this.LLILLJJLI.optString("search_source");
            String strOptString4 = this.LLILLJJLI.optString("last_search_id");
            String strOptString5 = this.LLILLJJLI.optString("tag_text");
            String strOptString6 = this.LLILLJJLI.optString("sug_type");
            String strOptString7 = this.LLILLJJLI.optString("sug_query_state");
            String strOptString8 = this.LLILLJJLI.optString("attach_products");
            String strWQ2 = this.LLILLL.wQ2(this.LLILLJJLI);
            String strOptString9 = this.LLILLJJLI.optString("sug_creator_id");
            C0QES c0qes = C0QES.LIZ;
            SearchResultParam searchResultParam = this.LLILZ;
            ECSearchEntranceData ecSearchEntranceData = null;
            if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
                endToEndSession = searchEnterParam.getEndToEndSession();
            } else {
                endToEndSession = null;
            }
            Long lLIZ = C0QES.LIZ(c0qes, endToEndSession, false, 6);
            Integer num = this.LLILZIL.element;
            C0QER searchEnterParam2 = this.LLILZ.getSearchEnterParam();
            if (searchEnterParam2 != null) {
                ecSearchEntranceData = searchEnterParam2.getEcSearchEntranceData();
            }
            keyword = null;
            C674800QdS c674800QdS = new C674800QdS(strOptString, strOptString3, "order", 0, iOptInt, "", strOptString4, 0L, 9, strOptString2, "tiktok_order", strOptString5, strOptString6, strOptString7, strOptString9, strOptString8, null, strWQ2, null, null, 0, num, C0QZR.LIZ(ecSearchEntranceData), null, null, lLIZ, null, null, null, null, null, null, null, null, null);
            c674800QdS.setBcmChain(this.LLILZLL);
            C1766860w4y.LIZ.getClass();
            c674800QdS.setEcSearchSessionId(C1766860w4y.LIZIZ("ec_search_session_id"));
            c674800QdS.setSearchSessionId(C1766860w4y.LIZIZ("search_session_id"));
            C675500Qea c675500Qea = this.LLILLL.LLILLL;
            if (c675500Qea != null) {
                c675500Qea.LIZIZ(this.LLILZ.getSearchEnterParam(), true, 0, 0, "/aweme/v1/search/ecom/order/", 0L);
            }
            C675500Qea c675500Qea2 = this.LLILLL.LLILLL;
            if (c675500Qea2 != null) {
                c675500Qea2.LJ = System.currentTimeMillis();
            }
            C675500Qea c675500Qea3 = this.LLILLL.LLILLL;
            if (c675500Qea3 != null) {
                c675500Qea3.LIZLLL = false;
            }
            EcSearchApi ecSearchApi = EcSearchApi.LIZ;
            nVarLJFF = EcSearchApi.LJFF(c674800QdS);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.setState(new AwS589S0100000_10(e, 76));
            C675500Qea c675500Qea4 = this.LLILLL.LLILLL;
            if (c675500Qea4 != null) {
                c675500Qea4.LIZIZ(this.LLILZ.getSearchEnterParam(), false, 0, 0, "/aweme/v1/search/ecom/order/", 0L);
            }
            C675500Qea c675500Qea5 = this.LLILLL.LLILLL;
            if (c675500Qea5 != null) {
                c675500Qea5.LJ("request_start_error");
            }
        }
        if (!C23118094a.LJIIIIZZ(interfaceC497601wk.getCoroutineContext())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OrderVerticalVM@d98a.fetchData$3");
            return unit;
        }
        OrderVerticalVM orderVerticalVM = this.LLILLL;
        orderVerticalVM.setState(new AwS376S0200000_10(nVarLJFF, orderVerticalVM, 21));
        Gson gson = this.LLILLL.LL;
        SearchApiResult searchApiResult = (SearchApiResult) gson.LJII(gson.LJIILJJIL(nVarLJFF), SearchApiResult.class);
        String imprId2 = searchApiResult.logPb.getImprId();
        String str = "";
        if (imprId2 != null) {
            View view = this.LLIZ;
            C584850Mwl.LIZ.LJI(imprId2, searchApiResult.logPb);
            ISearchService iSearchService = (ISearchService) ServiceManager.get().getService(ISearchService.class);
            LogPbBean logPbBean = searchApiResult.logPb;
            if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
                imprId = "";
            }
            iSearchService.LJZL(imprId);
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderVia = PageFinder.via(view);
            BcmParams bcmParams = new BcmParams();
            bcmParams.put("search_id", imprId2);
            btmSDK.setBcmPageParams(pageFinderVia, bcmParams, false);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL.LLILZ;
        if (interfaceC665370Q7z != null && (iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(interfaceC665370Q7z, ISearchVerticalContext.class, null)) != null) {
            SearchResultParam searchResultParam2 = this.LLILZ;
            if (searchResultParam2 != null) {
                keyword = searchResultParam2.getKeyword();
            }
            EnumC669620QOi enumC669620QOi = EnumC669620QOi.ORDER;
            SearchResultParam searchResultParam3 = this.LLILZ;
            String strOptString10 = this.LLILLJJLI.optString("group_id");
            if (strOptString10 != null) {
                str = strOptString10;
            }
            iSearchVerticalContext.GG0(keyword, searchApiResult, enumC669620QOi, searchResultParam3, str, "order");
        }
        C675500Qea c675500Qea6 = this.LLILLL.LLILLL;
        if (c675500Qea6 != null) {
            c675500Qea6.LIZIZ(this.LLILZ.getSearchEnterParam(), false, 1, 0, "/aweme/v1/search/ecom/order/", 0L);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrderVerticalVM@d98a.fetchData$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
