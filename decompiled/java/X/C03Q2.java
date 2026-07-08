package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Q2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PaymentPricingHelper$queryPaymentSummary$1", f = "PaymentPricingHelper.kt", l = {487, 542, 574, 586}, m = "invokeSuspend")
public final class C03Q2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public PaymentMethodsData LLILLL;
    public PaymentMethod LLILZ;
    public C03QH LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public int LLJILJILJ;
    public final /* synthetic */ PaymentMethodsData LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ boolean LLJJIII;
    public final /* synthetic */ PaymentMethod LLJJIJI;
    public final /* synthetic */ C03QH LLJJIJIIJIL;
    public final /* synthetic */ boolean LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ boolean LLJJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Q2(PaymentMethodsData paymentMethodsData, String str, String str2, boolean z, PaymentMethod paymentMethod, C03QH c03qh, boolean z2, String str3, boolean z3, InterfaceC1364105Vn<? super C03Q2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILLL = paymentMethodsData;
        this.LLJJ = str;
        this.LLJJI = str2;
        this.LLJJIII = z;
        this.LLJJIJI = paymentMethod;
        this.LLJJIJIIJIL = c03qh;
        this.LLJJIJIL = z2;
        this.LLJJJ = str3;
        this.LLJJJIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Q2(this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v38 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Q2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
