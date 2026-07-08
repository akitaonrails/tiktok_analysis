package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570480MZa {
    public static final C570480MZa LIZ = new C570480MZa();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Integer numValueOf;
        String strLJJLIIIJ;
        C578570Mmd.LIZ.getClass();
        if (!C578570Mmd.LIZ() || videoPublishEditModel.creativeModel.livePhotoModel == null) {
            return;
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        c0lab.LIZ(C580270MpN.LJIIIZ(videoPublishEditModel), "live_photo_cnt");
        LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
        String strLIZIZ = null;
        if (livePhotoModel != null) {
            numValueOf = Integer.valueOf(C570520MZe.LIZ(livePhotoModel));
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "is_live_video");
        LivePhotoModel livePhotoModel2 = videoPublishEditModel.creativeModel.livePhotoModel;
        String str = "";
        if (livePhotoModel2 != null) {
            if (!livePhotoModel2.enableLiveMode) {
                strLIZIZ = "";
            } else {
                strLIZIZ = C570520MZe.LIZIZ(livePhotoModel2.previewMode, true);
            }
        }
        c0lab.LJ("live_mode", strLIZIZ);
        List<String> uploadTabNameList = videoPublishEditModel.getUploadTabNameList();
        if (uploadTabNameList != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(uploadTabNameList, ",", null, null, 0, null, null, 62)) != null) {
            str = strLJJLIIIJ;
        }
        if (!c0lab.LIZ.containsKey("upload_tab_name")) {
            c0lab.LJ("upload_tab_name", str);
        }
        c0lab.LJ("video_cnt", String.valueOf(pairLJIIJJI.getFirst().intValue()));
        c0lab.LJ("pic_cnt", String.valueOf(pairLJIIJJI.getSecond().intValue()));
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, LivePhotoPreviewMode livePhotoPreviewMode, LivePhotoPreviewMode livePhotoPreviewMode2) {
        int size;
        List<? extends MediaModel> list;
        LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
        if (livePhotoModel != null && (list = livePhotoModel.importedLivePhotoList) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        C1413430msv.LIZLLL(videoPublishEditModel, c0lab);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", "live");
        c0lab.LJ("from_mode", C570520MZe.LIZIZ(livePhotoPreviewMode, false));
        c0lab.LJ("to_mode", C570520MZe.LIZIZ(livePhotoPreviewMode2, false));
        c0lab.LIZ(size, "live_pic_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        List<InterfaceC2342209Fs> list2 = C2341909Fp.LIZ;
        C2341909Fp.LIZ("click_live_mode_icon", c0lab.LIZ);
    }
}
