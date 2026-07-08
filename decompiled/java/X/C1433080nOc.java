package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageIntParam;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433080nOc implements InterfaceC1454000nwM, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public NLEModel LLILLJJLI;
    public SingleImageData LLILLL;
    public String LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 111));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 110));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1433080nOc.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1433080nOc.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1433080nOc.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1454000nwM
    public final void LJ() {
        InterfaceC1452170ntP interfaceC1452170ntPLJII;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        InterfaceC1452170ntP interfaceC1452170ntPLJII2;
        NLEModel nLEModel = this.LLILLJJLI;
        if (nLEModel != null && (interfaceC1452170ntPLJII2 = LJII()) != null) {
            interfaceC1452170ntPLJII2.yc(nLEModel);
        }
        SingleImageData singleImageData = this.LLILLL;
        if (singleImageData != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
            SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
            if (!C13LP.LJJJJ(srcLiveInfo != null ? srcLiveInfo.getLivePhotoPreviewMode() : null, listLJIIJJI) || (interfaceC1452170ntPLJII = LJII()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJII)) == null || (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
                return;
            }
            playerApi.play();
        }
    }

    public final InterfaceC1451050nrb LJI() {
        return (InterfaceC1451050nrb) this.LLILZLL.getValue(this, LLJI[1]);
    }

    public final InterfaceC1452170ntP LJII() {
        return (InterfaceC1452170ntP) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo LJIIIIZZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1433080nOc.LJIIIIZZ():com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo");
    }

    @Override // X.InterfaceC1454000nwM
    public final void LIZIZ() {
        String id;
        InterfaceC1452170ntP interfaceC1452170ntPLJII = LJII();
        this.LLILLJJLI = interfaceC1452170ntPLJII != null ? C352130DrH.LIZ(interfaceC1452170ntPLJII) : null;
        this.LLILLL = ((InterfaceC1450920nrO) this.LLIZ.getValue(this, LLJI[2])).OR1();
        InterfaceC1452170ntP interfaceC1452170ntPLJII2 = LJII();
        this.LLILZ = interfaceC1452170ntPLJII2 != null ? interfaceC1452170ntPLJII2.Zf() : null;
        SingleImageData singleImageData = this.LLILLL;
        if (singleImageData == null || (id = singleImageData.getId()) == null) {
            return;
        }
        LJIIIZ(this.LLILLJJLI, id, this.LLILZ);
    }

    @Override // X.InterfaceC1454000nwM
    public final NLEModel LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1433080nOc(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC1451050nrb.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1450920nrO.class, null);
    }

    public static AIGCInfo LJFF(CollageInfo collageInfo) {
        AIGCInfo aIGCInfo = null;
        for (CollageInnerImageInfo collageInnerImageInfo : collageInfo.getCollageImageList()) {
            C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("combineAIGCInfo ");
            sbLIZ.append(collageInnerImageInfo.getAigcInfo());
            C201955140j.LIZLLL(c552700Lm0, "ImageCollageComponent", C2188811AlT.LIZIZ(sbLIZ));
            AIGCInfo aigcInfo = collageInnerImageInfo.getAigcInfo();
            if (aigcInfo != null) {
                if (aIGCInfo == null) {
                    aIGCInfo = new AIGCInfo(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 131071, null);
                }
                C140C.LIZIZ(aIGCInfo, aigcInfo);
            }
        }
        return aIGCInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1454000nwM
    public final SingleImageData LIZLLL(C1433110nOf c1433110nOf) {
        SrcImageInfo srcImageInfoLJIIIIZZ;
        String aiChatGenNodeId;
        String strZf;
        CollageIntParam collageIntParam = c1433110nOf.LIZ;
        NLEModel nLEModelLIZ = null;
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
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        if (collageIntParam == null || (srcImageInfoLJIIIIZZ = LJIIIIZZ()) == null) {
            return null;
        }
        int iH7 = LJI().h7();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1431780nMW.LIZ.getClass();
        sbLIZ.append(C1431780nMW.LIZ(iH7));
        sbLIZ.append("_collage");
        CollageInfo collageInfo = new CollageInfo(C2188811AlT.LIZIZ(sbLIZ), srcImageInfoLJIIIIZZ, collageIntParam, c1433110nOf.LIZIZ);
        Iterator<CollageInnerImageInfo> it2 = collageInfo.getCollageImageList().iterator();
        while (true) {
            if (it2.hasNext()) {
                aiChatGenNodeId = it2.next().getAiChatGenNodeId();
                if (aiChatGenNodeId != null) {
                    break;
                }
            } else {
                aiChatGenNodeId = null;
                break;
            }
        }
        C1431780nMW.LIZ.getClass();
        String strLIZ = C1431780nMW.LIZ(iH7);
        int i = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        ImageVideoSharedModel imageVideoSharedModel = null;
        EditImageInfo editImageInfo = new EditImageInfo(objArr29 == true ? 1 : 0, objArr28 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, objArr27 == true ? 1 : 0, objArr26 == true ? 1 : 0, objArr25 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr23 == true ? 1 : 0, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, objArr20 == true ? 1 : 0, 0 == true ? 1 : 0, objArr19 == true ? 1 : 0, 0 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, 2097151, objArr16 == true ? 1 : 0);
        editImageInfo.setFullScreen(C1450870nrJ.LJIIJ(srcImageInfoLJIIIIZZ.getWidth() / srcImageInfoLJIIIIZZ.getHeight()));
        if (aiChatGenNodeId != null) {
            imageVideoSharedModel = new ImageVideoSharedModel(aiChatGenNodeId);
        }
        SingleImageData singleImageData = new SingleImageData(strLIZ, objArr15 == true ? 1 : 0, srcImageInfoLJIIIIZZ, objArr14 == true ? 1 : 0, editImageInfo, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, i, LJFF(collageInfo), objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr31 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, imageVideoSharedModel, collageInfo, objArr2 == true ? 1 : 0, objArr30 == true ? 1 : 0, 6811618, objArr == true ? 1 : 0);
        InterfaceC1452170ntP interfaceC1452170ntPLJII = LJII();
        if (interfaceC1452170ntPLJII != null) {
            strZf = interfaceC1452170ntPLJII.Zf();
        } else {
            strZf = null;
        }
        InterfaceC1452170ntP interfaceC1452170ntPLJII2 = LJII();
        if (interfaceC1452170ntPLJII2 != null) {
            nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPLJII2);
        }
        LJIIIZ(nLEModelLIZ, collageInfo.getId(), strZf);
        return singleImageData;
    }

    @Override // X.InterfaceC1454000nwM
    public final boolean LIZJ(SingleImageData singleImageData, C1433110nOf c1433110nOf) {
        SrcImageInfo srcImageInfoLJIIIIZZ;
        String strZf;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        String strZf2;
        CollageIntParam collageIntParam = c1433110nOf.LIZ;
        if (collageIntParam == null || (srcImageInfoLJIIIIZZ = LJIIIIZZ()) == null) {
            return false;
        }
        int iH7 = LJI().h7();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1431780nMW.LIZ.getClass();
        sbLIZ.append(C1431780nMW.LIZ(iH7));
        sbLIZ.append("_collage");
        CollageInfo collageInfo = new CollageInfo(C2188811AlT.LIZIZ(sbLIZ), srcImageInfoLJIIIIZZ, collageIntParam, c1433110nOf.LIZIZ);
        singleImageData.setCollageInfo(collageInfo);
        singleImageData.setSrcImageInfo(srcImageInfoLJIIIIZZ);
        singleImageData.setAigcInfo(LJFF(collageInfo));
        InterfaceC1452170ntP interfaceC1452170ntPLJII = LJII();
        NLEModel nLEModelLIZ2 = null;
        if (interfaceC1452170ntPLJII != null) {
            strZf = interfaceC1452170ntPLJII.Zf();
        } else {
            strZf = null;
        }
        InterfaceC1452170ntP interfaceC1452170ntPLJII2 = LJII();
        if (interfaceC1452170ntPLJII2 != null) {
            nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPLJII2);
        } else {
            nLEModelLIZ = null;
        }
        LJIIIZ(nLEModelLIZ, collageInfo.getId(), strZf);
        NLEModel nLEModel = this.LLILLJJLI;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(mainTrack.getSlots())) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
            nLESegmentVideoDynamicCast.setAVFile(C0LIZ.LIZ(singleImageData.getSrcImageInfo(), ((long) 10000) * 1000));
            NLEModel nLEModel2 = this.LLILLJJLI;
            if (nLEModel2 != null) {
                InterfaceC1452170ntP interfaceC1452170ntPLJII3 = LJII();
                if (interfaceC1452170ntPLJII3 != null) {
                    interfaceC1452170ntPLJII3.yc(nLEModel2);
                }
                InterfaceC1452170ntP interfaceC1452170ntPLJII4 = LJII();
                if (interfaceC1452170ntPLJII4 != null) {
                    strZf2 = interfaceC1452170ntPLJII4.Zf();
                } else {
                    strZf2 = null;
                }
                InterfaceC1452170ntP interfaceC1452170ntPLJII5 = LJII();
                if (interfaceC1452170ntPLJII5 != null) {
                    nLEModelLIZ2 = C352130DrH.LIZ(interfaceC1452170ntPLJII5);
                }
                String id = singleImageData.getId();
                if (id != null) {
                    LJIIIZ(nLEModelLIZ2, id, strZf2);
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void LJIIIZ(NLEModel nLEModel, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            ((VideoPublishEditModel) this.LLILZIL.getValue(this, LLJI[0])).creativeModel.imageEditModel.map.put(str, str2);
        } else {
            ((VideoPublishEditModel) this.LLILZIL.getValue(this, LLJI[0])).creativeModel.imageEditModel.map.remove(str);
        }
        ((InterfaceC1450920nrO) this.LLIZ.getValue(this, LLJI[2])).qz(str, nLEModel);
    }
}
