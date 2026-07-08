package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0whb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.assem.arch.viewModel.internal.FlowViewModelDispatcher$filterActive$1", f = "FlowViewModelDispatcher.kt", l = {353}, m = "invokeSuspend")
public final class C1790810whb extends C09AX implements Function2<C094D<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ Function0<Boolean> LLILZ;
    public final /* synthetic */ InterfaceC1790830whd LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790810whb(InterfaceC346201Wa<Object> interfaceC346201Wa, Function0<Boolean> function0, InterfaceC1790830whd interfaceC1790830whd, InterfaceC1364105Vn<? super C1790810whb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = function0;
        this.LLILZIL = interfaceC1790830whd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1790810whb c1790810whb = new C1790810whb(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1790810whb.LLILLJJLI = obj;
        return c1790810whb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1790830whd interfaceC1790830whd;
        C259800zU c259800zU;
        InterfaceC1790830whd interfaceC1790830whd2;
        C1C7U.LIZ("FlowViewModelDispatcher@90a7.filterActive$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c259800zU = (C259800zU) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C094D c094d = (C094D) this.LLILLJJLI;
                c259800zU = new C259800zU();
                try {
                    C861640Xr8 c861640Xr8 = new C861640Xr8(new C1790820whc(this.LLILZ, c094d, this.LLILZIL, c259800zU, null), this.LLILLL);
                    this.LLILLJJLI = c259800zU;
                    this.LL = 1;
                    if (C09IC.LJI(c861640Xr8, this) == objLJFF) {
                        C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.filterActive$1");
                        return objLJFF;
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    Function0<Unit> function0 = (Function0) c259800zU.element;
                    if (function0 != null && (interfaceC1790830whd = this.LLILZIL) != null) {
                        interfaceC1790830whd.Sd(function0);
                    }
                    throw th;
                }
            }
            Function0<Unit> function02 = (Function0) c259800zU.element;
            if (function02 != null && (interfaceC1790830whd2 = this.LLILZIL) != null) {
                interfaceC1790830whd2.Sd(function02);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.filterActive$1");
            return unit;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<Object> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
