package X;

import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import lth.o;
import uxk.a;

/* JADX INFO: renamed from: X.10CD, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CD {
    public static final C10CD LIZ = new C10CD();

    public static int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (C298680BnG.LIZ()) {
            a.LIZ.getClass();
            if (a.LIZ() == 4) {
                return a.LIZJ();
            }
        } else if (C857690Xkl.LIZ(videoPublishEditModel)) {
            a.LIZ.getClass();
            if (a.LIZ() == 4) {
                return a.LIZJ();
            }
        }
        a.LIZ.getClass();
        return a.LIZ();
    }

    public static void LIZ(C2344009Gk c2344009Gk, VideoPublishEditModel videoPublishEditModel) {
        String str;
        int i;
        int size;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        CMPreviewInfo cMPreviewInfo;
        String string;
        CreativeModel creativeModel2;
        PrivacySettingModel privacySettingModel2;
        CMPreviewInfo cMPreviewInfo2;
        if (C298670BnF.LIZ()) {
            if (videoPublishEditModel == null || (creativeModel2 = videoPublishEditModel.creativeModel) == null || (privacySettingModel2 = creativeModel2.privacySettingModel) == null || (cMPreviewInfo2 = privacySettingModel2.cmPreviewInfo) == null || (string = Long.valueOf(cMPreviewInfo2.previewDurationTimeInMs).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("preview_duration", string);
        }
        if (C298640BnC.LIZ()) {
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (cMPreviewInfo = privacySettingModel.cmPreviewInfo) != null && cMPreviewInfo.isPreviewEnabled) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "if_preview_on");
            if (videoPublishEditModel != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            c2344009Gk.LIZJ(size, "total_photo_cnt");
            c2344009Gk.LIZJ(C1447940nma.LIZJ(videoPublishEditModel), "preview_photo_cnt");
        }
        if (C298680BnG.LIZ()) {
            c2344009Gk.LIZJ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        }
        if (C298650BnD.LIZ() && videoPublishEditModel != null) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                str = "photo";
            } else if (videoPublishEditModel.getCreationMode() != 1) {
                return;
            } else {
                str = "video";
            }
            c2344009Gk.LJFF("content_type", str);
        }
    }

    public static String LIZIZ(int i, boolean z) {
        C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    if (z) {
                        return "private";
                    }
                    return "only me";
                }
                return "only_subscriber";
            }
            return "friends";
        }
        if (currentUser != null && currentUser.LJIIJJI()) {
            return "followers";
        }
        if (z) {
            return "public";
        }
        return "everyone";
    }

    public static void LIZLLL(int i, int i2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("from_status", LIZIZ(i, false));
        c2344009Gk.LJIIIIZZ("to_status", LIZIZ(i2, false));
        C20684815ws.LJIILLIIL("change_video_visibility", c2344009Gk.LIZ);
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2, int i3, C1556730qc3 c1556730qc3) {
        String creationId;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("from_status", LIZIZ(i, true));
        c2344009Gk.LJIIIIZZ("to_status", LIZIZ(i2, true));
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        c2344009Gk.LIZJ(i3, "muf_cnt");
        if (c1556730qc3 != null) {
            C10CD c10cd = LIZ;
            int i4 = c1556730qc3.LIZ;
            c10cd.getClass();
            c2344009Gk.LJFF("default_status", LIZIZ(i4, true));
            if (c1556730qc3.LIZIZ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_default_set", str2);
        }
        LIZ(c2344009Gk, videoPublishEditModel);
        C20684815ws.LJIILLIIL("confirm_private_setting_popup", c2344009Gk.LIZ);
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2, boolean z, int i3) {
        String str2;
        String creationId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        int i4 = 1;
        c2344009Gk.LJIIIIZZ("current_status", LIZIZ(i, true));
        c2344009Gk.LJIIIIZZ("default_status", LIZIZ(i2, true));
        if (z) {
            str2 = "auto";
        } else {
            str2 = "click";
        }
        c2344009Gk.LJIIIIZZ("show_way", str2);
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        c2344009Gk.LIZJ(i3, "muf_cnt");
        if (videoPublishEditModel == null || C857690Xkl.LIZ(videoPublishEditModel)) {
            i4 = 0;
        }
        c2344009Gk.LIZJ(i4, "has_sub_only_option");
        LIZ(c2344009Gk, videoPublishEditModel);
        C20684815ws.LJIILLIIL("show_private_setting_popup", c2344009Gk.LIZ);
    }
}
