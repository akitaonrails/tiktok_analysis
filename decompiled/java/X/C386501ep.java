package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.assem.arch.viewModel.internal.FlowViewModelDispatcher$collectWithLifecycle$job$1", f = "FlowViewModelDispatcher.kt", l = {296}, m = "invokeSuspend")
public final class C386501ep extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLJJLI;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLL;
    public final /* synthetic */ Function1<Object, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C386501ep(InterfaceC346201Wa<Object> interfaceC346201Wa, Function1<? super Throwable, Unit> function1, Function1<Object, Unit> function12, InterfaceC1364105Vn<? super C386501ep> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C386501ep(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowViewModelDispatcher@90a7.collectWithLifecycle$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C861640Xr8 c861640Xr8 = new C861640Xr8(new C386601eq(this.LLILZ, null), this.LLILLJJLI);
                this.LL = 1;
                if (C09IC.LJI(c861640Xr8, this) == objLJFF) {
                    C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.collectWithLifecycle$job$1");
                    return objLJFF;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.invoke(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.collectWithLifecycle$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
