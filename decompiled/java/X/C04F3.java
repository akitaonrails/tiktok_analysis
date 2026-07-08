package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04F3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.cache.PreloadCartInfoCacheManager$requestPreloadCartInfo$2", f = "PreloadCartInfoCacheManager.kt", l = {126, 127}, m = "invokeSuspend")
public final class C04F3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ GetPreloadCartInfoRequest LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04F3(long j, GetPreloadCartInfoRequest getPreloadCartInfoRequest, String str, InterfaceC1364105Vn<? super C04F3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = getPreloadCartInfoRequest;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C04F3 c04f3 = new C04F3(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c04f3.LLILLJJLI = obj;
        return c04f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PreloadCartInfoCacheManager@d7ee.requestPreloadCartInfo$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 == r3) goto L37
            if (r0 != r4) goto L85
            X.C155000ia.LIZIZ(r8)
        L16:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r8 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r8
            int r0 = r8.code
            if (r0 == 0) goto L4e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L22:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLJJLI
            long r0 = r7.LLILLL
            r7.LLILLJJLI = r2
            r7.LL = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L3c
            X.C1C7U.LIZIZ(r6)
            return r5
        L37:
            java.lang.Object r2 = r7.LLILLJJLI
            X.C155000ia.LIZIZ(r8)
        L3c:
            X.04HK r1 = X.C04HJ.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest r0 = r7.LLILZ
            r7.LLILLJJLI = r2
            r7.LL = r4
            java.lang.Object r8 = r1.LIZLLL(r0, r7)
            if (r8 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L4e:
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest r0 = r7.LLILZ
            java.lang.String r0 = r0.requestId
            if (r0 == 0) goto L60
            java.lang.String r2 = r7.LLILZIL
            X.04F8 r1 = new X.04F8
            r1.<init>(r0)
            X.04F6 r0 = X.C04F4.LIZIZ
            r0.LIZJ(r2, r1)
        L60:
            T r3 = r8.data
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoData r3 = (com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoData) r3
            if (r3 == 0) goto L7e
            java.lang.String r0 = r3.preloadCartInfo
            if (r0 == 0) goto L7e
            java.lang.String r2 = r7.LLILZIL
            X.042x r0 = X.C04F4.LIZ
            X.04F5 r1 = new X.04F5
            r1.<init>(r3)
            X.042x r0 = X.C04F4.LIZ
            r0.LIZJ(r2, r1)
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L7e:
            X.03xw r1 = X.EnumC1014603xw.ERR10011
            r0 = 0
            X.C1019103yf.LIZ(r1, r0, r0)
            goto L78
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04F3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
