package X;

import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel$scheduleTopicTabReady$1", f = "ExploreFeedListViewModel.kt", l = {528}, m = "invokeSuspend")
public final class C1841850y1v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreFeedListViewModel LLILLJJLI;
    public final /* synthetic */ Function1<CopyOnWriteArrayList<ExploreCustomTopicResponse>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1841850y1v(ExploreFeedListViewModel exploreFeedListViewModel, Function1<? super CopyOnWriteArrayList<ExploreCustomTopicResponse>, Unit> function1, InterfaceC1364105Vn<? super C1841850y1v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreFeedListViewModel;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1841850y1v(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreFeedListViewModel@1463.scheduleTopicTabReady$1");
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
            ExploreFeedListViewModel exploreFeedListViewModel = this.LLILLJJLI;
            this.LL = 1;
            exploreFeedListViewModel.getClass();
            if (ExploreFeedListViewModel.xQ2(this) == objLJFF) {
                C1C7U.LIZIZ("ExploreFeedListViewModel@1463.scheduleTopicTabReady$1");
                return objLJFF;
            }
        }
        Function1<CopyOnWriteArrayList<ExploreCustomTopicResponse>, Unit> function1 = this.LLILLL;
        ExploreCustomTopicDataSource.Companion.getClass();
        function1.invoke(C1841760y1m.LIZ.getTopicRAMResponse());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedListViewModel@1463.scheduleTopicTabReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
