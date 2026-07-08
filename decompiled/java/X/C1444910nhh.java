package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VESize;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444910nhh {
    public static final C1444910nhh LIZ = new C1444910nhh();

    public static final void LIZ(ShortVideoContext shortVideoContext, InterfaceC2254001DKc interfaceC2254001DKc, InterfaceC1645720sva interfaceC1645720sva, FaceStickerBean faceStickerBean, String str, Integer num, ComposerBeautyBuriedInfo composerBeautyBuriedInfo, MBeautyStateInfo mBeautyStateInfo, int i, String str2, String str3, long j, VESize vESize, Function2<? super String, ? super Map<String, String>, Unit> function2) {
        String strValueOf;
        String recordVideoResolution;
        String id;
        String recId;
        Object objValueOf;
        String resourceID;
        Long provider;
        Long packageSize;
        Object c098200Yq;
        C0LAB c0lab = new C0LAB();
        long jCurrentTimeMillis = 0;
        if (j > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
        }
        String str4 = "";
        if (faceStickerBean == null) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(faceStickerBean.getSource());
        }
        float fJ5 = interfaceC2254001DKc.J5();
        float fL4 = interfaceC2254001DKc.L4();
        float f = fL4 - fJ5;
        float fU5 = interfaceC2254001DKc.u5(false);
        if (vESize != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(vESize.width);
            sbLIZ.append('*');
            sbLIZ.append(vESize.height);
            recordVideoResolution = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            recordVideoResolution = null;
        }
        float fH5 = interfaceC2254001DKc.H5(false, false);
        int iA5 = interfaceC2254001DKc.A5();
        boolean zBooleanValue = ((Boolean) C273210AnH.LIZ.getValue()).booleanValue();
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_add_device_status_to_preview_record_event_tracking", true, false);
        boolean zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_add_new_preview_average_fps_et", true, false);
        c0lab.LJ("next_action", str2);
        if (faceStickerBean == null || (id = faceStickerBean.getId()) == null) {
            id = "";
        }
        c0lab.LJ("effect_id", id);
        if (faceStickerBean == null || (recId = faceStickerBean.getRecId()) == null) {
            recId = "";
        }
        c0lab.LJ("effect_rec_id", recId);
        if (faceStickerBean == null) {
            objValueOf = "";
        } else {
            objValueOf = Long.valueOf(faceStickerBean.getStickerId());
        }
        c0lab.LIZLLL(objValueOf, "effect_sticker_id");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        if (recordVideoResolution == null) {
            recordVideoResolution = AVSettingsWrapper.getRecordVideoResolution();
        }
        c0lab.LJ("resolution", recordVideoResolution);
        c0lab.LJ("camera", C580270MpN.LJIIIIZZ(String.valueOf(i)));
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LIZJ(Float.valueOf(fJ5), "fps");
        c0lab.LIZJ(Float.valueOf(fL4), "camera_fps");
        c0lab.LIZJ(Float.valueOf(f), "drop_fps");
        c0lab.LIZJ(Float.valueOf(fU5), "average_camera_fps");
        c0lab.LIZ(iA5, "camera_fps_update_count");
        if (zBooleanValue) {
            c0lab.LIZ(interfaceC2254001DKc.Y4(), "camera_fps_lower_count");
            c0lab.LIZ(interfaceC2254001DKc.g5(), "camera_fps_restore_count");
            c0lab.LIZ(interfaceC2254001DKc.v5(), "camera_fps_eligible_count");
        }
        c0lab.LIZJ(Float.valueOf(interfaceC2254001DKc.J4(false)), "average_exposure_time");
        c0lab.LIZJ(Float.valueOf(interfaceC2254001DKc.M4(false)), "average_iso");
        c0lab.LIZJ(Float.valueOf(fH5), "average_render_fps");
        c0lab.LIZ(interfaceC2254001DKc.W4(false), "lag_count");
        c0lab.LIZ(interfaceC2254001DKc.c5(), "lag_max");
        c0lab.LIZ(interfaceC2254001DKc.y5(false), "lag_total_duration");
        c0lab.LIZ(interfaceC2254001DKc.C5(false), "serious_lag_count");
        c0lab.LIZ(interfaceC2254001DKc.E5(false), "serious_lag_duration");
        c0lab.LIZLLL(num, "beautify_used");
        c0lab.LIZ(1, "is_composer");
        if (C294160Bfy.LIZ()) {
            c0lab.LJ("beautify_info", C1409940mnI.LJ(composerBeautyBuriedInfo));
            c0lab.LIZ(C1409940mnI.LIZJ(composerBeautyBuriedInfo, mBeautyStateInfo), "beauty_status");
        }
        if (faceStickerBean == null || (resourceID = faceStickerBean.getResourceID()) == null) {
            resourceID = "";
        }
        c0lab.LJ("resource_id", resourceID);
        c0lab.LJ("music_id", str3);
        c0lab.LIZJ(Float.valueOf(interfaceC2254001DKc.d5()), "n_camera_frame_interval");
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        c0lab.LJ("effect_source", strValueOf);
        if (faceStickerBean != null) {
            provider = faceStickerBean.getProvider();
        } else {
            provider = null;
        }
        c0lab.LIZLLL(provider, "provider");
        if (faceStickerBean != null) {
            packageSize = faceStickerBean.getPackageSize();
        } else {
            packageSize = null;
        }
        c0lab.LIZLLL(packageSize, "package_size");
        c0lab.LIZJ(Float.valueOf(BrightnessManager.LIZLLL()), "brightness");
        c0lab.LIZJ(Float.valueOf(ToolsBaseLightSensorUtils.INSTANCE.getCurrentLightLevel()), "light_sensor_level");
        if (zLJIIIZ2) {
            c0lab.LIZ(interfaceC2254001DKc.G5(), "effect_switch_count");
            c0lab.LIZJ(Float.valueOf(interfaceC2254001DKc.H5(false, true)), "average_render_fps_new");
            c0lab.LIZ(interfaceC2254001DKc.W4(true), "lag_count_new");
            c0lab.LIZ(interfaceC2254001DKc.y5(true), "lag_total_duration_new");
            c0lab.LIZ(interfaceC2254001DKc.C5(true), "serious_lag_count_new");
            c0lab.LIZ(interfaceC2254001DKc.E5(true), "serious_lag_duration_new");
        }
        if (str == null) {
            c0lab.LJ("filter_id", "");
        } else {
            LIZ.getClass();
            c0lab.LJ("filter_id", str);
        }
        C21142717oX.LIZIZ(c0lab, !zLJIIIZ);
        C1413430msv.LIZJ(c0lab, interfaceC1645720sva);
        C0LDJ.LIZ.getClass();
        C0LDJ.LIZ(c0lab, shortVideoContext);
        if (zLJIIIZ) {
            C860560XpO.LIZ(c0lab);
        }
        c0lab.LIZ(shortVideoContext.creativeModel.recordDowngradeModel.downgradeLevels, "resolution_downgrade_levels");
        c0lab.LIZ(shortVideoContext.creativeModel.recordDowngradeModel.downgradeInputFlags, "downgrade_input_flags");
        String str5 = shortVideoContext.creativeModel.recordDowngradeModel.resolution;
        if (str5 != null) {
            str4 = str5;
        }
        c0lab.LJ("downgraded_resolution", str4);
        LIZ.getClass();
        VEConfigCenter vEConfigCenter = VEConfigCenter.getInstance();
        if (vEConfigCenter != null) {
            Boolean value = vEConfigCenter.getValue("ve_enable_frame_perf_tracker", false);
            int value2 = vEConfigCenter.getValue("ve_frame_perf_tracker_report_mode", 0);
            if (value.booleanValue() && value2 != 0) {
                try {
                    c098200Yq = interfaceC2254001DKc.T4();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str6 = (String) c098200Yq;
                if (str6 != null && !a0.LJJJIL(str6) && !Intrinsics.LJFF(str6, "{}")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            c0lab.LJ(next, jSONObject.optString(next));
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
            }
        }
        function2.invoke("tool_performance_video_preview", c0lab.LIZ);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().recordSingleValuePerfLog("tool_performance_video_preview", new AwS566S0100000_22(interfaceC2254001DKc, 1071));
        if (C1DS1.LIZJ && fH5 > 0.0f && fH5 < ((Number) C1DS1.LJIILL.getValue()).floatValue()) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.IC, EnumC804170Vgd.IC_JANK, null, 0L, 28));
        }
    }
}
