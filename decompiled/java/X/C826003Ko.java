package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$queryBillInfoForPaymentMethodsData$2", f = "OrderSubmitAssemViewModel.kt", l = {10765}, m = "invokeSuspend")
public final class C826003Ko extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ BillInfoRequest LLILLL;
    public final /* synthetic */ Function1<PaymentMethodsData, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C826003Ko(OrderSubmitAssemViewModel orderSubmitAssemViewModel, BillInfoRequest billInfoRequest, Function1<? super PaymentMethodsData, Unit> function1, InterfaceC1364105Vn<? super C826003Ko> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = billInfoRequest;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826003Ko(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r4 = "OrderSubmitAssemViewModel@f79d.queryBillInfoForPaymentMethodsData$2"
            X.C1C7U.LIZ(r4)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LL
            r10 = 0
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 != r3) goto L6b
            X.C155000ia.LIZIZ(r13)
        L14:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse r13 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse) r13
        L16:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r2 = r12.LLILLJJLI
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 399(0x18f, float:5.59E-43)
            r1.<init>(r2, r0)
            r2.withState(r1)
            if (r13 == 0) goto L3d
            boolean r0 = r13.isValid()
            if (r0 != r3) goto L3d
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, kotlin.Unit> r1 = r12.LLILZ
            T r0 = r13.data
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r0
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r10 = r0.paymentMethods
        L34:
            r1.invoke(r10)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L3d:
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, kotlin.Unit> r0 = r12.LLILZ
            r0.invoke(r10)
            goto L37
        L43:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r1 = r12.LLILLJJLI
            X.03WX r5 = r1.LLLJIL
            if (r5 == 0) goto L69
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r6 = r12.LLILLL
            boolean r0 = r1.LLJLL
            r7 = r0 ^ 1
            java.util.HashMap<java.lang.String, java.lang.Object> r8 = r1.LLLIL
            if (r8 != 0) goto L5b
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L5b:
            r12.LL = r3
            r9 = 0
            r11 = r10
            java.lang.Object r13 = r5.LJJJJZI(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r2) goto L14
            X.C1C7U.LIZIZ(r4)
            return r2
        L69:
            r13 = r10
            goto L16
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C826003Ko.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
