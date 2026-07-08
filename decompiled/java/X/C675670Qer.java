package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.config.ECSearchVerticalChunkSizeListSettings;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.mix.MixPhotoSearchAssem;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Qer, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675670Qer {
    public final View LIZ;
    public final LinearLayout LIZIZ;
    public final LifecycleOwner LIZJ;
    public final PhotoSearchBaseVM LIZLLL;
    public final MixShopSearchBizVM LJ;
    public final C679100QkO LJFF;
    public final MixPhotoSearchAssem LJI;
    public C678130Qip LJII;
    public EnumC676230Qfl LJIIIIZZ = EnumC676230Qfl.UNKNOWN;
    public EnumC675700Qeu LJIIIZ = EnumC675700Qeu.UNKNOWN;
    public Map<String, String> LJIIJ = new LinkedHashMap();
    public final AFwS196S0000000_10 LJIIJJI = AFwS196S0000000_10.get$arr$(488);

    public static C674800QdS LIZIZ() {
        try {
            return new C674800QdS("", "", "", 0, 0, "", null, 0L, 0, "", null, null, null, null, null, null, null, null, null, null, 0, null, "1.0", null, null, null, null, null, null, null, null, null, null, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public final C678130Qip LIZLLL() {
        C678130Qip c678130Qip = this.LJII;
        if (c678130Qip != null) {
            return c678130Qip;
        }
        return null;
    }

    public static SearchResultParam LIZJ(PhotoSearchEnterParams photoSearchEnterParams) {
        String str;
        String str2;
        String str3;
        String str4;
        String ecSearchSessionId;
        String str5;
        Long endToEndSessionId;
        String str6;
        int i;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams4;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams5;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams6;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams7;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams8;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams9;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams10;
        String str7;
        SearchResultParam searchResultParam = new SearchResultParam();
        String str8 = "";
        searchResultParam.setKeyword("");
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams10 = photoSearchEnterParams.businessParams) != null && (str7 = photoSearchBusinessEnterParams10.enterMethod) != null) {
            str8 = str7;
        }
        searchResultParam.setEnterMethod(str8);
        C0QER c0qer = new C0QER();
        HashMap<String, Object> map = null;
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams9 = photoSearchEnterParams.businessParams) != null) {
            str = photoSearchBusinessEnterParams9.enterFrom;
        } else {
            str = null;
        }
        c0qer.setEnterSearchFrom(str);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams8 = photoSearchEnterParams.businessParams) != null) {
            str2 = photoSearchBusinessEnterParams8.previousPage;
        } else {
            str2 = null;
        }
        c0qer.setPreviousPage(str2);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams7 = photoSearchEnterParams.businessParams) != null) {
            str3 = photoSearchBusinessEnterParams7.groupId;
        } else {
            str3 = null;
        }
        c0qer.setGroupId(str3);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams6 = photoSearchEnterParams.businessParams) != null) {
            str4 = photoSearchBusinessEnterParams6.trafficSourceList;
        } else {
            str4 = null;
        }
        c0qer.setTrafficSourceList(str4);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams5 = photoSearchEnterParams.businessParams) != null) {
            ecSearchSessionId = photoSearchBusinessEnterParams5.getEcSearchSessionId();
        } else {
            ecSearchSessionId = null;
        }
        c0qer.setEcSearchSessionId(ecSearchSessionId);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams4 = photoSearchEnterParams.businessParams) != null) {
            str5 = photoSearchBusinessEnterParams4.searchSessionId;
        } else {
            str5 = null;
        }
        c0qer.setSearchSessionId(str5);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams3 = photoSearchEnterParams.businessParams) != null) {
            endToEndSessionId = photoSearchBusinessEnterParams3.getEndToEndSessionId();
        } else {
            endToEndSessionId = null;
        }
        c0qer.setEndToEndSession(endToEndSessionId);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams.businessParams) != null) {
            str6 = photoSearchBusinessEnterParams2.originIsMallTab;
        } else {
            str6 = null;
        }
        c0qer.setOriginIsMallTab(str6);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            i = photoSearchBusinessEnterParams.rootEnterFromType;
        } else {
            i = -100;
        }
        c0qer.setEcSearchEntranceValue(i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (photoSearchEnterParams != null) {
            PhotoSearchLogEnterParams photoSearchLogEnterParams = photoSearchEnterParams.logParams;
            if (photoSearchLogEnterParams != null) {
                String str9 = photoSearchLogEnterParams.searchEntrance;
                if (str9 != null) {
                    linkedHashMap.put("search_entrance", str9);
                }
                String str10 = photoSearchLogEnterParams.sourcePageName;
                if (str10 != null) {
                    linkedHashMap.put("source_page_name", str10);
                }
                String str11 = photoSearchLogEnterParams.searchType;
                if (str11 != null) {
                    linkedHashMap.put("search_type", str11);
                }
                String str12 = photoSearchLogEnterParams.photoSearchTypeDetail;
                if (str12 != null) {
                    linkedHashMap.put("photo_search_type_detail", str12);
                }
                String str13 = photoSearchLogEnterParams.enterFromSecond;
                if (str13 != null) {
                    linkedHashMap.put("enter_from_second", str13);
                }
                String str14 = photoSearchLogEnterParams.searchEntranceSecond;
                if (str14 != null) {
                    linkedHashMap.put("search_entrance_second", str14);
                }
                String str15 = photoSearchLogEnterParams.photoSearchModule;
                if (str15 != null) {
                    linkedHashMap.put("photo_search_module", str15);
                }
                String str16 = photoSearchLogEnterParams.sourcePreviousPage;
                if (str16 != null) {
                    linkedHashMap.put("source_previous_page", str16);
                }
                String str17 = photoSearchLogEnterParams.templateId;
                if (str17 != null) {
                    linkedHashMap.put("template_id", str17);
                }
            }
            HashMap<String, Object> map2 = photoSearchEnterParams.extraLogParams;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
        }
        c0qer.setLogExtraMap(linkedHashMap);
        if (photoSearchEnterParams != null) {
            map = photoSearchEnterParams.ecSearchCommonParams;
        }
        c0qer.setEcSearchCommonParams(map);
        searchResultParam.setSearchEnterParam(c0qer);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (photoSearchEnterParams != null) {
            PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams11 = photoSearchEnterParams.businessParams;
            if (photoSearchBusinessEnterParams11 != null) {
                String str18 = photoSearchBusinessEnterParams11.enterFrom;
                if (str18 != null) {
                    linkedHashMap2.put("enter_from", str18);
                }
                String str19 = photoSearchBusinessEnterParams11.enterMethod;
                if (str19 != null) {
                    linkedHashMap2.put("enter_method", str19);
                }
                String str20 = photoSearchBusinessEnterParams11.groupId;
                if (str20 != null) {
                    linkedHashMap2.put("group_id", str20);
                }
                String str21 = photoSearchBusinessEnterParams11.trafficSourceList;
                if (str21 != null) {
                    linkedHashMap2.put("traffic_source_list", str21);
                }
                String ecSearchSessionId2 = photoSearchBusinessEnterParams11.getEcSearchSessionId();
                if (ecSearchSessionId2 != null) {
                    linkedHashMap2.put("ec_search_session_id", ecSearchSessionId2);
                }
                String str22 = photoSearchBusinessEnterParams11.searchSessionId;
                if (str22 != null) {
                    linkedHashMap2.put("search_session_id", str22);
                }
                String str23 = photoSearchBusinessEnterParams11.originIsMallTab;
                if (str23 != null) {
                    linkedHashMap2.put("origin_is_mall_tab", str23);
                }
            }
            PhotoSearchLogEnterParams photoSearchLogEnterParams2 = photoSearchEnterParams.logParams;
            if (photoSearchLogEnterParams2 != null) {
                String str24 = photoSearchLogEnterParams2.searchEntrance;
                if (str24 != null) {
                    linkedHashMap2.put("search_entrance", str24);
                }
                String str25 = photoSearchLogEnterParams2.sourcePageName;
                if (str25 != null) {
                    linkedHashMap2.put("source_page_name", str25);
                }
                String str26 = photoSearchLogEnterParams2.searchType;
                if (str26 != null) {
                    linkedHashMap2.put("search_type", str26);
                }
                String str27 = photoSearchLogEnterParams2.photoSearchTypeDetail;
                if (str27 != null) {
                    linkedHashMap2.put("photo_search_type_detail", str27);
                }
                String str28 = photoSearchLogEnterParams2.enterFromSecond;
                if (str28 != null) {
                    linkedHashMap2.put("enter_from_second", str28);
                }
                String str29 = photoSearchLogEnterParams2.searchEntranceSecond;
                if (str29 != null) {
                    linkedHashMap2.put("search_entrance_second", str29);
                }
                String str30 = photoSearchLogEnterParams2.photoSearchModule;
                if (str30 != null) {
                    linkedHashMap2.put("photo_search_module", str30);
                }
                String str31 = photoSearchLogEnterParams2.sourcePreviousPage;
                if (str31 != null) {
                    linkedHashMap2.put("source_previous_page", str31);
                }
                String str32 = photoSearchLogEnterParams2.templateId;
                if (str32 != null) {
                    linkedHashMap2.put("template_id", str32);
                }
            }
        }
        searchResultParam.setMaskedLogInfo(linkedHashMap2);
        return searchResultParam;
    }

    public final C677400Qhe LIZ(SearchResultParam searchResultParam) {
        return new C677400Qhe(new C678230Qiz(this.LIZJ, new InterfaceC678420QjI() { // from class: X.0QfZ
            @Override // X.InterfaceC678420QjI
            public final void LIZ() {
            }

            @Override // X.InterfaceC678420QjI
            public final int LIZIZ(int i) {
                return 0;
            }

            @Override // X.InterfaceC678420QjI
            public final void LIZJ(C1422405hW c1422405hW) {
                PhotoSearchBaseVM photoSearchBaseVM = this.LIZ.LIZLLL;
                if (photoSearchBaseVM != null && !photoSearchBaseVM.LLJJ) {
                    photoSearchBaseVM.LLJJIJIIJIL = 2L;
                }
            }
        }, new LinkedHashMap(), this.LJIIJJI), searchResultParam, EnumC675760Qf0.PHOTO_SEARCH, new C676670QgT(), new C677970QiZ(new InterfaceC621800OaA() { // from class: X.0Qdw
            /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
            @Override // X.InterfaceC621800OaA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.Map<java.lang.String, java.lang.Object> Aj() throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 230
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C675100Qdw.Aj():java.util.Map");
            }

            @Override // X.InterfaceC621800OaA
            public final Map<String, String> LIZ() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC621800OaA
            public final List<Class<? extends InterfaceC1063710dmr>> LIZIZ() {
                return C602640NkM.LIZ();
            }
        }, new InterfaceC677960QiY() { // from class: X.0QfU
            @Override // X.InterfaceC677960QiY
            public final void LIZ(C1537480q70 c1537480q70) {
            }

            @Override // X.InterfaceC677960QiY
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC677960QiY
            public final void onPostKitCreated(InterfaceC1541990qEH interfaceC1541990qEH) {
            }

            @Override // X.InterfaceC677960QiY
            public final void onFirstFrameRendered() {
                PhotoSearchBaseVM photoSearchBaseVM = this.LIZ.LIZLLL;
                if (photoSearchBaseVM == null || photoSearchBaseVM.LLJJ) {
                    return;
                }
                photoSearchBaseVM.LLJJIJIIJIL = 4L;
                photoSearchBaseVM.LLJL = 1;
                photoSearchBaseVM.LLJJIJIL = System.currentTimeMillis();
            }
        }, this.LIZ), new C676680QgU(), new C676510QgD(new InterfaceC675320QeI() { // from class: X.0Qfc
            @Override // X.InterfaceC675320QeI
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC675320QeI
            public final void LJ(SearchApiResult searchApiResult, C1422405hW c1422405hW) {
            }

            @Override // X.InterfaceC675320QeI
            public final Function0<C675270QeD> LIZJ() {
                return new AwS554S0100000_10(this.LIZ, 1008);
            }

            @Override // X.InterfaceC675320QeI
            public final void retry() {
                C674850QdX c674850QdX;
                C675670Qer c675670Qer = this.LIZ;
                PhotoSearchBaseVM photoSearchBaseVM = c675670Qer.LIZLLL;
                if (photoSearchBaseVM == null || (c674850QdX = photoSearchBaseVM.LLILZLL) == null || c675670Qer.LJI.getContext() == null) {
                    return;
                }
                c675670Qer.LJ(c675670Qer.LJIIIZ, c675670Qer.LJIIIIZZ, c674850QdX, c675670Qer.LJIIJ, true);
            }

            @Override // X.InterfaceC675320QeI
            public final void LIZ(Integer num, Throwable th) {
                C676770Qgd c676770Qgd = new C676770Qgd(th);
                if (num != null) {
                    c676770Qgd.LIZIZ = num.intValue();
                }
                PhotoSearchBaseVM photoSearchBaseVM = this.LIZ.LIZLLL;
                if (photoSearchBaseVM != null) {
                    photoSearchBaseVM.yQ2(c676770Qgd);
                }
            }

            @Override // X.InterfaceC675320QeI
            public final void Se(final int i, final Map<String, String> map) {
                C678140Qiq c678140Qiq;
                MixPageViewModel mixPageViewModel;
                NextLiveData<Integer> nextLiveData;
                Integer value;
                final C675670Qer c675670Qer = this.LIZ;
                C676390Qg1 c676390Qg1 = new C676390Qg1(i, new InterfaceC676660QgS() { // from class: X.0Qfk
                    @Override // X.InterfaceC676660QgS
                    public final AnonymousClass0956 run() {
                        C674850QdX c674850QdX;
                        C675670Qer c675670Qer2 = c675670Qer;
                        PhotoSearchBaseVM photoSearchBaseVM = c675670Qer2.LIZLLL;
                        if (photoSearchBaseVM == null || (c674850QdX = photoSearchBaseVM.LLILZLL) == null) {
                            return null;
                        }
                        int i2 = i;
                        Map<String, String> map2 = map;
                        EnumC675700Qeu enumC675700Qeu = EnumC675700Qeu.CONTENT_LIST_REFRESH;
                        EnumC676230Qfl.Companion.getClass();
                        return c675670Qer2.LJ(enumC675700Qeu, C676300Qfs.LIZ(i2), c674850QdX, map2, false);
                    }
                });
                C678130Qip c678130QipLIZLLL = c675670Qer.LIZLLL();
                C676390Qg1 c676390Qg12 = null;
                if (c678130QipLIZLLL != null && (c678140Qiq = c678130QipLIZLLL.LJII) != null && (mixPageViewModel = c678140Qiq.LJIIL) != null && (nextLiveData = mixPageViewModel.LLJILJIL) != null && (value = nextLiveData.getValue()) != null && value.intValue() == 1) {
                    Iterator<C676390Qg1> it2 = c675670Qer.LJ.LLJJJIL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C676390Qg1 next = it2.next();
                        C09AE c09ae = next.LIZJ;
                        if (c09ae != null && c09ae.isActive()) {
                            c676390Qg12 = next;
                            break;
                        }
                    }
                    C676390Qg1 c676390Qg13 = c676390Qg12;
                    if (c676390Qg13 != null) {
                        c675670Qer.LJ.LLJJJIL.add(c676390Qg1);
                        if (System.currentTimeMillis() - c676390Qg13.LIZLLL > 10000) {
                            c675670Qer.LJ.wQ2();
                            return;
                        }
                        return;
                    }
                    c675670Qer.LJ.LLJJJIL.add(c676390Qg1);
                    c675670Qer.LJ.wQ2();
                    return;
                }
                c675670Qer.LJ.LLJJJIL.add(c676390Qg1);
            }

            /* JADX WARN: Removed duplicated region for block: B:202:0x0329  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x032c  */
            @Override // X.InterfaceC675320QeI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(X.C1422405hW r24, X.C675150Qe1 r25, boolean r26) {
                /*
                    Method dump skipped, instruction units count: 839
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C676140Qfc.LIZLLL(X.05hW, X.0Qe1, boolean):void");
            }
        }), new C676490QgB(new InterfaceC678050Qih() { // from class: X.0Qfz
            @Override // X.InterfaceC678050Qih
            public final C679100QkO LIZ() {
                return this.LIZ.LJFF;
            }
        }, new InterfaceC677920QiU() { // from class: X.0Qfx
            @Override // X.InterfaceC677920QiU
            public final Map<String, Object> Su(Map<String, String> map) {
                return null;
            }

            @Override // X.InterfaceC677920QiU
            public final void sv(String str) {
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.0956] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0956] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final AnonymousClass0956 LJ(EnumC675700Qeu enumC675700Qeu, EnumC676230Qfl enumC676230Qfl, C674850QdX c674850QdX, Map map, boolean z) {
        C678130Qip c678130QipLIZLLL;
        C678140Qiq c678140Qiq;
        String str;
        int iIntValue;
        C678140Qiq c678140Qiq2;
        MixPageViewModel mixPageViewModel;
        ?? LJ = 0;
        ?? r8 = 0;
        try {
            this.LJIIIZ = enumC675700Qeu;
            this.LJIIIIZZ = enumC676230Qfl;
            if (map != null) {
                this.LJIIJ = map;
            }
            if ((enumC675700Qeu == EnumC675700Qeu.FULL_PAGE_REFRESH || enumC675700Qeu == EnumC675700Qeu.FIRST_SCREEN) && (c678130QipLIZLLL = LIZLLL()) != null && (c678140Qiq = c678130QipLIZLLL.LJII) != null) {
                c678140Qiq.LJFF();
            }
            C675150Qe1 c675150Qe1 = new C675150Qe1(ECSearchVerticalChunkSizeListSettings.LIZ().chunkSizeList.toString(), EcSearchMixApi.LIZ, LIZIZ(), LJ, c674850QdX, 8);
            c675150Qe1.LIZ = 0L;
            int i = 0;
            c675150Qe1.LIZIZ = 0;
            if (z) {
                i = 1;
            }
            c675150Qe1.LJIIJ = i;
            c675150Qe1.LJIIJJI = map;
            c675150Qe1.LIZJ = enumC675700Qeu.getValue();
            c675150Qe1.LJIIIZ = enumC676230Qfl.getValue();
            C678130Qip c678130QipLIZLLL2 = LIZLLL();
            String str2 = "";
            if (c678130QipLIZLLL2 == null || (c678140Qiq2 = c678130QipLIZLLL2.LJII) == null || (mixPageViewModel = c678140Qiq2.LJIIL) == null || (str = mixPageViewModel.LL) == null) {
                str = "";
            }
            c675150Qe1.LJIIIIZZ = str;
            if (LIZLLL() == null) {
                return null;
            }
            Context context = this.LJI.getContext();
            if (context != null) {
                if (enumC676230Qfl == EnumC676230Qfl.USER_INTERACTION_TYPE_FIRST_REQUEST) {
                    C676810Qgh.LIZ.getClass();
                    C676820Qgi c676820QgiLIZLLL = C676810Qgh.LIZLLL(1804085333);
                    if (c676820QgiLIZLLL != null) {
                        Integer num = c674850QdX.rootEnterFromType;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        c676820QgiLIZLLL.LJIIL = iIntValue;
                        String str3 = c674850QdX.searchSource;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        c676820QgiLIZLLL.LJIILIIL = str2;
                        c676820QgiLIZLLL.LJIIZILJ = this.LJI.LLJJJJJIL ? 1 : 0;
                        c676820QgiLIZLLL.LIZJ = "photo_search_result";
                    }
                }
                C678130Qip c678130QipLIZLLL3 = LIZLLL();
                InterfaceC677290QhT interfaceC677290QhT = new InterfaceC677290QhT() { // from class: X.0QfH
                    @Override // X.InterfaceC677290QhT
                    public final void onStart() {
                        this.LIZ.LJI.LLJJJJJIL = true;
                    }

                    @Override // X.InterfaceC677290QhT
                    public final void LIZ(C675270QeD c675270QeD, C1422405hW c1422405hW) {
                        Integer numValueOf;
                        n nVar;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PhotoSearchInitHelper network request succeeded, requestKey=");
                        sbLIZ.append(c675270QeD.hashCode());
                        sbLIZ.append(", items count=");
                        List<? extends AbstractC677840QiM> list = c1422405hW.LIZIZ;
                        String strLIZJ = null;
                        if (list != null) {
                            numValueOf = Integer.valueOf(list.size());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", searchId=");
                        EComSearchBffResp eComSearchBffResp = c1422405hW.LIZ;
                        if (eComSearchBffResp != null && (nVar = eComSearchBffResp.globalDoodleConfig) != null) {
                            strLIZJ = C2399609ak.LIZJ(nVar, "search_id");
                        }
                        sbLIZ.append(strLIZJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LIZ.LJI.getClass();
                        C675670Qer c675670Qer = this.LIZ;
                        PhotoSearchBaseVM photoSearchBaseVM = c675670Qer.LIZLLL;
                        if (photoSearchBaseVM != null && !photoSearchBaseVM.LLJJ) {
                            photoSearchBaseVM.LLJJIJIIJIL = 3L;
                        }
                        c675670Qer.LJ.wQ2();
                    }

                    @Override // X.InterfaceC677290QhT
                    public final void LIZIZ(C675270QeD c675270QeD, C676770Qgd c676770Qgd) {
                        String message;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PhotoSearchInitHelper network request failed, requestKey=");
                        sbLIZ.append(c675270QeD.hashCode());
                        sbLIZ.append(", error=");
                        Throwable th = c676770Qgd.LIZJ;
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LIZ.LJI.getClass();
                        PhotoSearchBaseVM photoSearchBaseVM = this.LIZ.LIZLLL;
                        if (photoSearchBaseVM != null) {
                            photoSearchBaseVM.yQ2(c676770Qgd);
                        }
                        this.LIZ.LJ.wQ2();
                    }
                };
                C678140Qiq c678140Qiq3 = c678130QipLIZLLL3.LJII;
                if (c678140Qiq3 == null) {
                    return null;
                }
                LJ = c678140Qiq3.LJ(context, c675150Qe1, interfaceC677290QhT);
                return LJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            r8 = LJ;
        }
        return r8;
    }

    public C675670Qer(View view, LinearLayout linearLayout, LifecycleOwner lifecycleOwner, PhotoSearchBaseVM photoSearchBaseVM, MixShopSearchBizVM mixShopSearchBizVM, C679100QkO c679100QkO, MixPhotoSearchAssem mixPhotoSearchAssem) {
        this.LIZ = view;
        this.LIZIZ = linearLayout;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = photoSearchBaseVM;
        this.LJ = mixShopSearchBizVM;
        this.LJFF = c679100QkO;
        this.LJI = mixPhotoSearchAssem;
    }
}
