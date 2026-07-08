package X;

import Y.ARunnableS129S0100000_29;
import Y.ARunnableS98S0200000_29;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12SE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12SE extends i<C12PK, C19759512Sr, C12SK, C12SY> implements C12PK, InterfaceC379610EuV {
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
    public AudioRecorderParam LLJJJJ;
    public AudioRecorderParam LLJJJJJIL;
    public AudioRecorderParam LLJJJJLIIL;
    public boolean LLJJL;
    public EnumC1090580eUC LLJJLIIIJLLLLLLLZ;
    public C0KW7 LLJL;
    public final Function0<C19759512Sr> LLJLIL;
    public final Function0<Unit> LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12SE.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12SE.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12SE.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12SE.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12SE.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C12SE.class, "aeChangeUIComponent", "getAeChangeUIComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/AEVoiceChangeUIComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C12SE.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C12SE.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C12SE.class, "aeVoiceChangeApiComponent", "getAeVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/AEVoiceChangeApiComponent;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJLLIL = 8;
    }

    private final C19753212Qg K4() {
        return (C19753212Qg) this.LLJJIJIIJIL.getValue(this, LLJLL[5]);
    }

    private final InterfaceC19753512Qj T4() {
        return (InterfaceC19753512Qj) this.LLJJI.getValue(this, LLJLL[2]);
    }

    private final InterfaceC1418580n1E k5() {
        return (InterfaceC1418580n1E) this.LLJJIJIL.getValue(this, LLJLL[6]);
    }

    private final void v5() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C352050Dr9(this, null), 3);
    }

    public final void H4() {
        Wt1(new AwS573S0100000_29(this, 214));
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLJLL[4]);
    }

    public final C12RU O4() {
        return (C12RU) this.LLJILLL.getValue(this, LLJLL[0]);
    }

    public final C12PO P4() {
        return (C12PO) this.LLJJJIL.getValue(this, LLJLL[8]);
    }

    @Override // X.C12PK
    public boolean Ug() {
        return this.LLJJLIIIJLLLLLLLZ != EnumC1090580eUC.IDLE;
    }

    public final InterfaceC1455860nzM Z4() {
        return (InterfaceC1455860nzM) this.LLJJ.getValue(this, LLJLL[1]);
    }

    public final InterfaceC1461660o8i d5() {
        return (InterfaceC1461660o8i) this.LLJJJ.getValue(this, LLJLL[7]);
    }

    public final AudioRecorderParam n5() {
        if (this.LLJJJJJIL == null) {
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.copyFrom(t5().s61());
            this.LLJJJJJIL = audioRecorderParam;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" getRecordParam curRecordParam?.needOriginalSound = ");
        AudioRecorderParam audioRecorderParam2 = this.LLJJJJJIL;
        sbLIZ.append(audioRecorderParam2 != null ? Boolean.valueOf(audioRecorderParam2.getNeedOriginalSound()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        AudioRecorderParam audioRecorderParam3 = this.LLJJJJJIL;
        return audioRecorderParam3 == null ? new AudioRecorderParam() : audioRecorderParam3;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12SK> o2() {
        return new AwS573S0100000_29(this, 215);
    }

    public final C12SF t5() {
        return (C12SF) this.LLJJIII.getValue(this, LLJLL[3]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12SY> w2() {
        return new AwS573S0100000_29(this, 218);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C12PK
    public boolean wt0() {
        return ((Boolean) ((C375830EoP) Z1(new C2217381BqS() { // from class: X.12SM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SK) obj).LJFF;
            }
        }).LIZJ()).LIZ).booleanValue();
    }

    private final void E5() {
        t5().Np1(new InterfaceC352140DrI() { // from class: X.12ST
            @Override // X.InterfaceC352140DrI
            public final void LIZ() {
            }

            @Override // X.InterfaceC352140DrI
            public final void LIZIZ() {
            }
        });
    }

    private final void x5() {
        E5();
        t5().Nu2(P4().Bi1());
    }

    @Override // X.C12PK
    public void Iw() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        InterfaceC1452170ntP value = Z4().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLEEditor.getModel().getMainTrack().getSlotByIndex(0).getMainSegment())) == null || nLESegmentVideoDynamicCast.getCanvasStyle() != null) {
            return;
        }
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        nLEStyCanvas.setExtra("extra_canvas_style_from", "audioEditing");
        nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
        nLEEditor.commit();
    }

    @Override // X.C12PK
    public boolean Zo() {
        AudioRecorderParam audioRecorderParam;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" oldRecordParam == ");
        sbLIZ.append(this.LLJJJJ == null);
        sbLIZ.append(" , needOriginalSound = ");
        AudioRecorderParam audioRecorderParam2 = this.LLJJJJJIL;
        sbLIZ.append(audioRecorderParam2 != null ? Boolean.valueOf(audioRecorderParam2.getNeedOriginalSound()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        AudioRecorderParam audioRecorderParam3 = this.LLJJJJ;
        if (audioRecorderParam3 == null || (audioRecorderParam = this.LLJJJJJIL) == null) {
            return false;
        }
        return audioRecorderParam.hasChange(audioRecorderParam3, C390110FRh.LIZ(k5(), LJJJLIIL()));
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        T4().hR1("ae_record");
        this.LLJJL = false;
        T4().tp2(this.LLJLILLLLZIIL);
        O4().cc2(true);
        P4().Bi1().LIZJ = true;
    }

    @Override // X.C12PK
    public boolean isRecording() {
        return t5().isRecording();
    }

    @Override // X.C12PK
    public void py2() {
        boolean zLIZ = C390110FRh.LIZ(k5(), LJJJLIIL());
        i3(new AwS41S0010000_29(zLIZ, 18));
        C12SF c12sfT5 = t5();
        AudioRecorderParam audioRecorderParamXq = t5().xq();
        audioRecorderParamXq.setNeedOriginalSound(zLIZ);
        c12sfT5.K20(audioRecorderParamXq);
        AudioRecorderParam audioRecorderParam = this.LLJJJJJIL;
        if (audioRecorderParam != null) {
            audioRecorderParam.setNeedOriginalSound(zLIZ);
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        T4().sM2("ae_record");
        this.LLJJL = true;
        T4().ka1(this.LLJLILLLLZIIL);
        v5();
        x5();
        O4().cc2(false);
        i3(new AwS608S0100000_29(this, 161));
        P4().Bi1().LIZJ = false;
        T4().TF2(new AwS549S0100000_5(this, 65));
    }

    @Override // ge.i
    public Function0<C19759512Sr> E3() {
        return this.LLJLIL;
    }

    @Override // X.C12PK
    public AudioRecorderParam Uh0() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.C12PK
    public AudioRecorderParam xq() {
        return this.LLJJJJJIL;
    }

    public final void C5(boolean z) {
        InterfaceC1418580n1E interfaceC1418580n1EK5 = k5();
        if (interfaceC1418580n1EK5 != null) {
            interfaceC1418580n1EK5.Hr1(z, false, true);
        }
        i3(new AwS41S0010000_29(z, 16));
        C12SF c12sfT5 = t5();
        AudioRecorderParam audioRecorderParamXq = t5().xq();
        audioRecorderParamXq.setNeedOriginalSound(z);
        c12sfT5.K20(audioRecorderParamXq);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LIZ(z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("enter_method", "click_audio_editing_panel");
        C20684815ws.LJIILLIIL("click_original_sound", c0lab.LIZ);
    }

    @Override // X.C12PK
    public void Di(InterfaceC352140DrI interfaceC352140DrI) {
        Rt(wt0(), null, AFwS218S0000000_29.get$arr$(156), AFwS273S0000000_29.get$arr$(114));
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        t5().Di(interfaceC352140DrI);
    }

    public final void F4(Cert cert) {
        t5().gb2(new AwS573S0100000_29(this, 213), AFwS273S0000000_29.get$arr$(113), cert);
        K4().K4();
    }

    @Override // X.C12PK
    public void LLIL(boolean z) {
        i3(new AwS41S0010000_29(z, 17));
    }

    public final void M5(int i) {
        i3(new AwS41S0001000_29(i, 9));
    }

    @Override // X.C12PK
    public void Mo(InterfaceC352140DrI interfaceC352140DrI) {
        AudioRecorderParam audioRecorderParam = this.LLJJJJ;
        AudioRecorderParam audioRecorderParam2 = this.LLJJJJJIL;
        if (audioRecorderParam != null && audioRecorderParam2 != null) {
            Xc(new AwS430S0200000_29(this, interfaceC352140DrI, 23));
            return;
        }
        t5().Mo(interfaceC352140DrI);
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
    }

    public final void N5(EnumC1090580eUC enumC1090580eUC) {
        this.LLJJLIIIJLLLLLLLZ = enumC1090580eUC;
    }

    @Override // X.C12PK
    public void Wt1(Function0<Unit> function0) {
        O4().LLIL(false);
        t5().tQ1(wt0(), null, AFwS218S0000000_29.get$arr$(157), AFwS273S0000000_29.get$arr$(115), new AwS464S0200000_29(this, (C12SE) function0, (Function0<Unit>) 2));
    }

    @Override // X.C12PK
    public void Xc(final Function0<Unit> function0) {
        t5().yt2();
        AudioRecorderParam audioRecorderParam = this.LLJJJJ;
        AudioRecorderParam audioRecorderParam2 = this.LLJJJJJIL;
        if (audioRecorderParam != null && audioRecorderParam2 != null) {
            t5().TI0(audioRecorderParam, audioRecorderParam2, new InterfaceC352140DrI() { // from class: X.12SI
                @Override // X.InterfaceC352140DrI
                public final void LIZ() {
                    C2487409ou.LIZJ(new ARunnableS129S0100000_29(this.LIZ, 64));
                }

                @Override // X.InterfaceC352140DrI
                public final void LIZIZ() {
                    C2487409ou.LIZJ(new ARunnableS98S0200000_29(this.LIZ, function0, 25));
                }
            });
        } else {
            function0.invoke();
        }
    }

    @Override // X.C12PK
    public void tr1(Function1<? super Boolean, Unit> function1) {
        if (this.LLJJL) {
            AudioRecorderParam audioRecorderParam = this.LLJJJJJIL;
            if (audioRecorderParam != null && audioRecorderParam.hasChange(t5().xq(), true)) {
                P4().ho2(t5().xq());
                AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
                audioRecorderParam2.copyFrom(t5().xq());
                this.LLJJJJJIL = audioRecorderParam2;
                function1.invoke(Boolean.TRUE);
                return;
            }
            function1.invoke(Boolean.FALSE);
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public C12SE(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C12RU.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753512Qj.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C12SF.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C19753212Qg.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461660o8i.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), C12PO.class, null);
        this.LLJJLIIIJLLLLLLLZ = EnumC1090580eUC.IDLE;
        this.LLJLIL = new AwS573S0100000_29(this, 219);
        this.LLJLILLLLZIIL = new AwS573S0100000_29(this, 216);
    }

    public final void H5(Cert cert, String str) {
        t5().rr1(cert, new AwS573S0100000_29(this, 220));
        if (str.length() > 0) {
            t5().uT(str);
        }
    }

    public final void D5(boolean z, int i, Cert cert, String str) {
        t5().RD2(z, i, cert, new AwS573S0100000_29(this, 217), AFwS266S0000000_25.get$arr$(129));
        P4().AL2();
        if (str.length() > 0) {
            t5().Vu0(str);
        }
    }

    @Override // X.C12PK
    public void Rt(boolean z, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        t5().Rt(z, cert, function0, function1);
    }
}
