package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0UzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC790180UzA implements Runnable {
    public final long LL;

    public final void LIZ() {
        C790190UzB c790190UzB = C790190UzB.LIZLLL;
        if (c790190UzB != null) {
            long j = this.LL;
            synchronized (c790190UzB) {
                try {
                    if (c790190UzB.LIZ.containsKey(Long.valueOf(j))) {
                        TTVideoEngine tTVideoEngine = c790190UzB.LIZ.get(Long.valueOf(j)).get();
                        if (tTVideoEngine == null) {
                            return;
                        }
                        long jLJJJLZIJ = tTVideoEngine.LJJJLZIJ(81);
                        if (jLJJJLZIJ > 0) {
                            c790190UzB.LIZIZ += jLJJJLZIJ;
                        }
                        c790190UzB.LIZ.remove(Long.valueOf(j));
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("delete engine: ");
                        sbLIZ.append(j);
                        sbLIZ.append(", waste data: ");
                        sbLIZ.append(jLJJJLZIJ);
                        TTVideoEngineLog.d("VideoInfoCollecor", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VideoInfoCollector$myVideoCollectorUnregister@9e36.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoInfoCollector$myVideoCollectorUnregister@9e36.run");
    }

    public RunnableC790180UzA(long j) {
        this.LL = j;
    }
}
