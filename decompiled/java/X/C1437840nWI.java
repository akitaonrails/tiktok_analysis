package X;

import com.ss.android.ugc.aweme.creative.model.AICreateModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nWI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437840nWI {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0LAB] */
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        ?? r2;
        TextStickerModel next;
        String str;
        Iterator<TextStickerModel> it2 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels.iterator();
        while (true) {
            r2 = 0;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getSourceType() == C0F7S.AI_CREATE) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TextStickerModel textStickerModel = next;
        AICreateModel aICreateModel = videoPublishEditModel.creativeModel.aiCreateModel;
        if (aICreateModel != null) {
            r2 = aICreateModel.isText2ImageMode;
        }
        c0lab.LIZ(r2, "is_ai_create");
        AICreateModel aICreateModel2 = videoPublishEditModel.creativeModel.aiCreateModel;
        if (aICreateModel2 != null) {
            c0lab.LIZ(aICreateModel2.inputPrompt.length(), "prompt_length");
            c0lab.LIZ(aICreateModel2.generatedCnt, "ai_generate_cnt");
            c0lab.LIZ(aICreateModel2.samePromptReGenerateCount, "ai_same_prompt_regenerate_cnt");
            c0lab.LIZ(aICreateModel2.selectedImagePos + 1, "ai_pic_pos");
            if (textStickerModel != null) {
                if (Intrinsics.LJFF(textStickerModel.getTextStr(), aICreateModel2.inputPrompt)) {
                    str = "unedited";
                } else {
                    str = "edited";
                }
            } else {
                str = "deleted";
            }
            c0lab.LJ("ai_prompt_edit", str);
            c0lab.LIZ(C1443560nfW.LJIIIZ ? 1 : 0, "from_is_ai_create");
        }
    }

    public static final void LIZIZ(CreativeModel creativeModel, C0LAB c0lab) {
        ArrayList<Integer> arrayList = creativeModel.countDownModel.countDownModes;
        if (arrayList != null) {
            c0lab.LJ("countdown_type_list", arrayList.toString());
        }
        ArrayList<Integer> arrayList2 = creativeModel.countDownModel.recordingLimitList;
        if (arrayList2 != null) {
            c0lab.LJ("recording_limit_list", arrayList2.toString());
        }
        ArrayList<String> arrayList3 = creativeModel.recordData.recordTypeList;
        if (arrayList3 != null) {
            c0lab.LJ("record_type_list", arrayList3.toString());
        }
        String str = creativeModel.commonMobModel.recordResult;
        if (str == null) {
            str = "video";
        }
        c0lab.LJ("record_result", str);
        String str2 = creativeModel.recordFilterModel.recordFilterIds;
        if (str2 != null) {
            c0lab.LJ("shoot_filter_id_list", str2);
        }
        String str3 = creativeModel.recordFilterModel.recordFilterLabels;
        if (str3 != null) {
            c0lab.LJ("shoot_filter_name_list", str3);
        }
        String str4 = creativeModel.recordFilterModel.recordFilterValues;
        if (str4 != null) {
            c0lab.LJ("shoot_filter_value_list", str4);
        }
        String str5 = creativeModel.recordFilterModel.recordFilterDefaultInfos;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        c0lab.LJ("shoot_filter_is_default_list", str5);
        String str7 = creativeModel.recordFilterModel.recordFilterCategoryKeys;
        if (str7 != null) {
            str6 = str7;
        }
        c0lab.LJ("shoot_filter_tab_list", str6);
    }
}
