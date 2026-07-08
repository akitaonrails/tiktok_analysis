package X;

import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNodeSrcInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0nNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432420nNY implements InterfaceC1430300nK8, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664740tQG LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1432420nNY.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1432420nNY.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1432420nNY.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1432420nNY.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1432420nNY.class, "imageGlobalStickerApi", "getImageGlobalStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final InterfaceC1451050nrb LIZIZ() {
        return (InterfaceC1451050nrb) this.LLILLL.getValue(this, LLIZ[1]);
    }

    public final VideoPublishEditModel LIZJ() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1432420nNY(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1451050nrb.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1450920nrO.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1441090nbX.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1464960oE2.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1430300nK8
    public final void LIZ(AIChatGenNode aIChatGenNode) {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        ImageAlbumData imageAlbumData = LIZJ().getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(LIZIZ().h7(), imageList)) != null) {
            int size = LIZJ().creativeModel.imageEditModel.map.size();
            AIChatGenNodeSrcInfo srcInfo = aIChatGenNode.getSrcInfo();
            if (srcInfo != null) {
                SrcImageInfo srcImageInfo = new SrcImageInfo(srcInfo.getPath(), srcInfo.getHeight(), srcInfo.getWidth(), null, null, 24, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LIZJ().getCreationId());
                sbLIZ.append('_');
                sbLIZ.append(size);
                sbLIZ.append('_');
                sbLIZ.append(System.currentTimeMillis());
                SingleImageData singleImageData2 = new SingleImageData(C2188811AlT.LIZIZ(sbLIZ), null, srcImageInfo, singleImageData.getBufferData(), singleImageData.getEditImageInfo(), singleImageData.getFilterInfo(), singleImageData.getAdjustInfo(), singleImageData.getStickerInfo(), singleImageData.getStickerInfoNewEngine(), singleImageData.getSynthesisData(), singleImageData.getImageQualityInfo(), singleImageData.getImageAIGCType(), singleImageData.getAigcInfo(), singleImageData.getOriginAlbumImageData(), singleImageData.getPhotoTemplateInfo(), singleImageData.getReuseEffectTemplateInfo(), singleImageData.isText2Image(), singleImageData.getSrcLiveInfo(), singleImageData.getCameraPhotoInfo(), new ImageVideoSharedModel(aIChatGenNode.getUuid()), 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 7340034, 0 == true ? 1 : 0);
                NLEModel nLEModelLIZIZ = new C1449920npm(singleImageData2, new Size(singleImageData2.getSrcImageInfo().getWidth(), singleImageData2.getSrcImageInfo().getHeight())).LIZIZ();
                String id = singleImageData2.getId();
                if (id == null) {
                    return;
                }
                LIZJ().creativeModel.imageEditModel.map.remove(id);
                C1664750tQH c1664750tQH = this.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
                ((InterfaceC1450920nrO) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).qz(id, nLEModelLIZIZ);
                C1450610nqt c1450610nqt = (C1450610nqt) ((InterfaceC1450920nrO) this.LLILZ.getValue(this, interfaceC2217461BqaArr[2])).V51(C1450610nqt.class);
                if (c1450610nqt != null) {
                    c1450610nqt.LJ = false;
                }
                LIZIZ().F71(LIZIZ().h7(), singleImageData2);
                InterfaceC1441090nbX interfaceC1441090nbX = (InterfaceC1441090nbX) this.LLILZIL.getValue(this, interfaceC2217461BqaArr[3]);
                if (interfaceC1441090nbX != null) {
                    interfaceC1441090nbX.f6(LIZIZ().h7(), singleImageData2.getSrcImageInfo().getPath());
                }
                InterfaceC1464960oE2 interfaceC1464960oE2 = (InterfaceC1464960oE2) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[4]);
                if (interfaceC1464960oE2 != null) {
                    interfaceC1464960oE2.LLLLZLL(true);
                }
            }
        }
    }
}
