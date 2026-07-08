package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03R7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.preview.OspPreloadManager$performPreviewForCombinedSku$1", f = "OspPreloadManager.kt", l = {166}, m = "invokeSuspend")
public final class C03R7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public OrderSubmitAssemViewModel LL;
    public C03RS LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C03RS LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03R7(OrderSubmitAssemViewModel orderSubmitAssemViewModel, long j, C03RS c03rs, Integer num, InterfaceC1364105Vn<? super C03R7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = orderSubmitAssemViewModel;
        this.LLIZ = j;
        this.LLIZLLLIL = c03rs;
        this.LLJ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03R7(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x00ac, CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, all -> 0x00ac, blocks: (B:16:0x0052, B:17:0x0055, B:18:0x0057, B:20:0x0062, B:25:0x006b, B:27:0x0071, B:28:0x0073, B:30:0x0079, B:32:0x007d, B:33:0x0086, B:35:0x00a1, B:36:0x00a5, B:9:0x0033, B:11:0x003c), top: B:44:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r4 = r17
            java.lang.String r9 = "OspPreloadManager@7881.performPreviewForCombinedSku$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r1 = X.C099R.LJFF()
            r6 = r16
            int r0 = r6.LLILZIL
            r8 = 1
            r15 = 0
            if (r0 == 0) goto L28
            if (r0 != r8) goto L20
            long r2 = r6.LLILZ
            java.lang.Object r14 = r6.LLILLL
            java.lang.Integer r14 = (java.lang.Integer) r14
            X.03RS r11 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r5 = r6.LL
            goto L52
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L28:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r5 = r6.LLILZLL
            long r2 = r6.LLIZ
            X.03RS r11 = r6.LLIZLLLIL
            java.lang.Integer r14 = r6.LLJ
            X.03RV r0 = X.C03RV.LIZ     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r0.getClass()     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            X.0957<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r0 = X.C03RV.LIZIZ     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r0 == 0) goto L50
            r6.LL = r5     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r6.LLILLJJLI = r11     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r6.LLILLL = r14     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r6.LLILZIL = r8     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            java.lang.Object r4 = r0.LJLIIIL(r6)     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r4 != r1) goto L55
            X.C1C7U.LIZIZ(r9)
            return r1
        L50:
            r4 = r15
            goto L57
        L52:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
        L55:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse) r4     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
        L57:
            X.03RV r7 = X.C03RV.LIZ     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r7.getClass()     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            X.C03RV.LIZIZ = r15     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r5.LLJJI     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r0 != 0) goto Lb0
            boolean r0 = r5.C     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r0 == 0) goto Lb0
            if (r4 == 0) goto L69
            goto L6b
        L69:
            r0 = r15
            goto L73
        L6b:
            T r0 = r4.data     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r0     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r0 == 0) goto L69
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r0 = r0.newShopOrders     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
        L73:
            boolean r0 = X.C756302xN.LIZ(r0)     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r0 == 0) goto Lb0
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r5.LLLIL     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r6 == 0) goto L86
            java.lang.String r1 = "is_preload"
            java.lang.Integer r0 = X.C2286608xc.LJ(r8)     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r6.put(r1, r0)     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
        L86:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            long r0 = r0 - r2
            com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager.LJJJLIIL = r0     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            X.03P4 r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment.LLLIL     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r0.getClass()     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment r10 = com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment.LLLILZJ     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            X.03RT r13 = X.C03RT.PRELOADING     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            r12 = 1
            r7.getClass()     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            X.C03RV.LIZ(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            X.02xE r0 = X.C755402xE.LIZ     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            if (r4 == 0) goto La5
            T r15 = r4.data     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r15 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r15     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
        La5:
            r0.getClass()     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            X.C755402xE.LIZIZ(r15, r5)     // Catch: java.lang.Throwable -> Lac java.util.concurrent.CancellationException -> Lb6
            goto Lb0
        Lac:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        Lb6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03R7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
