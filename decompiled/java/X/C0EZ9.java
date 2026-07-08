package X;

import Y.ACallableS413S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.graphics.Rect;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZ9 extends AbstractC2255721DQs<C12SF> implements C12SF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C1DRG LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C12SF LLILZIL = this;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLIZ = C1449630npJ.LIZ(this, InterfaceC1446740nke.class);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EZB.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EZC.class, null);
    public C0EZA LLJILJILJ;
    public AudioRecorderParam LLJILLL;
    public C0EZE LLJJ;
    public AudioRecorderParam LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EZ9.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EZ9.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EZ9.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EZ9.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EZ9.class, "editLoudnessApi", "getEditLoudnessApi()Lcom/ss/android/ugc/gamora/editor/loudness/EditLoudnessApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EZ9.class, "editAudioMetricsApi", "getEditAudioMetricsApi()Lcom/ss/android/ugc/gamora/editor/audiometrics/EditAudioMetricsApiComponent;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJIJIIJIL = 8;
    }

    private final C0EZC H2() {
        return (C0EZC) this.LLJILJIL.getValue(this, LLJJIJI[5]);
    }

    private final C0EZB T2() {
        return (C0EZB) this.LLJIJIL.getValue(this, LLJJIJI[4]);
    }

    private final void W1() {
        C0EZE c0eze = this.LLJJ;
        if (c0eze != null && !c0eze.LIZIZ) {
            c0eze.LIZIZ = true;
            c0eze.LIZJ.destory();
        }
        this.LLJJ = null;
    }

    private final InterfaceC1456910o13 W2() {
        return (InterfaceC1456910o13) this.LLJI.getValue(this, LLJJIJI[3]);
    }

    private final InterfaceC1418580n1E c3() {
        return (InterfaceC1418580n1E) this.LLIZLLLIL.getValue(this, LLJJIJI[1]);
    }

    private final C0LAB i3() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(m3()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", m3().mShootWay);
        c0lab.LJ("creation_id", m3().getCreationId());
        c0lab.LJ("content_type", "video");
        return c0lab;
    }

    private final boolean v3() {
        Stack<Point> stack;
        AudioRecorderParam audioRecorderParam = this.LLJILLL;
        C0EZA c0eza = this.LLJILJILJ;
        if (c0eza == null || (stack = c0eza.LJFF()) == null) {
            stack = new Stack<>();
        }
        audioRecorderParam.setMStack(stack);
        return !this.LLJILLL.getMStack().isEmpty();
    }

    @Override // X.C12SF
    public void Cr2() {
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        C347650Dk3 c347650Dk3LJJJJIZL = null;
        boolean zHasChange = this.LLJJI.hasChange(this.LLJILLL, true);
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
            c347650Dk3LJJJJIZL = interfaceC391070FUzLJFF.LJJJJIZL(EnumC355960DxS.ORIGIN_VOICE_CONVERSION);
        }
        if (zHasChange || c347650Dk3LJJJJIZL != null) {
            this.LLJJI.copyFrom(this.LLJILLL);
            C0EZB c0ezbT2 = T2();
            if (c0ezbT2 != null) {
                c0ezbT2.cL1(zHasChange ? this.LLJILLL.getAudioUrl() : "", this.LLJILLL.getAudioRecordIndex(), JY0().g().getValue());
            }
        }
    }

    public final String G2() {
        return (String) this.LLJJIII.getValue();
    }

    @Override // X.C12SF
    public InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLIZ.getValue();
    }

    @Override // X.C12SF
    public boolean Zo() {
        return this.LLJILLL.hasChange(m3().getVeAudioRecorderParam(), C390110FRh.LIZ(c3(), m3()));
    }

    public final VideoPublishEditModel m3() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJJIJI[0]);
    }

    public final InterfaceC1454960nxu q3() {
        return (InterfaceC1454960nxu) this.LLJ.getValue(this, LLJJIJI[2]);
    }

    @Override // X.C12SF
    public AudioRecorderParam s61() {
        this.LLJILLL = new AudioRecorderParam();
        this.LLJJI = new AudioRecorderParam();
        if (m3().getVeAudioRecorderParam() == null) {
            this.LLJILLL.setHasOriginalSound(m3().hasOriginalSound(false));
            this.LLJILLL.setNeedOriginalSound(C390110FRh.LIZ(c3(), m3()));
        } else {
            this.LLJILLL.copyFrom(m3().getVeAudioRecorderParam());
        }
        if (this.LLJILLL.getNeedOriginalSound()) {
            this.LLJILLL.setVoiceVolume(m3().getVoiceVolume());
        }
        return this.LLJILLL;
    }

    private final void B3() {
        C20684815ws.LJIILLIIL("cancel_dub", i3().LIZ);
    }

    private final void E3() {
        C20684815ws.LJIILLIIL("delete_dub", i3().LIZ);
    }

    private final void X1() {
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c348100DkmLIZIZ.LIZ.resetHead();
        if (this.LLJILLL.getNeedOriginalSound()) {
            InterfaceC1418580n1E interfaceC1418580n1EC3 = c3();
            if (interfaceC1418580n1EC3 != null) {
                interfaceC1418580n1EC3.N81(m3().getVoiceVolume());
            }
        } else {
            InterfaceC1418580n1E interfaceC1418580n1EC32 = c3();
            if (interfaceC1418580n1EC32 != null) {
                interfaceC1418580n1EC32.Hr1(true, false, true);
            }
            InterfaceC1418580n1E interfaceC1418580n1EC33 = c3();
            if (interfaceC1418580n1EC33 != null) {
                interfaceC1418580n1EC33.N81(0.0f);
            }
        }
        InterfaceC1418580n1E interfaceC1418580n1EC34 = c3();
        if (interfaceC1418580n1EC34 != null) {
            interfaceC1418580n1EC34.Hr1(this.LLJILLL.getNeedOriginalSound(), false, true);
        }
        q3().Sq(true);
        NLEModel nLEModelLIZ = C352130DrH.LIZ(value);
        if (nLEModelLIZ != null) {
            m3().creativeModel.voiceConversionModel.hasStyleConversion = C348930Dm7.LJI(nLEModelLIZ);
        }
    }

    @Override // X.C12SF
    public void LLJJJJ() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        if (m3().hasRecord()) {
            AudioRecorderParam veAudioRecorderParam = m3().getVeAudioRecorderParam();
            InterfaceC1452170ntP value = JY0().g().getValue();
            if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                C349300Dmi.LIZIZ(nLEEditor);
            }
            m3().setVoiceVolume(veAudioRecorderParam != null ? veAudioRecorderParam.getVoiceVolume() : 0.0f);
            InterfaceC1418580n1E interfaceC1418580n1EC3 = c3();
            if (interfaceC1418580n1EC3 != null) {
                interfaceC1418580n1EC3.Hr1(true, false, true);
            }
            m3().setVeAudioRecorderParam(null);
        }
    }

    public final void Z1() {
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ != null) {
            c348100DkmLIZIZ.LIZ.done();
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C12SF
    public void yt2() {
        NLEModel nLEModelLIZ;
        NLESegment mainSegment;
        NLEResourceNode resource;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return;
        }
        AudioRecorderParam audioRecorderParam = this.LLJILLL;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VecNLETrackSPtr tracks = nLEModelLIZ.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (C351220Dpo.LLILL(nLETrack2) || (nLETrack2.getTrackType() == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB"))) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String strLJ = C348930Dm7.LJ((NLETrackSlot) it3.next());
            if (C123100dR.LIZ(strLJ)) {
                linkedHashSet.add(strLJ);
            }
        }
        audioRecorderParam.setMultiTrackAudio(C13LP.LLIIII(linkedHashSet));
        VoiceConversionModel voiceConversionModel = m3().creativeModel.voiceConversionModel;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        VecNLETrackSPtr tracks2 = nLEModelLIZ.getTracks();
        ArrayList arrayList3 = new ArrayList();
        for (NLETrack nLETrack3 : tracks2) {
            NLETrack nLETrack4 = nLETrack3;
            if (C351220Dpo.LLILL(nLETrack4) || (nLETrack4.getTrackType() == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack4.getExtra("AudioTrackType"), "DUB"))) {
                arrayList3.add(nLETrack3);
            }
        }
        ArrayList<NLETrackSlot> arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it4.next()).getSlots(), arrayList4);
        }
        for (NLETrackSlot nLETrackSlot : arrayList4) {
            String resourceFile = (!nLETrackSlot.hasExtra("extra_origin_voice_file_path") || (mainSegment = nLETrackSlot.getMainSegment()) == null || (resource = mainSegment.getResource()) == null) ? null : resource.getResourceFile();
            if (C123100dR.LIZ(resourceFile)) {
                linkedHashSet2.add(resourceFile);
            }
        }
        voiceConversionModel.vcMultiRecordPathList = C13LP.LLIIII(linkedHashSet2);
        m3().creativeModel.voiceConversionModel.hasDubVoiceConversion = !m3().creativeModel.voiceConversionModel.vcMultiRecordPathList.isEmpty();
        m3().creativeModel.voiceConversionModel.vcMultiOriginPathList = C348930Dm7.LIZLLL(nLEModelLIZ);
        m3().creativeModel.voiceConversionModel.hasOriginVoiceConversion = !m3().creativeModel.voiceConversionModel.vcMultiOriginPathList.isEmpty();
        m3().creativeModel.voiceConversionModel.voiceModifyIds = C13LP.LLIIJI(C349080DmM.LJII(nLEModelLIZ));
        m3().creativeModel.voiceConversionModel.hasStyleConversion = C348930Dm7.LJI(nLEModelLIZ);
        if (!m3().creativeModel.voiceConversionModel.voiceModifyIds.isEmpty()) {
            m3().creativeModel.streamVoiceConversionModel.vcEffectId = "";
            m3().creativeModel.streamVoiceConversionModel.vcVoiceId = "";
            m3().creativeModel.streamVoiceConversionModel.vcShootingEffectId = "";
        }
    }

    @Override // X.C12SF
    public void Io2() {
        Z1();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C12SF
    public boolean isPlaying() {
        return this.LLILLL;
    }

    @Override // X.C12SF
    public boolean isRecording() {
        return this.LLILLJJLI;
    }

    public C12SF w2() {
        return this.LLILZIL;
    }

    @Override // X.C12SF
    public boolean xo0() {
        return this.LLILZ;
    }

    @Override // X.C12SF
    public AudioRecorderParam xq() {
        return this.LLJILLL;
    }

    public C0EZ9(C1DRG c1drg) {
        this.LL = c1drg;
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.setHasOriginalSound(m3().hasOriginalSound(false));
        audioRecorderParam.setNeedOriginalSound(C390110FRh.LIZ(c3(), m3()));
        this.LLJILLL = audioRecorderParam;
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.setHasOriginalSound(m3().hasOriginalSound(false));
        audioRecorderParam2.setNeedOriginalSound(C390110FRh.LIZ(c3(), m3()));
        this.LLJJI = audioRecorderParam2;
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 63));
    }

    private final void H3(boolean z) {
        float recordVolume;
        C0LAB c0labI3 = i3();
        c0labI3.LIZ(z ? 1 : 0, "original_sound");
        C20684815ws.LJIILLIIL("save_dub", c0labI3.LIZ);
        VideoInfoData videoInfoData = ((IEditVideoInfoService) ServiceManager.get().getService(IEditVideoInfoService.class)).getVideoInfoData(m3().getCreationId());
        if (videoInfoData != null && videoInfoData.getRusumeVolumeRecord() == 0.0f && !this.LLJILLL.getMStack().isEmpty()) {
            IEditVideoInfoService iEditVideoInfoService = (IEditVideoInfoService) ServiceManager.get().getService(IEditVideoInfoService.class);
            String creationId = m3().getCreationId();
            float rusumeVolumeRecord = videoInfoData.getRusumeVolumeRecord();
            float rusumeVolumeMusic = videoInfoData.getRusumeVolumeMusic();
            AudioRecorderParam veAudioRecorderParam = m3().getVeAudioRecorderParam();
            if (veAudioRecorderParam != null) {
                recordVolume = veAudioRecorderParam.getRecordVolume();
            } else {
                recordVolume = 1.0f;
            }
            iEditVideoInfoService.setVideoInfoData(creationId, new VideoInfoData(rusumeVolumeRecord, rusumeVolumeMusic, recordVolume));
        }
    }

    private final void O3(boolean z) {
        Stack<Point> stack;
        AudioRecorderParam audioRecorderParam = this.LLJILLL;
        C0EZA c0eza = this.LLJILJILJ;
        if (c0eza == null || (stack = c0eza.LJFF()) == null) {
            stack = new Stack<>();
        }
        audioRecorderParam.setMStack(stack);
        this.LLJILLL.setNeedOriginalSound(z);
    }

    private final void o2(boolean z) {
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableAddedAudio, isEnable:");
            sbLIZ.append(z);
            C201955140j.LIZIZ("EditAudioRecordScene", C2188811AlT.LIZIZ(sbLIZ));
            VecNLETrackSPtr tracks = c348100DkmLIZIZ.LIZ.getModel().getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C351220Dpo.LLLJ(nLETrack2) || C351220Dpo.LLLILZLLLI(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((NLENode) it2.next()).setEnable(z);
            }
            c348100DkmLIZIZ.LIZ.commit();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C12SF
    public void Di(InterfaceC352140DrI interfaceC352140DrI) {
        if (interfaceC352140DrI != null) {
            interfaceC352140DrI.LIZ();
        }
        AudioRecorderParam veAudioRecorderParam = m3().getVeAudioRecorderParam();
        boolean needOriginalSound = this.LLJILLL.getNeedOriginalSound();
        if (veAudioRecorderParam == null) {
            this.LLJILLL = new AudioRecorderParam();
        } else {
            this.LLJILLL.copyFrom(veAudioRecorderParam);
        }
        this.LLJILLL.setNeedOriginalSound(needOriginalSound);
        W1();
        X1();
        if (interfaceC352140DrI != null) {
            interfaceC352140DrI.LIZIZ();
        }
    }

    @Override // X.C12SF
    public void K20(AudioRecorderParam audioRecorderParam) {
        AudioRecorderParam audioRecorderParam2 = this.LLJILLL;
        boolean zLIZ = C390110FRh.LIZ(c3(), m3());
        if (audioRecorderParam == null) {
            if (audioRecorderParam2.getMStack().empty() && audioRecorderParam2.getNeedOriginalSound() == zLIZ) {
                return;
            }
        } else if (Intrinsics.LJFF(audioRecorderParam2.getAudioUrl(), audioRecorderParam.getAudioUrl()) && audioRecorderParam2.getNeedDel() == audioRecorderParam.getNeedDel() && audioRecorderParam2.getRecordVolume() == audioRecorderParam.getRecordVolume() && !audioRecorderParam2.hasChange(audioRecorderParam, zLIZ)) {
            return;
        }
        this.LLJILLL.copyFrom(audioRecorderParam);
    }

    @Override // X.C12SF
    public void Mo(InterfaceC352140DrI interfaceC352140DrI) {
        if (interfaceC352140DrI != null) {
            interfaceC352140DrI.LIZ();
        }
        W1();
        X1();
        if (interfaceC352140DrI != null) {
            interfaceC352140DrI.LIZIZ();
        }
    }

    @Override // X.C12SF
    public void Np1(InterfaceC352140DrI interfaceC352140DrI) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        VideoPublishEditModel videoPublishEditModelM3;
        AudioRecorderParam veAudioRecorderParam;
        NLETrack next;
        NLESegmentAudio nLESegmentAudio;
        q3().Sq(false);
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (veAudioRecorderParam = (videoPublishEditModelM3 = m3()).getVeAudioRecorderParam()) != null && !veAudioRecorderParam.getMStack().isEmpty()) {
            NLEModel model = nLEEditor.getModel();
            Iterator<NLETrack> it2 = model.getTracks().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = next;
            if (nLETrack != null) {
                NLEModel model2 = nLEEditor.getModel();
                ArrayList<NLETrackSlot> arrayList = new ArrayList();
                VecNLETrackSPtr tracks = model2.getTracks();
                ArrayList arrayList2 = new ArrayList();
                for (NLETrack nLETrack2 : tracks) {
                    if (Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
                        arrayList2.add(nLETrack2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Iterator<NLETrackSlot> it4 = ((NLETrack) it3.next()).getSlots().iterator();
                    while (it4.hasNext()) {
                        arrayList.add(it4.next());
                    }
                }
                if (arrayList.isEmpty()) {
                    if (nLETrack.getSlots().size() != veAudioRecorderParam.getMStack().size()) {
                        C352180DrM c352180DrM = new C352180DrM(videoPublishEditModelM3);
                        C349300Dmi.LIZIZ(nLEEditor);
                        int i = 0;
                        for (Object obj : veAudioRecorderParam.getMStack()) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                Point point = (Point) obj;
                                String strLIZJ = C349310Dmj.LIZJ(veAudioRecorderParam.getAudioUrl(), point, c352180DrM);
                                if (strLIZJ.length() != 0) {
                                    C349300Dmi.LIZJ(model).addSlot(C349310Dmj.LIZ(new C349320Dmk(point, strLIZJ), i));
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        nLEEditor.commit();
                    }
                } else {
                    C349300Dmi.LIZIZ(nLEEditor);
                    NLETrack nLETrackLIZJ = C349300Dmi.LIZJ(model2);
                    for (NLETrackSlot nLETrackSlot : arrayList) {
                        NLESegment mainSegment = nLETrackSlot.getMainSegment();
                        if ((mainSegment instanceof NLESegmentAudio) && (nLESegmentAudio = (NLESegmentAudio) mainSegment) != null) {
                            nLESegmentAudio.setKeepTone(true);
                        }
                        nLETrackLIZJ.addSlot(NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true)));
                    }
                    nLEEditor.commit();
                }
            }
        }
        this.LLJJ = new C0EZE();
        C15O7.LIZIZ(new ACallableS413S0100000_5(new ARunnableS74S0200000_5(interfaceC352140DrI, this, 10), 0), C823050WQl.LIZLLL(), null);
    }

    @Override // X.C12SF
    public void Nu2(C0EZA c0eza) {
        this.LLJILJILJ = c0eza;
    }

    public final void Q3(String str) {
        NLEModel nLEModelLIZ;
        this.LLJILLL.setAudioUrl(str);
        AudioRecorderParam veAudioRecorderParam = m3().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.copyFrom(this.LLJILLL);
        }
        m3().creativeModel.voiceConversionModel.originalRecordPath = str;
        InterfaceC1456910o13 interfaceC1456910o13W2 = W2();
        if (interfaceC1456910o13W2 != null && C0EYG.LIZ(m3()) && interfaceC1456910o13W2.sj1()) {
            interfaceC1456910o13W2.n80();
            InterfaceC1452170ntP value = JY0().g().getValue();
            if (value != null) {
                nLEModelLIZ = C352130DrH.LIZ(value);
            } else {
                nLEModelLIZ = null;
            }
            interfaceC1456910o13W2.Dt1(nLEModelLIZ);
        }
        Cr2();
        C0EZC c0ezcH2 = H2();
        if (c0ezcH2 != null) {
            c0ezcH2.kj0();
        }
    }

    @Override // X.C12SF
    public void VO0(InterfaceC2218151Brh interfaceC2218151Brh) {
        C0EZE c0eze = this.LLJJ;
        if (c0eze != null) {
            c0eze.LIZJ.setRecorderListener(interfaceC2218151Brh);
        }
    }

    @Override // X.C12SF
    public void Vu0(String str) {
        C0LAB c0labI3 = i3();
        c0labI3.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("record_dub_end", c0labI3.LIZ);
    }

    @Override // X.C12SF
    public void Wj(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.C12SF
    public void a42(boolean z) {
        this.LLILZ = z;
    }

    @Override // X.C12SF
    public void uT(String str) {
        C0LAB c0labI3 = i3();
        c0labI3.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("record_dub_start", c0labI3.LIZ);
    }

    @Override // X.C12SF
    public void v6(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // X.C12SF
    public void vG(Function0<Unit> function0) {
        function0.invoke();
        Wj(true);
        C0EZA c0eza = this.LLJILJILJ;
        if (c0eza != null) {
            c0eza.LIZLLL();
        }
        Cr2();
    }

    @Override // X.C12SF
    public void rr1(Cert cert, Function0<Unit> function0) {
        Integer numValueOf;
        int iIntValue;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return;
        }
        function0.invoke();
        InterfaceC1418580n1E interfaceC1418580n1EC3 = c3();
        if (interfaceC1418580n1EC3 != null) {
            interfaceC1418580n1EC3.wM1(false);
        }
        o2(false);
        C0EZA c0eza = this.LLJILJILJ;
        if (c0eza != null) {
            c0eza.LJ();
        }
        v6(true);
        C0EZE c0eze = this.LLJJ;
        if (c0eze != null) {
            numValueOf = Integer.valueOf(c0eze.LIZJ(value.LLL(), value.getDuration(), cert));
        } else {
            numValueOf = null;
        }
        C0EZA c0eza2 = this.LLJILJILJ;
        if (c0eza2 != null) {
            c0eza2.LIZLLL();
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return;
        }
        C19771012Xc c19771012Xc = C19771012Xc.LIZ;
        String creationId = m3().getCreationId();
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        c19771012Xc.getClass();
        C19771012Xc.LIZIZ(iIntValue, creationId, "");
    }

    @Override // X.C12SF
    public void zp(float f, float f2) {
        if (m3().isStitchMode()) {
            if (m3().isMuted()) {
                JY0().EY0(VEVolumeChangeOp.ofVoice(0.0f));
                JY0().EY0(VEVolumeChangeOp.ofMusic(f));
                return;
            } else {
                JY0().EY0(VEVolumeChangeOp.ofVoice(f2));
                JY0().EY0(VEVolumeChangeOp.ofMusic(f));
                return;
            }
        }
        if ((m3().isFastImport() || m3().hasOriginalSound()) && !m3().isMuted()) {
            if (f2 != -1.0f) {
                JY0().EY0(VEVolumeChangeOp.ofVoice(f2));
            }
            if (m3().getMMusicPath() == null || f == -1.0f) {
                return;
            }
            JY0().EY0(VEVolumeChangeOp.ofMusic(f));
            return;
        }
        if (f == -1.0f) {
            return;
        }
        JY0().EY0(VEVolumeChangeOp.ofMusic(f));
    }

    @Override // X.C12SF
    public void TI0(AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, InterfaceC352140DrI interfaceC352140DrI) {
        W1();
        boolean zV3 = v3();
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_voiceover_real_compile_on_main_thread", true, false);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C352010Dr5(zLJIIIZ, interfaceC352140DrI, zV3, this, audioRecorderParam, audioRecorderParam2, null), 3);
    }

    @Override // X.C12SF
    public void gb2(Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Cert cert) {
        Rect rectLLJLLIL;
        Point pointLIZ;
        Stack<Point> stack;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor2;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        InterfaceC1452170ntP value2 = JY0().g().getValue();
        if (value2 != null) {
            rectLLJLLIL = value2.LLJLLIL();
        } else {
            rectLLJLLIL = null;
        }
        if (isRecording() || isPlaying()) {
            RD2(false, -1, cert, function0, function1);
        }
        E3();
        C0EZA c0eza = this.LLJILJILJ;
        if (c0eza != null) {
            pointLIZ = c0eza.LIZ();
        } else {
            pointLIZ = null;
        }
        InterfaceC1452170ntP value3 = JY0().g().getValue();
        if (value3 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value3)) != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null && pointLIZ != null) {
            Iterator<NLETrack> it2 = nLEEditor2.getModel().getTracks().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = next;
            ArrayList<NLETrackSlot> arrayList = new ArrayList();
            if (nLETrack != null && (slots2 = nLETrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot : slots2) {
                    if (nLETrackSlot.getStartTime() >= ((long) pointLIZ.getX()) * 1000 && nLETrackSlot.getEndTime() <= ((long) pointLIZ.getY()) * 1000) {
                        arrayList.add(nLETrackSlot);
                    }
                }
            }
            for (NLETrackSlot nLETrackSlot2 : arrayList) {
                if (nLETrack != null) {
                    nLETrack.removeSlot(nLETrackSlot2);
                }
            }
            if (nLETrack == null || (slots = nLETrack.getSlots()) == null || slots.isEmpty()) {
                nLEEditor2.getModel().removeTrack(nLETrack);
            }
            nLEEditor2.commit();
        }
        if (this.LLJILLL.getMStack().isEmpty()) {
            this.LLJILLL.setAudioRecordIndex(-1);
            InterfaceC1452170ntP value4 = JY0().g().getValue();
            if (value4 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value4)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                C349300Dmi.LIZIZ(nLEEditor);
            }
        }
        AudioRecorderParam audioRecorderParam = this.LLJILLL;
        C0EZA c0eza2 = this.LLJILJILJ;
        if (c0eza2 == null || (stack = c0eza2.LJFF()) == null) {
            stack = new Stack<>();
        }
        audioRecorderParam.setMStack(stack);
        function1.invoke(Boolean.valueOf(!this.LLJILLL.getMStack().isEmpty()));
        if (rectLLJLLIL != null) {
            if ((rectLLJLLIL.left > 0 || rectLLJLLIL.top > 0 || rectLLJLLIL.right > 0 || rectLLJLLIL.bottom > 0) && (value = JY0().g().getValue()) != null) {
                value.setDisplayPos(rectLLJLLIL.left, rectLLJLLIL.top, rectLLJLLIL.right, rectLLJLLIL.bottom);
            }
        }
    }

    @Override // X.C12SF
    public void Rt(boolean z, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        if (isRecording() || isPlaying()) {
            RD2(false, -1, cert, function0, function1);
        }
        B3();
        O3(z);
        o2(true);
    }

    @Override // X.C12SF
    public void RD2(boolean z, int i, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        Stack<Point> stack;
        C0EZA c0eza = this.LLJILJILJ;
        if (c0eza != null) {
            c0eza.LIZJ(z);
        }
        function0.invoke();
        if (isRecording()) {
            C0EZA c0eza2 = this.LLJILJILJ;
            if (c0eza2 != null) {
                m3().getCreationId();
                c0eza2.LIZIZ(i, z, this.LLJJ, cert, m3());
            }
            m3().creativeModel.commonMobModel.editPageFuncTracking.isVoiceoverFuncUsed = true;
            v6(false);
            C0EZA c0eza3 = this.LLJILJILJ;
            if (c0eza3 != null) {
                c0eza3.LJI();
            }
            AudioRecorderParam audioRecorderParam = this.LLJILLL;
            C0EZA c0eza4 = this.LLJILJILJ;
            if (c0eza4 == null || (stack = c0eza4.LJFF()) == null) {
                stack = new Stack<>();
            }
            audioRecorderParam.setMStack(stack);
            if (this.LLJILLL.getMStack().isEmpty()) {
                this.LLJILLL.setAudioRecordIndex(-1);
            } else {
                this.LLJILLL.setAudioRecordIndex(0);
            }
            function1.invoke(Boolean.valueOf(!this.LLJILLL.getMStack().isEmpty()));
            InterfaceC1418580n1E interfaceC1418580n1EC3 = c3();
            if (interfaceC1418580n1EC3 != null) {
                interfaceC1418580n1EC3.wM1(true);
            }
        }
        InterfaceC1418580n1E interfaceC1418580n1EC32 = c3();
        if (interfaceC1418580n1EC32 != null) {
            interfaceC1418580n1EC32.Ca1(this.LLJILLL.getNeedOriginalSound());
        }
        Wj(false);
        o2(true);
    }

    @Override // X.C12SF
    public void tQ1(boolean z, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Function2<? super AudioRecorderParam, ? super AudioRecorderParam, Unit> function2) {
        if (isRecording() || isPlaying()) {
            RD2(false, -1, cert, function0, function1);
        }
        O3(z);
        InterfaceC1418580n1E interfaceC1418580n1EC3 = c3();
        if (interfaceC1418580n1EC3 != null) {
            interfaceC1418580n1EC3.Hr1(z, false, true);
        }
        o2(true);
        if (m3().getVeAudioRecorderParam() == null) {
            VideoPublishEditModel videoPublishEditModelM3 = m3();
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.setNeedOriginalSound(C390110FRh.LIZ(c3(), m3()));
            audioRecorderParam.setHasOriginalSound(m3().hasOriginalSound(false));
            videoPublishEditModelM3.setVeAudioRecorderParam(audioRecorderParam);
            m3().creativeModel.micDataModel.editVolumeChangeMark = true;
        }
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom(m3().getVeAudioRecorderParam());
        H3(this.LLJILLL.getNeedOriginalSound());
        function2.invoke(audioRecorderParam2, this.LLJILLL);
    }
}
