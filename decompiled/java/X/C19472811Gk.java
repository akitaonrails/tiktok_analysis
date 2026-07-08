package X;

import Y.AkS490S0100000_29;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19472811Gk extends AbstractC1639260slA<C11E7, DiscoverSectionList> {
    public final InterfaceC19253510Ub LIZ;
    public volatile int LIZIZ;
    public volatile boolean LIZJ;
    public long LIZLLL;

    public C19472811Gk() {
        InterfaceC19253510Ub.LIZ.getClass();
        this.LIZ = C09UY.LIZIZ;
        this.LIZJ = true;
    }

    public final C11ON LJ(final int i) {
        int i2;
        final Integer numValueOf = Integer.valueOf(ComplianceServiceProvider.LJIILIIL().LJIILL());
        final String strLJII = ComplianceServiceProvider.LJJI().LJII();
        if (this.LIZLLL == 0) {
            this.LIZLLL = System.currentTimeMillis();
        }
        InterfaceC19253510Ub interfaceC19253510Ub = this.LIZ;
        if (C1620340sGe.LIZ() && !C1620340sGe.LIZIZ) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        AbstractC19484711Kz<TrendingTopicList> abstractC19484711KzLIZ = interfaceC19253510Ub.LIZ(i, 10, Integer.valueOf(i2), numValueOf, strLJII);
        if (C1620340sGe.LIZ() && i == 0) {
            abstractC19484711KzLIZ = abstractC19484711KzLIZ.LJJI(new InterfaceC1487280oo2() { // from class: X.11Gl
                public final /* synthetic */ int LLILLL = 10;

                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    C1620340sGe.LIZ.getClass();
                    if (!C1620340sGe.LIZIZ) {
                        C1620340sGe.LIZIZ = true;
                        return this.LL.LIZ.LIZ(i, this.LLILLL, 0, numValueOf, strLJII);
                    }
                    return AbstractC19484711Kz.LJIILLIIL(th);
                }
            });
        }
        return new C11JZ(abstractC19484711KzLIZ.LJIL(new InterfaceC1487280oo2() { // from class: X.08xa
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return new Pair(obj, C11IR.LL);
            }
        }), new AkS490S0100000_29(this, 33)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.11CW
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                TrendingTopic trendingTopic = (TrendingTopic) obj;
                List<Aweme> items = trendingTopic.getItems();
                if (items != null) {
                    ArrayList arrayList = new ArrayList(items);
                    if (!C086I.LIZIZ(arrayList)) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ListProtector.set(arrayList, i3, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) ListProtector.get(arrayList, i3)));
                        }
                    }
                }
                if (trendingTopic.isPicAd()) {
                    return new TrendingTopicOrAd(trendingTopic.getAdData());
                }
                return new TrendingTopicOrAd(trendingTopic);
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.11Cb
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return new DiscoverSectionItem.TrendingTopicOrAdSection((TrendingTopicOrAd) obj);
            }
        });
    }

    @Override // X.C11T3
    public final C11NZ requestActual(Object obj) {
        final boolean z;
        C11NZ c11nzLJIIZILJ;
        C098D c098dLJL;
        C19476611Hw c19476611HwLJL;
        ArrayList<C11NZ> arrayList = new ArrayList();
        int i = ((C11E7) obj).cursor;
        boolean z2 = true;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LIZIZ = 0;
            this.LIZJ = true;
            Integer numValueOf = Integer.valueOf(ComplianceServiceProvider.LJIILIIL().LJIILL());
            InterfaceC19253510Ub.LIZ.getClass();
            arrayList.add(C09UY.LIZIZ.LIZIZ(1, numValueOf, ComplianceServiceProvider.LJJI().LJII()).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.11F7
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) {
                    String imprId;
                    BannerList bannerList = (BannerList) obj2;
                    LogPbBean logPbBean = bannerList.logPb;
                    if (logPbBean != null) {
                        imprId = logPbBean.getImprId();
                    } else {
                        imprId = null;
                    }
                    Iterator<Banner> it2 = bannerList.items.iterator();
                    while (it2.hasNext()) {
                        it2.next().setRequestId(imprId);
                    }
                    return AbstractC19484711Kz.LJIJJLI(bannerList.items);
                }
            }).LJIL(new InterfaceC1487280oo2() { // from class: X.11DK
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) {
                    return new DiscoverSectionItem.BannerSection((List) obj2);
                }
            }).LJJIJLIJ());
            arrayList.add(LJ(0));
        } else {
            arrayList.add(LJ(i));
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "discover_async_request_fix", true) != 2) {
            z2 = false;
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C11NZ c11nz : arrayList) {
                if (z) {
                    c19476611HwLJL = c11nz.LJJLI(C11IR.LL).LJL(C11S5.LIZ());
                } else {
                    c19476611HwLJL = c11nz.LJL(C11S5.LIZ());
                }
                arrayList2.add(c19476611HwLJL);
            }
            c11nzLJIIZILJ = C11NZ.LJJJLIIL(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C11NZ c11nz2 : arrayList) {
                if (z) {
                    c098dLJL = c11nz2.LJJLI(C11IR.LL);
                } else {
                    c098dLJL = c11nz2.LJL(C11S5.LIZ());
                }
                arrayList3.add(c098dLJL);
            }
            c11nzLJIIZILJ = C11NZ.LJIIZILJ(arrayList3);
        }
        return c11nzLJIIZILJ.LJLJLLL().LJIL(new InterfaceC1487280oo2() { // from class: X.11EY
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) throws Exception {
                List list = (List) obj2;
                if (z && list.isEmpty()) {
                    throw new Exception("api all went wrong");
                }
                C19371010qS.LIZLLL("discovery_client_show_time");
                return new DiscoverSectionList(list, this.LIZIZ, this.LIZJ, false, 8, null);
            }
        }).LJJIJLIJ().LJL(C11S5.LIZ());
    }
}
