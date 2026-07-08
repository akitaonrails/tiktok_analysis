package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEncodeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageQualityInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSourceInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: renamed from: X.0ngY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444200ngY {
    public static final C1444200ngY LIZ = new C1444200ngY();

    static {
        C1446930nkx.LJ(new C540580LIa());
        C1446930nkx.LIZJ(new C540590LIb());
        C1446930nkx.LIZLLL(AFwS239S0000000_8.get$arr$(257));
        C1446930nkx.LJII(AFwS239S0000000_8.get$arr$(258));
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        int i;
        int i2;
        int size;
        List<SingleImageData> imageList2;
        ImageAlbumData imageAlbumData;
        int videoWidth;
        int videoHeight;
        int followerCount;
        Map<String, Object> metadataMap;
        String originImportPath;
        ImportVideoInfo importVideoInfo;
        String path;
        int i3;
        ImportVideoInfo importVideoInfo2;
        List list;
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
            for (SingleImageData singleImageData : imageList) {
                LIZ.getClass();
                C0LAB c0lab = new C0LAB();
                if (C1428470nHB.LJZ(videoPublishEditModel)) {
                    if (C1428520nHG.LJJLIIIJ(videoPublishEditModel)) {
                        originImportPath = singleImageData.getSrcImageInfo().getPath();
                    } else {
                        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
                        if (importInfoList != null && (importVideoInfo = (ImportVideoInfo) C13LP.LJJJLL(importInfoList)) != null) {
                            originImportPath = importVideoInfo.getOriginImportPath();
                        } else {
                            originImportPath = null;
                        }
                    }
                    LIZ(c0lab, originImportPath, "origin");
                    ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
                    if (synthesisData != null) {
                        path = synthesisData.getPath();
                    } else {
                        path = null;
                    }
                    LIZ(c0lab, path, "encode");
                    c0lab.LIZ(C1428520nHG.LJJJJI(videoPublishEditModel) ? 1 : 0, "is_edit");
                    c0lab.LIZ(0, "use_crop");
                    if (!C1428470nHB.LJIIJ(videoPublishEditModel) && !videoPublishEditModel.getAutoEnhanceOn()) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    c0lab.LIZ(i3, "edit_enhance");
                    c0lab.LIZ(C703302op.LIZ(videoPublishEditModel.getEditFilterId()) ? 1 : 0, "edit_filter_id");
                    ArrayList<ImportVideoInfo> importInfoList2 = videoPublishEditModel.getImportInfoList();
                    if (importInfoList2 != null) {
                        importVideoInfo2 = (ImportVideoInfo) C13LP.LJJJLL(importInfoList2);
                    } else {
                        importVideoInfo2 = null;
                    }
                    c0lab.LIZ(LIZLLL(importVideoInfo2, singleImageData.getSrcImageInfo()), "fast_import");
                    c0lab.LIZ(1, "pic_cnt");
                    InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
                    if (infoStickerModel == null || (list = infoStickerModel.stickers) == null) {
                        list = C13BV.INSTANCE;
                    }
                    LIZJ(c0lab, list);
                } else {
                    ImageQualityInfo imageQualityInfo = singleImageData.getImageQualityInfo();
                    if (imageQualityInfo != null) {
                        ImageSourceInfo imageSourceInfo = imageQualityInfo.getImageSourceInfo();
                        if (imageSourceInfo != null) {
                            ImportVideoInfo originAlbumImageData = singleImageData.getOriginAlbumImageData();
                            if (originAlbumImageData != null) {
                                videoWidth = originAlbumImageData.getVideoWidth();
                            } else {
                                videoWidth = -1;
                            }
                            c0lab.LIZ(videoWidth, "origin_width");
                            ImportVideoInfo originAlbumImageData2 = singleImageData.getOriginAlbumImageData();
                            if (originAlbumImageData2 != null) {
                                videoHeight = originAlbumImageData2.getVideoHeight();
                            } else {
                                videoHeight = -1;
                            }
                            c0lab.LIZ(videoHeight, "origin_height");
                            c0lab.LIZIZ(imageSourceInfo.getSourceFileSize(), "origin_fileSize");
                            c0lab.LIZ(imageSourceInfo.getSourceDegree(), "origin_degree");
                            c0lab.LJ("origin_encode_type", imageSourceInfo.getSourceEncodeType());
                            c0lab.LJ("origin_color_space", imageSourceInfo.getSourceColorSpace());
                            c0lab.LIZ(LIZLLL(singleImageData.getOriginAlbumImageData(), singleImageData.getSrcImageInfo()), "fast_import");
                        }
                        ImageEncodeInfo imageEncodeInfo = imageQualityInfo.getImageEncodeInfo();
                        if (imageEncodeInfo != null) {
                            c0lab.LIZ(imageEncodeInfo.getWidth(), "encode_width");
                            c0lab.LIZ(imageEncodeInfo.getHeight(), "encode_height");
                            c0lab.LIZIZ(imageEncodeInfo.getFileSize(), "encode_fileSize");
                            c0lab.LJ("encode_type", imageEncodeInfo.getEncodeType());
                            c0lab.LIZ(imageEncodeInfo.getEncodeQuality(), "encode_image_quality");
                            c0lab.LIZ(imageEncodeInfo.getIsreencode(), "encode_isreencode");
                            c0lab.LJ("encode_color_space", imageEncodeInfo.getEncodeColorSpace());
                            c0lab.LJ("encode_api", imageEncodeInfo.getEncodeApi());
                            c0lab.LJ("encode_format", imageEncodeInfo.getEncodeColorFormat());
                            c0lab.LJ("encode_depth", imageEncodeInfo.getEncodeDepth());
                        }
                        if (singleImageData.isEdited(true, true) || ((imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && imageAlbumData.getAutoEnhanceOn())) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c0lab.LIZ(i, "is_edit");
                        c0lab.LIZ(singleImageData.isManualCrop() ? 1 : 0, "use_crop");
                        c0lab.LIZ(C1428470nHB.LJIIJ(videoPublishEditModel) ? 1 : 0, "edit_enhance");
                        if (singleImageData.getFilterInfo().getFilterId().length() > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c0lab.LIZ(i2, "edit_filter_id");
                        ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
                        if (imageAlbumData3 != null && (imageList2 = imageAlbumData3.getImageList()) != null) {
                            size = imageList2.size();
                        } else {
                            size = 0;
                        }
                        c0lab.LIZ(size, "pic_cnt");
                        List<StickerItemModel> stickers = singleImageData.getStickerInfo().getStickers();
                        if (stickers == null) {
                            stickers = C13BV.INSTANCE;
                        }
                        LIZJ(c0lab, stickers);
                    }
                }
                c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
                c0lab.LIZ(!Intrinsics.LJFF(C1428470nHB.LJIILIIL(videoPublishEditModel), "upload") ? 1 : 0, "publish_type");
                C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
                if (currentUser != null) {
                    followerCount = currentUser.getFollowerCount();
                } else {
                    followerCount = -1;
                }
                c0lab.LIZ(followerCount, "follower_count");
                c0lab.LIZ(videoPublishEditModel.isTemplateMv() ? 1 : 0, "use_cover_template");
                c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
                if (videoPublishEditModel.getMetadataMap() == null) {
                    videoPublishEditModel.setMetadataMap(C1A66.LIZ());
                } else {
                    Map<String, Object> mapLIZ = C1A66.LIZ();
                    if (mapLIZ != null && (metadataMap = videoPublishEditModel.getMetadataMap()) != null) {
                        metadataMap.putAll(mapLIZ);
                    }
                }
                Map<String, Object> metadataMap2 = videoPublishEditModel.getMetadataMap();
                if (metadataMap2 != null) {
                    c0lab.LIZLLL(metadataMap2.get("te_camera_capture_mode"), "te_camera_capture_mode");
                    c0lab.LIZLLL(metadataMap2.get("te_camera_api"), "te_camera_api");
                    c0lab.LIZLLL(metadataMap2.get("te_camera_texture_size"), "te_camera_texture_size");
                    c0lab.LIZLLL(metadataMap2.get("te_record_video_resolution_width"), "te_record_video_resolution_width");
                    c0lab.LIZLLL(metadataMap2.get("te_record_video_resolution_height"), "te_record_video_resolution_height");
                    c0lab.LIZLLL(metadataMap2.get("te_camera_photo_composition_width"), "te_camera_photo_composition_width");
                    c0lab.LIZLLL(metadataMap2.get("te_camera_photo_composition_height"), "te_camera_photo_composition_height");
                    c0lab.LIZLLL(metadataMap2.get("te_source_image_encode_type"), "origin_encode_type");
                    c0lab.LIZLLL(metadataMap2.get("te_image_encode_type"), "encode_type");
                    c0lab.LIZLLL(metadataMap2.get("te_image_encode_depth"), "encode_depth");
                    c0lab.LIZLLL(metadataMap2.get("te_image_encode_api"), "encode_api");
                    c0lab.LIZLLL(metadataMap2.get("te_image_encode_quality"), "encode_image_quality");
                }
                C20684815ws.LJIILLIIL("image_album_quality", c0lab.LIZ);
            }
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String str;
        c0lab.LJ("image_album_music_id", videoPublishEditModel.getMusicId());
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            if (musicObject.isPgc) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            c0lab.LJ("image_album_music_sound_type", str);
            c0lab.LIZ(1, "image_album_music_use_all");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("0,");
            sbLIZ.append(musicObject.duration);
            c0lab.LJ("image_album_music_use_duration", C2188811AlT.LIZIZ(sbLIZ));
        }
        c0lab.LIZ((int) (videoPublishEditModel.getMusicVolume() * 100), "image_album_music_volume");
    }

    public static void LIZJ(C0LAB c0lab, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            StickerItemModel stickerItemModel = (StickerItemModel) it2.next();
            String str = "";
            if (stickerItemModel.isTextSticker()) {
                try {
                    String fontType = ((TextStickerData) C2292508yZ.LIZIZ().LJIIIIZZ(stickerItemModel.extra, new TypeToken<TextStickerData>() { // from class: X.0ngh
                    }.getType())).getFontType();
                    if (fontType != null) {
                        str = fontType;
                    }
                    arrayList2.add(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("putStickerId error: ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                String str2 = stickerItemModel.stickerId;
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(str);
            }
        }
        c0lab.LIZ(!arrayList.isEmpty() ? 1 : 0, "edit_sticker_id");
        c0lab.LIZ(!arrayList2.isEmpty() ? 1 : 0, "edit_text_id");
    }

    public static int LIZLLL(ImportVideoInfo importVideoInfo, SrcImageInfo srcImageInfo) {
        if (importVideoInfo != null && srcImageInfo != null) {
            if (Math.min(importVideoInfo.getVideoWidth(), importVideoInfo.getVideoHeight()) == Math.min(srcImageInfo.getWidth(), srcImageInfo.getHeight()) && Math.max(importVideoInfo.getVideoWidth(), importVideoInfo.getVideoHeight()) == Math.max(srcImageInfo.getWidth(), srcImageInfo.getHeight())) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static void LIZ(C0LAB c0lab, String str, String str2) {
        Object c098200Yq;
        String strLJJZ;
        String name;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(C0CHQ.LIZ.getContentResolver(), C2471909mP.LJIILIIL(str), "r");
                    if (parcelFileDescriptorLIZLLL != null) {
                        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorLIZLLL.getFileDescriptor(), null, null);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append("_width");
                        c0lab.LIZ(bitmapDecodeFileDescriptor.getWidth(), C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append("_height");
                        c0lab.LIZ(bitmapDecodeFileDescriptor.getHeight(), C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str2);
                        sbLIZ3.append("_fileSize");
                        c0lab.LIZIZ(parcelFileDescriptorLIZLLL.getStatSize() / ((long) 1024), C2188811AlT.LIZIZ(sbLIZ3));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str2);
                        sbLIZ4.append("_image_quality");
                        c0lab.LIZ(100, C2188811AlT.LIZIZ(sbLIZ4));
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(str2);
                        sbLIZ5.append("_color_space");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                        ColorSpace colorSpace = bitmapDecodeFileDescriptor.getColorSpace();
                        if (colorSpace == null || (name = colorSpace.getName()) == null || (strLJJZ = a0.LJJZ(name, " ", name)) == null) {
                            strLJJZ = "unknown";
                        }
                        c0lab.LJ(strLIZIZ, strLJJZ);
                        bitmapDecodeFileDescriptor.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFileDescriptor);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }
}
