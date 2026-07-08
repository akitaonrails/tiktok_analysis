package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.returnpolicy.UsReturnPolicyVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.returnpolicy.UsReturnPolicyVH$onBind$1$1", f = "UsReturnPolicyVH.kt", l = {104}, m = "invokeSuspend")
public final class C825603Kk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UsReturnPolicyVH LLILLJJLI;
    public final /* synthetic */ C03KE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825603Kk(UsReturnPolicyVH usReturnPolicyVH, C03KE c03ke, InterfaceC1364105Vn<? super C825603Kk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = usReturnPolicyVH;
        this.LLILLL = c03ke;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825603Kk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("UsReturnPolicyVH@91d7.onBind$1$1");
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
            C1748720vbi.LIZLLL(this.LLILLJJLI.itemView, new C10516049i(), new AwS367S0200000_1(this.LLILLL, this.LLILLJJLI, 223));
            PDPReturnPolicyModule pDPReturnPolicyModule = this.LLILLL.LLILLJJLI;
            if (pDPReturnPolicyModule != null) {
                str = pDPReturnPolicyModule.jumpSchema;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                SmartRouter.buildRoute(this.LLILLJJLI.itemView.getContext(), ((PdpViewModel) this.LLILLJJLI.LLJJJJLIIL.getValue()).LLILZIL.LJII("c2144.d0", str, null)).open();
            } else {
                PdpViewModel pdpViewModel = (PdpViewModel) this.LLILLJJLI.LLJJJJLIIL.getValue();
                C825103Kf c825103Kf = new C825103Kf(this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                if (pdpViewModel.gS2(this, c825103Kf, false) == objLJFF) {
                    C1C7U.LIZIZ("UsReturnPolicyVH@91d7.onBind$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsReturnPolicyVH@91d7.onBind$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
