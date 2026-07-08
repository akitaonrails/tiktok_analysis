package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.040b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10275040b {
    public static final /* synthetic */ C10275040b LIZ = new C10275040b();
    public static final C01K1 LIZIZ;

    static {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        LIZIZ = interfaceC859903XpCreateBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C10276040c
            if (r0 == 0) goto L3d
            r4 = r6
            X.040c r4 = (X.C10276040c) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0X52 r1 = (X.C0X52) r1
            T r0 = r1.LIZIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C10275040b.LIZIZ
            java.lang.Class<X.040a> r0 = X.InterfaceC10274040a.class
            java.lang.Object r0 = r1.create(r0)
            X.040a r0 = (X.InterfaceC10274040a) r0
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LIZ(r4)
            if (r1 != r3) goto L22
            return r3
        L3d:
            X.040c r4 = new X.040c
            r4.<init>(r5, r6)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10275040b.LIZ(X.05Vn):java.lang.Object");
    }
}
