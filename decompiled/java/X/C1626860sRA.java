package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sRA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.SlideSlipIdleReportingComponent$onCreate$1", f = "SlideSlipIdleReportingComponent.kt", l = {48}, m = "invokeSuspend")
public final class C1626860sRA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1626840sR8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626860sRA(C1626840sR8 c1626840sR8, InterfaceC1364105Vn<? super C1626860sRA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1626840sR8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626860sRA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlideSlipIdleReportingComponent@cdeb.onCreate$1");
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
            C1698270uIL c1698270uIL = new C1698270uIL(new C914080ZtW(new C1698270uIL(this.LLILLJJLI.j0(), 15), 1), 16);
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 28);
            this.LL = 1;
            if (c1698270uIL.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("SlideSlipIdleReportingComponent@cdeb.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlideSlipIdleReportingComponent@cdeb.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
