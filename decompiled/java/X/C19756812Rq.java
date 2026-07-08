package X;

import Y.ARunnableS129S0100000_29;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12Rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19756812Rq extends i<C12PP, C12TM, C12TN, C12S2> implements C12PP, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public final Function0<Unit> LLJLILLLLZIIL;

    @Override // X.C12PP
    public void Sj() {
        this.LLJJJJLIIL = false;
        float f = 100;
        this.LLJJLIIIJLLLLLLLZ = (int) (LJJJLIIL().getVoiceVolume() * f);
        this.LLJLIL = (int) (LJJJLIIL().getMusicVolume() * f);
        this.LLJL = (int) (x5().getRecordVolume() * f);
    }

    @Override // X.C12PP
    public void x42() {
        this.LLJJJJLIIL = false;
        this.LLJJL = true;
        m6(this.LLJL);
        S5(this.LLJLIL);
        U5(this.LLJJLIIIJLLLLLLLZ);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19756812Rq.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19756812Rq.class, "aeVoiceChangeApiComponent", "getAeVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/AEVoiceChangeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19756812Rq.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19756812Rq.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19756812Rq.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19756812Rq.class, "aeRecordApiComponent", "getAeRecordApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/record/AERecordApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C19756812Rq.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C19756812Rq.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C19756812Rq.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C19756812Rq.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
        LLJLLIL = 8;
    }

    private final InterfaceC1455860nzM C5() {
        return (InterfaceC1455860nzM) this.LLJJJ.getValue(this, LLJLL[7]);
    }

    private final InterfaceC1456910o13 D5() {
        return (InterfaceC1456910o13) this.LLJJIJIL.getValue(this, LLJLL[6]);
    }

    private final InterfaceC1460000o62 E5() {
        return (InterfaceC1460000o62) this.LLJJJJ.getValue(this, LLJLL[9]);
    }

    private final InterfaceC1418580n1E H5() {
        return (InterfaceC1418580n1E) this.LLJJIJI.getValue(this, LLJLL[4]);
    }

    private final void K4() {
        if (this.LLJJJJJIL) {
            return;
        }
        if (!(LJJJLIIL().getVoiceVolume() == 0.0f)) {
            AudioRecorderParam veAudioRecorderParam = LJJJLIIL().getVeAudioRecorderParam();
            if (!Intrinsics.LIZLLL(veAudioRecorderParam != null ? Float.valueOf(veAudioRecorderParam.getRecordVolume()) : null, 0.0f)) {
                return;
            }
        }
        this.LLJJJJJIL = true;
        InterfaceC1456910o13 interfaceC1456910o13D5 = D5();
        if (interfaceC1456910o13D5 != null && C0EYG.LIZ(LJJJLIIL()) && interfaceC1456910o13D5.sj1()) {
            interfaceC1456910o13D5.n80();
            InterfaceC1452170ntP value = C5().g().getValue();
            interfaceC1456910o13D5.Dt1(value != null ? C352130DrH.LIZ(value) : null);
        }
    }

    private final void L6() {
        Float fLJIIIIZZ;
        InterfaceC1418580n1E interfaceC1418580n1EH5 = H5();
        boolean zIe2 = interfaceC1418580n1EH5 != null ? interfaceC1418580n1EH5.Ie2() : F4();
        C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = zIe2 ? LJJJLIIL().getVoiceVolume() : 0.0f;
        InterfaceC1418580n1E interfaceC1418580n1EH52 = H5();
        boolean zJX1 = interfaceC1418580n1EH52 != null ? interfaceC1418580n1EH52.JX1() : true;
        C817403Hg c817403Hg2 = new C817403Hg();
        c817403Hg2.element = zJX1 ? x5().getRecordVolume() : 0.0f;
        C817403Hg c817403Hg3 = new C817403Hg();
        c817403Hg3.element = LJJJLIIL().getMusicVolume();
        InterfaceC1452170ntP value = C5().g().getValue();
        if (value != null) {
            List<NLETrack> listLIZ = C349880Dne.LIZ(C352130DrH.LIZ(value), EnumC1461710o8n.VIDEO_VOICE);
            if (listLIZ != null) {
                ArrayList<NLETrackSlot> arrayList = new ArrayList();
                Iterator<NLETrack> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                }
                for (NLETrackSlot nLETrackSlot : arrayList) {
                    Iterator<NLETrackSlot> it3 = nLETrackSlot.getKeyframes().iterator();
                    while (it3.hasNext()) {
                        c817403Hg.element = Math.max(C351220Dpo.LJLLLL(it3.next().getMainSegment()), c817403Hg.element);
                    }
                    VecNLEKeyframe swingKeyframes = nLETrackSlot.getSwingKeyframes();
                    ArrayList arrayList2 = new ArrayList();
                    for (NLEKeyframe nLEKeyframe : swingKeyframes) {
                        if (nLEKeyframe.getKeyframeType() == NLEKeyframeType.Volume) {
                            arrayList2.add(nLEKeyframe);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        C19719612Di.LJJI(((NLEKeyframe) it4.next()).getSortedCommonKeyframes(), arrayList3);
                    }
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        Double d = (Double) C13LP.LJJJLL(((NLECommonKeyframe) it5.next()).getValue());
                        c817403Hg.element = Math.max(d != null ? (float) d.doubleValue() : 0.0f, c817403Hg.element);
                    }
                }
            }
            List<NLETrack> listLIZ2 = C349880Dne.LIZ(C352130DrH.LIZ(value), EnumC1461710o8n.MUSIC);
            if (listLIZ2 != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<NLETrack> it6 = listLIZ2.iterator();
                while (it6.hasNext()) {
                    C19719612Di.LJJI(it6.next().getSlots(), arrayList4);
                }
                ArrayList<NLETrackSlot> arrayList5 = new ArrayList();
                for (Object obj : arrayList4) {
                    if (((NLETrackSlot) obj).getKeyframes().size() > 0) {
                        arrayList5.add(obj);
                    }
                }
                for (NLETrackSlot nLETrackSlot2 : arrayList5) {
                    Iterator<NLETrackSlot> it7 = nLETrackSlot2.getKeyframes().iterator();
                    while (it7.hasNext()) {
                        c817403Hg3.element = Math.max(C351220Dpo.LJLLLL(it7.next().getMainSegment()), c817403Hg3.element);
                    }
                    VecNLEKeyframe swingKeyframes2 = nLETrackSlot2.getSwingKeyframes();
                    ArrayList arrayList6 = new ArrayList();
                    for (NLEKeyframe nLEKeyframe2 : swingKeyframes2) {
                        if (nLEKeyframe2.getKeyframeType() == NLEKeyframeType.Volume) {
                            arrayList6.add(nLEKeyframe2);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        C19719612Di.LJJI(((NLEKeyframe) it8.next()).getSortedCommonKeyframes(), arrayList7);
                    }
                    Iterator it9 = arrayList7.iterator();
                    while (it9.hasNext()) {
                        Double d2 = (Double) C13LP.LJJJLL(((NLECommonKeyframe) it9.next()).getValue());
                        c817403Hg3.element = Math.max(d2 != null ? (float) d2.doubleValue() : 0.0f, c817403Hg3.element);
                    }
                }
            }
            List<NLETrack> listLIZ3 = C349880Dne.LIZ(C352130DrH.LIZ(value), EnumC1461710o8n.RECORDING);
            if (listLIZ3 != null) {
                ArrayList arrayList8 = new ArrayList();
                Iterator<NLETrack> it10 = listLIZ3.iterator();
                while (it10.hasNext()) {
                    C19719612Di.LJJI(it10.next().getSlots(), arrayList8);
                }
                Iterator it11 = arrayList8.iterator();
                while (it11.hasNext()) {
                    for (NLETrackSlot nLETrackSlot3 : ((NLETrackSlot) it11.next()).getKeyframes()) {
                        float fLJLLLL = C351220Dpo.LJLLLL(nLETrackSlot3.getMainSegment());
                        if (nLETrackSlot3.hasExtra("volume_enhance_rate") && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot3.getExtra("volume_enhance_rate"))) != null) {
                            float fFloatValue = fLJIIIIZZ.floatValue();
                            if (fFloatValue != 0.0f) {
                                fLJLLLL /= fFloatValue;
                            }
                        }
                        c817403Hg2.element = Math.max(fLJLLLL, c817403Hg2.element);
                    }
                }
            }
        }
        if (Z4()) {
            float f = 100;
            int i = (int) (c817403Hg.element * f);
            int i2 = (int) (c817403Hg3.element * f);
            int iLIZ = C273400Ana.LIZ(i);
            if (1 > i2 || i2 >= iLIZ) {
                iLIZ = i2;
            }
            if (iLIZ != i2) {
                c817403Hg3.element = (iLIZ * 1.0f) / f;
                InterfaceC1418580n1E interfaceC1418580n1EH53 = H5();
                if (interfaceC1418580n1EH53 != null) {
                    interfaceC1418580n1EH53.A10(c817403Hg3.element);
                }
            }
        }
        i3(new C19757312Rv(c817403Hg, c817403Hg3, c817403Hg2, this, zIe2, zJX1, C1664590tQ1.LJII(this).getString(2131826775)));
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLJLL[3]);
    }

    private final C12SF M5() {
        return (C12SF) this.LLJJJIL.getValue(this, LLJLL[8]);
    }

    private final C12PK n5() {
        return (C12PK) this.LLJJIJIIJIL.getValue(this, LLJLL[5]);
    }

    private final C12PO t5() {
        return (C12PO) this.LLJJ.getValue(this, LLJLL[1]);
    }

    private final InterfaceC19753512Qj v5() {
        return (InterfaceC19753512Qj) this.LLJJI.getValue(this, LLJLL[2]);
    }

    public final void J6() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LIZJ(Float.valueOf(LJJJLIIL().getMusicVolume()), "volume_cnt");
        c0lab.LJ("volume_track", "background");
        C20684815ws.LJIILLIIL("music_volume_control", c0lab.LIZ);
        c0lab.LIZJ(Float.valueOf(LJJJLIIL().getVoiceVolume()), "volume_cnt");
        c0lab.LJ("volume_track", "voice");
        C20684815ws.LJIILLIIL("music_volume_control", c0lab.LIZ);
        c0lab.LIZJ(Float.valueOf(x5().getRecordVolume()), "volume_cnt");
        c0lab.LJ("volume_track", "record");
        C20684815ws.LJIILLIIL("music_volume_control", c0lab.LIZ);
    }

    public final C12RU k5() {
        return (C12RU) this.LLJILLL.getValue(this, LLJLL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12TN> o2() {
        return AFwS218S0000000_29.get$arr$(176);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12S2> w2() {
        return new AwS573S0100000_29(this, 268);
    }

    private final boolean F4() {
        AudioRecorderParam veAudioRecorderParam;
        StitchParams stitchParams = LJJJLIIL().getStitchParams();
        if ((stitchParams != null && stitchParams.getEnableMic()) || LJJJLIIL().isFastImport() || LJJJLIIL().isCutSameVideoType() || LJJJLIIL().hasOriginalSound()) {
            if (!LJJJLIIL().isMuted() && (((veAudioRecorderParam = LJJJLIIL().getVeAudioRecorderParam()) == null || veAudioRecorderParam.getNeedOriginalSound()) && (!LJJJLIIL().isCurrentAutoCutMode() || LJJJLIIL().getVoiceVolume() != 0.0f))) {
                return true;
            }
        } else if (LJJJLIIL().isCurrentAutoCutMode()) {
        }
        return false;
    }

    private final AudioRecorderParam x5() {
        AudioRecorderParam audioRecorderParamXq;
        AudioRecorderParam veAudioRecorderParam = LJJJLIIL().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null && n5().xq() != null && (audioRecorderParamXq = n5().xq()) != null) {
            audioRecorderParamXq.setRecordVolume(veAudioRecorderParam.getRecordVolume());
        }
        AudioRecorderParam audioRecorderParamXq2 = n5().xq();
        if (audioRecorderParamXq2 != null) {
            return audioRecorderParamXq2;
        }
        AudioRecorderParam veAudioRecorderParam2 = LJJJLIIL().getVeAudioRecorderParam();
        return veAudioRecorderParam2 == null ? new AudioRecorderParam() : veAudioRecorderParam2;
    }

    public final void P4() {
        J6();
        hide();
    }

    public final boolean Z4() {
        C348100Dkm c348100DkmLIZIZ;
        if (LJJJLIIL().hasMusic()) {
            return true;
        }
        InterfaceC1452170ntP value = C5().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null) {
            return false;
        }
        Iterator<NLETrack> it2 = c348100DkmLIZIZ.LIZ.getModel().getTracks().iterator();
        while (it2.hasNext()) {
            NLETrack next = it2.next();
            if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "BGM")) {
                return next != null;
            }
        }
        return false;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        v5().hR1("ae_volume");
        k5().LLIL(false);
        v5().tp2(this.LLJLILLLLZIIL);
        k5().cc2(true);
        K4();
        t5().Bi1().LJIIJ();
        C2487409ou.LIZLLL(500L, new ARunnableS129S0100000_29(this, 79));
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        L6();
        super.show();
        v5().sM2("ae_volume");
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        v5().ka1(this.LLJLILLLLZIIL);
        k5().cc2(false);
    }

    @Override // X.C12PP
    public boolean LJJIZ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    private final void d5(int i) {
        int iLIZ;
        if (!Z4() || (iLIZ = C273400Ana.LIZ(i)) <= 0) {
            return;
        }
        float f = 100;
        int musicVolume = (int) (LJJJLIIL().getMusicVolume() * f);
        if (1 <= musicVolume && musicVolume < iLIZ) {
            InterfaceC1418580n1E interfaceC1418580n1EH5 = H5();
            if (interfaceC1418580n1EH5 != null) {
                interfaceC1418580n1EH5.A10((iLIZ * 1.0f) / f);
            }
            i3(new AwS41S0001000_29(iLIZ, 19));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u6(X.EnumC1461710o8n r18) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19756812Rq.u6(X.0o8n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public final boolean K6(EnumC1461710o8n enumC1461710o8n) {
        NLEModel nLEModelLIZ;
        ?? arrayList;
        NLEResType resourceType;
        NLEResourceNode resource;
        InterfaceC1452170ntP value = C5().g().getValue();
        if (value != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        } else {
            nLEModelLIZ = null;
        }
        List<NLETrack> listLIZ = C349880Dne.LIZ(nLEModelLIZ, enumC1461710o8n);
        if (listLIZ != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrack> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList2);
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                if (enumC1461710o8n == EnumC1461710o8n.VIDEO_VOICE) {
                    NLEResType nLEResType = NLEResType.VIDEO;
                    NLESegment mainSegment = nLETrackSlot.getMainSegment();
                    if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                        resourceType = resource.getResourceType();
                    } else {
                        resourceType = null;
                    }
                    if (nLEResType == resourceType) {
                    }
                }
                if (nLETrackSlot.getKeyframes().size() > 0 || (C351220Dpo.LLIIIJ(nLETrackSlot) && C351220Dpo.LLFF(nLETrackSlot, NLEKeyframeType.Volume))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return !arrayList.isEmpty();
    }

    public final boolean R5(EnumC1461520o8U enumC1461520o8U) {
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        if (enumC1461520o8U == EnumC1461520o8U.ENABLE_KEYFRAME) {
            if (C0BYP.LIZ() || ((videoPublishEditModelLJJJLIIL = LJJJLIIL()) != null && C1428470nHB.LJJIZ(videoPublishEditModelLJJJLIIL))) {
                return true;
            }
            return false;
        }
        if (enumC1461520o8U != EnumC1461520o8U.SHOW_CUT_PRO) {
            return false;
        }
        String str = LJJJLIIL().creativeModel.ugcTemplateData.ugcTemplateId;
        if (str == null || a0.LJJJIL(str) || u4.LJLJJI(LJJJLIIL())) {
            return true;
        }
        return false;
    }

    public final void S5(int i) {
        float f = 100;
        int iLIZIZ = C273400Ana.LIZIZ(i, (int) (LJJJLIIL().getVoiceVolume() * f));
        if (this.LLJLIL != iLIZIZ) {
            this.LLJJJJLIIL = true;
        }
        InterfaceC1418580n1E interfaceC1418580n1EH5 = H5();
        if (interfaceC1418580n1EH5 != null) {
            interfaceC1418580n1EH5.A10((iLIZIZ * 1.0f) / f);
        }
        if (iLIZIZ != i) {
            i3(new AwS41S0001000_29(iLIZIZ, 20));
        }
    }

    public final void U5(int i) {
        if (this.LLJJLIIIJLLLLLLLZ != i) {
            this.LLJJJJLIIL = true;
        }
        this.LLJJJJJIL = false;
        InterfaceC1418580n1E interfaceC1418580n1EH5 = H5();
        if (interfaceC1418580n1EH5 != null) {
            interfaceC1418580n1EH5.N81((i * 1.0f) / 100);
        }
        d5(i);
    }

    public final void d6(boolean z) {
        k5().LLIL(z);
    }

    public final void m6(int i) {
        if (this.LLJL != i) {
            this.LLJJJJLIIL = true;
        }
        float f = (i * 1.0f) / 100;
        x5().setRecordVolume(f);
        C12SF c12sfM5 = M5();
        AudioRecorderParam audioRecorderParamXq = M5().xq();
        audioRecorderParamXq.setRecordVolume(f);
        c12sfM5.K20(audioRecorderParamXq);
        this.LLJJJJJIL = false;
        InterfaceC1418580n1E interfaceC1418580n1EH5 = H5();
        if (interfaceC1418580n1EH5 != null) {
            interfaceC1418580n1EH5.rI1(f);
        }
    }

    public C19756812Rq(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C12RU.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C12PO.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753512Qj.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C12PK.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), C12SF.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJLILLLLZIIL = new AwS573S0100000_29(this, 267);
    }

    private final void H4(EnumC1461710o8n enumC1461710o8n, int i) {
        int i2 = C19757012Rs.LIZ[enumC1461710o8n.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    U5(i);
                    i3(new AwS41S0001000_29(i, 18));
                    return;
                }
                throw new C1954807lC();
            }
            S5(i);
            i3(new AwS41S0001000_29(i, 17));
            return;
        }
        U5(i);
        i3(new AwS41S0001000_29(i, 16));
    }

    public final void N5(EnumC1461710o8n enumC1461710o8n, Pair<? extends NLETrackSlot, Long> pair) {
        String str;
        String uuid;
        NLETrackSlot first = pair.getFirst();
        long jLongValue = pair.getSecond().longValue();
        if (enumC1461710o8n == EnumC1461710o8n.MUSIC) {
            str = "bottom_item_bgm_edit_volume";
        } else if (enumC1461710o8n == EnumC1461710o8n.RECORDING) {
            str = "bottom_item_voiceover_edit_volume";
        } else {
            str = "bottom_item_edit_volume";
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        if (first != null) {
            uuid = first.getUUID();
        } else {
            uuid = null;
        }
        c363500EMy.getClass();
        C363500EMy.LJIIL = uuid;
        c363500EMy.getClass();
        C363500EMy.LJIILIIL = str;
        c363500EMy.getClass();
        C363500EMy.LJIILIIL = str;
        Long lValueOf = Long.valueOf(jLongValue);
        c363500EMy.getClass();
        C363500EMy.LJIILL = lValueOf;
        c363500EMy.getClass();
        C363500EMy.LJIILJJIL = true;
        InterfaceC1460000o62 interfaceC1460000o62E5 = E5();
        if (interfaceC1460000o62E5 != null) {
            interfaceC1460000o62E5.Ws(15);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, kotlin.Pair] */
    public final void T4(boolean z, EnumC1461710o8n enumC1461710o8n) {
        NLEModel nLEModelLIZ;
        long jLLLLLLJ;
        boolean zR5 = R5(EnumC1461520o8U.SHOW_CUT_PRO);
        if (z) {
            if (zR5) {
                InterfaceC1452170ntP value = C5().g().getValue();
                if (value != null) {
                    nLEModelLIZ = C352130DrH.LIZ(value);
                } else {
                    nLEModelLIZ = null;
                }
                if (C5().g().getValue() != null) {
                    jLLLLLLJ = C351220Dpo.LLLLLLJ(r0.LLL());
                } else {
                    jLLLLLLJ = 0;
                }
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = C349880Dne.LIZIZ(nLEModelLIZ, jLLLLLLJ, enumC1461710o8n);
                hide();
                k5().cp();
                C0CNO.LIZLLL(100L, new AwS273S0300000_29(this, (C19756812Rq) enumC1461710o8n, (EnumC1461710o8n) c259800zU, (C259800zU<Pair<NLETrackSlot, Long>>) 6));
                return;
            }
            u6(enumC1461710o8n);
            return;
        }
        if (!zR5) {
            return;
        }
        u6(enumC1461710o8n);
    }

    public final void O4(int i, int i2, int i3) {
        this.LLJJJJLIIL = false;
        U5(i);
        S5(i2);
        m6(i3);
        if (!this.LLJJL) {
            hide();
        }
    }
}
