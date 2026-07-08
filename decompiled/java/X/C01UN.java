package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01UN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.mob.TakoRecyclerViewScroller$scrollFrameDeteriorationExperiment$1", f = "TakoRecyclerViewScroller.kt", l = {130}, m = "invokeSuspend")
public final class C01UN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01UN(int i, long j, InterfaceC1364105Vn<? super C01UN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01UN c01un = new C01UN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c01un.LLILLJJLI = obj;
        return c01un;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("TakoRecyclerViewScroller@4097.scrollFrameDeteriorationExperiment$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            Thread.sleep(this.LLILLL);
            long j = this.LLILZ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TakoRecyclerViewScroller@4097.scrollFrameDeteriorationExperiment$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoRecyclerViewScroller@4097.scrollFrameDeteriorationExperiment$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
