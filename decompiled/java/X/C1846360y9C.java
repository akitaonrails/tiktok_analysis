package X;

import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel$onShow$2", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1846360y9C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LL;
    public final /* synthetic */ ExploreLynxParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846360y9C(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, ExploreLynxParams exploreLynxParams, InterfaceC1364105Vn<? super C1846360y9C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exploreTopicGeneralFeedListViewModel;
        this.LLILLJJLI = exploreLynxParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1846360y9C(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onShow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.NQ2("lynx_schema_jump");
        this.LL.vQ2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onShow$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
