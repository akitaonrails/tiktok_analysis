package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07xS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2030807xS {
    public static volatile Boolean LIZ;
    public static final Object LIZIZ = new Object();

    public static boolean LIZ() {
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (LIZIZ) {
            try {
                if (LIZ == null) {
                    C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.07xR
                        public static void LIZ() {
                            int iLJIJ;
                            if (C2030807xS.LIZ != null) {
                                return;
                            }
                            try {
                                iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_global_image_monitor_v2", true);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                iLJIJ = 0;
                            }
                            synchronized (C2030807xS.LIZIZ) {
                                try {
                                    if (C2030807xS.LIZ == null) {
                                        C2030807xS.LIZ = Boolean.valueOf((System.currentTimeMillis() & 127) < ((long) C13LZ.LJ(iLJIJ, 0, 127)));
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SearchGlobalImageMonitorExperiment@52b3.loadValueAsync$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SearchGlobalImageMonitorExperiment@52b3.loadValueAsync$1");
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return false;
    }
}
