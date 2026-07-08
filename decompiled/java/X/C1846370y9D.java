package X;

import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y9D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel$scheduleLynxTopicPrefetchOverlay$1", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {834}, m = "invokeSuspend")
public final class C1846370y9D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846370y9D(long j, ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, InterfaceC1364105Vn<? super C1846370y9D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = exploreTopicGeneralFeedListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1846370y9D(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.scheduleLynxTopicPrefetchOverlay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C15TW c15tw = C15TW.LIZ;
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (C15TW.LIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.scheduleLynxTopicPrefetchOverlay$1");
                return objLJFF;
            }
        }
        this.LLILLL.PQ2(this.LLILLJJLI);
        this.LLILLL.LLJZ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.scheduleLynxTopicPrefetchOverlay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
