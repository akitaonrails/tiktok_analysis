package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel$checkInstallmentSupportStatus$1$1$2$1", f = "CCDCAddCardViewModel.kt", l = {3024}, m = "invokeSuspend")
public final class C881203cQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Boolean, PaymentInfo, Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ PaymentInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C881203cQ(Function2<? super Boolean, ? super PaymentInfo, Unit> function2, boolean z, PaymentInfo paymentInfo, InterfaceC1364105Vn<? super C881203cQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = z;
        this.LLILZ = paymentInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881203cQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CCDCAddCardViewModel@23a2.checkInstallmentSupportStatus$1$1$2$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C881403cS c881403cS = new C881403cS(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c881403cS) == objLJFF) {
                C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.checkInstallmentSupportStatus$1$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.checkInstallmentSupportStatus$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
