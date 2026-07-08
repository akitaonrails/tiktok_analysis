package X;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.0nqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450590nqr extends AbstractC2255721DQs<InterfaceC1450630nqv> implements InterfaceC1450630nqv, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C1450600nqs.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ImageAlbumData.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451590nsT.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450620nqu.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451870nsv.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450590nqr.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1450590nqr.class, "model", "getModel()Lcom/ss/android/ugc/aweme/comment/image/model/ImageEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1450590nqr.class, "imageAlbumData", "getImageAlbumData()Lcom/ss/android/ugc/aweme/creative/model/edit/ImageAlbumData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1450590nqr.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/aweme/comment/image/preview/CommentImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1450590nqr.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/comment/image/textsticker/CommentImageEditStickerTextApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1450590nqr.class, "brushApi", "getBrushApi()Lcom/ss/android/ugc/aweme/comment/image/brush/CommentImageBrushApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJ = 8;
    }

    public InterfaceC1450630nqv w2() {
        return this;
    }

    private final InterfaceC1451870nsv G2() {
        return (InterfaceC1451870nsv) this.LLIZ.getValue(this, LLIZLLLIL[5]);
    }

    private final ImageAlbumData H2() {
        return (ImageAlbumData) this.LLILZ.getValue(this, LLIZLLLIL[2]);
    }

    private final InterfaceC1451590nsT W2() {
        return (InterfaceC1451590nsT) this.LLILZIL.getValue(this, LLIZLLLIL[3]);
    }

    private final InterfaceC1450620nqu c3() {
        return (InterfaceC1450620nqu) this.LLILZLL.getValue(this, LLIZLLLIL[4]);
    }

    private final Activity getActivity() {
        return (Activity) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    public final C1450600nqs T2() {
        return (C1450600nqs) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    @Override // X.InterfaceC1450630nqv
    public void jV0() {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        String str = T2().sessionId;
        if (str != null && str.length() != 0) {
            ((Keva) C1345630l7Z.LIZ.getValue()).storeInt(str, 1);
        }
        String str2 = T2().enterFrom;
        if (str2 == null) {
            str2 = "";
        }
        C1350920lG6.LJJLIIIJJI(str2, T2().aweme, true, false, T2().isFromInternalImagePage(), C1347720lAw.LJIIIZ());
        Activity activity = getActivity();
        if (activity == null || (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) == null || (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) == null) {
            return;
        }
        interfaceC21300818XmLIZ.LIZLLL(activity, new C1402140mai(this, 2), X1(null));
    }

    public final String o2() {
        String absolutePath;
        List<String> urlList;
        String str = T2().imageEditPath;
        if (str != null) {
            return str;
        }
        C2471909mP c2471909mP = C2471909mP.LIZ;
        CommentImageModel commentImageModel = T2().imageOriginalPath;
        String str2 = null;
        if (commentImageModel != null && (urlList = commentImageModel.getUrlList()) != null) {
            str2 = (String) C13LP.LJJJLL(urlList);
        }
        C0VSJ c0vsjLJJIJLIJ = c2471909mP.LJJIJLIJ(str2);
        return (c0vsjLJJIJLIJ == null || (absolutePath = c0vsjLJJIJLIJ.getAbsolutePath()) == null) ? "" : absolutePath;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        String str = T2().enterFrom;
        if (str == null) {
            str = "";
        }
        C1350920lG6.LLFZ(str, T2().aweme, T2().isFromInternalImagePage(), C1347720lAw.LJIIIZ());
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final void W1(NLEEditor nLEEditor) {
        String id;
        List<TextStickerModel> listC1;
        T2().editList.clear();
        T2().sessionEditList.clear();
        T2().setCreateByAi(true);
        InterfaceC1450620nqu interfaceC1450620nquC3 = c3();
        if (interfaceC1450620nquC3 != null) {
            interfaceC1450620nquC3.hide();
        }
        InterfaceC1450620nqu interfaceC1450620nquC32 = c3();
        if (interfaceC1450620nquC32 != null && (listC1 = interfaceC1450620nquC32.c1()) != null) {
            for (TextStickerModel textStickerModel : listC1) {
                InterfaceC1450620nqu interfaceC1450620nquC33 = c3();
                if (interfaceC1450620nquC33 != null) {
                    interfaceC1450620nquC33.L2(C364540EQy.LIZ(textStickerModel));
                }
            }
        }
        InterfaceC1451870nsv interfaceC1451870nsvG2 = G2();
        if (interfaceC1451870nsvG2 != null) {
            interfaceC1451870nsvG2.hide();
        }
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(0, H2().getImageList());
        if (singleImageData != null && (id = singleImageData.getId()) != null && id.length() != 0) {
            T2().videoPublishEditModel.creativeModel.imageEditModel.map.remove(id);
        }
        NLEModel model = nLEEditor.getModel();
        if (model == null) {
            return;
        }
        VecNLETrackSPtr tracks = model.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (!nLETrack.getMainTrack()) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = C13LP.LLIIII(arrayList).iterator();
        while (it2.hasNext()) {
            model.removeTrack((NLETrack) it2.next());
        }
    }

    private final AIChatPageConfig X1(String str) {
        return C21300918Xn.LIZ(new AwS611S0100000_32(this, 49));
    }

    private final void m3(String str) {
        C1463670oBx c1463670oBxGc;
        C348100Dkm c348100DkmLIZLLL;
        NLEEditor nLEEditor;
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        C1322110kVd c1322110kVd;
        C1463670oBx c1463670oBxGc2;
        C348100Dkm c348100DkmLIZLLL2;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C1463670oBx c1463670oBxGc3;
        InterfaceC1451590nsT interfaceC1451590nsTW2 = W2();
        if (interfaceC1451590nsTW2 != null && (c1463670oBxGc = interfaceC1451590nsTW2.gc()) != null && (c348100DkmLIZLLL = c1463670oBxGc.LIZLLL()) != null && (nLEEditor = c348100DkmLIZLLL.LIZ) != null) {
            W1(nLEEditor);
            NLEModel model = nLEEditor.getModel();
            if (model != null && (mainTrack = model.getMainTrack()) != null && (slotByIndex = mainTrack.getSlotByIndex(0)) != null) {
                slotByIndex.setScale(1.0f);
                slotByIndex.setTransformY(0.0f);
                slotByIndex.setTransformX(0.0f);
                slotByIndex.setMirror_X(false);
                slotByIndex.setRotation(0.0f);
                slotByIndex.removeExtraWithKey("ep_crop_scale");
                slotByIndex.removeExtraWithKey("ep_crop_transX");
                slotByIndex.removeExtraWithKey("ep_crop_transY");
                slotByIndex.removeExtraWithKey("ep_crop_degree");
                slotByIndex.removeExtraWithKey("ep_crop_ratio");
                slotByIndex.removeExtraWithKey("ep_crop_mode");
                slotByIndex.removeExtraWithKey("crop_matrix");
                slotByIndex.removeExtraWithKey("crop_slider_rotation");
                slotByIndex.removeExtraWithKey("crop_button_rotation");
                slotByIndex.removeExtraWithKey("crop_is_photo_cropped");
                slotByIndex.removeExtraWithKey("crop_mirror_x");
                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                nLEResourceAV.setResourceFile(str);
                nLESegmentVideo.setAVFile(nLEResourceAV);
                slotByIndex.setMainSegment(nLESegmentVideo);
                nLEEditor.commit();
                nLEEditor.done();
                InterfaceC1451590nsT interfaceC1451590nsTW22 = W2();
                if (interfaceC1451590nsTW22 != null && (c1463670oBxGc3 = interfaceC1451590nsTW22.gc()) != null) {
                    c1463670oBxGc3.refreshCurrentFrame();
                }
                InterfaceC1451590nsT interfaceC1451590nsTW23 = W2();
                if (interfaceC1451590nsTW23 != null && (c1463670oBxGc2 = interfaceC1451590nsTW23.gc()) != null && (c348100DkmLIZLLL2 = c1463670oBxGc2.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL2.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                    playerApi.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
                }
                InterfaceC1451590nsT interfaceC1451590nsTW24 = W2();
                View viewMu1 = null;
                if (interfaceC1451590nsTW24 != null) {
                    viewMu1 = interfaceC1451590nsTW24.mu1();
                }
                if ((viewMu1 instanceof C1322110kVd) && (c1322110kVd = (C1322110kVd) viewMu1) != null) {
                    c1322110kVd.setImageURI(UriProtector.parse(str));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i3(String str) {
        CommentImageModel commentImageModel;
        CommentImageModel commentImageModel2;
        T2().setCurrentPath(str);
        T2().setImageAiPath(str);
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(0, H2().getImageList());
        if (singleImageData == null) {
            return;
        }
        SrcImageInfo srcImageInfo = singleImageData.getSrcImageInfo();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (iIntValue <= 0) {
            iIntValue = srcImageInfo.getWidth();
        }
        if (iIntValue2 <= 0) {
            iIntValue2 = srcImageInfo.getHeight();
        }
        T2().setImageAiWidth(iIntValue);
        T2().setImageAiHeight(iIntValue2);
        singleImageData.setSrcImageInfo(new SrcImageInfo(str, iIntValue2, iIntValue, srcImageInfo.getAltText(), srcImageInfo.getRemoteUri()));
        EditImageInfo editImageInfo = singleImageData.getEditImageInfo();
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        editImageInfo.setTempSynthesisPath(null);
        editImageInfo.setTempSynthesisMiniPath(null);
        editImageInfo.setBitmapWidth(0);
        editImageInfo.setBitmapHeight(0);
        editImageInfo.setRatio(-1.0f);
        editImageInfo.setRatioMode(-1);
        editImageInfo.setInitializeScaleValue(null);
        editImageInfo.setInitializeScaleValueNLE(null);
        editImageInfo.setScaleAfterCrop(null);
        editImageInfo.setOffsetX(null);
        editImageInfo.setOffsetY(null);
        editImageInfo.setExtraRotation(null);
        editImageInfo.setButtonRotation(null);
        editImageInfo.setCanvasTransformParams(null);
        editImageInfo.setCropData(null);
        if (iIntValue > 0 && iIntValue2 > 0) {
            editImageInfo.setFullScreen(C1451140nrk.LIZ(iIntValue / iIntValue2));
        }
        singleImageData.setStickerInfo(new ImageStickerInfo(new ArrayList(), null, 2, null));
        singleImageData.setStickerInfoNewEngine(new ImageStickerInfoNewEngine(list, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 1023, objArr == true ? 1 : 0));
        singleImageData.setAdjustInfo(null);
        singleImageData.setPhotoTemplateInfo(null);
        ImageFilterInfo filterInfo = singleImageData.getFilterInfo();
        filterInfo.setComposer(false);
        filterInfo.setFilterId("");
        filterInfo.setFilterLabel(null);
        filterInfo.setFilterIntensityRatio(-1.0f);
        filterInfo.setCompareKey(null);
        filterInfo.setFilterBean(null);
        filterInfo.setFilterCategoryKey("");
        filterInfo.setNeedRender(false);
        if (iIntValue > 0 && (commentImageModel2 = T2().imageOriginalPath) != null) {
            commentImageModel2.setWidth(iIntValue);
        }
        if (iIntValue2 > 0 && (commentImageModel = T2().imageOriginalPath) != null) {
            commentImageModel.setHeight(iIntValue2);
        }
        InterfaceC1451590nsT interfaceC1451590nsTW2 = W2();
        if (interfaceC1451590nsTW2 != null) {
            interfaceC1451590nsTW2.GS();
        }
        m3(str);
    }

    public C1450590nqr(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c1drg;
    }
}
