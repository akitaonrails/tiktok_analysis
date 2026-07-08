package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.RoomProductsVerticalVM;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.RoomProductsVerticalVM$fetchData$3", f = "RoomProductsVerticalVM.kt", l = {}, m = "invokeSuspend")
public final class C675490QeZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ RoomProductsVerticalVM LLILLL;
    public final /* synthetic */ SearchResultParam LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675490QeZ(JSONObject jSONObject, RoomProductsVerticalVM roomProductsVerticalVM, SearchResultParam searchResultParam, InterfaceC1364105Vn<? super C675490QeZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
        this.LLILLL = roomProductsVerticalVM;
        this.LLILZ = searchResultParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C675490QeZ c675490QeZ = new C675490QeZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c675490QeZ.LL = obj;
        return c675490QeZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String keyword;
        ECSearchEntranceData ecSearchEntranceData;
        Long endToEndSession;
        String authorId;
        String roomId;
        n nVarLJI;
        ISearchVerticalContext iSearchVerticalContext;
        C1C7U.LIZ("RoomProductsVerticalVM@9a04.fetchData$3");
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
            String strWQ2 = this.LLILLL.wQ2(this.LLILLJJLI);
            C0QER searchEnterParam = this.LLILZ.getSearchEnterParam();
            keyword = null;
            if (searchEnterParam != null) {
                ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData = null;
            }
            String strLIZ = C0QZR.LIZ(ecSearchEntranceData);
            C0QES c0qes = C0QES.LIZ;
            C0QER searchEnterParam2 = this.LLILZ.getSearchEnterParam();
            if (searchEnterParam2 != null) {
                endToEndSession = searchEnterParam2.getEndToEndSession();
            } else {
                endToEndSession = null;
            }
            C674800QdS c674800QdS = new C674800QdS(strOptString, strOptString3, "live_bag", 0, iOptInt, "", strOptString4, 0L, 10, strOptString2, "tiktok_ecom_livebag", null, null, null, null, null, null, strWQ2, null, null, 0, null, strLIZ, null, null, C0QES.LIZ(c0qes, endToEndSession, false, 6), null, null, null, null, null, null, null, null, null);
            SearchResultParam searchResultParam = this.LLILZ;
            C1766860w4y.LIZ.getClass();
            c674800QdS.setSearchSessionId(C1766860w4y.LIZIZ("search_session_id"));
            C0QER searchEnterParam3 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam3 != null) {
                authorId = searchEnterParam3.getAuthorId();
            } else {
                authorId = null;
            }
            c674800QdS.setAuthorId(authorId);
            C0QER searchEnterParam4 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam4 != null) {
                roomId = searchEnterParam4.getRoomId();
            } else {
                roomId = null;
            }
            c674800QdS.setRoomId(roomId);
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
            nVarLJI = EcSearchApi.LJI(c674800QdS);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.setState(new AwS589S0100000_10(e, 77));
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
            C1C7U.LIZIZ("RoomProductsVerticalVM@9a04.fetchData$3");
            return unit;
        }
        RoomProductsVerticalVM roomProductsVerticalVM = this.LLILLL;
        roomProductsVerticalVM.setState(new AwS376S0200000_10(nVarLJI, roomProductsVerticalVM, 22));
        Gson gson = this.LLILLL.LL;
        SearchApiResult searchApiResult = (SearchApiResult) gson.LJII(gson.LJIILJJIL(nVarLJI), SearchApiResult.class);
        String imprId = searchApiResult.logPb.getImprId();
        if (imprId != null) {
            C584850Mwl.LIZ.LJI(imprId, searchApiResult.logPb);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL.LLILZ;
        if (interfaceC665370Q7z != null && (iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(interfaceC665370Q7z, ISearchVerticalContext.class, null)) != null) {
            SearchResultParam searchResultParam2 = this.LLILZ;
            if (searchResultParam2 != null) {
                keyword = searchResultParam2.getKeyword();
            }
            EnumC669620QOi enumC669620QOi = EnumC669620QOi.ROOM_PRODUCTS;
            SearchResultParam searchResultParam3 = this.LLILZ;
            String strOptString5 = this.LLILLJJLI.optString("group_id");
            if (strOptString5 == null) {
                strOptString5 = "";
            }
            iSearchVerticalContext.GG0(keyword, searchApiResult, enumC669620QOi, searchResultParam3, strOptString5, "live_bag");
        }
        C675500Qea c675500Qea6 = this.LLILLL.LLILLL;
        if (c675500Qea6 != null) {
            c675500Qea6.LIZIZ(this.LLILZ.getSearchEnterParam(), false, 1, 0, "/aweme/v1/search/ecom/order/", 0L);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RoomProductsVerticalVM@9a04.fetchData$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
