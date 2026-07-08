package X;

import android.app.Application;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476910oXJ implements InterfaceC1476950oXN {
    public static C1473160oRG LIZLLL;
    public final C1476940oXM LIZ;
    public volatile InterfaceC1477260oXs LIZIZ;
    public volatile InterfaceC1475040oUI LIZJ;

    public final InterfaceC1475640oVG LIZ() {
        if (this.LIZJ == null) {
            IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = C582130MsN.LIZ().getConfig().getDimensionBitrateCurveConfig();
            if (dimensionBitrateCurveConfig == null || !dimensionBitrateCurveConfig.enable()) {
                this.LIZJ = new InterfaceC1475040oUI() { // from class: X.0oUF
                    public InterfaceC1475640oVG LIZ;
                    public int LIZIZ = 1;
                    public boolean LIZJ = EnumC590140NCq.INS.isEnable();

                    @Override // X.InterfaceC1475040oUI
                    public final synchronized InterfaceC1475640oVG create() {
                        if (C1475030oUH.LIZ.LIZ() == null) {
                            return null;
                        }
                        if (this.LIZ == null || this.LIZIZ != 1 || this.LIZJ != EnumC590140NCq.INS.isEnable()) {
                            LIZ();
                        }
                        return this.LIZ;
                    }

                    public final void LIZ() {
                        C1484860ok8 c1484860ok8 = C1475030oUH.LIZ;
                        RateSettingsResponse rateSettingsResponseLIZ = c1484860ok8.LIZ();
                        boolean zIsEnable = EnumC590140NCq.INS.isEnable();
                        this.LIZJ = zIsEnable;
                        if (zIsEnable) {
                            this.LIZ = new C1476850oXD();
                        } else {
                            AutoBitrateSet autoBitrateSet = rateSettingsResponseLIZ.getAutoBitrateSet();
                            RateSettingsResponse rateSettingsResponseLIZ2 = c1484860ok8.LIZ();
                            if (C1480850odf.LIZJ.getBitrateSelectMode() == 1) {
                                C1477440oYA c1477440oYA = new C1477440oYA(rateSettingsResponseLIZ2.getAdaptiveGearGroup());
                                c1477440oYA.LIZIZ = rateSettingsResponseLIZ2.getGearSet();
                                c1477440oYA.LIZJ = rateSettingsResponseLIZ2.getBandwidthSet();
                                c1477440oYA.LIZLLL = autoBitrateSet;
                                this.LIZ = c1477440oYA.LIZ();
                            } else {
                                C1477450oYB c1477450oYB = new C1477450oYB(rateSettingsResponseLIZ2.getAdaptiveGearGroup());
                                c1477450oYB.LIZIZ = rateSettingsResponseLIZ2.getGearSet();
                                c1477450oYB.LIZJ = rateSettingsResponseLIZ2.getBandwidthSet();
                                c1477450oYB.LIZLLL = autoBitrateSet;
                                this.LIZ = c1477450oYB.LIZ();
                            }
                        }
                        if (C1474810oTv.LJJLIIIJJI()) {
                            try {
                                String strLJIILL = new Gson().LJIILL(rateSettingsResponseLIZ);
                                if (!TextUtils.isEmpty(strLJIILL)) {
                                    JSONObject jSONObject = new JSONObject(strLJIILL);
                                    jSONObject.put("cache_check", new JSONObject());
                                    String str = (String) C1474810oTv.LJJIIZ.getValue();
                                    if (!TextUtils.isEmpty(str)) {
                                        JSONObject jSONObject2 = new JSONObject(str);
                                        if (!jSONObject2.has("find_cache") && C1474810oTv.LJJLIIIJJIZ()) {
                                            jSONObject2.put("find_cache", C1474810oTv.LJJLIIIJJIZ() ? 1 : 0);
                                        }
                                        jSONObject.put("extra_config", jSONObject2);
                                    }
                                    String str2 = (String) C1474810oTv.LJJIIZI.getValue();
                                    if (!TextUtils.isEmpty(str2)) {
                                        jSONObject.put("select_algo_config", new JSONObject(str2));
                                    }
                                    String str3 = (String) C1474810oTv.LJJIJ.getValue();
                                    if (!TextUtils.isEmpty(str3)) {
                                        jSONObject.put("log_config", new JSONObject(str3));
                                    }
                                    String str4 = (String) C1474810oTv.LJJIJIIJI.getValue();
                                    if (!TextUtils.isEmpty(str4)) {
                                        jSONObject.put("abr_select_config", new JSONObject(str4));
                                    }
                                    String str5 = (String) C1474810oTv.LJJIJIIJIL.getValue();
                                    if (!TextUtils.isEmpty(str5)) {
                                        jSONObject.put("weak_network_select_config", new JSONObject(str5));
                                    }
                                    JSONObject jSONObject3 = new JSONObject();
                                    String strLJIIIIZZ = C1474810oTv.LJIIIIZZ();
                                    if (!TextUtils.isEmpty(strLJIIIIZZ)) {
                                        jSONObject3.put("audio_label_config", new JSONObject(strLJIIIIZZ));
                                    }
                                    String str6 = (String) C1474810oTv.U0.getValue();
                                    if (!TextUtils.isEmpty(str6)) {
                                        jSONObject3.put("skip_audio_label_config", new JSONObject(str6));
                                    }
                                    String strLLIIII = C1474810oTv.LLIIII();
                                    if (!TextUtils.isEmpty(strLLIIII)) {
                                        jSONObject3.put("audio_select_config", new JSONObject(strLLIIII));
                                    }
                                    String strLJIILLIIL = C1474810oTv.LJIILLIIL();
                                    if (!TextUtils.isEmpty(strLJIILLIIL)) {
                                        jSONObject3.put("cae_audio_select_config", new JSONObject(strLJIILLIIL));
                                    }
                                    String str7 = (String) C1474810oTv.LJJIJIL.getValue();
                                    if (!TextUtils.isEmpty(str7)) {
                                        JSONObject jSONObject4 = new JSONObject(str7);
                                        Iterator<String> itKeys = jSONObject4.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            jSONObject3.put(next, jSONObject4.get(next));
                                        }
                                    }
                                    jSONObject3.put("enable", C1474810oTv.LJJLIIIJ());
                                    if (jSONObject3.length() > 0) {
                                        jSONObject.put("dash_audio_config", jSONObject3);
                                    }
                                    String str8 = (String) C1474810oTv.f200a3.getValue();
                                    if (!TextUtils.isEmpty(str8)) {
                                        jSONObject.put("ml_gear_config", new JSONObject(str8));
                                    }
                                    if (C790030Uyv.LIZ.LJIIJJI == 1) {
                                        IDimensionBitrateCurveConfig dimensionBitrateCurveConfig2 = C582130MsN.LIZ().getConfig().getDimensionBitrateCurveConfig();
                                        if (dimensionBitrateCurveConfig2 != null && dimensionBitrateCurveConfig2.enable()) {
                                            C1484380ojM c1484380ojMConfig = dimensionBitrateCurveConfig2.config();
                                            h hVar = c1484380ojMConfig.LIZ;
                                            if (hVar != null && hVar.size() > 0) {
                                                jSONObject.put("curve_global_conditions", new JSONArray(hVar.toString()));
                                            }
                                            h hVar2 = c1484380ojMConfig.LIZIZ;
                                            if (hVar2 != null && hVar2.size() > 0) {
                                                jSONObject.put("curve_additional_conditions", new JSONArray(hVar2.toString()));
                                            }
                                            h hVar3 = c1484380ojMConfig.LIZLLL;
                                            if (hVar3 != null && hVar3.size() > 0) {
                                                jSONObject.put("curve_priority_list", new JSONArray(hVar3.toString()));
                                            }
                                        }
                                        int lastNetworkSpeed = C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed();
                                        C582130MsN.LIZ().LJ();
                                        C1476910oXJ.LIZJ().LIZLLL(lastNetworkSpeed);
                                        jSONObject.put("initial_speed", lastNetworkSpeed);
                                        jSONObject.put("use_540_for_low_device", C1474810oTv.LLJLLIL());
                                        jSONObject.put("bitrate_for_low_device", C1474810oTv.LJIIIZ());
                                    }
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("vod_strategy_select_bitrate", jSONObject);
                                    TTVideoEngine.LJLJLJ(31006, C786410Ut5.J3(jSONObject5));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        this.LIZIZ = 1;
                    }
                };
            } else {
                this.LIZJ = new InterfaceC1475040oUI() { // from class: X.0oUG
                    public InterfaceC1475640oVG LIZ;
                    public int LIZIZ = 1;
                    public boolean LIZJ = EnumC590140NCq.INS.isEnable();

                    @Override // X.InterfaceC1475040oUI
                    public final synchronized InterfaceC1475640oVG create() {
                        if (C1475030oUH.LIZ.LIZ() == null) {
                            return null;
                        }
                        if (this.LIZ == null || this.LIZIZ != 1 || this.LIZJ != EnumC590140NCq.INS.isEnable()) {
                            LIZ();
                        }
                        return this.LIZ;
                    }

                    public final void LIZ() {
                        C1484860ok8 c1484860ok8 = C1475030oUH.LIZ;
                        RateSettingsResponse rateSettingsResponseLIZ = c1484860ok8.LIZ();
                        boolean zIsEnable = EnumC590140NCq.INS.isEnable();
                        this.LIZJ = zIsEnable;
                        if (zIsEnable) {
                            this.LIZ = new C1476850oXD();
                        } else {
                            AutoBitrateSet autoBitrateSet = rateSettingsResponseLIZ.getAutoBitrateSet();
                            RateSettingsResponse rateSettingsResponseLIZ2 = c1484860ok8.LIZ();
                            if (C1480850odf.LIZJ.getBitrateSelectMode() == 1) {
                                C1477440oYA c1477440oYA = new C1477440oYA(rateSettingsResponseLIZ2.getAdaptiveGearGroup());
                                c1477440oYA.LIZIZ = rateSettingsResponseLIZ2.getGearSet();
                                c1477440oYA.LIZJ = rateSettingsResponseLIZ2.getBandwidthSet();
                                c1477440oYA.LIZLLL = autoBitrateSet;
                                this.LIZ = c1477440oYA.LIZ();
                            } else {
                                C1477430oY9 c1477430oY9 = new C1477430oY9(rateSettingsResponseLIZ2.getAdaptiveGearGroup());
                                c1477430oY9.LIZIZ = rateSettingsResponseLIZ2.getGearSet();
                                c1477430oY9.LIZJ = rateSettingsResponseLIZ2.getBandwidthSet();
                                c1477430oY9.LIZLLL = autoBitrateSet;
                                this.LIZ = new C1475630oVF(c1477430oY9.LIZ(), autoBitrateSet);
                            }
                        }
                        if (C1474810oTv.LJJLIIIJJI()) {
                            try {
                                String strLJIILL = new Gson().LJIILL(rateSettingsResponseLIZ);
                                if (!TextUtils.isEmpty(strLJIILL)) {
                                    JSONObject jSONObject = new JSONObject(strLJIILL);
                                    jSONObject.put("cache_check", new JSONObject());
                                    String str = (String) C1474810oTv.LJJIIZ.getValue();
                                    if (!TextUtils.isEmpty(str)) {
                                        JSONObject jSONObject2 = new JSONObject(str);
                                        if (!jSONObject2.has("find_cache") && C1474810oTv.LJJLIIIJJIZ()) {
                                            jSONObject2.put("find_cache", C1474810oTv.LJJLIIIJJIZ() ? 1 : 0);
                                        }
                                        jSONObject.put("extra_config", jSONObject2);
                                    }
                                    String str2 = (String) C1474810oTv.LJJIIZI.getValue();
                                    if (!TextUtils.isEmpty(str2)) {
                                        jSONObject.put("select_algo_config", new JSONObject(str2));
                                    }
                                    String str3 = (String) C1474810oTv.LJJIJ.getValue();
                                    if (!TextUtils.isEmpty(str3)) {
                                        jSONObject.put("log_config", new JSONObject(str3));
                                    }
                                    String str4 = (String) C1474810oTv.LJJIJIIJI.getValue();
                                    if (!TextUtils.isEmpty(str4)) {
                                        jSONObject.put("abr_select_config", new JSONObject(str4));
                                    }
                                    String str5 = (String) C1474810oTv.LJJIJIIJIL.getValue();
                                    if (!TextUtils.isEmpty(str5)) {
                                        jSONObject.put("weak_network_select_config", new JSONObject(str5));
                                    }
                                    JSONObject jSONObject3 = new JSONObject();
                                    String strLJIIIIZZ = C1474810oTv.LJIIIIZZ();
                                    if (!TextUtils.isEmpty(strLJIIIIZZ)) {
                                        jSONObject3.put("audio_label_config", new JSONObject(strLJIIIIZZ));
                                    }
                                    String str6 = (String) C1474810oTv.U0.getValue();
                                    if (!TextUtils.isEmpty(str6)) {
                                        jSONObject3.put("skip_audio_label_config", new JSONObject(str6));
                                    }
                                    String strLLIIII = C1474810oTv.LLIIII();
                                    if (!TextUtils.isEmpty(strLLIIII)) {
                                        jSONObject3.put("audio_select_config", new JSONObject(strLLIIII));
                                    }
                                    String strLJIILLIIL = C1474810oTv.LJIILLIIL();
                                    if (!TextUtils.isEmpty(strLJIILLIIL)) {
                                        jSONObject3.put("cae_audio_select_config", new JSONObject(strLJIILLIIL));
                                    }
                                    String str7 = (String) C1474810oTv.LJJIJIL.getValue();
                                    if (!TextUtils.isEmpty(str7)) {
                                        JSONObject jSONObject4 = new JSONObject(str7);
                                        Iterator<String> itKeys = jSONObject4.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            jSONObject3.put(next, jSONObject4.get(next));
                                        }
                                    }
                                    jSONObject3.put("enable", C1474810oTv.LJJLIIIJ());
                                    if (jSONObject3.length() > 0) {
                                        jSONObject.put("dash_audio_config", jSONObject3);
                                    }
                                    String str8 = (String) C1474810oTv.f200a3.getValue();
                                    if (!TextUtils.isEmpty(str8)) {
                                        jSONObject.put("ml_gear_config", new JSONObject(str8));
                                    }
                                    if (C790030Uyv.LIZ.LJIIJJI == 1) {
                                        IDimensionBitrateCurveConfig dimensionBitrateCurveConfig2 = C582130MsN.LIZ().getConfig().getDimensionBitrateCurveConfig();
                                        if (dimensionBitrateCurveConfig2 != null && dimensionBitrateCurveConfig2.enable()) {
                                            C1484380ojM c1484380ojMConfig = dimensionBitrateCurveConfig2.config();
                                            h hVar = c1484380ojMConfig.LIZ;
                                            if (hVar != null && hVar.size() > 0) {
                                                jSONObject.put("curve_global_conditions", new JSONArray(hVar.toString()));
                                            }
                                            h hVar2 = c1484380ojMConfig.LIZIZ;
                                            if (hVar2 != null && hVar2.size() > 0) {
                                                jSONObject.put("curve_additional_conditions", new JSONArray(hVar2.toString()));
                                            }
                                            h hVar3 = c1484380ojMConfig.LIZLLL;
                                            if (hVar3 != null) {
                                                jSONObject.put("curve_priority_list", new JSONArray(hVar3.toString()));
                                            }
                                        }
                                        int lastNetworkSpeed = C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed();
                                        C582130MsN.LIZ().LJ();
                                        C1476910oXJ.LIZJ().LIZLLL(lastNetworkSpeed);
                                        jSONObject.put("initial_speed", lastNetworkSpeed);
                                        jSONObject.put("use_540_for_low_device", C1474810oTv.LLJLLIL());
                                        jSONObject.put("bitrate_for_low_device", C1474810oTv.LJIIIZ());
                                    }
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("vod_strategy_select_bitrate", jSONObject);
                                    TTVideoEngine.LJLJLJ(31006, C786410Ut5.J3(jSONObject5));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        this.LIZIZ = 1;
                    }
                };
            }
        }
        return this.LIZJ.create();
    }

    public final InterfaceC1477260oXs LIZIZ() {
        if (this.LIZIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZIZ == null) {
                        C01GW c01gw = C1474810oTv.f211u4;
                        if (((Number) c01gw.getValue()).intValue() == 1) {
                            this.LIZIZ = new InterfaceC1477260oXs() { // from class: X.0oXF
                                @Override // X.InterfaceC1477260oXs
                                public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
                                    return C1477000oXS.LIZLLL(str, interfaceC1476900oXI).LIZJ;
                                }

                                @Override // X.InterfaceC1477260oXs
                                public final C1476840oXC LIZ(SimVideoUrlModel simVideoUrlModel, boolean z, int i) {
                                    return C1476890oXH.LIZ.LIZJ(simVideoUrlModel, z, i, false);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
                                @Override // X.InterfaceC1477260oXs
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final X.C1476830oXB getProperBitrateForDash(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r9, X.InterfaceC1476900oXI r10, boolean r11, int r12) {
                                    /*
                                        Method dump skipped, instruction units count: 271
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1476870oXF.getProperBitrateForDash(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.0oXI, boolean, int):X.0oXB");
                                }
                            };
                        } else if (((Number) c01gw.getValue()).intValue() == 2) {
                            this.LIZIZ = new InterfaceC1477260oXs() { // from class: X.0oXE
                                @Override // X.InterfaceC1477260oXs
                                public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
                                    return C1476880oXG.LIZ.LIZLLL(str, interfaceC1476900oXI).LIZJ;
                                }

                                @Override // X.InterfaceC1477260oXs
                                public final C1476840oXC LIZ(SimVideoUrlModel simVideoUrlModel, boolean z, int i) {
                                    return C1476880oXG.LIZ.LIZJ(simVideoUrlModel, z, i, false);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
                                @Override // X.InterfaceC1477260oXs
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final X.C1476830oXB getProperBitrateForDash(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r9, X.InterfaceC1476900oXI r10, boolean r11, int r12) {
                                    /*
                                        Method dump skipped, instruction units count: 271
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1476860oXE.getProperBitrateForDash(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.0oXI, boolean, int):X.0oXB");
                                }
                            };
                        } else {
                            this.LIZIZ = new InterfaceC1477260oXs() { // from class: X.0oX8
                                @Override // X.InterfaceC1477260oXs
                                public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
                                    return C1476820oXA.LIZ.LJ(str, interfaceC1476900oXI).LIZJ;
                                }

                                @Override // X.InterfaceC1477260oXs
                                public final C1476840oXC LIZ(SimVideoUrlModel simVideoUrlModel, boolean z, int i) {
                                    return C1476820oXA.LIZ.LIZLLL(simVideoUrlModel, z, i, false);
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
                                
                                    if (r6 != null) goto L76;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:153:0x0298 A[PHI: r6 r9
                                  0x0298: PHI (r6v7 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate) = 
                                  (r6v5 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                  (r6v8 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                 binds: [B:196:0x034f, B:152:0x0296] A[DONT_GENERATE, DONT_INLINE]
                                  0x0298: PHI (r9v7 java.util.List<com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate>) = 
                                  (r9v5 java.util.List<com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate>)
                                  (r9v8 java.util.List<com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate>)
                                 binds: [B:196:0x034f, B:152:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:163:0x02c7  */
                                /* JADX WARN: Removed duplicated region for block: B:173:0x02e3  */
                                /* JADX WARN: Removed duplicated region for block: B:191:0x0341  */
                                /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
                                /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
                                /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
                                /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[ADDED_TO_REGION] */
                                /* JADX WARN: Removed duplicated region for block: B:75:0x010d A[EDGE_INSN: B:90:0x0148->B:75:0x010d BREAK  A[LOOP:5: B:83:0x012c->B:91:0x014a], EDGE_INSN: B:225:0x010d->B:75:0x010d BREAK  A[LOOP:4: B:66:0x00eb->B:77:0x011a], PHI: r6
                                  0x010d: PHI (r6v20 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate) = 
                                  (r6v16 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                  (r6v18 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                  (r6v22 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                 binds: [B:93:0x0156, B:90:0x0148, B:225:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:75:0x010d A[EDGE_INSN: B:90:0x0148->B:75:0x010d BREAK  A[LOOP:5: B:83:0x012c->B:91:0x014a], PHI: r6
                                  0x010d: PHI (r6v20 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate) = 
                                  (r6v16 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                  (r6v18 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                  (r6v22 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
                                 binds: [B:93:0x0156, B:90:0x0148, B:225:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:93:0x0156  */
                                /* JADX WARN: Removed duplicated region for block: B:94:0x0158  */
                                @Override // X.InterfaceC1477260oXs
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final X.C1476830oXB getProperBitrateForDash(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r19, X.InterfaceC1476900oXI r20, boolean r21, int r22) {
                                    /*
                                        Method dump skipped, instruction units count: 861
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1476800oX8.getProperBitrateForDash(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.0oXI, boolean, int):X.0oXB");
                                }
                            };
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oXM] */
    public C1476910oXJ() {
        LIZLLL = new C1473160oRG();
        this.LIZ = new Object() { // from class: X.0oXM
        };
    }

    public static final ISpeedCalculator LIZJ() {
        return C1476930oXL.LIZ().LIZ();
    }

    public final int LIZLLL() {
        return LIZJ().LJII();
    }

    public static final void LJFF(boolean z) {
        C1476920oXK.LIZLLL = z;
        if (z) {
            C1476920oXK.LIZ = false;
            Application application = C1475000oUE.LIZ;
            if (application != null) {
                try {
                    C1300690jx5.LJ((SensorManager) C786410Ut5.H2(application, "sensor"), C1476920oXK.LIZIZ, C1475000oUE.LJFF(false));
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1481110oe5.LIZ(e.getMessage());
                }
            }
        } else {
            C1476920oXK.LIZJ();
        }
        C1475700oVM.LIZ().LJ(z);
    }

    public static final void LJ(boolean z, String str) {
        C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().setAutoAudioFocus(z, str);
    }
}
