package X;

import android.util.Log;
import com.bytedance.pumbaa.base2.interfaces.IStore;
import com.bytedance.pumbaa.base2.performance.sla.recovery.TimeoutState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.04uP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1247504uP {
    public static volatile C1247404uO LIZ = new C1247404uO(0);

    public static final void LIZ(AbstractC1247804uS abstractC1247804uS) {
        TimeoutState timeoutState;
        Object c098200Yq;
        TimeoutState timeoutStateLIZ = LIZ.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (abstractC1247804uS instanceof C1247704uR) {
            timeoutStateLIZ.getClass();
            timeoutState = new TimeoutState(Long.valueOf(jCurrentTimeMillis), timeoutStateLIZ.lastControlTimeoutAt, timeoutStateLIZ.controlTimeoutAtByApiId);
        } else if (abstractC1247804uS instanceof C1247604uQ) {
            String str = ((C1247604uQ) abstractC1247804uS).LIZ;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            Map<String, Long> mapLJ = timeoutStateLIZ.controlTimeoutAtByApiId;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            timeoutState = new TimeoutState(timeoutStateLIZ.lastInitTimeoutAt, lValueOf, C2097608Jq.LJIILIIL(mapLJ, new Pair(str, Long.valueOf(jCurrentTimeMillis))));
        } else {
            throw new C1954807lC();
        }
        C1247404uO c1247404uO = LIZ;
        c1247404uO.LIZIZ = timeoutState;
        C1247304uN.LIZ();
        if (C1247304uN.LIZIZ != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis2 - c1247404uO.LIZJ >= 2000) {
                try {
                    String strLJIILL = c1247404uO.LIZ.LJIILL(timeoutState);
                    C1247304uN.LIZ();
                    IStore iStore = C1247304uN.LIZIZ;
                    if (iStore != null) {
                        iStore.LIZ(strLJIILL);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("saveState: ");
                    sbLIZ.append(timeoutState);
                    c098200Yq = Integer.valueOf(Log.d("PumbaaPerf_SLA", C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                c1247404uO.LIZJ = jCurrentTimeMillis2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(X.AbstractC1247804uS r10) {
        /*
            X.04uO r0 = X.C1247504uP.LIZ
            com.bytedance.pumbaa.base2.performance.sla.recovery.TimeoutState r7 = r0.LIZ()
            long r8 = java.lang.System.currentTimeMillis()
            boolean r0 = r10 instanceof X.C1247704uR
            r5 = 1000(0x3e8, double:4.94E-321)
            r1 = 86400(0x15180, float:1.21072E-40)
            r4 = 1
            if (r0 == 0) goto L2f
            java.lang.Long r0 = r7.lastInitTimeoutAt
            if (r0 == 0) goto L6a
            long r3 = r0.longValue()
            com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfigs r0 = X.C1247904uT.LIZ
            com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfig r0 = r0.init
            if (r0 == 0) goto L24
            int r1 = r0.discardTimeSeconds
        L24:
            long r1 = (long) r1
            long r1 = r1 * r5
            long r8 = r8 - r3
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L68
        L2b:
            r0 = 1
        L2c:
            r0 = r0 ^ 1
            return r0
        L2f:
            boolean r0 = r10 instanceof X.C1247604uQ
            if (r0 == 0) goto L6c
            com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfigs r0 = X.C1247904uT.LIZ
            com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfig r0 = r0.controlExecution
            if (r0 == 0) goto L3b
            int r1 = r0.discardTimeSeconds
        L3b:
            long r2 = (long) r1
            long r2 = r2 * r5
            com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfigs r0 = X.C1247904uT.LIZ
            com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfig r0 = r0.controlExecution
            if (r0 == 0) goto L55
            boolean r0 = r0.enableApiDiscard
            if (r0 != 0) goto L55
            java.lang.Long r0 = r7.lastControlTimeoutAt
        L49:
            if (r0 == 0) goto L6b
            long r0 = r0.longValue()
            long r8 = r8 - r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L68
            goto L2b
        L55:
            X.04uQ r10 = (X.C1247604uQ) r10
            java.lang.String r1 = r10.LIZ
            java.util.Map<java.lang.String, java.lang.Long> r0 = r7.controlTimeoutAtByApiId
            if (r0 != 0) goto L61
            java.util.Map r0 = X.C2097608Jq.LJ()
        L61:
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            goto L49
        L68:
            r0 = 0
            goto L2c
        L6a:
            return r4
        L6b:
            return r4
        L6c:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1247504uP.LIZIZ(X.04uS):boolean");
    }
}
