package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03dV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel$bindAndSetPrimary$1", f = "CCDCAddCardViewModel.kt", l = {1528}, m = "invokeSuspend")
public final class C887903dV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CCDCAddCardViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C887903dV(CCDCAddCardViewModel cCDCAddCardViewModel, InterfaceC1364105Vn<? super C887903dV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cCDCAddCardViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C887903dV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C887503dR c887503dR;
        C1C7U.LIZ("CCDCAddCardViewModel@23a2.bindAndSetPrimary$1");
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
            CCDCAddCardViewModel cCDCAddCardViewModel = this.LLILLJJLI;
            EnterParams enterParams = cCDCAddCardViewModel.LLILLJJLI;
            PaymentInfo paymentInfo = cCDCAddCardViewModel.LLJJJJJIL;
            String str = cCDCAddCardViewModel.LLJJJJ;
            PaymentMethodsData paymentMethodsData = null;
            if (enterParams != null) {
                c887503dR = enterParams.LJJIJL;
                paymentMethodsData = enterParams.paymentData;
            } else {
                c887503dR = null;
            }
            C1077804Jk c1077804Jk = new C1077804Jk(cCDCAddCardViewModel, 5);
            this.LL = 1;
            if (C876103bb.LIZJ.LIZJ(enterParams, paymentInfo, str, c887503dR, paymentMethodsData, false, c1077804Jk, this) == objLJFF) {
                C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.bindAndSetPrimary$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.bindAndSetPrimary$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
