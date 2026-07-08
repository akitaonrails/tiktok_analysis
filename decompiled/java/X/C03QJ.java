package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03QJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM$fetchOrderSummary$1$1", f = "SkuPanelAssemVM.kt", l = {532}, m = "invokeSuspend")
public final class C03QJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C03QL LLILLL;
    public final /* synthetic */ SkuPanelAssemVM LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QJ(C03QL c03ql, SkuPanelAssemVM skuPanelAssemVM, View view, InterfaceC1364105Vn<? super C03QJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c03ql;
        this.LLILZ = skuPanelAssemVM;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C03QJ c03qj = new C03QJ(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c03qj.LLILLJJLI = obj;
        return c03qj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r4 = "SkuPanelAssemVM@6eff.fetchOrderSummary$1$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r13.LL
            r1 = 1
            if (r0 == 0) goto L74
            if (r0 != r1) goto L9b
            X.C155000ia.LIZIZ(r14)
        L13:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r14 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r14
            r7 = 0
            r6 = 0
            if (r14 == 0) goto L60
            T r5 = r14.data
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r5
            if (r5 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r3 = r13.LLILZ
            X.03QL r0 = r3.LLJJJJ
            if (r0 == 0) goto L3a
            boolean r0 = r0.LJIIL()
            if (r0 != r1) goto L3a
            X.03Np r2 = new X.03Np
            r2.<init>(r3)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutOcpOptModel r0 = X.C03QK.LIZ()
            boolean r1 = r0.emptyPaymentInfoWhenCurrentAvailable
            r0 = 2
            X.C833903Np.LIZ(r2, r1, r6, r0)
        L3a:
            r3.LLJJJJJIL = r5
            r12 = 63
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r7
            X.02xF r0 = X.C756102xL.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            X.02rt r0 = r0.LLILZLL
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.LLIZ
            if (r0 == 0) goto L60
            java.lang.String r2 = r0.getPriceStr()
            if (r2 == 0) goto L60
            kotlin.jvm.internal.AwS52S1000000_1 r1 = new kotlin.jvm.internal.AwS52S1000000_1
            r0 = 18
            r1.<init>(r2, r0)
            r3.LJJJZ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L64
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r13.LLILZ
            r0.LLJJJJJIL = r6
        L64:
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r13.LLILZ
            r0.Oy()
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r13.LLILZ
            r0.OG(r7)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L74:
            X.C155000ia.LIZIZ(r14)
            java.lang.Object r0 = r13.LLILLJJLI
            X.03QL r6 = r13.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r7 = r13.LLILZ
            android.view.View r8 = r13.LLILZIL
            r9 = 0
            r13.LLILLJJLI = r0
            r13.LL = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r11 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo
            X.03DI r0 = X.C03DI.DEFAULT
            int r0 = r0.getValue()
            r11.<init>(r0, r9, r9, r9)
            r12 = 0
            r10 = r9
            java.lang.Object r14 = r6.LIZIZ(r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r2) goto L13
            X.C1C7U.LIZIZ(r4)
            return r2
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
