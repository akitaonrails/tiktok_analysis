package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.0oXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477130oXf implements InterfaceC1475250oUd {
    public final List<InterfaceC1477240oXq> LIZ = new ArrayList();
    public final List<InterfaceC1477240oXq> LIZIZ;

    public C1477130oXf(List list) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        list = ((ArrayList) list).isEmpty() ? Collections.singletonList(InterfaceC1477240oXq.LIZ) : list;
        if (list != null) {
            if (!((Boolean) C1474810oTv.LJJLIIIJJI.getValue()).booleanValue() && !C1474810oTv.LLILZIL()) {
                arrayList.addAll(list);
                return;
            }
            for (InterfaceC1477240oXq interfaceC1477240oXq : list) {
                if (((Boolean) C1474810oTv.LJJLIIIJJI.getValue()).booleanValue() && interfaceC1477240oXq.LIZIZ()) {
                    ((ArrayList) this.LIZ).add(interfaceC1477240oXq);
                } else if (C1474810oTv.LLILZIL() && Objects.equals(interfaceC1477240oXq.getName(), "PersonalVideoQualityOptUrlHook") && interfaceC1477240oXq.LIZIZ()) {
                    ((ArrayList) this.LIZ).add(interfaceC1477240oXq);
                } else {
                    ((ArrayList) this.LIZIZ).add(interfaceC1477240oXq);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a3, code lost:
    
        if (r8 != null) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025f  */
    @Override // X.InterfaceC1475250oUd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1477160oXi LIZLLL(X.C1475330oUl r14) {
        /*
            Method dump skipped, instruction units count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477130oXf.LIZLLL(X.0oUl):X.0oXi");
    }

    @Override // X.InterfaceC1475250oUd
    public final C1476830oXB LJFF(C1475330oUl c1475330oUl) {
        boolean z;
        boolean zIsDynamicBitrateEnable;
        SimVideoUrlModel simVideoUrlModel = c1475330oUl.LIZ;
        if (simVideoUrlModel == null) {
            return null;
        }
        boolean z2 = c1475330oUl.LIZIZ;
        boolean z3 = c1475330oUl.LIZJ;
        if (simVideoUrlModel.getSimAudios() != null && !simVideoUrlModel.getSimAudios().isEmpty() && ((Boolean) C1474810oTv.K.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC1477260oXs interfaceC1477260oXsLIZIZ = C582130MsN.LIZ().LJ().LIZIZ();
        C1476830oXB c1476830oXB = new C1476830oXB();
        if (!C1474810oTv.LJJJ()) {
            if (C1480850odf.LIZJ.isDynamicBitrateEnable() || z) {
                c1476830oXB = interfaceC1477260oXsLIZIZ.getProperBitrateForDash(simVideoUrlModel, c1475330oUl.LIZLLL, z3, c1475330oUl.LJ);
            }
        } else {
            String urlKey = simVideoUrlModel.getUrlKey();
            String fileCheckSum = simVideoUrlModel.getFileCheckSum();
            if (((Boolean) C1474810oTv.r2.getValue()).booleanValue()) {
                zIsDynamicBitrateEnable = C1480850odf.LIZJ.isDynamicConfigAvailable();
            } else {
                zIsDynamicBitrateEnable = C1480850odf.LIZJ.isDynamicBitrateEnable();
            }
            if ((zIsDynamicBitrateEnable || z) && !z2) {
                c1476830oXB = interfaceC1477260oXsLIZIZ.getProperBitrateForDash(simVideoUrlModel, c1475330oUl.LIZLLL, z3, c1475330oUl.LJ);
            } else {
                Session sessionLJI = C1477400oY6.LJJJJI.LJI(simVideoUrlModel.getUri());
                if (sessionLJI != null) {
                    sessionLJI.bizSRStrategyStatus = 5;
                }
            }
            C1477400oY6.LJJJJI.LJJIII(urlKey, fileCheckSum);
        }
        if (c1476830oXB != null && C1474810oTv.LJJLIIIIJ()) {
            SimBitRate simBitRate = c1476830oXB.LIZ;
            if (simBitRate != null) {
                simVideoUrlModel.setHitDashVideoBitrate(simBitRate);
                C1477400oY6.LJJJJI.LJJIZ(simVideoUrlModel.getSourceId(), c1476830oXB.LIZ);
            }
            SimAudioBitrate simAudioBitrate = c1476830oXB.LIZIZ;
            if (simAudioBitrate != null) {
                simVideoUrlModel.setHitDashAudioBitrate(simAudioBitrate);
                C1477400oY6.LJJJJI.LJJIL(simVideoUrlModel.getSourceId(), c1476830oXB.LIZIZ);
            }
        }
        C1477400oY6.LJJJJI.LJJIJIIJI(simVideoUrlModel.getSourceId(), c1476830oXB.LJIIIIZZ);
        return c1476830oXB;
    }

    public static C1478290oZX LJII(InterfaceC1477220oXo interfaceC1477220oXo, SimVideoUrlModel simVideoUrlModel) {
        C1472900oQq simVideoExtra;
        List<SimBitRate> bitRate;
        int bitRate2 = interfaceC1477220oXo.getBitRate();
        String gearName = interfaceC1477220oXo.getGearName();
        int qualityType = interfaceC1477220oXo.getQualityType();
        int iIsBytevc1 = interfaceC1477220oXo.isBytevc1();
        String urlKey = interfaceC1477220oXo.getUrlKey();
        List<String> listUrlList = interfaceC1477220oXo.urlList();
        String checksum = interfaceC1477220oXo.getChecksum();
        int size = interfaceC1477220oXo.getSize();
        if (interfaceC1477220oXo instanceof SimBitRate) {
            simVideoExtra = ((SimBitRate) interfaceC1477220oXo).getSimVideoExtra();
        } else {
            simVideoExtra = null;
            if (simVideoUrlModel != null && (bitRate = simVideoUrlModel.getBitRate()) != null && bitRate.size() != 0) {
                Iterator<SimBitRate> it2 = bitRate.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SimBitRate next = it2.next();
                    if (next.getBitRate() == interfaceC1477220oXo.getBitRate()) {
                        simVideoExtra = next.getSimVideoExtra();
                        break;
                    }
                }
            }
        }
        return new C1478290oZX(bitRate2, gearName, qualityType, iIsBytevc1, urlKey, listUrlList, checksum, size, simVideoExtra, interfaceC1477220oXo.getHdrType(), interfaceC1477220oXo.getHdrBit(), interfaceC1477220oXo.getVideoWidth(), interfaceC1477220oXo.getVideoHeight());
    }

    @Override // X.InterfaceC1475250oUd
    public final C1477230oXp LJ(SimVideoUrlModel simVideoUrlModel, EnumC1479760obu enumC1479760obu) {
        return LIZ(simVideoUrlModel, false, C1474810oTv.LLIIL(), false, 1);
    }

    public static boolean LJI(long j, long j2, String str) {
        if (str != null && C582130MsN.LIZ() != null && C582130MsN.LIZ().getConfig() != null) {
            ICommonConfig commonConfig = C582130MsN.LIZ().getConfig().getCommonConfig();
            IPlayerExperiment simPlayerExperiment = C582130MsN.LIZ().getConfig().getSimPlayerExperiment();
            if (commonConfig != null && simPlayerExperiment != null) {
                long defaultCDNTimeoutTime = commonConfig.getDefaultCDNTimeoutTime();
                long jCdnUrlExpiredOffset = simPlayerExperiment.cdnUrlExpiredOffset();
                boolean zEnableCdnUrlExpiredExperiment = simPlayerExperiment.enableCdnUrlExpiredExperiment();
                if ((!str.contains("aweme/v1/play") && !str.contains("aweme/v2/play")) || commonConfig.getCommonParamsProcessor() == null) {
                    if (j2 > 0 && zEnableCdnUrlExpiredExperiment) {
                        if (System.currentTimeMillis() / 1000 < j2 + jCdnUrlExpiredOffset) {
                            return false;
                        }
                        return true;
                    }
                    if (SystemClock.elapsedRealtime() - j < defaultCDNTimeoutTime) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static List LJIIIZ(long j, long j2, String[] strArr) {
        long defaultCDNTimeoutTime = C582130MsN.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime();
        boolean zEnableCdnUrlExpiredExperiment = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        long jCdnUrlExpiredOffset = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().cdnUrlExpiredOffset();
        if (C1480850odf.LIZJ.forceHttps()) {
            for (int i = 0; i < strArr.length; i++) {
                String strReplaceFirst = strArr[i];
                if (strReplaceFirst != null && strReplaceFirst.startsWith("http") && !strReplaceFirst.startsWith("https")) {
                    strReplaceFirst = strReplaceFirst.replaceFirst("http", "https");
                }
                strArr[i] = strReplaceFirst;
            }
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (str != null) {
                if ((str.contains("aweme/v1/play") || strArr[i2].contains("aweme/v2/play")) && interfaceC1484530ojbLIZ.getConfig().getCommonConfig().getCommonParamsProcessor() != null) {
                    if (!((Boolean) C1474810oTv.Y0.getValue()).booleanValue() && !((Boolean) C1474810oTv.Z0.getValue()).booleanValue()) {
                        arrayList.add(strArr[i2]);
                    } else {
                        interfaceC1484530ojbLIZ.getConfig().getCommonConfig().getCommonParamsProcessor();
                        arrayList.add(C0XA0.LIZ(strArr[i2]));
                    }
                } else if (j2 > 0 && zEnableCdnUrlExpiredExperiment) {
                    if (System.currentTimeMillis() / 1000 < j2 + jCdnUrlExpiredOffset) {
                        arrayList.add(strArr[i2]);
                    }
                } else if (SystemClock.elapsedRealtime() - j < defaultCDNTimeoutTime) {
                    arrayList.add(strArr[i2]);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1475250oUd
    public final List LIZIZ(long j, long j2, String[] strArr) {
        return LJIIIZ(j, j2, strArr);
    }

    @Override // X.InterfaceC1475250oUd
    public final C1477160oXi LIZJ(SimVideoUrlModel simVideoUrlModel, EnumC1479760obu enumC1479760obu, boolean z) {
        return LJIIIIZZ(simVideoUrlModel, enumC1479760obu, z, C1474810oTv.LLIIL());
    }

    public final C1477160oXi LJIIIIZZ(SimVideoUrlModel simVideoUrlModel, EnumC1479760obu enumC1479760obu, boolean z, boolean z2) {
        C1475330oUl c1475330oUl = new C1475330oUl();
        c1475330oUl.LIZ = simVideoUrlModel;
        c1475330oUl.LIZIZ = z;
        c1475330oUl.LIZJ = z2;
        return LIZLLL(c1475330oUl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        X.C1477400oY6.LJJJJI.LJJIJL(r13.getSourceId(), r2);
     */
    @Override // X.InterfaceC1475250oUd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1477230oXp LIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r13, boolean r14, boolean r15, boolean r16, int r17) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477130oXf.LIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, boolean, boolean, boolean, int):X.0oXp");
    }
}
