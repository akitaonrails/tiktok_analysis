package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Bui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303300Bui {
    public static final C303300Bui LIZ = new C303300Bui();
    public static volatile Integer LIZIZ;
    public static volatile boolean LIZJ;

    public final void LIZ() {
        if (LIZJ) {
            return;
        }
        synchronized (this) {
            try {
                if (LIZJ) {
                    return;
                }
                LIZJ = true;
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Buh
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchGlobalImageLoadInterceptorV2@ffbf.loadValueAsync$2");
                        int iLJIJ = 0;
                        try {
                            try {
                                iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_global_image_interceptor_v2", true);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            C303300Bui.LIZIZ = Integer.valueOf(iLJIJ);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchGlobalImageLoadInterceptorV2@ffbf.loadValueAsync$2");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
