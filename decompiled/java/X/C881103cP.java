package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel$requestIndependentPricing$1$1", f = "CCDCAddCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C881103cP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C03OD LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PaymentInfo LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ CCDCAddCardViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C881103cP(C03OD c03od, String str, PaymentInfo paymentInfo, Function0<Unit> function0, CCDCAddCardViewModel cCDCAddCardViewModel, InterfaceC1364105Vn<? super C881103cP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c03od;
        this.LLILLJJLI = str;
        this.LLILLL = paymentInfo;
        this.LLILZ = function0;
        this.LLILZIL = cCDCAddCardViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881103cP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZ) {
            C03OI c03oi = C03OI.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" independent pricing success");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c03oi.getClass();
            C03OI.LJFF("CCDCAddCardViewModel", strLIZIZ);
            this.LLILLL.LJII = true;
            this.LLILZ.invoke();
        } else {
            C03OI c03oi2 = C03OI.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLILLJJLI);
            sbLIZ2.append(" independent pricing failed");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c03oi2.getClass();
            C03OI.LJFF("CCDCAddCardViewModel", strLIZIZ2);
            CCDCAddCardViewModel cCDCAddCardViewModel = this.LLILZIL;
            cCDCAddCardViewModel.setStateImmediate(new AwS580S0100000_1(cCDCAddCardViewModel, 139));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
