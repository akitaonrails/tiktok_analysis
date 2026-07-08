package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$updateEffectAppliedStatus$1", f = "PCSBoardEffectManager.kt", l = {392}, m = "invokeSuspend")
public final class C01PQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C389701fL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PQ(boolean z, C389701fL c389701fL, InterfaceC1364105Vn<? super C01PQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("PCSBoardEffectManager@20d3.updateEffectAppliedStatus$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEffectAppliedStatus-> isApplied=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("-> _effectAppliedStateFlow=SUCCESSFULLY_APPLIED(true), DEFAULT_NOT_APPLIED(false)");
            C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C2252331DDr c2252331DDr = this.LLILLL.LIZJ;
            if (this.LLILLJJLI) {
                i = 2;
            } else {
                i = 0;
            }
            Integer numLJ = C2286608xc.LJ(i);
            this.LL = 1;
            if (c2252331DDr.emit(numLJ, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectManager@20d3.updateEffectAppliedStatus$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.updateEffectAppliedStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
