package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0NfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599600NfS {
    public static final /* synthetic */ C599600NfS LIZ = new C599600NfS();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginResponse> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C599590NfR
            if (r0 == 0) goto L21
            r5 = r7
            X.0NfR r5 = (X.C599590NfR) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L27
            goto L42
        L21:
            X.0NfR r5 = new X.0NfR
            r5.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r2)
            X.0NfP r2 = new X.0NfP     // Catch: java.lang.Exception -> L48
            r2.<init>(r3)     // Catch: java.lang.Exception -> L48
            r5.LLILLL = r0     // Catch: java.lang.Exception -> L48
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.C099A.LIZIZ(r0, r2, r5)     // Catch: java.lang.Exception -> L48
            if (r2 != r4) goto L45
            return r4
        L42:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginResponse r2 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginResponse) r2     // Catch: java.lang.Exception -> L48
            return r2
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C599600NfS.LIZ(X.05Vn):java.lang.Object");
    }
}
