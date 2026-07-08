package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03WR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.helper.OrderSubmitPrefetchHelperV2$tryEnterOspPage$1", f = "OrderSubmitPrefetchHelperV2.kt", l = {336}, m = "invokeSuspend")
public final class C03WR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C03R0 LLILLL;
    public final /* synthetic */ C259800zU<BillInfoRequest> LLILZ;
    public final /* synthetic */ HashMap<String, Object> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WR(C03R0 c03r0, C259800zU<BillInfoRequest> c259800zU, HashMap<String, Object> map, String str, InterfaceC1364105Vn<? super C03WR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c03r0;
        this.LLILZ = c259800zU;
        this.LLILZIL = map;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C03WR c03wr = new C03WR(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c03wr.LLILLJJLI = obj;
        return c03wr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "OrderSubmitPrefetchHelperV2@715.tryEnterOspPage$1"
            X.C1C7U.LIZ(r12)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r13.LL
            r8 = 3
            r7 = 0
            r11 = 1
            if (r0 == 0) goto L27
            if (r0 != r11) goto La5
            java.lang.Object r6 = r13.LLILLJJLI
            X.01wk r6 = (X.InterfaceC497601wk) r6
            X.C155000ia.LIZIZ(r14)
        L19:
            X.145o r0 = new X.145o
            r0.<init>(r7)
            X.C23250099c.LIZLLL(r6, r7, r7, r0, r8)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r12)
            return r0
        L27:
            X.C155000ia.LIZIZ(r14)
            java.lang.Object r6 = r13.LLILLJJLI
            X.01wk r6 = (X.InterfaceC497601wk) r6
            X.03R0 r1 = r13.LLILLL
            X.00zU<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest> r0 = r13.LLILZ
            T r5 = r0.element
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest) r5
            java.util.HashMap<java.lang.String, java.lang.Object> r4 = r13.LLILZIL
            java.lang.String r0 = r13.LLILZLL
            r13.LLILLJJLI = r6
            r13.LL = r11
            r1.getClass()
            X.03WX r3 = X.C857103Wn.LIZ(r0)
            X.01GW r10 = X.C03WV.LIZ
            java.lang.Object r0 = r10.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            java.lang.String r2 = "enable_osp_chunk"
            boolean r0 = r0.contains(r2)
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.Object r0 = r10.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            boolean r0 = r0.getBoolean(r2, r1)
        L60:
            if (r0 == 0) goto L95
            X.0957<? extends X.11NZ<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse>> r0 = r3.LJIIIIZZ
            if (r0 != 0) goto L6f
            X.03WQ r0 = new X.03WQ
            r0.<init>(r5, r3, r4, r7)
            X.099G r0 = X.C23250099c.LIZIZ(r6, r7, r7, r0, r8)
        L6f:
            r3.LJIIIIZZ = r0
        L71:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r9) goto L19
            X.C1C7U.LIZIZ(r12)
            return r9
        L79:
            X.0C64 r10 = X.C0C64.LJIILLIIL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2$EComOSPEnterConfig> r2 = com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2.EComOSPEnterConfig.class
            com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2$EComOSPEnterConfig r1 = com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2.LIZ
            java.lang.String r0 = "ecom_osp_second_on_v2"
            java.lang.Object r0 = r10.LJJII(r2, r1, r0, r11)
            com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2$EComOSPEnterConfig r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2.EComOSPEnterConfig) r0
            if (r0 == 0) goto L8c
            r1 = r0
        L8c:
            java.lang.Boolean r0 = r1.enableChunk
            if (r0 == 0) goto L95
            boolean r0 = r0.booleanValue()
            goto L60
        L95:
            X.0957<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r0 = r3.LJII
            if (r0 != 0) goto La2
            X.03WP r0 = new X.03WP
            r0.<init>(r5, r3, r4, r7)
            X.099G r0 = X.C23250099c.LIZIZ(r6, r7, r7, r0, r8)
        La2:
            r3.LJII = r0
            goto L71
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
