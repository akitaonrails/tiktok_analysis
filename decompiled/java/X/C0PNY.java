package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS21S0101000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.config.DiffRefreshThresholdConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.utils.SearchTopResultRequestObserverUtils;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PatchConfig;
import com.ss.android.ugc.aweme.search.performance.core.model.CardStreamInfo;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PNY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PNY extends C0PN8 {
    public C0POK LLLF;
    public transient boolean LLLFFI;
    public transient boolean LLLII;
    public transient boolean LLLIIII;
    public transient boolean LLLIIIIL;
    public transient long LLLIIL;
    public transient boolean LLLIL;
    public SearchMixFeed LLLILZ;
    public boolean LLLILZJ;
    public transient boolean LLLILZLLLI;
    public SearchMixFeedList LLLIZZ;
    public volatile transient boolean LLLJIL;
    public volatile transient boolean LLLJL;
    public volatile boolean LLLL;
    public volatile boolean LLLLII;
    public volatile boolean LLLLIIIILLL;
    public volatile boolean LLLLIIL;
    public volatile int LLLLIILL;
    public C643810PNb LLLLIILLL;
    public long LLLLIL;
    public long LLLLILI;
    public boolean LLLLJ;
    public int LLLLJI;
    public List<SearchMixFeed> LLLLL;
    public SearchMixFeed LLLLLIL;
    public final boolean LLLLLILLIL;
    public final boolean LLLLLJIL;
    public final boolean LLLLLJLJLL;
    public final int LLLLLL;
    public volatile C643830PNd LLLLLLIL;
    public final C644000PNu LLLLLLJ;
    public final Set<String> LLLLLLL;
    public final Boolean LLLLLLLLL;
    public int LLLFF = -1;
    public transient boolean LLLFZ = true;
    public transient boolean LLLI = true;
    public transient boolean LLLIIIL = true;
    public transient boolean LLLIILIL = true;
    public volatile transient boolean LLLJ = true;

    private boolean LJJIJIIJI() {
        SearchResultParam searchResultParam = this.LLILZ;
        return searchResultParam != null && searchResultParam.getEnterMethod() != null && "entity_switch".equals(searchResultParam.getEnterMethod()) && searchResultParam.getFilterOption() == null;
    }

    @Override // X.C0PN8
    public final void LJJJI() {
        if (((Number) C1102204Su.LIZ.getValue()).intValue() != 1) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (((Number) C1102104St.LIZ.getValue()).intValue() == 1) {
                    LJJJJL();
                } else {
                    this.mData = null;
                }
                this.LLLLL = null;
                return;
            }
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam = this.LLILZ;
            c644060POa.getClass();
            C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
            c0po5LJII.getClass();
            if (Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ)) {
                return;
            }
            c0po5LJII.LJLLJ = 1;
        }
    }

    @Override // X.C0PN8
    public final void LJJJIL() {
        if (this.LLLLLLIL != null) {
            C643830PNd c643830PNd = this.LLLLLLIL;
            if (!c643830PNd.LJIIIIZZ || c643830PNd.LJFF) {
                return;
            }
            c643830PNd.LIZIZ();
        }
    }

    @Override // X.C0PN8
    public final boolean LJJJJJ() {
        C0POK c0pok;
        C0PO2 c0po2;
        boolean z = false;
        if (this.LLLFF == 1) {
            C644000PNu c644000PNu = this.LLLLLLJ;
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam = this.LLILZ;
            c644060POa.getClass();
            C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
            c644000PNu.getClass();
            if (((Boolean) C284440BCw.LIZ.getValue()).booleanValue() && (c0pok = c644000PNu.LIZ) != null && (c0po2 = (C0PO2) c0pok.LLLILZLLLI.getValue()) != null && c0po2.LIZ) {
                z = true;
                c0po5LJII.getClass();
                if (!Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ)) {
                    c0po5LJII.LLIIIILZ = 2;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJZI() {
        List<SearchMixFeed> list;
        C640570PAp c640570PAp = this.LLJLILLLLZIIL;
        if (c640570PAp != null) {
            c640570PAp.LIZ((SearchMixFeedList) this.mData);
        }
        LJJLIIIJLJLI((SearchMixFeedList) this.mData);
        if (C0BR8.LIZ()) {
            if (((Number) C271030Ajl.LIZ.getValue()).intValue() == 1) {
                int i = this.LLJJJJ;
                SearchMixFeedList searchMixFeedList = (SearchMixFeedList) this.mData;
                int i2 = this.LLLLJI;
                SearchMixFeedList searchMixFeedList2 = new SearchMixFeedList();
                searchMixFeedList2.mItems = (searchMixFeedList == null || (list = searchMixFeedList.mItems) == null) ? null : C13LP.LJJJJIZL(list, i2);
                C0NMU.LIZ.getClass();
                C0NMT.LIZ(i, false, false, searchMixFeedList2);
            } else {
                int i3 = this.LLJJJJ;
                SearchMixFeedList searchMixFeedList3 = (SearchMixFeedList) this.mData;
                C0NMU.LIZ.getClass();
                C0NMT.LIZ(i3, false, false, searchMixFeedList3);
            }
        }
        this.LLLLIILLL.LJJIII();
        C0PIR.LIZ(Integer.valueOf(this.LLJJJJ));
        LJJJJZ((SearchMixFeedList) this.mData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJZ() {
        Long l;
        List<SearchMixFeed> list;
        List<SearchMixFeed> list2;
        Long l2;
        GlobalDoodleConfig globalDoodleConfig;
        C0POK c0pok = this.LLLF;
        this.LLLF = null;
        this.LLIZLLLIL = null;
        C644210POp.LIZ.getClass();
        C644210POp.LJFF.LIZIZ();
        int iLJIJJLI = C644560PPy.LJIJJLI();
        if (iLJIJJLI >= 0) {
            C0PYW.LIZ(iLJIJJLI);
        }
        T t = this.mData;
        if (t == 0 || !((SearchMixFeedList) t).LLJILLL.booleanValue() || this.LLLII || ((SearchMixFeedList) this.mData).mItems == null) {
            this.mIsLoading = false;
            this.LLJI = false;
        }
        SearchApiResult searchApiResult = (SearchApiResult) this.mData;
        if (searchApiResult == null || (globalDoodleConfig = searchApiResult.globalDoodleConfig) == null || globalDoodleConfig.getForbidSearchType() == C0PGA.DEFAULT.getType()) {
            T t2 = this.mData;
            if (t2 == 0 || (list2 = ((SearchMixFeedList) t2).mItems) == null || list2.size() == 0) {
                if (c0pok != null && (l = c0pok.LLLIL) != null) {
                    C0PP3.LIZJ(0, c0pok.LLILLJJLI, "stream", l, "success");
                }
                C0POL c0pol = C0POL.LIZ;
                EnumC643900PNk enumC643900PNk = EnumC643900PNk.EMPTY_LIST;
                c0pol.getClass();
                C0POL.LIZ(false, enumC643900PNk, null);
                this.LLLLIILLL.LJIJJLI(2, null);
                C644060POa c644060POa = C644060POa.LIZ;
                SearchResultParam searchResultParam = this.LLILZ;
                c644060POa.getClass();
                C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
                c0po5LJII.LJIL(1);
                c0po5LJII.LJIIZILJ = 1;
            } else {
                if (c0pok != null && (l2 = c0pok.LLLIL) != null) {
                    C0PP3.LIZJ(Integer.valueOf(((SearchMixFeedList) this.mData).mItems.size()), c0pok.LLILLJJLI, "stream", l2, "success");
                }
                C0POL.LIZ.getClass();
                C0POL.LIZ(true, null, null);
                this.LLLLIILLL.LJIJJLI(0, null);
            }
            if (this.LLLLLLIL != null) {
                C0P5B.LIZJ = ((ConcurrentLinkedQueue) this.LLLLLLIL.LIZJ).size();
                Iterator it2 = ((CopyOnWriteArrayList) this.LLLLLLIL.LJ).iterator();
                while (it2.hasNext()) {
                    C0P5B.LJ.append((String) it2.next());
                }
            }
            T t3 = this.mData;
            if (t3 != 0 && (list = ((SearchMixFeedList) t3).mItems) != null && (list.size() != 0 || (((SearchMixFeedList) this.mData).mItems.size() == 0 && ((SearchApiResult) this.mData).dynamicHeader != null))) {
                C643810PNb c643810PNb = this.LLLLIILLL;
                SearchMixFeedList searchMixFeedList = (SearchMixFeedList) this.mData;
                InterfaceC643820PNc interfaceC643820PNc = (InterfaceC643820PNc) c643810PNb.LLILLJJLI;
                if (interfaceC643820PNc != null) {
                    interfaceC643820PNc.OX0(searchMixFeedList);
                }
            }
            T t4 = this.mData;
            if (t4 != 0 && ((SearchMixFeedList) t4).LLJILJILJ.booleanValue()) {
                LJJJJZ((SearchMixFeedList) this.mData);
                LJJLJLI((SearchMixFeedList) this.mData);
            }
            T t6 = this.mData;
            if (t6 == 0 || !((SearchMixFeedList) t6).LLJILLL.booleanValue() || ((SearchMixFeedList) this.mData).mItems == null || this.LLLII) {
                return;
            }
            this.mIsLoading = false;
            this.LLJI = false;
            LJJJJZI();
        }
    }

    public C0PNY() {
        C0P5M.LIZ.getClass();
        this.LLLLLILLIL = C0P5M.LIZ().removePredictFullFill == 1;
        this.LLLLLJIL = ((Number) C0BDF.LIZ.getValue()).intValue() == 1;
        this.LLLLLJLJLL = ((Number) C1101704Sp.LIZ.getValue()).intValue() == 1;
        this.LLLLLL = ((Number) C1101904Sr.LIZ.getValue()).intValue();
        this.LLLLLLIL = null;
        this.LLLLLLJ = new C644000PNu();
        this.LLLLLLL = Collections.synchronizedSet(new HashSet());
        ((ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class)).LJII();
        this.LLLLLLLLL = Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJL() {
        List<SearchMixFeed> list;
        LJIIL();
        T t = this.mData;
        if (t != 0 && (list = ((SearchMixFeedList) t).mItems) != null) {
            list.clear();
        }
        this.mData = null;
        InterfaceC643820PNc interfaceC643820PNc = (InterfaceC643820PNc) this.LLLLIILLL.LLILLJJLI;
        if (interfaceC643820PNc != null) {
            interfaceC643820PNc.clearCache();
        }
        this.LLLLIILLL.LJJIJIIJI(null);
    }

    public static void LJJJJLI(SearchMixFeedList searchMixFeedList) {
        PatchConfig patchConfig;
        if (searchMixFeedList != null && (patchConfig = searchMixFeedList.patchConfig) != null && patchConfig.LJFF) {
            ChunkPatch chunkPatch = (ChunkPatch) ListProtector.get(searchMixFeedList.patchs, 0);
            ArrayList arrayList = new ArrayList();
            if ("reorder".equals(chunkPatch.op)) {
                ArrayList arrayList2 = (ArrayList) chunkPatch.value;
                if (arrayList2 != null) {
                    for (Object obj : arrayList2) {
                        if (obj instanceof Double) {
                            arrayList.add(Integer.valueOf(((Double) obj).intValue()));
                        }
                    }
                }
                searchMixFeedList.patchConfig.LIZ = arrayList;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJLIIIJLLLLLLLZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r7) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PNY.LJJLIIIJLLLLLLLZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }

    @Override // X.C0PN8
    public final void LJJIJIIJIL(List<SearchMixFeed> list) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "search_scrolling_video_chunk_prefetch_optimization", true, false) && !list.isEmpty()) {
            for (SearchMixFeed searchMixFeed : list) {
                if (searchMixFeed != null && searchMixFeed.getFeedType() == 65280 && searchMixFeed.getAweme() != null) {
                    C643950PNp.LIZ(searchMixFeed.getAweme());
                }
            }
        }
    }

    @Override // X.C0PN8
    public final void LJJJJIZL(Boolean bool) {
        if (this.LLLLLLIL != null) {
            this.LLLLLLIL.LJFF = bool.booleanValue();
            if (bool.booleanValue()) {
                this.LLLLLLIL.LIZIZ();
            }
        }
    }

    public final void LJJJJJL(SearchMixFeedList searchMixFeedList) {
        List<ChunkPatch> list;
        ChunkPatch chunkPatch;
        ArrayList arrayList;
        if (searchMixFeedList != null && (list = searchMixFeedList.patchs) != null && (chunkPatch = (ChunkPatch) ListProtector.get(list, 0)) != null && "reorder".equals(chunkPatch.op)) {
            Object obj = chunkPatch.value;
            if ((obj instanceof ArrayList) && (arrayList = (ArrayList) obj) != null && !arrayList.isEmpty()) {
                C644060POa c644060POa = C644060POa.LIZ;
                SearchResultParam searchResultParam = this.LLILZ;
                c644060POa.getClass();
                C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
                c0po5LJII.getClass();
                if (!Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ)) {
                    c0po5LJII.LJJIIJ = 1;
                }
            }
        }
    }

    public final SearchMixFeed LJJJJLL(SearchMixFeedList searchMixFeedList) {
        SearchMixFeed searchMixFeed;
        if (this.mListQueryType != 1) {
            return null;
        }
        if (LJJIJIIJI() && ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLLLIIL == 0) {
            searchMixFeed = this.LLLLLIL;
        } else {
            searchMixFeed = null;
        }
        List<SearchMixFeed> list = searchMixFeedList.mItems;
        if (list != null) {
            for (SearchMixFeed searchMixFeed2 : list) {
                if (searchMixFeed2.getEntityCard() != null && searchMixFeed2.getEntityCard().topCardInfo != null && searchMixFeed2.getEntityCard().topCardInfo.isViralSong() && searchMixFeed2.getFeedType() == 200 && C642140PGq.LIZIZ(searchMixFeed2.getEntityCard())) {
                    if (!LJJIJIIJI()) {
                        this.LLLLLIL = searchMixFeed2;
                    }
                    searchMixFeed = null;
                }
            }
        }
        return searchMixFeed;
    }

    public final void LJJJJZ(SearchMixFeedList searchMixFeedList) {
        this.LLLLIILLL.LJJIJIL();
        LJJLIIIJJI(searchMixFeedList);
        handleData(searchMixFeedList);
        this.LLLLIILLL.LJJIIZ();
        LJJLIL(0);
        List<InterfaceC1526205yG> list = this.mNotifyListeners;
        if (list != null) {
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [T, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList] */
    public final synchronized void LJJJLIIL(SearchMixFeedList searchMixFeedList) {
        boolean z;
        K k;
        boolean z2;
        List<ChunkPatch> list;
        ?? r0;
        if (LJJLIIIIJ(searchMixFeedList)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLILZ;
        c644060POa.getClass();
        C644060POa.LJII(searchResultParam).LJIIIIZZ(searchMixFeedList.LLJ, System.currentTimeMillis());
        this.LLLLIILLL.LJIL();
        if (searchMixFeedList.resultStatus == 10) {
            LJJLIIIJLJLI(searchMixFeedList);
            T t = this.mData;
            if (t != 0 && ((SearchMixFeedList) t).mItems != null && ((SearchMixFeedList) t).mItems.size() > 0) {
                Iterator<SearchMixFeed> it2 = ((SearchMixFeedList) this.mData).mItems.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SearchMixFeed next = it2.next();
                    C649470Pdh.LIZ.getClass();
                    if (C649470Pdh.LJIL(next)) {
                        if (!C649470Pdh.LJIL((SearchMixFeed) ListProtector.get(searchMixFeedList.mItems, 0))) {
                            HashMap map = new HashMap();
                            map.put("fail_reason", "chunk_data_invalid");
                            C1202104n5.LIZ().LJJIIZI(null, "fail", map);
                        } else {
                            ((SearchMixFeed) ListProtector.get(searchMixFeedList.mItems, 0)).getDynamicPatch().isEcomExtraChunk = Boolean.TRUE;
                            next.setDynamicPatch(((SearchMixFeed) ListProtector.get(searchMixFeedList.mItems, 0)).getDynamicPatch());
                            C1202104n5.LIZ().LJJIIZI(((SearchMixFeed) ListProtector.get(searchMixFeedList.mItems, 0)).getDynamicPatch(), "receive_extra_chunk", new HashMap());
                        }
                        this.LLLLIILLL.LJJ(next);
                    }
                }
                return;
            }
            C644060POa.LJII(this.LLILZ).LJIIZILJ = 5;
            return;
        }
        if (this.LLLLLLLLL.booleanValue() && searchMixFeedList.resultStatus == 9) {
            Gson gson = ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
            ISearchDebugService iSearchDebugService = (ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class);
            GsonProtectorUtils.toJson(gson, searchMixFeedList);
            GsonProtectorUtils.toJson(gson, this.mData);
            iSearchDebugService.LJ();
            return;
        }
        if (searchMixFeedList.extra != null) {
            C0PO5 c0po5LJII = C644060POa.LJII(this.LLILZ);
            c0po5LJII.LJIJJ(Long.valueOf(searchMixFeedList.extra.server_stream_time));
            c0po5LJII.LIZJ(searchMixFeedList.extra.f335dc);
        }
        if (this.LLLFF != 5 && !this.LLLIIIIL) {
            SearchMixFeed searchMixFeedLJJJJLL = LJJJJLL(searchMixFeedList);
            C644210POp.LIZ.getClass();
            C644210POp.LIZLLL().LJ(Integer.valueOf(searchMixFeedList.ack));
            int i = searchMixFeedList.resultStatus;
            if (i == 2) {
                this.LLJL = 0;
                C0PFX.LIZ.getClass();
                this.LLJL = C0PFX.LIZLLL(searchMixFeedList, 0, true);
                this.LLLLL = new LinkedList(searchMixFeedList.mItems);
                LJJLIIIJILLIZJL(0, searchMixFeedList);
                this.LLLFFI = true;
                C644210POp.LJ().LJFF = true;
                LJJLIL(1);
                LJJLIIIJLJLI(searchMixFeedList);
                C640570PAp c640570PAp = this.LLJLILLLLZIIL;
                if (c640570PAp != null) {
                    c640570PAp.LIZ(searchMixFeedList);
                }
                if (this.LLLLLILLIL) {
                    searchMixFeedList.mItems = LJJLIIJ(searchMixFeedList, Collections.emptyList());
                }
                T t2 = this.mData;
                if (t2 != 0) {
                    searchMixFeedList.LLJJIII = ((SearchMixFeedList) t2).LLJJIII;
                }
                this.mData = searchMixFeedList;
                if (searchMixFeedList.LLJJIII) {
                    this.LLLIZZ = searchMixFeedList;
                }
                LJJJ(searchMixFeedList);
                this.LLLLIILLL.LJJIJIIJI(searchMixFeedList.globalDoodleConfig);
                SearchHubEntityCard.handleNativeHubData((SearchMixFeedList) this.mData, searchMixFeedLJJJJLL);
                if (C301130BrD.LIZ()) {
                    LJJIJ((SearchMixFeedList) this.mData);
                }
                this.LLLLIILLL.LJJIIJ();
                return;
            }
            if (i != 20 && i != 40 && searchMixFeedList.ack == -1) {
                this.LLLLIILLL.LJIILLIIL();
                LJJJJL();
                if (C301130BrD.LIZ()) {
                    this.LLJLL.LIZ(this.LLILZ);
                }
                C644060POa.LJII(this.LLILZ).LJIIL();
                LJJLIL(2);
                C644060POa.LJFF();
            }
            int i2 = searchMixFeedList.resultStatus;
            if (i2 != 20 && i2 != 40 && 1 != 0 && searchMixFeedList.ack == 0) {
                this.LLLILZJ = true;
                T t3 = this.mData;
                if (t3 != 0 && ((SearchMixFeedList) t3).mItems != null && ((SearchMixFeedList) t3).mItems.size() > 0) {
                    C640570PAp c640570PAp2 = this.LLJLILLLLZIIL;
                    if (c640570PAp2 != null) {
                        c640570PAp2.LIZ((SearchMixFeedList) this.mData);
                    }
                    LJJLIIIJLLLLLLLZ((SearchMixFeedList) this.mData);
                    LJJLJLI((SearchMixFeedList) this.mData);
                    LJJLIIIJJI(searchMixFeedList);
                    C0PO5 c0po5LJII2 = C644060POa.LJII(this.LLILZ);
                    c0po5LJII2.LJJIFFI();
                    if (!Intrinsics.LJFF(c0po5LJII2, C640870PBt.LIZ)) {
                        c0po5LJII2.LJIIL = 1;
                    }
                    if (C07F1.LIZ()) {
                        this.LLLLIILLL.LJJIJIIJIL(1.0f);
                    } else {
                        this.LLLLIILLL.LJJIJIL();
                        this.LLLLIILLL.LJJIIJZLJL();
                    }
                    this.LLLLIILLL.LJJIIZ();
                    this.LLLLIILLL.LJIJJ();
                    LJJLIL(3);
                    this.LLLFZ = false;
                } else {
                    C644060POa.LJII(this.LLILZ).LJIIZILJ = 2;
                    C644210POp.LIZLLL().LIZIZ(6, 6, "chunk hit but no data");
                    return;
                }
            }
            int i3 = searchMixFeedList.resultStatus;
            if (i3 != 20 && i3 != 40) {
                z = true;
            } else {
                z = false;
            }
            if (z && searchMixFeedList.ack == 1) {
                this.LLLILZJ = true;
                C0PO5 c0po5LJII3 = C644060POa.LJII(this.LLILZ);
                c0po5LJII3.getClass();
                C0PO5 c0po5 = C640870PBt.LIZ;
                if (!Intrinsics.LJFF(c0po5LJII3, c0po5)) {
                    c0po5LJII3.LJJJJJL = true;
                }
                C0PO5 c0po5LJII4 = C644060POa.LJII(this.LLILZ);
                String str = searchMixFeedList.reason;
                c0po5LJII4.getClass();
                if (!Intrinsics.LJFF(c0po5LJII4, c0po5)) {
                    c0po5LJII4.LJJLI = str;
                }
                C644060POa.LJFF();
                List<ChunkPatch> list2 = searchMixFeedList.patchs;
                if (list2 != null && list2.size() > 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    LJJJJLI(searchMixFeedList);
                    if (searchMixFeedList.LLJI != 1) {
                        T t4 = this.mData;
                        if (t4 == 0) {
                            return;
                        }
                        ((SearchMixFeedList) t4).mItems = this.LLLLL;
                        C09F4.LIZLLL.LIZJ(C644060POa.LJII(this.LLILZ)).LIZ(this.mData, searchMixFeedList.patchs);
                        T t6 = this.mData;
                        if (t6 == 0 || ((SearchMixFeedList) t6).mItems == null || ((SearchMixFeedList) t6).mItems.size() <= 0) {
                            C644060POa.LJII(this.LLILZ).LJIIZILJ = 4;
                            return;
                        }
                    } else {
                        ((SearchMixFeedList) this.mData).LLJIJIL = true;
                        C09F4.LIZLLL.LIZJ(C644060POa.LJII(this.LLILZ));
                    }
                    this.LLJL = 0;
                    C0PFX c0pfx = C0PFX.LIZ;
                    SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) this.mData;
                    c0pfx.getClass();
                    this.LLJL = C0PFX.LIZLLL(searchMixFeedList2, 0, true);
                    LJJLI(searchMixFeedList, jCurrentTimeMillis2);
                    C0PO5 c0po5LJII5 = C644060POa.LJII(this.LLILZ);
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    c0po5LJII5.getClass();
                    if (!Intrinsics.LJFF(c0po5LJII5, c0po5)) {
                        c0po5LJII5.LLD = jCurrentTimeMillis3;
                    }
                } else {
                    C0PO5 c0po5LJII6 = C644060POa.LJII(this.LLILZ);
                    int value = C09F5.INVALID_PATCH.getValue();
                    c0po5LJII6.getClass();
                    if (!Intrinsics.LJFF(c0po5LJII6, c0po5)) {
                        c0po5LJII6.LJJJJIZL = value;
                    }
                    return;
                }
            }
            if (searchMixFeedList.resultStatus == 20) {
                this.LLLILZJ = true;
                if (searchMixFeedList.cardIndex < 0) {
                    return;
                }
                if (this.mData == 0) {
                    this.mData = searchMixFeedList;
                }
                T t7 = this.mData;
                if (((SearchMixFeedList) t7).mItems == null) {
                    ((SearchMixFeedList) t7).mItems = new LinkedList();
                }
                SearchMixFeedList searchMixFeedList3 = (SearchMixFeedList) this.mData;
                Boolean bool = Boolean.TRUE;
                searchMixFeedList3.LLJILJILJ = bool;
                C644060POa.LJII(this.LLILZ).LJIIJJI();
                C0PO5 c0po5LJII7 = C644060POa.LJII(this.LLILZ);
                c0po5LJII7.getClass();
                C0PO5 c0po52 = C640870PBt.LIZ;
                if (!Intrinsics.LJFF(c0po5LJII7, c0po52)) {
                    c0po5LJII7.LJJJJJL = true;
                }
                C0PO5 c0po5LJII8 = C644060POa.LJII(this.LLILZ);
                String str2 = searchMixFeedList.reason;
                c0po5LJII8.getClass();
                if (!Intrinsics.LJFF(c0po5LJII8, c0po52)) {
                    c0po5LJII8.LJJLI = str2;
                }
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                if (searchMixFeedList.LLJI != 1) {
                    if (this.mData == 0) {
                        return;
                    }
                    List<SearchMixFeed> list3 = this.LLLLL;
                    if (list3 != null && ((LinkedList) list3).size() > 0) {
                        ((SearchMixFeedList) this.mData).mItems = this.LLLLL;
                    }
                    C09F4.LIZLLL.LIZJ(C644060POa.LJII(this.LLILZ)).LIZ(this.mData, searchMixFeedList.patchs);
                    C644060POa.LJII(this.LLILZ).LJIILL(System.currentTimeMillis() - jCurrentTimeMillis4);
                    T t8 = this.mData;
                    if (t8 != 0 && ((SearchMixFeedList) t8).mItems != null && ((SearchMixFeedList) t8).mItems.size() > 0) {
                        this.LLLLL = new LinkedList(((SearchMixFeedList) this.mData).mItems);
                    } else {
                        C644060POa.LJII(this.LLILZ).LJIIZILJ = 4;
                        return;
                    }
                } else {
                    ((SearchMixFeedList) this.mData).LLJIJIL = true;
                    C09F4.LIZLLL.LIZJ(C644060POa.LJII(this.LLILZ));
                }
                this.LLJL = 0;
                C0PFX c0pfx2 = C0PFX.LIZ;
                SearchMixFeedList searchMixFeedList4 = (SearchMixFeedList) this.mData;
                c0pfx2.getClass();
                this.LLJL = C0PFX.LIZLLL(searchMixFeedList4, 0, true);
                int size = ((SearchMixFeedList) this.mData).mItems.size();
                int i4 = searchMixFeedList.cardIndex;
                if (size > i4) {
                    SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(((SearchMixFeedList) this.mData).mItems, i4);
                    searchMixFeed.isReal = true;
                    searchMixFeed.setCardIndex(searchMixFeedList.cardIndex);
                }
                if (searchMixFeedList.dataScope == 2) {
                    SearchMixFeed searchMixFeedLIZIZ = C643840PNe.LIZIZ(searchMixFeedList.cardIndex, (SearchMixFeedList) this.mData);
                    if (searchMixFeedLIZIZ == null) {
                        return;
                    }
                    searchMixFeedLIZIZ.setCardIndex(searchMixFeedList.cardIndex);
                    LJJLIIIJL((SearchMixFeedList) this.mData, searchMixFeedLIZIZ);
                    C643810PNb c643810PNb = this.LLLLIILLL;
                    SearchMixFeedList searchMixFeedList5 = (SearchMixFeedList) this.mData;
                    int i5 = searchMixFeedList.cardIndex;
                    K k2 = c643810PNb.LLILLJJLI;
                    if (k2 != 0) {
                        ((InterfaceC643820PNc) k2).H70(i5, searchMixFeedLIZIZ, searchMixFeedList5);
                    }
                    return;
                }
                int i6 = this.LLLLLL;
                if (i6 > 0 && !searchMixFeedList.display && searchMixFeedList.cardIndex < i6 && !((SearchMixFeedList) this.mData).LLILZLL.booleanValue()) {
                    C644060POa.LJII(this.LLILZ).LJIJJLI(searchMixFeedList.LLJ);
                    ((SearchMixFeedList) this.mData).LLIZ = bool;
                    return;
                }
                if (((SearchMixFeedList) this.mData).LLIZ.booleanValue()) {
                    T t9 = this.mData;
                    ((SearchMixFeedList) t9).LLILZLL = bool;
                    ((SearchMixFeedList) t9).LLIZ = Boolean.FALSE;
                    LJJLI((SearchMixFeedList) t9, jCurrentTimeMillis4);
                    return;
                }
                int size2 = ((SearchMixFeedList) this.mData).mItems.size();
                if (searchMixFeedList.cardIndex == 0) {
                    C644060POa.LJFF();
                    LJJLIIIJLLLLLLLZ((SearchMixFeedList) this.mData);
                    T t10 = this.mData;
                    if (((SearchMixFeedList) t10).mItems != null && !((SearchMixFeedList) t10).mItems.isEmpty()) {
                        C643810PNb c643810PNb2 = this.LLLLIILLL;
                        List<SearchMixFeed> listSubList = ((SearchMixFeedList) this.mData).mItems.subList(0, 1);
                        boolean z3 = this.LLLFZ;
                        K k3 = c643810PNb2.LLILLJJLI;
                        if (k3 != 0) {
                            ((InterfaceC643820PNc) k3).F81(listSubList, z3);
                        }
                        C0QA2.LIZIZ((SearchMixFeedList) this.mData);
                    }
                }
                C640570PAp c640570PAp3 = this.LLJLILLLLZIIL;
                if (c640570PAp3 != null) {
                    c640570PAp3.LIZ((SearchMixFeedList) this.mData);
                }
                LJJLIIIJLJLI((SearchMixFeedList) this.mData);
                LJJJ((SearchMixFeedList) this.mData);
                if (searchMixFeedList.cardIndex == 1 && !((SearchMixFeedList) this.mData).mItems.isEmpty() && ((SearchMixFeedList) this.mData).mItems.size() > searchMixFeedList.cardIndex && C0BR8.LIZ()) {
                    C0NMU.LIZ(this.LLJJJJ, ((SearchMixFeedList) this.mData).mItems.subList(0, searchMixFeedList.cardIndex + 1));
                }
                T t11 = this.mData;
                ((SearchMixFeedList) t11).patchConfig = searchMixFeedList.patchConfig;
                if (searchMixFeedList.LLJI != 1) {
                    SearchHubEntityCard.handleNativeHubData((SearchMixFeedList) t11, searchMixFeedLJJJJLL);
                }
                if (C301130BrD.LIZ()) {
                    this.LLJLL.LIZ(this.LLILZ);
                }
                if (C301130BrD.LIZ()) {
                    LJJIJ((SearchMixFeedList) this.mData);
                }
                T t12 = this.mData;
                ((SearchMixFeedList) t12).display = searchMixFeedList.display;
                this.LLLLIILLL.LJJII((SearchMixFeedList) t12, searchMixFeedList.cardIndex, searchMixFeedList.LLJ, size2);
                C644060POa.LJII(this.LLILZ).LJI(System.currentTimeMillis() - jCurrentTimeMillis);
            }
            if (searchMixFeedList.resultStatus == 40) {
                this.LLLILZJ = true;
                if (this.mData == 0) {
                    this.mData = searchMixFeedList;
                    this.LLLIL = true;
                }
                T t13 = this.mData;
                if (((SearchMixFeedList) t13).mItems == null) {
                    ((SearchMixFeedList) t13).mItems = new LinkedList();
                }
                if (((SearchMixFeedList) this.mData).LLJJIII && (r0 = this.LLLIZZ) != 0) {
                    this.mData = r0;
                }
                ((SearchMixFeedList) this.mData).LLJILLL = Boolean.TRUE;
                C644060POa.LJII(this.LLILZ).LJIIJ();
                C0PO5 c0po5LJII9 = C644060POa.LJII(this.LLILZ);
                c0po5LJII9.getClass();
                C0PO5 c0po53 = C640870PBt.LIZ;
                if (!Intrinsics.LJFF(c0po5LJII9, c0po53)) {
                    c0po5LJII9.LJJJJJL = true;
                }
                C0PO5 c0po5LJII10 = C644060POa.LJII(this.LLILZ);
                String str3 = searchMixFeedList.reason;
                c0po5LJII10.getClass();
                if (!Intrinsics.LJFF(c0po5LJII10, c0po53)) {
                    c0po5LJII10.LJJLI = str3;
                }
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                if (searchMixFeedList.LLJI != 1) {
                    if (this.mData == 0) {
                        return;
                    }
                    if (((Number) C1102104St.LIZ.getValue()).intValue() == 1 && ((list = searchMixFeedList.patchs) == null || list.isEmpty())) {
                        C0PO5 c0po5LJII11 = C644060POa.LJII(this.LLILZ);
                        int value2 = C09F5.INVALID_PATCH.getValue();
                        c0po5LJII11.getClass();
                        if (!Intrinsics.LJFF(c0po5LJII11, c0po53)) {
                            c0po5LJII11.LJJJJIZL = value2;
                        }
                        return;
                    }
                    List<SearchMixFeed> list4 = this.LLLLL;
                    if (list4 != null && ((LinkedList) list4).size() > 0) {
                        ((SearchMixFeedList) this.mData).mItems = this.LLLLL;
                    }
                    C09F4.LIZLLL.LIZJ(C644060POa.LJII(this.LLILZ)).LIZ(this.mData, searchMixFeedList.patchs);
                    C644060POa.LJII(this.LLILZ).LJIILL(System.currentTimeMillis() - jCurrentTimeMillis5);
                    T t14 = this.mData;
                    if (t14 != 0 && ((SearchMixFeedList) t14).mItems != null && ((SearchMixFeedList) t14).mItems.size() > 0) {
                        this.LLLLL = new LinkedList(((SearchMixFeedList) this.mData).mItems);
                    } else {
                        C644060POa.LJII(this.LLILZ).LJIIZILJ = 4;
                        return;
                    }
                } else {
                    ((SearchMixFeedList) this.mData).LLJIJIL = true;
                    C09F4.LIZLLL.LIZJ(C644060POa.LJII(this.LLILZ));
                }
                LJJJJLI(searchMixFeedList);
                LJJJJJL(searchMixFeedList);
                this.LLJL = 0;
                C0PFX c0pfx3 = C0PFX.LIZ;
                SearchMixFeedList searchMixFeedList6 = (SearchMixFeedList) this.mData;
                c0pfx3.getClass();
                this.LLJL = C0PFX.LIZLLL(searchMixFeedList6, 0, true);
                C644060POa.LJFF();
                ((SearchMixFeedList) this.mData).cardFlush = searchMixFeedList.cardFlush;
                List<CardStreamInfo> list5 = searchMixFeedList.cardStreamInfos;
                if (list5 != null) {
                    z2 = false;
                    for (CardStreamInfo cardStreamInfo : list5) {
                        if (((SearchMixFeedList) this.mData).mItems.size() > cardStreamInfo.getCardIndex()) {
                            SearchMixFeed searchMixFeed2 = (SearchMixFeed) ListProtector.get(((SearchMixFeedList) this.mData).mItems, cardStreamInfo.getCardIndex());
                            searchMixFeed2.setCardIndex(cardStreamInfo.getCardIndex());
                            if (cardStreamInfo.getDataScope() == 1 && C0P63.LIZIZ(searchMixFeed2) && searchMixFeed2.getAweme() != null) {
                                C0P63.LIZ().add(searchMixFeed2.getAweme().getAid());
                            }
                        }
                        if (cardStreamInfo.getDataScope() == 2) {
                            SearchMixFeed searchMixFeedLIZIZ2 = C643840PNe.LIZIZ(cardStreamInfo.getCardIndex(), (SearchMixFeedList) this.mData);
                            if (searchMixFeedLIZIZ2 != null) {
                                searchMixFeedLIZIZ2.setCardIndex(cardStreamInfo.getCardIndex());
                                LJJLIIIJL((SearchMixFeedList) this.mData, searchMixFeedLIZIZ2);
                                C643810PNb c643810PNb3 = this.LLLLIILLL;
                                SearchMixFeedList searchMixFeedList7 = (SearchMixFeedList) this.mData;
                                int cardIndex = cardStreamInfo.getCardIndex();
                                K k4 = c643810PNb3.LLILLJJLI;
                                if (k4 != 0) {
                                    ((InterfaceC643820PNc) k4).H70(cardIndex, searchMixFeedLIZIZ2, searchMixFeedList7);
                                }
                                z2 = true;
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    z2 = false;
                }
                ((SearchMixFeedList) this.mData).cardStreamInfos = searchMixFeedList.cardStreamInfos;
                if (z2) {
                    return;
                }
                if (!C270990Ajh.LIZ() && searchMixFeedList.display) {
                    C643840PNe.LIZJ((SearchMixFeedList) this.mData, searchMixFeedList);
                }
                ((SearchMixFeedList) this.mData).LLJJ = Boolean.TRUE;
                if (this.LLLI) {
                    if ((this.LLLIL && C270980Ajg.LIZ()) || (C643840PNe.LIZ(searchMixFeedList) && C271010Ajj.LIZ() && !searchMixFeedList.display)) {
                        LJJJLZIJ((SearchMixFeedList) this.mData);
                        this.LLLIL = false;
                    } else {
                        LJJLI(searchMixFeedList, jCurrentTimeMillis5);
                    }
                }
                if (!this.LLLI) {
                    SearchHubEntityCard.handleNativeHubData((SearchMixFeedList) this.mData, searchMixFeedLJJJJLL);
                    if (C301130BrD.LIZ()) {
                        LJJIJ((SearchMixFeedList) this.mData);
                    }
                    if (searchMixFeedList.cardFlush) {
                        LJJJJZI();
                        this.LLLII = true;
                    } else {
                        this.LLLLIILLL.LJJIJIIJI(((SearchMixFeedList) this.mData).globalDoodleConfig);
                        this.LLLLIILLL.LJJIIZI(((SearchMixFeedList) this.mData).mBacktrace);
                        T t15 = this.mData;
                        SearchMixFeedList searchMixFeedList8 = (SearchMixFeedList) t15;
                        List<SearchTopBarStruct> list6 = ((SearchMixFeedList) t15).topBars;
                        List<SearchTopBarStruct> list7 = searchMixFeedList8.topBars;
                        if (list7 == null) {
                            searchMixFeedList8.topBars = new ArrayList();
                        } else {
                            list7.clear();
                        }
                        if (list6 != null) {
                            searchMixFeedList8.topBars.addAll(list6);
                        }
                    }
                }
                if (searchMixFeedList.firstScreen) {
                    this.LLLI = false;
                }
                this.LLLLJI = ((SearchMixFeedList) this.mData).mItems.size();
            }
            if (searchMixFeedList.resultStatus == 50) {
                if (this.LLLILZJ) {
                    return;
                }
                if (this.mData == 0) {
                    this.mData = searchMixFeedList;
                }
                if (this.LLLFFI) {
                    SearchMixFeedList searchMixFeedList9 = (SearchMixFeedList) this.mData;
                    this.LLLIZZ = searchMixFeedList9;
                    this.mData = searchMixFeedList;
                    searchMixFeedList9.LLJJIII = true;
                }
                ((SearchMixFeedList) this.mData).LLJJIII = true;
                List<SearchMixFeed> list8 = searchMixFeedList.mItems;
                if (list8 != null && list8.size() > 0) {
                    this.LLLILZ = (SearchMixFeed) ListProtector.get(searchMixFeedList.mItems, 0);
                }
                this.LLLLIILLL.LJJI(this.LLLFFI, this.LLLILZ, searchMixFeedList);
            }
            if (searchMixFeedList.resultStatus == 4) {
                this.LLLILZJ = true;
                if (!this.LLLFFI && this.LLLFZ && getItems().size() > 0) {
                    LJJJJL();
                }
                if (this.LLLFFI && this.LLLFF == 1) {
                    LJJJJL();
                    C644060POa c644060POa2 = C644060POa.LIZ;
                    SearchResultParam searchResultParam2 = this.LLILZ;
                    c644060POa2.getClass();
                    C644060POa.LJII(searchResultParam2).LJIIZILJ = 3;
                }
                if (this.LLLFZ) {
                    this.LLJL = 0;
                    C0PFX.LIZ.getClass();
                    this.LLJL = C0PFX.LIZLLL(searchMixFeedList, 0, true);
                } else {
                    C0PFX c0pfx4 = C0PFX.LIZ;
                    int i7 = this.LLJL;
                    c0pfx4.getClass();
                    this.LLJL = C0PFX.LIZLLL(searchMixFeedList, i7, false);
                }
                LJJLIL(4);
                LJJLIIIJLJLI(searchMixFeedList);
                if (this.LLLFZ) {
                    searchMixFeedList.mItems = LJJLIIJ(searchMixFeedList, Collections.emptyList());
                    LJJLIIIJILLIZJL(1, searchMixFeedList);
                    this.mData = searchMixFeedList;
                    SearchHubEntityCard.handleNativeHubData(searchMixFeedList, searchMixFeedLJJJJLL);
                    if (C301130BrD.LIZ()) {
                        LJJIJ((SearchMixFeedList) this.mData);
                    }
                    LJJLIIIJLLLLLLLZ((SearchMixFeedList) this.mData);
                    LJJLJLI((SearchMixFeedList) this.mData);
                    this.LLLLIILLL.LJJIJIIJI(searchMixFeedList.globalDoodleConfig);
                    C643810PNb c643810PNb4 = this.LLLLIILLL;
                    T t16 = c643810PNb4.LL;
                    if (t16 != 0 && (k = c643810PNb4.LLILLJJLI) != 0) {
                        ((InterfaceC643820PNc) k).Fo1((SearchMixFeedList) ((C0PN8) t16).getData());
                    }
                    LJJJJZ((SearchMixFeedList) this.mData);
                    this.LLLFZ = false;
                    if (C086I.LIZIZ(searchMixFeedList.mItems)) {
                        this.LLLLIILLL.LJJIII();
                    }
                    C644060POa c644060POa3 = C644060POa.LIZ;
                    SearchResultParam searchResultParam3 = this.LLILZ;
                    c644060POa3.getClass();
                    C0PO5 c0po5LJII12 = C644060POa.LJII(searchResultParam3);
                    long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis;
                    c0po5LJII12.getClass();
                    if (!Intrinsics.LJFF(c0po5LJII12, C640870PBt.LIZ)) {
                        c0po5LJII12.LLD = jCurrentTimeMillis6;
                    }
                } else if (searchMixFeedList.mItems != null) {
                    LJJLIIIJILLIZJL(2, searchMixFeedList);
                    List<SearchMixFeed> listLJJLIIJ = LJJLIIJ(searchMixFeedList, getItems());
                    searchMixFeedList.mItems = listLJJLIIJ;
                    T t17 = this.mData;
                    if (t17 != 0 && ((SearchMixFeedList) t17).mItems != null) {
                        ((SearchMixFeedList) t17).mItems.addAll(listLJJLIIJ);
                        T t18 = this.mData;
                        ((SearchMixFeedList) t18).mBacktrace = searchMixFeedList.mBacktrace;
                        SearchMixFeedList searchMixFeedList10 = (SearchMixFeedList) t18;
                        List<SearchTopBarStruct> list9 = searchMixFeedList.topBars;
                        List<SearchTopBarStruct> list10 = searchMixFeedList10.topBars;
                        if (list10 == null) {
                            searchMixFeedList10.topBars = new ArrayList();
                        } else {
                            list10.clear();
                        }
                        if (list9 != null) {
                            searchMixFeedList10.topBars.addAll(list9);
                        }
                        ((SearchMixFeedList) this.mData).globalDoodleConfig = searchMixFeedList.globalDoodleConfig;
                    } else {
                        this.mData = searchMixFeedList;
                    }
                    SearchHubEntityCard.handleNativeHubData((SearchMixFeedList) this.mData, searchMixFeedLJJJJLL);
                    if (C301130BrD.LIZ()) {
                        LJJIJ((SearchMixFeedList) this.mData);
                    }
                    if (C0BR8.LIZ()) {
                        int i8 = this.LLJJJJ;
                        C0NMU.LIZ.getClass();
                        C0NMT.LIZ(i8, false, false, searchMixFeedList);
                    }
                    this.LLLLIILLL.LJJIII();
                    LJJJJZ((SearchMixFeedList) this.mData);
                } else {
                    return;
                }
                C644210POp.LIZ.getClass();
                C644210POp.LJ().LJFF = false;
            }
            C644060POa c644060POa4 = C644060POa.LIZ;
            SearchResultParam searchResultParam4 = this.LLILZ;
            c644060POa4.getClass();
            C644060POa.LJII(searchResultParam4).LJLJJI = searchMixFeedList.LLJ;
        }
    }

    public final void LJJJLL(SearchMixFeedList searchMixFeedList) {
        if (searchMixFeedList.patchConfig != null && this.LLLLIIIILLL) {
            searchMixFeedList.patchConfig.LJFF = this.LLLLIIIILLL;
            searchMixFeedList.patchConfig.LJI = this.LLLLIIL;
        }
        if (searchMixFeedList.patchConfig != null) {
            if (!this.LLLL && !this.LLLLII) {
                return;
            }
            searchMixFeedList.patchConfig.LIZIZ = this.LLLL;
            searchMixFeedList.patchConfig.LJ = this.LLLLII;
            searchMixFeedList.patchConfig.getClass();
            searchMixFeedList.patchConfig.LIZLLL = this.LLLLIILL;
            List<ChunkPatch> list = searchMixFeedList.patchs;
            if (list == null || list.size() <= 0) {
                return;
            }
            ChunkPatch chunkPatch = (ChunkPatch) ListProtector.get(searchMixFeedList.patchs, 0);
            Object obj = chunkPatch.value;
            if (!"reorder".equals(chunkPatch.op) || !(obj instanceof ArrayList)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            int i = 0;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (((Double) ListProtector.get(arrayList2, i2)).intValue() == i2) {
                    i++;
                }
                arrayList.add(Integer.valueOf(((Double) ListProtector.get(arrayList2, i2)).intValue()));
            }
            PatchConfig patchConfig = searchMixFeedList.patchConfig;
            patchConfig.LIZJ = i;
            patchConfig.LIZ = arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJLZIJ(SearchMixFeedList searchMixFeedList) {
        K k;
        LJJLIIIJLJLI(searchMixFeedList);
        searchMixFeedList.mItems = LJJLIIJ(searchMixFeedList, Collections.emptyList());
        LJJLIIIJILLIZJL(1, searchMixFeedList);
        SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) this.mData;
        SearchHubEntityCard.handleNativeHubData(searchMixFeedList2, LJJJJLL(searchMixFeedList2));
        if (C301130BrD.LIZ()) {
            LJJIJ((SearchMixFeedList) this.mData);
        }
        LJJLIIIJLLLLLLLZ((SearchMixFeedList) this.mData);
        LJJLJLI((SearchMixFeedList) this.mData);
        this.LLLLIILLL.LJJIJIIJI(searchMixFeedList.globalDoodleConfig);
        C643810PNb c643810PNb = this.LLLLIILLL;
        T t = c643810PNb.LL;
        if (t != 0 && (k = c643810PNb.LLILLJJLI) != 0) {
            ((InterfaceC643820PNc) k).Fo1((SearchMixFeedList) t.getData());
        }
        LJJJJZ((SearchMixFeedList) this.mData);
        this.LLLFZ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJLIIIIJ(SearchMixFeedList searchMixFeedList) {
        GlobalDoodleConfig globalDoodleConfig;
        if (searchMixFeedList != 0 && (globalDoodleConfig = searchMixFeedList.globalDoodleConfig) != null) {
            InterfaceC643820PNc interfaceC643820PNc = (InterfaceC643820PNc) this.LLLLIILLL.LLILLJJLI;
            if (interfaceC643820PNc != null) {
                interfaceC643820PNc.uu2(globalDoodleConfig);
            }
            if (searchMixFeedList.globalDoodleConfig.getForbidSearchType() != C0PGA.DEFAULT.getType()) {
                this.mData = searchMixFeedList;
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJJI(SearchMixFeedList searchMixFeedList) {
        int size;
        String requestId;
        T t;
        List<SearchMixFeed> list;
        C0PQA c0pqa;
        if (this.LLLIIII) {
            return;
        }
        C644210POp.LIZ.getClass();
        C644210POp.LJFF.LIZIZ();
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLILZ;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.getClass();
        C0PO5 c0po5 = C640870PBt.LIZ;
        Intrinsics.LJFF(c0po5LJII, c0po5);
        int i = (int) (this.LLLLILI - this.LLLLIL);
        if (!Intrinsics.LJFF(c0po5LJII, c0po5)) {
            c0po5LJII.LJIIJ = i;
            if (!Intrinsics.LJFF(c0po5LJII, c0po5) && c0po5LJII.LJJIZ <= 0) {
                c0po5LJII.LJJIZ = i;
            }
        }
        T t2 = this.mData;
        if (t2 == 0) {
            size = 0;
        } else {
            size = ((SearchMixFeedList) t2).mItems.size();
        }
        c0po5LJII.LIZIZ(size);
        T t3 = this.mData;
        if (t3 == 0) {
            requestId = "";
        } else {
            requestId = ((SearchApiResult) t3).getRequestId();
        }
        c0po5LJII.LJII(requestId);
        c0po5LJII.LJIJ((InterfaceC1201180hMa) this.mData);
        if (searchMixFeedList != null && (c0pqa = searchMixFeedList.LLILLL) != null && !Intrinsics.LJFF(c0po5LJII, c0po5)) {
            c0po5LJII.LJIJJ = new C0PQA(c0pqa.LIZIZ());
        }
        c0po5LJII.LJIL(0);
        if (!this.LLLLJ && (t = this.mData) != 0 && (list = ((SearchMixFeedList) t).mItems) != null) {
            Iterator<SearchMixFeed> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = it2.next().getAweme();
                if (aweme != null && aweme.isAd()) {
                    C644060POa c644060POa2 = C644060POa.LIZ;
                    SearchResultParam searchResultParam2 = this.LLILZ;
                    c644060POa2.getClass();
                    C0PO5 c0po5LJII2 = C644060POa.LJII(searchResultParam2);
                    c0po5LJII2.getClass();
                    if (!Intrinsics.LJFF(c0po5LJII2, C640870PBt.LIZ)) {
                        c0po5LJII2.LJLI = true;
                    }
                    this.LLLLJ = true;
                }
            }
        }
        this.LLLIIII = true;
    }

    public final void LJJLIIIJLJLI(SearchMixFeedList searchMixFeedList) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (searchMixFeedList != null && searchMixFeedList.LLJILJIL) {
            searchMixFeedList.LLJILJIL = false;
        }
        C0PN8.LJJIJLIJ(searchMixFeedList);
        C0PN8.LJJIJL(searchMixFeedList);
        SearchTopResultRequestObserverUtils.RequestObserversVM requestObserversVM = this.LLL;
        if (requestObserversVM != null) {
            requestObserversVM.RZ1(searchMixFeedList);
        }
        System.currentTimeMillis();
        if (searchMixFeedList != null) {
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam = this.LLILZ;
            c644060POa.getClass();
            C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
            int i = searchMixFeedList.LLJ;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C0PO6 c0po6LJFF = c0po5LJII.LJFF(i);
            if (c0po6LJFF != null) {
                c0po6LJFF.LJ = jCurrentTimeMillis2;
            }
            C0PO5 c0po5LJII2 = C644060POa.LJII(this.LLILZ);
            c0po5LJII2.getClass();
            if (!Intrinsics.LJFF(c0po5LJII2, C640870PBt.LIZ) && c0po5LJII2.LJLJJL < 0) {
                c0po5LJII2.LJLJJL = 0;
            }
        }
    }

    public final void LJJLIL(int i) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.LLLFF = i;
        } else {
            this.mHandler.post(new ARunnableS21S0101000_10(i, this, 11));
        }
    }

    public final void LJJLJ(C15O7 c15o7) {
        if (this.mHandler != null && c15o7 != null) {
            if (!c15o7.LJIILIIL()) {
                if (c15o7.LJIILL()) {
                    this.LLJI = false;
                    LJJLIIIJJIZ(c15o7.LJIIJJI(), c15o7);
                    return;
                }
                return;
            }
            this.LLJI = false;
            LJJLIL(0);
            return;
        }
        this.LLJI = false;
    }

    public final void LJJLJLI(SearchMixFeedList searchMixFeedList) {
        if (C0BR8.LIZ()) {
            int i = this.LLJJJJ;
            C0NMU.LIZ.getClass();
            C0NMT.LIZ(i, true, true, searchMixFeedList);
        }
    }

    public static void LJJLIIIJILLIZJL(int i, SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list;
        if (searchMixFeedList != null && (list = searchMixFeedList.mItems) != null) {
            Iterator<SearchMixFeed> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().chunkID = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLI(SearchMixFeedList searchMixFeedList, long j) {
        C640570PAp c640570PAp = this.LLJLILLLLZIIL;
        if (c640570PAp != null) {
            c640570PAp.LIZ((SearchMixFeedList) this.mData);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLILZ;
        c644060POa.getClass();
        C644060POa.LJII(searchResultParam).LJIILL(jCurrentTimeMillis);
        C0PIR.LIZ(Integer.valueOf(this.LLJJJJ));
        LJJLIIIJLJLI((SearchMixFeedList) this.mData);
        SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) this.mData;
        searchMixFeedList2.mItems = LJJLIIJ(searchMixFeedList2, getItems());
        if (C0PIR.LIZ) {
            C0PIR.LIZ = false;
            C0PO5 c0po5LJII = C644060POa.LJII(this.LLILZ);
            c0po5LJII.getClass();
            if (!Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ)) {
                c0po5LJII.LJLLLL = 1;
            }
        }
        LJJJ((SearchMixFeedList) this.mData);
        this.LLLLIILLL.LJJIJIIJI(((SearchApiResult) this.mData).globalDoodleConfig);
        LJJLIIIJLLLLLLLZ((SearchMixFeedList) this.mData);
        LJJLJLI((SearchMixFeedList) this.mData);
        T t = this.mData;
        if (t != 0) {
            C643810PNb c643810PNb = this.LLLLIILLL;
            List<SearchMixFeed> list = ((SearchMixFeedList) t).mItems;
            boolean z = this.LLLFZ;
            K k = c643810PNb.LLILLJJLI;
            if (k != 0) {
                ((InterfaceC643820PNc) k).F81(list, z);
            }
            C0QA2.LIZIZ((SearchMixFeedList) this.mData);
        }
        SearchMixFeedList searchMixFeedList3 = (SearchMixFeedList) this.mData;
        searchMixFeedList3.patchConfig = searchMixFeedList.patchConfig;
        if (searchMixFeedList.LLJI != 1) {
            SearchHubEntityCard.handleNativeHubData(searchMixFeedList3, LJJJJLL(searchMixFeedList3));
        }
        if (C301130BrD.LIZ()) {
            this.LLJLL.LIZ(this.LLILZ);
        }
        if (((Number) C284180BBw.LIZ.getValue()).intValue() == 1) {
            LJJIJ((SearchMixFeedList) this.mData);
        }
        C643810PNb c643810PNb2 = this.LLLLIILLL;
        if (c643810PNb2.LL != 0 && c643810PNb2.LLILLJJLI != 0 && c643810PNb2.LJIJ().isViewValid()) {
            ((InterfaceC643820PNc) c643810PNb2.LLILLJJLI).TG0((SearchMixFeedList) c643810PNb2.LL.getData());
        }
        C0PQZ c0pqz = C0PQZ.LIZ;
        List<SearchMixFeed> list2 = ((SearchMixFeedList) this.mData).mItems;
        c0pqz.getClass();
        if (((Number) C0BDC.LIZ.getValue()).intValue() == 1) {
            C823050WQl.LJFF().execute(new ARunnableS110S0100000_10(list2, 111));
        }
        C0PO5 c0po5LJII2 = C644060POa.LJII(this.LLILZ);
        c0po5LJII2.LJJIFFI();
        if (!Intrinsics.LJFF(c0po5LJII2, C640870PBt.LIZ)) {
            c0po5LJII2.LJIIL = 1;
        }
        LJJLIIIJJI(searchMixFeedList);
        this.LLLLIILLL.LJIJJ();
        LJJLIL(3);
        this.LLLFZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJIZ(java.lang.Exception r8, X.C15O7<? extends X.C1515820pY4<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList>> r9) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PNY.LJJLIIIJJIZ(java.lang.Exception, X.15O7):void");
    }

    public final void LJJLIIIJL(SearchMixFeedList searchMixFeedList, SearchMixFeed searchMixFeed) {
        if (searchMixFeedList == null) {
            return;
        }
        SearchMixFeedList searchMixFeedList2 = new SearchMixFeedList();
        searchMixFeedList2.LLJILJIL = searchMixFeedList.LLJILJIL;
        searchMixFeedList2.globalDoodleConfig = searchMixFeedList.globalDoodleConfig;
        searchMixFeedList2.LLIZLLLIL = searchMixFeedList.LLIZLLLIL;
        LinkedList linkedList = new LinkedList();
        searchMixFeedList2.mItems = linkedList;
        linkedList.add(searchMixFeed);
        LJJLIIIJLJLI(searchMixFeedList2);
    }

    public final List LJJLIIJ(SearchMixFeedList searchMixFeedList, List list) {
        if (C0A0H.LIZ()) {
            return C0PIR.LJII(list, searchMixFeedList.mItems, this.LLJJJJ, searchMixFeedList.hasMore);
        }
        LinkedList linkedList = new LinkedList(searchMixFeedList.mItems);
        C0PIR.LIZIZ(linkedList, this.LLJJJJ, searchMixFeedList.hasMore);
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // X.C0PN8
    public final void LJJJJ(String str, int i, int i2, int i3, String str2, int i4, C0PSG c0psg, String str3, String str4, Context context, Fragment fragment) {
        String sugUserId;
        String clickUserId;
        int generalSearchSortType;
        String interveneCards;
        String hashtagId;
        long jLongValue;
        long j;
        long visibleModules;
        String songID;
        String appTheme;
        String appName;
        int screenWidth;
        int screenHeight;
        C15O7<C1515820pY4<SearchMixFeedList>> c15o7LIZIZ;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r1;
        ?? r3;
        String enterSearchFrom;
        String string;
        String enterMethod;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        Object next;
        C0X9S<C1515820pY4<SearchMixFeedList>> c0x9sLIZ;
        C15O7 c15o7;
        C19EG c19eg;
        if (i != 0) {
            WeakReference<C19EG> weakReference = this.LLIZ;
            if (weakReference == null) {
                c19eg = null;
            } else {
                c19eg = weakReference.get();
            }
            super.LJJJJ(str, i, i2, i3, str2, i4, c0psg, str3, str4, c19eg, LJIILJJIL());
            return;
        }
        SearchTopResultRequestObserverUtils.RequestObserversVM requestObserversVM = this.LLL;
        if (requestObserversVM != null) {
            requestObserversVM.ip0(this.LLILZ, (SearchMixFeedList) this.mData);
        }
        SearchResultParam searchResultParam = this.LLILZ;
        if (searchResultParam != null) {
            C644060POa.LIZ.getClass();
            C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c0po5LJII.LIZIZ >= 0 && c0po5LJII.LJL == -1) {
                c0po5LJII.LJL = jCurrentTimeMillis;
            }
        }
        LJIIJJI(1, "ChunkV2 new request");
        this.LLJJIJIL = i4;
        this.LL = c0psg;
        SearchResultParam searchResultParam2 = this.LLILZ;
        Object obj = "";
        if (searchResultParam2 == null || searchResultParam2.getSugUserId() == null || this.LLILZ.getSugUserId().equals("")) {
            sugUserId = "";
        } else {
            sugUserId = this.LLILZ.getSugUserId();
        }
        SearchResultParam searchResultParam3 = this.LLILZ;
        if (searchResultParam3 == null || searchResultParam3.getClickUserId() == null || this.LLILZ.getClickUserId().equals("")) {
            clickUserId = "";
        } else {
            clickUserId = this.LLILZ.getClickUserId();
        }
        SearchResultParam searchResultParam4 = this.LLILZ;
        if (searchResultParam4 != null && searchResultParam4.getInterventionVideoIds() != null && !this.LLILZ.getInterventionVideoIds().equals("")) {
            this.LLILZ.getInterventionVideoIds();
        }
        SearchResultParam searchResultParam5 = this.LLILZ;
        if (searchResultParam5 != null) {
            generalSearchSortType = searchResultParam5.getGeneralSearchSortType();
            hashtagId = this.LLILZ.getHashtagId();
            interveneCards = this.LLILZ.getInterveneCards();
        } else {
            generalSearchSortType = 0;
            interveneCards = null;
            hashtagId = null;
        }
        C650960Pg6 c650960Pg6FetchOwnImmutableData = C650950Pg5.fetchOwnImmutableData(fragment, (LifecycleOwner) context);
        if (c650960Pg6FetchOwnImmutableData != null) {
            Long l = c650960Pg6FetchOwnImmutableData.searchSessionModel.searchSessionId;
            if (l == null) {
                jLongValue = 0;
            } else {
                jLongValue = l.longValue();
            }
        } else {
            jLongValue = 10086;
        }
        ISearchContextAbility iSearchContextAbilityLJJIIJZLJL = LJJIIJZLJL();
        if (iSearchContextAbilityLJJIIJZLJL != null) {
            j = ((C0PM7) iSearchContextAbilityLJJIIJZLJL.pR().LIZJ()).LLILLJJLI;
        } else {
            j = 0;
        }
        C0P5B.LIZ = 0;
        C0P5B.LIZIZ = 0;
        C0P5B.LIZJ = 0;
        C0P5B.LIZLLL = 0;
        C0P5B.LJ = new StringBuilder();
        C657900PrI.LIZ.getClass();
        ConcurrentHashMap<String, C644290POx> concurrentHashMap = C657900PrI.LIZJ;
        if (concurrentHashMap.size() > 64) {
            concurrentHashMap.clear();
        }
        C657900PrI.LIZLLL.clear();
        C657900PrI.LJ.set(0);
        C0PO3 c0po3 = new C0PO3();
        C0POK c0pok = c0po3.LIZ;
        c0pok.LLILLJJLI = str;
        c0pok.LLILLL = i;
        c0pok.LLILZ = i2;
        c0pok.LLILZIL = i3;
        c0pok.LLILZLL = str2;
        c0pok.LLIZLLLIL = i4;
        c0po3.LIZ(this.LL);
        String str5 = this.LLJILLL;
        C0POK c0pok2 = c0po3.LIZ;
        c0pok2.LLJI = str5;
        c0pok2.LLJIJIL = this.LLJILJIL;
        SearchResultParam searchResultParam6 = this.LLILZ;
        c0pok2.LL = searchResultParam6;
        c0pok2.LLJJI = str3;
        c0pok2.LLJJIJI = sugUserId;
        if (searchResultParam6 != null && searchResultParam6.getSugIsLiveSug()) {
            c0po3.LIZ.LLJJJ = "1";
        }
        C0POK c0pok3 = c0po3.LIZ;
        c0pok3.LLJJIII = "";
        c0pok3.LLIZ = str4;
        c0po3.LIZ.LLJJLIIIJLLLLLLLZ = Integer.valueOf(generalSearchSortType);
        String strLIZ = C0Q3Q.LIZ(context, LJIILJJIL(), this.LLILZ);
        C0POK c0pok4 = c0po3.LIZ;
        c0pok4.LLJL = strLIZ;
        c0pok4.LLJLIL = hashtagId;
        c0po3.LIZ.LLJLILLLLZIIL = Long.valueOf(jLongValue);
        Long lValueOf = Long.valueOf(j);
        C0POK c0pok5 = c0po3.LIZ;
        c0pok5.LLJLL = lValueOf;
        c0pok5.LLLI = interveneCards;
        SearchResultParam searchResultParam7 = this.LLILZ;
        if (searchResultParam7 == null) {
            visibleModules = 0;
        } else {
            visibleModules = searchResultParam7.getVisibleModules();
        }
        c0po3.LIZ.LLJLLIL = Long.valueOf(visibleModules);
        SearchResultParam searchResultParam8 = this.LLILZ;
        if (searchResultParam8 == null) {
            songID = null;
        } else {
            songID = searchResultParam8.getSongID();
        }
        c0po3.LIZ.LLJLLL = songID;
        SearchResultParam searchResultParam9 = this.LLILZ;
        if (searchResultParam9 != null && searchResultParam9.getIsSongRecognition()) {
            c0po3.LIZ.LLJZ = 1;
        }
        SearchResultParam searchResultParam10 = this.LLILZ;
        if (searchResultParam10 == null) {
            appTheme = "light";
        } else {
            appTheme = searchResultParam10.getAppTheme();
        }
        c0po3.LIZ.LLJZIJLIL = appTheme;
        SearchResultParam searchResultParam11 = this.LLILZ;
        if (searchResultParam11 == null) {
            appName = "";
        } else {
            appName = searchResultParam11.getAppName();
        }
        c0po3.LIZ.LLL = appName;
        SearchResultParam searchResultParam12 = this.LLILZ;
        if (searchResultParam12 == null) {
            screenWidth = 0;
        } else {
            screenWidth = searchResultParam12.getScreenWidth();
        }
        c0po3.LIZ.LLLF = Integer.valueOf(screenWidth);
        SearchResultParam searchResultParam13 = this.LLILZ;
        if (searchResultParam13 == null) {
            screenHeight = 0;
        } else {
            screenHeight = searchResultParam13.getScreenHeight();
        }
        Integer numValueOf = Integer.valueOf(screenHeight);
        final C0POK c0pok6 = c0po3.LIZ;
        c0pok6.LLLFF = numValueOf;
        c0pok6.LLJJIJIIJIL = clickUserId;
        C0POX.LIZ.getClass();
        if (C287930BQh.LIZ()) {
            Iterator it2 = ((HashMap) C0POX.LIZIZ).keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C0POK c0pok7 = (C0POK) next;
                    SearchResultParam searchResultParam14 = c0pok7.LL;
                    if (searchResultParam14 != null && Intrinsics.LJFF(searchResultParam14.getSugIntentPrefetch(), Boolean.TRUE) && !Intrinsics.LJFF(c0pok7.LLILLJJLI, c0pok6.LLILLJJLI)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0POK c0pok8 = (C0POK) next;
            if (c0pok8 != null) {
                Pair pair = (Pair) ((HashMap) C0POX.LIZIZ).get(c0pok8);
                if (pair != null && (c15o7 = (C15O7) pair.getSecond()) != null) {
                    c0x9sLIZ = C643910PNl.LIZ(c15o7);
                } else {
                    c0x9sLIZ = null;
                }
                C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(c0pok8, c0x9sLIZ, 3));
            }
        }
        HashMap map = (HashMap) C0POX.LIZIZ;
        Pair pair2 = (Pair) map.get(c0pok6);
        if (pair2 == null) {
            if (((Number) C0BY6.LIZ.getValue()).intValue() > 0) {
                Iterator it3 = map.keySet().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    C0POK c0pok9 = (C0POK) next2;
                    SearchResultParam searchResultParam15 = c0pok9.LL;
                    if (searchResultParam15 != null && Intrinsics.LJFF(searchResultParam15.getSugIntentPrefetch(), Boolean.TRUE) && Intrinsics.LJFF(c0pok9.LLILLJJLI, c0pok6.LLILLJJLI)) {
                        if (next2 != null) {
                            Object obj2 = ((HashMap) C0POX.LIZIZ).get(next2);
                            if (obj2 instanceof Pair) {
                                pair2 = (Pair) obj2;
                            }
                        }
                    }
                }
            } else {
                pair2 = null;
            }
        }
        C0POX.LIZ.getClass();
        C0POX.LIZIZ(c0pok6);
        if (pair2 == null) {
            c15o7LIZIZ = null;
        } else {
            c0pok6 = (C0POK) pair2.getFirst();
            c15o7LIZIZ = (C15O7) pair2.getSecond();
        }
        this.LLLLJ = false;
        this.LLLLLLL.clear();
        boolean z4 = true;
        this.mIsLoading = true;
        if (((Number) C284430BCv.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLLL = z;
        if (((Number) C272260Alk.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLLLII = z2;
        C0P5O.LIZ.getClass();
        if (C0P5O.LIZ().enableManualDiff == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLLLIIIILLL = z3;
        if (C0P5O.LIZ().preparePlayer != 1) {
            z4 = false;
        }
        this.LLLLIIL = z4;
        C643970PNr.LIZ.getClass();
        C01GW c01gw = C643970PNr.LIZJ;
        this.LLLLIILL = ((DiffRefreshThresholdConfig) c01gw.getValue()).fullyHitThreshold;
        C0P6M c0p6m = C0P6M.LIZ;
        SearchResultParam searchResultParam16 = this.LLILZ;
        c0p6m.getClass();
        if (!C1205904nh.LIZ()) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("page_name", "general_search");
            if (searchResultParam16 == null || (searchEnterParam2 = searchResultParam16.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam2.getEnterSearchFrom()) == null) {
                enterSearchFrom = "";
            }
            pairArr[1] = new Pair("enter_from", enterSearchFrom);
            if (searchResultParam16 == null || (searchEnterParam = searchResultParam16.getSearchEnterParam()) == null || (string = Integer.valueOf(searchEnterParam.getEcSearchEntranceValue()).toString()) == null) {
                string = "";
            }
            pairArr[2] = new Pair("root_enter_from_type", string);
            if (searchResultParam16 == null || (enterMethod = searchResultParam16.getEnterMethod()) == null) {
                enterMethod = "";
            }
            pairArr[3] = new Pair("enter_method", enterMethod);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("rd_tiktokec_search_request_send", mapLJIIJ);
        }
        this.LLLIIL = System.currentTimeMillis();
        if (c15o7LIZIZ == null) {
            c15o7LIZIZ = c0pok6.LIZIZ();
            C665250Q7n c665250Q7n = C665250Q7n.LIZ;
            SearchResultParam searchResultParam17 = this.LLILZ;
            c665250Q7n.getClass();
            C665250Q7n.LIZJ("request", -1, -1, "", searchResultParam17, null, null);
        }
        this.LLLF = c0pok6;
        this.LLIZLLLIL = c0pok6;
        LJJLIL(0);
        this.LLLFZ = true;
        this.LLLFFI = false;
        this.LLLIIII = false;
        this.LLJI = true;
        this.LLLIIIIL = false;
        this.LLLJ = true;
        this.LLLJIL = true;
        this.LLLLLLIL = null;
        this.LLLLL = null;
        if (C07HN.LIZ == 1) {
            r3 = 0;
            C0Q50.LIZ.set(0);
            C0Q50.LIZIZ.set(false);
            r1 = 1;
        } else {
            r1 = 1;
            r3 = 0;
        }
        this.LLLIILIL = r1;
        this.LLLI = r1;
        this.LLLII = r3;
        this.LLLLJI = r3;
        this.LLLILZJ = r3;
        this.LLLILZLLLI = r3;
        C644210POp c644210POp = C644210POp.LIZ;
        c644210POp.getClass();
        C0POF c0pof = C644210POp.LJFF;
        Integer numValueOf2 = Integer.valueOf((int) r1);
        if (c0pof.LIZJ == -1) {
            c0pof.LIZJ = System.currentTimeMillis();
            c0pof.LIZLLL = -1L;
            c644210POp.getClass();
            C644220POq c644220POq = C644210POp.LJ;
            if (c644220POq.LIZJ == null) {
                c644220POq.LIZJ = numValueOf2;
                if (numValueOf2 != null) {
                    obj = numValueOf2;
                }
                c644220POq.LIZ(obj, "request_type");
            }
        }
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam18 = this.LLILZ;
        c644060POa.getClass();
        C0PO5 c0po5LJII2 = C644060POa.LJII(searchResultParam18);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jCurrentTimeMillis2 < 0) {
            c0po5LJII2.getClass();
        } else if (c0po5LJII2.LJJLIIJ == -1) {
            c0po5LJII2.LJJLIIJ = jCurrentTimeMillis2;
        }
        this.LLLLLLJ.LIZ = c0pok6;
        final C15O7 c15o7LJ = C665580Q8u.LIZIZ.LJ(this, c0pok6.LLILLJJLI);
        c15o7LIZIZ.LJII(new InterfaceC2385309Wh() { // from class: X.0PNg
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o72) {
                C0PNY c0pny = this.LIZ;
                C0POK c0pok10 = c0pok6;
                C15O7 c15o73 = c15o7LJ;
                c0pny.getClass();
                C1C7U.LIZ("SearchMixFeedChunkModelV2@5afe.searchMixFeedList$1L");
                InterfaceC643820PNc interfaceC643820PNc = (InterfaceC643820PNc) c0pny.LLLLIILLL.LLILLJJLI;
                if (interfaceC643820PNc != null) {
                    interfaceC643820PNc.clearCache();
                }
                if (c15o72.LJIILL()) {
                    C15O7 c15o7LJIIIZ = C15O7.LJIIIZ(c15o72.LJIIJJI());
                    C1C7U.LIZIZ("SearchMixFeedChunkModelV2@5afe.searchMixFeedList$1L");
                    return c15o7LJIIIZ;
                }
                if (c15o72.LJIILIIL()) {
                    C15O7<?> c15o74 = C15O7.LJIIL;
                    C1C7U.LIZIZ("SearchMixFeedChunkModelV2@5afe.searchMixFeedList$1L");
                    return c15o74;
                }
                c0pny.LLLLIL = System.currentTimeMillis();
                C1515820pY4 c1515820pY4 = (C1515820pY4) c15o72.LJIIL();
                if (c1515820pY4 != null) {
                    c1515820pY4.LIZLLL(new C0PNZ(c0pny, c0pok10, c15o73, c15o72));
                }
                C1C7U.LIZIZ("SearchMixFeedChunkModelV2@5afe.searchMixFeedList$1L");
                return c15o72;
            }
        }, C823050WQl.LIZJ());
    }
}
