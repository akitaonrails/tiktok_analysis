package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRenderRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi$Companion$partialRenderOsp$2", f = "OrderSubmitApi.kt", l = {472}, m = "invokeSuspend")
public final class C844603Rs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C03QD>, Object> {
    public int LL;
    public final /* synthetic */ BillInfoRenderRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844603Rs(BillInfoRenderRequest billInfoRenderRequest, InterfaceC1364105Vn<? super C844603Rs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = billInfoRenderRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844603Rs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitApi$Companion@33ec.partialRenderOsp$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C03QD c03qd = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                long j = EcPaymentIndependentPriceConfigSettings.LIZJ().requestTimeOut;
                C844903Rv c844903Rv = new C844903Rv(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C099A.LIZIZ(j, c844903Rv, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OrderSubmitApi$Companion@33ec.partialRenderOsp$2");
                    return objLJFF;
                }
            }
            c03qd = (C03QD) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        C1C7U.LIZIZ("OrderSubmitApi$Companion@33ec.partialRenderOsp$2");
        return c03qd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C03QD> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
