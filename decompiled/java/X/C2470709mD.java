package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09mD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel$preloadAwemeDetails$2", f = "EffectRecommendationCarouselViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2470709mD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EffectRecommendationCarouselViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470709mD(EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC1364105Vn<? super C2470709mD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effectRecommendationCarouselViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2470709mD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Aweme aweme;
        String aid;
        C1C7U.LIZ("EffectRecommendationCarouselViewModel@7d94.preloadAwemeDetails$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C197103129t c197103129t = (C197103129t) this.LL.LLILZIL.getValue();
        Unit unit = null;
        if (c197103129t != null) {
            EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LL;
            try {
                DetailFeedService detailFeedService = (DetailFeedService) ServiceManager.get().getService(DetailFeedService.class);
                List<CardContent> list = c197103129t.LIZJ;
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator<CardContent> it2 = list.iterator();
                    while (it2.hasNext()) {
                        List<Aweme> list2 = it2.next().awemeList;
                        if (list2 != null && (aweme = (Aweme) C13LP.LJJJLL(list2)) != null && (aid = aweme.getAid()) != null) {
                            arrayList.add(aid);
                        }
                    }
                } else {
                    arrayList = null;
                }
                List<Aweme> list3 = detailFeedService.LIZJ(String.valueOf(arrayList), null).items;
                if (list3 != null) {
                    Iterator<Aweme> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((ArrayList) effectRecommendationCarouselViewModel.LLJIJIL).add(it3.next());
                    }
                    unit = Unit.LIZ;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C20012313Rx.LIZIZ, "preloadAwemeDetails IOException", e);
                unit = Unit.LIZ;
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C201955140j.LJIIJ(C20012313Rx.LIZIZ, "preloadAwemeDetails RuntimeException", e2);
                unit = Unit.LIZ;
            }
        }
        C1C7U.LIZIZ("EffectRecommendationCarouselViewModel@7d94.preloadAwemeDetails$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
