package X;

import Y.AgS290S0100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NW5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {509}, m = "invokeSuspend")
public final class C0NW5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NV4 LLILLJJLI;
    public final /* synthetic */ C13ES<C0NNS> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NW5(C0NV4 c0nv4, C13ES<C0NNS> c13es, InterfaceC1364105Vn<? super C0NW5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nv4;
        this.LLILLL = c13es;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NW5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            C2252331DDr c2252331DDrLIZIZ = this.LLILLJJLI.LIZIZ();
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLL, 3);
            this.LL = 1;
            c2252331DDrLIZIZ.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrLIZIZ, agS290S0100000_9, this) == objLJFF) {
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
