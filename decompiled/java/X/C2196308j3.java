package X;

import Y.AgS284S0100000_3;
import com.ss.android.ugc.aweme.dynamic.card.IMDynamicCardOpenServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.preserve.data.DynamicCardPreserveDataMgr$subscribeRegisterPreserveDataEvent$1", f = "DynamicCardPreserveDataMgr.kt", l = {140}, m = "invokeSuspend")
public final class C2196308j3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2184008h4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2196308j3(C2184008h4 c2184008h4, InterfaceC1364105Vn<? super C2196308j3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2184008h4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2196308j3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DynamicCardPreserveDataMgr@a13.subscribeRegisterPreserveDataEvent$1");
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
            C2252331DDr c2252331DDr = IMDynamicCardOpenServiceImpl.LJ;
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLILLJJLI, 34);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.subscribeRegisterPreserveDataEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.subscribeRegisterPreserveDataEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
