package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.12PS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PS extends AbstractC1664510tPt<C12PQ> implements C12PQ {
    public static final C0FDJ LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public C19750112Pb LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public long LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final C01GW LLJJJ;
    public final C12PU LLJJJIL;
    public boolean LLJJJJ;
    public final LiveEvent<Unit> LLJJJJJIL;
    public final LiveEvent<Unit> LLJJJJLIIL;
    public final LiveData<Boolean> LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12PS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C12PS.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C12PS.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C12PS.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0), new C2217381BqS(C12PS.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0), new C2217381BqS(C12PS.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0), new C2217381BqS(C12PS.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0)};
        LLJJLIIIJLLLLLLLZ = new C0FDJ();
        LLJLIL = 8;
    }

    @Override // X.InterfaceC1455730nz9
    public void Fd0(boolean z) {
    }

    @Override // X.AbstractC1664510tPt
    public int q3() {
        return R.layout.enr;
    }

    @Override // X.InterfaceC1455730nz9
    public void zp(float f, float f2) {
    }

    private final C1451630nsX O4() {
        return (C1451630nsX) this.LLJJIJIL.getValue(this, LLJL[6]);
    }

    private final InterfaceC19530111b1 P4() {
        return (InterfaceC19530111b1) this.LLJJIJIIJIL.getValue(this, LLJL[5]);
    }

    private final int T4() {
        return ((Number) this.LLJJJ.getValue()).intValue();
    }

    private final AbstractC214814194y Z4() {
        return (AbstractC214814194y) this.LLJILJILJ.getValue(this, LLJL[1]);
    }

    private final C12SF d5() {
        return (C12SF) this.LLJJIJI.getValue(this, LLJL[4]);
    }

    private final InterfaceC19753012Qe k5() {
        return (InterfaceC19753012Qe) this.LLJJIII.getValue(this, LLJL[3]);
    }

    public final InterfaceC1455860nzM K4() {
        return (InterfaceC1455860nzM) this.LLJILJIL.getValue(this, LLJL[0]);
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9
    public void LJJJJIZL() {
        C12PU c12pu = this.LLJJJIL;
        C12PV c12pv = c12pu.LIZLLL;
        if (c12pv != null) {
            c12pv.LIZIZ.clear();
            c12pv.LIZ.b8(c12pv.LIZJ);
        }
        c12pu.LIZLLL = null;
        ((LinkedHashMap) c12pu.LJ).clear();
        hide();
        C1451630nsX c1451630nsXO4 = O4();
        if (c1451630nsXO4 != null) {
            c1451630nsXO4.LIZIZ(AFwS273S0000000_29.get$arr$(117));
        }
        F4();
        this.LLJJJIL.LIZIZ("ae_voiceChange");
        InterfaceC19530111b1 interfaceC19530111b1P4 = P4();
        if (interfaceC19530111b1P4 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1P4, false, false, false, null, false, 30);
        }
        n5(this.LLJJI);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJL[2]);
    }

    @Override // X.InterfaceC1455720nz8
    public void SS1() {
        C560530Lyd<Boolean> c560530LydM31;
        C19750112Pb c19750112Pb = this.LLJILLL;
        if (c19750112Pb == null || (c560530LydM31 = c19750112Pb.m31()) == null) {
            return;
        }
        c560530LydM31.LJIIJ(Boolean.TRUE);
    }

    private final void F4() {
        int iLIZ = C446980Hfs.LIZ(C1664590tQ1.LJII(this), R.color.b6);
        int iLIZJ = ((int) C12ES.LIZJ(44.0f, C1664590tQ1.LJII(this))) + ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this));
        int iLIZJ2 = (int) C12ES.LIZJ(290.0f, C1664590tQ1.LJII(this));
        int iT4 = T4();
        c0.LIZ.n2();
        C1453160nv0 c1453160nv0LIZ = C1453170nv1.LIZ(iLIZ, iLIZJ, iLIZJ2, iT4);
        c1453160nv0LIZ.LJIIL = new AwS573S0100000_29(this, 224);
        InterfaceC1455860nzM interfaceC1455860nzMK4 = K4();
        interfaceC1455860nzMK4.aM0(c1453160nv0LIZ);
        C1456140nzo.LIZIZ(interfaceC1455860nzMK4, true, false, false, false, 12);
    }

    private final void H4() {
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        AudioRecorderParam veAudioRecorderParam = LJJJLIIL().getVeAudioRecorderParam();
        if (veAudioRecorderParam == null || !C1428470nHB.LJJJZ(LJJJLIIL()) || (value = K4().g().getValue()) == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null || (tracks = nLEModelLIZ.getTracks()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB") || Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (NLESegmentAudio.dynamicCast(((NLETrackSlot) obj).getMainSegment()) != null) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            float fMax = 0.0f;
            for (NLETrackSlot nLETrackSlot : arrayList3) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    float volume = nLESegmentAudioDynamicCast.getVolume();
                    if (nLETrackSlot.hasExtra("volume_before_enhance")) {
                        Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("volume_before_enhance"));
                        if (fLJIIIIZZ != null) {
                            volume = fLJIIIIZZ.floatValue();
                        }
                        if (nLETrackSlot.hasExtra("volume_enhance_rate")) {
                            float fLIZ = C0CH4.LIZ();
                            nLETrackSlot.setExtra("volume_enhance_rate", String.valueOf(fLIZ));
                            nLESegmentAudioDynamicCast.setVolume(fLIZ * volume);
                        }
                    }
                    fMax = Math.max(fMax, volume);
                }
            }
            float f = ((int) (fMax * 100)) / 100.0f;
            if (veAudioRecorderParam.getRecordVolume() != f) {
                veAudioRecorderParam.setRecordVolume(f);
            }
            InterfaceC1452170ntP value2 = K4().g().getValue();
            if (value2 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value2)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
                return;
            }
            nLEEditor.commit();
        }
    }

    public final void Iw() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        NLESegment mainSegment;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        InterfaceC1452170ntP value = K4().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (mainTrack = model.getMainTrack()) == null || (slotByIndex = mainTrack.getSlotByIndex(0)) == null || (mainSegment = slotByIndex.getMainSegment()) == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) == null || nLESegmentVideoDynamicCast.getCanvasStyle() != null) {
            return;
        }
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        nLEStyCanvas.setExtra("extra_canvas_style_from", "audioEditing");
        nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
        nLEEditor.commit();
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9
    public void LLJJJJ() {
        d5().LLJJJJ();
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9, X.InterfaceC1456070nzh
    public void c4() {
        InterfaceC524950KiL interfaceC524950KiL;
        this.LLJJI = System.currentTimeMillis();
        if (Z4() instanceof InterfaceC524950KiL) {
            C128Y c128yZ4 = Z4();
            if ((c128yZ4 instanceof InterfaceC524950KiL) && (interfaceC524950KiL = (InterfaceC524950KiL) c128yZ4) != null) {
                C12PU c12pu = this.LLJJJIL;
                c12pu.getClass();
                c12pu.LIZLLL = new C12PV(interfaceC524950KiL);
            }
        }
        if (!C298050BmF.LIZ()) {
            Iw();
        }
        this.LLJJJJ = true;
        show();
        C1524705y1.LIZIZ(0L, new ARunnableS129S0100000_29(this, 69));
        C1451630nsX c1451630nsXO4 = O4();
        if (c1451630nsXO4 != null) {
            c1451630nsXO4.LIZIZ(AFwS273S0000000_29.get$arr$(118));
        }
        this.LLJJJIL.LIZJ("ae_voiceChange");
        InterfaceC19530111b1 interfaceC19530111b1P4 = P4();
        if (interfaceC19530111b1P4 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1P4, true, false, false, null, false, 30);
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(LJJJLIIL());
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(LJJJLIIL()));
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LJ("enter_dm", LJJJLIIL().creativeModel.initialModel.dmCameraModel.enterDM);
        c0lab.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(LJJJLIIL()));
        C0MJO.LIZIZ(LJJJLIIL().creativeModel, c0lab);
        c0lab.LJ("editorpro_click_from", C1403850mdT.LJ(LJJJLIIL()));
        c0lab.LIZ((C573570MeZ.LIZJ(LJJJLIIL()) || C573570MeZ.LIZIZ(LJJJLIIL())) ? 1 : 0, "is_pic_frame_single_pic_edit");
        if (C573570MeZ.LIZJ(LJJJLIIL()) || C573570MeZ.LIZIZ(LJJJLIIL())) {
            c0lab.LIZ(1, "pic_cnt");
            c0lab.LJ("content_type", "multi_photo");
        }
        if (LJJJLIIL().creativeModel.imageEditModel.livePicCnt > 0) {
            c0lab.LIZ(LJJJLIIL().creativeModel.imageEditModel.livePicCnt, "live_pic_cnt");
        }
        C20684815ws.LJIILLIIL("click_audio_editing", c0lab.LIZ);
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H4();
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C12PU c12pu = this.LLJJJIL;
        ((ArrayList) c12pu.LIZJ).clear();
        C12PV c12pv = c12pu.LIZLLL;
        if (c12pv != null) {
            c12pv.LIZIZ.clear();
            c12pv.LIZ.b8(c12pv.LIZJ);
        }
        c12pu.LIZLLL = null;
        ((LinkedHashMap) c12pu.LJ).clear();
    }

    public final void z4() {
        int iLIZ = C446980Hfs.LIZ(C1664590tQ1.LJII(this), R.color.b6);
        int iLIZJ = ((int) C12ES.LIZJ(44.0f, C1664590tQ1.LJII(this))) + ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this));
        int iLIZJ2 = (int) C12ES.LIZJ(290.0f, C1664590tQ1.LJII(this));
        int iT4 = T4();
        c0.LIZ.n2();
        C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iLIZ, iLIZJ, iLIZJ2, iT4, false, false, 1984);
        c1453160nv0LIZIZ.LJIIL = new AwS573S0100000_29(this, 223);
        c1453160nv0LIZIZ.LJIIJJI = AFwS218S0000000_29.get$arr$(159);
        K4().aM0(c1453160nv0LIZIZ);
    }

    @Override // X.InterfaceC1455730nz9
    public LiveEvent<Unit> EZ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C12PQ, X.C12PY
    public void LIZ() {
        c4();
    }

    @Override // X.C12PQ, X.C12PY
    public void LIZLLL() {
        LJJJJIZL();
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9
    public LiveData<Boolean> g5() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1456070nzh
    public LiveEvent<Unit> jj2() {
        return this.LLJJJJJIL;
    }

    public final void n5(long j) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - j, "duration");
        c0lab.LJ("enter_from", "voice filter panel");
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        C20684815ws.LJIILLIIL("stay_time", c0lab.LIZ);
    }

    @Override // X.AbstractC1664510tPt
    public void o2(C19A3 c19a3) {
        T2("VoiceHostApiComponent", AFwS273S0000000_29.get$arr$(116));
        X1("VoiceHostApiComponent", new AwS395S0200000_29(this, c19a3, 20));
    }

    @Override // X.InterfaceC1455720nz8
    public void yf0(Context context) {
        if (C298050BmF.LIZ() && !this.LLJJJJ) {
            C21146717pB.LIZJ(context, R.layout.enw);
        }
    }

    public C12PS(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753012Qe.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), C12SF.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19530111b1.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 285));
        this.LLJJJIL = new C12PU(this);
        this.LLJJJJJIL = new LiveEvent<>();
        this.LLJJJJLIIL = new LiveEvent<>();
        this.LLJJL = new MutableLiveData();
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1456070nzh
    public void ij(InterfaceC1455860nzM interfaceC1455860nzM, VideoPublishEditModel videoPublishEditModel) {
        k5().dF1();
    }
}
