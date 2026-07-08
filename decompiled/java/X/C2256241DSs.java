package X;

import android.os.Looper;
import com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256241DSs {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DSz] */
    public static C2256311DSz LIZIZ() {
        if (C1DT0.LJIIIIZZ == null) {
            final C1DT0 c1dt0 = new C1DT0();
            C1DT0.LJIIIIZZ = new Object() { // from class: X.1DSz
                public final void LIZ() {
                    C1DT0.LJIIIIZZ = null;
                    C1DT0 c1dt02 = c1dt0;
                    if (c1dt02.LIZJ == 0 || c1dt02.LIZIZ == 0) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("draft_export_time", String.valueOf(System.currentTimeMillis() - c1dt0.LIZJ));
                    linkedHashMap.put("draft_export_result", String.valueOf(c1dt0.LIZ));
                    linkedHashMap.put("draft_export_layer_count", String.valueOf(c1dt0.LIZIZ));
                    linkedHashMap.put("fullscreen_check_costms", String.valueOf(c1dt0.LJ));
                    linkedHashMap.put("is_fullscreen_check_enable", String.valueOf(c1dt0.LIZLLL));
                    linkedHashMap.put("error_msg", c1dt0.LJFF);
                    linkedHashMap.put("error_code", c1dt0.LJI);
                    linkedHashMap.put(Scene.SCENE_SERVICE, c1dt0.LJII);
                    C00YL c00ylLIZ = C1706400uVS.LIZ();
                    if (c00ylLIZ != null) {
                        c00ylLIZ.LIZ("ame_performance_draft_export", linkedHashMap);
                    }
                }
            };
        }
        return C1DT0.LJIIIIZZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0vH0] */
    public static C1735880vH0 LIZJ() {
        if (C1735890vH1.LJI == null) {
            final C1735890vH1 c1735890vH1 = new C1735890vH1();
            C1735890vH1.LJI = new Object() { // from class: X.0vH0
                public long LIZ;
                public long LIZIZ;
                public Map<String, String> LIZJ;
                public PassThroughParams LIZLLL;

                public final Map<String, String> LIZ() {
                    C1569570qwl c1569570qwlLIZ = C1706510uVd.LIZ();
                    InterfaceC1706710uVx interfaceC1706710uVx = (InterfaceC1706710uVx) (c1569570qwlLIZ != null ? c1569570qwlLIZ.LIZ(InterfaceC1706710uVx.class) : null);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("base_draft_load_result", String.valueOf(c1735890vH1.LIZIZ));
                    linkedHashMap.put("base_draft_version", String.valueOf(interfaceC1706710uVx != null ? interfaceC1706710uVx.LJFF() : -1L));
                    linkedHashMap.put("force_upgrade", String.valueOf(c1735890vH1.LIZLLL));
                    linkedHashMap.put("ensure_draft_resource_time", String.valueOf(c1735890vH1.LJFF));
                    linkedHashMap.put("ensure_draft_resource_result", String.valueOf(c1735890vH1.LJ));
                    linkedHashMap.put("base_draft_load_time", String.valueOf(c1735890vH1.LIZ));
                    PassThroughParams passThroughParams = this.LIZLLL;
                    if (passThroughParams != null) {
                        linkedHashMap.put("ame_enter_from", passThroughParams.ameEnterFrom);
                    }
                    return linkedHashMap;
                }
            };
        }
        return C1735890vH1.LJI;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DSd] */
    public static C2256091DSd LIZLLL() {
        if (C2256101DSe.LIZLLL == null) {
            final C2256101DSe c2256101DSe = new C2256101DSe();
            C2256101DSe.LIZLLL = new Object() { // from class: X.1DSd
                public long LIZ;

                public final void LIZ() {
                    C2256101DSe.LIZLLL = null;
                    if (this.LIZ == 0) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("draft_upgrade_time", String.valueOf(System.currentTimeMillis() - this.LIZ));
                    linkedHashMap.put("draft_upgrade_result", String.valueOf(c2256101DSe.LIZ));
                    linkedHashMap.put("draft_upgrade_from_version", c2256101DSe.LIZIZ);
                    linkedHashMap.put("draft_upgrade_to_version", c2256101DSe.LIZJ);
                    C00YL c00ylLIZ = C1706400uVS.LIZ();
                    if (c00ylLIZ != null) {
                        c00ylLIZ.LIZ("ame_performance_draft_upgrade", linkedHashMap);
                    }
                }
            };
        }
        return C2256101DSe.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DSa] */
    public static C2256061DSa LJ() {
        if (C2256071DSb.LJ == null) {
            final C2256071DSb c2256071DSb = new C2256071DSb();
            C2256071DSb.LJ = new Object() { // from class: X.1DSa
                public final void LIZ() {
                    C2256071DSb.LJ = null;
                    if (c2256071DSb.LIZ == 0.0f) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("fps", String.valueOf(c2256071DSb.LIZ));
                    linkedHashMap.put("object_num", String.valueOf(c2256071DSb.LIZIZ));
                    linkedHashMap.put("sampling_occasion", c2256071DSb.LIZJ);
                    C00YL c00ylLIZ = C1706400uVS.LIZ();
                    if (c00ylLIZ != null) {
                        c00ylLIZ.LIZ("ame_performance_editing_fps", linkedHashMap);
                    }
                }
            };
        }
        return C2256071DSb.LJ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DT6] */
    public static C1DT6 LJFF() {
        if (C2256271DSv.LIZ == null) {
            final C2256271DSv c2256271DSv = new C2256271DSv();
            C2256271DSv.LIZ = new Object() { // from class: X.1DT6
            };
        }
        return C2256271DSv.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1DSy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1DSy] */
    public static C2256301DSy LJI() {
        if (C1DT1.LJII == null) {
            final C1DT1 c1dt1 = new C1DT1();
            C1DT1.LJII = new Object() { // from class: X.1DSy
                public long LIZ;

                public final void LIZ() {
                    C1DT1.LJII = null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("is_success", String.valueOf(c1dt1.LIZ));
                    C1DT1 c1dt12 = c1dt1;
                    if (!c1dt12.LIZ) {
                        linkedHashMap.put("error_code", String.valueOf(c1dt12.LIZIZ));
                        linkedHashMap.put("error_msg", c1dt1.LIZJ);
                    }
                    linkedHashMap.put("cost_ms", String.valueOf(c1dt1.LIZLLL));
                    linkedHashMap.put("video_file_duration_ms", String.valueOf(c1dt1.LJ));
                    linkedHashMap.put("video_file_length_kb", String.valueOf(c1dt1.LJFF));
                    linkedHashMap.put("is_enable_remove_background", String.valueOf(c1dt1.LJI));
                    C00YL c00ylLIZ = C1706400uVS.LIZ();
                    if (c00ylLIZ != null) {
                        c00ylLIZ.LIZ("ame_perf_import_video_result", linkedHashMap);
                    }
                }
            };
        }
        C2256301DSy c2256301DSy = C1DT1.LJII;
        if (c2256301DSy != null) {
            return c2256301DSy;
        }
        final C1DT1 c1dt12 = new C1DT1();
        return new Object() { // from class: X.1DSy
            public long LIZ;

            public final void LIZ() {
                C1DT1.LJII = null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is_success", String.valueOf(c1dt12.LIZ));
                C1DT1 c1dt122 = c1dt12;
                if (!c1dt122.LIZ) {
                    linkedHashMap.put("error_code", String.valueOf(c1dt122.LIZIZ));
                    linkedHashMap.put("error_msg", c1dt12.LIZJ);
                }
                linkedHashMap.put("cost_ms", String.valueOf(c1dt12.LIZLLL));
                linkedHashMap.put("video_file_duration_ms", String.valueOf(c1dt12.LJ));
                linkedHashMap.put("video_file_length_kb", String.valueOf(c1dt12.LJFF));
                linkedHashMap.put("is_enable_remove_background", String.valueOf(c1dt12.LJI));
                C00YL c00ylLIZ = C1706400uVS.LIZ();
                if (c00ylLIZ != null) {
                    c00ylLIZ.LIZ("ame_perf_import_video_result", linkedHashMap);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0uT8] */
    public static C1704960uT8 LJII() {
        C1DT8 c1dt8 = C2256251DSt.LIZJ;
        C1704960uT8 c1704960uT8 = C2256251DSt.LIZLLL;
        if (c1704960uT8 == 0) {
            synchronized (c1dt8) {
                try {
                    C1704960uT8 c1704960uT82 = C2256251DSt.LIZLLL;
                    c1704960uT8 = c1704960uT82;
                    if (c1704960uT82 == null) {
                        final C2256251DSt c2256251DSt = new C2256251DSt();
                        ?? r1 = new Object() { // from class: X.0uT8
                            public final C1701140uMy LIZ = new C1701140uMy();
                            public PassThroughParams LIZIZ;

                            public final void LIZ(C1704970uT9 c1704970uT9, String str) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("collectTaskStatus, key ");
                                sbLIZ.append(str);
                                sbLIZ.append(", status: ");
                                sbLIZ.append(c1704970uT9.LIZ);
                                C1706630uVp.LJFF("AmeLaunchTaskFlowPerformance", C2188811AlT.LIZIZ(sbLIZ));
                                this.LIZ.LIZIZ.put(str, c1704970uT9);
                            }
                        };
                        C2256251DSt.LIZLLL = r1;
                        c1704960uT8 = r1;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1704960uT8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DSg] */
    public static C2256121DSg LJIIIIZZ() {
        if (C2256131DSh.LJIJJ == null) {
            final C2256131DSh c2256131DSh = new C2256131DSh();
            C2256131DSh.LJIJJ = new Object() { // from class: X.1DSg
                public final String LIZ;
                public long LIZIZ;

                /* JADX WARN: Multi-variable type inference failed */
                public final void LIZJ() {
                    String str;
                    if (C2256131DSh.LJIJI || this.LIZIZ <= 0 || c2256131DSh.LJFF.length() == 0 || c2256131DSh.LJ == 0) {
                        String str2 = this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reportEvent invalid. sSessionReport = ");
                        sbLIZ.append(C2256131DSh.LJIJI);
                        sbLIZ.append(", startLauncherTime = ");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(", ameEnterFrom = ");
                        sbLIZ.append(c2256131DSh.LJFF);
                        sbLIZ.append(", launcherRenderEnvTime = ");
                        sbLIZ.append(c2256131DSh.LJ);
                        C1706630uVp.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ));
                        C2256131DSh.LJIJJ = null;
                        return;
                    }
                    C1706630uVp.LIZ(this.LIZ, "reportEvent.");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("is_new_device", String.valueOf(c2256131DSh.LJI));
                    boolean z = C2256131DSh.LJIJ;
                    C2256131DSh.LJIJ = false;
                    linkedHashMap.put("launcher_camera_cold", String.valueOf(z ? 1 : 0));
                    linkedHashMap.put("launcher_camera_result", String.valueOf(c2256131DSh.LIZ));
                    linkedHashMap.put("create_project_code", String.valueOf(c2256131DSh.LIZJ));
                    C2256131DSh c2256131DSh2 = c2256131DSh;
                    boolean z2 = c2256131DSh2.LJIIJ;
                    boolean z3 = c2256131DSh2.LJIIJJI;
                    boolean z4 = c2256131DSh2.LJIIL;
                    String str3 = this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("mainDraftFetchFail = ");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(", mainScriptFetchFail = ");
                    sbLIZ2.append(z3);
                    sbLIZ2.append(", defaultModelFetchFail = ");
                    sbLIZ2.append(z4);
                    C1706630uVp.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
                    if (z2 || z3 || z4) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        if (z2) {
                            if (z3 && z4) {
                                c2256131DSh.LIZIZ = -10003;
                                str = "both_fail";
                            } else {
                                c2256131DSh.LIZIZ = -10001;
                                str = "main_effect_fetch_fail";
                            }
                        } else if (z3) {
                            c2256131DSh.LIZIZ = -10005;
                            str = "main_script_fetch_fail";
                        } else if (z4) {
                            c2256131DSh.LIZIZ = -10002;
                            str = "model_image_fetch_fail";
                        } else {
                            str = "";
                        }
                        linkedHashMap2.put("err_msg", str);
                        C844470XAv.LIZ.getClass();
                        if (!C786920Utu.LIZ(C844470XAv.LIZ())) {
                            c2256131DSh.LIZIZ = -10004;
                        }
                        C00YL c00ylLIZ = C1706400uVS.LIZ();
                        if (c00ylLIZ != null) {
                            c00ylLIZ.LIZ("server_launch_fail", linkedHashMap2);
                        }
                    }
                    linkedHashMap.put("launcher_render_env_result", String.valueOf(c2256131DSh.LIZIZ));
                    linkedHashMap.put("launcher_render_env_time_raw", String.valueOf(c2256131DSh.LJ));
                    C2256131DSh c2256131DSh3 = c2256131DSh;
                    if (c2256131DSh3.LJIILL) {
                        linkedHashMap.put("launcher_camera_time", String.valueOf(c2256131DSh3.LIZLLL));
                        linkedHashMap.put("launcher_render_env_time", String.valueOf(c2256131DSh.LJ));
                    } else {
                        linkedHashMap.put("launcher_camera_time", String.valueOf(c2256131DSh3.LIZLLL));
                        linkedHashMap.put("launcher_render_env_time", String.valueOf(c2256131DSh.LIZLLL));
                    }
                    linkedHashMap.put("no_camera_permission", c2256131DSh.LJII ? "1" : CardStruct.IStatusCode.DEFAULT);
                    linkedHashMap.put("reject_camera_permission", c2256131DSh.LJIIIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    linkedHashMap.put("has_show_loading", c2256131DSh.LJIILL ? "1" : CardStruct.IStatusCode.DEFAULT);
                    linkedHashMap.put("ve_launch_cost_time", String.valueOf(c2256131DSh.LJIILIIL));
                    c2256131DSh.getClass();
                    linkedHashMap.put("ve_sdk_init_cost_time", String.valueOf(0L));
                    linkedHashMap.put("ee_launch_cost_time", String.valueOf(c2256131DSh.LJIILJJIL));
                    linkedHashMap.put("ame_enter_from", c2256131DSh.LJFF);
                    linkedHashMap.put("recovery_type", String.valueOf(c2256131DSh.LJIILLIIL));
                    linkedHashMap.put("load_camera_resource_time", String.valueOf(c2256131DSh.LJIIIIZZ));
                    C00YL c00ylLIZ2 = C1706400uVS.LIZ();
                    if (c00ylLIZ2 != null) {
                        c00ylLIZ2.LIZ("ame_performance_launcher_camera", linkedHashMap);
                    }
                    C2256131DSh.LJIJJ = null;
                    C2256131DSh.LJIJI = true;
                    C786410Ut5.LJIIZILJ(Looper.getMainLooper(), null);
                    C1A8X.LIZ.getClass();
                    InterfaceC1706480uVa interfaceC1706480uVaLIZ = C1A89.LIZ();
                    if (interfaceC1706480uVaLIZ != null) {
                        interfaceC1706480uVaLIZ.isOpen();
                    }
                }

                public final void LIZLLL() {
                    C1706630uVp.LIZ(this.LIZ, "resetValue()");
                    C2256131DSh c2256131DSh2 = c2256131DSh;
                    c2256131DSh2.LJI = 0;
                    c2256131DSh2.LIZ = 1;
                    c2256131DSh2.LIZLLL = 0L;
                    c2256131DSh2.LIZIZ = 1;
                    c2256131DSh2.LJ = 0L;
                    c2256131DSh2.LJFF = "";
                    c2256131DSh2.LJIILL = false;
                    c2256131DSh2.LJIIJ = false;
                    c2256131DSh2.LJIIJJI = false;
                    c2256131DSh2.LJIIL = false;
                    c2256131DSh2.LJIILLIIL = EnumC12950054y.NOT_SET.getValue();
                }

                public final void LIZ() {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
                    String str = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("launcherCameraTime = ");
                    sbLIZ.append(jCurrentTimeMillis);
                    C1706630uVp.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    c2256131DSh.LIZLLL = jCurrentTimeMillis;
                }

                public final void LIZIZ() {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
                    String str = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("launcherRenderEnvTime = ");
                    sbLIZ.append(jCurrentTimeMillis);
                    C1706630uVp.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    c2256131DSh.LJ = jCurrentTimeMillis;
                }

                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LauncherCameraPerformance");
                    int i = C2256131DSh.LJIIZILJ;
                    C2256131DSh.LJIIZILJ = i + 1;
                    sbLIZ.append(i);
                    this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            };
            C1706630uVp.LIZ("LauncherCameraPerformance", "obtain new instance.");
        }
        return C2256131DSh.LJIJJ;
    }

    public static C1706130uV1 LJIIIZ() {
        if (C1706140uV2.LJ == null) {
            C1706140uV2.LJ = new C1706130uV1(new C1706140uV2());
        }
        return C1706140uV2.LJ;
    }

    public static C1706090uUx LJIIJ() {
        C1706090uUx c1706090uUx = C1706050uUt.LJIILIIL;
        if (c1706090uUx != null) {
            return c1706090uUx;
        }
        C1706090uUx c1706090uUx2 = new C1706090uUx(new C1706050uUt());
        C1706050uUt.LJIILIIL = c1706090uUx2;
        return c1706090uUx2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1DT5] */
    public static C1DT5 LJIIJJI() {
        C1DT5 c1dt5 = C2256261DSu.LJIIJ;
        if (c1dt5 != null) {
            return c1dt5;
        }
        final C2256261DSu c2256261DSu = new C2256261DSu();
        ?? r1 = new Object() { // from class: X.1DT5
        };
        C2256261DSu.LJIIJ = r1;
        return r1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1DSx] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1DSx] */
    public static C2256291DSx LJIIL() {
        if (C2256281DSw.LIZLLL == null) {
            final C2256281DSw c2256281DSw = new C2256281DSw();
            C2256281DSw.LIZLLL = new Object() { // from class: X.1DSx
                public final void LIZ() {
                    C2256281DSw.LIZLLL = null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("is_success", String.valueOf(c2256281DSw.LIZ));
                    C2256281DSw c2256281DSw2 = c2256281DSw;
                    if (!c2256281DSw2.LIZ) {
                        linkedHashMap.put("error_code", String.valueOf(c2256281DSw2.LIZIZ));
                        c2256281DSw.getClass();
                        linkedHashMap.put("error_msg", "");
                    }
                    linkedHashMap.put("video_file_duration_ms", String.valueOf(c2256281DSw.LIZJ));
                    C00YL c00ylLIZ = C1706400uVS.LIZ();
                    if (c00ylLIZ != null) {
                        c00ylLIZ.LIZ("ame_perf_remove_background_result", linkedHashMap);
                    }
                }
            };
        }
        C2256291DSx c2256291DSx = C2256281DSw.LIZLLL;
        if (c2256291DSx != null) {
            return c2256291DSx;
        }
        final C2256281DSw c2256281DSw2 = new C2256281DSw();
        return new Object() { // from class: X.1DSx
            public final void LIZ() {
                C2256281DSw.LIZLLL = null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is_success", String.valueOf(c2256281DSw2.LIZ));
                C2256281DSw c2256281DSw22 = c2256281DSw2;
                if (!c2256281DSw22.LIZ) {
                    linkedHashMap.put("error_code", String.valueOf(c2256281DSw22.LIZIZ));
                    c2256281DSw2.getClass();
                    linkedHashMap.put("error_msg", "");
                }
                linkedHashMap.put("video_file_duration_ms", String.valueOf(c2256281DSw2.LIZJ));
                C00YL c00ylLIZ = C1706400uVS.LIZ();
                if (c00ylLIZ != null) {
                    c00ylLIZ.LIZ("ame_perf_remove_background_result", linkedHashMap);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1DT7] */
    public static C1DT7 LJIILIIL() {
        C1DT7 c1dt7 = C1DT4.LJ;
        if (c1dt7 != null) {
            return c1dt7;
        }
        final C1DT4 c1dt4 = new C1DT4();
        ?? r1 = new Object() { // from class: X.1DT7
            public long LIZ;
        };
        C1DT4.LJ = r1;
        return r1;
    }

    public static C1DTG LIZ() {
        return C1DTI.LIZ();
    }
}
