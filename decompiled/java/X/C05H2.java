package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05H2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05H2 {
    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("landing_response_");
        sbLIZ.append(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C05H1
            if (r0 == 0) goto L85
            r4 = r10
            X.05H1 r4 = (X.C05H1) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r8 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            if (r0 == r7) goto L29
            if (r0 != r5) goto L8b
            X.C155000ia.LIZIZ(r8)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            goto L61
        L2e:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r0 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L46
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            java.lang.String r6 = LIZJ()
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Throwable -> L67
            java.lang.Class<X.05H5> r0 = X.C05H5.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Throwable -> L67
            X.05H5 r0 = (X.C05H5) r0     // Catch: java.lang.Throwable -> L67
            r4.LL = r6     // Catch: java.lang.Throwable -> L67
            r4.LLILZ = r7     // Catch: java.lang.Throwable -> L67
            java.lang.Object r8 = r0.LIZ(r4)     // Catch: java.lang.Throwable -> L67
            if (r8 != r3) goto L64
            goto L93
        L61:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L67
        L64:
            com.ss.android.ugc.aweme.ecommerce.ug.landing.GetLandingShopTabResponse r8 = (com.ss.android.ugc.aweme.ecommerce.ug.landing.GetLandingShopTabResponse) r8     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r8 = r2
        L6c:
            if (r8 != 0) goto L71
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L71:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05H4 r0 = new X.05H4
            r0.<init>(r8, r6, r2)
            r4.LL = r2
            r4.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L26
            return r3
        L85:
            X.05H1 r4 = new X.05H1
            r4.<init>(r9, r10)
            goto L12
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05H2.LIZ(X.05Vn):java.lang.Object");
    }

    public static void LIZLLL(String str, boolean z) {
        int i;
        if (((Boolean) C05H7.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C05H3(str, z, null), 3);
            return;
        }
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        Pair[] pairArr = new Pair[2];
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[0] = new Pair("result", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("fail_reason", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("default_landing_result", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C05H0
            if (r0 == 0) goto L20
            r5 = r8
            X.05H0 r5 = (X.C05H0) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.05H0 r5 = new X.05H0
            r5.<init>(r6, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L54
            goto L58
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Throwable -> L54
            java.lang.Class<X.05H5> r0 = X.C05H5.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Throwable -> L54
            X.05H5 r2 = (X.C05H5) r2     // Catch: java.lang.Throwable -> L54
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol.LLILZ     // Catch: java.lang.Throwable -> L54
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r2.LIZIZ(r7, r1, r0, r5)     // Catch: java.lang.Throwable -> L54
            if (r0 != r4) goto L58
            return r4
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L58:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05H2.LIZIZ(int, X.05Vn):java.lang.Object");
    }
}
