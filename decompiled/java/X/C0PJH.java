package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rerank.config.SearchInflowReRankConfig;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0PJH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PJH extends C0PI3 implements C0PIE, InterfaceC643540PMa {
    public static boolean LLLILZ;
    public final int LLJZIJLIL;
    public C0PJV LLL;
    public Function1<? super SearchMixFeed, Boolean> LLLF;
    public C0PJT LLLFF;
    public int LLLFFI;
    public SearchMixFeedList LLLFZ;
    public int LLLI;
    public final String LLLII;
    public final String LLLIIII;
    public Long LLLIIIIL;
    public String LLLIIIL;
    public final Map<String, String> LLLIIL;
    public final C0PJN LLLIILIL;
    public final AwS554S0100000_10 LLLIL;

    @Override // X.C0PI3, X.InterfaceC666850QDr
    public final void LJII() {
    }

    @Override // X.C0PI3
    public final void LJJIJIL() {
        this.LLL = null;
        if (C07DY.LIZ()) {
            this.LLLF = null;
        }
    }

    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.C0PIE
    public final void LIZJ() {
        C0PJV c0pjv = this.LLL;
        if (c0pjv != null) {
            c0pjv.LJJIFFI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[PHI: r0
      0x00a3: PHI (r0v26 X.0PIB) = (r0v25 X.0PIB), (r0v45 X.0PIB) binds: [B:27:0x007a, B:34:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0PI3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PJH.LJJIJIIJIL():void");
    }

    public final boolean LJJIJL() {
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        SearchMixFeedList searchMixFeedList = this.LLLFZ;
        boolean z = (searchMixFeedList != null ? searchMixFeedList.cursor : 0) == 0;
        C642250PHb c642250PHb = this.LLJLILLLLZIIL;
        if (c642250PHb != null) {
            final AwS554S0100000_10 awS554S0100000_10 = this.LLLIL;
            C0PHW c0phwLIZJ = c642250PHb.LIZ.LIZJ();
            int i = 0;
            while (true) {
                C642850PJj.LIZ.getClass();
                if (i < C642850PJj.LIZ().smartExecuteCount) {
                    if (c0phwLIZJ == null) {
                        break;
                    }
                    if (c642250PHb.LJII) {
                        C0PHX c0phx = c0phwLIZJ.LIZJ;
                        C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                        c0phx.LJ();
                        String str = c0phx.LJIIIZ;
                        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C0PIB.class));
                        C0PIB c0pib = (C0PIB) ((c640970PCd == null || (map2 = c640970PCd.LIZ) == null) ? null : map2.get(str));
                        if (c0pib != null && c0pib.LIZ) {
                            c0phwLIZJ = c0phwLIZJ.LIZ();
                        }
                    }
                    c0phwLIZJ = c0phwLIZJ.LIZ();
                    i++;
                } else if (c0phwLIZJ == null) {
                    break;
                }
            }
            C0PHW c0phwLIZJ2 = c642250PHb.LIZ.LIZJ();
            Aweme awemeLIZLLL = c0phwLIZJ2 != null ? c0phwLIZJ2.LIZLLL() : null;
            if (C642850PJj.LIZ().enableSmartLoadMore == 1) {
                C0N33 c0n33 = new C0N33();
                c0n33.LJIIJ = awemeLIZLLL;
                AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) C0PJS.LIZ.getValue();
                if (abstractC1511510pR7 != null) {
                    abstractC1511510pR7.runAsyncDelay(0L, c0n33, new InterfaceC1511740pRU() { // from class: X.0PJJ
                        @Override // X.InterfaceC1511740pRU
                        public final void LIZ(C1512100pS4 c1512100pS4) {
                            Map<String, Float> map3;
                            Float f;
                            C642850PJj.LIZ.getClass();
                            String str2 = C642850PJj.LIZ().label;
                            Function0<Unit> function0 = awS554S0100000_10;
                            if (c1512100pS4 != null && (map3 = c1512100pS4.LIZJ) != null && (f = map3.get(str2)) != null && f.floatValue() < C642850PJj.LIZ().scoreThreshold) {
                                function0.invoke();
                            }
                        }
                    });
                }
            }
        }
        C642250PHb c642250PHb2 = this.LLJLILLLLZIIL;
        if (c642250PHb2 != null) {
            C0PHW c0phwLIZJ3 = c642250PHb2.LIZ.LIZJ();
            int i2 = 0;
            while (true) {
                C0PDQ.LIZ.getClass();
                if (i2 >= C0PDQ.LIZJ(z)) {
                    if (c0phwLIZJ3 == null) {
                        break;
                    }
                    return false;
                }
                if (c0phwLIZJ3 == null) {
                    break;
                }
                if (c642250PHb2.LJII) {
                    C0PHX c0phx2 = c0phwLIZJ3.LIZJ;
                    C0P7A c0p7a2 = c0phx2.LIZ.LJIIIZ;
                    c0phx2.LJ();
                    String str2 = c0phx2.LJIIIZ;
                    C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(C0PIB.class));
                    C0PIB c0pib2 = (C0PIB) ((c640970PCd2 == null || (map = c640970PCd2.LIZ) == null) ? null : map.get(str2));
                    if (c0pib2 != null && c0pib2.LIZ) {
                        c0phwLIZJ3 = c0phwLIZJ3.LIZ();
                    }
                }
                c0phwLIZJ3 = c0phwLIZJ3.LIZ();
                i2++;
            }
        } else {
            C0PHY c0phyLIZJ = this.LLJJJJ.LIZJ();
            if (c0phyLIZJ != null) {
                C0PDQ.LIZ.getClass();
                int iLIZJ = C0PDQ.LIZJ(z);
                for (int i3 = 0; i3 < iLIZJ; i3++) {
                    c0phyLIZJ = c0phyLIZJ.LIZ();
                    if (c0phyLIZJ != null) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void LJJIJLIJ() {
        ISearchContextAbility iSearchContextAbilityLJI;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Integer num;
        if (this.LLJJJJ.LJFF() && (iSearchContextAbilityLJI = C0Q3E.LJI()) != null && (c0pcyPh1 = iSearchContextAbilityLJI.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null && (num = c0prc.LLJLLL) != null) {
            int iIntValue = num.intValue();
            C642860PJk.LIZ.getClass();
            C642870PJl c642870PJlLIZ = C642860PJk.LIZ(iIntValue);
            if (c642870PJlLIZ != null) {
                c642870PJlLIZ.LJFF = true;
            }
        }
        this.mListQueryType = 4;
        loadMoreList(null);
        this.mIsLoading = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    @Override // X.C0PDP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PJH.getAwemeList():java.util.List");
    }

    @Override // X.C0PI3, X.AbstractC1255880imo
    public final void onModelBound() {
        super.onModelBound();
        C0PIF c0pif = C0PIF.LIZ;
        List<SearchMixFeed> items = getItems();
        String str = this.LLJJJ.LIZIZ;
        Integer numValueOf = Integer.valueOf(this.LLJZIJLIL);
        c0pif.getClass();
        C0PIF.LIZLLL(numValueOf, str, items);
        List<Aweme> awemeList = getAwemeList();
        C0PIF.LJI(this.LLLFFI, this.LLJJJ.LIZIZ, awemeList, this.LLJJJJ.LJFF());
    }

    @Override // X.C0PI3, X.InterfaceC642940PJs
    public final String LIZIZ() {
        return this.LLLIIIL;
    }

    @Override // X.C0PI3, X.InterfaceC642940PJs
    public final Long LJI() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC643540PMa
    public final void LJIIIIZZ(boolean z) {
        C642250PHb c642250PHb = this.LLJLILLLLZIIL;
        if (c642250PHb != null) {
            c642250PHb.LJIIIZ = z;
        }
    }

    @Override // X.InterfaceC642940PJs
    public final int LJIIIZ(String str) {
        C641260PDg c641260PDg = this.LLJJLIIIJLLLLLLLZ;
        if (c641260PDg != null) {
            return c641260PDg.LJIIIZ(str);
        }
        return 0;
    }

    @Override // X.C0PI3, X.C0PN2
    /* JADX INFO: renamed from: LJIJI */
    public final /* bridge */ /* synthetic */ void handleData(SearchApiResult searchApiResult) throws JSONException {
        LJIJI((SearchMixFeedList) searchApiResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    @Override // X.C0PI3
    /* JADX INFO: renamed from: LJJIII */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PJH.LJIJI(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }

    @Override // X.C0PI3
    public final void LJJIIJ(SearchMixFeedList searchMixFeedList) {
        boolean z;
        int size;
        int iNextIndex;
        int size2;
        boolean z2;
        boolean z3;
        String aid;
        String aid2;
        if (C0A0H.LIZ() && searchMixFeedList != null) {
            List<SearchMixFeed> items = getItems();
            List<SearchMixFeed> list = searchMixFeedList.mItems;
            int i = this.LLJZIJLIL;
            if (searchMixFeedList.hasMore) {
                z = true;
            } else {
                z = false;
            }
            LinkedList linkedList = new LinkedList();
            if (list != null && !list.isEmpty()) {
                List<SearchMixFeed> list2 = (List) ((ConcurrentHashMap) C0PIR.LIZJ.getValue()).remove(Integer.valueOf(i));
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                int size3 = size + list.size();
                HashSet hashSet = new HashSet(items.size());
                Iterator<SearchMixFeed> it2 = items.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = it2.next().getAweme();
                    if (aweme != null) {
                        hashSet.add(aweme.getAid());
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                ArrayDeque arrayDeque2 = new ArrayDeque(size3);
                if (list2 != null) {
                    for (SearchMixFeed searchMixFeed : list2) {
                        Aweme aweme2 = searchMixFeed.getAweme();
                        if (aweme2 != null) {
                            aid2 = aweme2.getAid();
                        } else {
                            aid2 = null;
                        }
                        if (!C13LP.LJJJJ(aid2, hashSet)) {
                            if (C0PIR.LIZLLL(searchMixFeed)) {
                                arrayDeque.addLast(new Pair(searchMixFeed, 0));
                            } else {
                                arrayDeque2.addLast(searchMixFeed);
                            }
                        }
                    }
                }
                int i2 = 0;
                for (SearchMixFeed searchMixFeed2 : list) {
                    Aweme aweme3 = searchMixFeed2.getAweme();
                    if (aweme3 != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    if (!C13LP.LJJJJ(aid, hashSet)) {
                        if (C0PIR.LIZLLL(searchMixFeed2)) {
                            arrayDeque.addLast(new Pair(searchMixFeed2, Integer.valueOf(i2)));
                        } else {
                            arrayDeque2.addLast(searchMixFeed2);
                        }
                        i2++;
                    }
                }
                if (C0PJW.LIZ < 0) {
                    C0PJW.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 4, "search_ad_gap_inflow_min_gap", true);
                }
                int i3 = C0PJW.LIZ;
                ListIterator<SearchMixFeed> listIterator = items.listIterator(items.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (C0PIR.LIZLLL(listIterator.previous())) {
                            iNextIndex = listIterator.nextIndex();
                            if (iNextIndex >= 0) {
                                size2 = iNextIndex - items.size();
                            }
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                size2 = -i3;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    if (!(!arrayDeque2.isEmpty()) && !(!arrayDeque.isEmpty())) {
                        break;
                    }
                    Pair pair = (Pair) arrayDeque.peekFirst();
                    int size4 = linkedList.size();
                    if (size4 - size2 >= i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (pair != null && size4 >= ((Number) pair.getSecond()).intValue()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && z3 && (!arrayDeque.isEmpty())) {
                        linkedList.add(((Pair) arrayDeque.removeFirst()).getFirst());
                        size2 = size4;
                    } else if (!arrayDeque2.isEmpty()) {
                        linkedList.add(arrayDeque2.removeFirst());
                    } else {
                        while (!arrayDeque.isEmpty()) {
                            arrayList.add(((Pair) arrayDeque.removeFirst()).getFirst());
                        }
                    }
                }
                if (z) {
                    if (!arrayList.isEmpty()) {
                        ((ConcurrentHashMap) C0PIR.LIZJ.getValue()).put(Integer.valueOf(i), arrayList);
                    }
                } else {
                    linkedList.addAll(arrayList);
                }
                C844470XAv.LIZ.getClass();
                if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                    C0PIR.LJFF(z, iNextIndex, items, list2, "detail");
                }
            } else {
                Collection collection = (Collection) ((ConcurrentHashMap) C0PIR.LIZJ.getValue()).remove(Integer.valueOf(i));
                if (collection != null) {
                    linkedList.addAll(collection);
                }
            }
            searchMixFeedList.mItems = linkedList;
        }
    }

    @Override // X.C0PI3
    public final void LJJIJ(int i) {
        C0PJE c0pje = this.LLJLL;
        if (c0pje != null) {
            c0pje.LJI = i;
        }
    }

    @Override // X.C0PI3, X.C0PN2, X.AbstractC666100QAu
    public final /* bridge */ /* synthetic */ void handleData(Object obj) throws JSONException {
        LJIJI((SearchMixFeedList) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadMoreList(java.lang.Object... r16) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PJH.loadMoreList(java.lang.Object[]):void");
    }

    @Override // X.C0PI3
    public final boolean LJJI(int i, Aweme aweme) {
        return LJJIJL();
    }

    @Override // X.C0PI3
    public final void LJJII(Aweme aweme, AbstractC19875512pd abstractC19875512pd) {
        Pair<C0PHX, Aweme> pairLIZIZ;
        C0PHX first;
        C0PHX c0phx;
        C0PHX c0phxLJII;
        C0PHW c0phwLIZ;
        Object obj;
        HashMap<String, Object> map;
        C642250PHb c642250PHb = this.LLJLILLLLZIIL;
        if (c642250PHb != null && aweme != null && aweme.getAid() != null && !abstractC19875512pd.isEmpty()) {
            c642250PHb.LJFF = null;
            if (c642250PHb.LJII && (c0phwLIZ = c642250PHb.LIZ(aweme.getAid())) != null) {
                C0PHX c0phx2 = c0phwLIZ.LIZJ;
                C0P7A c0p7a = c0phx2.LIZ.LJIIIZ;
                c0phx2.LJ();
                String str = c0phx2.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C0PIB.class));
                if (c640970PCd != null && (map = c640970PCd.LIZ) != null) {
                    obj = map.get(str);
                } else {
                    obj = null;
                }
                C0PIB c0pib = (C0PIB) obj;
                if (c0pib != null && c0pib.LIZ) {
                    c642250PHb.LJII = false;
                    if (aweme.getAid().length() > 0) {
                        c642250PHb.LJI.add(aweme.getAid());
                        c642250PHb.LJIIIIZZ.add(aweme.getAid());
                    }
                    C0PIB c0pibLIZ = C0PIB.LIZ(c0pib, false, 2);
                    C0PHX c0phx3 = c0phwLIZ.LIZJ;
                    c0phx3.LJ();
                    String str2 = c0phx3.LJIIIZ;
                    C0P7A c0p7a2 = c0phwLIZ.LIZIZ.LJIIIZ;
                    String str3 = c0phwLIZ.LIZ;
                    C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(C0PIB.class));
                    if (c640970PCd2 == null) {
                        c640970PCd2 = new C640970PCd();
                        c0p7a2.LIZ.put(C13LE.LIZ(C0PIB.class), c640970PCd2);
                    }
                    HashMap<String, Object> map2 = c640970PCd2.LIZIZ;
                    if (map2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append(str2);
                        map2.put(C2188811AlT.LIZIZ(sbLIZ), c0pibLIZ);
                    }
                }
            }
            if ((c642250PHb.LIZLLL || abstractC19875512pd.size() <= 1) && !c642250PHb.LJ) {
                Iterator it2 = abstractC19875512pd.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        String aid = ((Aweme) it2.next()).getAid();
                        if (aid != null && aid.equals(aweme.getAid())) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i == abstractC19875512pd.size() - 1 && (pairLIZIZ = c642250PHb.LIZIZ()) != null && (first = pairLIZIZ.getFirst()) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pairLIZIZ.getSecond());
                    List<Aweme> listInvoke = c642250PHb.LIZIZ.invoke();
                    if (c642250PHb.LIZJ.invoke(arrayList, Integer.valueOf(listInvoke.size()), listInvoke).booleanValue()) {
                        c642250PHb.LJII = true;
                        C0PHW c0phwLIZJ = c642250PHb.LIZ.LIZJ();
                        if (c0phwLIZJ != null && (c0phx = c0phwLIZJ.LIZJ) != null && (c0phxLJII = c0phx.LJII()) != null) {
                            first.LIZLLL = null;
                            first.LJ = c0phxLJII;
                            c0phxLJII.LIZLLL = first;
                        }
                        if (((Number) C1821807Bo.LIZ.getValue()).intValue() == 2) {
                            String str4 = c642250PHb.LJIIJ;
                            if (str4 == null) {
                                str4 = "";
                            }
                            C1483340ohg.LIZIZ(str4, "", "general_search", arrayList, false, false, false);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C0PI3, X.InterfaceC666850QDr
    public final void LJ(int i, int i2, Aweme aweme) {
        int count;
        C0SR4 c0sr4;
        ISearchContextAbility iSearchContextAbilityLJI;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Integer num;
        String strLIZJ = null;
        if (isHasMore() && this.LLJJJJ.LJFF() && (iSearchContextAbilityLJI = C0Q3E.LJI()) != null && (c0pcyPh1 = iSearchContextAbilityLJI.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null && (num = c0prc.LLJLLL) != null) {
            int iIntValue = num.intValue();
            C642860PJk.LIZ.getClass();
            C642870PJl c642870PJlLIZ = C642860PJk.LIZ(iIntValue);
            if (c642870PJlLIZ != null) {
                if (c642870PJlLIZ.LJ == C0N2P.REQUEST_START) {
                    if (c642870PJlLIZ.LJI == null) {
                        c642870PJlLIZ.LJI = Long.valueOf(SystemClock.elapsedRealtime());
                    }
                } else {
                    c642870PJlLIZ.LJI = null;
                }
            }
        }
        if (i != C1509470pNp.LJI) {
            String str = this.LLLIIII;
            SearchMixFeedList searchMixFeedList = this.LLLFZ;
            if (searchMixFeedList != null) {
                strLIZJ = C0PI4.LIZJ(searchMixFeedList);
            }
            int i3 = this.LLLI;
            String str2 = this.LLLII;
            String str3 = this.LLLIIII;
            Map<String, String> map = this.LLLIIL;
            WeakReference<C0SR4> weakReference = C1509470pNp.LIZIZ;
            if (weakReference != null && (c0sr4 = weakReference.get()) != null) {
                count = c0sr4.getCount();
            } else {
                count = -1;
            }
            C1509470pNp.LIZLLL = count;
            C1509470pNp.LJFF = C1509470pNp.LIZJ();
            C0PJZ<C0PJY> c0pjz = new C0PJZ<C0PJY>() { // from class: X.0PJY
            };
            c0pjz.LJ("unique_request_id", String.valueOf(C1509470pNp.LIZJ));
            c0pjz.LJ("recent_video_playtime", C1509470pNp.LJFF);
            c0pjz.LJ("access_type", C1509470pNp.LIZ());
            c0pjz.LIZLLL(C1479130oat.LJII(), "internet_speed");
            c0pjz.LJ("search_id", str);
            c0pjz.LJ("search_keyword", str3);
            c0pjz.LJ("inner_search_id", strLIZJ);
            c0pjz.LIZLLL(C1509470pNp.LIZIZ(str2), "is_fullscreen");
            c0pjz.LIZLLL(i3, "load_rank");
            c0pjz.LIZLLL(C1509470pNp.LJ(map), "is_inner");
            c0pjz.LJIILJJIL();
            C1509470pNp.LJI = i;
            C1509470pNp.LJII = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    @Override // X.C0PI3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme r20, X.AbstractC19875512pd r21, X.AbstractC19875512pd r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PJH.LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme, X.12pd, X.12pd):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103 A[PHI: r1
      0x0103: PHI (r1v20 com.ss.android.ugc.aweme.feed.model.Aweme) = (r1v19 com.ss.android.ugc.aweme.feed.model.Aweme), (r1v27 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:42:0x00da, B:49:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C0PI3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> LJJIJIIJI(com.ss.android.ugc.aweme.feed.model.Aweme r12, X.C0PN8 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PJH.LJJIJIIJI(com.ss.android.ugc.aweme.feed.model.Aweme, X.0PN8, int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[PHI: r8
      0x00ae: PHI (r8v6 X.0PIB) = (r8v5 X.0PIB), (r8v11 X.0PIB) binds: [B:31:0x0085, B:38:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    @Override // X.C0PI3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(int r20, float r21, int r22, com.ss.android.ugc.aweme.feed.model.Aweme r23) {
        /*
            Method dump skipped, instruction units count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PJH.LJJIIZ(int, float, int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C0PJH(C0PI7 c0pi7, List list, AbstractC19875512pd abstractC19875512pd, C0PHT c0pht, int i, C0PJV c0pjv, AwS376S0200000_10 awS376S0200000_10, C0PSG c0psg, InterfaceC642370PHn interfaceC642370PHn) {
        C0PJN c0pjn;
        C00BS c00bs;
        C0PJ8 c0pj8;
        C0PJ9 c0pj9;
        super(c0pi7, abstractC19875512pd, c0pht, c0psg, interfaceC642370PHn);
        this.LLJZIJLIL = i;
        this.LLL = c0pjv;
        this.LLLF = awS376S0200000_10;
        this.LLLII = "";
        this.LLLIIII = "";
        this.LLLIIL = new LinkedHashMap();
        if (C1210604oS.LIZ()) {
            c0pjn = new C0PJN();
        } else {
            c0pjn = null;
        }
        this.LLLIILIL = c0pjn;
        LJIL(list);
        if (c0pht.LJFF()) {
            this.LLJLILLLLZIIL = new C642250PHb(c0pht, new C0PII(this), new C0PJI(this));
        }
        if (c0pht.LJFF()) {
            C01GW c01gw = C0PJR.LIZIZ;
            if (((SearchInflowReRankConfig) c01gw.getValue()).enableInflowReRank == 1) {
                int i2 = ((SearchInflowReRankConfig) c01gw.getValue()).reRankTiming;
                if (i2 == 1 || i2 != 2) {
                    c00bs = C00BS.RERANK_ON_SCROLLING;
                } else {
                    c00bs = C00BS.RERANK_ON_SELECTED;
                }
                int i3 = ((SearchInflowReRankConfig) c01gw.getValue()).reRankPosition;
                if (i3 == 1 || i3 != 2) {
                    c0pj8 = C0PJ8.RERANK_NEXT;
                } else {
                    c0pj8 = C0PJ8.RERANK_SKIP;
                }
                int i4 = ((SearchInflowReRankConfig) c01gw.getValue()).reRankType;
                if (i4 == 1 || i4 != 2) {
                    c0pj9 = C0PJ9.RERANK_SWAP;
                } else {
                    c0pj9 = C0PJ9.RERANK_ALL;
                }
                this.LLJLL = new C0PJE(c0pht, new C642360PHm(c00bs, c0pj8, c0pj9), new C0PJF(this), new C0PIJ(this), new C640300P9o(this));
            }
        }
        c0pht.LJIILIIL = this;
        if (C292480BdG.LIZ()) {
            C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
            this.LLJJI = c0prc.LLILLL;
            this.LLLIIII = c0prc.LLIZLLLIL;
            this.LLLII = c0prc.LLLLIL;
        } else {
            this.LLJJI = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
            this.LLLIIII = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL;
            this.LLLII = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLLLIL;
        }
        this.LLLIL = new AwS554S0100000_10(this, 724);
    }
}
