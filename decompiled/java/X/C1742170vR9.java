package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheManager$executeCartCacheStrategy$1$2", f = "CartCacheManager.kt", l = {197, 206}, m = "invokeSuspend")
public final class C1742170vR9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ List<Integer> LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742170vR9(Long l, List<Integer> list, C013C c013c, InterfaceC1364105Vn<? super C1742170vR9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = list;
        this.LLILZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742170vR9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "CartCacheManager@5d34.executeCartCacheStrategy$1$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L45
            if (r0 == r1) goto L5c
            if (r0 != r2) goto L91
            X.C155000ia.LIZIZ(r14)
        L16:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r14 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r14
            boolean r0 = r14.isCodeOK()
            if (r0 == 0) goto L3f
            X.013C r0 = r13.LLILZ
            boolean r0 = r0.element
            if (r0 != 0) goto L3f
            T r3 = r14.data
            com.google.gson.n r3 = (com.google.gson.n) r3
            if (r3 == 0) goto L33
            java.lang.String r2 = "is_client_cache"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.LJJII(r0, r2)
        L33:
            X.0vRB r1 = X.C1742190vRB.LIZ
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r1.getClass()
            X.C1742190vRB.LIZLLL(r0)
        L3f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L45:
            X.C155000ia.LIZIZ(r14)
            java.lang.Long r0 = r13.LLILLJJLI
            if (r0 == 0) goto L5f
            long r4 = r0.longValue()
            r13.LL = r1
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r4, r13)
            if (r0 != r3) goto L5f
            X.C1C7U.LIZIZ(r6)
            return r3
        L5c:
            X.C155000ia.LIZIZ(r14)
        L5f:
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartPreloadRequest r7 = new com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartPreloadRequest
            java.util.List<java.lang.Integer> r8 = r13.LLILLL
            X.0w4y r4 = X.C1766860w4y.LIZ
            r9 = 0
            r0 = 3
            com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo r0 = X.C1766860w4y.LJ(r4, r9, r0)
            if (r0 == 0) goto L71
            java.lang.String r9 = X.C1741890vQh.LJIIIIZZ(r0)
        L71:
            java.lang.String r10 = X.C1742130vR5.LIZ()
            r11 = 0
            X.0vRA r0 = X.EnumC1742180vRA.AFTER_ADD_ITEM
            int r0 = r0.getValue()
            java.lang.Integer r12 = X.C2286608xc.LJ(r0)
            r7.<init>(r8, r9, r10, r11, r12)
            X.04HK r0 = X.C04HJ.LIZ
            r13.LL = r2
            java.lang.Object r14 = r0.LIZJ(r7, r13)
            if (r14 != r3) goto L16
            X.C1C7U.LIZIZ(r6)
            return r3
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1742170vR9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
