package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.RelevantClip;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TranslateSearchDesc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PNL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PNL extends C0PN2<Aweme, SearchMix> {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public int LLJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public String LLJJL;
    public final String LLJJIJIL = "";
    public String LLJJJIL = "video_search";
    public String LLJJJJ = CardStruct.IStatusCode.DEFAULT;

    @Override // X.C0PN2
    public final int LJIJ() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((SearchMix) t).hasMore;
    }

    @Override // X.AbstractC1255880imo
    public final void onModelBound() {
        super.onModelBound();
        if (this.LLJJJJJIL != null) {
            C0PIF c0pif = C0PIF.LIZ;
            List<Aweme> items = getItems();
            String str = this.LLJJJJJIL;
            String str2 = this.LLJJJJ;
            boolean z = this.LLJJJJLIIL;
            c0pif.getClass();
            C0PIF.LJ(str, str2, items, z);
        }
    }

    @Override // X.C0PN2
    public final void LJIL(List<? extends Aweme> list) {
        int size;
        super.LJIL(list);
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        this.LLJJJ = size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0PN2, X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJJI, reason: merged with bridge method [inline-methods] */
    public final void handleData(SearchMix searchMix) {
        boolean z;
        List<Aweme> awemeList;
        boolean z2;
        boolean z3;
        Aweme awemeLLILLL;
        int size;
        String tnsBanType;
        boolean disableMusicDspFreqCtrl;
        List<Float> list;
        Boolean bool;
        SearchAwemeInfo searchAwemeInfo;
        List<TranslateSearchDesc> list2;
        TranslateSearchDesc translateSearchDesc;
        super.handleData(searchMix);
        if (searchMix != 0 && !C086I.LIZIZ(searchMix.getAwemeList())) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            if (searchMix != 0) {
                List<Aweme> awemeList2 = searchMix.getAwemeList();
                if (awemeList2 != null) {
                    int size2 = awemeList2.size();
                    for (int i = 0; i < size2; i++) {
                        Object obj = ListProtector.get(searchMix.getAwemeList(), i);
                        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                        if (iAwemeService != null) {
                            awemeLLILLL = iAwemeService.LLILLL((Aweme) obj);
                        } else {
                            awemeLLILLL = null;
                        }
                        T t = this.mData;
                        if (t != 0 && ((SearchMix) t).getAwemeList() != null) {
                            size = ((SearchMix) this.mData).getAwemeList().size();
                        } else {
                            size = 0;
                        }
                        awemeLLILLL.setRequestId(this.LLJILJILJ);
                        if ((!((ArrayList) searchMix.LJI()).isEmpty()) && (searchAwemeInfo = (SearchAwemeInfo) ListProtector.get(searchMix.LJI(), i)) != null && (list2 = searchAwemeInfo.translateSearchList) != null && (translateSearchDesc = (TranslateSearchDesc) ListProtector.get(list2, 0)) != null) {
                            AwemeBizExtKt.setSearchDocTranslate(awemeLLILLL, translateSearchDesc.searchDesc);
                            AwemeBizExtKt.setSearchDocOriginLanguage(awemeLLILLL, translateSearchDesc.originLanguage);
                        }
                        GlobalDoodleConfig globalDoodleConfig = searchMix.globalDoodleConfig;
                        if (globalDoodleConfig != null) {
                            tnsBanType = globalDoodleConfig.getTnsBanType();
                        } else {
                            tnsBanType = null;
                        }
                        if (Intrinsics.LJFF(tnsBanType, "Pass")) {
                            AwemeExtKt.appendExtraParamUseInSearch(awemeLLILLL, "is_search_video", "1");
                        }
                        GlobalDoodleConfig globalDoodleConfig2 = searchMix.globalDoodleConfig;
                        if (globalDoodleConfig2 != null) {
                            disableMusicDspFreqCtrl = globalDoodleConfig2.getDisableMusicDspFreqCtrl();
                        } else {
                            disableMusicDspFreqCtrl = false;
                        }
                        AwemeBizExtKt.setDisableMusicDspFreqCtrl(awemeLLILLL, disableMusicDspFreqCtrl);
                        IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                        if (iRequestIdService != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(awemeLLILLL.getAid());
                            sbLIZ.append('9');
                            iRequestIdService.LIZIZ(size + i, C2188811AlT.LIZIZ(sbLIZ), this.LLJILJILJ);
                        }
                        ListProtector.set(awemeList2, i, awemeLLILLL);
                        AwemeBizExtKt.setAwemePosition(awemeLLILLL, i);
                        C643200PKs.LIZJ(awemeLLILLL, this.LLJJL);
                        RelevantClip relevantClip = (RelevantClip) C13LP.LJJJLZIJ(i, searchMix.LJ());
                        if (relevantClip != null && (bool = relevantClip.enableSkipButton) != null) {
                            AwemeBizExtKt.setEnableVideoSkip(awemeLLILLL, bool.booleanValue());
                        }
                        RelevantClip relevantClip2 = (RelevantClip) C13LP.LJJJLZIJ(i, searchMix.LJ());
                        if (relevantClip2 != null && (list = relevantClip2.relevantTimes) != null) {
                            AwemeBizExtKt.setRelevantTime(awemeLLILLL, list);
                        }
                    }
                    C0PFZ c0pfz = C0PFZ.LIZ;
                    if (this.mListQueryType == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i2 = this.LLJJJ;
                    c0pfz.getClass();
                    this.LLJJJ = C0PFZ.LIZLLL(i2, z2, awemeList2);
                    int i3 = this.mListQueryType;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            LJIIJ(awemeList2);
                            SearchMix searchMix2 = (SearchMix) this.mData;
                            if (searchMix2 != null) {
                                if (searchMix.hasMore && searchMix2.hasMore) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                searchMix2.hasMore = z3;
                                searchMix2.cursor = searchMix.cursor;
                            }
                        }
                    } else {
                        this.mData = searchMix;
                        LJIL(awemeList2);
                    }
                    if (this.LLJJJJJIL != null) {
                        C0PIF c0pif = C0PIF.LIZ;
                        List<Aweme> items = getItems();
                        String str = this.LLJJJJJIL;
                        String str2 = this.LLJJJJ;
                        boolean z4 = this.LLJJJJLIIL;
                        c0pif.getClass();
                        C0PIF.LJ(str, str2, items, z4);
                    }
                }
            } else {
                return;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
                LJIIL();
            }
            T t2 = this.mData;
            if (t2 != 0) {
                ((SearchMix) t2).hasMore = false;
            }
        }
        if (searchMix != 0 && (awemeList = searchMix.getAwemeList()) != null && !awemeList.isEmpty()) {
            C1360460lVU.LIZIZ.LJJI(searchMix.getAwemeList(), EnumC1359020lTA.SEARCH_FEED, null);
        }
    }

    public final void LJJIFFI(final SearchRequestParam searchRequestParam) {
        boolean zLJI = MethodIDManager.LJI(202539);
        this.LL = searchRequestParam.LIZ;
        AbstractCallableC643890PNj abstractCallableC643890PNj = new AbstractCallableC643890PNj(searchRequestParam) { // from class: X.0PPe
            public final SearchRequestParam LLILLL;

            @Override // X.AbstractCallableC643890PNj
            public final Object LIZIZ() throws ExecutionException, InterruptedException {
                Map<String, String> linkedHashMap;
                LinkedHashMap<String, Integer> linkedHashMap2;
                boolean zLJI2 = MethodIDManager.LJI(202518);
                if (((Boolean) C1219804pw.LIZIZ.getValue()).booleanValue()) {
                    try {
                        Thread.sleep(((Number) C1219804pw.LIZJ.getValue()).intValue());
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                SearchApiNew.RealApi realApiLIZ = SearchApiNew.LIZ();
                SearchRequestParam searchRequestParam2 = this.LLILLL;
                String str = searchRequestParam2.keyword;
                long j = searchRequestParam2.cursor;
                int i = searchRequestParam2.count;
                String str2 = searchRequestParam2.source;
                String str3 = searchRequestParam2.searchSource;
                int i2 = searchRequestParam2.hotSearch;
                String str4 = searchRequestParam2.searchId;
                String str5 = searchRequestParam2.lastSearchId;
                int i3 = searchRequestParam2.correctType;
                C0PSG c0psg = this.LLILZ.LL;
                int i4 = (c0psg == null || c0psg.isDefaultOption()) ? 0 : 1;
                C0PSG c0psg2 = this.LLILZ.LL;
                int sortType = c0psg2 != null ? c0psg2.getSortType() : 0;
                C0PSG c0psg3 = this.LLILZ.LL;
                int filterBy = c0psg3 != null ? c0psg3.getFilterBy() : 0;
                C0PSG c0psg4 = this.LLILZ.LL;
                if (c0psg4 == null || (linkedHashMap = c0psg4.studioToFieldMap()) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                SearchRequestParam searchRequestParam3 = this.LLILLL;
                String str6 = searchRequestParam3.enterFrom;
                String str7 = searchRequestParam3.channel;
                String str8 = searchRequestParam3.showResultsSource;
                String str9 = searchRequestParam3.searchContext;
                C0PSG c0psg5 = searchRequestParam3.LIZ;
                if (c0psg5 == null || (linkedHashMap2 = c0psg5.activityToFieldMap()) == null) {
                    linkedHashMap2 = new LinkedHashMap<>();
                }
                Fragment fragmentLJIILJJIL = this.LLILZ.LJIILJJIL();
                WeakReference<C19EG> weakReference = this.LLILZ.LLIZ;
                String strLIZ = C0Q3Q.LIZ(weakReference != null ? weakReference.get() : null, fragmentLJIILJJIL, this.LLILZ.LLILZ);
                C664730Q5n.LIZ.getClass();
                String strLIZJ = C664730Q5n.LIZJ();
                String strLJJJ = C13LQ.LJJJ(C161N.LIZIZ.LL(), ",", null, null, null, 62);
                SearchRequestParam searchRequestParam4 = this.LLILLL;
                Integer num = searchRequestParam4.isNonPersonalizedSearch;
                String str10 = searchRequestParam4.sugGenerateType;
                Long l = searchRequestParam4.searchSessionId;
                String str11 = searchRequestParam4.filterItemIds;
                Map<String, String> mapLIZ = C0P91.LIZ(this.LLILZ.LLILZ);
                if (mapLIZ == null) {
                    mapLIZ = C2097608Jq.LJ();
                }
                SearchRequestParam searchRequestParam5 = this.LLILLL;
                SearchMix searchMix = realApiLIZ.searchFeedList(str, j, i, str2, str3, i2, str4, str5, i3, i4, sortType, filterBy, linkedHashMap, str6, str7, str8, str9, linkedHashMap2, strLIZ, strLIZJ, strLJJJ, num, str10, l, str11, mapLIZ, searchRequestParam5.endToEndSearchSessionId, searchRequestParam5.bcmChain).get();
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                return searchMix;
            }

            {
                this.LLILLL = searchRequestParam;
            }
        };
        abstractCallableC643890PNj.LLILLJJLI = searchRequestParam.LIZIZ;
        this.LLIZLLLIL = abstractCallableC643890PNj;
        C1BVK.LIZIZ().LIZ(this.mHandler, abstractCallableC643890PNj, 0);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        String sugGenerateType;
        SearchRequestParam searchRequestParam;
        String sugGenerateType2;
        Integer num = 1;
        int i = 0;
        String strLJLIL = null;
        if (objArr.length == 1) {
            String strLJIILIIL = LJIILIIL(objArr);
            if (!isDataEmpty()) {
                i = ((SearchMix) this.mData).cursor;
            }
            long j = i;
            String str = this.LLJJI;
            if (str == null) {
                str = "";
            }
            C0PSG c0psg = this.LL;
            String strLJIILLIIL = LJIILLIIL();
            int i2 = this.LLJILJIL;
            String str2 = this.LLJILLL;
            String str3 = this.LLJJJIL;
            String str4 = this.LLJJIJIL;
            String str5 = this.LLJJIJIIJIL;
            if (!ComplianceServiceProvider.LJI().LJJII()) {
                num = null;
            }
            SearchResultParam searchResultParam = this.LLILZ;
            if (searchResultParam != null) {
                sugGenerateType2 = searchResultParam.getSugGenerateType();
            } else {
                sugGenerateType2 = null;
            }
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService != null) {
                strLJLIL = iEcomSearchService.LJLIL(null, "");
            }
            searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str2, str3, i2, 1, str, str5, j, 10, strLJIILLIIL, str4, null, null, null, null, "", null, null, null, null, null, null, null, null, "", null, num, sugGenerateType2, null, null, null, null, null, null, strLJLIL, null, null, 0, 0, 0, false, c0psg, null, C2097608Jq.LJ());
        } else {
            String strLJIILIIL2 = LJIILIIL(objArr);
            if (!isDataEmpty()) {
                i = ((SearchMix) this.mData).cursor;
            }
            long j2 = i;
            String str6 = this.LLJJI;
            if (str6 == null) {
                str6 = "";
            }
            int iIntValue = ((Integer) objArr[3]).intValue();
            C0PSG c0psg2 = (C0PSG) objArr[4];
            String strLJIILLIIL2 = LJIILLIIL();
            int i3 = this.LLJILJIL;
            String str7 = this.LLJILLL;
            String str8 = this.LLJJJIL;
            String str9 = this.LLJJIJIL;
            String str10 = this.LLJJIJIIJIL;
            if (!ComplianceServiceProvider.LJI().LJJII()) {
                num = null;
            }
            SearchResultParam searchResultParam2 = this.LLILZ;
            if (searchResultParam2 != null) {
                sugGenerateType = searchResultParam2.getSugGenerateType();
            } else {
                sugGenerateType = null;
            }
            IEcomSearchService iEcomSearchService2 = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService2 != null) {
                strLJLIL = iEcomSearchService2.LJLIL(null, "");
            }
            searchRequestParam = new SearchRequestParam(strLJIILIIL2, 0, str7, str8, i3, iIntValue, str6, str10, j2, 10, strLJIILLIIL2, str9, null, null, null, null, "", null, null, null, null, null, null, null, null, "", null, num, sugGenerateType, null, null, null, null, null, null, strLJLIL, null, null, 0, 0, 0, false, c0psg2, null, C2097608Jq.LJ());
        }
        LJJIFFI(searchRequestParam);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        String sugGenerateType;
        SearchRequestParam searchRequestParam;
        String sugGenerateType2;
        Integer num = 1;
        String strLJLIL = null;
        if (objArr.length == 1) {
            String strLJIILIIL = LJIILIIL(objArr);
            C0PSG c0psg = this.LL;
            String strLJIILLIIL = LJIILLIIL();
            int i = this.LLJILJIL;
            String str = this.LLJILLL;
            String str2 = this.LLJJJIL;
            String str3 = this.LLJJIJIL;
            String str4 = this.LLJJIJIIJIL;
            C01GW<C669480QNu> c01gw = C669480QNu.LJ;
            String strLIZJ = C326370Cqp.LIZ().LIZJ();
            if (!ComplianceServiceProvider.LJI().LJJII()) {
                num = null;
            }
            SearchResultParam searchResultParam = this.LLILZ;
            if (searchResultParam != null) {
                sugGenerateType2 = searchResultParam.getSugGenerateType();
            } else {
                sugGenerateType2 = null;
            }
            long j = ((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL;
            C662670Pyz.LIZ.getClass();
            String strLIZ = C662670Pyz.LIZ();
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService != null) {
                strLJLIL = iEcomSearchService.LJLIL(null, "");
            }
            searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str, str2, i, 1, "", str4, 0L, 10, strLJIILLIIL, str3, null, null, null, null, strLIZJ, null, null, null, null, null, null, null, null, "", null, num, sugGenerateType2, null, Long.valueOf(j), null, strLIZ, null, null, strLJLIL, null, null, 0, 0, 0, false, c0psg, null, C2097608Jq.LJ());
        } else {
            String strLJIILIIL2 = LJIILIIL(objArr);
            int iIntValue = ((Integer) objArr[3]).intValue();
            C0PSG c0psg2 = (C0PSG) objArr[4];
            String strLJIILLIIL2 = LJIILLIIL();
            int i2 = this.LLJILJIL;
            String str5 = this.LLJILLL;
            String str6 = this.LLJJJIL;
            String str7 = this.LLJJIJIL;
            String str8 = this.LLJJIJIIJIL;
            C01GW<C669480QNu> c01gw2 = C669480QNu.LJ;
            String strLIZJ2 = C326370Cqp.LIZ().LIZJ();
            if (!ComplianceServiceProvider.LJI().LJJII()) {
                num = null;
            }
            SearchResultParam searchResultParam2 = this.LLILZ;
            if (searchResultParam2 != null) {
                sugGenerateType = searchResultParam2.getSugGenerateType();
            } else {
                sugGenerateType = null;
            }
            long j2 = ((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL;
            C662670Pyz.LIZ.getClass();
            String strLIZ2 = C662670Pyz.LIZ();
            IEcomSearchService iEcomSearchService2 = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService2 != null) {
                strLJLIL = iEcomSearchService2.LJLIL(null, "");
            }
            searchRequestParam = new SearchRequestParam(strLJIILIIL2, 0, str5, str6, i2, iIntValue, "", str8, 0L, 10, strLJIILLIIL2, str7, null, null, null, null, strLIZJ2, null, null, null, null, null, null, null, null, "", null, num, sugGenerateType, null, Long.valueOf(j2), null, strLIZ2, null, null, strLJLIL, null, null, 0, 0, 0, false, c0psg2, null, C2097608Jq.LJ());
        }
        LJJIFFI(searchRequestParam);
    }
}
