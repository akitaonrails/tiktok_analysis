package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.photomode.template.ImageEffectTemplateReuseData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0L1H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1H {
    public static final C0L1H LIZ = new C0L1H();

    public static void LIZ(C0L1H c0l1h, Activity activity, VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, boolean z3, boolean z4, String str, int i) {
        Bundle bundle;
        int i2;
        ImageAlbumData imageAlbumData;
        AICoverInfo aiCoverInfo;
        int i3;
        boolean z5 = z3;
        boolean z6 = z4;
        String value = str;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z5 = false;
        }
        if ((i & 32) != 0) {
            z6 = false;
        }
        if ((i & 64) != 0) {
            value = C0L9O.VIDEO_EDIT_PAGE.getValue();
        }
        c0l1h.getClass();
        C528230Knd c528230KndLIZLLL = C534690Ky3.LIZLLL(videoPublishEditModel);
        c528230KndLIZLLL.LJI = value;
        if (z) {
            c528230KndLIZLLL.LJII = EnumC538190L8v.REPLACE_PHOTO.getValue();
            bundle = new Bundle();
            bundle.putInt("key_choose_scene", 48);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            if (z2) {
                bundle.putInt("key_support_flag", 9);
            } else {
                bundle.putInt("key_support_flag", 1);
            }
        } else {
            c528230KndLIZLLL.LJII = EnumC538190L8v.ADD_PHOTO.getValue();
            bundle = new Bundle();
            C1446760nkg.LIZ.getClass();
            if (C1446760nkg.LIZJ() && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (aiCoverInfo = imageAlbumData.getAiCoverInfo()) != null && aiCoverInfo.getAnyGenerating()) {
                i2 = 34;
            } else {
                i2 = 35;
            }
            ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData2 != null) {
                int size = i2 - imageAlbumData2.getImageList().size();
                bundle.putInt("key_choose_scene", 39);
                bundle.putInt("key_photo_select_min_count", 1);
                bundle.putInt("key_photo_select_max_count", size);
                if (z2) {
                    bundle.putInt("key_support_flag", 10);
                } else {
                    bundle.putInt("key_support_flag", 2);
                }
                C786410Ut5.LJJJI("key_mv_hint_text", C786410Ut5.L3(activity).getResources().getString(2131828638, Integer.valueOf(size)), bundle);
                ImageEffectTemplateReuseData imageEffectTemplateReuseData = videoPublishEditModel.creativeModel.imageEffectTemplateData;
                if (imageEffectTemplateReuseData.isTemplateFromAnchor) {
                    PhotoTemplateAsset photoTemplateAsset = imageEffectTemplateReuseData.templateAsset;
                    if (photoTemplateAsset != null && photoTemplateAsset.getGenerateNewImage()) {
                        size /= 2;
                    }
                    if (size > 3) {
                        size = 3;
                    }
                    bundle.putInt("key_photo_use_effect_max_count", size);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        C786410Ut5.LJJJI("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle);
        bundle.putBoolean("show_private_album", z6);
        C537520L6g.LJFF(bundle, videoPublishEditModel.getCreativeInfo());
        bundle.putBoolean("key_enable_image_effect_template_reuse", z5);
        bundle.putBoolean("key_if_photo_prop", videoPublishEditModel.creativeModel.imageEffectTemplateData.isTemplateFromAnchor);
        C786410Ut5.LJJJI("album_from_page", value, bundle);
        C786410Ut5.LJJJI("shoot_enter_from", C1428470nHB.LJJIIJ(videoPublishEditModel, false), bundle);
        C786410Ut5.LJJJI("shoot_enter_method", videoPublishEditModel.getShootEnterMethod(), bundle);
        C786410Ut5.LJJIJL(bundle, "key_video_publish_edit_model", videoPublishEditModel);
        if (z) {
            i3 = 10007;
        } else {
            i3 = 10005;
        }
        C534690Ky3.LIZIZ(c528230KndLIZLLL);
        C1660680tJi.LIZ().LJIIIZ(activity, bundle, i3, i3);
    }
}
