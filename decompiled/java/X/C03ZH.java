package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import oqa.h;

/* JADX INFO: renamed from: X.03ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder$onBind$1$3$1$1$1", f = "PaymentMethodViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C03ZH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC866403a2 LL;
    public final /* synthetic */ h LLILLJJLI;
    public final /* synthetic */ PaymentState LLILLL;
    public final /* synthetic */ C03ZA LLILZ;
    public final /* synthetic */ PaymentMethodViewHolder LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03ZH(InterfaceC866403a2 interfaceC866403a2, h hVar, PaymentState paymentState, C03ZA c03za, PaymentMethodViewHolder paymentMethodViewHolder, Function0<Unit> function0, InterfaceC1364105Vn<? super C03ZH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC866403a2;
        this.LLILLJJLI = hVar;
        this.LLILLL = paymentState;
        this.LLILZ = c03za;
        this.LLILZIL = paymentMethodViewHolder;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03ZH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
