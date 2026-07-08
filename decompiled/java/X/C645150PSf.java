package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.music.model.FullSongUrlStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.tiktok.forestx.RequestParamsX;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0PSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$updateTopBarData$1", f = "SearchJediMixFeedFragment.kt", l = {}, m = "invokeSuspend")
public final class C645150PSf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchJediMixFeedFragment LL;
    public final /* synthetic */ SearchTopBarStruct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C645150PSf(SearchJediMixFeedFragment searchJediMixFeedFragment, SearchTopBarStruct searchTopBarStruct, InterfaceC1364105Vn<? super C645150PSf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchJediMixFeedFragment;
        this.LLILLJJLI = searchTopBarStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C645150PSf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        DynamicPatch dynamicPatch;
        Forest forest;
        List<FullSongUrlStruct> preloadImages;
        String str;
        List<FullSongUrlStruct> preloadImages2;
        String str2;
        C1C7U.LIZ("SearchJediMixFeedFragment@aa43.updateTopBarData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchJediMixFeedFragment searchJediMixFeedFragment = this.LL;
        SearchTopBarStruct searchTopBarStruct = this.LLILLJJLI;
        if (searchTopBarStruct != null) {
            dynamicPatch = searchTopBarStruct.dynamicPatch;
        } else {
            dynamicPatch = null;
        }
        searchJediMixFeedFragment.getClass();
        if (!C0BCI.LIZ()) {
            if (C1535630q41.LJJIII) {
                C1532680pzG.LIZ.getClass();
                C1532950pzh c1532950pzh = C1532680pzG.LJJ;
                if (dynamicPatch != null && (preloadImages2 = dynamicPatch.getPreloadImages()) != null) {
                    Iterator<FullSongUrlStruct> it2 = preloadImages2.iterator();
                    while (it2.hasNext()) {
                        List<String> urlList = it2.next().getUrlList();
                        if (urlList != null && (str2 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                            RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_IMAGE, null, 2, null);
                            requestParamsX.source = "search-image-optimization";
                            c1532950pzh.LIZJ(str2, requestParamsX, null);
                        }
                    }
                }
            } else {
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("search-image-optimization");
                    sbLIZ.append(C1017903yT.LIZ());
                    C1533900q1E c1533900q1E = new C1533900q1E(forest, C2188811AlT.LIZIZ(sbLIZ), false, 4);
                    if (dynamicPatch != null && (preloadImages = dynamicPatch.getPreloadImages()) != null) {
                        Iterator<FullSongUrlStruct> it3 = preloadImages.iterator();
                        while (it3.hasNext()) {
                            List<String> urlList2 = it3.next().getUrlList();
                            if (urlList2 != null && (str = (String) C13LP.LJJJLZIJ(0, urlList2)) != null) {
                                RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_IMAGE);
                                requestParams.enableMemoryCache = Boolean.TRUE;
                                c1533900q1E.LJFF(str, requestParams, false, null);
                            }
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchJediMixFeedFragment@aa43.updateTopBarData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
