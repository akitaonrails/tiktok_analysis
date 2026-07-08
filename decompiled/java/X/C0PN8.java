package X;

import Y.ARunnableS17S0201000_10;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TranslateSearchDesc;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.utils.SearchTopResultRequestObserverUtils;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong.ViralSongCard;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PN8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0PN8 extends C0PN2<SearchMixFeed, SearchMixFeedList> implements C0PDP, C0PDU, C0PDR {
    public int LLJJIJIL;
    public int LLJJJ;
    public String LLJJJJJIL;
    public C0PDV LLJJJJLIIL;
    public C0P5I LLJJL;
    public C0PHT LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public C640570PAp LLJLILLLLZIIL;
    public SearchBackgroundConfig LLJLLL;
    public String LLJJJIL = "";
    public int LLJJJJ = -1;
    public final C0PA4 LLJLL = new C0PA4();
    public SearchMixFeed LLJLLIL = null;
    public final C0PIU LLJZ = new C0PIU();
    public ISearchContextAbility LLJZIJLIL = C0Q3E.LJI();
    public SearchTopResultRequestObserverUtils.RequestObserversVM LLL = null;

    @Override // X.C0PN2
    public final int LJIJ() {
        return 3;
    }

    @Override // X.C0PN2
    public final boolean LJIJJ() {
        return false;
    }

    public void LJJIJIIJIL(List<SearchMixFeed> list) {
    }

    public void LJJJI() {
    }

    public void LJJJIL() {
    }

    public void LJJJJIZL(Boolean bool) {
    }

    public boolean LJJJJJ() {
        return false;
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("bundle=users");
        hashSet.add("bundle=hotspot");
    }

    public final ISearchContextAbility LJJIIJZLJL() {
        return ((Boolean) C07AP.LIZ.getValue()).booleanValue() ? C0Q3E.LJI() : this.LLJZIJLIL;
    }

    public final C0PHT LJJIIZ() {
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            this.LLJJLIIIJLLLLLLLZ = new C0PHT();
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean LJJIJIIJI() {
        SearchResultParam searchResultParam = this.LLILZ;
        return searchResultParam != null && searchResultParam.getEnterMethod() != null && "entity_switch".equals(searchResultParam.getEnterMethod()) && searchResultParam.getFilterOption() == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((SearchMixFeedList) t).hasMore;
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return LJJI(getItems());
    }

    @Override // X.AbstractC1255880imo
    public final void onModelBound() {
        super.onModelBound();
        C0PIF c0pif = C0PIF.LIZ;
        List<SearchMixFeed> items = getItems();
        String str = this.LLJJJJJIL;
        Integer numValueOf = Integer.valueOf(this.LLJJJJ);
        c0pif.getClass();
        C0PIF.LIZLLL(numValueOf, str, items);
        if (((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLLLIIIILLL) {
            C0PIF.LJII(getItems(), this.LLJJJJJIL, this.LLJLIL, new C0PIG() { // from class: X.0PND
                @Override // X.C0PIG
                public final void LIZ(int i) {
                    this.LIZ.LLJLIL = i;
                }
            });
        }
        if (!C0PM4.LIZ() || C1839707Il.LIZ() || C0PM5.LIZIZ(this.LL)) {
            return;
        }
        this.LLJJJJLIIL = new C0PDV(this, this.LLJJJJ);
    }

    public static List<Aweme> LJJI(List<SearchMixFeed> list) {
        SearchMixFeed next;
        boolean z;
        ViralSongCard viralSongCard;
        TakoInfo takoInfo;
        C0PHT c0pht;
        Aweme awemePrevious;
        String aid;
        String aid2;
        SearchMixFeed next2;
        String str = null;
        if (list == null) {
            return null;
        }
        LifecycleOwner lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL();
        ArrayList<Aweme> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (C0BR0.LIZ()) {
            Iterator<SearchMixFeed> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (next2.getFeedType() == 65514 && next2.getDynamicPatch() != null) {
                        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                        String str2 = next2.getDynamicPatch().schema;
                        c649470Pdh.getClass();
                        if (C649470Pdh.LJIIZILJ(str2)) {
                            break;
                        }
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            if (C1603960rqE.LJFF == 71) {
                LJJII(next2, hashSet, arrayList);
                LJJIII(list, hashSet, arrayList, lifecycleOwnerLIZLLL);
            } else {
                LJJIII(list, hashSet, arrayList, lifecycleOwnerLIZLLL);
                LJJII(next2, hashSet, arrayList);
            }
        } else {
            LJJIII(list, hashSet, arrayList, lifecycleOwnerLIZLLL);
        }
        Iterator<SearchMixFeed> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                C649470Pdh c649470Pdh2 = C649470Pdh.LIZ;
                Integer numValueOf = Integer.valueOf(next.getFeedType());
                DynamicPatch dynamicPatch = next.getDynamicPatch();
                c649470Pdh2.getClass();
                if (C649470Pdh.LJIJI(numValueOf, dynamicPatch)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (lifecycleOwnerLIZLLL != null && next != null && (c0pht = ((C639840P7u) C0Q3E.LJ(lifecycleOwnerLIZLLL).jy().LIZJ()).LL) != null && C1603960rqE.LJFF != 65514 && Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            DynamicPatch dynamicPatch2 = next.getDynamicPatch();
            if (dynamicPatch2 != null && dynamicPatch2.getOriginType() == 37) {
                List<Aweme> awemeList = next.getDynamicPatch().getAwemeList();
                if (awemeList != null) {
                    int i = 0;
                    for (Aweme aweme : awemeList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            AwemeExtKt.appendMobParam(aweme, "item_rank", String.valueOf(i));
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    int iIntValue = ((Number) C272180Alc.LIZ.getValue()).intValue();
                    String str3 = c0pht.LIZJ;
                    ListIterator<Aweme> listIterator = awemeList.listIterator(awemeList.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            awemePrevious = listIterator.previous();
                            Aweme aweme2 = awemePrevious;
                            if (aweme2 != null) {
                                aid2 = aweme2.getAid();
                            } else {
                                aid2 = null;
                            }
                            if (Intrinsics.LJFF(str3, aid2)) {
                                break;
                            }
                        } else {
                            awemePrevious = null;
                            break;
                        }
                    }
                    int iIndexOf = awemeList.indexOf(awemePrevious);
                    if (iIndexOf > -1) {
                        if (iIntValue > 0) {
                            int i3 = iIntValue + iIndexOf;
                            int size = awemeList.size();
                            if (i3 > size) {
                                i3 = size;
                            }
                            awemeList = awemeList.subList(iIndexOf, i3);
                        }
                        Iterator<Aweme> it4 = awemeList.iterator();
                        while (it4.hasNext()) {
                            AwemeExtKt.appendExtraParamUseInSearch(it4.next(), "search_result_id", next.getProviderDocIdStr());
                        }
                    } else {
                        Iterator<Aweme> it5 = awemeList.iterator();
                        while (it5.hasNext()) {
                            AwemeExtKt.appendExtraParamUseInSearch(it5.next(), "search_result_id", next.getProviderDocIdStr());
                        }
                        if (iIntValue > 0) {
                            awemeList = awemeList.subList(0, iIntValue);
                        }
                    }
                    for (Aweme aweme3 : awemeList) {
                        AwemeBizExtKt.setRank(aweme3, next.getRank());
                        Iterator it6 = arrayList.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                Object next3 = it6.next();
                                Aweme aweme4 = (Aweme) next3;
                                String aid3 = aweme3.getAid();
                                if (aid3 != null) {
                                    if (aweme4 != null) {
                                        aid = aweme4.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    if (aid3.equals(aid)) {
                                        if (next3 != null) {
                                            arrayList.remove(next3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList.addAll(0, awemeList);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lyrics video card does not exist ");
                DynamicPatch dynamicPatch3 = next.getDynamicPatch();
                if (dynamicPatch3 != null) {
                    str = dynamicPatch3.schema;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        if (C07J7.LIZ() && list.size() > 0) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(list, 0);
            if (searchMixFeed.getFeedType() == 35 && (takoInfo = searchMixFeed.bot) != null && takoInfo.getAwemeList() != null) {
                List<Aweme> awemeList2 = searchMixFeed.bot.getAwemeList();
                HashMap map = new HashMap();
                for (Aweme aweme5 : awemeList2) {
                    AwemeBizExtKt.setSearchFeedType(aweme5, "SearchBotFeed");
                    map.put(aweme5.getAid(), aweme5);
                }
                HashMap map2 = new HashMap();
                for (Aweme aweme6 : arrayList) {
                    map2.put(aweme6.getAid(), aweme6);
                }
                if (searchMixFeed.isEntrance()) {
                    Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        Aweme aweme7 = (Aweme) it7.next();
                        if (map.containsKey(aweme7.getAid())) {
                            it7.remove();
                            map.remove(aweme7.getAid());
                        }
                    }
                    for (int size2 = awemeList2.size() - 1; size2 >= 0; size2--) {
                        ListProtector.add(arrayList, 0, ListProtector.get(awemeList2, size2));
                    }
                } else {
                    for (int size3 = awemeList2.size() - 1; size3 >= 0; size3--) {
                        if (!map2.containsKey(((Aweme) ListProtector.get(awemeList2, size3)).getAid())) {
                            ListProtector.add(arrayList, 0, ListProtector.get(awemeList2, size3));
                        }
                    }
                }
            }
        }
        if (!list.isEmpty()) {
            SearchMixFeed searchMixFeed2 = (SearchMixFeed) ListProtector.get(list, 0);
            if (searchMixFeed2.isViralSongCard() && (viralSongCard = searchMixFeed2.viralSongCard) != null) {
                List<Aweme> list2 = viralSongCard.videos;
                HashMap map3 = new HashMap();
                for (Aweme aweme8 : list2) {
                    AwemeBizExtKt.setSearchFeedType(aweme8, "SearchViralSong");
                    map3.put(aweme8.getAid(), aweme8);
                }
                HashMap map4 = new HashMap();
                for (Aweme aweme9 : arrayList) {
                    map4.put(aweme9.getAid(), aweme9);
                }
                if (searchMixFeed2.isEntrance()) {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        Aweme aweme10 = (Aweme) it8.next();
                        if (map3.containsKey(aweme10.getAid())) {
                            it8.remove();
                            map3.remove(aweme10.getAid());
                        }
                    }
                    for (int size4 = list2.size() - 1; size4 >= 0; size4--) {
                        ListProtector.add(arrayList, 0, ListProtector.get(list2, size4));
                    }
                } else {
                    for (int size5 = list2.size() - 1; size5 >= 0; size5--) {
                        if (!map4.containsKey(((Aweme) ListProtector.get(list2, size5)).getAid())) {
                            ListProtector.add(arrayList, 0, ListProtector.get(list2, size5));
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Aweme aweme11 = (Aweme) obj;
            if (aweme11 != null && C123100dR.LIZ(aweme11.getAid())) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static void LJJIJL(SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list;
        Aweme aweme;
        SearchAwemeInfo searchAwemeInfo;
        Boolean bool;
        List<TranslateSearchDesc> list2;
        if (searchMixFeedList != null && (list = searchMixFeedList.mItems) != null) {
            for (SearchMixFeed searchMixFeed : list) {
                if (searchMixFeed != null && searchMixFeed.getFeedType() == 65280 && (aweme = searchMixFeed.getAweme()) != null) {
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_result_id", aweme.getAid());
                    if (!searchMixFeed.isTrendingNativeData()) {
                        AwemeExtKt.appendExtraParamUseInSearch(aweme, "token_type", "");
                    }
                    GlobalDoodleConfig globalDoodleConfig = searchMixFeedList.globalDoodleConfig;
                    if (globalDoodleConfig != null && globalDoodleConfig.getTnsBanType() != null && searchMixFeedList.globalDoodleConfig.getTnsBanType().equals("Pass")) {
                        AwemeExtKt.appendExtraParamUseInSearch(aweme, "is_search_video", "1");
                    }
                    GlobalDoodleConfig globalDoodleConfig2 = searchMixFeedList.globalDoodleConfig;
                    if (globalDoodleConfig2 != null) {
                        AwemeBizExtKt.setDisableMusicDspFreqCtrl(aweme, globalDoodleConfig2.getDisableMusicDspFreqCtrl());
                    }
                    SearchAwemeInfo searchAwemeInfo2 = searchMixFeed.searchAwemeInfo;
                    if (searchAwemeInfo2 != null && (list2 = searchAwemeInfo2.translateSearchList) != null && list2.size() > 0 && ListProtector.get(searchMixFeed.searchAwemeInfo.translateSearchList, 0) != null && ((TranslateSearchDesc) ListProtector.get(searchMixFeed.searchAwemeInfo.translateSearchList, 0)).originLanguage != null) {
                        AwemeBizExtKt.setSearchDocOriginLanguage(aweme, ((TranslateSearchDesc) ListProtector.get(searchMixFeed.searchAwemeInfo.translateSearchList, 0)).originLanguage);
                        AwemeBizExtKt.setSearchDocTranslate(aweme, ((TranslateSearchDesc) ListProtector.get(searchMixFeed.searchAwemeInfo.translateSearchList, 0)).searchDesc);
                    }
                    C660350PvF.LIZ.getClass();
                    C660350PvF.LIZ(aweme, searchMixFeed);
                    if (C0BRM.LIZ() && (searchAwemeInfo = searchMixFeed.searchAwemeInfo) != null && (bool = searchAwemeInfo.withSearchSurvey) != null) {
                        AwemeBizExtKt.setWithSearchSurvey(aweme, bool.booleanValue());
                    }
                    if (searchMixFeed.getAweme() != null && searchMixFeed.getSearchAwemeInfo() != null && searchMixFeed.getSearchAwemeInfo().hasCreationIntention != null) {
                        AwemeBizExtKt.setHasCreationIntention(searchMixFeed.getAweme(), searchMixFeed.getSearchAwemeInfo().hasCreationIntention.booleanValue());
                    }
                }
            }
        }
    }

    public static void LJJIJLIJ(SearchMixFeedList searchMixFeedList) {
        if (searchMixFeedList != null && !C086I.LIZIZ(searchMixFeedList.mItems)) {
            Iterator<SearchMixFeed> it2 = searchMixFeedList.mItems.iterator();
            while (it2.hasNext()) {
                LJJIZ(it2.next(), searchMixFeedList.globalDoodleConfig);
            }
        }
    }

    @Override // X.C0PN2
    public final void LJIL(List<? extends SearchMixFeed> list) {
        super.LJIL(list);
        C0PH8.LJII(list, C0NMY.GENERAL_SEARCH);
    }

    public final String LJJIIJ(String str) {
        C0PDV c0pdv = this.LLJJJJLIIL;
        if (c0pdv == null || str == null || str.length() == 0) {
            return null;
        }
        return (String) ((Map) c0pdv.LLIZ.getValue()).get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.ss.android.ugc.aweme.base.api.BaseResponse, com.ss.android.ugc.aweme.discover.model.SearchApiResult, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0PN2, X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public final void handleData(SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list;
        List<Aweme> list2;
        List<SearchMixFeed> listLJII;
        List<SearchMixFeed> list3;
        boolean z;
        boolean z2;
        Aweme aweme;
        String aid;
        List<SearchMixFeed> list4;
        List<SearchUser> users;
        List<SearchMixFeed> listLJII2;
        LogPbBean logPbBean;
        Aweme aweme2;
        Aweme aweme3;
        LogPbBean logPbBean2;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Integer num;
        boolean z3;
        List<SearchMixFeed> list5;
        ?? r3 = searchMixFeedList;
        String imprId = null;
        if (r3 == 0) {
            r3 = 0;
        } else if (!((Boolean) C0PNF.LIZ.getValue()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            List<SearchMixFeed> list6 = r3.mItems;
            if (list6 != null) {
                int i = 0;
                for (SearchMixFeed searchMixFeed : list6) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (searchMixFeed.getFeedType() == 112) {
                            arrayList.add(Integer.valueOf(i));
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            Iterator it2 = C13LP.LJLJJLL(arrayList).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                List<SearchMixFeed> list7 = r3.mItems;
                if (list7 != null) {
                    ListProtector.remove(list7, iIntValue);
                }
            }
        }
        if (this.mListQueryType == 4) {
            C0PFX c0pfx = C0PFX.LIZ;
            int i3 = this.LLJL;
            c0pfx.getClass();
            this.LLJL = C0PFX.LIZLLL(r3, i3, false);
        }
        boolean z4 = true;
        if (this.mListQueryType == 4 && LJJIIZ().LJI()) {
            C642860PJk c642860PJk = C642860PJk.LIZ;
            ISearchContextAbility iSearchContextAbility = this.LLJZIJLIL;
            c642860PJk.getClass();
            if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null && (num = c0prc.LLJLLL) != null) {
                int iIntValue2 = num.intValue();
                Map<Integer, C642880PJm> map = C642860PJk.LIZJ;
                Integer numValueOf = Integer.valueOf(iIntValue2);
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Object c642880PJm = linkedHashMap.get(numValueOf);
                if (c642880PJm == null) {
                    c642880PJm = new C642880PJm();
                    linkedHashMap.put(numValueOf, c642880PJm);
                }
                C642880PJm c642880PJm2 = (C642880PJm) c642880PJm;
                if (c642880PJm2 != null && c642880PJm2.LJII) {
                    c642880PJm2.LJI = C0PGB.OUT_DATA_START;
                    c642880PJm2.LJ = Long.valueOf(SystemClock.elapsedRealtime());
                    if (r3 != 0 && (list5 = r3.mItems) != null) {
                        Iterator<SearchMixFeed> it3 = list5.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().isSingluarCard()) {
                                z3 = true;
                                break;
                            }
                        }
                        z3 = false;
                        c642880PJm2.LJIIIIZZ = z3;
                    } else {
                        z3 = false;
                        c642880PJm2.LJIIIIZZ = z3;
                    }
                }
            }
        }
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLILZ;
        c644060POa.getClass();
        C644060POa.LJII(searchResultParam).LJJIFFI();
        if (r3 != 0) {
            C644210POp.LIZ.getClass();
            C644220POq c644220POq = C644210POp.LJ;
            String requestId = r3.getRequestId();
            String str = "";
            if (c644220POq.LIZIZ == null) {
                c644220POq.LIZIZ = requestId;
                if (requestId == null) {
                    requestId = "";
                }
                c644220POq.LIZ(requestId, "log_id");
            }
            try {
                int i4 = r3.error_code;
                if (i4 > 0) {
                    String str2 = r3.message;
                    if (str2 == null) {
                        str2 = "response data error";
                    }
                    c644220POq.LIZIZ(5, i4, str2);
                } else {
                    c644220POq.LJ = Integer.valueOf(r3.mItems.size());
                    C644240POs c644240POs = C644210POp.LJI;
                    LogPbBean logPbBean3 = r3.logPb;
                    if (logPbBean3 != null) {
                        imprId = logPbBean3.getImprId();
                    }
                    if (c644240POs.LJ == null) {
                        c644240POs.LJ = imprId;
                        if (imprId != null) {
                            str = imprId;
                        }
                        c644240POs.LIZ(str, "search_id");
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SearchChainEventTrackerV2", e.toString());
            }
            C644210POp.LIZ.getClass();
            C644210POp.LJFF.LIZJ();
            r3.mItems = SearchHubEntityCard.handleLynxSearchEntity(r3.mItems, this.LLJLL).getSecond();
        }
        super.handleData(r3);
        if (this.mListQueryType == 1) {
            this.LLJJJ = 0;
            if (this.LLJJ && r3 != 0 && (logPbBean2 = r3.logPb) != null) {
                logPbBean2.getImprId();
            }
        }
        List<SearchMixFeed> list8 = r3.mItems;
        if (!C086I.LIZIZ(list8)) {
            for (SearchMixFeed searchMixFeed2 : list8) {
                if (searchMixFeed2.getFeedType() == 65280 && (aweme3 = searchMixFeed2.getAweme()) != null) {
                    AwemeBizExtKt.setRank(aweme3, this.LLJJJ);
                    this.LLJJJ++;
                    if (this.LLJJ) {
                        AwemeExtKt.appendMobParam(aweme3, "search_third_item_id", aweme3.getAid());
                    }
                }
            }
        }
        LJJJ(r3);
        List<SearchMixFeed> list9 = r3.mItems;
        if (!C086I.LIZIZ(list9) && (logPbBean = r3.logPb) != null) {
            for (SearchMixFeed searchMixFeed3 : list9) {
                if (searchMixFeed3.getFeedType() == 65280 && (aweme2 = searchMixFeed3.getAweme()) != null) {
                    aweme2.setLogPbBean(logPbBean);
                }
                searchMixFeed3.setLogPb(logPbBean);
            }
        }
        boolean zLIZIZ = C086I.LIZIZ(r3.mItems);
        this.mIsNewDataEmpty = zLIZIZ;
        if (!zLIZIZ) {
            int i5 = this.mListQueryType;
            if (i5 != 1) {
                if (i5 == 4) {
                    if (!r3.LLIZLLLIL) {
                        LJJIJL(r3);
                        LJJIJLIJ(r3);
                        SearchTopResultRequestObserverUtils.RequestObserversVM requestObserversVM = this.LLL;
                        if (requestObserversVM != 0) {
                            requestObserversVM.RZ1(r3);
                        }
                    }
                    LinkedList<SearchMixFeed> linkedList = new LinkedList(r3.mItems);
                    LinkedList linkedList2 = linkedList;
                    if (this.LLJZ.LIZ.size() > 0) {
                        C0PIU c0piu = this.LLJZ;
                        List items = getItems();
                        List<SearchMixFeed> listLJ = this.LLJJJJLIIL.LJ();
                        HashSet<SearchMixFeed> hashSet = c0piu.LIZ;
                        LinkedList linkedList3 = new LinkedList();
                        HashSet<SearchMixFeed> hashSet2 = new HashSet<>();
                        LinkedList linkedList4 = new LinkedList();
                        SparseArray sparseArray = new SparseArray();
                        int size = listLJ.size();
                        for (SearchMixFeed searchMixFeed4 : linkedList) {
                            if (searchMixFeed4.isAweme()) {
                                linkedList4.add(searchMixFeed4);
                            } else {
                                sparseArray.put(size, searchMixFeed4);
                            }
                            size++;
                        }
                        for (SearchMixFeed searchMixFeed5 : hashSet) {
                            sparseArray.put(listLJ.indexOf(searchMixFeed5), searchMixFeed5);
                        }
                        int size2 = items.size();
                        while (linkedList4.size() > 0) {
                            if (sparseArray.get(size2) != null) {
                                linkedList3.add(sparseArray.get(size2));
                                sparseArray.remove(size2);
                            } else {
                                linkedList3.add(linkedList4.removeFirst());
                            }
                            size2++;
                        }
                        if (sparseArray.size() > 0) {
                            int size3 = sparseArray.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                sparseArray.keyAt(i6);
                                hashSet2.add(sparseArray.valueAt(i6));
                            }
                        }
                        c0piu.LIZ = hashSet2;
                        C0PHR.LIZ.getClass();
                        linkedList2 = linkedList3;
                    }
                    if (C0A0H.LIZ()) {
                        listLJII2 = C0PIR.LJII(getItems(), linkedList2, this.LLJJJJ, r3.hasMore);
                    } else {
                        C0PIR.LIZIZ(linkedList2, this.LLJJJJ, r3.hasMore);
                        listLJII2 = linkedList2;
                    }
                    LJIIJ(listLJII2);
                    if (!listLJII2.isEmpty()) {
                        C642350PHl c642350PHl = C642350PHl.LIZ;
                        C0PHT c0phtLJJIIZ = LJJIIZ();
                        EnumC642390PHp enumC642390PHp = EnumC642390PHp.OUT_LOAD_MORE;
                        C0PSG c0psg = this.LL;
                        c642350PHl.getClass();
                        C642350PHl.LIZ(c0phtLJJIIZ, listLJII2, enumC642390PHp, c0psg, null, null);
                    }
                    T t = this.mData;
                    if (t != 0) {
                        SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) t;
                        searchMixFeedList2.hasMore &= r3.hasMore;
                        searchMixFeedList2.mBacktrace = r3.mBacktrace;
                        searchMixFeedList2.setDisableReorder(r3.getDisableReorder());
                    }
                }
            } else {
                if (!r3.LLIZLLLIL) {
                    LJJIJLIJ(r3);
                    LJJIJL(r3);
                    this.mData = r3;
                }
                if (!(this instanceof C0PNY)) {
                    C0PHR c0phr = C0PHR.LIZ;
                    C0PHT c0phtLJJIIZ2 = LJJIIZ();
                    c0phr.getClass();
                    C0PHR.LIZIZ(c0phtLJJIIZ2);
                }
                this.LLJZ.LIZ.clear();
                LJIL(new ArrayList(r3.mItems));
            }
            C0PIF c0pif = C0PIF.LIZ;
            List items2 = getItems();
            String str3 = this.LLJJJJJIL;
            Integer numValueOf2 = Integer.valueOf(this.LLJJJJ);
            c0pif.getClass();
            C0PIF.LIZLLL(numValueOf2, str3, items2);
            if (((C0PRC) LJJIIJZLJL().Ph1().LIZJ()).LLLLIIIILLL) {
                C0PIF.LJII(getItems(), this.LLJJJJJIL, this.LLJLIL, new C0PIG() { // from class: X.0PNC
                    @Override // X.C0PIG
                    public final void LIZ(int i7) {
                        this.LIZ.LLJLIL = i7;
                    }
                });
            }
            T t2 = this.mData;
            if (t2 != 0) {
                SearchMixFeedList searchMixFeedList3 = (SearchMixFeedList) t2;
                if (searchMixFeedList3.cursor != 0) {
                    searchMixFeedList3.cursor = r3.cursor;
                }
            }
            C584850Mwl.LIZ.LJI(r3.getRequestId(), r3.logPb);
            T t3 = this.mData;
            if (t3 != 0) {
                C0PFZ c0pfz = C0PFZ.LIZ;
                List<SearchMixFeed> list10 = ((SearchMixFeedList) t3).mItems;
                c0pfz.getClass();
                int size4 = list10.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    SearchMixFeed searchMixFeed6 = (SearchMixFeed) ListProtector.get(list10, i7);
                    int feedType = searchMixFeed6.getFeedType();
                    if (feedType != 65280) {
                        if (feedType == 65458 && (users = searchMixFeed6.getUsers()) != null) {
                            Iterator<SearchUser> it4 = users.iterator();
                            while (it4.hasNext()) {
                                it4.next().rank = i7;
                            }
                        }
                    } else if (searchMixFeed6.getAweme() != null) {
                        AwemeBizExtKt.setAwemePosition(searchMixFeed6.getAweme(), i7);
                    }
                }
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = r3;
                LJIIL();
                T t4 = this.mData;
                if (t4 != 0) {
                    ((SearchMixFeedList) t4).hasMore = false;
                }
            }
            T t6 = this.mData;
            if (t6 != 0 && this.mListQueryType != 2) {
                ((SearchMixFeedList) t6).hasMore = false;
            }
        }
        C0PDV c0pdv = this.LLJJJJLIIL;
        if (c0pdv != null) {
            int i8 = this.mListQueryType;
            if (i8 == 1) {
                SearchMixFeedList searchMixFeedList4 = new SearchMixFeedList();
                Collection collection = r3.mItems;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                searchMixFeedList4.mItems = new ArrayList(collection);
                Object obj = C0PIR.LIZJ().get(Integer.valueOf(c0pdv.LLILLJJLI));
                if (obj != null && (list4 = searchMixFeedList4.mItems) != null) {
                    list4.add((SearchMixFeed) obj);
                }
                if (C1830007Es.LIZ() || C1839607Ik.LIZIZ()) {
                    c0pdv.LJ().clear();
                    List<SearchMixFeed> list11 = searchMixFeedList4.mItems;
                    if (list11 != null) {
                        c0pdv.LJ().addAll(list11);
                    }
                }
                if (C1830007Es.LIZ()) {
                    ((Set) c0pdv.LLILLL.getValue()).clear();
                }
                if (C1839607Ik.LIZ()) {
                    c0pdv.LIZJ().clear();
                    ((Map) c0pdv.LLILZLL.getValue()).clear();
                }
                if (C1839607Ik.LIZIZ()) {
                    ((Map) c0pdv.LLIZ.getValue()).clear();
                    ((Set) c0pdv.LLIZLLLIL.getValue()).clear();
                    ((Set) c0pdv.LLJ.getValue()).clear();
                }
            } else if (i8 == 4 && ((C1830007Es.LIZ() || C1839607Ik.LIZIZ()) && (list3 = r3.mItems) != null)) {
                c0pdv.LJ().addAll(list3);
                if (C1830007Es.LIZ()) {
                    c0pdv.LJII();
                } else {
                    List<SearchMixFeed> listLJ2 = c0pdv.LJ();
                    if (listLJ2 != null && !listLJ2.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Set set = (Set) c0pdv.LLJ.getValue();
                    if (set != null && !set.isEmpty()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!(z | z2)) {
                        for (String str4 : (Set) c0pdv.LLJ.getValue()) {
                            if (str4.length() != 0) {
                                int size5 = c0pdv.LJ().size();
                                for (int i9 = 0; i9 < size5; i9++) {
                                    C0PLT c0plt = (C0PLT) ListProtector.get(c0pdv.LJ(), i9);
                                    if (c0plt != null && (aweme = c0plt.getAweme()) != null && (aid = aweme.getAid()) != null && aid.equals(str4)) {
                                        ListProtector.set(c0pdv.LJ(), i9, null);
                                        if (C1839607Ik.LIZ()) {
                                            c0pdv.LIZJ().remove(str4);
                                            ((Map) c0pdv.LLILZLL.getValue()).remove(str4);
                                        }
                                    }
                                }
                            }
                        }
                        c0pdv.LJI();
                    }
                }
            }
        }
        if (this.mListQueryType == 1) {
            List<SearchMixFeed> arrayList2 = r3.mItems;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            boolean z5 = false;
            for (SearchMixFeed searchMixFeed7 : arrayList2) {
                if (searchMixFeed7.isViralSongCard()) {
                    if (!LJJIJIIJI()) {
                        this.LLJLLIL = searchMixFeed7;
                    }
                    z5 = true;
                }
            }
            if (!z5 && ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLLLIIL == 0 && LJJIJIIJI() && this.LLJLLIL != null) {
                ListProtector.add(arrayList2, 0, this.LLJLLIL);
                LJIL(r3.mItems);
            }
        }
        C640570PAp c640570PAp = this.LLJLILLLLZIIL;
        if (c640570PAp != null) {
            List<? extends SearchMixFeed> items3 = getItems();
            if (this.mListQueryType == 1) {
                z4 = false;
            }
            List<SearchMixFeed> listLIZIZ = c640570PAp.LIZIZ(items3, z4);
            if (C0A0H.LIZ()) {
                listLJII = C0PIR.LJII(Collections.emptyList(), listLIZIZ, this.LLJJJJ, r3.hasMore);
            } else {
                LinkedList linkedList5 = new LinkedList(listLIZIZ);
                C0PIR.LIZIZ(linkedList5, this.LLJJJJ, r3.hasMore);
                listLJII = linkedList5;
            }
            LJIL(listLJII);
        }
        this.mIsLoading = false;
        this.LLIZLLLIL = null;
        T t7 = this.mData;
        if (t7 != 0 && (list = ((SearchMixFeedList) t7).mItems) != null && !list.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (SearchMixFeed searchMixFeed8 : ((SearchMixFeedList) this.mData).mItems) {
                String str5 = searchMixFeed8.feedbackType;
                if (str5 != null && str5.equals("user")) {
                    for (int i10 = 0; i10 < searchMixFeed8.getUsers().size(); i10++) {
                        if (ListProtector.get(searchMixFeed8.getUsers(), i10) != null && (list2 = ((SearchUser) ListProtector.get(searchMixFeed8.getUsers(), i10)).awemeCards) != null && !list2.isEmpty()) {
                            arrayList3.addAll(list2);
                        }
                    }
                } else if (searchMixFeed8.getAweme() != null) {
                    arrayList3.add(searchMixFeed8.getAweme());
                }
            }
            if (!arrayList3.isEmpty()) {
                C1360460lVU.LIZIZ.LJJI(arrayList3, EnumC1359020lTA.SEARCH_FEED, null);
            }
            C1334280kpG c1334280kpG = C1334280kpG.LIZ;
            int i11 = r3.cursor;
            c1334280kpG.getClass();
            C1334280kpG.LIZJ = i11;
            GlobalDoodleConfig globalDoodleConfig = r3.globalDoodleConfig;
            if (globalDoodleConfig != null && globalDoodleConfig.getEnableImageRecord() != null) {
                C1334280kpG.LIZIZ = r3.globalDoodleConfig.getEnableImageRecord().booleanValue();
            }
        }
    }

    public final void LJJIJ(SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list;
        SearchHubEntityCard entityCard;
        EntityCardTitle entityCardTitle;
        if (searchMixFeedList != null && (list = searchMixFeedList.mItems) != null && list.size() != 0) {
            for (SearchMixFeed searchMixFeed : searchMixFeedList.mItems) {
                if (searchMixFeed != null && searchMixFeed.getFeedType() == 200 && (entityCard = searchMixFeed.getEntityCard()) != null && (entityCardTitle = entityCard.topCardInfo) != null && entityCardTitle.dynamicPatch != null) {
                    C0PA4 c0pa4 = this.LLJLL;
                    c0pa4.getClass();
                    SearchHubEntityCard entityCard2 = searchMixFeed.getEntityCard();
                    if (entityCard2 != null && c0pa4.LIZ == null) {
                        entityCard2.setSearchMixFeed(searchMixFeed);
                        c0pa4.LIZ = entityCard2;
                    }
                    searchMixFeedList.mItems.remove(searchMixFeed);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r19) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PN8.LJJJ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        int i;
        C19EG c19eg;
        if (C086I.LIZIZ(getItems())) {
            i = 0;
        } else {
            i = ((SearchMixFeedList) this.mData).cursor;
        }
        if (objArr.length == 1) {
            LJJJJI(i, LJIILIIL(objArr), this.LLJJI, LJIILLIIL(), this.LLJJIJIIJIL);
            return;
        }
        if (this.LLJJ && objArr.length == 2) {
            LJJJJI(i, LJIILIIL(objArr), this.LLJJI, LJIILLIIL(), this.LLJJIJIIJIL);
            return;
        }
        C0P59.LIZ(LJIILIIL(objArr)).LIZLLL = i;
        if (!((Boolean) AnonymousClass0793.LIZ.getValue()).booleanValue() && !((Boolean) C18151078z.LIZ.getValue()).booleanValue()) {
            String strLJIILIIL = LJIILIIL(objArr);
            String str = this.LLJJI;
            int iIntValue = ((Integer) objArr[5]).intValue();
            C0PSG c0psg = (C0PSG) objArr[6];
            String strLJIILLIIL = LJIILLIIL();
            String str2 = this.LLJJIJIIJIL;
            WeakReference<C19EG> weakReference = this.LLIZ;
            if (weakReference == null) {
                c19eg = null;
            } else {
                c19eg = weakReference.get();
            }
            LJJJJ(strLJIILIIL, i, 10, 0, str, iIntValue, c0psg, strLJIILLIIL, str2, c19eg, LJIILJJIL());
            return;
        }
        C823050WQl.LIZJ().execute(new ARunnableS17S0201000_10(i, this, objArr, 3));
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        String enterMethod;
        SearchHubEntityCard searchHubEntityCard;
        EntityCardTitle entityCardTitle;
        if (objArr.length < 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("some unexpected things happen: data in model is empty ,but request type is load more ");
            sbLIZ.append(new StackTraceElement[0].toString());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("qw", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C0PA4 c0pa4 = this.LLJLL;
        SearchResultParam searchResultParam = this.LLILZ;
        c0pa4.getClass();
        C19EG c19eg = null;
        if (searchResultParam != null) {
            enterMethod = searchResultParam.getEnterMethod();
        } else {
            enterMethod = null;
        }
        if (Intrinsics.LJFF(enterMethod, "entity_switch") && searchResultParam.getFilterOption() == null) {
            if (searchResultParam.getEntityTabIndex() != -1 && (searchHubEntityCard = c0pa4.LIZ) != null && (entityCardTitle = searchHubEntityCard.topCardInfo) != null) {
                entityCardTitle.setSelectedTabIndex(Integer.valueOf(searchResultParam.getEntityTabIndex()));
            }
        } else {
            c0pa4.LIZ = null;
        }
        if (!LJJIJIIJI()) {
            this.LLJLLIL = null;
        }
        if (objArr.length == 2) {
            String strLJIILIIL = LJIILIIL(objArr);
            String str = this.LLJJIII;
            if (str == null) {
                str = "";
            }
            LJJJJI(0, strLJIILIIL, str, LJIILLIIL(), this.LLJJIJIIJIL);
            return;
        }
        String strLJIILIIL2 = LJIILIIL(objArr);
        int iIntValue = ((Integer) objArr[2]).intValue();
        int iIntValue2 = ((Integer) objArr[5]).intValue();
        C0PSG c0psg = (C0PSG) objArr[6];
        String strLJIILLIIL = LJIILLIIL();
        String str2 = this.LLJJIJIIJIL;
        WeakReference<C19EG> weakReference = this.LLIZ;
        if (weakReference != null) {
            c19eg = weakReference.get();
        }
        LJJJJ(strLJIILIIL2, 0, 10, iIntValue, "", iIntValue2, c0psg, strLJIILLIIL, str2, c19eg, LJIILJJIL());
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r13, com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r14) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PN8.LJJIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig):void");
    }

    @Override // X.C0PDR
    public final List<SearchMixFeed> LIZ(String str, boolean z) {
        C0PDV c0pdv = this.LLJJJJLIIL;
        if (c0pdv == null) {
            return null;
        }
        return c0pdv.LIZ(str, z);
    }

    public static void LJJIFFI(List<SearchMixFeed> list, HashSet<String> hashSet, List<Aweme> list2) {
        List listLIZ;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(list, i);
                if (searchMixFeed != null) {
                    Iterator it2 = ((ArrayList) C642300PHg.LJII.getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            listLIZ = ((InterfaceC642320PHi) it2.next()).LIZ(searchMixFeed);
                            if (listLIZ != null) {
                                break;
                            }
                        } else {
                            listLIZ = searchMixFeed.awemePoolAwemeList;
                            if (listLIZ == null) {
                                listLIZ = C0PH8.LIZ(searchMixFeed, C0NMY.GENERAL_SEARCH);
                            }
                            if (listLIZ == null) {
                            }
                        }
                    }
                    for (Aweme aweme : listLIZ) {
                        if (aweme.getAid() != null) {
                            if (!hashSet.contains(aweme.getAid())) {
                                hashSet.add(aweme.getAid());
                                ((ArrayList) list2).add(aweme);
                            } else {
                                if (searchMixFeed == null || ((!searchMixFeed.isAggregatedVideo() || !searchMixFeed.isEntrance()) && (!searchMixFeed.isMusicAggregatedVideo() || !searchMixFeed.isEntrance()))) {
                                    if (searchMixFeed.isEntrance()) {
                                        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                                        Integer numValueOf = Integer.valueOf(searchMixFeed.getFeedType());
                                        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                                        c649470Pdh.getClass();
                                        if (C649470Pdh.LJIJJ(numValueOf, dynamicPatch)) {
                                        }
                                    }
                                }
                                ArrayList arrayList = (ArrayList) list2;
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Aweme aweme2 = (Aweme) it3.next();
                                    if (Objects.equals(aweme2.getAid(), aweme.getAid())) {
                                        arrayList.remove(aweme2);
                                        break;
                                    }
                                }
                                arrayList.add(aweme);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void LJJII(SearchMixFeed searchMixFeed, HashSet<String> hashSet, List<Aweme> list) {
        List<Aweme> awemeList;
        ArrayList arrayList = new ArrayList();
        if (searchMixFeed != null && searchMixFeed.getDynamicPatch() != null && (awemeList = searchMixFeed.getDynamicPatch().getAwemeList()) != null) {
            for (Aweme aweme : awemeList) {
                if (!hashSet.contains(aweme.getAid())) {
                    hashSet.add(aweme.getAid());
                    arrayList.add(aweme);
                }
            }
        }
        ((ArrayList) list).addAll(0, arrayList);
    }

    public static void LJJIJIL(SearchMixFeed searchMixFeed, GlobalDoodleConfig globalDoodleConfig, Aweme aweme) {
        Music music = aweme.getMusic();
        if (music != null) {
            music.setId(CastLongProtector.parseLong(music.getIdStr()));
            aweme.setMusic(music);
        }
        Music addedSoundMusicInfo = aweme.getAddedSoundMusicInfo();
        if (addedSoundMusicInfo != null) {
            addedSoundMusicInfo.setId(CastLongProtector.parseLong(addedSoundMusicInfo.getIdStr()));
            aweme.setAddedSoundMusicInfo(addedSoundMusicInfo);
        }
        if (globalDoodleConfig != null) {
            AwemeBizExtKt.setDisableMusicDspFreqCtrl(aweme, globalDoodleConfig.getDisableMusicDspFreqCtrl());
        }
        C643200PKs.LIZIZ(aweme, searchMixFeed.universalRank);
    }

    public static void LJJIII(List<SearchMixFeed> list, HashSet<String> hashSet, List<Aweme> list2, LifecycleOwner lifecycleOwner) {
        boolean z;
        if (lifecycleOwner == null) {
            LJJIFFI(list, hashSet, list2);
            return;
        }
        C0PHT c0pht = ((C639840P7u) C0Q3E.LJ(lifecycleOwner).jy().LIZJ()).LL;
        String str = c0pht.LJFF;
        int i = 0;
        if (str != null && !str.isEmpty()) {
            z = false;
        } else {
            z = true;
            if (!C292480BdG.LIZ()) {
                C1AF0.LIZJ("getAwemesV2 entryIdIsEmpty");
            }
        }
        if (list.size() > 1) {
            int size = list.size();
            for (C0PHX c0phx = c0pht.LIZ; c0phx != null; c0phx = c0phx.LIZLLL) {
                i++;
            }
            if (size == i && !z) {
                C0PHW c0phwLIZ = c0pht.LIZ();
                if (c0phwLIZ == null) {
                    if (!list.isEmpty()) {
                        C642350PHl c642350PHl = C642350PHl.LIZ;
                        EnumC642390PHp enumC642390PHp = EnumC642390PHp.REBIND;
                        c642350PHl.getClass();
                        C642350PHl.LIZ(c0pht, list, enumC642390PHp, null, null, null);
                    }
                    c0phwLIZ = c0pht.LIZ();
                    if (c0phwLIZ == null) {
                        C1AF0.LIZJ("getAllSearchMixAwemes startCursor == null");
                        LJJIFFI(list, hashSet, list2);
                        return;
                    }
                }
                String str2 = c0pht.LJFF;
                if (str2 != null && !str2.isEmpty()) {
                    C0PHR c0phr = C0PHR.LIZ;
                    String str3 = c0pht.LJFF;
                    c0phr.getClass();
                    C0PHR.LIZ(c0pht, str3);
                }
                LinkedList linkedList = new LinkedList();
                Aweme awemeLIZLLL = c0phwLIZ.LIZLLL();
                if (awemeLIZLLL != null && awemeLIZLLL.getAid() != null && !hashSet.contains(awemeLIZLLL.getAid())) {
                    hashSet.add(awemeLIZLLL.getAid());
                    linkedList.addFirst(awemeLIZLLL);
                }
                C0PHW c0phwLIZIZ = c0phwLIZ.LIZIZ();
                C0PHW c0phwLIZ2 = c0phwLIZ.LIZ();
                while (true) {
                    if (c0phwLIZIZ == null) {
                        if (c0phwLIZ2 == null) {
                            ((ArrayList) list2).addAll(linkedList);
                            return;
                        }
                    } else {
                        Aweme awemeLIZLLL2 = c0phwLIZIZ.LIZLLL();
                        if (awemeLIZLLL2 != null && awemeLIZLLL2.getAid() != null && !hashSet.contains(awemeLIZLLL2.getAid())) {
                            hashSet.add(awemeLIZLLL2.getAid());
                            linkedList.addFirst(awemeLIZLLL2);
                        }
                        c0phwLIZIZ = c0phwLIZIZ.LIZIZ();
                        if (c0phwLIZ2 != null) {
                        }
                    }
                    Aweme awemeLIZLLL3 = c0phwLIZ2.LIZLLL();
                    if (awemeLIZLLL3 != null && awemeLIZLLL3.getAid() != null && !hashSet.contains(awemeLIZLLL3.getAid())) {
                        hashSet.add(awemeLIZLLL3.getAid());
                        linkedList.addLast(awemeLIZLLL3);
                    }
                    c0phwLIZ2 = c0phwLIZ2.LIZ();
                }
            }
        }
        LJJIFFI(list, hashSet, list2);
    }

    public final void LJJJJI(final int i, final String str, final String str2, final String str3, final String str4) {
        C19EG c19eg;
        if (((Boolean) C18103077d.LIZ.getValue()).booleanValue() && Looper.myLooper() == Looper.getMainLooper()) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0PN4
                public final /* synthetic */ int LLILZ = 10;

                @Override // java.lang.Runnable
                public final void run() {
                    C0PN8 c0pn8 = this.LL;
                    String str5 = str;
                    int i2 = i;
                    int i3 = this.LLILZ;
                    String str6 = str2;
                    String str7 = str3;
                    String str8 = str4;
                    c0pn8.getClass();
                    C1C7U.LIZ("SearchTopMixModel@4b99.searchMixFeedListFromAwemeDetail$1L");
                    try {
                        int i4 = c0pn8.LLJJIJIL;
                        C0PSG c0psg = c0pn8.LL;
                        WeakReference<C19EG> weakReference = c0pn8.LLIZ;
                        c0pn8.LJJJJ(str5, i2, i3, 0, str6, i4, c0psg, str7, str8, weakReference == null ? null : weakReference.get(), c0pn8.LJIILJJIL());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LIZIZ();
                    }
                    C1C7U.LIZIZ("SearchTopMixModel@4b99.searchMixFeedListFromAwemeDetail$1L");
                }
            });
            return;
        }
        int i2 = this.LLJJIJIL;
        C0PSG c0psg = this.LL;
        WeakReference<C19EG> weakReference = this.LLIZ;
        if (weakReference == null) {
            c19eg = null;
        } else {
            c19eg = weakReference.get();
        }
        LJJJJ(str, i, 10, 0, str2, i2, c0psg, str3, str4, c19eg, LJIILJJIL());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0660  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJ(java.lang.String r105, int r106, int r107, int r108, java.lang.String r109, int r110, X.C0PSG r111, java.lang.String r112, java.lang.String r113, android.content.Context r114, androidx.fragment.app.Fragment r115) {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PN8.LJJJJ(java.lang.String, int, int, int, java.lang.String, int, X.0PSG, java.lang.String, java.lang.String, android.content.Context, androidx.fragment.app.Fragment):void");
    }
}
