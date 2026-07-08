package X;

import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDowngradeExperiment;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDowngradeLoggerSamplingExp;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDowngradeSourceConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1BCM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BCM {
    public static boolean LIZLLL;
    public static final C1BCM LIZ = new C1BCM();
    public static final Map<String, Integer> LIZIZ = C2097608Jq.LJIIJ(new Pair("cpu", 1), new Pair("batterySaveMode", 8), new Pair("temp", 16), new Pair("drop3", 32), new Pair("memory", 64), new Pair("batteryLevel", 128));
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static final C01GW LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS225S0000000_34.get$arr$(288));
    public static final List<InterfaceC1607520rvy> LJFF = new ArrayList();
    public static final C1BCP LJI = new InterfaceC1702110uOX() { // from class: X.1BCP
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
            if (c1512840pTG2.LIZ == EnumC1006810cJ5.Critical) {
                C1BCM.LIZJ.add("cpu");
                C1BCM.LIZ.getClass();
                C1BCM.LIZJ();
                C1BCM.LIZLLL();
                return;
            }
            C1BCM.LIZJ.remove("cpu");
            C1BCM.LIZ.getClass();
            C1BCM.LIZJ();
        }
    };
    public static final C1BCQ LJII = new InterfaceC1702120uOY() { // from class: X.1BCQ
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512820pTE c1512820pTE, C1512820pTE c1512820pTE2) {
            if (c1512820pTE2.LIZ == EnumC1006810cJ5.Critical) {
                C1BCM.LIZJ.add("memory");
                C1BCM.LIZ.getClass();
                C1BCM.LIZJ();
                C1BCM.LIZLLL();
                return;
            }
            C1BCM.LIZJ.remove("memory");
            C1BCM.LIZ.getClass();
            C1BCM.LIZJ();
        }
    };
    public static final C1BCS LJIIIIZZ = new InterfaceC1006670cIr() { // from class: X.1BCS
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(Object obj, Object obj2) {
            if (((C1514970pWh) obj2).LIZIZ) {
                C1BCM.LIZJ.add("batterySaveMode");
                C1BCM.LIZ.getClass();
                C1BCM.LIZJ();
                C1BCM.LIZLLL();
                return;
            }
            C1BCM.LIZJ.remove("batterySaveMode");
            C1BCM.LIZ.getClass();
            C1BCM.LIZJ();
        }
    };
    public static final C1BCO LJIIIZ = new InterfaceC1006670cIr() { // from class: X.1BCO
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(Object obj, Object obj2) {
            if (((C1702170uOd) obj2).LIZ == EnumC1006810cJ5.Critical) {
                C1BCM.LIZJ.add("drop3");
                C1BCM.LIZ.getClass();
                C1BCM.LIZJ();
                C1BCM.LIZLLL();
                return;
            }
            C1BCM.LIZJ.remove("drop3");
            C1BCM.LIZ.getClass();
            C1BCM.LIZJ();
        }
    };
    public static final C1BCR LJIIJ = new C1BC4() { // from class: X.1BCR
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C2189391AmP c2189391AmP, C2189391AmP c2189391AmP2) {
            if (c2189391AmP2.LIZ == EnumC1006810cJ5.Critical) {
                C1BCM.LIZJ.add("temp");
                C1BCM.LIZ.getClass();
                C1BCM.LIZJ();
                C1BCM.LIZLLL();
                return;
            }
            C1BCM.LIZJ.remove("temp");
            C1BCM.LIZ.getClass();
            C1BCM.LIZJ();
        }
    };
    public static final C1BCN LJIIJJI = new C1BC1() { // from class: X.1BCN
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512930pTP c1512930pTP, C1512930pTP c1512930pTP2) {
            C1512930pTP c1512930pTP3 = c1512930pTP2;
            if (c1512930pTP3.LIZ == EnumC1006810cJ5.Critical && !c1512930pTP3.LIZIZ) {
                C1BCM.LIZJ.add("batteryLevel");
                C1BCM.LIZ.getClass();
                C1BCM.LIZJ();
                C1BCM.LIZLLL();
                return;
            }
            C1BCM.LIZJ.remove("batteryLevel");
            C1BCM.LIZ.getClass();
            C1BCM.LIZJ();
        }
    };

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.1BCQ] */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.1BCS] */
    /* JADX WARN: Type inference failed for: r6v12, types: [X.1BCO] */
    /* JADX WARN: Type inference failed for: r6v13, types: [X.1BCR] */
    /* JADX WARN: Type inference failed for: r6v14, types: [X.1BCN] */
    /* JADX WARN: Type inference failed for: r6v9, types: [X.1BCP] */
    static {
        C2200811BBn c2200811BBn;
        C2200841BBq c2200841BBq;
        C1057270dcT c1057270dcTLIZ;
        C2200721BBe c2200721BBe;
        C1BBZ c1bbz;
        LiveHeadAnimDowngradeExperiment liveHeadAnimDowngradeExperiment = LiveHeadAnimDowngradeExperiment.INSTANCE;
        if (liveHeadAnimDowngradeExperiment.isDowngradeEnable()) {
            long downgradeFreqCtrTimeIntervalMs = liveHeadAnimDowngradeExperiment.getDowngradeFreqCtrTimeIntervalMs();
            for (String str : LIZ().keySet()) {
                switch (str.hashCode()) {
                    case -1708606089:
                        if (str.equals("batteryLevel")) {
                            LIZ.getClass();
                            LiveHeadAnimDowngradeSourceConfig liveHeadAnimDowngradeSourceConfig = (LiveHeadAnimDowngradeSourceConfig) LIZ().get("batteryLevel");
                            if (liveHeadAnimDowngradeSourceConfig == null) {
                                c2200811BBn = new C2200811BBn();
                            } else {
                                C1BCT c1bct = new C1BCT();
                                c1bct.LIZJ = liveHeadAnimDowngradeSourceConfig.mediumThreshold;
                                c1bct.LIZIZ = liveHeadAnimDowngradeSourceConfig.highThreshold;
                                c1bct.LIZ = liveHeadAnimDowngradeSourceConfig.criticalThreshold;
                                c2200811BBn = new C2200811BBn();
                                c2200811BBn.LIZ = c1bct.LIZ;
                                c2200811BBn.LIZIZ = c1bct.LIZIZ;
                                c2200811BBn.LIZJ = c1bct.LIZJ;
                            }
                            C1BCN c1bcn = LJIIJJI;
                            C2200821BBo.LIZ.getClass();
                            if (!C2200821BBo.LIZ()) {
                                C2201101BCq.LJII(C1BC9.Battery, c1bcn, false, 0L, c2200811BBn);
                            }
                        }
                        break;
                    case -1367663123:
                        if (str.equals("batterySaveMode")) {
                            C2201101BCq.LJII(C1BC9.PowerMode, LJIIIIZZ, true, 0L, null);
                        }
                        break;
                    case -1077756671:
                        if (str.equals("memory")) {
                            LIZ.getClass();
                            LiveHeadAnimDowngradeSourceConfig liveHeadAnimDowngradeSourceConfig2 = (LiveHeadAnimDowngradeSourceConfig) LIZ().get("memory");
                            if (liveHeadAnimDowngradeSourceConfig2 == null) {
                                c2200841BBq = new C2200841BBq();
                            } else {
                                C1BCW c1bcw = new C1BCW();
                                c1bcw.LIZJ = (int) liveHeadAnimDowngradeSourceConfig2.mediumThreshold;
                                c1bcw.LIZIZ = (int) liveHeadAnimDowngradeSourceConfig2.highThreshold;
                                c1bcw.LIZ = (int) liveHeadAnimDowngradeSourceConfig2.criticalThreshold;
                                c2200841BBq = new C2200841BBq();
                                c2200841BBq.LIZ = c1bcw.LIZ;
                                c2200841BBq.LIZIZ = c1bcw.LIZIZ;
                                c2200841BBq.LIZJ = c1bcw.LIZJ;
                            }
                            C1BCQ c1bcq = LJII;
                            C2200821BBo.LIZ.getClass();
                            if (!C2200821BBo.LIZ()) {
                                C2201101BCq.LJII(C1BC9.Memory, c1bcq, true, downgradeFreqCtrTimeIntervalMs, c2200841BBq);
                            }
                        }
                        break;
                    case 98728:
                        if (str.equals("cpu")) {
                            LIZ.getClass();
                            LiveHeadAnimDowngradeSourceConfig liveHeadAnimDowngradeSourceConfig3 = (LiveHeadAnimDowngradeSourceConfig) LIZ().get("cpu");
                            if (liveHeadAnimDowngradeSourceConfig3 == null) {
                                c1057270dcTLIZ = new C1057270dcT();
                            } else {
                                C1057260dcS c1057260dcS = new C1057260dcS();
                                c1057260dcS.LIZJ = liveHeadAnimDowngradeSourceConfig3.mediumThreshold;
                                c1057260dcS.LIZIZ = liveHeadAnimDowngradeSourceConfig3.highThreshold;
                                c1057260dcS.LIZ = liveHeadAnimDowngradeSourceConfig3.criticalThreshold;
                                c1057270dcTLIZ = c1057260dcS.LIZ();
                            }
                            C1BCA.LJIJ(LJI, true, downgradeFreqCtrTimeIntervalMs, c1057270dcTLIZ);
                        }
                        break;
                    case 3556308:
                        if (str.equals("temp")) {
                            LIZ.getClass();
                            LiveHeadAnimDowngradeSourceConfig liveHeadAnimDowngradeSourceConfig4 = (LiveHeadAnimDowngradeSourceConfig) LIZ().get("temp");
                            if (liveHeadAnimDowngradeSourceConfig4 == null) {
                                c2200721BBe = new C2200721BBe();
                            } else {
                                C1BCV c1bcv = new C1BCV();
                                c1bcv.LIZJ = liveHeadAnimDowngradeSourceConfig4.mediumThreshold;
                                c1bcv.LIZIZ = liveHeadAnimDowngradeSourceConfig4.highThreshold;
                                c1bcv.LIZ = liveHeadAnimDowngradeSourceConfig4.criticalThreshold;
                                c2200721BBe = new C2200721BBe();
                                c2200721BBe.LIZ = c1bcv.LIZ;
                                c2200721BBe.LIZIZ = c1bcv.LIZIZ;
                                c2200721BBe.LIZJ = c1bcv.LIZJ;
                            }
                            C1BCR c1bcr = LJIIJ;
                            C2200821BBo.LIZ.getClass();
                            if (!C2200821BBo.LIZ()) {
                                C2201101BCq.LJII(C1BC9.Temperature, c1bcr, true, downgradeFreqCtrTimeIntervalMs, c2200721BBe);
                            }
                        }
                        break;
                    case 95858468:
                        if (str.equals("drop3")) {
                            LIZ.getClass();
                            LiveHeadAnimDowngradeSourceConfig liveHeadAnimDowngradeSourceConfig5 = (LiveHeadAnimDowngradeSourceConfig) LIZ().get("drop3");
                            if (liveHeadAnimDowngradeSourceConfig5 == null) {
                                c1bbz = new C1BBZ();
                            } else {
                                C1BCU c1bcu = new C1BCU();
                                c1bcu.LIZJ = liveHeadAnimDowngradeSourceConfig5.mediumThreshold;
                                c1bcu.LIZIZ = liveHeadAnimDowngradeSourceConfig5.highThreshold;
                                c1bcu.LIZ = liveHeadAnimDowngradeSourceConfig5.criticalThreshold;
                                c1bbz = new C1BBZ();
                                c1bbz.LIZ = c1bcu.LIZ;
                                c1bbz.LIZIZ = c1bcu.LIZIZ;
                                c1bbz.LIZJ = c1bcu.LIZJ;
                            }
                            C1BCO c1bco = LJIIIZ;
                            C2200821BBo.LIZ.getClass();
                            if (!C2200821BBo.LIZ()) {
                                C2201101BCq.LJII(C1BC9.Fluency, c1bco, true, downgradeFreqCtrTimeIntervalMs, c1bbz);
                            }
                        }
                        break;
                }
            }
        }
    }

    public static Map LIZ() {
        return (Map) LJ.getValue();
    }

    public static void LIZIZ() {
        Iterator it2 = ((ArrayList) LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1607520rvy) it2.next()).LIZ(LIZLLL);
        }
    }

    public static void LIZJ() {
        if (LIZJ.size() > 0) {
            if (LIZLLL) {
                return;
            }
            LIZLLL = true;
            LIZIZ();
            return;
        }
        if (LIZLLL) {
            LIZLLL = false;
            LIZIZ();
        }
    }

    public static void LIZLLL() {
        if (LiveHeadAnimDowngradeLoggerSamplingExp.INSTANCE.isLoggerEnable()) {
            Iterator<String> it2 = LIZJ.iterator();
            int iIntValue = 0;
            while (it2.hasNext()) {
                Integer num = (Integer) ((LinkedHashMap) LIZIZ).get(it2.next());
                if (num != null) {
                    iIntValue |= num.intValue();
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(iIntValue, "downgrade_hit_type");
            C20684815ws.LJIILLIIL("livesdk_live_head_anim_entrance_downgrade", c2344009Gk.LIZ);
        }
    }
}
