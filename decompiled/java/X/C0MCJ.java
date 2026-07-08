package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.publish.PublishModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MCJ extends AbstractC1664470tPp<C0MEQ, Unit, Unit> implements C0MEQ, InterfaceC379610EuV {
    public static final C0MCM LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final Function0<Unit> LLILZIL = AFwS194S0000000_8.get$arr$(285);
    public final Function0<Unit> LLILZLL = AFwS194S0000000_8.get$arr$(286);
    public final C0MEQ LLIZ = this;
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413730mtP.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564820MDg.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564900MDo.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 617));
    public final int LLJJI = 10009;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 618));

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0MCM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MCJ.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0MCJ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C0MCJ.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new C2217381BqS(C0MCJ.class, "mixEditingDataApi", "getMixEditingDataApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialDataApi;", 0), new C2217381BqS(C0MCJ.class, "aiLivePromptApi", "getAiLivePromptApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePromptApi;", 0), new C2217381BqS(C0MCJ.class, "innerRootApi", "getInnerRootApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveInnerRootApi;", 0), new C2217381BqS(C0MCJ.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0)};
        LLJJIJI = new Object() { // from class: X.0MCM
        };
        LLJJIJIL = 8;
    }

    public void H3() {
    }

    private final InterfaceC1413730mtP H4() {
        return (InterfaceC1413730mtP) this.LLJIJIL.getValue(this, LLJJIJIIJIL[3]);
    }

    private final NLEEditor K4() {
        return (NLEEditor) this.LLJJ.getValue();
    }

    private final InterfaceC484050IyZ O4() {
        return (InterfaceC484050IyZ) this.LLJJIII.getValue();
    }

    private final InterfaceC564820MDg Q3() {
        return (InterfaceC564820MDg) this.LLJILJIL.getValue(this, LLJJIJIIJIL[4]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJIJIIJIL[0]);
    }

    private final InterfaceC1451520nsM o4() {
        return (InterfaceC1451520nsM) this.LLJI.getValue(this, LLJJIJIIJIL[2]);
    }

    public Bundle B3() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("shoot_way", getEditModel().mShootWay, bundle);
        C786410Ut5.LJJJI("content_source", C1428470nHB.LJIILIIL(getEditModel()), bundle);
        C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(getEditModel()), bundle);
        C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle);
        C786410Ut5.LJJJI("enter_method", getEditModel().getShootEnterMethod(), bundle);
        C537520L6g.LJFF(bundle, getEditModel().getCreativeInfo());
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_set_column_count", 3);
        bundle.putInt("key_support_flag", 25);
        bundle.putBoolean("Key_enable_single_select_mode", true);
        bundle.putInt("key_choose_scene", 59);
        return bundle;
    }

    public final InterfaceC564900MDo F4() {
        return (InterfaceC564900MDo) this.LLJILJILJ.getValue(this, LLJJIJIIJIL[5]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJ.getValue(this, LLJJIJIIJIL[1]);
    }

    public final InterfaceC1460000o62 z4() {
        return (InterfaceC1460000o62) this.LLJILLL.getValue(this, LLJJIJIIJIL[6]);
    }

    private final InterfaceC524950KiL O3() {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) getDiContainer().LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL == null ? C0MWZ.LIZ(this.LLILZ) : interfaceC524950KiL;
    }

    public void E3() {
        InterfaceC1451520nsM interfaceC1451520nsMO4 = o4();
        if (interfaceC1451520nsMO4 != null) {
            interfaceC1451520nsMO4.m7("edit change media");
        }
        InterfaceC1413730mtP interfaceC1413730mtPH4 = H4();
        if (interfaceC1413730mtPH4 != null) {
            interfaceC1413730mtPH4.yc1();
        }
        if (getEditModel().isLivePhotoEdit()) {
            getEditModel().creativeModel.livePhotoModel = null;
            InterfaceC1460000o62 interfaceC1460000o62Z4 = z4();
            if (interfaceC1460000o62Z4 != null) {
                interfaceC1460000o62Z4.Uh1(1105, false);
            }
        }
        getEditModel().getAILivePhotoModel().lastStatus = null;
        getEditModel().getAILivePhotoModel().progressModel = new ProgressModel(UsageStatus.NOT_APPLY, getEditModel().getAILivePhotoModel().LIZJ(), null, null, "", "", 0, 0, null, "", 0L, getEditModel().getAILivePhotoModel().LIZIZ().bindMixMaterial, -1L, 0);
        InterfaceC564900MDo interfaceC564900MDoF4 = F4();
        if (interfaceC564900MDoF4 != null) {
            interfaceC564900MDoF4.Re0();
        }
        InterfaceC564820MDg interfaceC564820MDgQ3 = Q3();
        if (interfaceC564820MDgQ3 != null) {
            interfaceC564820MDgQ3.Fc1();
        }
        C1403010mc7.LIZ.getMusicService().al();
        C2275708vr.LIZ();
        new C1416910myX(getDiContainer()).LJII();
        InterfaceC564820MDg interfaceC564820MDgQ32 = Q3();
        if (interfaceC564820MDgQ32 != null) {
            interfaceC564820MDgQ32.YU1();
        }
    }

    @Override // X.C0MEQ
    public void LLLLIILL() {
        Bundle bundleB3 = B3();
        InterfaceC569060MTo interfaceC569060MToLIZ = C1660680tJi.LIZ();
        Activity activityLJII = C1664590tQ1.LJII(this);
        int i = this.LLJJI;
        interfaceC569060MToLIZ.LIZJ(activityLJII, bundleB3, i, i);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC524950KiL interfaceC524950KiLO3 = O3();
        if (interfaceC524950KiLO3 != null) {
            interfaceC524950KiLO3.Qh(O4());
        }
    }

    public int P4() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    /* JADX INFO: renamed from: e4, reason: merged with bridge method [inline-methods] */
    public C0MEQ getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLILZLL;
    }

    private final List<EditMedia> T4(Intent intent) {
        ArrayList<MediaModel> parcelableArrayListExtra;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) == null || parcelableArrayListExtra.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : parcelableArrayListExtra) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.W3().getPath());
            sbLIZ.append(File.separator);
            sbLIZ.append(mediaModel.relativePath);
            sbLIZ.append(mediaModel.fileName);
            arrayList.add(new EditMedia(mediaModel.LJFF(), mediaModel.LJIILJJIL(), C2188811AlT.LIZIZ(sbLIZ), null, Long.valueOf(mediaModel.startTime), Long.valueOf(mediaModel.endTime), mediaModel.aigcInfo, Boolean.FALSE, ""));
        }
        return arrayList;
    }

    public C0MCJ(C1DRG c1drg, C19A3 c19a3) {
        this.LLILLL = c1drg;
        this.LLILZ = c19a3;
    }

    public final void Z4(Intent intent, long j) {
        ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_fix_change_photo", true, true)) {
            getEditModel().creativeModel.editModel.multiEditVideoStatusRecordData = null;
            v3(parcelableArrayListExtra, j);
        } else if (parcelableArrayListExtra.size() == 1) {
            v3(parcelableArrayListExtra, j);
        } else {
            C0MCR c0mcr = C0MCR.LIZ;
            NLEEditor nLEEditorK4 = K4();
            CreativeModel creativeModel = getEditModel().creativeModel;
            c0mcr.getClass();
            C0MCR.LJIIIZ(nLEEditorK4, creativeModel, false);
        }
        d5(intent, getEditModel());
    }

    public final void d5(Intent intent, VideoPublishEditModel videoPublishEditModel) {
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

    public final void v3(ArrayList<MediaModel> arrayList, long j) {
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
        VideoPublishEditModel editModel2 = getEditModel();
        C538330L9j c538330L9j = new C538330L9j(publishModel.videoCanvasWidth, publishModel.videoCanvasHeight, 12);
        CanvasVideoData canvasVideoData2 = getEditModel().getCanvasVideoData();
        if (canvasVideoData2 == null || (list = canvasVideoData2.sourceInfo) == null || (str = (String) C13LP.LJJJLL(list)) == null) {
            str = "";
        }
        editModel2.setEditPreviewInfo(c538330L9j.LIZ(new EditVideoSegment(str, null, new VideoFileInfo(mediaModel.width, mediaModel.height, j, 0, 0, 0, 0, 0, 0.0f, 504, null))));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q3(java.util.List<com.ss.ugc.android.editor.core.api.params.EditMedia> r18, X.C350990DpR r19, kotlin.jvm.functions.Function1<? super com.bytedance.ies.nle.editor_jni.NLETrackSlot, kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MCJ.q3(java.util.List, X.0DpR, kotlin.jvm.functions.Function1):void");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        List<EditMedia> listT4;
        NLETrack mainTrack;
        if (i != this.LLJJI || i2 != -1 || intent == null || (listT4 = T4(intent)) == null || (mainTrack = K4().getModel().getMainTrack()) == null) {
            return false;
        }
        long maxEnd = mainTrack.getMaxEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        q3(listT4, new C350990DpR(null, Long.valueOf(maxEnd), 0, null, false, false, false, null, 4089), null);
        Z4(intent, maxEnd);
        E3();
        H3();
        return true;
    }
}
