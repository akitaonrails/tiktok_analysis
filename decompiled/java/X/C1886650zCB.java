package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.edm.EdmConsentApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886650zCB {
    public static final C1886650zCB LIZ = new C1886650zCB();
    public static final EdmConsentApi LIZIZ = (EdmConsentApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(EdmConsentApi.class);

    public static void LIZIZ() {
        LIZIZ.uploadEmailConsentRejectApi().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0ylo
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("EdmConsentApiManager@5ca7.uploadEmailConsentReject$1");
                C1C7U.LIZIZ("EdmConsentApiManager@5ca7.uploadEmailConsentReject$1");
            }
        }, new C09JN() { // from class: X.0ylp
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("EdmConsentApiManager@5ca7.uploadEmailConsentReject$2");
                C1C7U.LIZIZ("EdmConsentApiManager@5ca7.uploadEmailConsentReject$2");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1886660zCC
            if (r0 == 0) goto L20
            r4 = r8
            X.0zCC r4 = (X.C1886660zCC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.0zCC r4 = new X.0zCC
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.compliance.business.edm.EdmConsentApi r0 = X.C1886650zCB.LIZIZ     // Catch: java.lang.Throwable -> L42
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r0.getEmailConsentAgreementInfo(r6, r7, r4)     // Catch: java.lang.Throwable -> L42
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L42
        L3f:
            com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse r3 = (com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse) r3     // Catch: java.lang.Throwable -> L42
            return r3
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse r3 = new com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse
            r0 = 0
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1886650zCB.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
