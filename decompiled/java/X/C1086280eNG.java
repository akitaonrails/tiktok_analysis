package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086280eNG {
    public static long LIZ;
    public static C1086250eND LIZIZ = new C1086250eND();
    public static final Map<Long, C1086330eNL> LIZJ = new LinkedHashMap();

    public static boolean LIZIZ() {
        return !LIZJ.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("totalCount=");
        sbLIZ.append(LIZ);
        sbLIZ.append(',');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("flareData=");
        sbLIZ2.append(C1516000pYM.LIZJ(LIZIZ));
        sbLIZ2.append(',');
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("promoteList=");
        sbLIZ3.append(C1516000pYM.LIZJ(LIZJ));
        sbLIZ3.append(',');
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        return sb.toString();
    }

    public static boolean LIZ(long j) {
        boolean zIsEmpty;
        Map<Long, C1086330eNL> map = LIZJ;
        synchronized (map) {
            try {
                zIsEmpty = map.isEmpty();
                map.put(Long.valueOf(j), new C1086330eNL());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zIsEmpty;
    }

    public static boolean LIZJ(long j, long j2) {
        boolean z;
        Map<Long, C1086330eNL> map = LIZJ;
        synchronized (map) {
            try {
                C1086330eNL c1086330eNL = (C1086330eNL) ((LinkedHashMap) map).get(Long.valueOf(j));
                z = false;
                if (c1086330eNL != null) {
                    long j3 = 10;
                    long j4 = 20;
                    if ((j2 + j3) / j4 > (c1086330eNL.LIZ + j3) / j4) {
                        z = true;
                    }
                    c1086330eNL.LIZ = j2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
