package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oXT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477010oXT implements InterfaceC1477040oXW {
    public static final ConcurrentHashMap<String, Float> LIZIZ = new ConcurrentHashMap<>(50);
    public static final ConcurrentLinkedQueue<String> LIZJ = new ConcurrentLinkedQueue<>();
    public final C1476850oXD LIZ = new C1476850oXD();

    public final C1476830oXB LIZLLL(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        C1477120oXe c1477120oXeLIZIZ;
        C1476830oXB c1476830oXB = new C1476830oXB();
        if (interfaceC1476900oXI == null) {
            return c1476830oXB;
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
            c1477120oXeLIZIZ = this.LIZ.LIZIZ(arrayList, null);
        }
        int iIndexOf = arrayList.indexOf(c1477120oXeLIZIZ.LL);
        if (iIndexOf >= 0 && iIndexOf < arrayList2.size()) {
            EnumC2281141EQm enumC2281141EQmLIZLLL = interfaceC1476900oXI.LIZLLL((EnumC2281141EQm) ListProtector.get(arrayList2, iIndexOf));
            c1476830oXB.LIZJ = enumC2281141EQmLIZLLL;
            int iIndexOf2 = arrayList2.indexOf(enumC2281141EQmLIZLLL);
            Session sessionLJIIIZ = C1477400oY6.LJJJJI.LJIIIZ(str);
            if (sessionLJIIIZ != null && iIndexOf2 >= 0 && iIndexOf2 < arrayList.size() && ListProtector.get(arrayList, iIndexOf2) != null) {
                sessionLJIIIZ.bitrate = ((SimBitRate) ListProtector.get(arrayList, iIndexOf2)).getBitRate();
            }
        }
        return c1476830oXB;
    }

    public final C1476830oXB LIZIZ(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z) {
        String videoId;
        new C1476830oXB();
        if (simVideoUrlModel != null) {
            videoId = simVideoUrlModel.getSourceId();
        } else if (interfaceC1476900oXI != null) {
            videoId = interfaceC1476900oXI.getVideoId();
        } else {
            return null;
        }
        C1476830oXB c1476830oXBLIZLLL = LIZLLL(videoId, interfaceC1476900oXI);
        Session sessionLJIIIZ = C1477400oY6.LJJJJI.LJIIIZ(videoId);
        if (sessionLJIIIZ != null) {
            sessionLJIIIZ.bizSRStrategyStatus = 1;
            sessionLJIIIZ.isOpenSuperResolution = false;
        }
        c1476830oXBLIZLLL.LJFF = false;
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
        int i2 = 0;
        while (i2 < dashBitRate.size()) {
            if (ListProtector.get(dashBitRate, i2) == null) {
                ListProtector.remove(dashBitRate, i2);
            } else {
                i2++;
            }
        }
        C1477400oY6.LJJJJI.LJJ(simVideoUrlModel.getSourceId(), dashBitRate);
        if (dashBitRate.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(dashBitRate);
        C1476840oXC c1476840oXCLIZ = LIZ(simVideoUrlModel, arrayList, null, i, z2);
        if (c1476840oXCLIZ != null) {
            if (c1476840oXCLIZ.LL != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SimBitRate simBitRate2 = (SimBitRate) it2.next();
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

    @Override // X.InterfaceC1477040oXW
    public final C1476840oXC LIZ(SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, AutoBitrateSet autoBitrateSet, int i, boolean z) {
        if (simVideoUrlModel == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C1477120oXe c1477120oXeLIZIZ = this.LIZ.LIZIZ(list, null);
        C1477400oY6.LJJJJI.LJJJ(simVideoUrlModel.getSourceId(), c1477120oXeLIZIZ.LLIZLLLIL);
        C1476840oXC c1476840oXCLIZ = C1476840oXC.LIZ(c1477120oXeLIZIZ);
        StringBuilder sb2 = c1477120oXeLIZIZ.LLIZ;
        if (sb2 != null) {
            sb.append((CharSequence) sb2);
        }
        sb.append(e3.f);
        c1476840oXCLIZ.LLJIJIL = sb.toString();
        return c1476840oXCLIZ;
    }
}
