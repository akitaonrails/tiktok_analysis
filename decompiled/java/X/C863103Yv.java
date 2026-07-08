package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$refresh$2$1$1", f = "PaymentViewModel.kt", l = {}, m = "invokeSuspend")
public final class C863103Yv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C842503Qx LLILLJJLI;
    public final /* synthetic */ PaymentViewModel LLILLL;
    public final /* synthetic */ C842503Qx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863103Yv(C842503Qx c842503Qx, PaymentViewModel paymentViewModel, C842503Qx c842503Qx2, InterfaceC1364105Vn<? super C863103Yv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c842503Qx;
        this.LLILLL = paymentViewModel;
        this.LLILZ = c842503Qx2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C863103Yv c863103Yv = new C863103Yv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c863103Yv.LL = obj;
        return c863103Yv;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863103Yv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
