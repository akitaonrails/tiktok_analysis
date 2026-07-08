package X;

import com.ss.android.ugc.aweme.minis.api.instantplay.MinisInstantPlayConfigModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0cIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006550cIf {
    public static volatile boolean LIZIZ;
    public static final ConcurrentHashMap<Long, C1006560cIg> LIZ = new ConcurrentHashMap<>();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final C1006580cIi LIZLLL = new InterfaceC1702110uOX() { // from class: X.0cIi
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
            C1006550cIf.LIZJ();
        }
    };
    public static final C1006600cIk LJ = new C1BC3() { // from class: X.0cIk
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512850pTH c1512850pTH, C1512850pTH c1512850pTH2) {
            C1006550cIf.LIZJ();
        }
    };
    public static final C1006590cIj LJFF = new InterfaceC1702120uOY() { // from class: X.0cIj
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512820pTE c1512820pTE, C1512820pTE c1512820pTE2) {
            C1006550cIf.LIZJ();
        }
    };

    public static void LIZ() {
        Iterator<T> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            ((C1006560cIg) it2.next()).LIZJ.set(true);
        }
        LIZ.clear();
        LIZLLL();
        C1007120cJa.LIZ();
    }

    public static void LIZJ() {
        ConcurrentHashMap<Long, C1006560cIg> concurrentHashMap = LIZ;
        if (concurrentHashMap.isEmpty()) {
            LIZLLL();
            return;
        }
        if (LIZIZ() && LIZJ.compareAndSet(false, true)) {
            List<C1006560cIg> listLLIIII = C13LP.LLIIII(concurrentHashMap.values());
            concurrentHashMap.clear();
            LIZLLL();
            for (C1006560cIg c1006560cIg : listLLIIII) {
                if (!c1006560cIg.LIZJ.get()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("executing cardId=");
                    sbLIZ.append(c1006560cIg.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1007120cJa.LIZ();
                    c1006560cIg.LIZIZ.invoke();
                }
            }
        }
    }

    public static void LIZLLL() {
        if (LIZIZ) {
            LIZIZ = false;
            C1BCA.LJJIJ(LIZLLL);
            C1BCA.LJJIJL(LJ);
            C1006590cIj c1006590cIj = LJFF;
            C2200821BBo.LIZ.getClass();
            if (!C2200821BBo.LIZ()) {
                C2201101BCq.LJIIIZ(C1BC9.Memory, c1006590cIj);
            }
            C1007120cJa.LIZ();
        }
    }

    public static boolean LIZIZ() {
        MinisInstantPlayConfigModel minisInstantPlayConfigModelLIZ = C1006570cIh.LIZ();
        EnumC1006810cJ5 enumC1006810cJ5 = C1BCA.LIZLLL().LIZ;
        EnumC1006810cJ5 enumC1006810cJ52 = C1BCA.LJIILIIL().LIZ;
        EnumC1006810cJ5 enumC1006810cJ53 = C1BCA.LJIIIIZZ().LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isResourceAvailable cpu=");
        sbLIZ.append(enumC1006810cJ5);
        sbLIZ.append("(score=");
        sbLIZ.append(enumC1006810cJ5.getScore());
        sbLIZ.append(", req>=");
        sbLIZ.append(minisInstantPlayConfigModelLIZ.idleScheduleRequiredCpuScore);
        sbLIZ.append(") traffic=");
        sbLIZ.append(enumC1006810cJ52);
        sbLIZ.append("(score=");
        sbLIZ.append(enumC1006810cJ52.getScore());
        sbLIZ.append(", req>=");
        sbLIZ.append(minisInstantPlayConfigModelLIZ.idleScheduleRequiredTrafficScore);
        sbLIZ.append(") memory=");
        sbLIZ.append(enumC1006810cJ53);
        sbLIZ.append("(score=");
        sbLIZ.append(enumC1006810cJ53.getScore());
        sbLIZ.append(", req>=");
        sbLIZ.append(minisInstantPlayConfigModelLIZ.idleScheduleRequiredMemoryScore);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
        return enumC1006810cJ5.getScore() >= minisInstantPlayConfigModelLIZ.idleScheduleRequiredCpuScore && enumC1006810cJ52.getScore() >= minisInstantPlayConfigModelLIZ.idleScheduleRequiredTrafficScore && enumC1006810cJ53.getScore() >= minisInstantPlayConfigModelLIZ.idleScheduleRequiredMemoryScore;
    }
}
