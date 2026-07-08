package X;

import android.net.TrafficStats;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* JADX INFO: renamed from: X.18lS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21378418lS {
    public static int LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static PthreadTimer LJIIIZ;
    public static int LJIIJ;
    public static final C21378418lS LIZ = new C21378418lS();
    public static long LJFF = -1;
    public static long LJI = -1;
    public static long LJII = -1;
    public static long LJIIIIZZ = -1;
    public static float LJIIJJI = 0.9f;

    public final synchronized boolean LIZ() {
        if (LIZIZ <= 11) {
            return LJII >= 2097152;
        }
        return ((float) LJII) >= Math.max(LJIIJJI * ((float) LIZLLL), 102400.0f);
    }

    public final synchronized boolean LIZIZ() {
        if (LIZIZ <= 11) {
            return LJIIIIZZ >= 1048576;
        }
        return ((float) LJIIIIZZ) >= Math.max(LJIIJJI * ((float) LJ), 102400.0f);
    }

    public final synchronized void LIZLLL() {
        LJFF = -1L;
        LJI = -1L;
        LJIIIIZZ = -1L;
        LJII = -1L;
    }

    public final void LIZJ() {
        int i = LJIIJ + 1;
        LJIIJ = i;
        if (i > 0) {
            synchronized (this) {
                if (LIZJ) {
                    return;
                }
                C0W9W c0w9w = new C0W9W() { // from class: X.18lT
                    public static void LIZ() {
                        synchronized (C21378418lS.LIZ) {
                            try {
                                long jA4 = C786410Ut5.a4();
                                long totalTxBytes = TrafficStats.getTotalTxBytes();
                                long j = C21378418lS.LJFF;
                                if (j > 0) {
                                    long j2 = C21378418lS.LJI;
                                    if (j2 > 0) {
                                        long j3 = jA4 - j;
                                        C21378418lS.LJII = j3;
                                        C21378418lS.LJIIIIZZ = totalTxBytes - j2;
                                        C21378418lS.LIZLLL = Math.max(j3, C21378418lS.LIZLLL);
                                        C21378418lS.LJ = Math.max(C21378418lS.LJIIIIZZ, C21378418lS.LJ);
                                    }
                                }
                                C21378418lS.LJFF = jA4;
                                C21378418lS.LJI = totalTxBytes;
                            } catch (RuntimeException e) {
                                TryCatchGuardChecker.doCheck(e);
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                InterfaceC744680TJa interfaceC744680TJa = C0TJZ.LIZ;
                                if (interfaceC744680TJa != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("TaskScheduler | ");
                                    sbLIZ.append(message);
                                    interfaceC744680TJa.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                        int i2 = C21378418lS.LIZIZ;
                        if (i2 <= 11) {
                            C21378418lS.LIZIZ = i2 + 1;
                        }
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("NetworkMonitor@edd6.startCollectingNetworkSpeed$collectNetworkInfoTask$1");
                        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                        try {
                            LIZ();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("NetworkMonitor@edd6.startCollectingNetworkSpeed$collectNetworkInfoTask$1");
                    }
                };
                PthreadTimer pthreadTimer = new PthreadTimer("etworkMonitor");
                LJIIIZ = pthreadTimer;
                pthreadTimer.schedule(c0w9w, 0L, 1000L);
                LIZJ = true;
            }
        }
    }
}
