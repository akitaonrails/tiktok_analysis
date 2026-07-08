package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982320bfa {
    public static DataChannel LIZ;
    public static final ConcurrentHashMap<Long, InterfaceC983700bho> LIZIZ = new ConcurrentHashMap<>();
    public static final C982340bfc LIZJ = new InterfaceC983810bhz() { // from class: X.0bfc
        @Override // X.InterfaceC983810bhz
        public final String getName() {
            return "CompetitionCountDownManager";
        }

        @Override // X.InterfaceC983810bhz
        public final void LJ(long j, long j2, TimeUnit timeUnit) {
            try {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dispatchCount, size = ");
                    ConcurrentHashMap<Long, InterfaceC983700bho> concurrentHashMap = C982320bfa.LIZIZ;
                    sbLIZ.append(concurrentHashMap.size());
                    sbLIZ.append(", countDuration=");
                    sbLIZ.append(j2);
                    C20441214yg.LIZIZ("CompetitionCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
                    Iterator<Map.Entry<Long, InterfaceC983700bho>> it2 = concurrentHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Long, InterfaceC983700bho> next = it2.next();
                        next.getValue().LJ(j, j2, timeUnit);
                        if (next.getValue().LIZLLL()) {
                            next.getValue().LIZJ(C982320bfa.LIZ);
                        }
                        if (next.getValue().LIZIZ()) {
                            C20441214yg.LIZIZ("CompetitionCountDownManager", "dispatchCount, onTimeOut");
                            it2.remove();
                            next.getValue().LIZ();
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("dispatchCount, exception = ");
                    sbLIZ2.append(e);
                    C20441214yg.LJ("CompetitionCountDownManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
                C982320bfa.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C982320bfa.LIZIZ();
                throw th;
            }
        }
    };

    public static void LIZIZ() {
        if (LIZIZ.isEmpty()) {
            C983830bi1.LIZ.LIZJ("removeCountDown_checkCountTimeMapAndRemoveTimerCallback", LIZJ);
        }
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCountDown, source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CompetitionCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        try {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("forceClearCountTimeMap, source=");
                sbLIZ2.append(str);
                sbLIZ2.append(", countTimeMap size = ");
                ConcurrentHashMap<Long, InterfaceC983700bho> concurrentHashMap = LIZIZ;
                sbLIZ2.append(concurrentHashMap.size());
                sbLIZ2.append('}');
                C20441214yg.LIZIZ("CompetitionCountDownManager", C2188811AlT.LIZIZ(sbLIZ2));
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
                C20441214yg.LJ("CompetitionCountDownManager", C2188811AlT.LIZIZ(sbLIZ3));
            }
            LIZIZ.clear();
            C983820bi0 c983820bi0 = C983830bi1.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("removeCountDown_");
            sbLIZ4.append(str);
            c983820bi0.LIZJ(C2188811AlT.LIZIZ(sbLIZ4), LIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ.clear();
            throw th;
        }
    }

    public static void LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeCountDown, uid = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("CompetitionCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.remove(Long.valueOf(j));
        LIZIZ();
    }

    public static void LIZ(EnumC962960bAM enumC962960bAM, EnumC982850bgR enumC982850bgR, long j, long j2, long j3, boolean z, Function1 function1, Function0 function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addCountDown, bizType=");
        sbLIZ.append(enumC962960bAM);
        sbLIZ.append(", source=");
        sbLIZ.append(enumC982850bgR);
        sbLIZ.append(", uid=");
        sbLIZ.append(j);
        sbLIZ.append(", currentDuration=");
        sbLIZ.append(j2);
        sbLIZ.append(", limitDuration=");
        sbLIZ.append(j3);
        C20441214yg.LIZIZ("CompetitionCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.put(Long.valueOf(j), new C982840bgQ(EnumC983000bgg.COUNT_DOWN, enumC962960bAM, enumC982850bgR, j, TimeUnit.SECONDS, j2, j3, z, function1, function0));
        C983820bi0 c983820bi0 = C983830bi1.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addCountDown_");
        sbLIZ2.append(enumC982850bgR);
        c983820bi0.LIZ(C2188811AlT.LIZIZ(sbLIZ2), LIZJ);
    }
}
