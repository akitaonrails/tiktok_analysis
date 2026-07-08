package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.widget.ISkuPaymentMethodCommon$paymentInteractionCallback$1$onPaymentModuleClick$1", f = "ISkuPaymentMethodCommon.kt", l = {249, 250, 252}, m = "invokeSuspend")
public final class C874603bM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC885103d3 LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874603bM(InterfaceC885103d3 interfaceC885103d3, View view, InterfaceC1364105Vn<? super C874603bM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC885103d3;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C874603bM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r16
            java.lang.String r7 = "ISkuPaymentMethodCommon@95bd.paymentInteractionCallback$1$onPaymentModuleClick$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r3 = r15.LL
            r6 = 3
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L21
            if (r3 == r1) goto L32
            if (r3 == r2) goto L63
            if (r3 != r6) goto L9a
            X.C155000ia.LIZIZ(r0)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L21:
            X.C155000ia.LIZIZ(r0)
            r15.LL = r1
            r0 = 100
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r15)
            if (r0 != r5) goto L35
            X.C1C7U.LIZIZ(r7)
            return r5
        L32:
            X.C155000ia.LIZIZ(r0)
        L35:
            X.03d3 r0 = r15.LLILLJJLI
            X.043B r0 = r0.getViewModel()
            X.03QL r8 = r0.sA0()
            if (r8 == 0) goto L1b
            X.03d3 r0 = r15.LLILLJJLI
            X.043B r9 = r0.getViewModel()
            android.view.View r10 = r15.LLILLL
            r11 = 0
            r15.LL = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r13 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo
            X.03DI r0 = X.C03DI.DEFAULT
            int r0 = r0.getValue()
            r13.<init>(r0, r11, r11, r11)
            r14 = 0
            r12 = r11
            java.lang.Object r0 = r8.LIZIZ(r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r5) goto L66
            X.C1C7U.LIZIZ(r7)
            return r5
        L63:
            X.C155000ia.LIZIZ(r0)
        L66:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L1b
            T r4 = r0.data
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r4
            if (r4 == 0) goto L1b
            X.03d3 r3 = r15.LLILLJJLI
            android.view.View r0 = r3.n9()
            if (r0 == 0) goto L7e
            java.lang.String r2 = X.C960603pE.LIZLLL(r0)
            if (r2 != 0) goto L80
        L7e:
            java.lang.String r2 = "unknown"
        L80:
            X.043B r0 = r3.getViewModel()
            X.03QL r1 = r0.sA0()
            if (r1 == 0) goto L1b
            X.043B r0 = r3.getViewModel()
            r15.LL = r6
            kotlin.Unit r0 = r1.LJIIJ(r0, r4, r2)
            if (r0 != r5) goto L1b
            X.C1C7U.LIZIZ(r7)
            return r5
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874603bM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
