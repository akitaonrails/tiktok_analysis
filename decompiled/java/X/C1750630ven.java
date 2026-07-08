package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0ven, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750630ven {
    public static final /* synthetic */ C1750630ven LIZ = new C1750630ven();
    public static final FavoriteApi LIZIZ;

    static {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        LIZIZ = (FavoriteApi) interfaceC859903XpCreateBuilder.build().create(FavoriteApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1750650vep
            if (r0 == 0) goto L21
            r7 = r10
            X.0vep r7 = (X.C1750650vep) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L33
            if (r0 != r5) goto L2b
            goto L27
        L21:
            X.0vep r7 = new X.0vep
            r7.<init>(r8, r10)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L50
            return r1
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi r3 = X.C1750630ven.LIZIZ     // Catch: java.lang.Throwable -> L50
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest r2 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest     // Catch: java.lang.Throwable -> L50
            java.util.List r1 = java.util.Collections.singletonList(r9)     // Catch: java.lang.Throwable -> L50
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L50
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L50
            r7.LLILLL = r5     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r3.LIZ(r2, r7)     // Catch: java.lang.Throwable -> L50
            if (r1 != r6) goto L4f
            return r6
        L4f:
            return r1
        L50:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750630ven.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo r8, java.lang.String r9, java.lang.Integer r10, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C1750640veo
            if (r0 == 0) goto L20
            r6 = r11
            X.0veo r6 = (X.C1750640veo) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto L2a
            goto L26
        L20:
            X.0veo r6 = new X.0veo
            r6.<init>(r7, r11)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L58
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r9 != 0) goto L3e
            java.lang.String r9 = "0"
        L3e:
            java.lang.String r0 = "biz_type"
            r3.put(r0, r9)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi r2 = X.C1750630ven.LIZIZ     // Catch: java.lang.Throwable -> L58
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest     // Catch: java.lang.Throwable -> L58
            java.util.List r0 = java.util.Collections.singletonList(r8)     // Catch: java.lang.Throwable -> L58
            r1.<init>(r0, r10)     // Catch: java.lang.Throwable -> L58
            r6.LLILLL = r4     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r2.favoriteProduct(r1, r3, r6)     // Catch: java.lang.Throwable -> L58
            if (r1 != r5) goto L57
            return r5
        L57:
            return r1
        L58:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750630ven.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }
}
