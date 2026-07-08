package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0vG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735330vG7 {
    public static final /* synthetic */ C1735330vG7 LIZ;
    public static final C01K1 LIZIZ;

    static {
        boolean zLJI = MethodIDManager.LJI(202338);
        LIZ = new C1735330vG7();
        LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1735370vGB
            if (r0 == 0) goto L20
            r5 = r8
            X.0vGB r5 = (X.C1735370vGB) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.0vGB r5 = new X.0vGB
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C1735330vG7.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.0vG8> r0 = X.InterfaceC1735340vG8.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.0vG8 r0 = (X.InterfaceC1735340vG8) r0     // Catch: java.lang.Exception -> L4a
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r0.LIZJ(r7, r5)     // Catch: java.lang.Exception -> L4a
            if (r4 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthResponse r4 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthResponse) r4     // Catch: java.lang.Exception -> L4a
            return r4
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthResponse r4 = new com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthResponse
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r0, r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1735330vG7.LIZ(com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1735360vGA
            if (r0 == 0) goto L20
            r5 = r8
            X.0vGA r5 = (X.C1735360vGA) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.0vGA r5 = new X.0vGA
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C1735330vG7.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.0vG8> r0 = X.InterfaceC1735340vG8.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.0vG8 r0 = (X.InterfaceC1735340vG8) r0     // Catch: java.lang.Exception -> L4a
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r0.LIZIZ(r7, r5)     // Catch: java.lang.Exception -> L4a
            if (r4 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse r4 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse) r4     // Catch: java.lang.Exception -> L4a
            return r4
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse r4 = new com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r0, r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1735330vG7.LIZJ(com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthRequest r10, java.lang.String r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C1735350vG9
            if (r0 == 0) goto L22
            r4 = r12
            X.0vG9 r4 = (X.C1735350vG9) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L28
            java.lang.Object r11 = r4.LL
            goto L48
        L22:
            X.0vG9 r4 = new X.0vG9
            r4.<init>(r9, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            X.01K1 r1 = X.C1735330vG7.LIZIZ     // Catch: java.lang.Exception -> L8a
            java.lang.Class<X.0vG8> r0 = X.InterfaceC1735340vG8.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L8a
            X.0vG8 r0 = (X.InterfaceC1735340vG8) r0     // Catch: java.lang.Exception -> L8a
            r4.LL = r11     // Catch: java.lang.Exception -> L8a
            r4.LLILZ = r6     // Catch: java.lang.Exception -> L8a
            java.lang.Object r3 = r0.LIZ(r10, r4)     // Catch: java.lang.Exception -> L8a
            if (r3 != r2) goto L4b
            return r2
        L48:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L8a
        L4b:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse r3 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse) r3     // Catch: java.lang.Exception -> L8a
            X.0pL7 r8 = X.C1507790pL7.LIZ     // Catch: java.lang.Exception -> L8a
            java.lang.String r5 = "rd_tiktokec_apply_auth_request"
            r0 = 2
            kotlin.Pair[] r7 = new kotlin.Pair[r0]     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = "scene"
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Exception -> L8a
            r0.<init>(r1, r11)     // Catch: java.lang.Exception -> L8a
            r4 = 0
            r7[r4] = r0     // Catch: java.lang.Exception -> L8a
            java.lang.String r2 = "success"
            if (r3 == 0) goto L71
            java.lang.Integer r0 = r3.code     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L6d
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L8a
            r0 = -1
            if (r1 == r0) goto L71
        L6d:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData r0 = r3.data     // Catch: java.lang.Exception -> L8a
            if (r0 != 0) goto L72
        L71:
            r4 = 1
        L72:
            r0 = r4 ^ 1
            java.lang.String r1 = X.C893803eS.LIZ(r0)     // Catch: java.lang.Exception -> L8a
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Exception -> L8a
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L8a
            r7[r6] = r0     // Catch: java.lang.Exception -> L8a
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r7)     // Catch: java.lang.Exception -> L8a
            r8.getClass()     // Catch: java.lang.Exception -> L8a
            X.C1507790pL7.LIZJ(r5, r0)     // Catch: java.lang.Exception -> L8a
            return r3
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse r3 = new com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r0, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1735330vG7.LIZIZ(com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthRequest, java.lang.String, X.05Vn):java.lang.Object");
    }
}
