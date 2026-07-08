package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454040nwQ {
    public static final C1454040nwQ LIZ = new C1454040nwQ();
    public static String LIZIZ = "";

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        AICoverInfo aiCoverInfo;
        AICoverItem next;
        AICoverItem next2;
        C1454050nwR c1454050nwR = C1454050nwR.LIZ;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null) {
            aiCoverInfo = imageAlbumData.getAiCoverInfo();
        } else {
            aiCoverInfo = null;
        }
        c1454050nwR.getClass();
        if (aiCoverInfo != null) {
            String selectedCoverId = aiCoverInfo.getSelectedCoverId();
            Iterator<AICoverItem> it2 = aiCoverInfo.getCovers().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getSubTaskId(), selectedCoverId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AICoverItem aICoverItem = next;
            if (aICoverItem == null) {
                Iterator<AICoverItem> it3 = aiCoverInfo.getCovers().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2.isReady()) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                aICoverItem = next2;
                if (aICoverItem == null && (aICoverItem = (AICoverItem) C13LP.LJJJLL(aiCoverInfo.getCovers())) == null) {
                    return;
                }
            }
            String strLJIILIIL = C1454050nwR.LJIILIIL(aICoverItem);
            if (strLJIILIIL == null) {
                return;
            }
            c0lab.LJ("ai_photo_cover_gen_status", strLJIILIIL);
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        int i;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, str);
        c0labLIZJ.LIZ(videoPublishEditModel.creativeModel.imageEffectTemplateData.isTemplateFromAnchor ? 1 : 0, "if_photo_prop");
        if (!C573570MeZ.LIZJ(videoPublishEditModel) && !C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i = 0;
        } else {
            i = 1;
        }
        c0labLIZJ.LIZ(i, "is_pic_frame_single_pic_edit");
        C1413430msv.LIZLLL(videoPublishEditModel, c0labLIZJ);
        LIZ(videoPublishEditModel, c0labLIZJ);
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLIZJ.LIZ(1, "pic_cnt");
            c0labLIZJ.LJ("content_type", "multi_photo");
        }
        C20684815ws.LJIILLIIL("add_clips", c0labLIZJ.LIZ);
    }

    public static C0LAB LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        int size;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", LIZIZ);
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        return c0lab;
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, String str) {
        ImageAlbumData imageAlbumData;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, "video_edit_page");
        c0labLIZJ.LJ("enter_from", str);
        c0labLIZJ.LIZ(videoPublishEditModel.creativeModel.imageEffectTemplateData.isTemplateFromAnchor ? 1 : 0, "if_photo_prop");
        int i = 0;
        if (C573570MeZ.LIZ() && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && imageAlbumData.isSingleWhenInit()) {
            i = 1;
        }
        c0labLIZJ.LIZ(i, "is_pic_frame_single_pic_edit");
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLIZJ.LIZ(1, "pic_cnt");
            c0labLIZJ.LJ("content_type", "multi_photo");
        }
        C20684815ws.LJIILLIIL("edit_clips_order", c0labLIZJ.LIZ);
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z) {
        int i;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, str);
        c0labLIZJ.LIZ(videoPublishEditModel.creativeModel.imageEffectTemplateData.isTemplateFromAnchor ? 1 : 0, "if_photo_prop");
        if (!C573570MeZ.LIZJ(videoPublishEditModel) && !C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i = 0;
        } else {
            i = 1;
        }
        c0labLIZJ.LIZ(i, "is_pic_frame_single_pic_edit");
        c0labLIZJ.LIZ(z ? 1 : 0, "is_ai_photo_cover");
        if (str2 != null) {
            c0labLIZJ.LJ("ai_photo_cover_gen_status", str2);
        } else {
            LIZ(videoPublishEditModel, c0labLIZJ);
        }
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLIZJ.LIZ(1, "pic_cnt");
            c0labLIZJ.LJ("content_type", "multi_photo");
        }
        C20684815ws.LJIILLIIL("delete_clips", c0labLIZJ.LIZ);
    }
}
