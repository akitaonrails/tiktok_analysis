package X;

import android.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nLE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430980nLE {
    public final VideoPublishEditModel LIZ;
    public final InterfaceC1428340nGy LIZIZ;
    public NLEModel LIZJ;
    public SingleImageData LIZLLL;
    public SingleImageData LJ;
    public boolean LJFF;

    public final NLEModel LIZIZ() {
        PhotoTemplateInfo photoTemplateInfo;
        SingleImageData singleImageData = this.LIZLLL;
        if (singleImageData != null && (photoTemplateInfo = singleImageData.getPhotoTemplateInfo()) != null && photoTemplateInfo.getPhotoTemplateAsset() != null) {
            this.LJFF = true;
        }
        SingleImageData singleImageData2 = this.LJ;
        if (singleImageData2 != null) {
            Size sizeCn = this.LIZIZ.cn();
            return new C1449920npm(singleImageData2, sizeCn.getWidth() != 0 ? new com.bytedance.ies.cutsame.util.Size(sizeCn.getWidth(), sizeCn.getHeight()) : new com.bytedance.ies.cutsame.util.Size(C1450870nrJ.LIZIZ, C1450870nrJ.LIZ)).LIZIZ();
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final PhotoTemplateAsset LIZJ() {
        PhotoTemplateInfo photoTemplateInfo;
        SingleImageData singleImageData = this.LIZLLL;
        if (singleImageData == null || (photoTemplateInfo = singleImageData.getPhotoTemplateInfo()) == null) {
            return null;
        }
        return photoTemplateInfo.getPhotoTemplateAsset();
    }

    public final boolean LIZLLL() {
        PhotoTemplateInfo photoTemplateInfo;
        PhotoTemplateAsset photoTemplateAssetLIZJ = LIZJ();
        if (photoTemplateAssetLIZJ != null && photoTemplateAssetLIZJ.getGenerateNewImage()) {
            return true;
        }
        SingleImageData singleImageData = this.LIZLLL;
        return (singleImageData == null || (photoTemplateInfo = singleImageData.getPhotoTemplateInfo()) == null || !photoTemplateInfo.isGeneratedImage()) ? false : true;
    }

    public C1430980nLE(VideoPublishEditModel videoPublishEditModel, InterfaceC1428340nGy interfaceC1428340nGy) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = interfaceC1428340nGy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020d A[PHI: r29
      0x020d: PHI (r29v2 boolean) = (r29v1 boolean), (r29v5 boolean), (r29v5 boolean) binds: [B:86:0x0209, B:45:0x012b, B:46:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.ss.android.ugc.aweme.creative.model.edit.SingleImageData] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.ss.android.ugc.aweme.creative.model.edit.crop.CropData] */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageBufferData] */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v2, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v3, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo] */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r22v2, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult] */
    /* JADX WARN: Type inference failed for: r23v1, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageQualityInfo] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo] */
    /* JADX WARN: Type inference failed for: r28v1, types: [com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo] */
    /* JADX WARN: Type inference failed for: r30v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v2, types: [com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo] */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v2, types: [com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo] */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r37v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r37v3, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r38v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r39v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r40v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r42v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r42v2, types: [androidx.lifecycle.MutableLiveData] */
    /* JADX WARN: Type inference failed for: r42v3, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r43v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r43v3, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams] */
    /* JADX WARN: Type inference failed for: r44v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r44v3, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams] */
    /* JADX WARN: Type inference failed for: r46v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.ss.android.ugc.aweme.creative.model.edit.crop.CropData] */
    /* JADX WARN: Type inference failed for: r48v4, types: [com.ss.android.ugc.aweme.creative.model.edit.crop.CropData] */
    /* JADX WARN: Type inference failed for: r48v5 */
    /* JADX WARN: Type inference failed for: r49v0, types: [com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams] */
    /* JADX WARN: Type inference failed for: r49v2, types: [com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams] */
    /* JADX WARN: Type inference failed for: r51v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r51v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r57v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r63v0, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.creative.model.edit.SingleImageData LIZ(java.lang.String r74, int r75, int r76, com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r77, com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo r78, com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset r79, com.ss.android.ugc.effectmanager.effect.model.CategoryInfo r80, com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel r81) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1430980nLE.LIZ(java.lang.String, int, int, com.ss.android.ugc.aweme.creative.model.edit.SingleImageData, com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo, com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset, com.ss.android.ugc.effectmanager.effect.model.CategoryInfo, com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel):com.ss.android.ugc.aweme.creative.model.edit.SingleImageData");
    }
}
