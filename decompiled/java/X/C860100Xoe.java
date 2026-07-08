package X;

import Y.AgS297S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xoe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.player.SearchAdPlayerModule$initVideoPlayStateSubscribe$1$1$1", f = "SearchAdPlayerModule.kt", l = {121}, m = "invokeSuspend")
public final class C860100Xoe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1010790cPV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860100Xoe(C1010790cPV c1010790cPV, InterfaceC1364105Vn<? super C860100Xoe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1010790cPV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860100Xoe(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdPlayerModule@3d3c.initVideoPlayStateSubscribe$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1010790cPV c1010790cPV = this.LLILLJJLI;
            AnonymousClass0950 anonymousClass0950 = c1010790cPV.LLIZ.LIZJ;
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(c1010790cPV, 20);
            this.LL = 1;
            if (anonymousClass0950.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdPlayerModule@3d3c.initVideoPlayStateSubscribe$1$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
