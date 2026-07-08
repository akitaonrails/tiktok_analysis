package X;

import Y.AgS200S0200000_9;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NV9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
public final class C0NV9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NV4 LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NV9(C0NV4 c0nv4, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C0NV9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nv4;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NV9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            ArrayList arrayList = new ArrayList();
            C2252331DDr c2252331DDrLIZIZ = this.LLILLJJLI.LIZIZ();
            AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(arrayList, this.LLILLL, 12);
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
