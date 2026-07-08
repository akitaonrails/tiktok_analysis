package X;

import Y.AgS284S0100000_3;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08jD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget$initSubscribe$1", f = "PdpHeadNavBarWidget.kt", l = {378}, m = "invokeSuspend")
public final class C2197308jD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpHeadNavBarWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197308jD(PdpHeadNavBarWidget pdpHeadNavBarWidget, InterfaceC1364105Vn<? super C2197308jD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpHeadNavBarWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2197308jD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpHeadNavBarWidget@7218.initSubscribe$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            PdpHeadNavBarWidget pdpHeadNavBarWidget = this.LLILLJJLI;
            AnonymousClass0951 anonymousClass0951 = pdpHeadNavBarWidget.LLLF.LLILLJJLI;
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(pdpHeadNavBarWidget, 36);
            this.LL = 1;
            if (anonymousClass0951.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("PdpHeadNavBarWidget@7218.initSubscribe$1");
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
