package X;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.playerkit.model.DashAutoBitrateSet;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1476990oXR implements InterfaceC1477040oXW {
    public static int LIZIZ = -1;
    public static boolean LIZJ = true;
    public static Integer LIZLLL;
    public static final ConcurrentHashMap<String, Float> LJ = new ConcurrentHashMap<>(50);
    public static final ConcurrentLinkedQueue<String> LJFF = new ConcurrentLinkedQueue<>();
    public final C1477020oXU LIZ;

    public C1476990oXR() {
        IDimensionBitrateFilterConfig dimensionBitrateFilterConfig = C582130MsN.LIZ().getConfig().getDimensionBitrateFilterConfig();
        if (dimensionBitrateFilterConfig == null || !dimensionBitrateFilterConfig.enable()) {
            return;
        }
        this.LIZ = new C1477020oXU();
    }

    public static final void LJFF(SimVideoUrlModel simVideoUrlModel, SimAudioBitrate simAudioBitrate) {
        if (simAudioBitrate == null) {
            return;
        }
        simVideoUrlModel.setHitDashAudioBitrate(simAudioBitrate);
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        Session sessionLJI = c1477400oY6.LJI(simVideoUrlModel.getUri());
        if (sessionLJI != null) {
            sessionLJI.sourceId = simVideoUrlModel.getSourceId();
            sessionLJI.audioBitrate = simAudioBitrate.getBitRate();
        }
        if (simVideoUrlModel.getSourceId() != null) {
            c1477400oY6.LJJIL(simVideoUrlModel.getSourceId(), simAudioBitrate);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C1476830oXB LJ(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        C1477120oXe c1477120oXeLIZIZ;
        DashAutoBitrateSet dashAutoBitrateSet;
        int iIndexOf;
        C1476830oXB c1476830oXB = new C1476830oXB();
        if (interfaceC1476900oXI == null) {
            return c1476830oXB;
        }
        C582130MsN.LIZ().LJ();
        int iLJIIIIZZ = (int) C1476910oXJ.LIZJ().LJIIIIZZ();
        if (C582130MsN.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            if (iLJIIIIZZ <= 0.0d) {
                iLJIIIIZZ = LIZIZ;
                if (iLJIIIIZZ <= 0) {
                    iLJIIIIZZ = C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed();
                }
                C582130MsN.LIZ().LJ();
                C1476910oXJ.LIZJ().LIZLLL(iLJIIIIZZ);
            } else {
                LIZIZ = iLJIIIIZZ;
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
        List<? extends InterfaceC1477220oXo> listLIZ = arrayList;
        if (C1474810oTv.LJJJJI()) {
            C1477020oXU c1477020oXU = this.LIZ;
            listLIZ = arrayList;
            if (c1477020oXU != null) {
                listLIZ = c1477020oXU.LIZ(str, arrayList);
            }
        }
        C1470240oMY tag = null;
        if (listLIZ.size() == 1) {
            c1477120oXeLIZIZ = new C1477120oXe();
            c1477120oXeLIZIZ.LL = (InterfaceC1477220oXo) ListProtector.get(listLIZ, 0);
        } else {
            InterfaceC1475640oVG interfaceC1475640oVGLIZ = C582130MsN.LIZ().LJ().LIZ();
            if (interfaceC1475640oVGLIZ == null) {
                return c1476830oXB;
            }
            C1477030oXV c1477030oXV = new C1477030oXV();
            c1477030oXV.LIZ(iLJIIIIZZ);
            Map<String, Object> map = c1477030oXV.LIZ;
            if (!C1474810oTv.LJJJJI() && (dashAutoBitrateSet = (DashAutoBitrateSet) C1474810oTv.LJJJ.getValue()) != null && dashAutoBitrateSet.enable) {
                ((HashMap) map).put("KEY_AUTO_BITRATE_SET", new C1477060oXY(dashAutoBitrateSet));
            }
            HashMap map2 = (HashMap) map;
            map2.put("source_id", str);
            c1477120oXeLIZIZ = interfaceC1475640oVGLIZ.LIZIZ(listLIZ, map2);
            boolean z = interfaceC1475640oVGLIZ instanceof C1475630oVF;
            if (c1477120oXeLIZIZ != null) {
            }
            return c1476830oXB;
        }
        InterfaceC1477220oXo interfaceC1477220oXo = c1477120oXeLIZIZ.LL;
        if (interfaceC1477220oXo != null && (iIndexOf = listLIZ.indexOf(interfaceC1477220oXo)) >= 0 && iIndexOf < arrayList2.size()) {
            if (C1474810oTv.LJZL()) {
                if (interfaceC1476900oXI.getTag() != null) {
                    tag = interfaceC1476900oXI.getTag();
                }
                C1474520oTS c1474520oTSLJJIJLIJ = TTVideoEngine.LJJIJLIJ(tag, 0);
                if (c1474520oTSLJJIJLIJ == null) {
                    c1476830oXB.LIZJ = (EnumC2281141EQm) ListProtector.get(arrayList2, iIndexOf);
                    c1476830oXB.LIZLLL = ((SimBitRate) ListProtector.get(listLIZ, iIndexOf)).getQuality();
                } else {
                    c1476830oXB.LIZJ = C2281221EQu.LIZ(c1474520oTSLJJIJLIJ.getResolution());
                    c1476830oXB.LIZLLL = c1474520oTSLJJIJLIJ.LIZ(18);
                }
            } else {
                c1476830oXB.LIZJ = interfaceC1476900oXI.LIZLLL((EnumC2281141EQm) ListProtector.get(arrayList2, iIndexOf));
            }
            int iIndexOf2 = arrayList2.indexOf(c1476830oXB.LIZJ);
            Session sessionLJIIIZ = C1477400oY6.LJJJJI.LJIIIZ(str);
            if (sessionLJIIIZ != null && iIndexOf2 >= 0 && iIndexOf2 < listLIZ.size() && ListProtector.get(listLIZ, iIndexOf2) != null) {
                sessionLJIIIZ.bitrate = ((SimBitRate) ListProtector.get(listLIZ, iIndexOf2)).getBitRate();
            }
        }
        return c1476830oXB;
    }

    public final C1476830oXB LIZJ(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z) {
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
        C1476830oXB c1476830oXBLJ = LJ(videoId, interfaceC1476900oXI);
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
        c1476830oXBLJ.LJFF = z3;
        return c1476830oXBLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0210 A[EDGE_INSN: B:190:0x0210->B:107:0x0210 BREAK  A[LOOP:4: B:103:0x01f8->B:191:?], PHI: r6
      0x0210: PHI (r6v4 com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) = 
      (r6v1 com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate)
      (r6v6 com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate)
     binds: [B:154:0x037c, B:190:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1476840oXC LIZLLL(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r25, boolean r26, int r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1476990oXR.LIZLLL(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, boolean, int, boolean):X.0oXC");
    }

    public static Map LIZIZ(SimVideoUrlModel simVideoUrlModel, double d, InterfaceC1475360oUo interfaceC1475360oUo, int i, List list) {
        int iLJIIJ = C1474810oTv.LJIIJ();
        float f = 1.0f;
        if (simVideoUrlModel != null && !TextUtils.isEmpty(simVideoUrlModel.getMeta())) {
            try {
                JSONObject json = C1473210oRL.from(simVideoUrlModel.getMeta()).getJson();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(1.0f);
                String strOptString = json.optString("qprf", C2188811AlT.LIZIZ(sbLIZ));
                if (!TextUtils.isEmpty(strOptString)) {
                    f = CastFloatProtector.parseFloat(strOptString);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        String sourceId = simVideoUrlModel.getSourceId();
        c1477400oY6.getClass();
        if (!TextUtils.isEmpty(sourceId)) {
            c1477400oY6.LJIIZILJ.put(sourceId, Float.valueOf(f));
        }
        C1477030oXV c1477030oXV = new C1477030oXV();
        if (d >= 0.0d) {
            c1477030oXV.LIZ((int) d);
        }
        if (iLJIIJ == 1) {
            ((HashMap) c1477030oXV.LIZ).put("bitrate_adjust_factor_speed", Float.valueOf(f));
        } else if (iLJIIJ == 2) {
            ((HashMap) c1477030oXV.LIZ).put("bitrate_adjust_factor_calc", Float.valueOf(f));
        }
        HashMap map = (HashMap) c1477030oXV.LIZ;
        map.put("source_id", simVideoUrlModel.getSourceId());
        map.put("bitrate_quality_config", 1);
        if (interfaceC1475360oUo != null) {
            map.put("KEY_AUTO_BITRATE_SET", interfaceC1475360oUo);
        } else {
            map.remove("KEY_AUTO_BITRATE_SET");
        }
        map.put("select_type", Integer.valueOf(i));
        map.put("sim_bitrate_list", list);
        map.put("sim_video_url_model", simVideoUrlModel);
        return map;
    }

    @Override // X.InterfaceC1477040oXW
    public final C1476840oXC LIZ(final SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, AutoBitrateSet autoBitrateSet, final int i, boolean z) {
        final InterfaceC1475640oVG interfaceC1475640oVGLIZ;
        boolean z2;
        InterfaceC1475360oUo interfaceC1475360oUo;
        InterfaceC1482870ogv interfaceC1482870ogvLIZ;
        boolean z3;
        DashAutoBitrateSet dashAutoBitrateSet;
        final InterfaceC1475360oUo interfaceC1475360oUo2 = autoBitrateSet;
        C1477060oXY c1477060oXY = null;
        if (simVideoUrlModel == null) {
            return null;
        }
        SimBitRate[] simBitRateArr = (SimBitRate[]) ((ArrayList) list).toArray(new SimBitRate[0]);
        Application application = C1475000oUE.LIZ;
        StringBuilder sb = new StringBuilder();
        C1484860ok8 c1484860ok8 = C1475030oUH.LIZ;
        if (c1484860ok8.LIZ() == null || (interfaceC1475640oVGLIZ = C582130MsN.LIZ().LJ().LIZ()) == null) {
            return null;
        }
        C582130MsN.LIZ().LJ();
        int iLJIIIIZZ = (int) C1476910oXJ.LIZJ().LJIIIIZZ();
        if (C582130MsN.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            if (iLJIIIIZZ <= 0.0d) {
                iLJIIIIZZ = LIZIZ;
                if (iLJIIIIZZ <= 0) {
                    iLJIIIIZZ = C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed();
                }
                C582130MsN.LIZ().LJ();
                C1476910oXJ.LIZJ().LIZLLL(iLJIIIIZZ);
                z2 = false;
            } else {
                LIZIZ = iLJIIIIZZ;
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && (dashAutoBitrateSet = (DashAutoBitrateSet) C1474810oTv.LJJJ.getValue()) != null && dashAutoBitrateSet.enable) {
            c1477060oXY = new C1477060oXY(dashAutoBitrateSet);
        }
        if (interfaceC1475360oUo2 == null) {
            interfaceC1475360oUo2 = c1477060oXY;
        }
        final int i2 = iLJIIIIZZ;
        float fFloatValue = ((Float) EnumC1477770oYh.BandwidthFactor.call(new InterfaceC1481300oeO<Float>() { // from class: X.0oVl
            /* JADX WARN: Removed duplicated region for block: B:108:0x029e A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
            /* JADX WARN: Type inference failed for: r0v84, types: [T, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r2v10, types: [T, X.00BE] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1481300oeO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Float call() {
                /*
                    Method dump skipped, instruction units count: 679
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1475950oVl.call():java.lang.Object");
            }
        })).floatValue();
        if (fFloatValue <= 0.0f) {
            fFloatValue = 1.0f;
        }
        C1477120oXe c1477120oXeLIZIZ = interfaceC1475640oVGLIZ.LIZIZ(list, LIZIZ(simVideoUrlModel, iLJIIIIZZ * fFloatValue, interfaceC1475360oUo2, i, list));
        if (c1477120oXeLIZIZ != null && c1477120oXeLIZIZ.LL != null) {
            StringBuilder sb2 = c1477120oXeLIZIZ.LLIZ;
            sb2.append(", currentSpeedValid:");
            sb2.append(z2);
            sb2.append(", lastSpeed:");
            sb2.append(iLJIIIIZZ);
            C1477400oY6.LJJJJI.LJJJ(simVideoUrlModel.getSourceId(), c1477120oXeLIZIZ.LLIZLLLIL);
            if (interfaceC1475640oVGLIZ instanceof C1475630oVF) {
                interfaceC1475360oUo = ((C1475630oVF) interfaceC1475640oVGLIZ).LJFF;
            } else {
                interfaceC1475360oUo = null;
            }
            if (!C1474810oTv.LJJIIJZLJL()) {
                try {
                    C1477070oXZ c1477070oXZ = c1477120oXeLIZIZ.LLILZIL;
                    if (c1484860ok8.LIZ() != null) {
                        if (c1477070oXZ != null) {
                        }
                    } else {
                        c1477070oXZ = new C1477070oXZ(7, "gear config is not init");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bitrate_not_match_code", c1477070oXZ.getCode());
                    jSONObject.put("bitrate_not_match_msg", c1477070oXZ.getMessage());
                    jSONObject.put("group_id", simVideoUrlModel.getSourceId());
                    C582130MsN.LIZ().getConfig().getMonitor().monitorCommonLog("video_bitrate_not_match", jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            InterfaceC1477220oXo interfaceC1477220oXo = c1477120oXeLIZIZ.LL;
            if (EnumC590140NCq.INS.isEnable()) {
                if (simBitRateArr != null && simBitRateArr.length != 0) {
                    InterfaceC1482870ogv interfaceC1482870ogvLIZ2 = C1478160oZK.LIZ();
                    SimBitRate simBitRate = simBitRateArr[0];
                    long bitRate = ((long) (((((double) simBitRate.getBitRate()) * simVideoUrlModel.getDuration()) / 1000.0d) / 8.0d)) - interfaceC1482870ogvLIZ2.LJIJI(simBitRateArr[0], z);
                    for (int i3 = 1; i3 < simBitRateArr.length; i3++) {
                        SimBitRate simBitRate2 = simBitRateArr[i3];
                        long bitRate2 = ((long) (((((double) simBitRate2.getBitRate()) * simVideoUrlModel.getDuration()) / 1000.0d) / 8.0d)) - interfaceC1482870ogvLIZ2.LJIJI(simBitRate2, z);
                        if (bitRate2 < bitRate) {
                            simBitRate = simBitRate2;
                            bitRate = bitRate2;
                        }
                    }
                    c1477120oXeLIZIZ.LLIZ.append(",CacheStrategy:MinNeedDownload");
                    c1477120oXeLIZIZ.LL = simBitRate;
                }
            } else if (interfaceC1477220oXo != null) {
                if ((!C1474810oTv.LJJLIIIJJI() || !C1474810oTv.LJJLIIIJJIZ()) && (interfaceC1482870ogvLIZ = C1478160oZK.LIZ()) != null) {
                    double bitrateSwitchThreshold = C582130MsN.LIZ().getConfig().getCommonConfig().getBitrateSwitchThreshold();
                    for (SimBitRate simBitRate3 : simBitRateArr) {
                        if (simBitRate3.getBitRate() != interfaceC1477220oXo.getBitRate()) {
                            long jLJIJI = interfaceC1482870ogvLIZ.LJIJI(simBitRate3, z);
                            if (jLJIJI > 0) {
                                long jLJJJJ = interfaceC1482870ogvLIZ.LJJJJ(simBitRate3, z);
                                double d = jLJJJJ - jLJIJI;
                                if (iLJIIIIZZ > 0 && jLJJJJ > 0 && simVideoUrlModel.getDuration() > 0.0d && d / ((double) iLJIIIIZZ) <= ((jLJIJI * bitrateSwitchThreshold) / jLJJJJ) * (simVideoUrlModel.getDuration() / 1000.0d)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (simBitRate3.getBitRate() > interfaceC1477220oXo.getBitRate()) {
                                    if (jLJIJI >= interfaceC1482870ogvLIZ.LJJJJ(simBitRate3, z) || z3) {
                                        sb.append(" 1speed ");
                                        sb.append(iLJIIIIZZ);
                                        sb.append(" ");
                                        Float f = LJ.get(simBitRate3.getUrlKey());
                                        if (f != null) {
                                            iLJIIIIZZ = f.intValue();
                                        }
                                        c1477120oXeLIZIZ.LLIZ.append(",CacheStrategy:high");
                                        interfaceC1477220oXo = simBitRate3;
                                    }
                                } else if (z3) {
                                    sb.append("2speed ");
                                    sb.append(iLJIIIIZZ);
                                    sb.append(" ");
                                    Float f2 = LJ.get(simBitRate3.getUrlKey());
                                    if (f2 != null) {
                                        iLJIIIIZZ = f2.intValue();
                                    }
                                    c1477120oXeLIZIZ.LLIZ.append(",CacheStrategy:low");
                                    interfaceC1477220oXo = simBitRate3;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                c1477120oXeLIZIZ.LL = interfaceC1477220oXo;
            }
            C1476840oXC c1476840oXCLIZ = C1476840oXC.LIZ(c1477120oXeLIZIZ);
            c1476840oXCLIZ.LLJILJIL = iLJIIIIZZ;
            StringBuilder sb3 = c1477120oXeLIZIZ.LLIZ;
            if (sb3 != null) {
                sb.append(sb3.toString());
            }
            sb.append(e3.f);
            c1476840oXCLIZ.LLJIJIL = sb.toString();
            c1476840oXCLIZ.LLJJ = interfaceC1475360oUo;
            return c1476840oXCLIZ;
        }
        C1477400oY6.LJJJJI.LJJJ(simVideoUrlModel.getSourceId(), "SelectNull");
        return null;
    }
}
