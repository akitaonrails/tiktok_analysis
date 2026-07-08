package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ob9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479290ob9 {
    public static boolean LIZ = true;
    public static final LruCache<SimVideoUrlModel, C1477160oXi> LIZIZ = new LruCache<>(20);

    public static IPlayerExperiment LIZ() {
        return C607330Nrv.LIZ.LIZIZ();
    }

    public static C1479510obV LIZIZ() {
        C1479510obV c1479510obV = new C1479510obV();
        c1479510obV.LJIJ = LIZ().get265DecodeType();
        c1479510obV.LJJIII = LIZ().frameWait();
        c1479510obV.LJIJI = LJ();
        c1479510obV.LJJJJZI = LIZ().PlayeAbFixPrepareSeqTmpEnableExp() == 1;
        c1479510obV.LJJLJ = Float.valueOf(LIZ().getVolLoudUnity());
        c1479510obV.LJLJLLL = LIZ().enableBufferTimeControl();
        c1479510obV.LLIFFJFJJ = LIZ().resumeFileIoBlockDurationThreshold();
        c1479510obV.LLII = LIZ().memCacheVideoDurationThreshold();
        c1479510obV.LJJJJ = LIZ().PlayeAbVIDDashHijackRetryEnableExp() == 1;
        c1479510obV.LLJJLIIIJLLLLLLLZ = LIZ().isDirectUrlCheckInfoEnable();
        return c1479510obV;
    }

    public static int LJ() {
        return (C607330Nrv.LIZ.LIZ().isPluginApplied() || C1475000oUE.LIZ().isEnabled()) ? 1 : 0;
    }

    public static float LJFF(SimVideo simVideo) {
        if (simVideo != null && !TextUtils.isEmpty(simVideo.getMeta()) && !TextUtils.isEmpty("vq_score")) {
            try {
                String strOptString = C1473210oRL.from(simVideo.getMeta()).getJson().optString("vq_score", "-1");
                if (!TextUtils.isEmpty(strOptString)) {
                    return CastFloatProtector.parseFloat(strOptString);
                }
                return -1.0f;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -1.0f;
            }
        }
        return -1.0f;
    }

    public static int LJI(SimVideo simVideo) {
        if (simVideo != null && !TextUtils.isEmpty(simVideo.getMeta()) && !TextUtils.isEmpty("exp_sf")) {
            try {
                String strOptString = C1473210oRL.from(simVideo.getMeta()).getJson().optString("exp_sf", "-1");
                if (!TextUtils.isEmpty(strOptString)) {
                    return CastIntegerProtector.parseInt(strOptString);
                }
                return -1;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        return -1;
    }

    public static SimVideoUrlModel LJII(SimVideo simVideo) {
        boolean z;
        boolean zLIZIZ;
        if (simVideo != null && simVideo.isColdBoot()) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((Boolean) C1474810oTv.LLJJJIL.getValue()).booleanValue()) {
            if (((Boolean) C1474810oTv.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue()) {
                if (!simVideo.hasDashBitrate()) {
                    simVideo.setBitRate(null);
                    simVideo.getH264PlayAddr().setBitRate(null);
                }
                simVideo.getH264PlayAddr().setSourceId(simVideo.getPlayAddr().getSourceId());
                SimVideoUrlModel h264PlayAddr = simVideo.getH264PlayAddr();
                LJIIL(simVideo, h264PlayAddr);
                if (h264PlayAddr != null) {
                    return h264PlayAddr;
                }
            } else {
                SimVideoUrlModel simVideoUrlModelLIZ = C1477760oYg.LIZ(simVideo, EnumC1479760obu.TT);
                if (simVideoUrlModelLIZ != null) {
                    LJIIL(simVideo, simVideoUrlModelLIZ);
                    return simVideoUrlModelLIZ;
                }
            }
        }
        if (!((Boolean) C1474810oTv.LLLLLLLLL.getValue()).booleanValue()) {
            zLIZIZ = C1477760oYg.LIZIZ();
        } else {
            Boolean bool = C1477760oYg.LIZIZ;
            if (bool != null) {
                zLIZIZ = bool.booleanValue();
            } else {
                zLIZIZ = C1477760oYg.LIZIZ();
                C1477760oYg.LIZIZ = Boolean.valueOf(zLIZIZ);
            }
        }
        if (zLIZIZ && simVideo != null && simVideo.getH264PlayAddr() != null && simVideo.getPlayAddr() != null) {
            if (!simVideo.hasDashBitrate()) {
                simVideo.setBitRate(null);
                simVideo.getH264PlayAddr().setBitRate(null);
            }
            simVideo.getH264PlayAddr().setSourceId(simVideo.getPlayAddr().getSourceId());
            SimVideoUrlModel h264PlayAddr2 = simVideo.getH264PlayAddr();
            LJIIL(simVideo, h264PlayAddr2);
            return h264PlayAddr2;
        }
        if (LIZ().Bytevc1PlayAddrPolicyUnifyExperiment()) {
            SimVideoUrlModel simVideoUrlModelLIZ2 = C1477760oYg.LIZ(simVideo, EnumC1479760obu.TT);
            if (simVideoUrlModelLIZ2 != null) {
                LJIIL(simVideo, simVideoUrlModelLIZ2);
                return simVideoUrlModelLIZ2;
            }
        } else if (simVideo != null) {
            if (C1475150oUT.LIZIZ(simVideo.getPlayAddrBytevc1())) {
                SimVideoUrlModel playAddrBytevc1 = simVideo.getPlayAddrBytevc1();
                LJIIL(simVideo, playAddrBytevc1);
                return playAddrBytevc1;
            }
            SimVideoUrlModel playAddrH264 = simVideo.getPlayAddrH264();
            LJIIL(simVideo, playAddrH264);
            return playAddrH264;
        }
        return null;
    }

    public static float LJIIIIZZ(SimVideo simVideo, String str) {
        if (simVideo != null && !TextUtils.isEmpty(simVideo.getMeta()) && !TextUtils.isEmpty(str)) {
            try {
                String strOptString = C1473210oRL.from(simVideo.getMeta()).getJson().optString(str, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    return CastFloatProtector.parseFloat(strOptString);
                }
                return Float.MIN_VALUE;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return Float.MIN_VALUE;
            }
        }
        return Float.MIN_VALUE;
    }

    public static void LJIIIZ(C1479510obV c1479510obV, List<C1476750oX3> list) {
        if (list != null && !list.isEmpty()) {
            if (c1479510obV.LJ == null) {
                c1479510obV.LJ = new ArrayList();
            }
            for (final C1476750oX3 c1476750oX3 : list) {
                if (c1476750oX3 != null) {
                    c1479510obV.LJ.add(new InterfaceC1479880oc6() { // from class: X.0oYi
                        @Override // X.InterfaceC1479880oc6
                        public final /* synthetic */ Object LIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479880oc6
                        public final Object get() {
                            C1476750oX3 c1476750oX32 = c1476750oX3;
                            C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
                            return c1478040oZ8.LIZ().isPlayerPreferchTtsAudio() ? c1478040oZ8.LIZ().createAudioUrlProcessor().LIZIZ(c1476750oX32) : c1478040oZ8.LIZ().createAudioUrlProcessor().LIZ(c1476750oX32);
                        }
                    });
                }
            }
        }
    }

    public static void LJIIJ(C1479510obV c1479510obV, C1479380obI c1479380obI) {
        if (c1479510obV.LJJI && C1474810oTv.LLJJLIIIJLLLLLLLZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSubList: skip prerendering subtitle, aid=");
            sbLIZ.append(c1479510obV.LJIIIZ);
            C1481110oe5.LIZIZ("SimPlayerHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (c1479510obV.LJFF == null) {
            c1479510obV.LJFF = new ArrayList();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setSubList: subtitle initSubId=");
        sbLIZ2.append(c1479510obV.LJLLL);
        sbLIZ2.append(", oriLangId=");
        sbLIZ2.append(c1479380obI.getOriginalLanguageInfo().languageId);
        sbLIZ2.append(", oriLang=");
        sbLIZ2.append(c1479380obI.getOriginalLanguageInfo().language);
        sbLIZ2.append(", subId.size=");
        sbLIZ2.append(c1479380obI.getCaptionInfos().size());
        sbLIZ2.append(", subtitlesEnable=");
        sbLIZ2.append(c1479510obV.LJLLILLLL);
        sbLIZ2.append(", aid=");
        sbLIZ2.append(c1479510obV.LJIIIZ);
        C1481110oe5.LIZIZ("SimPlayerHelper", C2188811AlT.LIZIZ(sbLIZ2));
        for (final C1477890oYt c1477890oYt : c1479380obI.getCaptionInfos()) {
            if (c1477890oYt != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setSubList: subtitle ");
                sbLIZ3.append(c1477890oYt.id);
                sbLIZ3.append(", subId=");
                sbLIZ3.append(c1477890oYt.subId);
                sbLIZ3.append(", langId=");
                sbLIZ3.append(c1477890oYt.languageId);
                sbLIZ3.append(", lang=");
                sbLIZ3.append(c1477890oYt.lang);
                sbLIZ3.append(", realtime=");
                sbLIZ3.append(c1477890oYt.isRealtimeTranslated());
                C1481110oe5.LIZIZ("SimPlayerHelper", C2188811AlT.LIZIZ(sbLIZ3));
                List<InterfaceC1479880oc6<C1477880oYs>> list = c1479510obV.LJFF;
                final String str = c1479510obV.LJIIIZ;
                list.add(new InterfaceC1479880oc6() { // from class: X.0oZ1
                    @Override // X.InterfaceC1479880oc6
                    public final /* synthetic */ Object LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1479880oc6
                    public final Object get() {
                        C1477890oYt c1477890oYt2 = c1477890oYt;
                        return C607330Nrv.LIZ.LIZ().createSubUrlProcessor().LIZ(str, c1477890oYt2);
                    }
                });
                if (c1479510obV.LJLLL == c1477890oYt.subId) {
                    c1479510obV.LJLLJ = Boolean.TRUE.equals(c1477890oYt.isRealtimeTranslated());
                }
            }
        }
    }

    public static void LJIIL(SimVideo simVideo, SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null && simVideo != null) {
            simVideoUrlModel.setColdBoot(simVideo.isColdBoot());
            simVideoUrlModel.setMeta(simVideo.getMeta());
        }
    }

    public static void LJIIJJI(C1479530obX c1479530obX, C1479510obV c1479510obV, SimVideoUrlModel simVideoUrlModel) {
        if (c1479530obX != null && c1479510obV != null) {
            if (LIZ) {
                LIZ = false;
                c1479510obV.LJJLI = "nor";
            }
            simVideoUrlModel.setPreferredResolution(c1479530obX.LJLJJLL);
            simVideoUrlModel.setScCategory(c1479530obX.LJLJL ? 1 : 0);
            if (!TextUtils.isEmpty(c1479530obX.LJIJ)) {
                simVideoUrlModel.setSubTag(c1479530obX.LJIJ);
            }
            simVideoUrlModel.setAdSrBizPriority(c1479530obX.LJLJLJ);
            simVideoUrlModel.setEnablePreciseCacheKey(c1479530obX.LJLZ);
        }
    }

    public static C1479510obV LIZLLL(SimVideo simVideo, boolean z, EnumC1479590obd enumC1479590obd, int i, String str, boolean z2, EnumC2281141EQm enumC2281141EQm, boolean z3, C1479530obX c1479530obX) {
        C1479510obV c1479510obVLIZ = C1479310obB.LIZ(c1479530obX);
        boolean z4 = true;
        if (c1479510obVLIZ != null && !z3) {
            C1479510obV c1479510obV = new C1479510obV();
            if (C1479510obV.LLJLIL == null) {
                C1479510obV.LLJLIL = LIZIZ();
            }
            c1479510obV.LIZIZ();
            c1479510obV.LIZ(c1479510obVLIZ);
            c1479510obV.LJJIJ = true;
            c1479510obV.LJIIJ = z;
            c1479510obV.LJJIJIIJI = z2;
            C1477400oY6.LJJJJI.LJJIIJ(simVideo.getSourceId(), simVideo.getVideoId());
            if (LIZ) {
                LIZ = false;
                c1479510obV.LJJLI = "nor";
            }
            return c1479510obV;
        }
        C1479510obV c1479510obV2 = new C1479510obV(new C1475260oUe(simVideo.getPlayAddr(), "", false, false, true), null, C1475000oUE.LIZ, simVideo.getSourceId(), z, enumC1479590obd, false, 0, C1480850odf.LIZJ.getRenderType(), null, simVideo.getVideoId(), z2, LIZ().isAsyncInit(), LIZ().get265DecodeType());
        c1479510obV2.LJJIII = LIZ().frameWait();
        c1479510obV2.LJJIL = i;
        c1479510obV2.LJIJI = LJ();
        c1479510obV2.LLJJLIIIJLLLLLLLZ = LIZ().isDirectUrlCheckInfoEnable();
        if (!TextUtils.isEmpty(str)) {
            c1479510obV2.LJJLIIIIJ = str;
        }
        if (TextUtils.isEmpty(c1479510obV2.LJJLIIIIJ) && !TextUtils.isEmpty(enumC1479590obd.getSubTag())) {
            c1479510obV2.LJJLIIIIJ = enumC1479590obd.getSubTag();
        }
        C1472990oQz c1472990oQz = new C1472990oQz();
        c1472990oQz.LJ = simVideo.getVideoId();
        c1472990oQz.LJJIFFI = simVideo.getVidPlayVersion();
        c1472990oQz.LJFF = simVideo.getVideoIdAuth();
        c1472990oQz.LJI = simVideo.getVideoIdPToken();
        c1472990oQz.LIZLLL = simVideo.getVideoIdApiHost();
        c1472990oQz.LJIILL = C1475000oUE.LIZIZ().defaultHost();
        c1472990oQz.LJII = String.valueOf(C1475000oUE.LIZIZ().getAppID());
        c1472990oQz.LJIIIZ = EnumC2281141EQm.SuperHigh;
        C1477400oY6.LJJJJI.LJJIIJ(simVideo.getSourceId(), simVideo.getVideoId());
        if (enumC2281141EQm != null) {
            c1472990oQz.LJIIIZ = enumC2281141EQm;
        }
        if (simVideo.enableIntertrustDrm()) {
            c1472990oQz.LJIIL = LIZ().enableIntertrust();
            c1472990oQz.LJIILIIL = LIZ().enableIntertrustDemotion();
        }
        c1479510obV2.LJJJLZIJ = c1472990oQz;
        if (LIZ().PlayeAbVIDDashHijackRetryEnableExp() != 1) {
            z4 = false;
        }
        c1479510obV2.LJJJJ = z4;
        if (!C1474810oTv.LLIILZL()) {
            c1479510obV2.LJJLIIIJILLIZJL = C607330Nrv.LIZ.LIZ().getAverageSpeedInKBps();
        } else {
            c1479510obV2.LLJILJILJ = new InterfaceC1479840oc2() { // from class: X.0obE
                @Override // X.InterfaceC1479840oc2
                public final float LIZ() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1479840oc2
                public final Float LIZIZ() {
                    return Float.valueOf(Float.MIN_VALUE);
                }

                @Override // X.InterfaceC1479840oc2
                public final Float LIZJ() {
                    return Float.valueOf(Float.MIN_VALUE);
                }

                @Override // X.InterfaceC1479840oc2
                public final int getNetworkSpeed() {
                    return C607330Nrv.LIZ.LIZ().getAverageSpeedInKBps();
                }
            };
        }
        if (TextUtils.isEmpty(c1479510obV2.LJJLI) && !TextUtils.isEmpty(enumC1479590obd.getTag())) {
            c1479510obV2.LJJLI = enumC1479590obd.getTag();
        }
        if (LIZ) {
            LIZ = false;
            c1479510obV2.LJJLI = "nor";
        }
        c1479510obV2.LJJLIL = simVideo.getDuration();
        c1479510obV2.LJJLJ = Float.valueOf(LIZ().getVolLoudUnity());
        c1479510obV2.LJLJLLL = LIZ().enableBufferTimeControl();
        c1479510obV2.LJLL = LIZ().cacheDuration(simVideo.getDuration());
        C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
        c1479510obV2.LLI = c1478040oZ8.LIZ().disableSleepResume(c1479510obV2.LJIIIZ);
        simVideo.isColdBoot();
        c1479510obV2.LLFZ = c1478040oZ8.LIZ().enableFileIoOpt(c1479510obV2.LJIIIZ);
        c1479510obV2.LLIFFJFJJ = LIZ().resumeFileIoBlockDurationThreshold();
        c1479510obV2.LLII = LIZ().memCacheVideoDurationThreshold();
        return c1479510obV2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[PHI: r22
      0x0091: PHI (r22v1 boolean) = (r22v0 boolean), (r22v3 boolean), (r22v0 boolean) binds: [B:8:0x0062, B:17:0x008a, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1479510obV LIZJ(final com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, int r29, boolean r30, java.lang.String r31, java.lang.String r32, boolean r33, boolean r34, X.EnumC1479590obd r35, final X.C1479530obX r36) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479290ob9.LIZJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, boolean, boolean, boolean, boolean, boolean, int, boolean, java.lang.String, java.lang.String, boolean, boolean, X.0obd, X.0obX):X.0obV");
    }
}
