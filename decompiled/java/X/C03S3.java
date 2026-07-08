package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03S3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2$showOtherSection$1$orderSubmitPaymentItemView$1$5$2", f = "MiniOspPaymentInfoCell2.kt", l = {655}, m = "invokeSuspend")
public final class C03S3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03ZB LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ MiniOspPaymentInfoCell2 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ CommuteType LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03S3(C03ZB c03zb, PaymentMethod paymentMethod, MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2, String str, CommuteType commuteType, InterfaceC1364105Vn<? super C03S3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03zb;
        this.LLILLL = paymentMethod;
        this.LLILZ = miniOspPaymentInfoCell2;
        this.LLILZIL = str;
        this.LLILZLL = commuteType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03S3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r4 = "MiniOspPaymentInfoCell2@4188.showOtherSection$1$orderSubmitPaymentItemView$1$5$2"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r13.LL
            r2 = 1
            r0 = 0
            if (r1 == 0) goto L63
            if (r1 != r2) goto Lb3
            X.C155000ia.LIZIZ(r14)
        L14:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r1 = r14.booleanValue()
            if (r1 == 0) goto L50
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2 r1 = r13.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r3 = r1.P5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7 = r13.LLILLL
            kotlin.jvm.internal.AwS20S1400000_1 r5 = new kotlin.jvm.internal.AwS20S1400000_1
            X.03ZB r6 = r13.LLILLJJLI
            java.lang.String r8 = r13.LLILZIL
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType r9 = r13.LLILZLL
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2 r10 = r13.LLILZ
            r11 = 3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            if (r7 == 0) goto L50
            java.lang.String r2 = r7.id
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem> r1 = r3.LLLLLLJ
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem) r1
            if (r1 == 0) goto L44
            java.lang.String r0 = r1.paymentMethodBindUrl
        L44:
            r2 = 0
            if (r0 == 0) goto L56
            int r1 = r0.length()
            if (r1 == 0) goto L56
            r5.invoke(r0)
        L50:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L56:
            r0 = 478(0x1de, float:6.7E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            r3.setState(r0)
            r3.gR2(r7, r2, r5)
            goto L50
        L63:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper r5 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper.LIZ
            X.03ZB r1 = r13.LLILLJJLI
            android.content.Context r6 = r1.getContext()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r13.LLILLL
            if (r1 == 0) goto Lb0
            java.lang.String r7 = r1.id
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo r1 = r1.bindInfo
            if (r1 == 0) goto Lb1
            java.lang.Boolean r8 = r1.isNeedPrebindVerify
        L7a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2 r1 = r13.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r1 = r1.P5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r1 = r1.LLIZ
            if (r1 == 0) goto Lae
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r1 = r1.paymentMethods
            if (r1 == 0) goto Lae
            java.lang.String r9 = r1.consultationId
        L8a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2 r1 = r13.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r1 = r1.P5()
            java.lang.String r10 = r1.LLLIIIL
            java.lang.String r11 = "order_submit"
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2 r1 = r13.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r1 = r1.P5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r1 = r1.LLIZ
            if (r1 == 0) goto Lac
            com.google.gson.n r12 = r1.preRiskParam
        La0:
            r13.LL = r2
            java.lang.Object r14 = r5.LJIIJ(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r3) goto L14
            X.C1C7U.LIZIZ(r4)
            return r3
        Lac:
            r12 = r0
            goto La0
        Lae:
            r9 = r0
            goto L8a
        Lb0:
            r7 = r0
        Lb1:
            r8 = r0
            goto L7a
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03S3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
