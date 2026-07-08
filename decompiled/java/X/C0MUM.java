package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MUM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MUM {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = 0
            android.net.Uri r0 = r4.getUri()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "scene"
            if (r0 == 0) goto Lf
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r2)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1f
        Lf:
            android.content.Intent r0 = r4.getExtra()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1e
            java.lang.String r1 = r0.getStringExtra(r2)     // Catch: java.lang.Exception -> L1a java.lang.Throwable -> L23
            goto L1f
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L23
        L1e:
            r1 = r3
        L1f:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L23
            goto L2f
        L23:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L2f:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L36
            r3 = r1
        L36:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L3c
            java.lang.String r3 = ""
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MUM.LIZ(com.bytedance.router.RouteIntent):java.lang.String");
    }

    public static final boolean LIZIZ(RouteIntent routeIntent) {
        Object c098200Yq;
        Intent extra;
        try {
            Uri uri = routeIntent.getUri();
            boolean z = true;
            if ((uri == null || !uri.getBooleanQueryParameter("is_ep_deeplink", false)) && ((extra = routeIntent.getExtra()) == null || !extra.getBooleanExtra("is_ep_deeplink", false))) {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(com.bytedance.router.RouteIntent r3, java.lang.String r4) {
        /*
            r2 = 0
            android.net.Uri r0 = r3.getUri()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto Ld
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r4)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L1d
        Ld:
            android.content.Intent r0 = r3.getExtra()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.getStringExtra(r4)     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L21
            goto L1d
        L18:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L21
        L1c:
            r1 = r2
        L1d:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L21
            goto L2d
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L2d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L34
            r2 = r1
        L34:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MUM.LIZJ(com.bytedance.router.RouteIntent, java.lang.String):java.lang.String");
    }
}
