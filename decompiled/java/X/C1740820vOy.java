package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.ECPayResultPreCache;

/* JADX INFO: renamed from: X.0vOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740820vOy {
    public static final C1740820vOy LIZ = new C1740820vOy();

    public static boolean LIZ(String str) {
        try {
            if (C703302op.LIZ(str)) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                ECPayResultPreCache eCPayResultPreCache = C1740840vP0.LIZ;
                ECPayResultPreCache eCPayResultPreCache2 = (ECPayResultPreCache) settingsManagerLIZLLL.LJIIIIZZ("ec_pay_result_pre_cache_setting", ECPayResultPreCache.class, eCPayResultPreCache);
                if (eCPayResultPreCache2 != null) {
                    eCPayResultPreCache = eCPayResultPreCache2;
                }
                if (eCPayResultPreCache.pmIds.contains(str)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.AnonymousClass0957<com.google.gson.n> r6, android.content.Context r7, java.util.List<java.lang.String> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1740830vOz
            if (r0 == 0) goto L80
            r4 = r9
            X.0vOz r4 = (X.C1740830vOz) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L70
            if (r1 != r0) goto L89
            java.lang.Object r8 = r4.LLILLJJLI
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r4.LL
            android.content.Context r7 = (android.content.Context) r7
            X.C155000ia.LIZIZ(r3)
        L2a:
            com.google.gson.k r3 = (com.google.gson.k) r3
            if (r3 == 0) goto L86
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L86
            if (r8 == 0) goto L3e
            java.lang.Object r2 = X.C13LP.LJJJLL(r8)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L40
        L3e:
            java.lang.String r2 = ""
        L40:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "payment_result_cache_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "_2"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            X.0ymf r0 = X.C1323720kYE.LIZ(r7)
            r0.LJIIIIZZ(r3, r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.IEventCenter> r0 = com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r1 = (com.ss.android.ugc.aweme.ecommerce.service.IEventCenter) r1
            java.lang.String r0 = "ec_payment_result_cache"
            r1.LIZ(r0, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L70:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r7
            r4.LLILLJJLI = r8
            r4.LLILZIL = r0
            java.lang.Object r3 = r6.LJLIIIL(r4)
            if (r3 != r2) goto L2a
            return r2
        L80:
            X.0vOz r4 = new X.0vOz
            r4.<init>(r5, r9)
            goto L12
        L86:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740820vOy.LIZIZ(X.0957, android.content.Context, java.util.List, X.05Vn):java.lang.Object");
    }
}
