package X;

import Y.AgS206S0200000_20;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.StrategyGraphContainer$registerStrategyCallback$job$1", f = "StrategyGraphContainer.kt", l = {184, 184}, m = "invokeSuspend")
public final class C1306040k5i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1306250k63 LLILLJJLI;
    public final /* synthetic */ C1306400k6I LLILLL;
    public final /* synthetic */ Function1<C1306060k5k, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306040k5i(C1306250k63 c1306250k63, C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1, InterfaceC1364105Vn<? super C1306040k5i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1306250k63;
        this.LLILLL = c1306400k6I;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306040k5i(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrategyGraphContainer@a2bb.registerStrategyCallback$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StrategyGraphContainer@a2bb.registerStrategyCallback$job$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1306250k63 c1306250k63 = this.LLILLJJLI;
            String str = this.LLILLL.LIZ;
            this.LL = 1;
            obj = c1306250k63.LJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StrategyGraphContainer@a2bb.registerStrategyCallback$job$1");
                return objLJFF;
            }
        }
        AgS206S0200000_20 agS206S0200000_20 = new AgS206S0200000_20(this.LLILZ, this.LLILLL, 0);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS206S0200000_20, this) == objLJFF) {
            C1C7U.LIZIZ("StrategyGraphContainer@a2bb.registerStrategyCallback$job$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StrategyGraphContainer@a2bb.registerStrategyCallback$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
