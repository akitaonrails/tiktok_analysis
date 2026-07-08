package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenAlgoModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPerfModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.ss.android.ugc.tools.data.ImageItem;
import com.ss.android.ugc.tools.data.MediaPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18UP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18UP {
    public static final C18UP LIZ = new C18UP();
    public static final ConcurrentHashSet<String> LIZIZ = new ConcurrentHashSet<>();
    public static Long LIZJ;

    public static int LJ() {
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        return (iAiChatFeatureService == null || (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) == null || !interfaceC21291818UaLIZLLL.LIZIZ()) ? 0 : 1;
    }

    public static String LIZLLL(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            EnumC1778830wOH enumC1778830wOH = ((C21295818Vo) obj).LJII;
            if (enumC1778830wOH != EnumC1778830wOH.VIDEO_COVER && enumC1778830wOH != EnumC1778830wOH.IMAGE_COLLECTION) {
                arrayList.add(obj);
            }
        }
        return String.valueOf(arrayList.size());
    }

    public static void LIZ(C0LAB c0lab, C18UJ c18uj) {
        AIChatTrackingConfig aIChatTrackingConfig;
        Integer num;
        String str;
        AIChatGenChatRoomModel aIChatGenChatRoomModel = c18uj.LJ.chatRoomModel;
        if (aIChatGenChatRoomModel != null) {
            c0lab.LJ("shoot_way", aIChatGenChatRoomModel.shootWay);
            c0lab.LJ("shoot_enter_method", aIChatGenChatRoomModel.enterMethod);
            c0lab.LIZ(aIChatGenChatRoomModel.quota, "vp_process_cnt");
            Boolean bool = aIChatGenChatRoomModel.isNewUser;
            if (bool != null) {
                if (bool.booleanValue()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_vp_new_user", str);
            }
        }
        AIChatPageConfig aIChatPageConfig = c18uj.LJI;
        if (aIChatPageConfig != null && (aIChatTrackingConfig = aIChatPageConfig.tracking) != null && (num = aIChatTrackingConfig.awemeType) != null) {
            c0lab.LJ("aweme_type", String.valueOf(num.intValue()));
        }
    }

    public static void LIZIZ(C0LAB c0lab, AIChatGenNode aIChatGenNode) {
        String promptType;
        int i;
        String imageConvertDuration;
        String outputModerationDuration;
        String inputModerationDuration;
        String serverGenerateDurationS;
        String serverIntentionDurationS;
        String serverDurationS;
        String generateModel;
        String intentionModel;
        String vpModel;
        if (aIChatGenNode != null) {
            String taskId = aIChatGenNode.getTaskId();
            if (taskId != null) {
                c0lab.LJ("vp_task_id", taskId);
            }
            String taskType = aIChatGenNode.getTaskType();
            if (taskType != null) {
                c0lab.LJ("task_type", taskType);
            }
            AIChatGenPrompt prompt = aIChatGenNode.getPrompt();
            if (prompt != null) {
                promptType = prompt.getPromptType();
            } else {
                promptType = null;
            }
            c0lab.LJ("vp_prompt_type", promptType);
            Integer contextOriginImageCount = aIChatGenNode.getContextOriginImageCount();
            if (contextOriginImageCount != null) {
                c0lab.LJ("pic_cnt", String.valueOf(contextOriginImageCount.intValue()));
            }
            AIChatGenAlgoModel modelInfo = aIChatGenNode.getModelInfo();
            if (modelInfo != null && (vpModel = modelInfo.getVpModel()) != null) {
                c0lab.LJ("vp_model", vpModel);
            }
            AIChatGenAlgoModel modelInfo2 = aIChatGenNode.getModelInfo();
            if (modelInfo2 != null && (intentionModel = modelInfo2.getIntentionModel()) != null) {
                c0lab.LJ("intention_model", intentionModel);
            }
            AIChatGenAlgoModel modelInfo3 = aIChatGenNode.getModelInfo();
            if (modelInfo3 != null && (generateModel = modelInfo3.getGenerateModel()) != null) {
                c0lab.LJ("generate_model", generateModel);
            }
            AIChatGenPerfModel perfInfo = aIChatGenNode.getPerfInfo();
            if (perfInfo != null && (serverDurationS = perfInfo.getServerDurationS()) != null) {
                c0lab.LJ("server_generate_duration", serverDurationS);
            }
            AIChatGenPerfModel perfInfo2 = aIChatGenNode.getPerfInfo();
            if (perfInfo2 != null && (serverIntentionDurationS = perfInfo2.getServerIntentionDurationS()) != null) {
                c0lab.LJ("intention_duration", serverIntentionDurationS);
            }
            AIChatGenPerfModel perfInfo3 = aIChatGenNode.getPerfInfo();
            if (perfInfo3 != null && (serverGenerateDurationS = perfInfo3.getServerGenerateDurationS()) != null) {
                c0lab.LJ("model_generate_duration", serverGenerateDurationS);
            }
            AIChatGenPerfModel perfInfo4 = aIChatGenNode.getPerfInfo();
            if (perfInfo4 != null && (inputModerationDuration = perfInfo4.getInputModerationDuration()) != null) {
                c0lab.LJ("input_moderation_duration", inputModerationDuration);
            }
            AIChatGenPerfModel perfInfo5 = aIChatGenNode.getPerfInfo();
            if (perfInfo5 != null && (outputModerationDuration = perfInfo5.getOutputModerationDuration()) != null) {
                c0lab.LJ("output_moderation_duration", outputModerationDuration);
            }
            AIChatGenPerfModel perfInfo6 = aIChatGenNode.getPerfInfo();
            if (perfInfo6 != null && (imageConvertDuration = perfInfo6.getImageConvertDuration()) != null) {
                c0lab.LJ("image_convert_duration", imageConvertDuration);
            }
            String contextPreloadImageSource = aIChatGenNode.getContextPreloadImageSource();
            if (contextPreloadImageSource != null) {
                c0lab.LJ("preload_image_status", contextPreloadImageSource);
            }
            Integer contextUserUploadImageCount = aIChatGenNode.getContextUserUploadImageCount();
            if (contextUserUploadImageCount != null) {
                c0lab.LJ("upload_image_status", String.valueOf(contextUserUploadImageCount.intValue()));
            }
            String clientMessageId = aIChatGenNode.getClientMessageId();
            if (clientMessageId != null) {
                c0lab.LIZLLL(Integer.valueOf(C18TJ.LIZIZ.contains(clientMessageId) ? 1 : 0), "is_vp_generate_result_show");
            }
            String vpCreationId = aIChatGenNode.getVpCreationId();
            if (vpCreationId != null) {
                if (!Intrinsics.LJFF(vpCreationId, C18TJ.LIZ)) {
                    i = 1;
                } else {
                    i = 0;
                }
                c0lab.LIZLLL(i, "is_history_photo");
            }
        }
    }

    public static String LIZJ(C21288318Sr c21288318Sr, C18UJ c18uj) {
        String str;
        C21295818Vo next;
        MediaPayload mediaPayload;
        MediaPayload.VideoCover videoCover;
        MediaPayload.ImageCollection imageCollection;
        List<ImageItem> list;
        ImageItem imageItem;
        AIChatPayload aIChatPayload;
        List<MediaPayload> list2;
        MediaPayload next2;
        Iterator<C21295818Vo> it2 = c21288318Sr.LIZIZ.iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                next = it2.next();
                EnumC1778830wOH enumC1778830wOH = next.LJII;
                if (enumC1778830wOH == EnumC1778830wOH.VIDEO_COVER || enumC1778830wOH == EnumC1778830wOH.IMAGE_COLLECTION) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C21295818Vo c21295818Vo = next;
        AIChatPageConfig aIChatPageConfig = c18uj.LJI;
        if (aIChatPageConfig != null && (aIChatPayload = aIChatPageConfig.payload) != null && (list2 = aIChatPayload.medias) != null) {
            Iterator<MediaPayload> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if ((next2 instanceof MediaPayload.VideoCover) || (next2 instanceof MediaPayload.ImageCollection)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            mediaPayload = next2;
        } else {
            mediaPayload = null;
        }
        if (c21295818Vo == null) {
            if (mediaPayload == null) {
                return "";
            }
            return "delete";
        }
        if (c21295818Vo.LJII == EnumC1778830wOH.IMAGE_COLLECTION) {
            if ((mediaPayload instanceof MediaPayload.ImageCollection) && (imageCollection = (MediaPayload.ImageCollection) mediaPayload) != null && (list = imageCollection.images) != null && (imageItem = (ImageItem) ListProtector.get(list, imageCollection.coverIndex)) != null) {
                str = imageItem.url;
            }
            if (Intrinsics.LJFF(c21295818Vo.LIZIZ, str)) {
                return "default";
            }
            return "change_picture";
        }
        if ((mediaPayload instanceof MediaPayload.VideoCover) && (videoCover = (MediaPayload.VideoCover) mediaPayload) != null) {
            str = videoCover.coverUrl;
        }
        if (Intrinsics.LJFF(c21295818Vo.LIZIZ, str)) {
            return "default";
        }
        return "capture_frame";
    }

    public static void LJIILJJIL(CreationChatRoomEnterParams creationChatRoomEnterParams, String str) {
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            String str2 = creationChatRoomEnterParams.creationId;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = creationChatRoomEnterParams.shootWay;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = creationChatRoomEnterParams.enterFrom;
            if (str5 == null) {
                str5 = "";
            }
            C1449410nox c1449410nox = new C1449410nox(str2, str4, str5, null, null, null, null, null, 248);
            Pair[] pairArr = new Pair[3];
            String str6 = creationChatRoomEnterParams.enterMethod;
            if (str6 != null) {
                str3 = str6;
            }
            pairArr[0] = new Pair("enter_method", str3);
            pairArr[1] = new Pair("is_visual_poet", "1");
            C1727006pY.LIZ.getClass();
            pairArr[2] = new Pair("vp_process_cnt", String.valueOf(C1727006pY.LIZIZ()));
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (str != null) {
                mapLJIIJ.put("vp_prompt_type", str);
            }
            iRecordMobService.LIZLLL(c1449410nox, mapLJIIJ);
        }
    }

    public static void LJIIIZ(AIChatGenModel aIChatGenModel, AIChatTrackingConfig aIChatTrackingConfig, String str) {
        AIChatGenChatRoomModel aIChatGenChatRoomModel;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("ai_function_type", "visual_poet");
        c0lab.LJ("event_element", str);
        if (aIChatGenModel != null && (aIChatGenChatRoomModel = aIChatGenModel.chatRoomModel) != null) {
            c0lab.LJ("shoot_way", aIChatGenChatRoomModel.shootWay);
            c0lab.LJ("shoot_enter_method", aIChatGenChatRoomModel.enterMethod);
            c0lab.LJ("creation_id", aIChatGenChatRoomModel.creationId);
        }
        if (aIChatTrackingConfig != null) {
            Integer num = aIChatTrackingConfig.awemeType;
            if (num != null) {
                c0lab.LJ("aweme_type", String.valueOf(num.intValue()));
            }
            String str2 = aIChatTrackingConfig.sessionId;
            if (str2 != null) {
                c0lab.LJ("session_id", str2);
            }
        }
        C20684815ws.LJIILLIIL("ttcrt_ai_function_auth_popup_click", c0lab.LIZ);
    }

    public static void LJIILIIL(AIChatGenNode aIChatGenNode, C18UJ c18uj, String str) {
        AIChatTrackingConfig aIChatTrackingConfig;
        Integer num;
        String promptType;
        C0LAB c0lab = new C0LAB();
        AIChatGenChatRoomModel aIChatGenChatRoomModel = c18uj.LJ.chatRoomModel;
        if (aIChatGenChatRoomModel != null) {
            c0lab.LJ("shoot_way", aIChatGenChatRoomModel.shootWay);
            c0lab.LJ("shoot_enter_method", aIChatGenChatRoomModel.enterMethod);
        }
        if (aIChatGenNode != null) {
            AIChatGenPrompt prompt = aIChatGenNode.getPrompt();
            if (prompt != null) {
                promptType = prompt.getPromptType();
            } else {
                promptType = null;
            }
            c0lab.LJ("vp_prompt_type", promptType);
            String contextPreloadImageSource = aIChatGenNode.getContextPreloadImageSource();
            if (contextPreloadImageSource != null) {
                c0lab.LJ("preload_image_status", contextPreloadImageSource);
            }
            Integer contextUserUploadImageCount = aIChatGenNode.getContextUserUploadImageCount();
            if (contextUserUploadImageCount != null) {
                c0lab.LJ("upload_image_status", String.valueOf(contextUserUploadImageCount.intValue()));
            }
        }
        AIChatPageConfig aIChatPageConfig = c18uj.LJI;
        if (aIChatPageConfig != null && (aIChatTrackingConfig = aIChatPageConfig.tracking) != null && (num = aIChatTrackingConfig.awemeType) != null) {
            c0lab.LJ("aweme_type", String.valueOf(num.intValue()));
        }
        c0lab.LJ("event_element", str);
        C20684815ws.LJIILLIIL("ttcrt_vp_retention_popup_click", c0lab.LIZ);
    }

    public static void LJFF(C18UJ c18uj, boolean z, String str, AIChatGenNode aIChatGenNode) {
        String str2;
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab, c18uj);
        c0lab.LJ("action_type", str);
        if (z) {
            str2 = "user";
        } else {
            str2 = "bot";
        }
        c0lab.LJ("message_type", str2);
        if (aIChatGenNode != null) {
            String contextPreloadImageSource = aIChatGenNode.getContextPreloadImageSource();
            if (contextPreloadImageSource != null) {
                c0lab.LJ("preload_image_status", contextPreloadImageSource);
            }
            Integer contextUserUploadImageCount = aIChatGenNode.getContextUserUploadImageCount();
            if (contextUserUploadImageCount != null) {
                c0lab.LJ("upload_image_status", String.valueOf(contextUserUploadImageCount.intValue()));
            }
        }
        C20684815ws.LJIILLIIL("vp_generate_action", c0lab.LIZ);
    }

    public static void LJI(long j, AIChatGenNode aIChatGenNode, C18UJ c18uj, String str) {
        Long l = LIZJ;
        if (l != null) {
            j = l.longValue();
        }
        C18U8.LIZ.getClass();
        long jLIZ = C18U8.LIZ() - j;
        LIZJ = null;
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab, c18uj);
        LIZIZ(c0lab, aIChatGenNode);
        c0lab.LIZIZ(jLIZ, "cancel_duration");
        if (str.length() == 0) {
            str = "default";
        }
        c0lab.LJ("event_element", str);
        C20684815ws.LJIILLIIL("vp_generate_cancel", c0lab.LIZ);
    }

    public static void LJII(C18UJ c18uj, String str, String str2, AIChatGenNode aIChatGenNode) {
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab, c18uj);
        c0lab.LJ("function", str);
        c0lab.LJ("vp_enter_from", str2);
        LIZIZ(c0lab, aIChatGenNode);
        C20684815ws.LJIILLIIL("vp_generate_function_select", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C18UJ r17, com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, X.C0NCT r22, java.lang.Boolean r23, java.lang.Long r24) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18UP.LJIIIIZZ(X.18UJ, com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode, java.lang.Long, java.lang.String, java.lang.String, X.0NCT, java.lang.Boolean, java.lang.Long):void");
    }

    public static void LJIIJJI(C18UJ c18uj, String str, int i, String str2, boolean z, String str3, String str4, String str5) {
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab, c18uj);
        c0lab.LJ("vp_prompt_type", str);
        c0lab.LJ("pic_cnt", String.valueOf(i));
        c0lab.LJ("send_result", str2);
        c0lab.LJFF("is_retry", z);
        if (str3 != null) {
            c0lab.LJ("preload_image_status", str3);
        }
        if (str4 != null) {
            c0lab.LJ("upload_image_status", str4);
        }
        c0lab.LIZ(LJ(), "vp_auth_status");
        C20684815ws.LJIILLIIL("vp_prompt_send_start", c0lab.LIZ);
        if (C255970A1j.LIZ() && Intrinsics.LJFF(str2, "success")) {
            if (str5 == null) {
                str5 = UUID.randomUUID().toString();
            }
            C0CTD c0ctd = C0CTD.LIZ;
            C0CTD.LIZIZ(str5, "vp_prompt_send_start", C0D8I.INFO, C2097608Jq.LJIIIIZZ(new Pair("client_task_id", str5), new Pair("pic_cnt", String.valueOf(i)), new Pair("is_retry", String.valueOf(z)), new Pair("time", String.valueOf(System.currentTimeMillis()))));
        }
    }

    public static void LJIIJ(C18UJ c18uj, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, Long l3, Long l4, Long l5) {
        C0D8I c0d8i;
        String string = str6;
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab, c18uj);
        c0lab.LJ("vp_prompt_type", str);
        c0lab.LJ("pic_cnt", String.valueOf(i));
        c0lab.LJ("error_code", str3);
        if (str4 != null) {
            c0lab.LJ("preload_image_status", str4);
        }
        if (str5 != null) {
            c0lab.LJ("upload_image_status", str5);
        }
        if (str2 != null) {
            c0lab.LJ("fail_stage", str2);
        }
        if (l != null) {
            c0lab.LIZIZ(l.longValue(), "total_send_duration");
        }
        if (l2 != null) {
            c0lab.LIZIZ(l2.longValue(), "save_db_duration");
        }
        if (l3 != null) {
            c0lab.LIZIZ(l3.longValue(), "image_upload_duration");
        }
        if (l4 != null) {
            c0lab.LIZIZ(l4.longValue(), "sdk_send_duration");
        }
        if (l5 != null) {
            c0lab.LIZIZ(l5.longValue(), "params2message_duration");
        }
        C20684815ws.LJIILLIIL("vp_prompt_send_result", c0lab.LIZ);
        if (C255970A1j.LIZ()) {
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            if (z) {
                c0d8i = C0D8I.INFO;
            } else {
                c0d8i = C0D8I.ERROR;
            }
            C0CTD c0ctd = C0CTD.LIZ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("client_task_id", string), new Pair("pic_cnt", String.valueOf(i)), new Pair("time", String.valueOf(System.currentTimeMillis())), new Pair("error_code", str3));
            if (str2 != null) {
                mapLJIIJ.put("fail_stage", str2);
            }
            if (l != null) {
                mapLJIIJ.put("total_send_duration", String.valueOf(l.longValue()));
            }
            if (l2 != null) {
                mapLJIIJ.put("save_db_duration", String.valueOf(l2.longValue()));
            }
            if (l3 != null) {
                mapLJIIJ.put("image_upload_duration", String.valueOf(l3.longValue()));
            }
            if (l4 != null) {
                mapLJIIJ.put("sdk_send_duration", String.valueOf(l4.longValue()));
            }
            if (l5 != null) {
                mapLJIIJ.put("params2message_duration", String.valueOf(l5.longValue()));
            }
            C0CTD.LIZIZ(string, "vp_prompt_send_result", c0d8i, mapLJIIJ);
        }
    }
}
