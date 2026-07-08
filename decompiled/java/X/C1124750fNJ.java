package X;

import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fNJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.api.revenue.strategy.base.BaseIncentiveTask$taskStatusLegalCheck$1", f = "BaseIncentiveTask.kt", l = {357}, m = "invokeSuspend")
public final class C1124750fNJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1134410fct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124750fNJ(C1134410fct c1134410fct, InterfaceC1364105Vn<? super C1124750fNJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1134410fct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1124750fNJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C006A c006aLIZJ;
        TaskManagerV2 taskManagerV2KE0;
        C1C7U.LIZ("BaseIncentiveTask@25a1.taskStatusLegalCheck$1");
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
            try {
                c006aLIZJ = C1161920gLG.LIZJ(IRevenueStrategyService.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c006aLIZJ = null;
            }
            IRevenueStrategyService iRevenueStrategyService = (IRevenueStrategyService) c006aLIZJ;
            if (iRevenueStrategyService != null && (taskManagerV2KE0 = iRevenueStrategyService.KE0()) != null) {
                C1134410fct c1134410fct = this.LLILLJJLI;
                long j = ((TaskInfo) c1134410fct.LIZ).taskCompleteTargetNum;
                this.LL = 1;
                if (taskManagerV2KE0.LJIJJLI(c1134410fct, j, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseIncentiveTask@25a1.taskStatusLegalCheck$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseIncentiveTask@25a1.taskStatusLegalCheck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
