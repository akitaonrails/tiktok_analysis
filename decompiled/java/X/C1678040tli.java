package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {68}, m = "invokeSuspend")
public final class C1678040tli extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1678030tlh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678040tli(C1678030tlh c1678030tlh, InterfaceC1364105Vn<? super C1678040tli> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1678030tlh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1678040tli(this.LLILLJJLI, interfaceC1364105Vn);
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
            C1677580tky<Float, C1677280tkU> c1677580tky = this.LLILLJJLI.LIZ;
            Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
            C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.0f, 400.0f, C2286608xc.LIZLLL(0.5f), 1);
            this.LL = 1;
            if (C1677810tlL.LJ(c1677580tky, fLIZLLL, c1676890tjrLIZJ, true, AFwS266S0000000_25.get$arr$(418), this) == objLJFF) {
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
