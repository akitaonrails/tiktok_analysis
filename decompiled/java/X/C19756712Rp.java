package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12Rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19756712Rp extends AbstractC19754512Qt<InterfaceC19668911xP, C19760712Td, C12TZ, C19757412Rw> implements InterfaceC19668911xP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C1DRG LLJJIII;
    public final C12PU LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public int LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C12SA LLL;
    public final Function0<Unit> LLLF;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void N6() {
        /*
            r10 = this;
            r5 = r10
            X.0n1E r0 = r5.D5()
            if (r0 == 0) goto L79
            boolean r7 = r0.Ie2()
        Lb:
            r3 = 100
            if (r7 == 0) goto L77
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LJJJLIIL()
            float r1 = r0.getVoiceVolume()
            float r0 = (float) r3
            float r1 = r1 * r0
            int r4 = (int) r1
        L1a:
            X.0n1E r0 = r5.D5()
            r2 = 1
            if (r0 == 0) goto L6e
            boolean r8 = r0.JX1()
            if (r8 != 0) goto L6f
            r6 = 0
        L28:
            android.app.Activity r1 = X.C1664590tQ1.LJII(r5)
            r0 = 2131826775(0x7f111857, float:1.9286444E38)
            java.lang.String r9 = r1.getString(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LJJJLIIL()
            float r0 = r0.getMusicVolume()
            float r3 = (float) r3
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.LLJZ = r0
            boolean r0 = r5.k5()
            if (r0 == 0) goto L65
            int r1 = r5.LLJZ
            int r0 = X.C273400Ana.LIZ(r4)
            if (r2 > r1) goto L51
            if (r1 >= r0) goto L51
            r1 = r0
        L51:
            int r0 = r5.LLJZ
            if (r1 == r0) goto L65
            r5.LLJZ = r1
            X.0n1E r2 = r5.D5()
            if (r2 == 0) goto L65
            float r1 = (float) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r1 = r1 / r3
            r2.A10(r1)
        L65:
            X.12S9 r3 = new X.12S9
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r5.i3(r3)
            return
        L6e:
            r8 = 1
        L6f:
            float r1 = r5.t5()
            float r0 = (float) r3
            float r1 = r1 * r0
            int r6 = (int) r1
            goto L28
        L77:
            r4 = 0
            goto L1a
        L79:
            boolean r7 = r5.H4()
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19756712Rp.N6():void");
    }

    @Override // X.InterfaceC19668911xP
    public void LLILLJJLI() {
    }

    @Override // X.InterfaceC19668911xP
    public void Sj() {
        this.LLJJL = false;
        float f = 100;
        this.LLJL = (int) (LJJJLIIL().getVoiceVolume() * f);
        this.LLJLILLLLZIIL = (int) (LJJJLIIL().getMusicVolume() * f);
        this.LLJLIL = (int) (t5() * f);
    }

    @Override // X.InterfaceC19668911xP
    public String getPanelName() {
        return "ae_volume";
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19756712Rp.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19756712Rp.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19756712Rp.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19756712Rp.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19756712Rp.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19756712Rp.class, "titleUIComponent", "getTitleUIComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/titlebar/VoiceTitleApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C19756712Rp.class, "voicePlayControl", "getVoicePlayControl()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/player/VoicePlayControlApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C19756712Rp.class, "rememberLastSelectMusicApi", "getRememberLastSelectMusicApi()Lcom/ss/android/ugc/gamora/editor/music/RememberLastSelectMusicApi;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLLFFI = 8;
    }

    private final InterfaceC1460000o62 C5() {
        return (InterfaceC1460000o62) this.LLJJJJ.getValue(this, LLLFF[4]);
    }

    private final InterfaceC1418580n1E D5() {
        return (InterfaceC1418580n1E) this.LLJJIJIL.getValue(this, LLLFF[1]);
    }

    private final NLEEditor E5() {
        return (NLEEditor) this.LLJLLL.getValue();
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue(this, LLLFF[0]);
    }

    private final InterfaceC1459480o5C M5() {
        return (InterfaceC1459480o5C) this.LLJZIJLIL.getValue(this, LLLFF[7]);
    }

    private final InterfaceC19750812Pi N5() {
        return (InterfaceC19750812Pi) this.LLJJJJJIL.getValue(this, LLLFF[5]);
    }

    private final void P4() {
        if (this.LLJJJJLIIL) {
            return;
        }
        if (!(LJJJLIIL().getVoiceVolume() == 0.0f)) {
            AudioRecorderParam veAudioRecorderParam = LJJJLIIL().getVeAudioRecorderParam();
            if (!Intrinsics.LIZLLL(veAudioRecorderParam != null ? Float.valueOf(veAudioRecorderParam.getRecordVolume()) : null, 0.0f)) {
                return;
            }
        }
        this.LLJJJJLIIL = true;
        InterfaceC1456910o13 interfaceC1456910o13X5 = x5();
        if (interfaceC1456910o13X5 != null && C0EYG.LIZ(LJJJLIIL()) && interfaceC1456910o13X5.sj1()) {
            interfaceC1456910o13X5.n80();
            InterfaceC1452170ntP value = v5().g().getValue();
            interfaceC1456910o13X5.Dt1(value != null ? C352130DrH.LIZ(value) : null);
        }
    }

    private final InterfaceC19668811xO R5() {
        return (InterfaceC19668811xO) this.LLJLLIL.getValue(this, LLLFF[6]);
    }

    private final InterfaceC1456910o13 x5() {
        return (InterfaceC1456910o13) this.LLJJJ.getValue(this, LLLFF[2]);
    }

    public final void K6() {
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
        c0lab.LIZJ(Float.valueOf(H5()), "volume_cnt");
        c0lab.LJ("volume_track", "record");
        C20684815ws.LJIILLIIL("music_volume_control", c0lab.LIZ);
    }

    @Override // X.InterfaceC19668911xP
    public boolean mP1() {
        return !this.LLJLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12TZ> o2() {
        return AFwS218S0000000_29.get$arr$(169);
    }

    public final InterfaceC1455860nzM v5() {
        return (InterfaceC1455860nzM) this.LLJJJIL.getValue(this, LLLFF[3]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19757412Rw> w2() {
        return new AwS573S0100000_29(this, 257);
    }

    private final boolean H4() {
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

    private final float H5() {
        NLETrack nLETrackPrevious;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        NLEModel model = E5().getModel();
        float fMax = 0.0f;
        if (model == null) {
            return 0.0f;
        }
        VecNLETrackSPtr tracks = model.getTracks();
        ListIterator<NLETrack> listIterator = tracks.listIterator(tracks.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                nLETrackPrevious = null;
                break;
            }
            nLETrackPrevious = listIterator.previous();
            if (Intrinsics.LJFF(nLETrackPrevious.getExtra("AudioTrackType"), "DUB")) {
                break;
            }
        }
        NLETrack nLETrack = nLETrackPrevious;
        if (nLETrack != null && (slots = nLETrack.getSlots()) != null && slots.size() > 0 && nLETrack != null && (slots2 = nLETrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots2.iterator();
            while (it2.hasNext()) {
                fMax = Math.max(fMax, C351220Dpo.LJLLLL(it2.next().getMainSegment()));
            }
        }
        return fMax;
    }

    private final void K4() {
        InterfaceC1459480o5C interfaceC1459480o5CM5;
        if (!C12DO.LIZ() || LJJJLIIL().getMusicVolume() > 0.0f || (interfaceC1459480o5CM5 = M5()) == null) {
            return;
        }
        interfaceC1459480o5CM5.QI1();
    }

    private final float t5() {
        NLETrack nLETrackPrevious;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        Float fLJIIIIZZ;
        NLEModel model = E5().getModel();
        float fMax = 0.0f;
        if (model == null) {
            return 0.0f;
        }
        VecNLETrackSPtr tracks = model.getTracks();
        ListIterator<NLETrack> listIterator = tracks.listIterator(tracks.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                nLETrackPrevious = null;
                break;
            }
            nLETrackPrevious = listIterator.previous();
            if (Intrinsics.LJFF(nLETrackPrevious.getExtra("AudioTrackType"), "DUB")) {
                break;
            }
        }
        NLETrack nLETrack = nLETrackPrevious;
        if (nLETrack != null && (slots = nLETrack.getSlots()) != null && slots.size() > 0 && nLETrack != null && (slots2 = nLETrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots2) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    float volume = nLESegmentAudioDynamicCast.getVolume();
                    if (nLETrackSlot.hasExtra("volume_before_enhance") && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("volume_before_enhance"))) != null) {
                        volume = fLJIIIIZZ.floatValue();
                    }
                    fMax = Math.max(fMax, volume);
                }
            }
        }
        return fMax;
    }

    @Override // X.InterfaceC19668911xP, X.C12PY
    public void LIZ() {
        N6();
        show();
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJJIJI.LIZLLL(getPanelName(), this.LLLF);
    }

    @Override // X.InterfaceC19668911xP, X.C12PY
    public void LIZLLL() {
        hide();
        P4();
        this.LLJJIJI.LJ(this.LLLF);
    }

    public final void Z4() {
        K6();
        this.LLJJIJI.LIZIZ("ae_volume");
        K4();
    }

    public final boolean k5() {
        C348100Dkm c348100DkmLIZIZ;
        if (LJJJLIIL().hasMusic()) {
            return true;
        }
        InterfaceC1452170ntP value = v5().g().getValue();
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

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJJIJI.LIZ(new C12PR() { // from class: X.12Rn
            @Override // X.C12PR
            public final void LIZ(String str) {
            }

            @Override // X.C12PR
            public final void LIZJ() {
            }

            @Override // X.C12PR
            public final void LIZIZ(String str) {
                if (Intrinsics.LJFF(str, "ae_voiceChange")) {
                    this.LIZ.Sj();
                }
            }
        });
        F4().OL1().LIZIZ(new InterfaceC19750712Ph() { // from class: X.12Rm
            @Override // X.InterfaceC19750712Ph
            public final void LIZ(C19750412Pe c19750412Pe) {
                if (c19750412Pe.LIZ) {
                    this.LIZ.F4().OL1().getClass();
                    C19750512Pf.LIZ(c19750412Pe);
                } else if (this.LIZ.LJJIZ()) {
                    c19750412Pe.LIZ();
                    ((ArrayList) c19750412Pe.LIZLLL).add(new AwS430S0200000_29(this.LIZ, c19750412Pe, 32));
                } else {
                    this.LIZ.F4().OL1().getClass();
                    C19750512Pf.LIZ(c19750412Pe);
                }
            }
        });
    }

    @Override // X.InterfaceC19668911xP
    public boolean LJJIZ() {
        return this.LLJJL;
    }

    @Override // X.AbstractC19754512Qt, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J6(X.EnumC1461710o8n r18) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19756712Rp.J6(X.0o8n):void");
    }

    private final void n5(int i) {
        int iLIZ;
        if (!k5() || (iLIZ = C273400Ana.LIZ(i)) <= 0) {
            return;
        }
        float f = 100;
        int musicVolume = (int) (LJJJLIIL().getMusicVolume() * f);
        if (1 <= musicVolume && musicVolume < iLIZ) {
            InterfaceC1418580n1E interfaceC1418580n1ED5 = D5();
            if (interfaceC1418580n1ED5 != null) {
                interfaceC1418580n1ED5.A10((iLIZ * 1.0f) / f);
            }
            i3(new AwS41S0001000_29(iLIZ, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public final boolean L6(EnumC1461710o8n enumC1461710o8n) {
        NLEModel nLEModelLIZ;
        ?? arrayList;
        NLEResType resourceType;
        NLESegment mainSegment;
        NLEResourceNode resource;
        InterfaceC1452170ntP value = v5().g().getValue();
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
                    if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                        resourceType = resource.getResourceType();
                    } else {
                        resourceType = null;
                    }
                    if (nLEResType == resourceType) {
                    }
                }
                if (C351220Dpo.LLF(nLETrackSlot) || (C351220Dpo.LLIIIJ(nLETrackSlot) && C351220Dpo.LLFF(nLETrackSlot, NLEKeyframeType.Volume))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return !arrayList.isEmpty();
    }

    @Override // X.InterfaceC19668911xP
    public void LLIIL(Function0<Unit> function0) {
        function0.invoke();
    }

    public final void LLIL(boolean z) {
        if (z) {
            R5().Lf("");
        } else {
            R5().pause("");
        }
        this.LLJLL = z;
    }

    @Override // X.InterfaceC19668911xP
    public void LLJJJJJIL(Function0<Unit> function0) {
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = true;
        u6(this.LLJLIL);
        d6(this.LLJLILLLLZIIL);
        m6(this.LLJL);
        function0.invoke();
    }

    public final boolean U5(EnumC1461520o8U enumC1461520o8U) {
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

    public final void d6(int i) {
        float f = 100;
        int iLIZIZ = C273400Ana.LIZIZ(i, (int) (LJJJLIIL().getVoiceVolume() * f));
        if (this.LLJLILLLLZIIL != iLIZIZ) {
            this.LLJJL = true;
        }
        InterfaceC1418580n1E interfaceC1418580n1ED5 = D5();
        if (interfaceC1418580n1ED5 != null) {
            interfaceC1418580n1ED5.A10((iLIZIZ * 1.0f) / f);
        }
        if (iLIZIZ != i) {
            i3(new AwS41S0001000_29(iLIZIZ, 15));
        }
    }

    public final void m6(int i) {
        if (this.LLJL != i) {
            this.LLJJL = true;
        }
        this.LLJJJJLIIL = false;
        InterfaceC1418580n1E interfaceC1418580n1ED5 = D5();
        if (interfaceC1418580n1ED5 != null) {
            interfaceC1418580n1ED5.N81((i * 1.0f) / 100);
        }
        n5(i);
    }

    public final void u6(int i) {
        if (this.LLJLIL != i) {
            this.LLJJL = true;
        }
        InterfaceC1418580n1E interfaceC1418580n1ED5 = D5();
        if (interfaceC1418580n1ED5 != null) {
            interfaceC1418580n1ED5.rI1((i * 1.0f) / 100);
        }
    }

    private final void O4(EnumC1461710o8n enumC1461710o8n, int i) {
        int i2 = C19756912Rr.LIZ[enumC1461710o8n.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    m6(i);
                    i3(new AwS41S0001000_29(i, 13));
                    return;
                }
                throw new C1954807lC();
            }
            d6(i);
            i3(new AwS41S0001000_29(i, 12));
            return;
        }
        m6(i);
        i3(new AwS41S0001000_29(i, 11));
    }

    public final void S5(EnumC1461710o8n enumC1461710o8n, Pair<? extends NLETrackSlot, Long> pair) {
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
        Long lValueOf = Long.valueOf(jLongValue);
        c363500EMy.getClass();
        C363500EMy.LJIILL = lValueOf;
        c363500EMy.getClass();
        C363500EMy.LJIILJJIL = true;
        InterfaceC1460000o62 interfaceC1460000o62C5 = C5();
        if (interfaceC1460000o62C5 != null) {
            interfaceC1460000o62C5.Ws(15);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, kotlin.Pair] */
    public final void d5(boolean z, EnumC1461710o8n enumC1461710o8n) {
        NLEModel nLEModelLIZ;
        long jLLLLLLJ;
        boolean zU5 = U5(EnumC1461520o8U.SHOW_CUT_PRO);
        if (z) {
            if (zU5) {
                InterfaceC1452170ntP value = v5().g().getValue();
                if (value != null) {
                    nLEModelLIZ = C352130DrH.LIZ(value);
                } else {
                    nLEModelLIZ = null;
                }
                if (v5().g().getValue() != null) {
                    jLLLLLLJ = C351220Dpo.LLLLLLJ(r0.LLL());
                } else {
                    jLLLLLLJ = 0;
                }
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = C349880Dne.LIZIZ(nLEModelLIZ, jLLLLLLJ, enumC1461710o8n);
                hide();
                InterfaceC19750812Pi interfaceC19750812PiN5 = N5();
                if (interfaceC19750812PiN5 != null) {
                    interfaceC19750812PiN5.cp();
                }
                C0CNO.LIZLLL(500L, new AwS273S0300000_29(this, (C19756712Rp) enumC1461710o8n, (EnumC1461710o8n) c259800zU, (C259800zU<Pair<NLETrackSlot, Long>>) 5));
                return;
            }
            J6(enumC1461710o8n);
            return;
        }
        if (!zU5) {
            return;
        }
        J6(enumC1461710o8n);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.12SA] */
    public C19756712Rp(C19A3 c19a3, C1DRG c1drg, C12PU c12pu) {
        super(c19a3, c1drg, c12pu);
        this.LLJJIII = c1drg;
        this.LLJJIJI = c12pu;
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19750812Pi.class, null);
        this.LLJLL = true;
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19668811xO.class, null);
        this.LLJLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 255));
        this.LLJZ = Integer.MIN_VALUE;
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459480o5C.class, null);
        this.LLL = new InterfaceC1462000o9G() { // from class: X.12SA
            @Override // X.InterfaceC1462000o9G
            public final boolean LJL(boolean z) {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean LLIIIJ() {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean b0() {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean x0() {
                return !this.LL.LLJLL;
            }
        };
        this.LLLF = new AwS573S0100000_29(this, 256);
    }

    public final void T4(int i, int i2, int i3) {
        this.LLJJL = false;
        m6(i);
        d6(i2);
        u6(i3);
        if (!this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJIJI.LIZIZ(getPanelName());
        }
        K4();
    }
}
