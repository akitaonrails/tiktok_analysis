package Y;

import X.C01GW;
import X.C080U;
import X.C0PP3;
import X.C0QCT;
import X.C0QER;
import X.C0QF6;
import X.C0QJX;
import X.C0QKW;
import X.C0QKX;
import X.C0QLU;
import X.C0QNP;
import X.C0QON;
import X.C0QPJ;
import X.C0QPT;
import X.C1493620oyG;
import X.C1507060pJw;
import X.C1515820pY4;
import X.C15O7;
import X.C1C7U;
import X.C2188811AlT;
import X.C2232408os;
import X.C259800zU;
import X.C271810Al1;
import X.C271820Al2;
import X.C271890Al9;
import X.C272400Aly;
import X.C301410Brf;
import X.C326640CrG;
import X.C341050DYp;
import X.C640270P9l;
import X.C650500PfM;
import X.C668170QIt;
import X.C668180QIu;
import X.C668200QIw;
import X.C668510QKb;
import X.C668520QKc;
import X.C668530QKd;
import X.C668540QKe;
import X.C668590QKj;
import X.C668600QKk;
import X.C823050WQl;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.discover.model.suggest.SugConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.appdiff.ISearchSugAppDiff;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SugPreInfoResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.repo.SearchSugApi;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class ACallableS178S0300000_10 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$0(ACallableS178S0300000_10 aCallableS178S0300000_10) {
        String keyword;
        C0QPT historyIsolateStrategy;
        C1C7U.LIZ("ECSearchHistory@cd77.checkAndRecordSearchHistory$1");
        if (!TextUtils.isEmpty(((SearchResultParam) aCallableS178S0300000_10.l0).getKeyword())) {
            keyword = ((SearchResultParam) aCallableS178S0300000_10.l0).getKeyword();
        } else {
            keyword = (String) ((C259800zU) aCallableS178S0300000_10.l1).element;
        }
        boolean z = true;
        if (((SearchResultParam) aCallableS178S0300000_10.l0).getShouldRecordInHistory() != 1) {
            z = false;
        }
        if (!TextUtils.isEmpty(keyword) && z) {
            C0QNP c0qnp = C0QNP.LIZ;
            ECSearchEntranceData eCSearchEntranceData = (ECSearchEntranceData) aCallableS178S0300000_10.l2;
            c0qnp.getClass();
            ((ISearchService) ServiceManager.get().getService(ISearchService.class)).C(eCSearchEntranceData).LIZ(new SearchHistory(keyword, 0), "ec_sep_rec");
            ECSearchEntranceData eCSearchEntranceData2 = (ECSearchEntranceData) aCallableS178S0300000_10.l2;
            if (eCSearchEntranceData2 == null || (historyIsolateStrategy = eCSearchEntranceData2.getHistoryIsolateStrategy()) == null) {
                historyIsolateStrategy = C0QPT.NO_ISOLATE;
            }
            if (historyIsolateStrategy == C0QPT.EC_SINGLE_ISOLATE) {
                ((ISearchService) ServiceManager.get().getService(ISearchService.class)).C(null).LIZ(new SearchHistory(keyword, 0), "ec_sep_rec_cas");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECSearchHistory@cd77.checkAndRecordSearchHistory$1");
        return unit;
    }

    public static final Object call$1(ACallableS178S0300000_10 aCallableS178S0300000_10) throws JSONException {
        boolean z;
        C15O7<C1515820pY4<SearchSugResponse>> c15o7FetchSugByChunk;
        SearchSugResponse searchSugResponseLIZ;
        C15O7<C1515820pY4<SearchSugResponse>> c15o7FetchSugByChunk2;
        String str;
        C1C7U.LIZ("SearchSugPresenter@ac4.<init>$1$sendRequest$1");
        SugPreInfoResponse sugPreInfoResponse = ((C0QKW) aCallableS178S0300000_10.l2).LL.LLJJJIL;
        String str2 = null;
        if (sugPreInfoResponse != null && System.currentTimeMillis() > sugPreInfoResponse.LIZ) {
            ((C0QKW) aCallableS178S0300000_10.l2).LL.LLJJJIL = null;
        }
        C0QJX c0qjx = ((C0QKW) aCallableS178S0300000_10.l2).LL;
        C668540QKe c668540QKe = (C668540QKe) aCallableS178S0300000_10.l0;
        SugPreInfoResponse sugPreInfoResponse2 = c0qjx.LLJJJIL;
        if (sugPreInfoResponse2 != null) {
            str2 = sugPreInfoResponse2.preInfoId;
        }
        final C668540QKe c668540QKeLJIILL = c0qjx.LJIILL(c668540QKe, str2, false);
        if (!((C0QKX) aCallableS178S0300000_10.l1).LIZJ) {
            C668170QIt c668170QItLIZ = C668200QIw.LIZ(c668540QKeLJIILL.keywords);
            c668170QItLIZ.getClass();
            C668170QIt c668170QIt = C668180QIu.LIZ;
            if (!Intrinsics.LJFF(c668170QItLIZ, c668170QIt)) {
                c668170QItLIZ.LIZJ = System.currentTimeMillis();
            }
            C0QLU.LIZ();
            final C0QJX c0qjx2 = ((C0QKW) aCallableS178S0300000_10.l2).LL;
            C0QKX c0qkx = (C0QKX) aCallableS178S0300000_10.l1;
            c0qjx2.getClass();
            boolean zLJI = MethodIDManager.LJI(202517);
            ISearchSugAppDiff.LIZ.getClass();
            C668600QKk.LIZIZ.getValue().LIZIZ();
            if (((Number) C271810Al1.LIZ.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "wait timeout";
            if (z) {
                Long l = c668540QKeLJIILL.requestOrder;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C080U("check_preload", "true"));
                C1493620oyG c1493620oyG = new C1493620oyG();
                c1493620oyG.LJIILIIL = 24576;
                final C668510QKb c668510QKb = new C668510QKb(SearchSugApi.LIZ().syncFetchSugByChunk(c668540QKeLJIILL.keywords, c668540QKeLJIILL.source, c668540QKeLJIILL.historyJson, c668540QKeLJIILL.historyTimestampJson, c668540QKeLJIILL.gid, c668540QKeLJIILL.totalCount, c668540QKeLJIILL.sessionParams, c668540QKeLJIILL.requestParams, c668540QKeLJIILL.prefParams, c668540QKeLJIILL.richSugCount, l, c668540QKeLJIILL.enterFrom, c668540QKeLJIILL.sugCostDegradation, c668540QKeLJIILL.newSugSessionId, c668540QKeLJIILL.isBeginningOfSession(), c668540QKeLJIILL.srcMaterialId, c668540QKeLJIILL.srcAnchorProductId, c668540QKeLJIILL.searchPosition, c668540QKeLJIILL.isNonPersonalizedSearch(), c668540QKeLJIILL.preInfoId, null, C326640CrG.LIZ(), c1493620oyG, arrayList));
                c0qkx.LIZIZ = c668510QKb;
                final String str4 = c668540QKeLJIILL.keywords;
                c0qjx2.LLJJIII.put(str4, c668510QKb);
                c0qkx.LIZLLL.LJJIL("chunk");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                C0QON c0qon = new C0QON() { // from class: X.0QJa
                    @Override // X.C0QON
                    public final void onNext(Object obj) {
                        C0QJX c0qjx3 = c0qjx2;
                        String str5 = str4;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        C668540QKe c668540QKe2 = c668540QKeLJIILL;
                        C668510QKb c668510QKb2 = c668510QKb;
                        SearchSugResponse searchSugResponse = (SearchSugResponse) obj;
                        c0qjx3.getClass();
                        if (!TextUtils.isEmpty(searchSugResponse.originQuery)) {
                            searchSugResponse.LLILLL = searchSugResponse.originQuery;
                            atomicBoolean2.set(true);
                            if (C301410Brf.LIZ() && c668540QKe2.isPreRequest() > 0) {
                                c0qjx3.LLJILJILJ.put(searchSugResponse.LLILLL, searchSugResponse);
                                c668510QKb2.LIZIZ(searchSugResponse);
                                C313750CRp.LIZ(searchSugResponse);
                                return;
                            }
                            C668170QIt c668170QItLIZ2 = C668200QIw.LIZ(c668540QKe2.keywords);
                            c668170QItLIZ2.LIZLLL();
                            c0qjx3.LLJJJJJIL = c668170QItLIZ2.LIZLLL - c668170QItLIZ2.LIZJ;
                            if (str5.equals(searchSugResponse.originQuery)) {
                                c668510QKb2.LIZIZ(searchSugResponse);
                                c668170QItLIZ2.LIZ(Long.valueOf(searchSugResponse.LJI()));
                            } else {
                                C668510QKb c668510QKb3 = c0qjx3.LLJJIII.get(searchSugResponse.originQuery);
                                if (c668510QKb3 != null) {
                                    c668510QKb3.LIZIZ(searchSugResponse);
                                    c668170QItLIZ2.LIZ(Long.valueOf(searchSugResponse.LJI()));
                                }
                            }
                            if (c0qjx3.LLJILJIL.containsKey(searchSugResponse.LLILLL)) {
                                return;
                            }
                            c0qjx3.LJIJ(searchSugResponse);
                        }
                    }
                };
                if (((Number) C271890Al9.LIZ.getValue()).intValue() == 1) {
                    C1507060pJw.LJII().LJFF = true;
                }
                C1507060pJw.LJII().LIZLLL = true;
                C1507060pJw.LJII().LJI(str4, c0qon);
                C823050WQl.LIZJ().submit(new ARunnableS1S1500000_10(c0qjx2, c668510QKb, c668540QKeLJIILL, atomicBoolean, c0qkx, str4, 0));
                searchSugResponseLIZ = c668510QKb.LIZ();
                if (searchSugResponseLIZ == null) {
                    if (!c0qkx.LIZJ) {
                        C668590QKj c668590QKj = c0qkx.LIZLLL;
                        if (!c668510QKb.LJ) {
                            str3 = "result is null";
                        }
                        c668590QKj.LJJIJL(str3);
                    }
                } else {
                    c0qkx.LIZLLL.LJJIJLIJ();
                }
                c0qjx2.LLJJIII.remove(c668540QKeLJIILL.keywords);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } else {
                C01GW c01gw = C271820Al2.LIZ;
                if (((Number) c01gw.getValue()).intValue() > 0) {
                    Long l2 = c668540QKeLJIILL.requestOrder;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new C080U("check_preload", "true"));
                    C1493620oyG c1493620oyG2 = new C1493620oyG();
                    c1493620oyG2.LJIILIIL = 24576;
                    String strLIZ = C0PP3.LIZ();
                    if (((Boolean) C272400Aly.LIZ.getValue()).booleanValue()) {
                        SearchSugApi.SugApi sugApiLIZ = SearchSugApi.LIZ();
                        String str5 = c668540QKeLJIILL.keywords;
                        String str6 = c668540QKeLJIILL.source;
                        String str7 = c668540QKeLJIILL.historyJson;
                        String str8 = c668540QKeLJIILL.historyTimestampJson;
                        String str9 = c668540QKeLJIILL.gid;
                        Integer num = c668540QKeLJIILL.totalCount;
                        String str10 = c668540QKeLJIILL.sessionParams;
                        String str11 = c668540QKeLJIILL.requestParams;
                        String str12 = c668540QKeLJIILL.prefParams;
                        Integer num2 = c668540QKeLJIILL.richSugCount;
                        String str13 = c668540QKeLJIILL.enterFrom;
                        int i = c668540QKeLJIILL.sugCostDegradation;
                        String str14 = c668540QKeLJIILL.newSugSessionId;
                        String strIsBeginningOfSession = c668540QKeLJIILL.isBeginningOfSession();
                        String str15 = c668540QKeLJIILL.srcMaterialId;
                        String str16 = c668540QKeLJIILL.srcAnchorProductId;
                        String str17 = c668540QKeLJIILL.searchPosition;
                        Integer numIsNonPersonalizedSearch = c668540QKeLJIILL.isNonPersonalizedSearch();
                        String str18 = c668540QKeLJIILL.preInfoId;
                        Integer numLIZ = C326640CrG.LIZ();
                        C2232408os c2232408os = C341050DYp.LIZ;
                        c15o7FetchSugByChunk2 = sugApiLIZ.fetchSugByChunk(str5, str6, str7, str8, str9, num, str10, str11, str12, num2, l2, str13, i, str14, strIsBeginningOfSession, str15, str16, str17, numIsNonPersonalizedSearch, str18, strLIZ, numLIZ, C341050DYp.LIZ(Integer.valueOf(C0QCT.LIZ())), c1493620oyG2, arrayList2);
                    } else {
                        c15o7FetchSugByChunk2 = SearchSugApi.LIZ().fetchSugByChunk(c668540QKeLJIILL.keywords, c668540QKeLJIILL.source, c668540QKeLJIILL.historyJson, c668540QKeLJIILL.historyTimestampJson, c668540QKeLJIILL.gid, c668540QKeLJIILL.totalCount, c668540QKeLJIILL.sessionParams, c668540QKeLJIILL.requestParams, c668540QKeLJIILL.prefParams, c668540QKeLJIILL.richSugCount, l2, c668540QKeLJIILL.enterFrom, c668540QKeLJIILL.sugCostDegradation, c668540QKeLJIILL.newSugSessionId, c668540QKeLJIILL.isBeginningOfSession(), c668540QKeLJIILL.srcMaterialId, c668540QKeLJIILL.srcAnchorProductId, c668540QKeLJIILL.searchPosition, c668540QKeLJIILL.isNonPersonalizedSearch(), c668540QKeLJIILL.preInfoId, strLIZ, C326640CrG.LIZ(), null, c1493620oyG2, arrayList2);
                    }
                    final C668510QKb c668510QKb2 = new C668510QKb(c15o7FetchSugByChunk2);
                    c0qkx.LIZIZ = c668510QKb2;
                    final String str19 = c668540QKeLJIILL.keywords;
                    c0qjx2.LLJJIII.put(str19, c668510QKb2);
                    c0qkx.LIZLLL.LJJIL("chunk");
                    final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                    C0QON c0qon2 = new C0QON() { // from class: X.0QJb
                        @Override // X.C0QON
                        public final void onNext(Object obj) {
                            C0QJX c0qjx3 = c0qjx2;
                            String str20 = str19;
                            AtomicBoolean atomicBoolean3 = atomicBoolean2;
                            C668540QKe c668540QKe2 = c668540QKeLJIILL;
                            C668510QKb c668510QKb3 = c668510QKb2;
                            SearchSugResponse searchSugResponse = (SearchSugResponse) obj;
                            c0qjx3.getClass();
                            if (!TextUtils.isEmpty(searchSugResponse.originQuery)) {
                                searchSugResponse.LLILLL = searchSugResponse.originQuery;
                                atomicBoolean3.set(true);
                                if (C301410Brf.LIZ() && c668540QKe2.isPreRequest() > 0) {
                                    c0qjx3.LLJILJILJ.put(searchSugResponse.LLILLL, searchSugResponse);
                                    c668510QKb3.LIZIZ(searchSugResponse);
                                    C313750CRp.LIZ(searchSugResponse);
                                    return;
                                }
                                C668170QIt c668170QItLIZ2 = C668200QIw.LIZ(c668540QKe2.keywords);
                                c668170QItLIZ2.LIZLLL();
                                if (str20.equals(searchSugResponse.originQuery)) {
                                    c668510QKb3.LIZIZ(searchSugResponse);
                                    c668170QItLIZ2.LIZ(Long.valueOf(searchSugResponse.LJI()));
                                } else {
                                    C668510QKb c668510QKb4 = c0qjx3.LLJJIII.get(searchSugResponse.originQuery);
                                    if (c668510QKb4 != null) {
                                        c668510QKb4.LIZIZ(searchSugResponse);
                                        c668170QItLIZ2.LIZ(Long.valueOf(searchSugResponse.LJI()));
                                    }
                                }
                                if (c0qjx3.LLJILJIL.containsKey(searchSugResponse.LLILLL)) {
                                    return;
                                }
                                c0qjx3.LJIJ(searchSugResponse);
                            }
                        }
                    };
                    c668510QKb2.LIZ.LIZLLL(new C668520QKc(c668540QKeLJIILL, c668510QKb2, c0qkx, c0qjx2, str19, atomicBoolean2));
                    boolean z2 = true;
                    if (((Number) C271890Al9.LIZ.getValue()).intValue() == 1) {
                        C1507060pJw.LJII().LJFF = true;
                    }
                    C1507060pJw.LJII().LIZLLL = true;
                    C1507060pJw c1507060pJwLJII = C1507060pJw.LJII();
                    if (((Number) c01gw.getValue()).intValue() != 2) {
                        z2 = false;
                    }
                    c1507060pJwLJII.LJ = z2;
                    C1507060pJw.LJII().LJI(str19, c0qon2);
                    searchSugResponseLIZ = c668510QKb2.LIZ();
                    if (searchSugResponseLIZ == null) {
                        if (!c0qkx.LIZJ) {
                            C668590QKj c668590QKj2 = c0qkx.LIZLLL;
                            if (!c668510QKb2.LJ) {
                                str3 = "result is null";
                            }
                            c668590QKj2.LJJIJL(str3);
                        }
                    } else {
                        c0qkx.LIZLLL.LJJIJLIJ();
                    }
                    c0qjx2.LLJJIII.remove(c668540QKeLJIILL.keywords);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                } else {
                    boolean zLJI2 = MethodIDManager.LJI(137264);
                    Long l3 = c668540QKeLJIILL.requestOrder;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new C080U("check_preload", "true"));
                    String strLIZ2 = C0PP3.LIZ();
                    if (((Boolean) C272400Aly.LIZ.getValue()).booleanValue()) {
                        SearchSugApi.SugApi sugApiLIZ2 = SearchSugApi.LIZ();
                        String str20 = c668540QKeLJIILL.keywords;
                        String str21 = c668540QKeLJIILL.source;
                        String str22 = c668540QKeLJIILL.historyJson;
                        String str23 = c668540QKeLJIILL.historyTimestampJson;
                        String str24 = c668540QKeLJIILL.gid;
                        Integer num3 = c668540QKeLJIILL.totalCount;
                        String str25 = c668540QKeLJIILL.sessionParams;
                        String str26 = c668540QKeLJIILL.requestParams;
                        String str27 = c668540QKeLJIILL.prefParams;
                        Integer num4 = c668540QKeLJIILL.richSugCount;
                        String str28 = c668540QKeLJIILL.enterFrom;
                        int i2 = c668540QKeLJIILL.sugCostDegradation;
                        String str29 = c668540QKeLJIILL.newSugSessionId;
                        String strIsBeginningOfSession2 = c668540QKeLJIILL.isBeginningOfSession();
                        String str30 = c668540QKeLJIILL.srcMaterialId;
                        String str31 = c668540QKeLJIILL.srcAnchorProductId;
                        String str32 = c668540QKeLJIILL.searchPosition;
                        Integer numIsNonPersonalizedSearch2 = c668540QKeLJIILL.isNonPersonalizedSearch();
                        String str33 = c668540QKeLJIILL.preInfoId;
                        Integer numLIZ2 = C326640CrG.LIZ();
                        C2232408os c2232408os2 = C341050DYp.LIZ;
                        c15o7FetchSugByChunk = sugApiLIZ2.fetchSugByChunk(str20, str21, str22, str23, str24, num3, str25, str26, str27, num4, l3, str28, i2, str29, strIsBeginningOfSession2, str30, str31, str32, numIsNonPersonalizedSearch2, str33, strLIZ2, numLIZ2, C341050DYp.LIZ(Integer.valueOf(C0QCT.LIZ())), null, arrayList3);
                        if (zLJI2) {
                            MethodIDManager.LJ();
                        }
                    } else {
                        c15o7FetchSugByChunk = SearchSugApi.LIZ().fetchSugByChunk(c668540QKeLJIILL.keywords, c668540QKeLJIILL.source, c668540QKeLJIILL.historyJson, c668540QKeLJIILL.historyTimestampJson, c668540QKeLJIILL.gid, c668540QKeLJIILL.totalCount, c668540QKeLJIILL.sessionParams, c668540QKeLJIILL.requestParams, c668540QKeLJIILL.prefParams, c668540QKeLJIILL.richSugCount, l3, c668540QKeLJIILL.enterFrom, c668540QKeLJIILL.sugCostDegradation, c668540QKeLJIILL.newSugSessionId, c668540QKeLJIILL.isBeginningOfSession(), c668540QKeLJIILL.srcMaterialId, c668540QKeLJIILL.srcAnchorProductId, c668540QKeLJIILL.searchPosition, c668540QKeLJIILL.isNonPersonalizedSearch(), c668540QKeLJIILL.preInfoId, strLIZ2, C326640CrG.LIZ(), null, null, arrayList3);
                        if (zLJI2) {
                            MethodIDManager.LJ();
                        }
                    }
                    C668510QKb c668510QKb3 = new C668510QKb(c15o7FetchSugByChunk);
                    c0qkx.LIZIZ = c668510QKb3;
                    String str34 = c668540QKeLJIILL.keywords;
                    c0qjx2.LLJJIII.put(str34, c668510QKb3);
                    c0qkx.LIZLLL.LJJIL("chunk");
                    c668510QKb3.LIZ.LIZLLL(new C668530QKd(c0qjx2, str34, c668540QKeLJIILL, c668510QKb3, c0qkx));
                    searchSugResponseLIZ = c668510QKb3.LIZ();
                    if (searchSugResponseLIZ == null) {
                        if (!c0qkx.LIZJ) {
                            C668590QKj c668590QKj3 = c0qkx.LIZLLL;
                            if (!c668510QKb3.LJ) {
                                str3 = "result is null";
                            }
                            c668590QKj3.LJJIJL(str3);
                        }
                    } else {
                        c0qkx.LIZLLL.LJJIJLIJ();
                    }
                    c0qjx2.LLJJIII.remove(c668540QKeLJIILL.keywords);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }
            }
            C0QJX.LLJJL = Long.valueOf(C0QJX.LLJJL.longValue() + 1);
            if (C301410Brf.LIZ() && c668540QKeLJIILL.isPreRequest() > 0) {
                C1C7U.LIZIZ("SearchSugPresenter@ac4.<init>$1$sendRequest$1");
                return null;
            }
            if (((C0QKX) aCallableS178S0300000_10.l1).LIZJ) {
                ((C0QKX) aCallableS178S0300000_10.l1).LIZLLL.LJJIJL("task is canceled");
            }
            ((C0QKX) aCallableS178S0300000_10.l1).LIZLLL.LJIILJJIL();
            C0QLU.LIZIZ();
            if (!((C0QKX) aCallableS178S0300000_10.l1).LIZJ) {
                if (searchSugResponseLIZ == null) {
                    C1C7U.LIZIZ("SearchSugPresenter@ac4.<init>$1$sendRequest$1");
                    return null;
                }
                C0QJX c0qjx3 = ((C0QKW) aCallableS178S0300000_10.l2).LL;
                SugPreInfoResponse sugPreInfoResponse3 = c0qjx3.LLJJJIL;
                if (sugPreInfoResponse3 != null) {
                    String str35 = sugPreInfoResponse3.preInfoId;
                    SugConfig sugConfig = searchSugResponseLIZ.sugConfig;
                    if (sugConfig != null) {
                        str = sugConfig.disablePreInfoId;
                    } else {
                        str = null;
                    }
                    if (TextUtils.equals(str35, str)) {
                        c0qjx3.LLJJJIL = null;
                    }
                }
                searchSugResponseLIZ.getClass();
                searchSugResponseLIZ.LLILLL = c668540QKeLJIILL.keywords;
                searchSugResponseLIZ.LLILZ = (C0QKX) aCallableS178S0300000_10.l1;
                if (!Intrinsics.LJFF(c668170QItLIZ, c668170QIt)) {
                    c668170QItLIZ.LJ = searchSugResponseLIZ;
                }
                if (!Intrinsics.LJFF(c668170QItLIZ, c668170QIt)) {
                    c668170QItLIZ.LJIILJJIL = System.currentTimeMillis();
                }
                C1C7U.LIZIZ("SearchSugPresenter@ac4.<init>$1$sendRequest$1");
                return searchSugResponseLIZ;
            }
            throw new CancellationException();
        }
        throw new CancellationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$2(ACallableS178S0300000_10 aCallableS178S0300000_10) {
        String keyword;
        C0QPT historyIsolateStrategy;
        ECSearchEntranceData ecSearchEntranceData;
        C1C7U.LIZ("SearchResultFragmentNew@2882.checkAndRecordSearchHistory$1");
        if (!TextUtils.isEmpty(((SearchResultParam) aCallableS178S0300000_10.l0).getKeyword())) {
            keyword = ((SearchResultParam) aCallableS178S0300000_10.l0).getKeyword();
        } else {
            keyword = (String) ((C259800zU) aCallableS178S0300000_10.l1).element;
        }
        boolean z = true;
        if (((SearchResultParam) aCallableS178S0300000_10.l0).getShouldRecordInHistory() != 1) {
            z = false;
        }
        if (!TextUtils.isEmpty(keyword) && z) {
            SearchResultFragmentNew searchResultFragmentNew = (SearchResultFragmentNew) aCallableS178S0300000_10.l2;
            C0QER c0qerLIZJ = C640270P9l.LIZJ(searchResultFragmentNew, searchResultFragmentNew.getActivity());
            boolean zLIZJ = C650500PfM.LIZJ(c0qerLIZJ);
            C0QF6 c0qf6LJIJI = C0QPJ.LJIJI(((SearchResultFragmentNew) aCallableS178S0300000_10.l2).WR());
            SearchHistory searchHistory = new SearchHistory(keyword, 0);
            searchHistory.enterMethod = ((SearchResultParam) aCallableS178S0300000_10.l0).getEnterMethod();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rec-");
            sbLIZ.append(zLIZJ);
            c0qf6LJIJI.LIZ(searchHistory, C2188811AlT.LIZIZ(sbLIZ));
            if (zLIZJ) {
                if (c0qerLIZJ == null || (ecSearchEntranceData = c0qerLIZJ.getEcSearchEntranceData()) == null || (historyIsolateStrategy = ecSearchEntranceData.getHistoryIsolateStrategy()) == null) {
                    historyIsolateStrategy = C0QPT.NO_ISOLATE;
                }
                if (historyIsolateStrategy == C0QPT.EC_SINGLE_ISOLATE) {
                    C0QPJ.LJIJI(null).LIZ(new SearchHistory(keyword, 0), "rec_cas");
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchResultFragmentNew@2882.checkAndRecordSearchHistory$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS178S0300000_10(Object obj, SearchResultParam searchResultParam, C259800zU<String> c259800zU, ECSearchEntranceData eCSearchEntranceData) {
        this.$t = eCSearchEntranceData;
        this.l0 = obj;
        this.l1 = searchResultParam;
        this.l2 = c259800zU;
    }
}
