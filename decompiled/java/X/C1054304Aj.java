package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04Aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.recommend.PdpRecommendMgr$addRecommendedItemToCart$2$addToCartDidFinish$1", f = "PdpRecommendMgr.kt", l = {}, m = "invokeSuspend")
public final class C1054304Aj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C10372043u LL;
    public final /* synthetic */ C04HR LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1054304Aj(C10372043u c10372043u, C04HR c04hr, View view, View view2, String str, InterfaceC1364105Vn<? super C1054304Aj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c10372043u;
        this.LLILLJJLI = c04hr;
        this.LLILLL = view;
        this.LLILZ = view2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1054304Aj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186 A[PHI: r7
      0x0186: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:42:0x00ce, B:40:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054304Aj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
