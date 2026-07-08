package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0McQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572240McQ {
    public static final C572240McQ LIZ = new C572240McQ();
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static int LJFF;
    public static boolean LJI;

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        String str = videoPublishEditModel.creativeModel.text2ImageModel.text;
        if (str != null) {
            numValueOf = Integer.valueOf(str.length());
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "text_length");
        c0lab.LJ("text_description", videoPublishEditModel.creativeModel.text2ImageModel.text);
        c0lab.LIZ(1, "is_text_mode");
        c0lab.LIZ(1, "is_text_trans_pic");
        c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModel));
        C20684815ws.LJIILLIIL("back_text_edit_page", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572240McQ.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String):void");
    }

    public static void LIZIZ(long j, VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("content_type", "multi_photo");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModel));
        c0lab.LIZIZ(C572250McR.LJ(videoPublishEditModel.creativeModel.text2ImageModel), "ai_generated_image_style");
        if (z) {
            c0lab.LIZIZ(j, "time_diff_from_success_to_regen");
        } else {
            c0lab.LIZIZ(j, "time_diff_from_fail_to_regen");
            TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(videoPublishEditModel.creativeModel.text2ImageModel);
            String failReason = null;
            if (textImageTaskInfoLIZJ != null) {
                failReason = textImageTaskInfoLIZJ.getFailReason();
            }
            if (!C123100dR.LIZ(failReason) || failReason == null) {
                failReason = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("fail_reason", failReason);
        }
        TextImageTaskInfo textImageTaskInfoLIZJ2 = C572250McR.LIZJ(videoPublishEditModel.creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ2 != null) {
            c0lab.LIZLLL(textImageTaskInfoLIZJ2.getGenCount(), "ai_generate_count_same");
        }
        if (z) {
            str = "ai_temp_gen_success_click_regen";
        } else {
            str = "ai_temp_gen_fail_click_regen";
        }
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, long j) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("content_type", "multi_photo");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModel));
        c0lab.LJ("guide_operation_action", str);
        c0lab.LIZIZ(j, "guide_exposure_to_operation_duration");
        C20684815ws.LJIILLIIL("click_text2img_new_user_guide_entrance", c0lab.LIZ);
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String type;
        Object objValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(1, "is_text_mode");
        c0lab.LIZ(1, "is_text_trans_pic");
        c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModel));
        c0lab.LJ("event_element", str);
        c0lab.LJ("action_position", str2);
        TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(videoPublishEditModel.creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ != null) {
            type = textImageTaskInfoLIZJ.getType();
        } else {
            type = null;
        }
        boolean zLJFF = Intrinsics.LJFF(type, C0LIV.AI.getType());
        c0lab.LIZ(zLJFF ? 1 : 0, "is_ai_text_mode");
        if (zLJFF) {
            objValueOf = Long.valueOf(C572250McR.LJ(videoPublishEditModel.creativeModel.text2ImageModel));
        } else {
            objValueOf = "";
        }
        c0lab.LIZLLL(objValueOf, "ai_generated_image_style");
        C20684815ws.LJIILLIIL("ttinter_text_style_edit_page_function_click", c0lab.LIZ);
    }

    public static final void LJI(VideoPublishEditModel videoPublishEditModel, Bundle bundle, String str) {
        long jCurrentTimeMillis;
        if (LIZIZ > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        } else {
            jCurrentTimeMillis = 0;
        }
        C0LAB c0lab = new C0LAB();
        String enterFrom = videoPublishEditModel.getEnterFrom();
        if (enterFrom == null) {
            if (bundle != null) {
                enterFrom = bundle.getString("enter_from");
            } else {
                enterFrom = null;
            }
        }
        c0lab.LJ("enter_from", enterFrom);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(1, "is_text_mode");
        c0lab.LIZ(1, "is_text_trans_pic");
        C572310McX.LJFF(videoPublishEditModel, c0lab);
        c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModel));
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.text2ImageModel.fromCommentId)) {
            c0lab.LJ("cmt_to_post_entrance", C572310McX.LJI(videoPublishEditModel));
            c0lab.LJ("comment_id", videoPublishEditModel.creativeModel.text2ImageModel.fromCommentId);
        }
        c0lab.LJ("enter_method", videoPublishEditModel.getShootEnterMethod());
        c0lab.LIZ(LJFF, "is_user_education_show");
        c0lab.LIZIZ(LIZJ + jCurrentTimeMillis, "text_edit_stay_duration_ms");
        c0lab.LJ("exit_method", str);
        C20684815ws.LJIILLIIL("exit_text_edit_page", c0lab.LIZ);
        LIZIZ = 0L;
        LIZJ += jCurrentTimeMillis;
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(1, "is_text_mode");
        c0lab.LIZ(1, "is_text_trans_pic");
        c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModel));
        c0lab.LJ("event_element", str);
        c0lab.LJ("action_position", str2);
        C20684815ws.LJIILLIIL("ttinter_text_style_edit_page_function_show", c0lab.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6) {
        int i;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("content_type", "multi_photo");
        c0lab.LJ("content_source", str2);
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("creation_id", str4);
        c0lab.LJ("entrance", str5);
        if (z) {
            i = 1;
        } else {
            i = 3;
        }
        c0lab.LIZ(i, "ai_img_gen_result");
        c0lab.LIZIZ(j, "ai_temp_gen_time_diff_from_start_to_complete");
        c0lab.LJ("ai_generated_image_style", str6);
        C20684815ws.LJIILLIIL("text2img_ai_template_finish", c0lab.LIZ);
    }
}
