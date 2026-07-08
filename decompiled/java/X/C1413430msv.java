package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0msv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413430msv {
    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        if (!C1428470nHB.LJJZZI(videoPublishEditModel) && !C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            return false;
        }
        return true;
    }

    public static final String LJIIIIZZ(SingleImageData singleImageData) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
        if (srcLiveInfo != null && (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) != null) {
            int i = C0M8G.LIZ[livePhotoPreviewMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "livephoto_loop";
                    }
                    return "normal_photo";
                }
                return "livephoto_live";
            }
            return "livephoto_static";
        }
        return "normal_photo";
    }

    public static final Map<String, String> LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LJII(videoPublishEditModel)) {
            return C2097608Jq.LJ();
        }
        C13DA c13da = new C13DA();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null) {
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(imageAlbumData.getCurrentPreviewIndex(), imageAlbumData.getImageList());
            if (singleImageData != null) {
                c13da.put("click_photo_content", LJIIIIZZ(singleImageData));
            }
        }
        return c13da.build();
    }

    public static final int LJIIJ(ImageAlbumData imageAlbumData) {
        Iterator<SingleImageData> it2 = imageAlbumData.getImageList().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().getSrcLiveInfo() != null) {
                i++;
            }
        }
        return i;
    }

    public static final Map<String, String> LJIIJJI(ImageAlbumData imageAlbumData) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        LivePhotoPreviewMode livePhotoPreviewMode2;
        C13DA c13da = new C13DA();
        c13da.put("live_pic_show_cnt", String.valueOf(LJIIJ(imageAlbumData)));
        List<SingleImageData> imageList = imageAlbumData.getImageList();
        ArrayList arrayList = new ArrayList();
        Iterator<SingleImageData> it2 = imageList.iterator();
        while (true) {
            LivePhotoPreviewMode livePhotoPreviewMode3 = null;
            if (!it2.hasNext()) {
                break;
            }
            SingleImageData next = it2.next();
            SrcLiveVideoInfo srcLiveInfo = next.getSrcLiveInfo();
            if (srcLiveInfo != null) {
                livePhotoPreviewMode3 = srcLiveInfo.getLivePhotoPreviewMode();
            }
            if (livePhotoPreviewMode3 == LivePhotoPreviewMode.STATIC) {
                arrayList.add(next);
            }
        }
        c13da.put("static_livephoto_show_cnt", String.valueOf(arrayList.size()));
        List<SingleImageData> imageList2 = imageAlbumData.getImageList();
        ArrayList arrayList2 = new ArrayList();
        for (SingleImageData singleImageData : imageList2) {
            SrcLiveVideoInfo srcLiveInfo2 = singleImageData.getSrcLiveInfo();
            if (srcLiveInfo2 != null) {
                livePhotoPreviewMode2 = srcLiveInfo2.getLivePhotoPreviewMode();
            } else {
                livePhotoPreviewMode2 = null;
            }
            if (livePhotoPreviewMode2 == LivePhotoPreviewMode.LOOP) {
                arrayList2.add(singleImageData);
            }
        }
        c13da.put("loop_livephoto_show_cnt", String.valueOf(arrayList2.size()));
        List<SingleImageData> imageList3 = imageAlbumData.getImageList();
        ArrayList arrayList3 = new ArrayList();
        for (SingleImageData singleImageData2 : imageList3) {
            SrcLiveVideoInfo srcLiveInfo3 = singleImageData2.getSrcLiveInfo();
            if (srcLiveInfo3 != null) {
                livePhotoPreviewMode = srcLiveInfo3.getLivePhotoPreviewMode();
            } else {
                livePhotoPreviewMode = null;
            }
            if (livePhotoPreviewMode == LivePhotoPreviewMode.LIVE_PHOTO) {
                arrayList3.add(singleImageData2);
            }
        }
        c13da.put("live_livephoto_show_cnt", String.valueOf(arrayList3.size()));
        return c13da.build();
    }

    public static final Map<String, String> LJIIL(VideoPublishEditModel videoPublishEditModel) {
        Map<String, String> mapLJIIJJI;
        if (!LJII(videoPublishEditModel)) {
            return C2097608Jq.LJ();
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData == null || (mapLJIIJJI = LJIIJJI(imageAlbumData)) == null) {
            return C2097608Jq.LJ();
        }
        return mapLJIIJJI;
    }

    public static final boolean LJIILIIL(SrcLiveVideoInfo srcLiveVideoInfo) {
        if ((!a0.LJJJIL(srcLiveVideoInfo.getPath())) && C2354809Ko.LIZIZ(srcLiveVideoInfo.getPath())) {
            return true;
        }
        return false;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (C0BMN.LIZ() && C1428470nHB.LJJZZI(videoPublishEditModel) && C1428470nHB.LJJLIIIJJIZ(videoPublishEditModel)) {
            c0lab.LIZ(C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue(), "pic_cnt");
            c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        }
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (!LJII(videoPublishEditModel)) {
            return;
        }
        for (Map.Entry<String, String> entry : LJIIIZ(videoPublishEditModel).entrySet()) {
            c0lab.LJ(entry.getKey(), entry.getValue());
        }
    }

    public static final void LIZJ(C0LAB c0lab, InterfaceC1645720sva interfaceC1645720sva) {
        String string;
        String string2;
        String string3;
        Float fValueOf;
        String string4;
        Float fValueOf2;
        Float fValueOf3;
        C1413440msw c1413440mswEo = interfaceC1645720sva.eo();
        Float fValueOf4 = null;
        if (c1413440mswEo != null) {
            fValueOf4 = Float.valueOf(c1413440mswEo.LIZ);
        }
        String str = CardStruct.IStatusCode.DEFAULT;
        if (fValueOf4 == null || (string = fValueOf4.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("process_texture_time", string);
        if (c1413440mswEo == null || (fValueOf3 = Float.valueOf(c1413440mswEo.LIZIZ)) == null || (string2 = fValueOf3.toString()) == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("pure_render_time", string2);
        if (c1413440mswEo == null || (fValueOf2 = Float.valueOf(c1413440mswEo.LIZJ)) == null || (string3 = fValueOf2.toString()) == null) {
            string3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("wait_algorithm_time", string3);
        if (c1413440mswEo != null && (fValueOf = Float.valueOf(c1413440mswEo.LIZLLL)) != null && (string4 = fValueOf.toString()) != null) {
            str = string4;
        }
        c0lab.LJ("pure_algorithm_time", str);
    }

    public static final C0LAB LIZLLL(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int iLJIIJ;
        if (!LJII(videoPublishEditModel)) {
            return c0lab;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null) {
            iLJIIJ = LJIIJ(imageAlbumData);
        } else {
            iLJIIJ = 0;
        }
        c0lab.LIZ(iLJIIJ, "live_pic_cnt");
        for (Map.Entry<String, String> entry : LJIIL(videoPublishEditModel).entrySet()) {
            c0lab.LJ(entry.getKey(), entry.getValue());
        }
        return c0lab;
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        int i2;
        int i3;
        List<TextStickerModel> newEngineTextStickers;
        int length;
        String str;
        if (!LJII(videoPublishEditModel)) {
            return;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        int i4 = 0;
        if (imageAlbumData != null && (newEngineTextStickers = imageAlbumData.getNewEngineTextStickers()) != null) {
            i4 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            for (TextStickerModel textStickerModel : newEngineTextStickers) {
                if (textStickerModel.getTextTemplateModel().fromInspirationPanel) {
                    if (C0F8Y.LJIIIZ(textStickerModel)) {
                        SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(1, textStickerModel.getCompatModel().getSubTemplates());
                        if (subTemplateInfo != null) {
                            if (!Intrinsics.LJFF(subTemplateInfo.text, C13LP.LJJJLZIJ(1, textStickerModel.getTextTemplateModel().defaultTexts)) && (str = subTemplateInfo.text) != null) {
                                length = str.length();
                            } else {
                                length = 0;
                            }
                            i3 += length;
                        }
                        i2 = 1;
                    } else {
                        if (i == 0 && Intrinsics.LJFF(textStickerModel.getTextStr(), textStickerModel.getTextTemplateModel().defaultText)) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        i4 = 1;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        c0lab.LIZ(i4, "is_used_title_ideas");
        c0lab.LIZ(i, "is_edit_title_ideas");
        c0lab.LIZ(i2, "is_used_writing_ideas");
        c0lab.LIZ(i3, "text_length_without_writing_ideas");
    }

    public static final C0LAB LJFF(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        boolean zBooleanValue;
        if (!C1428470nHB.LJJZZI(videoPublishEditModel) && !videoPublishEditModel.creativeModel.imageEditModel.enterFromImageMode) {
            return c0lab;
        }
        Boolean boolLIZIZ = C1411680mq6.LIZIZ(videoPublishEditModel);
        if (boolLIZIZ != null) {
            zBooleanValue = boolLIZIZ.booleanValue();
        } else {
            zBooleanValue = videoPublishEditModel.creativeModel.imageEditModel.isSelectCollageImg;
        }
        c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(zBooleanValue)), "is_collage_photo");
        return c0lab;
    }

    public static final void LJI(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "sdk")) {
            return;
        }
        c0lab.LJ("sdk_source_app", videoPublishEditModel.creativeModel.editModel.sdkSourceApp);
    }
}
