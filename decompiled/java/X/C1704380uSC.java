package X;

import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0uSC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel$loadMafUser$1", f = "PerformanceUserCardViewModel.kt", l = {270}, m = "invokeSuspend")
public final class C1704380uSC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PerformanceUserCardViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C1263870izh LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704380uSC(PerformanceUserCardViewModel performanceUserCardViewModel, boolean z, Function0<Unit> function0, C1263870izh c1263870izh, InterfaceC1364105Vn<? super C1704380uSC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = performanceUserCardViewModel;
        this.LLILLL = z;
        this.LLILZ = function0;
        this.LLILZIL = c1263870izh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704380uSC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PerformanceUserCardViewModel@63a3.loadMafUser$1");
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
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(569));
            C1DFB c1dfb = C0PEM.LIZJ;
            C1704370uSB c1704370uSB = new C1704370uSB(this.LLILZIL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1704370uSB);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PerformanceUserCardViewModel@63a3.loadMafUser$1");
                return objLJFF;
            }
        }
        AbstractC323330Clv<C1261860iwS> abstractC323330Clv = (AbstractC323330Clv) obj;
        C1910890zpH logger = this.LLILLJJLI.getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMafUser finished ");
        sbLIZ.append(abstractC323330Clv);
        logger.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.kl2(abstractC323330Clv, this.LLILLL);
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PerformanceUserCardViewModel@63a3.loadMafUser$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
