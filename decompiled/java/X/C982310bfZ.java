package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0bfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982310bfZ {
    public static DataChannel LIZ;
    public static final ConcurrentHashMap<Long, InterfaceC983700bho> LIZIZ = new ConcurrentHashMap<>();
    public static final C982330bfb LIZJ = new InterfaceC983810bhz() { // from class: X.0bfb
        @Override // X.InterfaceC983810bhz
        public final String getName() {
            return "CompetitionCountUpManager";
        }

        @Override // X.InterfaceC983810bhz
        public final void LJ(long j, long j2, TimeUnit timeUnit) {
            try {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dispatchCount, size = ");
                    ConcurrentHashMap<Long, InterfaceC983700bho> concurrentHashMap = C982310bfZ.LIZIZ;
                    sbLIZ.append(concurrentHashMap.size());
                    sbLIZ.append(", countDuration=");
                    sbLIZ.append(j2);
                    C20441214yg.LIZIZ("CompetitionCountUpManager", C2188811AlT.LIZIZ(sbLIZ));
                    Iterator<Map.Entry<Long, InterfaceC983700bho>> it2 = concurrentHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Long, InterfaceC983700bho> next = it2.next();
                        next.getValue().LJ(j, j2, timeUnit);
                        if (next.getValue().LIZLLL()) {
                            next.getValue().LIZJ(C982310bfZ.LIZ);
                        }
                        if (next.getValue().LIZIZ()) {
                            C20441214yg.LIZIZ("CompetitionCountUpManager", "dispatchCount, onTimeOut");
                            it2.remove();
                            next.getValue().LIZ();
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("dispatchCount, exception = ");
                    sbLIZ2.append(e);
                    C20441214yg.LJ("CompetitionCountUpManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (C982310bfZ.LIZIZ.isEmpty()) {
                    C983830bi1.LIZ.LIZJ("removeCountUp_checkCountTimeMapAndRemoveTimerCallback", C982310bfZ.LIZJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C982310bfZ.LIZIZ.isEmpty()) {
                    C983830bi1.LIZ.LIZJ("removeCountUp_checkCountTimeMapAndRemoveTimerCallback", C982310bfZ.LIZJ);
                }
                throw th;
            }
        }
    };

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCountUp, source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CompetitionCountUpManager", C2188811AlT.LIZIZ(sbLIZ));
        try {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("forceClearCountTimeMap, source=");
                sbLIZ2.append(str);
                sbLIZ2.append(", countTimeMap size = ");
                ConcurrentHashMap<Long, InterfaceC983700bho> concurrentHashMap = LIZIZ;
                sbLIZ2.append(concurrentHashMap.size());
                sbLIZ2.append('}');
                C20441214yg.LIZIZ("CompetitionCountUpManager", C2188811AlT.LIZIZ(sbLIZ2));
                Iterator<Map.Entry<Long, InterfaceC983700bho>> it2 = concurrentHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.remove();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("forceClearCountTimeMap, source=");
                sbLIZ3.append(str);
                sbLIZ3.append(", e = ");
                sbLIZ3.append(e);
                C20441214yg.LJ("CompetitionCountUpManager", C2188811AlT.LIZIZ(sbLIZ3));
            }
            LIZIZ.clear();
            C983820bi0 c983820bi0 = C983830bi1.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("removeCountUp_");
            sbLIZ4.append(str);
            c983820bi0.LIZJ(C2188811AlT.LIZIZ(sbLIZ4), LIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ.clear();
            throw th;
        }
    }
}
