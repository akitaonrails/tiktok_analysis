package X;

import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel$restartRefreshSkylightDataDelayJob$1", f = "FeedSkylightListViewModel.kt", l = {901}, m = "invokeSuspend")
public final class C1572220r12 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FeedSkylightListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572220r12(FeedSkylightListViewModel feedSkylightListViewModel, InterfaceC1364105Vn<? super C1572220r12> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = feedSkylightListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1572220r12(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSkylightListViewModel@458.restartRefreshSkylightDataDelayJob$1");
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
            long j = this.LLILLJJLI.LLILZLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FeedSkylightListViewModel@458.restartRefreshSkylightDataDelayJob$1");
                return objLJFF;
            }
        }
        FeedSkylightListViewModel feedSkylightListViewModel = this.LLILLJJLI;
        if (!feedSkylightListViewModel.LLJJJIL) {
            FeedSkylightListViewModel.OQ2(feedSkylightListViewModel, EnumC1582650rHr.POLLING, "auto", false, null, null, 28);
        } else {
            feedSkylightListViewModel.RQ2();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedSkylightListViewModel@458.restartRefreshSkylightDataDelayJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
