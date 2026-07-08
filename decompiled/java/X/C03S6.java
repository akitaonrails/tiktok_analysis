package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03S6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListViewModel$clickToBind$1", f = "SubPaymentListViewModel.kt", l = {251}, m = "invokeSuspend")
public final class C03S6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ SubPaymentListViewModel LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ Uri.Builder LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03S6(Context context, PaymentMethod paymentMethod, SubPaymentListViewModel subPaymentListViewModel, Function1<? super String, Unit> function1, Uri.Builder builder, InterfaceC1364105Vn<? super C03S6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = paymentMethod;
        this.LLILZ = subPaymentListViewModel;
        this.LLILZIL = function1;
        this.LLILZLL = builder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03S6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r4 = "SubPaymentListViewModel@b8d6.clickToBind$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L68
            X.C155000ia.LIZIZ(r14)
        L13:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            if (r0 == 0) goto L26
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r13.LLILZIL
            android.net.Uri$Builder r0 = r13.LLILZLL
            java.lang.String r0 = r0.toString()
            r1.invoke(r0)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper r5 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper.LIZ
            android.content.Context r6 = r13.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r13.LLILLL
            r12 = 0
            if (r0 == 0) goto L65
            java.lang.String r7 = r0.id
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo r0 = r0.bindInfo
            if (r0 == 0) goto L66
            java.lang.Boolean r8 = r0.isNeedPrebindVerify
        L40:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListViewModel r0 = r13.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r1 = r0.LL
            if (r1 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r1.LJIILLIIL
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.paymentMethods
            if (r0 == 0) goto L63
            java.lang.String r9 = r0.consultationId
        L50:
            r10 = 0
            java.lang.String r11 = "order_submit"
            if (r1 == 0) goto L57
            com.google.gson.n r12 = r1.LJFF
        L57:
            r13.LL = r2
            java.lang.Object r14 = r5.LJIIJ(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L63:
            r9 = r12
            goto L50
        L65:
            r7 = r12
        L66:
            r8 = r12
            goto L40
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03S6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
