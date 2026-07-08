package X;

import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.AwS53S0100100_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0o80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461220o80 extends AbstractC2255721DQs<C0EZC> implements C0EZC, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final Runnable LLILZLL = new ARunnableS122S0100000_22(this, 49);
    public DialogC1389620mGW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461220o80.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1461220o80.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1461220o80.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJ = 8;
    }

    public C0EZC o2() {
        return this;
    }

    private final InterfaceC1418580n1E T2() {
        return (InterfaceC1418580n1E) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    public final InterfaceC1455860nzM H2() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    public final VideoPublishEditModel W2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    public final void Z1() {
        DialogC1389620mGW dialogC1389620mGW;
        DialogC1389620mGW dialogC1389620mGW2 = this.LLIZ;
        if (dialogC1389620mGW2 == null || !dialogC1389620mGW2.isShowing() || (dialogC1389620mGW = this.LLIZ) == null) {
            return;
        }
        dialogC1389620mGW.dismiss();
        C785410UrT.LIZ(dialogC1389620mGW);
    }

    public final void i3() {
        DialogC1389620mGW dialogC1389620mGW;
        DialogC1389620mGW dialogC1389620mGW2 = this.LLIZ;
        if (dialogC1389620mGW2 != null) {
            if (dialogC1389620mGW2.isShowing() || (dialogC1389620mGW = this.LLIZ) == null) {
                return;
            }
            C786410Ut5.J4(dialogC1389620mGW);
            return;
        }
        DialogC1389620mGW dialogC1389620mGW3 = new DialogC1389620mGW(C1664590tQ1.LJII(this));
        dialogC1389620mGW3.LJJLJLI(C20642515q3.LJI(2131826442));
        dialogC1389620mGW3.LJJLL(true);
        this.LLIZ = dialogC1389620mGW3;
        C0FNV.LIZJ(dialogC1389620mGW3);
    }

    @Override // X.C0EZC
    public void kj0() {
        Stack<Point> mStack;
        C1407050mid c1407050mid = C1407050mid.LIZ;
        VideoPublishEditModel videoPublishEditModelW2 = W2();
        c1407050mid.getClass();
        if (C1404630mej.LIZLLL() && !C1404630mej.LIZIZ() && C0CHQ.LIZ().getAccountService().isLogin()) {
            C560870LzB.LIZ("zxz", "checkAndDetectDUBAudioMetrics");
            AudioRecorderParam veAudioRecorderParam = videoPublishEditModelW2.getVeAudioRecorderParam();
            if (veAudioRecorderParam == null || (mStack = veAudioRecorderParam.getMStack()) == null || !(!mStack.isEmpty())) {
                return;
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1406990miX(videoPublishEditModelW2, null), 2);
        }
    }

    private final void c3() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        VecNLETrackSPtr tracks;
        VecNLETrackSlotSPtr slots;
        if (W2().realHasOriginalSound()) {
            float fPow = C2508809sM.LIZ == 0.0f ? 1.0f : (float) Math.pow(10.0d, r1 / 20.0f);
            AbstractC1452680nuE abstractC1452680nuEGc = H2().gc();
            NLETrack nLETrack = null;
            if (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
                return;
            }
            NLEModel model = nLEEditor.getModel();
            if (model != null && (tracks = model.getTracks()) != null) {
                Iterator<NLETrack> it2 = tracks.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    NLETrack next = it2.next();
                    if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "ORIGIN")) {
                        nLETrack = next;
                        break;
                    }
                }
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(it3.next().getMainSegment());
                        if (nLESegmentAudioDynamicCast != null) {
                            nLESegmentAudioDynamicCast.setBalancedGain(fPow);
                        }
                    }
                }
            }
            if (nLEEditor != null) {
                nLEEditor.commit();
                nLEEditor.done();
            }
        }
    }

    private final void m3() {
        List<AVChallenge> challenges;
        AudioEffectParam veAudioEffectParam = W2().getVeAudioEffectParam();
        W2().removeAudioEffectChallengeFromTitleAndStruct(veAudioEffectParam != null ? veAudioEffectParam.getChallenge() : null);
        AudioEffectParam veAudioEffectParam2 = W2().getVeAudioEffectParam();
        if (veAudioEffectParam2 != null && (challenges = veAudioEffectParam2.getChallenges()) != null) {
            Iterator<AVChallenge> it2 = challenges.iterator();
            while (it2.hasNext()) {
                W2().removeAudioEffectChallengeFromTitleAndStruct(it2.next());
            }
        }
        C1446160nji.LIZLLL(W2());
    }

    public final float G2() {
        if (T2().Ie2()) {
            return W2().getVoiceVolume();
        }
        return 0.0f;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C348100Dkm c348100DkmLIZIZ;
        float fPow;
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor;
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        AbstractC1452680nuE abstractC1452680nuEGc2;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ2;
        C348100Dkm c348100DkmLIZIZ3;
        NLEEditor nLEEditor2;
        VecNLETrackSPtr tracks2;
        NLETrack next2;
        VecNLETrackSlotSPtr slots2;
        super.onCreate();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c3();
        if (C1458360o3O.LIZ() && !W2().isDuet()) {
            float fLIZIZ = C1485020okO.LIZIZ(W2().creativeModel.musicVolumeInfoModel.musicVolumeInfo);
            if (fLIZIZ > 0.0f && C1485020okO.LIZLLL(Float.valueOf(fLIZIZ)) && (abstractC1452680nuEGc2 = H2().gc()) != null && (interfaceC1452170ntPLJIJ2 = abstractC1452680nuEGc2.LJIJ()) != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ2)) != null && (nLEEditor2 = c348100DkmLIZIZ3.LIZ) != null) {
                NLEModel model = nLEEditor2.getModel();
                if (model != null && (tracks2 = model.getTracks()) != null) {
                    Iterator<NLETrack> it2 = tracks2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            if (Intrinsics.LJFF(next2.getExtra("AudioTrackType"), "BGM")) {
                                break;
                            }
                        }
                    }
                    NLETrack nLETrack = next2;
                    if (nLETrack != null && (slots2 = nLETrack.getSlots()) != null) {
                        Iterator<NLETrackSlot> it3 = slots2.iterator();
                        while (it3.hasNext()) {
                            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(it3.next().getMainSegment());
                            if (nLESegmentAudioDynamicCast != null) {
                                nLESegmentAudioDynamicCast.setBalancedGain(fLIZIZ);
                            }
                        }
                    }
                }
                if (nLEEditor2 != null) {
                    nLEEditor2.commit();
                    nLEEditor2.done();
                }
            }
        }
        if (C0BSM.LIZ && W2().isDuet()) {
            float f = W2().creativeModel.musicVolumeInfoModel.duetSrcLoudness;
            float fLIZJ = C1485020okO.LIZJ();
            if (C1485020okO.LIZLLL(Float.valueOf(f)) && C1485020okO.LIZLLL(Float.valueOf(fLIZJ))) {
                fPow = (float) Math.pow(10.0d, Math.min(24.0f, (fLIZJ - f) + C1461260o84.LIZ.editingPageBgmLoudnessBias) / 20.0f);
                if (fPow > 0.0f) {
                }
            } else {
                fPow = Float.MIN_VALUE;
            }
            if (C1485020okO.LIZLLL(Float.valueOf(fPow)) && (abstractC1452680nuEGc = H2().gc()) != null && (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) != null && (nLEEditor = c348100DkmLIZIZ2.LIZ) != null) {
                NLEModel model2 = nLEEditor.getModel();
                if (model2 != null && (tracks = model2.getTracks()) != null) {
                    Iterator<NLETrack> it4 = tracks.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it4.next();
                            if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "BGM")) {
                                break;
                            }
                        }
                    }
                    NLETrack nLETrack2 = next;
                    if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null) {
                        Iterator<NLETrackSlot> it5 = slots.iterator();
                        while (it5.hasNext()) {
                            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(it5.next().getMainSegment());
                            if (nLESegmentAudioDynamicCast2 != null) {
                                nLESegmentAudioDynamicCast2.setBalancedGain(fPow);
                            }
                        }
                    }
                }
                if (nLEEditor != null) {
                    nLEEditor.commit();
                    nLEEditor.done();
                }
            }
        }
        if (!C289270BVl.LIZ()) {
            C05X0.LIZ.getClass();
            C05X0.LIZJ(null);
        }
        C1407050mid c1407050mid = C1407050mid.LIZ;
        VideoPublishEditModel videoPublishEditModelW2 = W2();
        c1407050mid.getClass();
        if (C1404630mej.LIZLLL() && !C1404630mej.LIZIZ() && C0CHQ.LIZ().getAccountService().isLogin()) {
            Iterator<EditVideoSegment> it6 = videoPublishEditModelW2.getPreviewInfo().getVideoList().iterator();
            long duration = 0;
            while (it6.hasNext()) {
                duration += it6.next().getVideoFileInfo().getDuration();
            }
            if (((Number) C0BW3.LIZ.getValue()).intValue() < 2 || duration <= 180000) {
                C560870LzB.LIZ("zxz", "checkAndDetectOriginVideoAudioMetrics");
                C23250099c.LIZLLL(C817503Hh.LL, (AbstractC23273099z) C19551411eS.LIZIZ.getValue(), null, new C1406980miW(videoPublishEditModelW2, null), 2);
            }
        }
        InterfaceC1452170ntP value = H2().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
            C1461230o81.LIZ.getClass();
            C1461230o81.LIZJ();
            INLEMediaSession iNLEMediaSession = c348100DkmLIZIZ.LIZIZ;
            W2();
            C1461230o81.LIZ(iNLEMediaSession, true);
        }
        W2().creativeModel.audioAlgorithmModel.shootVolumeEnd = (float) C2179771ASp.LJIIIIZZ();
        W2().creativeModel.audioAlgorithmModel.editVolumeStart = (float) C2179771ASp.LJIIIIZZ();
        C1409010mln c1409010mln = C1409010mln.LIZ;
        VideoPublishEditModel videoPublishEditModelW22 = W2();
        c1409010mln.getClass();
        C1409010mln.LIZ(videoPublishEditModelW22, "audio_data_record");
        if (!W2().creativeModel.streamVoiceConversionModel.vcHasApply || W2().isFastImport()) {
            return;
        }
        C786410Ut5.LJLIIL(200L, C1462900oAi.LIZ, this.LLILZLL);
        H2().ww2().observe(this.LL, new AObserverS225S0100000_22(this, 65));
        AwS53S0100100_22 awS53S0100100_22 = new AwS53S0100100_22(this, jCurrentTimeMillis, 1);
        if (C1663800tOk.LIZLLL) {
            awS53S0100100_22.invoke(Boolean.FALSE);
        } else if (C1663800tOk.LIZ.LIZLLL()) {
            awS53S0100100_22.invoke(Boolean.TRUE);
        } else {
            C1663800tOk.LJ = awS53S0100100_22;
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        C348100Dkm c348100DkmLIZIZ;
        String str;
        VecNLETrackSPtr tracks;
        super.onStop();
        InterfaceC1452170ntP value = H2().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
            C1461230o81 c1461230o81 = C1461230o81.LIZ;
            VideoPublishEditModel videoPublishEditModelW2 = W2();
            c1461230o81.getClass();
            if (C291380BbU.LIZ()) {
                String audioGlitchCount = c348100DkmLIZIZ.LIZIZ.getMetricsApi().getAudioGlitchCount();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1461270o85 c1461270o85 = new C1461270o85();
                c1461270o85.LIZ = 0;
                try {
                    JSONObject jSONObject = new JSONObject(audioGlitchCount);
                    c1461270o85.LIZIZ = jSONObject.optInt("samplerate");
                    c1461270o85.LIZJ = jSONObject.optInt("channelcount");
                    c1461270o85.LIZ = jSONObject.optInt("glitchcount");
                    c1461270o85.LIZLLL = jSONObject.optLong("duration");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                String creationId = videoPublishEditModelW2.getCreationId();
                C1461270o85 c1461270o852 = new C1461270o85();
                c1461270o852.LIZ = 0;
                CreativeModel creativeModel = videoPublishEditModelW2.creativeModel;
                NLEModel model = c348100DkmLIZIZ.LIZ.getModel();
                int size = (model == null || (tracks = model.getTracks()) == null) ? -1 : tracks.size();
                MvCreateVideoData mvCreateVideoData = videoPublishEditModelW2.getMvCreateVideoData();
                if (mvCreateVideoData == null || (str = mvCreateVideoData.mvId) == null) {
                    str = "";
                }
                String stickerID = videoPublishEditModelW2.getStickerID();
                C1461230o81.LIZIZ(4, jCurrentTimeMillis, creationId, c1461270o85, c1461270o852, creativeModel, size, "", str, stickerID != null ? stickerID : "");
            }
            C1461230o81 c1461230o812 = C1461230o81.LIZ;
            INLEMediaSession iNLEMediaSession = c348100DkmLIZIZ.LIZIZ;
            W2();
            c1461230o812.getClass();
            C1461230o81.LIZ(iNLEMediaSession, false);
            C1461230o81.LIZLLL();
        }
        W2().creativeModel.audioAlgorithmModel.editVolumeEnd = (float) C2179771ASp.LJIIIIZZ();
        C1409010mln c1409010mln = C1409010mln.LIZ;
        VideoPublishEditModel videoPublishEditModelW22 = W2();
        c1409010mln.getClass();
        C1409010mln.LIZ(videoPublishEditModelW22, "audio_data_edit");
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
    }

    private final List<String> w2(Effect effect) {
        List<String> challenge;
        ArrayList arrayList = new ArrayList();
        if (effect != null && (challenge = effect.getChallenge()) != null) {
            Iterator<String> it2 = challenge.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return arrayList;
    }

    public final void W1(NLEModel nLEModel) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLETrackSlot slotByIndex = nLEModel.getMainTrack().getSlotByIndex(0);
        if (slotByIndex != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) slotByIndex.getMainSegment())) != null && nLESegmentVideoDynamicCast.getCanvasStyle() == null) {
            NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
            nLEStyCanvas.setExtra("extra_canvas_style_from", "svc_prop");
            nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
        }
    }

    public C1461220o80(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    public final void X1(LifecycleOwner lifecycleOwner, Effect effect) {
        if (W2().getVeAudioEffectParam() == null) {
            W2().setVeAudioEffectParam(new AudioEffectParam("", 0, 0, "", "", 0, 0, null, null, new ArrayList()));
        }
        Iterator<String> it2 = w2(effect).iterator();
        while (it2.hasNext()) {
            new C1645820svk(it2.next(), lifecycleOwner).LIZ(new InterfaceC1645830svl() { // from class: X.0o82
                @Override // X.InterfaceC1645830svl
                public final void LIZ(AVChallenge aVChallenge) {
                    List<AVChallenge> challenges;
                    AudioEffectParam veAudioEffectParam = this.LIZ.W2().getVeAudioEffectParam();
                    if (veAudioEffectParam != null) {
                        veAudioEffectParam.setChallenge(aVChallenge);
                    }
                    AudioEffectParam veAudioEffectParam2 = this.LIZ.W2().getVeAudioEffectParam();
                    if (veAudioEffectParam2 != null && (challenges = veAudioEffectParam2.getChallenges()) != null) {
                        challenges.add(aVChallenge);
                    }
                }
            });
        }
    }
}
