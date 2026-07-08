package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CellIntParam;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageIntParam;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.image.collage.model.CollageIntProtocol;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454030nwP {
    public static final CollageInnerImageInfo LIZ(MediaModel mediaModel) {
        return new CollageInnerImageInfo(new SrcImageInfo(mediaModel.LJFF(), mediaModel.height, mediaModel.width, null, null, 24, null), mediaModel.aigcInfo, null);
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!u4.LJLL(videoPublishEditModel) && !C1441980ncy.LIZIZ(videoPublishEditModel) && !C568750MSj.LIZIZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final String LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        String strLJJLJLI;
        CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            String str = cameraLayoutModel.compiledFilePath;
            String str2 = cameraLayoutModel.compiledFilePath;
            if (str2 != null) {
                strLJJLJLI = a0.LJJLJLI(str2, File.separator, str2);
            } else {
                strLJJLJLI = null;
            }
            if (str != null && str.length() != 0) {
                return strLJJLJLI;
            }
        }
        return null;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() < 35) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !u4.LJLL(videoPublishEditModel) || !C1428470nHB.LJJZZI(videoPublishEditModel) || ((Number) C0B0I.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public static CollageIntParam LJIIIIZZ(CollageIntProtocol collageIntProtocol) {
        Integer num;
        String str = collageIntProtocol.collageId;
        if (str != null && (num = collageIntProtocol.rows) != null) {
            int iIntValue = num.intValue();
            Integer num2 = collageIntProtocol.cols;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                List<List<Integer>> list = collageIntProtocol.layout;
                if (list != null && iIntValue > 0 && iIntValue2 > 0) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (((List) ListProtector.get(list, i)).size() != 4) {
                            return null;
                        }
                    }
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (List<Integer> list2 : list) {
                        int iIntValue3 = ((Number) ListProtector.get(list2, 0)).intValue();
                        int iIntValue4 = ((Number) ListProtector.get(list2, 1)).intValue();
                        int iIntValue5 = ((Number) ListProtector.get(list2, 2)).intValue();
                        int iIntValue6 = ((Number) ListProtector.get(list2, 3)).intValue();
                        C844470XAv.LIZ.getClass();
                        if (C11VU.LJFF(C844470XAv.LIZ())) {
                            iIntValue3 = (iIntValue2 - iIntValue3) - iIntValue5;
                        }
                        arrayList.add(new CellIntParam(iIntValue3, iIntValue4, iIntValue5, iIntValue6));
                    }
                    return new CollageIntParam(str, iIntValue, iIntValue2, arrayList);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static C1454380nwy LJIIIZ(CollageIntParam collageIntParam) {
        float rows = collageIntParam.getRows();
        float cols = collageIntParam.getCols();
        List<CellIntParam> cells = collageIntParam.getCells();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(cells, 10));
        for (CellIntParam cellIntParam : cells) {
            arrayList.add(new C1454180nwe(cellIntParam.getX() / cols, cellIntParam.getY() / rows, cellIntParam.getWidth() / cols, cellIntParam.getHeight() / rows));
        }
        return new C1454380nwy(collageIntParam.getCollageId(), arrayList);
    }

    public static final boolean LIZIZ(SingleImageData singleImageData, String str) {
        if (singleImageData.getCollageInfo() == null && !singleImageData.isAICover() && !LJI(singleImageData, str)) {
            return true;
        }
        return false;
    }

    public static final EnumC1454080nwU LJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        List<SingleImageData> imageList2;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null) {
            int currentPreviewIndex = imageAlbumData.getCurrentPreviewIndex();
            ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(currentPreviewIndex, imageList)) != null) {
                String strLIZLLL = LIZLLL(videoPublishEditModel);
                if (!z && LJI(singleImageData, strLIZLLL)) {
                    return EnumC1454080nwU.NOT_SUPPORT_LAYOUT;
                }
                if (singleImageData.getCollageInfo() != null) {
                    return EnumC1454080nwU.ENTER;
                }
                if (LJFF(videoPublishEditModel)) {
                    return EnumC1454080nwU.EXCEED_MAX_IMAGE_COUNT;
                }
                ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
                int i = 0;
                if (imageAlbumData3 != null && (imageList2 = imageAlbumData3.getImageList()) != null && !imageList2.isEmpty()) {
                    Iterator<SingleImageData> it2 = imageList2.iterator();
                    while (it2.hasNext()) {
                        if (LIZIZ(it2.next(), strLIZLLL) && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                    if (i > 1) {
                        return EnumC1454080nwU.ENTER;
                    }
                }
                return EnumC1454080nwU.NEED_MORE_PHOTO;
            }
            return EnumC1454080nwU.OTHER_DISABLE;
        }
        return EnumC1454080nwU.OTHER_DISABLE;
    }

    public static final boolean LJI(SingleImageData singleImageData, String str) {
        PhotoTemplateInfo photoTemplateInfo;
        SrcImageInfo originalImage;
        String path;
        if (str == null) {
            return false;
        }
        if (!u.LJIIZILJ(singleImageData.getSrcImageInfo().getPath(), str, false) && ((photoTemplateInfo = singleImageData.getPhotoTemplateInfo()) == null || (originalImage = photoTemplateInfo.getOriginalImage()) == null || (path = originalImage.getPath()) == null || !u.LJIIZILJ(path, str, false))) {
            return false;
        }
        return true;
    }
}
