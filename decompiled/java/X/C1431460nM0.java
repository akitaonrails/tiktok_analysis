package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageLivePhotoModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0nM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431460nM0 {
    public final /* synthetic */ C1431480nM2 LIZ;
    public final /* synthetic */ List<PublishImageModel> LIZIZ;

    public final void LIZ(C1431450nLz c1431450nLz) {
        C1431480nM2.LJIJI(this.LIZ, new C1434330nQd(new C1431630nMH(c1431450nLz.getErrorCode(), c1431450nLz.getErrorMsg(), 1951), null, 2, null));
    }

    public C1431460nM0(C1431480nM2 c1431480nM2, List<PublishImageModel> list) {
        this.LIZ = c1431480nM2;
        this.LIZIZ = list;
    }

    public final void LIZIZ(Map<String, AbstractImageUploader.ImageUploadInfo> map, Map<String, C1431630nMH> map2) {
        int imageCurrentIndex;
        PublishImageModel publishImageModel;
        C1431990nMr c1431990nMr;
        int imageCurrentIndex2;
        PublishImageLivePhotoModel publishImageLivePhotoModel;
        String str;
        Object obj;
        C1404850mf5 c1404850mf5 = new C1404850mf5(((C138P) ((C1431570nMB) this.LIZ.LLJZIJLIL.getValue()).LIZIZ.getValue()).LIZIZ(TimeUnit.MILLISECONDS), 0L, -1L, -1L, 0L, 32);
        if (C295670BiP.LIZ()) {
            C1431480nM2 c1431480nM2 = this.LIZ;
            List<PublishImageModel> list = this.LIZIZ;
            c1431480nM2.getClass();
            for (PublishImageModel publishImageModel2 : list) {
                if (((Boolean) C281090Azz.LIZ.getValue()).booleanValue()) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    if (linkedHashMap.get(publishImageModel2.path) == null) {
                        obj = linkedHashMap.get(publishImageModel2.uri);
                    } else {
                        continue;
                    }
                } else {
                    obj = ((LinkedHashMap) map).get(publishImageModel2.path);
                }
                if (obj == null) {
                    LIZ(new C1431450nLz(-1L, "twice check failed"));
                    return;
                }
            }
        }
        C1431480nM2 c1431480nM22 = this.LIZ;
        C1434960nRe c1434960nRe = c1431480nM22.LLIZLLLIL;
        C1431070nLN c1431070nLN = null;
        if (c1434960nRe == null) {
            c1434960nRe = null;
        }
        VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
        List<PublishImageModel> list2 = this.LIZIZ;
        for (PublishImageModel publishImageModel3 : list2) {
            if (((Boolean) C281090Azz.LIZ.getValue()).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
                AbstractImageUploader.ImageUploadInfo imageUploadInfo = (AbstractImageUploader.ImageUploadInfo) linkedHashMap2.get(publishImageModel3.path);
                if (imageUploadInfo == null && (imageUploadInfo = (AbstractImageUploader.ImageUploadInfo) linkedHashMap2.get(publishImageModel3.uri)) == null) {
                    throw new Exception("uploadInfo is null");
                }
                publishImageModel3.uri = imageUploadInfo.mImageToskey;
            } else {
                publishImageModel3.uri = ((AbstractImageUploader.ImageUploadInfo) ((LinkedHashMap) map).get(publishImageModel3.path)).mImageToskey;
            }
            if (publishImageModel3.publishImageLivePhotoModel != null && map2 != null) {
                if (((LinkedHashMap) map2).get(publishImageModel3.path) != null && (publishImageLivePhotoModel = publishImageModel3.publishImageLivePhotoModel) != null) {
                    C1431630nMH c1431630nMH = (C1431630nMH) ((LinkedHashMap) map2).get(publishImageModel3.path);
                    if (c1431630nMH != null) {
                        str = c1431630nMH.LIZ;
                    } else {
                        str = null;
                    }
                    publishImageLivePhotoModel.vid = str;
                }
            }
        }
        if (((Boolean) C0ARQ.LIZ.getValue()).booleanValue()) {
            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel != null) {
                imageCurrentIndex2 = coverPublishModel.getImageCurrentIndex();
            } else {
                imageCurrentIndex2 = 0;
            }
            publishImageModel = (PublishImageModel) ListProtector.get(list2, Math.min(imageCurrentIndex2, list2.size() - 1));
        } else {
            CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel2 != null) {
                imageCurrentIndex = coverPublishModel2.getImageCurrentIndex();
            } else {
                imageCurrentIndex = 0;
            }
            publishImageModel = (PublishImageModel) ListProtector.get(list2, imageCurrentIndex);
        }
        VideoCreation videoCreation = new VideoCreation();
        videoCreation.setImageGroup(list2);
        videoCreation.setImageCoverModel(publishImageModel);
        C1431070nLN c1431070nLN2 = c1431480nM22.LLIZ;
        if (c1431070nLN2 != null && c1431070nLN2.LIZJ != C291170Bb9.LIZ()) {
            C0CHQ.LIZ().LJIIJJI();
            Integer num = Integer.MAX_VALUE;
            if (num.intValue() != Integer.MAX_VALUE) {
                int iIntValue = num.intValue();
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mock error code: ");
                sbLIZ.append(iIntValue);
                c1437510nVlLJJLIIIJ.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ));
                C1431480nM2.LJIJI(c1431480nM22, new C1434330nQd(C1431470nM1.LIZ(iIntValue), null, 2, null));
                return;
            }
        }
        C1431070nLN c1431070nLN3 = c1431480nM22.LLIZ;
        if (c1431070nLN3 != null) {
            c1431070nLN = c1431070nLN3;
        }
        c1431070nLN.LJ(new C1404470meT(videoCreation, c1404850mf5), false);
        if (!C299860BpA.LIZ() || (c1431990nMr = c1431480nM22.LLL) == null) {
            return;
        }
        c1431990nMr.LIZ.remove(c1431480nM22.LLLF);
    }
}
