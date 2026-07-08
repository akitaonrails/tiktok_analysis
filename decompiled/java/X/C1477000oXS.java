package X;

import Y.AComparatorS42S0000000_23;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0oXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477000oXS implements InterfaceC1477040oXW {
    public static int LIZ = -1;
    public static final ConcurrentHashMap<String, Float> LIZIZ = new ConcurrentHashMap<>(50);
    public static final ConcurrentLinkedQueue<String> LIZJ = new ConcurrentLinkedQueue<>();

    public static final C1476830oXB LIZLLL(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        C1477120oXe c1477120oXeLIZIZ;
        C1470240oMY tag;
        C1476830oXB c1476830oXB = new C1476830oXB();
        if (interfaceC1476900oXI == null) {
            return c1476830oXB;
        }
        C582130MsN.LIZ().LJ();
        int iLJIIIIZZ = (int) C1476910oXJ.LIZJ().LJIIIIZZ();
        if (C582130MsN.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            if (iLJIIIIZZ <= 0.0d) {
                iLJIIIIZZ = LIZ;
                if (iLJIIIIZZ <= 0) {
                    iLJIIIIZZ = C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed();
                }
                C582130MsN.LIZ().LJ();
                C1476910oXJ.LIZJ().LIZLLL(iLJIIIIZZ);
            } else {
                LIZ = iLJIIIIZZ;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!C1474810oTv.LJJJJI() && !C1474810oTv.LJZL()) {
            List<Pair<EnumC2281141EQm, Integer>> listLJ = interfaceC1476900oXI.LJ();
            if (listLJ != null) {
                for (Pair<EnumC2281141EQm, Integer> pair : listLJ) {
                    SimBitRate simBitRate = new SimBitRate();
                    simBitRate.setBitRate(((Integer) pair.second).intValue());
                    arrayList.add(simBitRate);
                    arrayList2.add(pair.first);
                    Objects.toString(pair.second);
                    Objects.toString(pair.first);
                }
            }
        } else {
            List<Pair<EnumC2281141EQm, SimBitRate>> listLIZIZ = interfaceC1476900oXI.LIZIZ();
            if (listLIZIZ != null) {
                for (Pair<EnumC2281141EQm, SimBitRate> pair2 : listLIZIZ) {
                    arrayList.add(pair2.second);
                    arrayList2.add(pair2.first);
                }
            }
        }
        if (arrayList.size() == 0) {
            return c1476830oXB;
        }
        if (arrayList.size() == 1) {
            c1477120oXeLIZIZ = new C1477120oXe();
            c1477120oXeLIZIZ.LL = (InterfaceC1477220oXo) ListProtector.get(arrayList, 0);
        } else {
            RateSettingsResponse rateSettingsResponseLIZ = C1475030oUH.LIZ.LIZ();
            if (rateSettingsResponseLIZ == null) {
                return c1476830oXB;
            }
            C1477360oY2 c1477360oY2 = new C1477360oY2(rateSettingsResponseLIZ.getAutoBitrateSet(), rateSettingsResponseLIZ.getAdaptiveGearGroup());
            C1477030oXV c1477030oXV = new C1477030oXV();
            c1477030oXV.LIZ(iLJIIIIZZ);
            c1477120oXeLIZIZ = c1477360oY2.LIZIZ(arrayList, c1477030oXV.LIZ);
        }
        int iIndexOf = arrayList.indexOf(c1477120oXeLIZIZ.LL);
        if (iIndexOf >= 0 && iIndexOf < arrayList2.size()) {
            if (C1474810oTv.LJZL()) {
                if (interfaceC1476900oXI.getTag() == null) {
                    tag = null;
                } else {
                    tag = interfaceC1476900oXI.getTag();
                }
                C1474520oTS c1474520oTSLJJIJLIJ = TTVideoEngine.LJJIJLIJ(tag, 0);
                if (c1474520oTSLJJIJLIJ == null) {
                    c1476830oXB.LIZJ = (EnumC2281141EQm) ListProtector.get(arrayList2, iIndexOf);
                    c1476830oXB.LIZLLL = ((SimBitRate) ListProtector.get(arrayList, iIndexOf)).getQuality();
                } else {
                    c1476830oXB.LIZJ = C2281221EQu.LIZ(c1474520oTSLJJIJLIJ.getResolution());
                    c1476830oXB.LIZLLL = c1474520oTSLJJIJLIJ.LIZ(18);
                }
            } else {
                c1476830oXB.LIZJ = interfaceC1476900oXI.LIZLLL((EnumC2281141EQm) ListProtector.get(arrayList2, iIndexOf));
            }
            int iIndexOf2 = arrayList2.indexOf(c1476830oXB.LIZJ);
            Session sessionLJIIIZ = C1477400oY6.LJJJJI.LJIIIZ(str);
            if (sessionLJIIIZ != null && iIndexOf2 >= 0 && iIndexOf2 < arrayList.size() && ListProtector.get(arrayList, iIndexOf2) != null) {
                sessionLJIIIZ.bitrate = ((SimBitRate) ListProtector.get(arrayList, iIndexOf2)).getBitRate();
            }
        }
        return c1476830oXB;
    }

    public final C1476830oXB LIZIZ(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z) {
        String videoId;
        long duration;
        int iLIZLLL;
        boolean z2;
        InterfaceC1477050oXX superResolutionStrategy = C582130MsN.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy();
        new C1476830oXB();
        if (simVideoUrlModel != null) {
            videoId = simVideoUrlModel.getSourceId();
            duration = (long) simVideoUrlModel.getDuration();
        } else if (interfaceC1476900oXI != null) {
            videoId = interfaceC1476900oXI.getVideoId();
            duration = interfaceC1476900oXI.getDuration();
        } else {
            return null;
        }
        C1476830oXB c1476830oXBLIZLLL = LIZLLL(videoId, interfaceC1476900oXI);
        boolean z3 = true;
        if (z && superResolutionStrategy != null) {
            iLIZLLL = superResolutionStrategy.LIZLLL(1.0f, 0, 0, 0, duration, null, simVideoUrlModel, videoId, "", true);
        } else {
            iLIZLLL = 1;
        }
        Session sessionLJIIIZ = C1477400oY6.LJJJJI.LJIIIZ(videoId);
        if (sessionLJIIIZ != null) {
            sessionLJIIIZ.bizSRStrategyStatus = iLIZLLL;
            if (iLIZLLL == 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            sessionLJIIIZ.isOpenSuperResolution = z2;
        }
        if (iLIZLLL != 100) {
            z3 = false;
        }
        c1476830oXBLIZLLL.LJFF = z3;
        return c1476830oXBLIZLLL;
    }

    public final C1476840oXC LIZJ(SimVideoUrlModel simVideoUrlModel, boolean z, int i, boolean z2) {
        List<SimBitRate> dashBitRate;
        String strLIZIZ;
        String str;
        SimBitRate simBitRate = null;
        if (simVideoUrlModel == null) {
            return null;
        }
        if (!z2) {
            if (C582130MsN.LIZ().getConfig().getCommonConfig().onPreGetProperBitrate(simVideoUrlModel)) {
                return null;
            }
            dashBitRate = simVideoUrlModel.getBitRate();
        } else {
            dashBitRate = simVideoUrlModel.getDashBitRate();
        }
        if (dashBitRate == null) {
            return null;
        }
        if (!dashBitRate.isEmpty()) {
            if (C1474810oTv.LLJLLIL()) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < dashBitRate.size(); i2++) {
                    if (C0NFA.LIZ(((SimBitRate) ListProtector.get(dashBitRate, i2)).getQualityType(), ((SimBitRate) ListProtector.get(dashBitRate, i2)).getGearName()) <= C1474810oTv.LJIIIZ()) {
                        arrayList.add(ListProtector.get(dashBitRate, i2));
                    }
                }
                if (arrayList.size() != 0) {
                    dashBitRate = arrayList;
                }
            }
            int iIntValue = ((Number) C1474810oTv.LJIILIIL.getValue()).intValue();
            if (iIntValue > 0) {
                Iterator<SimBitRate> it2 = dashBitRate.iterator();
                while (it2.hasNext()) {
                    SimBitRate next = it2.next();
                    if (next.isBytevc1() == 2 && C0NFA.LIZ(next.getQualityType(), next.getGearName()) > iIntValue) {
                        it2.remove();
                    }
                }
            }
        }
        C1477400oY6.LJJJJI.LJJ(simVideoUrlModel.getSourceId(), dashBitRate);
        if (dashBitRate.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(dashBitRate);
        Collections.sort(arrayList2, new AComparatorS42S0000000_23(5));
        C1476840oXC c1476840oXCLIZ = LIZ(simVideoUrlModel, arrayList2, null, i, z2);
        if (c1476840oXCLIZ != null) {
            if (c1476840oXCLIZ.LL != null) {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    SimBitRate simBitRate2 = (SimBitRate) it3.next();
                    if (simBitRate2.getBitRate() == c1476840oXCLIZ.LL.getBitRate()) {
                        simBitRate = simBitRate2;
                        break;
                    }
                }
            }
            InterfaceC1477220oXo interfaceC1477220oXo = c1476840oXCLIZ.LL;
            if (interfaceC1477220oXo != null) {
                if (!TextUtils.isEmpty(interfaceC1477220oXo.getUrlKey())) {
                    ConcurrentLinkedQueue<String> concurrentLinkedQueue = LIZJ;
                    if (concurrentLinkedQueue.size() > 50) {
                        String strPoll = concurrentLinkedQueue.poll();
                        if (!TextUtils.isEmpty(strPoll)) {
                            LIZIZ.remove(strPoll);
                        }
                    }
                    concurrentLinkedQueue.add(c1476840oXCLIZ.LL.getUrlKey());
                    LIZIZ.put(c1476840oXCLIZ.LL.getUrlKey(), Float.valueOf(c1476840oXCLIZ.LLJILJIL));
                }
                if (z2) {
                    simVideoUrlModel.setHitDashVideoBitrate(simBitRate);
                } else {
                    simVideoUrlModel.setHitBitrate(c1476840oXCLIZ);
                }
            }
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        Session sessionLJI = c1477400oY6.LJI(simVideoUrlModel.getUri());
        if (c1476840oXCLIZ != null) {
            if (sessionLJI != null) {
                sessionLJI.sourceId = simVideoUrlModel.getSourceId();
                sessionLJI.speed = c1476840oXCLIZ.LLJILJIL;
                InterfaceC1477220oXo interfaceC1477220oXo2 = c1476840oXCLIZ.LL;
                if (interfaceC1477220oXo2 != null) {
                    sessionLJI.bitrate = interfaceC1477220oXo2.getBitRate();
                    sessionLJI.calcBitrate = c1476840oXCLIZ.LLILZLL;
                    sessionLJI.timeCostForSelectSDK = c1476840oXCLIZ.LLJILJILJ;
                    sessionLJI.selectDiffStrForSDK = c1476840oXCLIZ.LLJILLL;
                    sessionLJI.selectGearName = c1476840oXCLIZ.LL.getGearName();
                    sessionLJI.selectFlow = c1476840oXCLIZ.LLIZ.toString();
                }
            }
        } else if (sessionLJI != null) {
            sessionLJI.bizSRStrategyStatus = 5;
        }
        if (simVideoUrlModel.getSourceId() != null && c1476840oXCLIZ != null) {
            if (z2) {
                c1477400oY6.LJJIZ(simVideoUrlModel.getSourceId(), simBitRate);
                c1477400oY6.LJJJJJ(simVideoUrlModel.getSourceId(), c1476840oXCLIZ);
            } else {
                c1477400oY6.LJJIJLIJ(simVideoUrlModel.getSourceId(), c1476840oXCLIZ);
                c1477400oY6.LJJJJJ(simVideoUrlModel.getSourceId(), c1476840oXCLIZ);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("final select:");
        if (c1476840oXCLIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bitRate=");
            sbLIZ2.append(c1476840oXCLIZ.getBitRate());
            sbLIZ2.append(", gearName=");
            sbLIZ2.append(c1476840oXCLIZ.getGearName());
            sbLIZ2.append(", qualityType=");
            sbLIZ2.append(c1476840oXCLIZ.getQualityType());
            sbLIZ2.append(", isBytevc1=");
            sbLIZ2.append(c1476840oXCLIZ.isBytevc1());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "N/A";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", change reason:");
        if (c1476840oXCLIZ == null) {
            str = "";
        } else {
            str = c1476840oXCLIZ.LLJIJIL;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1476840oXCLIZ != null) {
            c1476840oXCLIZ.LLJJI = 1;
        }
        return c1476840oXCLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209  */
    @Override // X.InterfaceC1477040oXW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1476840oXC LIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r25, java.util.List<com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate> r26, com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet r27, int r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477000oXS.LIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, java.util.List, com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet, int, boolean):X.0oXC");
    }
}
