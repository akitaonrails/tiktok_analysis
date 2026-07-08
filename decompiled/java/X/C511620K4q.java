package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511620K4q implements InterfaceC511460K4a {
    public static final C511620K4q LIZ = new C511620K4q();

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // X.InterfaceC511460K4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isAvailable() {
        /*
            r6 = this;
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L21
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1f
            boolean r1 = r0.M3()     // Catch: java.lang.Throwable -> L21
            r0 = 1
            if (r1 != r0) goto L1f
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L21
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L21
            goto L2d
        L1f:
            r0 = 0
            goto L17
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L2d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L36
            r2 = r1
        L36:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C511620K4q.isAvailable():boolean");
    }

    public static boolean LJII(Uri uri, Context context) {
        Object c098200Yq;
        Object c098200Yq2;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        C511540K4i.LIZ.getClass();
        int i = C511590K4n.LIZ[C511540K4i.LIZ(context, uri, null).ordinal()];
        if (i == 1) {
            return true;
        }
        boolean z = false;
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            if (context == null) {
                return false;
            }
            try {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && iLiveOuterService.M3() && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && interfaceC20673515v3K4.LJJIJ(context, uri)) {
                    z = true;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = Boolean.FALSE;
            }
            if (((Boolean) c098200Yq).booleanValue()) {
                return true;
            }
            try {
                SmartRouter.buildRoute(context, uri.toString()).open();
                c098200Yq2 = Boolean.TRUE;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                c098200Yq2 = Boolean.FALSE;
            }
            return ((Boolean) c098200Yq2).booleanValue();
        }
        throw new C1954807lC();
    }

    public static final Uri LJIIIIZZ(Uri uri, Map<String, String> map) {
        if (uri == null) {
            return null;
        }
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            uri = C0K51.LJIIIIZZ(uri, (String) entry.getKey(), (String) entry.getValue());
        }
        return uri;
    }

    @Override // X.InterfaceC511460K4a
    public final boolean LJI(Context context, Map map) {
        return C511630K4r.LIZLLL(this, context, map);
    }

    @Override // X.InterfaceC511460K4a
    public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
        Uri uriLJIIIIZZ = LJIIIIZZ(uri, map);
        if (uriLJIIIIZZ == null) {
            return false;
        }
        return LJII(uriLJIIIIZZ, context);
    }

    @Override // X.InterfaceC511460K4a
    public final boolean LIZIZ(Context context, String str, Map<String, String> map) {
        return LJ(context, str, map);
    }

    @Override // X.InterfaceC511460K4a
    public final boolean LIZJ(Context context, String str, Map<String, String> map) {
        return LJ(context, str, map);
    }

    @Override // X.InterfaceC511460K4a
    public final boolean LIZLLL(Context context, String str, Map<String, String> map) {
        return LJ(context, str, map);
    }

    @Override // X.InterfaceC511460K4a
    public final boolean LJ(Context context, String str, Map<String, String> map) {
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            Object obj = null;
            if (0 == 0) {
                try {
                    c098200Yq = LJIIIIZZ(UriProtector.parse(str), map);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                Uri uri = (Uri) obj;
                if (uri != null) {
                    return LJII(uri, context);
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC511460K4a
    public final boolean LJFF(Context context, long j, Map map) {
        return C511630K4r.LIZJ(this, context, j, map);
    }
}
