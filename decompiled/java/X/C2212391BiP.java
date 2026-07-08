package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.1BiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212391BiP {
    public static void LIZIZ() {
        boolean zLJI = MethodIDManager.LJI(137884);
        C786410Ut5.LJLIIL(C2212231Bi9.LJJIJIL, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.1BiQ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BDASplashWebService@dab3.tryRequestSplashApi$1");
                try {
                    C2212231Bi9.LJFF.submit(new Runnable() { // from class: X.1BiK
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("BDASplashWebService@dab3.tryRequestSplashApi$1$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("BDASplashWebService@dab3.tryRequestSplashApi$1$1");
                        }

                        public static void LIZ() {
                            C1554590qYb.LIZ().getClass();
                            boolean zLJI2 = MethodIDManager.LJI(137848);
                            C2212171Bi3 c2212171Bi3LJ = C2212171Bi3.LJ();
                            c2212171Bi3LJ.getClass();
                            if (C804410Vh1.LIZIZ(C2212231Bi9.LJIILL)) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (C2212231Bi9.LJJJJJ || jCurrentTimeMillis - c2212171Bi3LJ.LIZ > c2212171Bi3LJ.LIZIZ) {
                                    c2212171Bi3LJ.LJIIIZ();
                                } else {
                                    C2212381BiO.LJFF(" too short to request ");
                                }
                            } else {
                                C2212381BiO.LJFF(" network is unavailable, requesting data is impossible");
                            }
                            if (zLJI2) {
                                MethodIDManager.LJ();
                            }
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BDASplashWebService@dab3.tryRequestSplashApi$1");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZ(boolean z, boolean z2) {
        boolean zLJI = MethodIDManager.LJI(137732);
        if (C2212231Bi9.LIZJ == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        long j = C2212231Bi9.LJJIJL;
        if (j <= 0) {
            j = 2000;
        }
        C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new RunnableC2212371BiN(z, z2));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
