package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$removeCurrentEffectResource$1$1", f = "PCSBoardEffectManager.kt", l = {490}, m = "invokeSuspend")
public final class C01PR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C389701fL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PR(C389701fL c389701fL, InterfaceC1364105Vn<? super C01PR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.removeCurrentEffectResource$1$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LIZJ;
            Integer numLJ = C2286608xc.LJ(0);
            this.LL = 1;
            if (c2252331DDr.emit(numLJ, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectManager@20d3.removeCurrentEffectResource$1$1");
                return objLJFF;
            }
        }
        C392901fr.LIZ("removeCurrentEffectResource-> effectAppliedStateFlow.value=DEFAULT_NOT_APPLIED");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.removeCurrentEffectResource$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
