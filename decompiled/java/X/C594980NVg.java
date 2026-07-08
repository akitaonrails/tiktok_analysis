package X;

import Y.AgS75S0400000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
public final class C594980NVg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1680280tpK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594980NVg(C1680280tpK c1680280tpK, InterfaceC1364105Vn<? super C594980NVg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1680280tpK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594980NVg(this.LLILLJJLI, interfaceC1364105Vn);
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
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            C118300cf c118300cf3 = new C118300cf();
            C2252331DDr c2252331DDrLIZIZ = this.LLILLJJLI.LLJJ.LIZIZ();
            AgS75S0400000_9 agS75S0400000_9 = new AgS75S0400000_9(c118300cf, c118300cf2, c118300cf3, this.LLILLJJLI, 0);
            this.LL = 1;
            c2252331DDrLIZIZ.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrLIZIZ, agS75S0400000_9, this) == objLJFF) {
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
