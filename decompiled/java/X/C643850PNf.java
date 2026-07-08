package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0PNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643850PNf extends C1515820pY4<SearchMixFeedList> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final LinkedBlockingDeque<C0PO0> LLIZ;

    public C643850PNf(final LinkedBlockingDeque<C0PO0> linkedBlockingDeque) {
        super(new InterfaceC644200POo<SearchMixFeedList>(linkedBlockingDeque) { // from class: X.0POD
            public final LinkedBlockingDeque<C0PO0> LIZ;

            {
                this.LIZ = linkedBlockingDeque;
            }

            @Override // X.InterfaceC644200POo
            public final void LIZ(C0POE<SearchMixFeedList> c0poe) {
                C0PO0 c0po0Poll;
                while (true) {
                    try {
                        c0po0Poll = this.LIZ.poll(30L, TimeUnit.SECONDS);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (c0po0Poll != null) {
                        int i = c0po0Poll.LIZ;
                        if (i != -1) {
                            if (i != 0) {
                                if (i == 1 && c0poe != null) {
                                    c0poe.onNext((SearchMixFeedList) c0po0Poll.LIZIZ);
                                }
                            } else {
                                if (c0poe != null) {
                                    c0poe.onComplete();
                                    return;
                                }
                                return;
                            }
                        } else {
                            if (c0poe != null) {
                                c0poe.onFailed(c0po0Poll.LIZJ);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        });
        this.LLIZ = linkedBlockingDeque;
    }

    public static void LJFF(SearchMixFeedList searchMixFeedList) {
        PreRenderInfo preRenderInfo;
        List<PreRenderCard> list;
        if (searchMixFeedList.resultStatus == 11 && (preRenderInfo = searchMixFeedList.preRenderInfo) != null && (list = preRenderInfo.preRenderCards) != null) {
            Map<EnumC648930Pcp, List<? extends InterfaceC342110Db7>> map = C648950Pcr.LIZ;
            int i = searchMixFeedList.resultType;
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), null, null, new C342100Db6(i, list, null), 3);
            if (C1011530cQh.LIZ().enablePreloadWhenAdsRecall) {
                C0POS.LIZ.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), null, null, new C329360Cve(list, null), 3);
            }
        }
    }

    public final void LJ(SearchMixFeedList searchMixFeedList) {
        Object next;
        SearchMixFeedList searchMixFeedList2;
        if (((Number) C079F.LIZ.getValue()).intValue() != 1 && searchMixFeedList.ack == 1 && !this.LLIZ.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.LLIZ.drainTo(arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C0PO0 c0po0 = (C0PO0) next;
                    if (c0po0.LIZ == 1) {
                        Object obj = c0po0.LIZIZ;
                        if ((obj instanceof SearchMixFeedList) && ((SearchMixFeedList) obj).resultStatus == 2) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0PO0 c0po02 = (C0PO0) next;
            if (c0po02 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C09F4.LIZLLL.LIZ(c0po02.LIZIZ, searchMixFeedList.patchs);
                C0PA3 c0pa3 = SearchHubEntityCard.Companion;
                Object obj2 = c0po02.LIZIZ;
                if (obj2 instanceof SearchMixFeedList) {
                    searchMixFeedList2 = (SearchMixFeedList) obj2;
                } else {
                    searchMixFeedList2 = null;
                }
                c0pa3.getClass();
                C0PA3.LIZ(searchMixFeedList2, null);
                searchMixFeedList.LLJI = 1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pre patch cost=");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLIZ.addAll(arrayList);
        }
    }
}
