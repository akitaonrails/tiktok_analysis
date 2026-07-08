package X;

import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.creative.model.record.LayoutPlayerType;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860560XpO {
    public static final void LIZ(C0LAB c0lab) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ICreativePerformanceMonitorService iCreativePerformanceMonitorServicePerformanceMonitorService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).performanceMonitorService();
        String batteryPercent = iCreativePerformanceMonitorServicePerformanceMonitorService.getBatteryPercent();
        C860580XpQ c860580XpQ = C860580XpQ.LIZIZ;
        int iIsSavePowerEnable = c860580XpQ.isSavePowerEnable();
        int batteryState = iCreativePerformanceMonitorServicePerformanceMonitorService.getBatteryState();
        linkedHashMap.put("battery_level", batteryPercent);
        if (iIsSavePowerEnable > -1) {
            linkedHashMap.put("battery_low_power", String.valueOf(iIsSavePowerEnable));
        }
        linkedHashMap.put("battery_state", String.valueOf(batteryState));
        HashMap<String, Double> cpuData = c860580XpQ.getCpuData();
        Double d = cpuData.get("proc_cpu_usage");
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue > 0.0d) {
                linkedHashMap.put("cpu_rate", String.valueOf(dDoubleValue));
            }
        }
        Double d2 = cpuData.get("proc_cpu_speed");
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (dDoubleValue2 > 0.0d) {
                linkedHashMap.put("cpu_speed", String.valueOf(dDoubleValue2));
            }
        }
        double dLIZ = C2195408iu.LIZ(false);
        if (dLIZ > 0.0d) {
            linkedHashMap.put("gpu_usage", String.valueOf(dLIZ));
        }
        Map<String, Long> memory = iCreativePerformanceMonitorServicePerformanceMonitorService.getMemory();
        Long l = memory.get("mem_graphics");
        if (l != null) {
            linkedHashMap.put("mem_graphics", String.valueOf(l.longValue()));
        }
        Long l2 = memory.get("mem_java_max");
        if (l2 != null) {
            linkedHashMap.put("mem_java_total", String.valueOf(l2.longValue()));
        }
        Long l3 = memory.get("mem_java_used");
        if (l3 != null) {
            long jLongValue = l3.longValue();
            linkedHashMap.put("mem_java_used", String.valueOf(jLongValue));
            linkedHashMap.put("memory_usage", String.valueOf(jLongValue));
        }
        Long l4 = memory.get("mem_pss_dalvik");
        if (l4 != null) {
            linkedHashMap.put("mem_pss_dalvik", String.valueOf(l4.longValue()));
        }
        Long l5 = memory.get("mem_pss_native");
        if (l5 != null) {
            linkedHashMap.put("mem_pss_native", String.valueOf(l5.longValue()));
        }
        if (l2 != null && C08A4.LIZIZ(l2) && l3 != null && C08A4.LIZIZ(l3)) {
            linkedHashMap.put("memory_rate", String.valueOf(l3.longValue() / l2.longValue()));
            long jLongValue2 = l2.longValue() - l3.longValue();
            linkedHashMap.put("mem_java_free", String.valueOf(jLongValue2));
            linkedHashMap.put("remain_memory", String.valueOf(jLongValue2));
        }
        HashMap<String, String> thermalData = c860580XpQ.getThermalData();
        String str = thermalData.get("thermal");
        if (str != null && C2327809Ae.LJIIIIZZ(str) != null && !Intrinsics.LJFF(str, "-1")) {
            linkedHashMap.put("thermal", str);
        }
        String str2 = thermalData.get("thermal_temp");
        if (str2 != null && C2327809Ae.LJIIIIZZ(str2) != null) {
            linkedHashMap.put("temperature", str2);
        }
        c0lab.LJI(linkedHashMap);
    }

    public static final void LIZIZ(ShortVideoContext shortVideoContext) {
        String str;
        String value;
        String value2;
        Integer numValueOf;
        Integer numValueOf2;
        LayoutPlayerType layoutPlayerType;
        LayoutApplyFrom layoutApplyFrom;
        if (!C861870XrV.LIZ()) {
            return;
        }
        C860570XpP c860570XpP = C860540XpM.LIZ;
        C860570XpP c860570XpP2 = C860540XpM.LIZ;
        c860570XpP2.LIZ = shortVideoContext.getCreationId();
        c860570XpP2.LJFF = shortVideoContext.shootWay;
        c860570XpP2.LJIILIIL = Boolean.valueOf(C1466090oFr.LJII(shortVideoContext.creativeModel.stickerModel));
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        Integer numValueOf3 = null;
        if (cameraLayoutModel != null) {
            str = cameraLayoutModel.layoutMode;
        } else {
            str = null;
        }
        c860570XpP2.LJIILJJIL = str;
        if (cameraLayoutModel != null && (layoutApplyFrom = cameraLayoutModel.layoutApplyFrom) != null) {
            value = layoutApplyFrom.getValue();
        } else {
            value = null;
        }
        c860570XpP2.LJIILL = value;
        CameraLayoutModel cameraLayoutModel2 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel2 != null && (layoutPlayerType = cameraLayoutModel2.layoutPlayerType) != null) {
            value2 = layoutPlayerType.getValue();
        } else {
            value2 = null;
        }
        c860570XpP2.LJIILLIIL = value2;
        CameraLayoutModel cameraLayoutModel3 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel3 != null) {
            numValueOf = Integer.valueOf(C0L5H.LIZLLL(cameraLayoutModel3));
        } else {
            numValueOf = null;
        }
        c860570XpP2.LJIIZILJ = numValueOf;
        CameraLayoutModel cameraLayoutModel4 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel4 != null) {
            numValueOf2 = Integer.valueOf(C0L5H.LJFF(cameraLayoutModel4));
        } else {
            numValueOf2 = null;
        }
        c860570XpP2.LJIJ = numValueOf2;
        CameraLayoutModel cameraLayoutModel5 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel5 != null) {
            numValueOf3 = Integer.valueOf(C0L5H.LIZJ(cameraLayoutModel5));
        }
        c860570XpP2.LJIJI = numValueOf3;
        C860330Xp1 c860330Xp1 = C860340Xp2.LIZ;
        c860330Xp1.LIZ = shortVideoContext.getCreationId();
        c860330Xp1.LJFF = shortVideoContext.shootWay;
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        int iValueOf;
        boolean z;
        int iValueOf2;
        String str;
        LayoutApplyFrom layoutApplyFrom;
        if (!((ToolsBaseInfoConfig) C861870XrV.LIZJ.getValue()).enable) {
            return;
        }
        C860570XpP c860570XpP = C860540XpM.LIZ;
        boolean z2 = true;
        if (videoPublishEditModel != null) {
            c860570XpP.LIZ = videoPublishEditModel.getCreationId();
            if (!C0BWC.LIZ()) {
                c860570XpP.LIZIZ = videoPublishEditModel.getEnterFrom();
            }
            c860570XpP.LIZJ = C1428470nHB.LJIILIIL(videoPublishEditModel);
            c860570XpP.LIZLLL = C1428470nHB.LJIILL(videoPublishEditModel);
            c860570XpP.LJ = Boolean.valueOf(C0CHQ.LIZ().getPublishService().LJJII(videoPublishEditModel));
            c860570XpP.LJFF = videoPublishEditModel.mShootWay;
            if (C577760MlK.LIZ(videoPublishEditModel) != 0) {
                z = true;
            } else {
                z = false;
            }
            c860570XpP.LJII = Boolean.valueOf(z);
            c860570XpP.LJI = videoPublishEditModel.getEditEffectListStr();
            c860570XpP.LJIIJ = videoPublishEditModel.getInfoStickerList();
            c860570XpP.LJIIIZ = videoPublishEditModel.getFilterIds();
            c860570XpP.LJIIJJI = videoPublishEditModel.getStickers();
            c860570XpP.LJIIL = videoPublishEditModel.getMusicId();
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null) {
                iValueOf2 = Integer.valueOf(previewInfo.getPreviewVideoLength());
            } else {
                iValueOf2 = 0;
            }
            c860570XpP.LJIJJLI = iValueOf2;
            c860570XpP.LJIIIIZZ = Boolean.valueOf(C0CHQ.LIZ().getPublishService().LJJJJLL(videoPublishEditModel));
            c860570XpP.LJIILIIL = Boolean.valueOf(C1466090oFr.LJII(videoPublishEditModel.creativeModel.stickerModel));
            if (!C298100BmK.LIZ()) {
                c860570XpP.LJIL = C1428470nHB.LJJIL(videoPublishEditModel);
            }
            Pair<Integer, Integer> pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
            int iIntValue = pairLJJIIZ.getFirst().intValue();
            int iIntValue2 = pairLJJIIZ.getSecond().intValue();
            c860570XpP.LJJ = Integer.valueOf(iIntValue);
            c860570XpP.LJJI = Integer.valueOf(iIntValue2);
            CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
            String value = null;
            if (cameraLayoutModel != null) {
                str = cameraLayoutModel.layoutMode;
            } else {
                str = null;
            }
            c860570XpP.LJIILJJIL = str;
            if (cameraLayoutModel != null && (layoutApplyFrom = cameraLayoutModel.layoutApplyFrom) != null) {
                value = layoutApplyFrom.getValue();
            }
            c860570XpP.LJIILL = value;
        }
        C860330Xp1 c860330Xp1 = C860340Xp2.LIZ;
        if (videoPublishEditModel != null) {
            c860330Xp1.LIZ = videoPublishEditModel.getCreationId();
            c860330Xp1.LIZIZ = videoPublishEditModel.getEnterFrom();
            c860330Xp1.LIZJ = C1428470nHB.LJIILIIL(videoPublishEditModel);
            c860330Xp1.LIZLLL = C1428470nHB.LJIILL(videoPublishEditModel);
            c860330Xp1.LJ = Boolean.valueOf(C0CHQ.LIZ().getPublishService().LJJII(videoPublishEditModel));
            c860330Xp1.LJFF = videoPublishEditModel.mShootWay;
            if (C577760MlK.LIZ(videoPublishEditModel) == 0) {
                z2 = false;
            }
            c860330Xp1.LJII = Boolean.valueOf(z2);
            c860330Xp1.LJI = videoPublishEditModel.getEditEffectListStr();
            c860330Xp1.LJIIJ = videoPublishEditModel.getInfoStickerList();
            c860330Xp1.LJIIIZ = videoPublishEditModel.getFilterIds();
            c860330Xp1.LJIIJJI = videoPublishEditModel.getStickers();
            c860330Xp1.LJIIL = videoPublishEditModel.getMusicId();
            EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo2 != null) {
                iValueOf = Integer.valueOf(previewInfo2.getPreviewVideoLength());
            } else {
                iValueOf = 0;
            }
            c860330Xp1.LJIJJLI = iValueOf;
            c860330Xp1.LJIIIIZZ = Boolean.valueOf(C0CHQ.LIZ().getPublishService().LJJJJLL(videoPublishEditModel));
            if (!C298100BmK.LIZ()) {
                c860330Xp1.LJIL = C1428470nHB.LJJIL(videoPublishEditModel);
            }
            Pair<Integer, Integer> pairLJJIIZ2 = C1416310mxZ.LJJIIZ(videoPublishEditModel);
            int iIntValue3 = pairLJJIIZ2.getFirst().intValue();
            int iIntValue4 = pairLJJIIZ2.getSecond().intValue();
            c860330Xp1.LJJ = Integer.valueOf(iIntValue3);
            c860330Xp1.LJJI = Integer.valueOf(iIntValue4);
        }
    }
}
