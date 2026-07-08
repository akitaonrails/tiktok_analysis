package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel$checkInstallmentSupportStatus$1$1$2$1$1", f = "CCDCAddCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C881403cS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<Boolean, PaymentInfo, Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ PaymentInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C881403cS(Function2<? super Boolean, ? super PaymentInfo, Unit> function2, boolean z, PaymentInfo paymentInfo, InterfaceC1364105Vn<? super C881403cS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = z;
        this.LLILLL = paymentInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881403cS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CCDCAddCardViewModel@23a2.checkInstallmentSupportStatus$1$1$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(Boolean.valueOf(this.LLILLJJLI), this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.checkInstallmentSupportStatus$1$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
