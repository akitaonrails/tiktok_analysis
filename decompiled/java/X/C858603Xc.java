package X;

import android.os.SystemClock;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.03Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C858603Xc {
    public static C099G LIZIZ;
    public static final C858603Xc LIZ = new C858603Xc();
    public static final Map<String, AnonymousClass0957<n>> LIZJ = new LinkedHashMap();
    public static long LIZLLL = -1;
    public static long LJ = -1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C858803Xe
            if (r0 == 0) goto L39
            r4 = r6
            X.03Xe r4 = (X.C858803Xe) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelResponse r3 = (com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelResponse) r3
            if (r3 == 0) goto L47
            com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData r0 = r3.data
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.099G r0 = X.C858603Xc.LIZIZ
            if (r0 == 0) goto L47
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJLIIIL(r4)
            if (r3 != r2) goto L22
            return r2
        L39:
            X.03Xe r4 = new X.03Xe
            r4.<init>(r5, r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L47:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C858603Xc.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C858903Xf
            if (r0 == 0) goto L43
            r4 = r6
            X.03Xf r4 = (X.C858903Xf) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L49
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData r3 = (com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData) r3
            if (r3 == 0) goto L35
            java.lang.Boolean r1 = r3.showPanel
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            r0 = 0
            goto L30
        L37:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZ(r4)
            if (r3 != r2) goto L22
            return r2
        L43:
            X.03Xf r4 = new X.03Xf
            r4.<init>(r5, r6)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C858603Xc.LJ(X.05Vn):java.lang.Object");
    }

    public static Object LIZIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        AnonymousClass0957 anonymousClass0957;
        if (str == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZJ;
        if (linkedHashMap.get(str) == null || (anonymousClass0957 = (AnonymousClass0957) linkedHashMap.get(str)) == null) {
            return null;
        }
        return anonymousClass0957.LJLIIIL(interfaceC1364105Vn);
    }

    public static void LIZLLL(InterfaceC497601wk interfaceC497601wk, GetAddonPanelLayoutRequest getAddonPanelLayoutRequest) {
        InterfaceC497601wk interfaceC497601wkLIZ;
        if (!C839203Pq.LIZ().pdpSwitch) {
            return;
        }
        LJ = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - LIZLLL > 1000) {
            LIZLLL = jElapsedRealtime;
            if (interfaceC497601wk == null) {
                interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
            } else {
                interfaceC497601wkLIZ = interfaceC497601wk;
            }
            C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C03XY(getAddonPanelLayoutRequest, null), 3);
            C099G c099g = LIZIZ;
            if (c099g != null && c099g.isActive()) {
                C099G c099g2 = LIZIZ;
                if (c099g2 != null) {
                    c099g2.LIZIZ(null);
                }
                LIZIZ = null;
            }
            if (interfaceC497601wk == null) {
                interfaceC497601wk = C2296808zG.LIZ(C0PEM.LIZJ);
            }
            LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C858503Xb(getAddonPanelLayoutRequest, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.Object> r12, java.util.Map<java.lang.String, java.lang.Object> r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C858603Xc.LIZJ(android.content.Context, java.lang.String, java.util.Map, java.util.Map, X.05Vn):java.lang.Object");
    }
}
