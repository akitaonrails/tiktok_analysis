package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330620kjM {
    public static Context LJII;
    public static final List<InterfaceC1330770kjb> LIZ = new ArrayList();
    public static final List<InterfaceC1333880koc> LIZIZ = new ArrayList();
    public static final List<InterfaceC1330840kji> LIZJ = new ArrayList();
    public static final List<InterfaceC589610NAp> LIZLLL = new ArrayList();
    public static boolean LJ = false;
    public static boolean LJFF = false;
    public static boolean LJI = true;
    public static C1330610kjL LJIIIIZZ = new C1330610kjL(new C1330670kjR());

    public static void LIZ(InterfaceC589610NAp interfaceC589610NAp) {
        List<InterfaceC589610NAp> list = LIZLLL;
        synchronized (list) {
            try {
                ((ArrayList) list).add(interfaceC589610NAp);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r0.isAvailable() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(boolean r2, java.lang.String r3, org.json.JSONObject r4) {
        /*
            if (r2 != 0) goto L2b
            android.content.Context r1 = X.C1330620kjM.LJII
            if (r1 == 0) goto L1c
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C786410Ut5.H2(r1, r0)     // Catch: java.lang.Exception -> L51
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L55
            android.net.NetworkInfo r0 = X.C786410Ut5.LJIJ(r0)     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L55
            boolean r0 = r0.isAvailable()     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L55
        L1c:
            X.0kjL r1 = X.C1330620kjM.LJIIIIZZ
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L45
            boolean r0 = r1.LIZLLL
            if (r0 == 0) goto L2b
            java.lang.String r0 = "image_monitor_error_v3"
            com.ss.android.common.lib.AppLogNewUtils.onEventV3(r0, r4)
        L2b:
            java.util.List<X.0kjb> r0 = X.C1330620kjM.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L33:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()
            X.0kjb r0 = (X.InterfaceC1330770kjb) r0
            if (r0 == 0) goto L33
            r0.onImageLoaded(r2, r3, r4)
            goto L33
        L45:
            java.lang.String r1 = "image_monitor_error_v2"
            boolean r0 = X.C791900V4q.LIZ(r1)
            if (r0 == 0) goto L2b
            X.C793770VBv.LJ(r1, r4)
            goto L2b
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            X.04Zy r0 = X.C1120804Zy.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService r0 = X.C1120804Zy.LIZ()
            boolean r0 = r0.isInitedLiveSDK()
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService r0 = X.C1120804Zy.LIZ()     // Catch: java.lang.Throwable -> L6c
            r0.onImageLoaded(r2, r3, r4)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1330620kjM.LIZIZ(boolean, java.lang.String, org.json.JSONObject):void");
    }
}
