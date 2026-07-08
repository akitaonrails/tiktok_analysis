package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454060nwS {
    public static final C1454060nwS LIZ = new C1454060nwS();

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        int i = !C1454030nwP.LJ(videoPublishEditModel, false).getEnableEnter() ? 1 : 0;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue, "pic_cnt");
        c0lab.LIZ(i, "is_greyed_out");
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("show_collage_entrance", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0LAB] */
    public static void LIZ(VideoPublishEditModel videoPublishEditModel, Boolean bool) {
        ?? BooleanValue;
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        if (bool != null) {
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
            if (!C1454030nwP.LJ(videoPublishEditModel, false).getEnableEnter()) {
                BooleanValue = 1;
            }
        }
        ?? c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue, "pic_cnt");
        c0lab.LIZ(BooleanValue, "is_greyed_out");
        C1413430msv.LJFF(videoPublishEditModel, c0lab);
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("click_collage_entrance", c0lab.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, AbstractC1454390nwz abstractC1454390nwz) {
        String str;
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue, "pic_cnt");
        abstractC1454390nwz.getClass();
        if (Intrinsics.LJFF(abstractC1454390nwz, C1454470nx7.LIZ)) {
            str = "drag";
        } else if (Intrinsics.LJFF(abstractC1454390nwz, C1454490nx9.LIZ)) {
            str = "rotate";
        } else if (Intrinsics.LJFF(abstractC1454390nwz, C1454500nxA.LIZ)) {
            str = "switch_position";
        } else if (Intrinsics.LJFF(abstractC1454390nwz, C1454480nx8.LIZ)) {
            str = "replace_photo";
        } else {
            throw new C1954807lC();
        }
        c0lab.LJ("action", str);
        C1413430msv.LJFF(videoPublishEditModel, c0lab);
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("edit_photo_in_collage", c0lab.LIZ);
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue, "pic_cnt");
        c0lab.LJ("click_result", str);
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("click_collage_livephoto_notice", c0lab.LIZ);
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, String str, String str2, C1454090nwV c1454090nwV) {
        AICoverInfo aiCoverInfo;
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue, "pic_cnt");
        c0lab.LJ("switch_result", str);
        c0lab.LJ("to_collage_id", str2);
        C1413430msv.LJFF(videoPublishEditModel, c0lab);
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        Integer num = null;
        if (imageAlbumData != null) {
            aiCoverInfo = imageAlbumData.getAiCoverInfo();
        } else {
            aiCoverInfo = null;
        }
        String str3 = c1454090nwV.LIZ;
        String str4 = c1454090nwV.LIZIZ;
        if (Intrinsics.LJFF(str3, "ai_photo_cover")) {
            num = videoPublishEditModel.creativeModel.aiCoverMobModel.usedPicCnt;
        }
        C1454050nwR.LIZJ(c0lab, new C1155300gAa(str3, str4, num));
        C1454050nwR c1454050nwR = C1454050nwR.LIZ;
        String strLJIIJJI = c1454090nwV.LJFF;
        if (strLJIIJJI == null) {
            String str5 = c1454090nwV.LIZLLL;
            c1454050nwR.getClass();
            strLJIIJJI = C1454050nwR.LJIIJJI(aiCoverInfo, str5);
        }
        c1454050nwR.getClass();
        C1454050nwR.LJ(c0lab, "from_ai_photo_cover_template_id", strLJIIJJI);
        String strLJIIJJI2 = c1454090nwV.LJ;
        if (strLJIIJJI2 == null) {
            strLJIIJJI2 = C1454050nwR.LJIIJJI(aiCoverInfo, c1454090nwV.LIZJ);
        }
        C1454050nwR.LJ(c0lab, "to_ai_photo_cover_template_id", strLJIIJJI2);
        C1454050nwR.LJ(c0lab, "from_ai_photo_cover_gen_status", c1454090nwV.LJII);
        C1454050nwR.LJ(c0lab, "to_ai_photo_cover_gen_status", c1454090nwV.LJI);
        String strLJIIL = c1454090nwV.LJIIIZ;
        if (strLJIIL == null) {
            strLJIIL = C1454050nwR.LJIIL(aiCoverInfo, c1454090nwV.LIZLLL);
        }
        C1454050nwR.LJ(c0lab, "from_ai_photo_cover_template_style", strLJIIL);
        String strLJIIL2 = c1454090nwV.LJIIIIZZ;
        if (strLJIIL2 == null) {
            strLJIIL2 = C1454050nwR.LJIIL(aiCoverInfo, c1454090nwV.LIZJ);
        }
        C1454050nwR.LJ(c0lab, "to_ai_photo_cover_template_style", strLJIIL2);
        C1454050nwR.LIZ(c0lab, aiCoverInfo);
        C20684815ws.LJIILLIIL("switch_collage_template", c0lab.LIZ);
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, int i, int i2, String str, C1454110nwX c1454110nwX, Long l) {
        AICoverInfo aiCoverInfo;
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue, "pic_cnt");
        c0lab.LIZ(i, "collage_template_material_count");
        c0lab.LIZ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("to_collage_id", str);
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
        if (c1454110nwX != null) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            Integer num = null;
            if (imageAlbumData != null) {
                aiCoverInfo = imageAlbumData.getAiCoverInfo();
            } else {
                aiCoverInfo = null;
            }
            String str2 = c1454110nwX.LIZ;
            String str3 = c1454110nwX.LIZIZ;
            if (Intrinsics.LJFF(str2, "ai_photo_cover")) {
                num = videoPublishEditModel.creativeModel.aiCoverMobModel.usedPicCnt;
            }
            C1454050nwR.LIZJ(c0lab, new C1155300gAa(str2, str3, num));
            C1454050nwR c1454050nwR = C1454050nwR.LIZ;
            String strLJIIJJI = c1454110nwX.LIZLLL;
            if (strLJIIJJI == null) {
                String str4 = c1454110nwX.LIZJ;
                c1454050nwR.getClass();
                strLJIIJJI = C1454050nwR.LJIIJJI(aiCoverInfo, str4);
                if (strLJIIJJI == null) {
                    strLJIIJJI = C1454050nwR.LJIIIIZZ(aiCoverInfo);
                }
            }
            c1454050nwR.getClass();
            C1454050nwR.LJ(c0lab, "ai_photo_cover_template_id", strLJIIJJI);
            C1454050nwR.LJ(c0lab, "ai_photo_cover_gen_status", c1454110nwX.LJ);
            String strLJIIL = c1454110nwX.LJFF;
            if (strLJIIL == null && (strLJIIL = C1454050nwR.LJIIL(aiCoverInfo, c1454110nwX.LIZJ)) == null) {
                strLJIIL = C1454050nwR.LJIIIZ(aiCoverInfo);
            }
            C1454050nwR.LJ(c0lab, "ai_photo_cover_template_style", strLJIIL);
            C1454050nwR.LIZ(c0lab, aiCoverInfo);
            C1454050nwR.LJ(c0lab, "ai_photo_cover_used_pic_uri", videoPublishEditModel.creativeModel.aiCoverMobModel.usedPicUri);
        } else {
            c0lab.LJ("function_type", "collage");
        }
        if (l != null) {
            c0lab.LIZIZ(l.longValue(), "duration");
        }
        C20684815ws.LJIILLIIL("click_collagetemplate_confirm", c0lab.LIZ);
    }
}
