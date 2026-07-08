package X;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MCI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCI extends AbstractC2255721DQs<C0MCN> implements C0MCN, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final MutableLiveData<Unit> LLILLL = new MutableLiveData<>();
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413730mtP.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564930MDr.class, null);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 570));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 571));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MCI.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MCI.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MCI.class, "mixEditingDataApi", "getMixEditingDataApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialDataApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0MCI.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0MCI.class, "mixEditingMaterialAiAliveApi", "getMixEditingMaterialAiAliveApi()Lcom/ss/android/ugc/gamora/editor/mixediting/ailive/MixEditingMaterialAiAliveApi;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILJIL = 8;
    }

    public C0MCN G2() {
        return this;
    }

    private final InterfaceC1460000o62 H2() {
        return (InterfaceC1460000o62) this.LLIZ.getValue(this, LLJIJIL[3]);
    }

    private final InterfaceC1413730mtP T2() {
        return (InterfaceC1413730mtP) this.LLILZLL.getValue(this, LLJIJIL[2]);
    }

    private final InterfaceC564930MDr W2() {
        return (InterfaceC564930MDr) this.LLIZLLLIL.getValue(this, LLJIJIL[4]);
    }

    private final NLEEditor c3() {
        return (NLEEditor) this.LLJ.getValue();
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJIJIL[1]);
    }

    private final InterfaceC484050IyZ i3() {
        return (InterfaceC484050IyZ) this.LLJI.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJIJIL[0]);
    }

    private final void o2() {
        InterfaceC1413730mtP interfaceC1413730mtPT2 = T2();
        if (interfaceC1413730mtPT2 != null) {
            interfaceC1413730mtPT2.yc1();
        }
        getEditModel().getAILivePhotoModel().progressModel = new ProgressModel(UsageStatus.NOT_APPLY, getEditModel().getAILivePhotoModel().LIZJ(), null, null, "", "", 0, 0, null, "", 0L, getEditModel().getAILivePhotoModel().LIZIZ().bindMixMaterial, -1L, 0);
    }

    private final InterfaceC524950KiL w2() {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) getDiContainer().LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL == null ? C0MWZ.LIZ(this.LLILLJJLI) : interfaceC524950KiL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC524950KiL interfaceC524950KiLW2 = w2();
        if (interfaceC524950KiLW2 != null) {
            interfaceC524950KiLW2.Qh(i3());
        }
    }

    @Override // X.C0MCN
    public LiveData<Unit> Y() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        G2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final void Z1(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.creativeModel.aiSelfModel.styleName = null;
    }

    private final void q3(MediaModel mediaModel) {
        NLETrack mainTrack = c3().getModel().getMainTrack();
        if (mainTrack == null) {
            return;
        }
        long maxEnd = mainTrack.getMaxEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getPath());
        sbLIZ.append(File.separator);
        sbLIZ.append(mediaModel.relativePath);
        sbLIZ.append(mediaModel.fileName);
        W1(C1697810uHb.LJIILJJIL(new EditMedia(mediaModel.LJFF(), mediaModel.LJIILJJIL(), C2188811AlT.LIZIZ(sbLIZ), null, Long.valueOf(mediaModel.startTime), Long.valueOf(mediaModel.endTime), mediaModel.aigcInfo, Boolean.FALSE, "")), new C350990DpR(null, Long.valueOf(maxEnd), 0, null, false, false, false, null, 4089), null);
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("key_choose_media_data", C1697810uHb.LJ(mediaModel));
        v3(intent, maxEnd);
        o2();
        if (m3(getEditModel(), mediaModel)) {
            getEditModel().creativeModel.livePhotoModel = null;
            InterfaceC1460000o62 interfaceC1460000o62H2 = H2();
            if (interfaceC1460000o62H2 != null) {
                interfaceC1460000o62H2.Uh1(1105, false);
            }
            InterfaceC1460000o62 interfaceC1460000o62H22 = H2();
            if (interfaceC1460000o62H22 != null) {
                interfaceC1460000o62H22.refresh();
            }
        }
    }

    public C0MCI(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }

    private final void B3(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return;
        }
        videoPublishEditModel.setImportInfoList(new ArrayList<>());
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
            int i = 0;
            for (Object obj : parcelableArrayListExtra) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(C574070MfN.LIZJ((MediaModel) obj, i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            importInfoList.addAll(arrayList);
        }
    }

    private final void X1(ArrayList<MediaModel> arrayList, long j) {
        String str;
        List<String> list;
        MediaModel mediaModel = (MediaModel) C13LP.LJJJJZI(arrayList);
        VideoPublishEditModel editModel = getEditModel();
        AIGCInfo aIGCInfo = null;
        CanvasVideoData canvasVideoData = new CanvasVideoData(null, null, null, null, null, 0, null, 0, null, null, null, null, 4095, null);
        canvasVideoData.setCanvasType(0);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<MediaModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LJFF());
        }
        canvasVideoData.setSourceInfo(new ArrayList(arrayList2));
        MediaModel mediaModel2 = (MediaModel) C13LP.LJJJLL(arrayList);
        if (mediaModel2 != null) {
            aIGCInfo = mediaModel2.aigcInfo;
        }
        canvasVideoData.setAigcInfo(aIGCInfo);
        editModel.setCanvasVideoData(canvasVideoData);
        PublishModel publishModel = getEditModel().creativeModel.publishModel;
        if (publishModel.videoCanvasWidth == 0 || publishModel.videoCanvasHeight == 0) {
            publishModel.videoCanvasWidth = 1080;
            publishModel.videoCanvasHeight = 1920;
        }
        VideoPublishEditModel editModel2 = getEditModel();
        C538330L9j c538330L9j = new C538330L9j(publishModel.videoCanvasWidth, publishModel.videoCanvasHeight, 12);
        CanvasVideoData canvasVideoData2 = getEditModel().getCanvasVideoData();
        if (canvasVideoData2 == null || (list = canvasVideoData2.sourceInfo) == null || (str = (String) C13LP.LJJJLL(list)) == null) {
            str = "";
        }
        editModel2.setEditPreviewInfo(c538330L9j.LIZ(new EditVideoSegment(str, null, new VideoFileInfo(mediaModel.width, mediaModel.height, j, 0, 0, 0, 0, 0, 0.0f, 504, null))));
    }

    private final boolean m3(VideoPublishEditModel videoPublishEditModel, MediaModel mediaModel) {
        LivePhotoModel livePhotoModel;
        List<? extends MediaModel> list;
        MediaModel mediaModel2;
        if (!videoPublishEditModel.isLivePhotoEdit() || (livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel) == null || (list = livePhotoModel.importedLivePhotoList) == null || (mediaModel2 = (MediaModel) C13LP.LJJJLL(list)) == null || Intrinsics.LJFF(mediaModel2.LJFF(), mediaModel.LJFF())) {
            return false;
        }
        return true;
    }

    private final void v3(Intent intent, long j) {
        ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_fix_change_photo", true, true)) {
            getEditModel().creativeModel.editModel.multiEditVideoStatusRecordData = null;
        } else {
            C0MCR c0mcr = C0MCR.LIZ;
            NLEEditor nLEEditorC3 = c3();
            CreativeModel creativeModel = getEditModel().creativeModel;
            c0mcr.getClass();
            C0MCR.LJIIIZ(nLEEditorC3, creativeModel, false);
        }
        X1(parcelableArrayListExtra, j);
        B3(intent, getEditModel());
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void W1(java.util.List<com.ss.ugc.android.editor.core.api.params.EditMedia> r19, X.C350990DpR r20, kotlin.jvm.functions.Function1<? super com.bytedance.ies.nle.editor_jni.NLETrackSlot, kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MCI.W1(java.util.List, X.0DpR, kotlin.jvm.functions.Function1):void");
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        MediaModel mediaModel;
        Serializable serializableExtra;
        if (i == 12359 && i2 == -1) {
            VideoPublishEditModel videoPublishEditModel = null;
            if (intent != null) {
                mediaModel = (MediaModel) intent.getParcelableExtra("ai_live_select_media");
                serializableExtra = intent.getSerializableExtra("video_publish_edit_model");
            } else {
                mediaModel = null;
                serializableExtra = null;
            }
            if (serializableExtra instanceof VideoPublishEditModel) {
                videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
            }
            if (mediaModel == null || videoPublishEditModel == null) {
                return true;
            }
            C0MCR c0mcr = C0MCR.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            NLEModel model = c3().getModel();
            c0mcr.getClass();
            boolean z = !Intrinsics.LJFF(mediaModel.LJFF(), C0MCR.LJFF(editModel, model));
            if (z) {
                q3(mediaModel);
                InterfaceC564930MDr interfaceC564930MDrW2 = W2();
                if (interfaceC564930MDrW2 != null) {
                    interfaceC564930MDrW2.aA0();
                }
            }
            new AwS587S0100000_8(videoPublishEditModel, 364).invoke(getEditModel().getAILivePhotoModel().pageDataCache);
            getEditModel().getAILivePhotoModel().mobParam = videoPublishEditModel.getAILivePhotoModel().mobParam;
            getEditModel().setOrigin(videoPublishEditModel.getOrigin());
            if (z) {
                Z1(getEditModel());
            }
            this.LLILLL.setValue(Unit.LIZ);
            return true;
        }
        return false;
    }
}
