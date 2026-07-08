package X;

import Y.AgS200S0200000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {136}, m = "invokeSuspend")
public final class C0NVA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NV4 LLILLL;
    public final /* synthetic */ AbstractC1683020ttk LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVA(C0NV4 c0nv4, AbstractC1683020ttk abstractC1683020ttk, InterfaceC1364105Vn<? super C0NVA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0nv4;
        this.LLILZ = abstractC1683020ttk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NVA c0nva = new C0NVA(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0nva.LLILLJJLI = obj;
        return c0nva;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C2252331DDr c2252331DDrLIZIZ = this.LLILLL.LIZIZ();
            AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLILZ, interfaceC497601wk, 8);
            this.LL = 1;
            c2252331DDrLIZIZ.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrLIZIZ, agS200S0200000_9, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
