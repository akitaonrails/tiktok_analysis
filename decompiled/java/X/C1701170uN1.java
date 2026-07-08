package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0uN1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701170uN1 {
    public static final C1701150uMz LIZ = new C1701150uMz();
    public static final List<Runnable> LIZIZ = new ArrayList();
    public static final ExecutorService LIZJ = C823050WQl.LIZLLL();
    public static CountDownLatch LIZLLL = new CountDownLatch(1);

    public static Bundle LIZ(String str, String str2) {
        C1701150uMz c1701150uMz = LIZ;
        if (!((Keva) c1701150uMz.LIZ.getValue()).getBoolean(str2, false)) {
            return null;
        }
        byte[] bytesJustDisk = ((Keva) c1701150uMz.LIZ.getValue()).getBytesJustDisk(str, new byte[0]);
        if (bytesJustDisk.length == 0) {
            return null;
        }
        return C838390Wuj.LIZ(bytesJustDisk);
    }

    public static void LIZIZ(final String str, final String str2, Bundle bundle, long j, int i) {
        long j2 = j;
        if ((i & 8) != 0) {
            j2 = 2000;
        }
        final Runnable runnable = null;
        final byte[] bArrLIZLLL = C838390Wuj.LIZLLL(bundle);
        if (bArrLIZLLL.length != 0) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            Runnable runnable2 = new Runnable() { // from class: X.0uN0
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SceneLargeTransaction@b671.writeBundleToDiskAsync$runnable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SceneLargeTransaction@b671.writeBundleToDiskAsync$runnable$1");
                }

                public final void LIZ() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SceneLargeTransaction write disk begin uuid: ");
                    sbLIZ.append(str);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                    String str3 = str2;
                    String str4 = str;
                    byte[] bArr = bArrLIZLLL;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                    c1701150uMz.LIZLLL(str3, false);
                    c1701150uMz.LJ(str4, bArr, true);
                    c1701150uMz.LIZLLL(str3, true);
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                    Runnable runnable3 = runnable;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SceneLargeTransaction write disk finish uuid: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", execute cost ");
                    sbLIZ2.append(jCurrentTimeMillis4);
                    sbLIZ2.append(" ms, actual execute cost ");
                    sbLIZ2.append(jCurrentTimeMillis3);
                    sbLIZ2.append(" ms");
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(jCurrentTimeMillis4, "execute_cost");
                    c2344009Gk.LIZLLL(jCurrentTimeMillis3, "actual_execute_cost");
                    C20684815ws.LJIILLIIL("SceneLargeTransaction", c2344009Gk.LIZ);
                    ArrayList arrayList = (ArrayList) C1701170uN1.LIZIZ;
                    arrayList.remove(this);
                    if (arrayList.isEmpty()) {
                        C1701170uN1.LIZLLL.countDown();
                    }
                }
            };
            if (LIZLLL.getCount() == 0) {
                LIZLLL = new CountDownLatch(1);
            }
            ((ArrayList) LIZIZ).add(runnable2);
            LIZJ.execute(runnable2);
            if (C2214201BlK.LJIIJJI) {
                try {
                    LIZLLL.await(j2, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
