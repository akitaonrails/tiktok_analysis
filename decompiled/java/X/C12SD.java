package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS247S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS98S0200000_29;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12SD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12SD extends AbstractC19754512Qt<InterfaceC19669211xS, C19759412Sq, C12SL, C19757912Sb> implements InterfaceC19669211xS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public static final int LLLIIII;
    public final C1DRG LLJJIII;
    public final C12PU LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public EnumC1087350eOz LLJJL;
    public AudioRecorderParam LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public Effect LLJLILLLLZIIL;
    public AudioRecorderParam LLJLL;
    public AudioRecorderParam LLJLLIL;
    public boolean LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public String LLJZIJLIL;
    public List<Pair<Long, Float>> LLL;
    public C0KW7 LLLF;
    public final Function0<Unit> LLLFF;
    public C19759412Sq LLLFFI;
    public final Function0<C19759412Sq> LLLFZ;
    public final C12SG LLLI;

    @Override // X.InterfaceC19669211xS
    public void LLILLJJLI() {
    }

    public final void T4() {
    }

    @Override // X.InterfaceC19669211xS
    public String getPanelName() {
        return "ae_record";
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12SD.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12SD.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12SD.class, "voicePlayControl", "getVoicePlayControl()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/player/VoicePlayControlApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12SD.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12SD.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C12SD.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C12SD.class, "voiceChangeUIComponent", "getVoiceChangeUIComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/voicechange/VoiceChangeUIComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C12SD.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLLIIII = 8;
    }

    private final C19753112Qf D5() {
        return (C19753112Qf) this.LLJJJJLIIL.getValue(this, LLLII[6]);
    }

    private final InterfaceC1418580n1E n5() {
        return (InterfaceC1418580n1E) this.LLJJJJJIL.getValue(this, LLLII[5]);
    }

    private final NLEEditor t5() {
        return (NLEEditor) this.LLJL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean wt0() {
        return ((Boolean) ((C375830EoP) Z1(new C2217381BqS() { // from class: X.12SN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SL) obj).LIZ;
            }
        }).LIZJ()).LIZ).booleanValue();
    }

    public final C12SF C5() {
        return (C12SF) this.LLJJJJ.getValue(this, LLLII[4]);
    }

    public final InterfaceC19668811xO E5() {
        return (InterfaceC19668811xO) this.LLJJJ.getValue(this, LLLII[2]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLLII[1]);
    }

    public final void M5() {
        if (!this.LLL.isEmpty()) {
            i3(new AwS584S0100000_5(this, 43));
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C352060DrA(this, null), 3);
        }
    }

    public final boolean O4() {
        AudioRecorderParam audioRecorderParam;
        if (!this.LLJLLL || this.LLJLILLLLZIIL == null || !H5() || (audioRecorderParam = this.LLJJLIIIJLLLLLLLZ) == null || !audioRecorderParam.hasChange(C5().xq(), true)) {
            return false;
        }
        F4().ZD0().LJIIJ(C5().xq());
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom(C5().xq());
        this.LLJJLIIIJLLLLLLLZ = audioRecorderParam2;
        return true;
    }

    public final void P4() {
        Wt1(new AwS573S0100000_29(this, 236));
    }

    public final boolean Ug() {
        return this.LLJJL != EnumC1087350eOz.IDLE;
    }

    public final InterfaceC559500Lwy Z4() {
        return (InterfaceC559500Lwy) this.LLJZ.getValue(this, LLLII[7]);
    }

    public final InterfaceC1455860nzM d5() {
        return (InterfaceC1455860nzM) this.LLJJIJIIJIL.getValue(this, LLLII[0]);
    }

    public final InterfaceC1461660o8i k5() {
        return (InterfaceC1461660o8i) this.LLJJJIL.getValue(this, LLLII[3]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12SL> o2() {
        return new AwS573S0100000_29(this, 237);
    }

    public final AudioRecorderParam v5() {
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.copyFrom(C5().s61());
            this.LLJJLIIIJLLLLLLLZ = audioRecorderParam;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" getRecordParam curRecordParam?.needOriginalSound = ");
        AudioRecorderParam audioRecorderParam2 = this.LLJJLIIIJLLLLLLLZ;
        sbLIZ.append(audioRecorderParam2 != null ? Boolean.valueOf(audioRecorderParam2.getNeedOriginalSound()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        AudioRecorderParam audioRecorderParam3 = this.LLJJLIIIJLLLLLLLZ;
        return audioRecorderParam3 == null ? new AudioRecorderParam() : audioRecorderParam3;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19757912Sb> w2() {
        return new AwS573S0100000_29(this, 234);
    }

    public final C0EZF x5() {
        return (C0EZF) this.LLJLIL.getValue();
    }

    private final boolean H5() {
        NLETrack nLETrackPrevious;
        VecNLETrackSlotSPtr slots;
        NLEModel model = t5().getModel();
        if (model == null) {
            return false;
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
        return (nLETrack == null || (slots = nLETrack.getSlots()) == null || slots.size() <= 0) ? false : true;
    }

    private final void N5() {
        C5().Np1(new InterfaceC352140DrI() { // from class: X.12SU
            @Override // X.InterfaceC352140DrI
            public final void LIZ() {
            }

            @Override // X.InterfaceC352140DrI
            public final void LIZIZ() {
            }
        });
        C5().Nu2(x5());
    }

    private final boolean Zo() {
        AudioRecorderParam audioRecorderParam;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" oldRecordParam == ");
        sbLIZ.append(this.LLJLL == null);
        sbLIZ.append(" , needOriginalSound = ");
        AudioRecorderParam audioRecorderParam2 = this.LLJJLIIIJLLLLLLLZ;
        sbLIZ.append(audioRecorderParam2 != null ? Boolean.valueOf(audioRecorderParam2.getNeedOriginalSound()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        AudioRecorderParam audioRecorderParam3 = this.LLJLL;
        if (audioRecorderParam3 == null || (audioRecorderParam = this.LLJJLIIIJLLLLLLLZ) == null) {
            return false;
        }
        return audioRecorderParam.hasChange(audioRecorderParam3, C390110FRh.LIZ(n5(), LJJJLIIL()));
    }

    public final void J6() {
        x5().LJII(null, null);
    }

    public final boolean K4() {
        Integer numLJI = F4().x11().LJI();
        Integer numValueOf = numLJI != null ? Integer.valueOf(numLJI.intValue()) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            C19546111db c19546111db = C19546111db.LIZ;
            c19546111db.getClass();
            int i = iIntValue >> 10;
            c19546111db.getClass();
            int i2 = (iIntValue >> 7) & 7;
            if (i != 0) {
                return (i2 == 1 || i2 == 2) ? false : true;
            }
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return false;
            }
        }
        return true;
    }

    public final void K6() {
        E5().Lf("");
    }

    @Override // X.InterfaceC19669211xS, X.C12PY
    public void LIZ() {
        show();
        N5();
        M5();
        E5().LQ1(this.LLLI);
        i3(new AwS608S0100000_29(this, 170));
        this.LLJLLL = true;
        this.LLJJIJI.LIZLLL(getPanelName(), this.LLLFF);
        E5().pause("");
        i3(new AwS608S0100000_29(this, 171));
    }

    @Override // X.InterfaceC19669211xS, X.C12PY
    public void LIZLLL() {
        hide();
        this.LLJLLL = false;
        this.LLJJIJI.LJ(this.LLLFF);
        E5().i81(this.LLLI);
        this.LLJZIJLIL = "";
    }

    @Override // X.InterfaceC19669211xS
    public boolean LJJIZ() {
        return Zo();
    }

    public final void S5() {
        E5().pause("");
    }

    public final void d6() {
        C0EZF c0ezfX5 = x5();
        C19759412Sq c19759412Sq = this.LLLFFI;
        if (c19759412Sq == null) {
            c19759412Sq = null;
        }
        C19759612Ss c19759612Ss = c19759412Sq.LLJJLIIIJLLLLLLLZ;
        c0ezfX5.LJII = c19759612Ss != null ? c19759612Ss : null;
    }

    public final boolean isRecording() {
        return C5().isRecording();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0EZF c0ezfX5 = x5();
        c0ezfX5.LJFF.LIZ(this, new AObjectS247S0100000_29(this, 48));
        C0EZF c0ezfX52 = x5();
        c0ezfX52.LIZLLL.LIZ(this, new AObjectS240S0100000_5(this, 9));
        this.LLJJIJI.LIZ(new C12PR() { // from class: X.12SH
            @Override // X.C12PR
            public final void LIZ(String str) {
            }

            @Override // X.C12PR
            public final void LIZJ() {
            }

            @Override // X.C12PR
            public final void LIZIZ(String str) {
                if (Intrinsics.LJFF(str, "ae_record")) {
                    this.LIZ.U5(0.0f, false);
                    C12SD c12sd = this.LIZ;
                    c12sd.i3(new AwS608S0100000_29(c12sd, 172));
                } else {
                    if (!Intrinsics.LJFF(str, "ae_voiceChange")) {
                        return;
                    }
                    this.LIZ.py2();
                }
            }
        });
        F4().OL1().LIZIZ(new InterfaceC19750712Ph() { // from class: X.12Rl
            @Override // X.InterfaceC19750712Ph
            public final void LIZ(C19750412Pe c19750412Pe) {
                if (c19750412Pe.LIZ) {
                    C12SD c12sd = this.LIZ;
                    c12sd.Xc(new AwS430S0200000_29(c12sd, c19750412Pe, 25));
                } else if (this.LIZ.LJJIZ()) {
                    c19750412Pe.LIZ();
                    ((ArrayList) c19750412Pe.LIZLLL).add(new AwS430S0200000_29(this.LIZ, c19750412Pe, 26));
                } else {
                    this.LIZ.F4().OL1().getClass();
                    C19750512Pf.LIZ(c19750412Pe);
                }
            }
        });
        F4().m31().LIZ(this, new AObjectS240S0100000_5(this, 10));
        F4().rd2().LIZ(this, new AObjectS247S0100000_29(this, 49));
    }

    public final void pausePlay() {
        E5().pause("");
    }

    public final void py2() {
        boolean zLIZ = C390110FRh.LIZ(n5(), LJJJLIIL());
        i3(new AwS41S0010000_29(zLIZ, 19));
        C12SF c12sfC5 = C5();
        AudioRecorderParam audioRecorderParamXq = C5().xq();
        audioRecorderParamXq.setNeedOriginalSound(zLIZ);
        c12sfC5.K20(audioRecorderParamXq);
        AudioRecorderParam audioRecorderParam = this.LLJJLIIIJLLLLLLLZ;
        if (audioRecorderParam != null) {
            audioRecorderParam.setNeedOriginalSound(zLIZ);
        }
    }

    @Override // ge.i
    public Function0<C19759412Sq> E3() {
        return this.LLLFZ;
    }

    @Override // X.AbstractC19754512Qt, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    private final void Wt1(Function0<Unit> function0) {
        E5().pause("");
        C5().tQ1(wt0(), null, AFwS218S0000000_29.get$arr$(163), AFwS273S0000000_29.get$arr$(123), new AwS464S0200000_29(this, (C12SD) function0, (Function0<Unit>) 3));
    }

    public final void H4(Cert cert) {
        C5().gb2(AFwS218S0000000_29.get$arr$(161), AFwS273S0000000_29.get$arr$(121), cert);
        D5().K4();
    }

    @Override // X.InterfaceC19669211xS
    public void LLIIL(final Function0<Unit> function0) {
        AudioRecorderParam audioRecorderParam = this.LLJLL;
        AudioRecorderParam audioRecorderParam2 = this.LLJJLIIIJLLLLLLLZ;
        if (audioRecorderParam != null && audioRecorderParam2 != null) {
            Xc(new AwS430S0200000_29(this, (C12SD) function0, (Function0<Unit>) 24));
            return;
        }
        C5().Mo(new InterfaceC352140DrI() { // from class: X.12SR
            @Override // X.InterfaceC352140DrI
            public final void LIZ() {
            }

            @Override // X.InterfaceC352140DrI
            public final void LIZIZ() {
                function0.invoke();
            }
        });
        this.LLJLL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    @Override // X.InterfaceC19669211xS
    public void LLJJJJJIL(final Function0<Unit> function0) {
        u6(wt0(), null, AFwS218S0000000_29.get$arr$(162), AFwS273S0000000_29.get$arr$(122));
        this.LLJLL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        C5().Di(new InterfaceC352140DrI() { // from class: X.12SQ
            @Override // X.InterfaceC352140DrI
            public final void LIZ() {
            }

            @Override // X.InterfaceC352140DrI
            public final void LIZIZ() {
                function0.invoke();
            }
        });
    }

    public final void N6(int i) {
        i3(new AwS41S0001000_29(i, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[PHI: r1
      0x0035: PHI (r1v1 long) = (r1v0 long), (r1v2 long) binds: [B:11:0x002c, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P6(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.isRecording()
            if (r0 == 0) goto L47
            X.0EZF r0 = r6.x5()
            X.12Rf r2 = r0.LJII
            r1 = -1
            if (r2 == 0) goto L45
            com.ss.android.ugc.aweme.audiorecord.Point r0 = r0.LIZIZ
            int r0 = r2.LIZ(r7, r0)
        L15:
            r2 = 0
            if (r0 != r1) goto L39
            X.0EZF r1 = r6.x5()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.LJII(r2, r0)
        L23:
            X.0EZF r5 = r6.x5()
            long r3 = (long) r7
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
            int r0 = r5.LIZJ
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L36
        L35:
            r3 = r1
        L36:
            r5.LJ = r3
            return
        L39:
            X.0EZF r1 = r6.x5()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LJII(r2, r0)
            goto L23
        L45:
            r0 = -1
            goto L15
        L47:
            r6.J6()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12SD.P6(int):void");
    }

    public final void R5(boolean z) {
        InterfaceC1418580n1E interfaceC1418580n1EN5 = n5();
        if (interfaceC1418580n1EN5 != null) {
            interfaceC1418580n1EN5.Hr1(z, false, true);
        }
        i3(new AwS41S0010000_29(z, 20));
        C12SF c12sfC5 = C5();
        AudioRecorderParam audioRecorderParamXq = C5().xq();
        audioRecorderParamXq.setNeedOriginalSound(z);
        c12sfC5.K20(audioRecorderParamXq);
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

    public final void S6(EnumC1087350eOz enumC1087350eOz) {
        this.LLJJL = enumC1087350eOz;
    }

    @Override // X.InterfaceC19669211xS
    public void Xc(final Function0<Unit> function0) {
        C5().yt2();
        AudioRecorderParam audioRecorderParam = this.LLJLL;
        AudioRecorderParam audioRecorderParam2 = this.LLJJLIIIJLLLLLLLZ;
        if (audioRecorderParam != null && audioRecorderParam2 != null) {
            C5().TI0(audioRecorderParam, audioRecorderParam2, new InterfaceC352140DrI() { // from class: X.12SJ
                @Override // X.InterfaceC352140DrI
                public final void LIZ() {
                    C2487409ou.LIZJ(new ARunnableS129S0100000_29(this.LIZ, 70));
                }

                @Override // X.InterfaceC352140DrI
                public final void LIZIZ() {
                    C2487409ou.LIZJ(new ARunnableS98S0200000_29(this.LIZ, function0, 27));
                }
            });
        } else {
            function0.invoke();
        }
    }

    public final void L6(Cert cert, String str) {
        C5().rr1(cert, AFwS214S0000000_25.get$arr$(136));
        if (str.length() > 0) {
            C5().uT(str);
        }
    }

    public final void U5(float f, boolean z) {
        if (z) {
            E5().xT(f, "");
        } else {
            E5().pu0(f, "");
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.12SG] */
    public C12SD(C19A3 c19a3, C1DRG c1drg, C12PU c12pu) {
        super(c19a3, c1drg, c12pu);
        this.LLJJIII = c1drg;
        this.LLJJIJI = c12pu;
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19668811xO.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461660o8i.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), C12SF.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), C19753112Qf.class, null);
        this.LLJJL = EnumC1087350eOz.IDLE;
        this.LLJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 238));
        this.LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 233));
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJZIJLIL = "";
        this.LLL = new ArrayList();
        this.LLLFF = new AwS573S0100000_29(this, 239);
        this.LLLFZ = new AwS573S0100000_29(this, 235);
        this.LLLI = new InterfaceC19765012Uu() { // from class: X.12SG
            @Override // X.InterfaceC19765012Uu
            public final void LJJZZI() {
            }

            @Override // X.InterfaceC19765012Uu
            public final void LJLIIIL() {
            }

            @Override // X.InterfaceC19765012Uu
            public final void onPlayEnd() {
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r1
              0x0015: PHI (r1v1 long) = (r1v0 long), (r1v2 long) binds: [B:3:0x000c, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC19765012Uu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C19759112Sn r7) {
                /*
                    r6 = this;
                    X.12SD r0 = r6.LIZ
                    X.0EZF r5 = r0.x5()
                    long r3 = r7.LIZ
                    r1 = 0
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 < 0) goto L15
                    int r0 = r5.LIZJ
                    long r1 = (long) r0
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L16
                L15:
                    r3 = r1
                L16:
                    r5.LJ = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C12SG.LIZ(X.12Sn):void");
            }

            @Override // X.InterfaceC19765012Uu
            public final boolean LIZIZ(C19758912Sl c19758912Sl) {
                if (Intrinsics.LJFF(c19758912Sl.LIZJ, "click_play_btn") && Intrinsics.LJFF(c19758912Sl.LIZLLL, "play")) {
                    if (!this.LIZ.Ug() && !this.LIZ.isRecording() && !this.LIZ.O4() && this.LIZ.K4()) {
                        return false;
                    }
                    return true;
                }
                if (Intrinsics.LJFF(c19758912Sl.LIZJ, "click_play_btn") && Intrinsics.LJFF(c19758912Sl.LIZLLL, "pause")) {
                    if (!this.LIZ.Ug() && !this.LIZ.isRecording()) {
                        return false;
                    }
                    return true;
                }
                if (Intrinsics.LJFF(c19758912Sl.LIZJ, "play_on_resume") && Intrinsics.LJFF(c19758912Sl.LIZLLL, "play")) {
                    boolean zLJFF = Intrinsics.LJFF(this.LIZ.LLJZIJLIL, "on_pause");
                    C12SD c12sd = this.LIZ;
                    c12sd.LLJZIJLIL = "";
                    if (!zLJFF && c12sd.K4()) {
                        return false;
                    }
                    return true;
                }
                if (!this.LIZ.LLJLLL || !Intrinsics.LJFF(c19758912Sl.LIZLLL, "seek") || (!Intrinsics.LJFF(c19758912Sl.LIZJ, "voice_change_progress") && !Intrinsics.LJFF(c19758912Sl.LIZJ, "start_stream_voice_change"))) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC19765012Uu
            public final void LIZJ(C19759212So c19759212So) {
                this.LIZ.i3(new AwS608S0100000_29(c19759212So, 173));
                this.LIZ.P6((int) c19759212So.LIZ);
            }
        };
    }

    private final void u6(boolean z, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        C5().Rt(z, cert, function0, function1);
    }

    public final void m6(boolean z, int i, Cert cert, String str) {
        this.LLJZIJLIL = str;
        C5().RD2(z, i, cert, new AwS573S0100000_29(this, 240), AFwS266S0000000_25.get$arr$(130));
        if (str.length() > 0) {
            C5().Vu0(str);
        }
    }
}
