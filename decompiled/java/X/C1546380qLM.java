package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0qLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546380qLM {
    public static final C1546380qLM LIZ = new C1546380qLM();
    public static boolean LIZIZ;

    public static void LIZJ() {
        boolean zContainsKey;
        IECommerceHostService iECommerceHostService;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (String str : C1106704Un.LIZ) {
            synchronized (C1300980jxY.class) {
                zContainsKey = ((HashMap) C1300980jxY.LIZ).containsKey(str);
            }
            if (!zContainsKey) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                C1300980jxY.LIZIZ(str, ((IApplicationDependencyService) iECommerceHostService).getApplication().getAssets());
            }
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        C1407880mjy c1407880mjy = new C1407880mjy(jElapsedRealtime);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(c1407880mjy);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r5) {
        /*
            boolean r0 = X.C1546380qLM.LIZIZ
            if (r0 == 0) goto L5
            return
        L5:
            X.0qLN r0 = X.C1546390qLN.LIZ
            r0.getClass()
            boolean r0 = X.C1546390qLN.LJIIIIZZ
            if (r0 == 0) goto L51
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            r3 = 31744(0x7c00, float:4.4483E-41)
            r2 = 0
            java.lang.String r0 = "ecom_pdp_lynx_font_preload"
            r1 = 1
            int r0 = r4.LJIJ(r3, r2, r0, r1)
            if (r0 == 0) goto L51
            boolean r0 = X.C20161913uj.LIZ
            r4 = 0
            if (r0 == 0) goto L52
            if (r5 == 0) goto L5b
            X.19EG r0 = X.C1388190mED.LIZIZ(r5)
            if (r0 == 0) goto L5b
            androidx.lifecycle.LifecycleOwner r0 = X.C20161913uj.LIZLLL(r0)
            if (r0 == 0) goto L5b
        L31:
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            if (r3 == 0) goto L5b
        L37:
            X.C1546380qLM.LIZIZ = r1
            java.util.concurrent.ExecutorService r0 = X.C1546390qLN.LIZJ()
            X.08os r1 = new X.08os
            r1.<init>(r0)
            X.0qYQ r0 = X.C1546390qLN.LJIIJJI
            kotlin.coroutines.CoroutineContext r2 = r1.plus(r0)
            X.0mjx r1 = new X.0mjx
            r1.<init>(r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
        L51:
            return
        L52:
            if (r5 == 0) goto L5b
            X.19EG r0 = X.C1388190mED.LIZIZ(r5)
            if (r0 == 0) goto L5b
            goto L31
        L5b:
            X.03Hh r3 = X.C817503Hh.LL
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546380qLM.LIZ(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r5) {
        /*
            boolean r0 = X.C1546380qLM.LIZIZ
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = X.C1155800gBO.LIZJ()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r0 = X.C20161913uj.LIZ
            r4 = 0
            if (r0 == 0) goto L46
            if (r5 == 0) goto L4f
            X.19EG r0 = X.C1388190mED.LIZIZ(r5)
            if (r0 == 0) goto L4f
            androidx.lifecycle.LifecycleOwner r0 = X.C20161913uj.LIZLLL(r0)
            if (r0 == 0) goto L4f
        L1f:
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            if (r3 == 0) goto L4f
        L25:
            r0 = 1
            X.C1546380qLM.LIZIZ = r0
            X.0qLN r0 = X.C1546390qLN.LIZ
            r0.getClass()
            java.util.concurrent.ExecutorService r0 = X.C1546390qLN.LIZJ()
            X.08os r1 = new X.08os
            r1.<init>(r0)
            X.0qYQ r0 = X.C1546390qLN.LJIIJJI
            kotlin.coroutines.CoroutineContext r2 = r1.plus(r0)
            X.0mjw r1 = new X.0mjw
            r1.<init>(r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
            return
        L46:
            if (r5 == 0) goto L4f
            X.19EG r0 = X.C1388190mED.LIZIZ(r5)
            if (r0 == 0) goto L4f
            goto L1f
        L4f:
            X.03Hh r3 = X.C817503Hh.LL
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546380qLM.LIZIZ(android.content.Context):void");
    }
}
