package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03KS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$changePaymentMethod$1", f = "OrderSubmitAssemViewModel.kt", l = {5551, 5604}, m = "invokeSuspend")
public final class C03KS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PaymentInfo LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ PaymentInfo LLIZLLLIL;
    public final /* synthetic */ PaymentInfo LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ boolean LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03KS(OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, PaymentInfo paymentInfo, PaymentInfo paymentInfo2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC1364105Vn<? super C03KS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = orderSubmitAssemViewModel;
        this.LLIZ = z;
        this.LLIZLLLIL = paymentInfo;
        this.LLJ = paymentInfo2;
        this.LLJI = str;
        this.LLJIJIL = z2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = z4;
        this.LLJILLL = z5;
        this.LLJJ = z6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03KS(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Type inference failed for: r21v2, types: [X.02rt] */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v4, types: [X.02rt] */
    /* JADX WARN: Type inference failed for: r21v5, types: [java.util.Map] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03KS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
