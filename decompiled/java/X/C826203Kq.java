package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem$initSubscribe$2$1$1", f = "SkuOrderSummaryPanelReusedAssem.kt", l = {81}, m = "invokeSuspend")
public final class C826203Kq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SkuOrderSummaryPanelReusedAssem LLILLL;
    public final /* synthetic */ CouponClaimedEvent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826203Kq(SkuOrderSummaryPanelReusedAssem skuOrderSummaryPanelReusedAssem, CouponClaimedEvent couponClaimedEvent, InterfaceC1364105Vn<? super C826203Kq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = skuOrderSummaryPanelReusedAssem;
        this.LLILZ = couponClaimedEvent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C826203Kq c826203Kq = new C826203Kq(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c826203Kq.LLILLJJLI = obj;
        return c826203Kq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r18
            java.lang.String r8 = "SkuOrderSummaryPanelReusedAssem@3106.initSubscribe$2$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            r4 = r17
            int r0 = r4.LL
            r11 = 0
            r6 = 1
            if (r0 == 0) goto L4a
            if (r0 != r6) goto L9b
            X.C155000ia.LIZIZ(r1)
        L18:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1
            if (r1 == 0) goto L8d
            T r9 = r1.data
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r9 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r9
            if (r9 == 0) goto L8d
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r1 = r4.LLILLL
            r10 = 0
            r16 = 63
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r11
            X.02xF r0 = X.C756102xL.LIZ(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.Bp(r0)
            android.view.View r0 = r1.getContentView()
            if (r0 == 0) goto L3b
            X.C786410Ut5.LJLLLLLL(r11, r0)
        L3b:
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r0 = r4.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r0.getViewModel()
            r0.OG(r11)
        L44:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L4a:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r5 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r0 = r4.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r0.getViewModel()
            X.03QL r0 = r0.LLJJJJ
            if (r0 == 0) goto L5e
            boolean r0 = r0.LLJJJ
            if (r0 != r6) goto L5e
            goto L44
        L5e:
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r0 = r4.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r0.getViewModel()
            r0.OG(r6)
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r0 = r4.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r0.getViewModel()
            X.03QL r3 = r0.LLJJJJ
            if (r3 == 0) goto L8d
            com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent r2 = r4.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r0 = r4.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r1 = r0.getViewModel()
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r0 = r4.LLILLL
            android.view.View r0 = r0.getContentView()
            r4.LLILLJJLI = r5
            r4.LL = r6
            java.lang.Object r1 = r3.LJI(r2, r1, r0, r4)
            if (r1 != r7) goto L18
            X.C1C7U.LIZIZ(r8)
            return r7
        L8d:
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem r0 = r4.LLILLL
            android.view.View r1 = r0.getContentView()
            if (r1 == 0) goto L3b
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            goto L3b
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C826203Kq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
