package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$refresh$2$2", f = "ShopMallRepository.kt", l = {}, m = "invokeSuspend")
public final class C1771130wBr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1771500wCS LL;
    public final /* synthetic */ C259800zU<AbstractC1771170wBv> LLILLJJLI;
    public final /* synthetic */ Response<n> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771130wBr(C1771500wCS c1771500wCS, C259800zU<AbstractC1771170wBv> c259800zU, Response<n> response, InterfaceC1364105Vn<? super C1771130wBr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1771500wCS;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = response;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771130wBr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[PHI: r4
      0x0057: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:25:0x0055, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ShopMallRepository@92e8.refresh$2$2"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.0w9j r0 = X.C1769810w9j.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPerfConfigV1Model r0 = X.C1769810w9j.LIZ()
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L8c
            java.lang.Integer r0 = r0.enableCropOnlineDataBeforeSaveCache
            if (r0 == 0) goto L8c
            int r0 = r0.intValue()
            if (r0 != r4) goto L8c
            r0 = 1
        L23:
            r5 = 0
            if (r0 == 0) goto L81
            X.0wCS r3 = r7.LL
            X.00zU<X.0wBv> r0 = r7.LLILLJJLI
            T r2 = r0.element
            boolean r0 = r2 instanceof X.C1771140wBs
            if (r0 == 0) goto L7f
            X.0wBs r2 = (X.C1771140wBs) r2
            if (r2 == 0) goto L7f
            com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n> r0 = r2.LIZIZ
            if (r0 == 0) goto L7f
            T r0 = r0.data
            com.google.gson.n r0 = (com.google.gson.n) r0
        L3c:
            r3.getClass()
            com.google.gson.n r0 = X.C1771500wCS.LJIIIZ(r0, r4)
            if (r0 == 0) goto L4b
            java.lang.String r4 = X.C1741890vQh.LJIIIIZZ(r0)
            if (r4 != 0) goto L57
        L4b:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n> r0 = r7.LLILLL
            T r0 = r0.data
            if (r0 == 0) goto L79
            java.lang.String r4 = X.C1741890vQh.LJIIIIZZ(r0)
        L55:
            if (r4 == 0) goto L79
        L57:
            X.00zU<X.0wBv> r3 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcMixMallLoadConfig r0 = X.C1771440wCM.LIZLLL()
            java.lang.Integer r0 = r0.cacheWriteInterval
            if (r0 == 0) goto L65
            int r1 = r0.intValue()
        L65:
            long r1 = (long) r1
            com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil r0 = com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil.LIZ
            com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil.LJFF(r1, r4)
            T r1 = r3.element
            boolean r0 = r1 instanceof X.C1771140wBs
            if (r0 == 0) goto L77
            X.0wBs r1 = (X.C1771140wBs) r1
            if (r1 == 0) goto L77
            X.0wEH r5 = r1.LIZ
        L77:
            com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil.LIZJ = r5
        L79:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L7f:
            r0 = r5
            goto L3c
        L81:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n> r0 = r7.LLILLL
            T r0 = r0.data
            if (r0 == 0) goto L79
            java.lang.String r4 = X.C1741890vQh.LJIIIIZZ(r0)
            goto L55
        L8c:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771130wBr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
