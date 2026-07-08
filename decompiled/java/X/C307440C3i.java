package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.AICreateImageModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.AICreateModelConfig;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.ImageGenTaskConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307440C3i {
    public static final /* synthetic */ int LIZ = 0;

    public static AICreateModelConfig LIZ(boolean z) {
        n nVarLJIILIIL;
        try {
            if (!z) {
                JSONObject jSONObject = new JSONObject("{\"ai_create_image_model_list\":[{\"gen_tasks\":[{\"image_output_count\":2,\"supported_aspect_ratios\":[\"9:16\",\"3:4\",\"1:1\",\"4:3\",\"16:9\"],\"task_req_key\":\"\",\"task_type\":\"text2image\"},{\"image_max_ref_count\":3,\"image_output_count\":2,\"supported_aspect_ratios\":[\"keep_ratio\",\"9:16\",\"3:4\",\"1:1\",\"4:3\",\"16:9\"],\"task_req_key\":\"\",\"task_type\":\"image2image\"}],\"model_by_own\":true,\"model_display_name\":\"aiCreate_imagemode_fast\",\"model_display_remark\":\"aiCreate_modes_vidfast_desc\",\"model_quota_req_key\":\"\"}],\"ai_create_video_model_list\":[{\"gen_tasks\":[{\"supported_aspect_ratios\":[\"9:16\",\"3:4\",\"1:1\",\"4:3\",\"16:9\"],\"supported_durations\":[5,10],\"task_req_key\":\"\",\"task_type\":\"text2video\"},{\"supported_aspect_ratios\":[\"keep_ratio\"],\"supported_durations\":[5,10],\"task_req_key\":\"\",\"task_type\":\"image2video\"},{\"supported_aspect_ratios\":[\"keep_ratio\"],\"supported_durations\":[5],\"task_req_key\":\"\",\"task_type\":\"fl2video\"}],\"have_audio\":false,\"model_by_own\":true,\"model_display_name\":\"aiCreate_videoMode_fast\",\"model_display_remark\":\"aiCreate_modes_imagefast_desc\",\"model_quota_req_key\":\"\",\"model_tags\":[{\"icon\":\"audio\",\"value\":\"Audio\"},{\"icon\":\"time\",\"value\":\"5s-10s\"}]}]}");
                nVarLJIILIIL = (n) SettingsManager.LIZLLL().LJIIIIZZ("studio_editor_pro_ai_create_model_config", n.class, null);
                if (nVarLJIILIIL == null) {
                    nVarLJIILIIL = GsonProtectorUtils.parse(new p(), C786410Ut5.J3(jSONObject)).LJIILIIL();
                }
            } else {
                JSONObject jSONObject2 = new JSONObject("{\"ai_create_image_model_list\":[{\"gen_tasks\":[{\"image_output_count\":2,\"supported_aspect_ratios\":[\"9:16\",\"3:4\",\"1:1\",\"4:3\",\"16:9\"],\"task_req_key\":\"\",\"task_type\":\"text2image\"},{\"image_max_ref_count\":3,\"image_output_count\":2,\"supported_aspect_ratios\":[\"keep_ratio\",\"9:16\",\"3:4\",\"1:1\",\"4:3\",\"16:9\"],\"task_req_key\":\"\",\"task_type\":\"image2image\"}],\"model_by_own\":true,\"model_display_name\":\"aiCreate_imagemode_fast\",\"model_display_remark\":\"aiCreate_modes_vidfast_desc\",\"model_quota_req_key\":\"\"}],\"ai_create_video_model_list\":[{\"gen_tasks\":[{\"supported_aspect_ratios\":[\"9:16\",\"3:4\",\"1:1\",\"4:3\",\"16:9\"],\"supported_durations\":[5,10],\"task_req_key\":\"\",\"task_type\":\"text2video\"},{\"supported_aspect_ratios\":[\"keep_ratio\"],\"supported_durations\":[5,10],\"task_req_key\":\"\",\"task_type\":\"image2video\"},{\"supported_aspect_ratios\":[\"keep_ratio\"],\"supported_durations\":[5],\"task_req_key\":\"\",\"task_type\":\"fl2video\"}],\"have_audio\":false,\"model_by_own\":true,\"model_display_name\":\"aiCreate_videoMode_fast\",\"model_display_remark\":\"aiCreate_modes_imagefast_desc\",\"model_quota_req_key\":\"\",\"model_tags\":[{\"icon\":\"audio\",\"value\":\"Audio\"},{\"icon\":\"time\",\"value\":\"5s-10s\"}]}]}");
                nVarLJIILIIL = (n) SettingsManager.LIZLLL().LJIIIIZZ("studio_editor_pro_ai_create_model_config_pugc", n.class, null);
                if (nVarLJIILIIL == null) {
                    nVarLJIILIIL = GsonProtectorUtils.parse(new p(), C786410Ut5.J3(jSONObject2)).LJIILIIL();
                }
            }
            return (AICreateModelConfig) new Gson().LIZJ(nVarLJIILIIL, AICreateModelConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static List LIZIZ(boolean z) {
        List<AICreateImageModel> list;
        AICreateImageModel aICreateImageModelLIZ;
        AICreateImageModel next;
        AICreateImageModel next2;
        AICreateImageModel aICreateImageModelLIZ2;
        ImageGenTaskConfig imageGenTaskConfigLIZ;
        ImageGenTaskConfig imageGenTaskConfigLIZ2;
        AICreateModelConfig aICreateModelConfigLIZ = LIZ(z);
        if (aICreateModelConfigLIZ != null && (list = aICreateModelConfigLIZ.imageModelList) != null) {
            Iterator<AICreateImageModel> it2 = list.iterator();
            while (true) {
                aICreateImageModelLIZ = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (!next.modelByOwn) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AICreateImageModel aICreateImageModel = next;
            Iterator<AICreateImageModel> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (next2.modelByOwn) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            AICreateImageModel aICreateImageModel2 = next2;
            ArrayList arrayList = new ArrayList();
            if (aICreateImageModel2 != null) {
                List<ImageGenTaskConfig> list2 = aICreateImageModel2.genTasksConfig;
                if (list2 != null) {
                    for (ImageGenTaskConfig imageGenTaskConfig : list2) {
                        if (Intrinsics.LJFF(imageGenTaskConfig.taskType, "text2image")) {
                            imageGenTaskConfigLIZ2 = ImageGenTaskConfig.LIZ(imageGenTaskConfig, (String) C2506709s1.LIZ.getValue());
                        } else {
                            imageGenTaskConfigLIZ2 = ImageGenTaskConfig.LIZ(imageGenTaskConfig, C2537009wu.LIZ());
                        }
                        arrayList.add(imageGenTaskConfigLIZ2);
                    }
                }
                aICreateImageModelLIZ2 = AICreateImageModel.LIZ(aICreateImageModel2, arrayList, (String) C2506709s1.LIZ.getValue());
            } else {
                aICreateImageModelLIZ2 = null;
            }
            if (C307450C3j.LIZ()) {
                ArrayList arrayList2 = new ArrayList();
                if (aICreateImageModel != null) {
                    List<ImageGenTaskConfig> list3 = aICreateImageModel.genTasksConfig;
                    if (list3 != null) {
                        for (ImageGenTaskConfig imageGenTaskConfig2 : list3) {
                            if (Intrinsics.LJFF(imageGenTaskConfig2.taskType, "text2image")) {
                                imageGenTaskConfigLIZ = ImageGenTaskConfig.LIZ(imageGenTaskConfig2, (String) C2506809s2.LIZ.getValue());
                            } else {
                                imageGenTaskConfigLIZ = ImageGenTaskConfig.LIZ(imageGenTaskConfig2, (String) C2506609s0.LIZ.getValue());
                            }
                            arrayList2.add(imageGenTaskConfigLIZ);
                        }
                    }
                    aICreateImageModelLIZ = AICreateImageModel.LIZ(aICreateImageModel, arrayList2, (String) C2506809s2.LIZ.getValue());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            if (aICreateImageModelLIZ2 != null) {
                arrayList3.add(aICreateImageModelLIZ2);
            }
            if (aICreateImageModelLIZ != null) {
                arrayList3.add(aICreateImageModelLIZ);
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }
}
