package X;

import com.bytedance.router.RouteIntent;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ncf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597870Ncf {
    public final RouteIntent LIZ;
    public final Map<String, Object> LIZIZ = new LinkedHashMap();
    public WeakReference<InterfaceC1541990qEH> LIZJ = new WeakReference<>(null);

    public final void LIZIZ() {
        Object obj = (InterfaceC1541990qEH) this.LIZJ.get();
        if ((obj instanceof C1537710q7N) && (!this.LIZIZ.isEmpty())) {
            ((LynxView) obj).updateData(TemplateData.LJII(this.LIZIZ));
        }
    }

    public C597870Ncf(RouteIntent routeIntent, String str) {
        this.LIZ = routeIntent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn r14, X.C597830Ncb r15) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C597860Nce
            if (r0 == 0) goto L2d
            r7 = r14
            X.0Nce r7 = (X.C597860Nce) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r5 = r7.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            java.lang.String r4 = "rd_ttec_store_net_load"
            java.lang.String r3 = "err_info"
            java.lang.String r6 = "is_success"
            r10 = 0
            r9 = 1
            if (r0 == 0) goto L3b
            if (r0 != r9) goto L33
            long r0 = r7.LLILLJJLI
            java.lang.Object r2 = r7.LL
            java.util.Map r2 = (java.util.Map) r2
            goto L65
        L2d:
            X.0Nce r7 = new X.0Nce
            r7.<init>(r11, r14)
            goto L12
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            X.C155000ia.LIZIZ(r5)
            kotlin.Pair[] r2 = new kotlin.Pair[r9]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "current_page"
            r1.<init>(r0, r12)
            r2[r10] = r1
            java.util.Map r2 = X.C2097608Jq.LJIIJ(r2)
            if (r13 == 0) goto L54
            java.lang.String r0 = "scene"
            r2.put(r0, r13)
        L54:
            long r0 = java.lang.System.currentTimeMillis()
            r7.LL = r2     // Catch: java.lang.Exception -> La3 java.util.concurrent.CancellationException -> Lbd
            r7.LLILLJJLI = r0     // Catch: java.lang.Exception -> La3 java.util.concurrent.CancellationException -> Lbd
            r7.LLILZIL = r9     // Catch: java.lang.Exception -> La3 java.util.concurrent.CancellationException -> Lbd
            java.lang.Object r5 = r15.invoke(r7)     // Catch: java.lang.Exception -> La3 java.util.concurrent.CancellationException -> Lbd
            if (r5 != r8) goto L68
            return r8
        L65:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lbd
        L68:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r5 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r5     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lbd
            boolean r7 = r5.isCodeOK()
            if (r7 == 0) goto L89
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r0
            java.lang.Long r1 = X.C2286608xc.LJFF(r7)
            java.lang.String r0 = "duration"
            r2.put(r0, r1)
            java.lang.Integer r0 = X.C2286608xc.LJ(r9)
            r2.put(r6, r0)
        L85:
            X.C1421105hJ.LIZJ(r4, r2)
            return r5
        L89:
            java.lang.Integer r0 = X.C2286608xc.LJ(r10)
            r2.put(r6, r0)
            int r0 = r5.code
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.String r0 = "err_code"
            r2.put(r0, r1)
            java.lang.String r0 = r5.message
            if (r0 == 0) goto L85
            r2.put(r3, r0)
            goto L85
        La3:
            r1 = move-exception
            goto La6
        La5:
            r1 = move-exception
        La6:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.Integer r0 = X.C2286608xc.LJ(r10)
            r2.put(r6, r0)
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto Lb9
            r2.put(r3, r0)
        Lb9:
            X.C1421105hJ.LIZJ(r4, r2)
            throw r1
        Lbd:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C597870Ncf.LIZ(java.lang.String, java.lang.String, X.05Vn, X.0Ncb):java.lang.Object");
    }
}
