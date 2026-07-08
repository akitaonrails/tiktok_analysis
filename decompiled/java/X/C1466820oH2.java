package X;

import Y.AfS114S0300000_22;
import android.graphics.Bitmap;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0oH2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466820oH2 implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Unit> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
            case 2:
                subscribe$2(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C1466820oH2 c1466820oH2, InterfaceC2329309At interfaceC2329309At) {
        Size size;
        NLETrackSlot slotByIndex;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyTemplate create ");
        sbLIZ.append(((SingleImageData) c1466820oH2.l0).getId());
        C385200F8k.LIZJ("ReuseTemplateProcessorComponent", C2188811AlT.LIZIZ(sbLIZ));
        PhotoTemplateAsset photoTemplateAsset = ((C1441070nbV) c1466820oH2.l1).H2().creativeModel.imageEffectTemplateData.templateAsset;
        if (photoTemplateAsset == null) {
            interfaceC2329309At.onError(new RuntimeException("applyTemplate photoTemplateAsset null"));
            return;
        }
        C1430980nLE c1430980nLET2 = ((C1441070nbV) c1466820oH2.l1).T2();
        String path = ((SingleImageData) c1466820oH2.l0).getSrcImageInfo().getPath();
        int width = ((SingleImageData) c1466820oH2.l0).getSrcImageInfo().getWidth();
        int height = ((SingleImageData) c1466820oH2.l0).getSrcImageInfo().getHeight();
        SingleImageData singleImageData = (SingleImageData) c1466820oH2.l0;
        SingleImageData singleImageDataLIZ = c1430980nLET2.LIZ(path, width, height, singleImageData, singleImageData.getEditImageInfo(), photoTemplateAsset, null, ((SingleImageData) c1466820oH2.l0).getImageVideoSharedModel());
        ImageAlbumData imageAlbumData = ((C1441070nbV) c1466820oH2.l1).H2().getImageAlbumData();
        if (imageAlbumData != null) {
            if (imageAlbumData.getSurfaceData().getSurfaceViewWidth() != 0) {
                ImageAlbumData imageAlbumData2 = ((C1441070nbV) c1466820oH2.l1).H2().getImageAlbumData();
                if (imageAlbumData2 != null) {
                    int surfaceViewWidth = imageAlbumData2.getSurfaceData().getSurfaceViewWidth();
                    ImageAlbumData imageAlbumData3 = ((C1441070nbV) c1466820oH2.l1).H2().getImageAlbumData();
                    if (imageAlbumData3 != null) {
                        size = new Size(surfaceViewWidth, imageAlbumData3.getSurfaceData().getSurfaceViewHeight());
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                size = new Size(C1450870nrJ.LIZIZ, C1450870nrJ.LIZ);
            }
            NLEModel nLEModelLIZIZ = new C1449920npm(singleImageDataLIZ, size).LIZIZ();
            NLETrack mainTrack = nLEModelLIZIZ.getMainTrack();
            if (mainTrack != null && (slotByIndex = mainTrack.getSlotByIndex(0)) != null) {
                C1441070nbV c1441070nbV = (C1441070nbV) c1466820oH2.l1;
                SingleImageData singleImageData2 = (SingleImageData) c1466820oH2.l0;
                c1441070nbV.LLJ = singleImageData2;
                C11HU c11huLJJ = c1441070nbV.LLJILLL.LJ(0, photoTemplateAsset, slotByIndex, nLEModelLIZIZ, c1441070nbV, new AwS388S0200000_22(singleImageData2, c1441070nbV, 20)).LJJ(C1701940uOG.LIZIZ());
                C1441070nbV c1441070nbV2 = (C1441070nbV) c1466820oH2.l1;
                SingleImageData singleImageData3 = (SingleImageData) c1466820oH2.l0;
                C11KT c11kt = (C11KT) interfaceC2329309At;
                c11huLJJ.LJJIIZ(new AfS114S0300000_22(c1441070nbV2, singleImageData3, c11kt, 0), new AfS114S0300000_22(c1441070nbV2, singleImageData3, c11kt, 1));
                return;
            }
            interfaceC2329309At.onError(new RuntimeException("applyTemplate trackSlot null"));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void subscribe$1(C1466820oH2 c1466820oH2, InterfaceC2329309At interfaceC2329309At) {
        Bitmap cover = ((IAVPublishService) ((C1434070nQD) c1466820oH2.l0).LLILZLL.getValue()).getCover((PublishModel) c1466820oH2.l1);
        if (cover != null) {
            interfaceC2329309At.onSuccess(cover);
        }
    }

    public static final void subscribe$2(C1466820oH2 c1466820oH2, InterfaceC2329309At interfaceC2329309At) {
        Bitmap cover;
        IAVPublishService iAVPublishService = (IAVPublishService) ((C1434090nQF) c1466820oH2.l0).LLILZLL.getValue();
        if (iAVPublishService != null && (cover = iAVPublishService.getCover((PublishModel) c1466820oH2.l1)) != null) {
            interfaceC2329309At.onSuccess(cover);
        }
    }

    public C1466820oH2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
