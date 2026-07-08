package Y;

import X.C1448130nmt;
import X.C19IH;
import X.C19II;
import X.C1C7U;
import X.C2188811AlT;
import X.C2341909Fp;
import X.C543670LTx;
import X.InterfaceC2342209Fs;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class ACallableS435S0100000_32 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object call$0(ACallableS435S0100000_32 aCallableS435S0100000_32) {
        String str;
        C1C7U.LIZ("TikTokCameraLatencyTracker@fa7b.end$1");
        C19IH c19ih = (C19IH) aCallableS435S0100000_32.l0;
        c19ih.getClass();
        C543670LTx c543670LTx = new C543670LTx();
        for (Map.Entry<String, C19II> entry : c19ih.LIZIZ.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -2066442300:
                    if (key.equals("ve_recorder_init_to_camera_init")) {
                        str = "step12";
                        C19II value = entry.getValue();
                        long j = value.LIZIZ - value.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("_order");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c543670LTx.LIZJ(Long.valueOf(j), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value.LIZJ), strLIZIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Step ");
                        sbLIZ2.append(entry.getKey());
                        sbLIZ2.append(" : Event Step Name ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" : Latency ");
                        sbLIZ2.append(j);
                        sbLIZ2.append(" : Order ");
                        sbLIZ2.append(value.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    break;
                case -1698086861:
                    if (key.equals("ve_audio_encode_settings")) {
                        str = "step6";
                        C19II value2 = entry.getValue();
                        long j2 = value2.LIZIZ - value2.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str);
                        sbLIZ3.append("_order");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        c543670LTx.LIZJ(Long.valueOf(j2), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value2.LIZJ), strLIZIZ2);
                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                        sbLIZ22.append("Step ");
                        sbLIZ22.append(entry.getKey());
                        sbLIZ22.append(" : Event Step Name ");
                        sbLIZ22.append(str);
                        sbLIZ22.append(" : Latency ");
                        sbLIZ22.append(j2);
                        sbLIZ22.append(" : Order ");
                        sbLIZ22.append(value2.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ22);
                    }
                    break;
                case -1654399870:
                    if (key.equals("video_record_activity_create")) {
                        str = "step1";
                        C19II value22 = entry.getValue();
                        long j22 = value22.LIZIZ - value22.LIZ;
                        StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                        sbLIZ32.append(str);
                        sbLIZ32.append("_order");
                        String strLIZIZ22 = C2188811AlT.LIZIZ(sbLIZ32);
                        c543670LTx.LIZJ(Long.valueOf(j22), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value22.LIZJ), strLIZIZ22);
                        StringBuilder sbLIZ222 = C2188811AlT.LIZ();
                        sbLIZ222.append("Step ");
                        sbLIZ222.append(entry.getKey());
                        sbLIZ222.append(" : Event Step Name ");
                        sbLIZ222.append(str);
                        sbLIZ222.append(" : Latency ");
                        sbLIZ222.append(j22);
                        sbLIZ222.append(" : Order ");
                        sbLIZ222.append(value22.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ222);
                    }
                    break;
                case -1561368051:
                    if (key.equals("ve_recorder_create")) {
                        str = "step5";
                        C19II value222 = entry.getValue();
                        long j222 = value222.LIZIZ - value222.LIZ;
                        StringBuilder sbLIZ322 = C2188811AlT.LIZ();
                        sbLIZ322.append(str);
                        sbLIZ322.append("_order");
                        String strLIZIZ222 = C2188811AlT.LIZIZ(sbLIZ322);
                        c543670LTx.LIZJ(Long.valueOf(j222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value222.LIZJ), strLIZIZ222);
                        StringBuilder sbLIZ2222 = C2188811AlT.LIZ();
                        sbLIZ2222.append("Step ");
                        sbLIZ2222.append(entry.getKey());
                        sbLIZ2222.append(" : Event Step Name ");
                        sbLIZ2222.append(str);
                        sbLIZ2222.append(" : Latency ");
                        sbLIZ2222.append(j222);
                        sbLIZ2222.append(" : Order ");
                        sbLIZ2222.append(value222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ2222);
                    }
                    break;
                case -1250439464:
                    if (key.equals("ve_video_encode_settings")) {
                        str = "step7";
                        C19II value2222 = entry.getValue();
                        long j2222 = value2222.LIZIZ - value2222.LIZ;
                        StringBuilder sbLIZ3222 = C2188811AlT.LIZ();
                        sbLIZ3222.append(str);
                        sbLIZ3222.append("_order");
                        String strLIZIZ2222 = C2188811AlT.LIZIZ(sbLIZ3222);
                        c543670LTx.LIZJ(Long.valueOf(j2222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value2222.LIZJ), strLIZIZ2222);
                        StringBuilder sbLIZ22222 = C2188811AlT.LIZ();
                        sbLIZ22222.append("Step ");
                        sbLIZ22222.append(entry.getKey());
                        sbLIZ22222.append(" : Event Step Name ");
                        sbLIZ22222.append(str);
                        sbLIZ22222.append(" : Latency ");
                        sbLIZ22222.append(j2222);
                        sbLIZ22222.append(" : Order ");
                        sbLIZ22222.append(value2222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ22222);
                    }
                    break;
                case -1236532301:
                    if (key.equals("video_record_activity_resume")) {
                        str = "step3";
                        C19II value22222 = entry.getValue();
                        long j22222 = value22222.LIZIZ - value22222.LIZ;
                        StringBuilder sbLIZ32222 = C2188811AlT.LIZ();
                        sbLIZ32222.append(str);
                        sbLIZ32222.append("_order");
                        String strLIZIZ22222 = C2188811AlT.LIZIZ(sbLIZ32222);
                        c543670LTx.LIZJ(Long.valueOf(j22222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value22222.LIZJ), strLIZIZ22222);
                        StringBuilder sbLIZ222222 = C2188811AlT.LIZ();
                        sbLIZ222222.append("Step ");
                        sbLIZ222222.append(entry.getKey());
                        sbLIZ222222.append(" : Event Step Name ");
                        sbLIZ222222.append(str);
                        sbLIZ222222.append(" : Latency ");
                        sbLIZ222222.append(j22222);
                        sbLIZ222222.append(" : Order ");
                        sbLIZ222222.append(value22222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ222222);
                    }
                    break;
                case -1149151301:
                    if (key.equals("first_frame_captured_to_first_frame_render")) {
                        str = "step18";
                        C19II value222222 = entry.getValue();
                        long j222222 = value222222.LIZIZ - value222222.LIZ;
                        StringBuilder sbLIZ322222 = C2188811AlT.LIZ();
                        sbLIZ322222.append(str);
                        sbLIZ322222.append("_order");
                        String strLIZIZ222222 = C2188811AlT.LIZIZ(sbLIZ322222);
                        c543670LTx.LIZJ(Long.valueOf(j222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value222222.LIZJ), strLIZIZ222222);
                        StringBuilder sbLIZ2222222 = C2188811AlT.LIZ();
                        sbLIZ2222222.append("Step ");
                        sbLIZ2222222.append(entry.getKey());
                        sbLIZ2222222.append(" : Event Step Name ");
                        sbLIZ2222222.append(str);
                        sbLIZ2222222.append(" : Latency ");
                        sbLIZ2222222.append(j222222);
                        sbLIZ2222222.append(" : Order ");
                        sbLIZ2222222.append(value222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ2222222);
                    }
                    break;
                case -958317332:
                    if (key.equals("surface_set_to_first_frame_render")) {
                        str = "step15";
                        C19II value2222222 = entry.getValue();
                        long j2222222 = value2222222.LIZIZ - value2222222.LIZ;
                        StringBuilder sbLIZ3222222 = C2188811AlT.LIZ();
                        sbLIZ3222222.append(str);
                        sbLIZ3222222.append("_order");
                        String strLIZIZ2222222 = C2188811AlT.LIZIZ(sbLIZ3222222);
                        c543670LTx.LIZJ(Long.valueOf(j2222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value2222222.LIZJ), strLIZIZ2222222);
                        StringBuilder sbLIZ22222222 = C2188811AlT.LIZ();
                        sbLIZ22222222.append("Step ");
                        sbLIZ22222222.append(entry.getKey());
                        sbLIZ22222222.append(" : Event Step Name ");
                        sbLIZ22222222.append(str);
                        sbLIZ22222222.append(" : Latency ");
                        sbLIZ22222222.append(j2222222);
                        sbLIZ22222222.append(" : Order ");
                        sbLIZ22222222.append(value2222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ22222222);
                    }
                    break;
                case -659590582:
                    if (key.equals("ve_preview_settings")) {
                        str = "step8";
                        C19II value22222222 = entry.getValue();
                        long j22222222 = value22222222.LIZIZ - value22222222.LIZ;
                        StringBuilder sbLIZ32222222 = C2188811AlT.LIZ();
                        sbLIZ32222222.append(str);
                        sbLIZ32222222.append("_order");
                        String strLIZIZ22222222 = C2188811AlT.LIZIZ(sbLIZ32222222);
                        c543670LTx.LIZJ(Long.valueOf(j22222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value22222222.LIZJ), strLIZIZ22222222);
                        StringBuilder sbLIZ222222222 = C2188811AlT.LIZ();
                        sbLIZ222222222.append("Step ");
                        sbLIZ222222222.append(entry.getKey());
                        sbLIZ222222222.append(" : Event Step Name ");
                        sbLIZ222222222.append(str);
                        sbLIZ222222222.append(" : Latency ");
                        sbLIZ222222222.append(j22222222);
                        sbLIZ222222222.append(" : Order ");
                        sbLIZ222222222.append(value22222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ222222222);
                    }
                    break;
                case -38535140:
                    if (key.equals("video_record_activity_start")) {
                        str = "step2";
                        C19II value222222222 = entry.getValue();
                        long j222222222 = value222222222.LIZIZ - value222222222.LIZ;
                        StringBuilder sbLIZ322222222 = C2188811AlT.LIZ();
                        sbLIZ322222222.append(str);
                        sbLIZ322222222.append("_order");
                        String strLIZIZ222222222 = C2188811AlT.LIZIZ(sbLIZ322222222);
                        c543670LTx.LIZJ(Long.valueOf(j222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value222222222.LIZJ), strLIZIZ222222222);
                        StringBuilder sbLIZ2222222222 = C2188811AlT.LIZ();
                        sbLIZ2222222222.append("Step ");
                        sbLIZ2222222222.append(entry.getKey());
                        sbLIZ2222222222.append(" : Event Step Name ");
                        sbLIZ2222222222.append(str);
                        sbLIZ2222222222.append(" : Latency ");
                        sbLIZ2222222222.append(j222222222);
                        sbLIZ2222222222.append(" : Order ");
                        sbLIZ2222222222.append(value222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ2222222222);
                    }
                    break;
                case 840084978:
                    if (key.equals("first_frame_captured_to_surface_created")) {
                        str = "step16";
                        C19II value2222222222 = entry.getValue();
                        long j2222222222 = value2222222222.LIZIZ - value2222222222.LIZ;
                        StringBuilder sbLIZ3222222222 = C2188811AlT.LIZ();
                        sbLIZ3222222222.append(str);
                        sbLIZ3222222222.append("_order");
                        String strLIZIZ2222222222 = C2188811AlT.LIZIZ(sbLIZ3222222222);
                        c543670LTx.LIZJ(Long.valueOf(j2222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value2222222222.LIZJ), strLIZIZ2222222222);
                        StringBuilder sbLIZ22222222222 = C2188811AlT.LIZ();
                        sbLIZ22222222222.append("Step ");
                        sbLIZ22222222222.append(entry.getKey());
                        sbLIZ22222222222.append(" : Event Step Name ");
                        sbLIZ22222222222.append(str);
                        sbLIZ22222222222.append(" : Latency ");
                        sbLIZ22222222222.append(j2222222222);
                        sbLIZ22222222222.append(" : Order ");
                        sbLIZ22222222222.append(value2222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ22222222222);
                    }
                    break;
                case 1045073070:
                    if (key.equals("video_record_bind_components")) {
                        str = "step4";
                        C19II value22222222222 = entry.getValue();
                        long j22222222222 = value22222222222.LIZIZ - value22222222222.LIZ;
                        StringBuilder sbLIZ32222222222 = C2188811AlT.LIZ();
                        sbLIZ32222222222.append(str);
                        sbLIZ32222222222.append("_order");
                        String strLIZIZ22222222222 = C2188811AlT.LIZIZ(sbLIZ32222222222);
                        c543670LTx.LIZJ(Long.valueOf(j22222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value22222222222.LIZJ), strLIZIZ22222222222);
                        StringBuilder sbLIZ222222222222 = C2188811AlT.LIZ();
                        sbLIZ222222222222.append("Step ");
                        sbLIZ222222222222.append(entry.getKey());
                        sbLIZ222222222222.append(" : Event Step Name ");
                        sbLIZ222222222222.append(str);
                        sbLIZ222222222222.append(" : Latency ");
                        sbLIZ222222222222.append(j22222222222);
                        sbLIZ222222222222.append(" : Order ");
                        sbLIZ222222222222.append(value22222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ222222222222);
                    }
                    break;
                case 1057767009:
                    if (key.equals("ve_recorder_init")) {
                        str = "step9";
                        C19II value222222222222 = entry.getValue();
                        long j222222222222 = value222222222222.LIZIZ - value222222222222.LIZ;
                        StringBuilder sbLIZ322222222222 = C2188811AlT.LIZ();
                        sbLIZ322222222222.append(str);
                        sbLIZ322222222222.append("_order");
                        String strLIZIZ222222222222 = C2188811AlT.LIZIZ(sbLIZ322222222222);
                        c543670LTx.LIZJ(Long.valueOf(j222222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value222222222222.LIZJ), strLIZIZ222222222222);
                        StringBuilder sbLIZ2222222222222 = C2188811AlT.LIZ();
                        sbLIZ2222222222222.append("Step ");
                        sbLIZ2222222222222.append(entry.getKey());
                        sbLIZ2222222222222.append(" : Event Step Name ");
                        sbLIZ2222222222222.append(str);
                        sbLIZ2222222222222.append(" : Latency ");
                        sbLIZ2222222222222.append(j222222222222);
                        sbLIZ2222222222222.append(" : Order ");
                        sbLIZ2222222222222.append(value222222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ2222222222222);
                    }
                    break;
                case 1426436948:
                    if (key.equals("first_frame_captured_to_effect_first_frame")) {
                        str = "step17";
                        C19II value2222222222222 = entry.getValue();
                        long j2222222222222 = value2222222222222.LIZIZ - value2222222222222.LIZ;
                        StringBuilder sbLIZ3222222222222 = C2188811AlT.LIZ();
                        sbLIZ3222222222222.append(str);
                        sbLIZ3222222222222.append("_order");
                        String strLIZIZ2222222222222 = C2188811AlT.LIZIZ(sbLIZ3222222222222);
                        c543670LTx.LIZJ(Long.valueOf(j2222222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value2222222222222.LIZJ), strLIZIZ2222222222222);
                        StringBuilder sbLIZ22222222222222 = C2188811AlT.LIZ();
                        sbLIZ22222222222222.append("Step ");
                        sbLIZ22222222222222.append(entry.getKey());
                        sbLIZ22222222222222.append(" : Event Step Name ");
                        sbLIZ22222222222222.append(str);
                        sbLIZ22222222222222.append(" : Latency ");
                        sbLIZ22222222222222.append(j2222222222222);
                        sbLIZ22222222222222.append(" : Order ");
                        sbLIZ22222222222222.append(value2222222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ22222222222222);
                    }
                    break;
                case 1807058126:
                    if (key.equals("surface_create")) {
                        str = "step11";
                        C19II value22222222222222 = entry.getValue();
                        long j22222222222222 = value22222222222222.LIZIZ - value22222222222222.LIZ;
                        StringBuilder sbLIZ32222222222222 = C2188811AlT.LIZ();
                        sbLIZ32222222222222.append(str);
                        sbLIZ32222222222222.append("_order");
                        String strLIZIZ22222222222222 = C2188811AlT.LIZIZ(sbLIZ32222222222222);
                        c543670LTx.LIZJ(Long.valueOf(j22222222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value22222222222222.LIZJ), strLIZIZ22222222222222);
                        StringBuilder sbLIZ222222222222222 = C2188811AlT.LIZ();
                        sbLIZ222222222222222.append("Step ");
                        sbLIZ222222222222222.append(entry.getKey());
                        sbLIZ222222222222222.append(" : Event Step Name ");
                        sbLIZ222222222222222.append(str);
                        sbLIZ222222222222222.append(" : Latency ");
                        sbLIZ222222222222222.append(j22222222222222);
                        sbLIZ222222222222222.append(" : Order ");
                        sbLIZ222222222222222.append(value22222222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ222222222222222);
                    }
                    break;
                case 2058848746:
                    if (key.equals("camera_init")) {
                        str = "step13";
                        C19II value222222222222222 = entry.getValue();
                        long j222222222222222 = value222222222222222.LIZIZ - value222222222222222.LIZ;
                        StringBuilder sbLIZ322222222222222 = C2188811AlT.LIZ();
                        sbLIZ322222222222222.append(str);
                        sbLIZ322222222222222.append("_order");
                        String strLIZIZ222222222222222 = C2188811AlT.LIZIZ(sbLIZ322222222222222);
                        c543670LTx.LIZJ(Long.valueOf(j222222222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value222222222222222.LIZJ), strLIZIZ222222222222222);
                        StringBuilder sbLIZ2222222222222222 = C2188811AlT.LIZ();
                        sbLIZ2222222222222222.append("Step ");
                        sbLIZ2222222222222222.append(entry.getKey());
                        sbLIZ2222222222222222.append(" : Event Step Name ");
                        sbLIZ2222222222222222.append(str);
                        sbLIZ2222222222222222.append(" : Latency ");
                        sbLIZ2222222222222222.append(j222222222222222);
                        sbLIZ2222222222222222.append(" : Order ");
                        sbLIZ2222222222222222.append(value222222222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ2222222222222222);
                    }
                    break;
                case 2059029284:
                    if (key.equals("camera_open")) {
                        str = "step14";
                        C19II value2222222222222222 = entry.getValue();
                        long j2222222222222222 = value2222222222222222.LIZIZ - value2222222222222222.LIZ;
                        StringBuilder sbLIZ3222222222222222 = C2188811AlT.LIZ();
                        sbLIZ3222222222222222.append(str);
                        sbLIZ3222222222222222.append("_order");
                        String strLIZIZ2222222222222222 = C2188811AlT.LIZIZ(sbLIZ3222222222222222);
                        c543670LTx.LIZJ(Long.valueOf(j2222222222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value2222222222222222.LIZJ), strLIZIZ2222222222222222);
                        StringBuilder sbLIZ22222222222222222 = C2188811AlT.LIZ();
                        sbLIZ22222222222222222.append("Step ");
                        sbLIZ22222222222222222.append(entry.getKey());
                        sbLIZ22222222222222222.append(" : Event Step Name ");
                        sbLIZ22222222222222222.append(str);
                        sbLIZ22222222222222222.append(" : Latency ");
                        sbLIZ22222222222222222.append(j2222222222222222);
                        sbLIZ22222222222222222.append(" : Order ");
                        sbLIZ22222222222222222.append(value2222222222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ22222222222222222);
                    }
                    break;
                case 2137600900:
                    if (key.equals("ve_recorder_start_to_surface_create")) {
                        str = "step10";
                        C19II value22222222222222222 = entry.getValue();
                        long j22222222222222222 = value22222222222222222.LIZIZ - value22222222222222222.LIZ;
                        StringBuilder sbLIZ32222222222222222 = C2188811AlT.LIZ();
                        sbLIZ32222222222222222.append(str);
                        sbLIZ32222222222222222.append("_order");
                        String strLIZIZ22222222222222222 = C2188811AlT.LIZIZ(sbLIZ32222222222222222);
                        c543670LTx.LIZJ(Long.valueOf(j22222222222222222), str);
                        c543670LTx.LIZIZ(Integer.valueOf(value22222222222222222.LIZJ), strLIZIZ22222222222222222);
                        StringBuilder sbLIZ222222222222222222 = C2188811AlT.LIZ();
                        sbLIZ222222222222222222.append("Step ");
                        sbLIZ222222222222222222.append(entry.getKey());
                        sbLIZ222222222222222222.append(" : Event Step Name ");
                        sbLIZ222222222222222222.append(str);
                        sbLIZ222222222222222222.append(" : Latency ");
                        sbLIZ222222222222222222.append(j22222222222222222);
                        sbLIZ222222222222222222.append(" : Order ");
                        sbLIZ222222222222222222.append(value22222222222222222.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ222222222222222222);
                    }
                    break;
            }
        }
        c543670LTx.LIZLLL("type", "first_frame_latency");
        String str2 = c19ih.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        c543670LTx.LIZLLL("enter_from", str2);
        c543670LTx.LIZIZ(Integer.valueOf(c19ih.LIZIZ.size()), "totalstep");
        long j3 = c19ih.LJ - c19ih.LIZLLL;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Total time: ");
        sbLIZ4.append(j3);
        C2188811AlT.LIZIZ(sbLIZ4);
        c543670LTx.LIZJ(Long.valueOf(j3), "totaltime");
        boolean z = false;
        if (C1448130nmt.LIZ) {
            C1448130nmt.LIZ = false;
            z = true;
        }
        c543670LTx.LIZ(Boolean.valueOf(z), "cold_start");
        c19ih.LIZIZ.clear();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("tool_performance_operation_cost_time", c543670LTx.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TikTokCameraLatencyTracker@fa7b.end$1");
        return unit;
    }

    public static final Object call$1(ACallableS435S0100000_32 aCallableS435S0100000_32) {
        C1C7U.LIZ("CropActivity@51a9.bindViewById$1$1");
        Pair<String, Integer> pairLLZZZIL = ((CropActivity) aCallableS435S0100000_32.l0).LLZZZIL();
        C1C7U.LIZIZ("CropActivity@51a9.bindViewById$1$1");
        return pairLLZZZIL;
    }

    public ACallableS435S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
