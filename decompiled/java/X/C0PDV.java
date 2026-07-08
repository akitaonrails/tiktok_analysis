package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PDV implements C0PDR {
    public final C0PDU LL;
    public int LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public boolean LLJI;

    public final void LJI() {
        SearchMixFeedBase searchMixFeedBase;
        int i = 0;
        for (int i2 = 0; i2 < LJ().size(); i2++) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(LJ(), i2);
            if ((searchMixFeed != null && searchMixFeed.isAweme()) || ((searchMixFeedBase = (SearchMixFeedBase) ListProtector.get(LJ(), i2)) != null && Intrinsics.LJFF(C0PH8.LIZLLL(searchMixFeedBase, C0NMY.GENERAL_SEARCH, 2), Boolean.TRUE))) {
                while (i <= i2 && ListProtector.get(LJ(), i) != null) {
                    i++;
                }
                if (i <= i2) {
                    ListProtector.set(LJ(), i, ListProtector.get(LJ(), i2));
                    ListProtector.set(LJ(), i2, null);
                    i++;
                }
            }
        }
        while (i < LJ().size() && ListProtector.get(LJ(), i) != null) {
            i++;
        }
        if (i == 0) {
            return;
        }
        C0PIR.LIZ(Integer.valueOf(this.LLILLJJLI));
        Object obj = this.LL;
        LinkedList linkedList = new LinkedList(LJ().subList(0, i));
        C0PIR.LIZIZ(linkedList, this.LLILLJJLI, ((AbstractC1255880imo) this.LL).isHasMore());
        ((C0PN2) obj).LJIL(linkedList);
    }

    public final Map<String, List<SearchMixFeed>> LIZJ() {
        return (Map) this.LLILZIL.getValue();
    }

    public final List<SearchMixFeed> LJ() {
        return (List) this.LLILZ.getValue();
    }

    public final Aweme LJFF() {
        Object next;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF;
        C0PHI<T> config;
        C642240PHa c642240PHaLJFF;
        List items = ((AbstractC1255880imo) this.LL).getItems();
        if (items == null) {
            return null;
        }
        Iterator it2 = items.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) next;
            if (searchMixFeedBase.getFeedType() == 65280 || ((iSearchCardProtocolLJFF = C0PH8.LJFF(searchMixFeedBase, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), true)) != null && (config = iSearchCardProtocolLJFF.getConfig()) != 0 && (c642240PHaLJFF = config.LJFF()) != null && c642240PHaLJFF.LJII)) {
                break;
            }
        }
        SearchMixFeed searchMixFeed = (SearchMixFeed) next;
        if (searchMixFeed != null) {
            return C0NMZ.LIZ(searchMixFeed);
        }
        return null;
    }

    public final void LJII() {
        Aweme aweme;
        String aid;
        List<SearchMixFeed> listLJ = LJ();
        boolean z = listLJ == null || listLJ.isEmpty();
        Set set = (Set) this.LLILLL.getValue();
        if (z || (set == null || set.isEmpty())) {
            return;
        }
        for (String str : (Set) this.LLILLL.getValue()) {
            if (str.length() != 0 && (!C1839607Ik.LIZIZ() || !((Set) this.LLIZLLLIL.getValue()).contains(str))) {
                int size = LJ().size();
                for (int i = 0; i < size; i++) {
                    C0PLT c0plt = (C0PLT) ListProtector.get(LJ(), i);
                    if (c0plt != null && (aweme = c0plt.getAweme()) != null && (aid = aweme.getAid()) != null && aid.equals(str)) {
                        ListProtector.set(LJ(), i, null);
                        if (C1839607Ik.LIZ()) {
                            LIZJ().remove(str);
                            ((Map) this.LLILZLL.getValue()).remove(str);
                        }
                    }
                }
            }
        }
        LJI();
    }

    public final void LIZIZ(String str) {
        if (C1839607Ik.LIZIZ() && C123100dR.LIZ(str)) {
            ((Set) this.LLIZLLLIL.getValue()).add(str);
        }
    }

    public final Aweme LIZLLL(SearchMixFeed searchMixFeed) {
        Object next;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF;
        C0PHI<T> config;
        C642240PHa c642240PHaLJFF;
        if (searchMixFeed == null) {
            return LJFF();
        }
        List items = ((AbstractC1255880imo) this.LL).getItems();
        if (items == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(items.indexOf(searchMixFeed));
        if (numValueOf.intValue() < 0) {
            return null;
        }
        Iterator it2 = items.subList(numValueOf.intValue(), items.size()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) next;
                if (searchMixFeedBase.getFeedType() == 65280 || ((iSearchCardProtocolLJFF = C0PH8.LJFF(searchMixFeedBase, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), true)) != null && (config = iSearchCardProtocolLJFF.getConfig()) != 0 && (c642240PHaLJFF = config.LJFF()) != null && c642240PHaLJFF.LJII)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SearchMixFeed searchMixFeed2 = (SearchMixFeed) next;
        if (searchMixFeed2 == null) {
            return null;
        }
        return C0NMZ.LIZ(searchMixFeed2);
    }

    public C0PDV(C0PDU c0pdu, int i) {
        this.LL = c0pdu;
        this.LLILLJJLI = i;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, AFwS196S0000000_10.get$arr$(619));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, AFwS196S0000000_10.get$arr$(620));
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, AFwS196S0000000_10.get$arr$(618));
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, AFwS196S0000000_10.get$arr$(617));
        this.LLIZ = C452501pT.LIZ(enumC452301pR, AFwS196S0000000_10.get$arr$(622));
        this.LLIZLLLIL = C452501pT.LIZ(enumC452301pR, AFwS196S0000000_10.get$arr$(623));
        this.LLJ = C452501pT.LIZ(enumC452301pR, AFwS196S0000000_10.get$arr$(621));
    }

    @Override // X.C0PDR
    public final List<SearchMixFeed> LIZ(String str, boolean z) {
        SearchMixFeed searchMixFeed = null;
        if (!C1839607Ik.LIZ() || C2105908Mv.LIZ(str) || (z && C1839607Ik.LIZIZ())) {
            return null;
        }
        List items = ((AbstractC1255880imo) this.LL).getItems();
        if (z && !C2105908Mv.LIZ(str) && items != null && !items.isEmpty()) {
            str = "hotspot";
        } else if (str == null) {
            return null;
        }
        boolean zLJFF = Intrinsics.LJFF(((Map) this.LLILZLL.getValue()).get(str), Boolean.TRUE);
        List<SearchMixFeed> list = LIZJ().get(str);
        if (list != null) {
            Iterator<SearchMixFeed> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SearchMixFeed next = it2.next();
                if (next.isAggregatedVideo()) {
                    searchMixFeed = next;
                    break;
                }
            }
            SearchMixFeed searchMixFeed2 = searchMixFeed;
            if (searchMixFeed2 != null) {
                searchMixFeed2.setIsAggregatedVideoHistoryEntrance(zLJFF);
            }
            return list;
        }
        return null;
    }
}
