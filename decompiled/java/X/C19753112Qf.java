package X;

import Y.AObjectS247S0100000_29;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS9S0020000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19753112Qf extends AbstractC19754512Qt<InterfaceC19669311xT, C12QW, C12RM, C19753712Ql> implements InterfaceC19669311xT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C1DRG LLJJIII;
    public final C12PU LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final C01GW LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public C12QW LLJJJJLIIL;
    public final Function0<C12QW> LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19753112Qf.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19753112Qf.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19753112Qf.class, "voicePlayControl", "getVoicePlayControl()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/player/VoicePlayControlApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19753112Qf.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19753112Qf.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJL = 8;
    }

    @Override // X.InterfaceC19669311xT
    public void LLILLJJLI() {
    }

    @Override // X.InterfaceC19669311xT
    public String getPanelName() {
        return "ae_voiceChange";
    }

    private final void C5() {
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        int iLLLLZLLLI = c12qw.LLLLZLLLI();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LIZ(iLLLLZLLLI != 1 ? 0 : 1, "is_voice_effect");
        C20684815ws.LJIILLIIL("click_add_record", c0lab.LIZ);
    }

    private final void D5() {
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        int iLLLLZLLLI = c12qw.LLLLZLLLI();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LIZ(iLLLLZLLLI != 1 ? 0 : 1, "is_voice_effect");
        C20684815ws.LJIILLIIL("enter_record_panel", c0lab.LIZ);
    }

    private final boolean O4() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        Map<Integer, Integer> map = C12QV.LIZ;
        NLEModel nLEModelLIZ = null;
        if (C12QV.LIZ(LJJJLIIL(), null, false).LIZ) {
            C19546111db c19546111db = C19546111db.LIZ;
            InterfaceC1455860nzM interfaceC1455860nzMD5 = d5();
            if (interfaceC1455860nzMD5 != null && (liveDataG = interfaceC1455860nzMD5.g()) != null && (value = liveDataG.getValue()) != null) {
                nLEModelLIZ = C352130DrH.LIZ(value);
            }
            c19546111db.getClass();
            if (C19546111db.LIZ(nLEModelLIZ)) {
                return true;
            }
        }
        return x5() || C1428520nHG.LJJJJLI(LJJJLIIL());
    }

    private final boolean Pb2() {
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        return c12qw.LLLLLLZZ().LIZIZ() != -1;
    }

    private final NLEEditor k5() {
        return (NLEEditor) this.LLJJJIL.getValue();
    }

    private final C12SF n5() {
        return (C12SF) this.LLJJJJJIL.getValue(this, LLJJLIIIJLLLLLLLZ[4]);
    }

    private final InterfaceC19753012Qe t5() {
        return (InterfaceC19753012Qe) this.LLJJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[3]);
    }

    private final InterfaceC19668811xO v5() {
        return (InterfaceC19668811xO) this.LLJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[2]);
    }

    public final void K4() {
        Effect effect;
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        C1664150tPJ c1664150tPJ = c12qw.LLLLII;
        if (c1664150tPJ == null || (effect = c1664150tPJ.LIZ) == null) {
            return;
        }
        c12qw.LLZLLLL();
        C19546111db.LIZ.getClass();
        if (C19546111db.LJIIJJI(effect)) {
            c12qw.LLLZ().bl2();
        } else {
            c12qw.LLLLLLJ();
        }
    }

    @Override // X.InterfaceC19669311xT
    public boolean LJJIZ() {
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        return c12qw.LLLLLLZZ().LJJIZ();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    public final InterfaceC1455860nzM d5() {
        return (InterfaceC1455860nzM) this.LLJJIJIIJIL.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12RM> o2() {
        return AFwS218S0000000_29.get$arr$(168);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19753712Ql> w2() {
        return new AwS573S0100000_29(this, 252);
    }

    private final void H4() {
        v5().GM(0L, "");
        v5().LQ1(new InterfaceC19765012Uu() { // from class: X.12Qz
            @Override // X.InterfaceC19765012Uu
            public final boolean LIZIZ(C19758912Sl c19758912Sl) {
                return false;
            }

            @Override // X.InterfaceC19765012Uu
            public final void LJJZZI() {
            }

            @Override // X.InterfaceC19765012Uu
            public final void LJLIIIL() {
            }

            @Override // X.InterfaceC19765012Uu
            public final void onPlayEnd() {
            }

            @Override // X.InterfaceC19765012Uu
            public final void LIZ(C19759112Sn c19759112Sn) {
                this.LIZ.i3(new AwS608S0100000_29(c19759112Sn, 186));
            }

            @Override // X.InterfaceC19765012Uu
            public final void LIZJ(C19759212So c19759212So) {
                this.LIZ.i3(new AwS608S0100000_29(c19759212So, 187));
            }
        });
    }

    private final boolean x5() {
        NLETrack nLETrackPrevious;
        VecNLETrackSlotSPtr slots;
        NLEModel model = k5().getModel();
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

    public final void H5() {
        F4().m31().LJIIJ(Boolean.TRUE);
        v5().HK0(true);
        v5().kI0("");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // X.InterfaceC19669311xT, X.C12PY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ() {
        /*
            r4 = this;
            r4.show()
            X.12SF r0 = r4.n5()
            r0.Io2()
            X.0nzM r0 = r4.d5()
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r3 = r0.getValue()
            X.0ntP r3 = (X.InterfaceC1452170ntP) r3
            r2 = 0
            if (r3 == 0) goto L53
            X.12QW r1 = r4.LLJJJJLIIL
            if (r1 != 0) goto L20
            r1 = r2
        L20:
            X.12Fb r0 = r1.LLLILZ
            if (r0 == 0) goto L3c
            int r1 = r0.getMax()
        L28:
            int r0 = r3.getDuration()
            if (r1 != r0) goto L53
        L2e:
            kotlin.jvm.internal.AwS608S0100000_29 r1 = new kotlin.jvm.internal.AwS608S0100000_29
            r0 = 189(0xbd, float:2.65E-43)
            r1.<init>(r4, r0)
            r4.i3(r1)
            r4.H4()
            return
        L3c:
            X.0nzM r0 = r1.LLLLLZL()
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            if (r0 == 0) goto L51
            int r1 = r0.getDuration()
            goto L28
        L51:
            r1 = 0
            goto L28
        L53:
            X.12Qi r0 = r4.F4()
            X.0Lyd r1 = r0.m31()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LJIIJ(r0)
            X.12QW r1 = r4.LLJJJJLIIL
            if (r1 != 0) goto L65
            r1 = r2
        L65:
            X.0nzM r0 = r4.d5()
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            if (r0 == 0) goto L7d
            int r0 = r0.getDuration()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L7d:
            X.12Fb r1 = r1.LLLILZ
            if (r1 == 0) goto L2e
            if (r2 == 0) goto L2e
            int r0 = r2.intValue()
            r1.setMax(r0)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19753112Qf.LIZ():void");
    }

    public final void N5() {
        v5().pause("");
    }

    public final void S5() {
        i3(new AwS9S0020000_29(O4(), x5() && !C1428520nHG.LJJJJLI(LJJJLIIL()), 2));
    }

    public final void Z4() {
        C560530Lyd<Effect> c560530LydRd2 = F4().rd2();
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        C1664150tPJ c1664150tPJLJIIJJI = c12qw.LLLLLLZZ().LJIIJJI();
        c560530LydRd2.LJIIJ(c1664150tPJLJIIJJI != null ? c1664150tPJLJIIJJI.LIZ : null);
        this.LLJJIJI.LIZJ("ae_record");
        D5();
    }

    public final boolean isPlaying() {
        return v5().isPlaying();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJJIJI.LIZ(new C12PR() { // from class: X.12Qs
            @Override // X.C12PR
            public final void LIZJ() {
            }

            @Override // X.C12PR
            public final void LIZ(String str) {
                if (Intrinsics.LJFF(str, "ae_record")) {
                    this.LIZ.S5();
                }
            }

            @Override // X.C12PR
            public final void LIZIZ(String str) {
                if (Intrinsics.LJFF(str, "ae_voiceChange")) {
                    this.LIZ.S5();
                }
            }
        });
        F4().OL1().LIZIZ(new InterfaceC19750712Ph() { // from class: X.12Qh
            @Override // X.InterfaceC19750712Ph
            public final void LIZ(C19750412Pe c19750412Pe) {
                if (c19750412Pe.LIZ) {
                    this.LIZ.F4().OL1().getClass();
                    C19750512Pf.LIZ(c19750412Pe);
                } else if (this.LIZ.LJJIZ()) {
                    c19750412Pe.LIZ();
                    ((ArrayList) c19750412Pe.LIZLLL).add(new AwS430S0200000_29(this.LIZ, c19750412Pe, 29));
                } else {
                    this.LIZ.F4().OL1().getClass();
                    C19750512Pf.LIZ(c19750412Pe);
                }
            }
        });
        F4().ZD0().LIZ(this, new AObjectS247S0100000_29(this, 51));
        t5().eU1(new AwS608S0100000_29(this, 188));
        t5().YB(new AwS643S0100000_29(this, 35));
    }

    @Override // ge.i
    public Function0<C12QW> E3() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC19669311xT, X.C12PY
    public void LIZLLL() {
        hide();
    }

    @Override // X.AbstractC19754512Qt, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
    }

    public final void E5(boolean z) {
        if (z) {
            v5().Lf("");
        } else {
            v5().pause("");
        }
    }

    @Override // X.InterfaceC19669311xT
    public void LLIIL(Function0<Unit> function0) {
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        if (c12qw.LLJJL != null) {
            c12qw.LLLZZ();
        }
        function0.invoke();
    }

    @Override // X.InterfaceC19669311xT
    public void LLJJJJJIL(Function0<Unit> function0) {
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        c12qw.LLLLLLIL();
        InterfaceC1452170ntP value = d5().g().getValue();
        if (value == null) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ != null) {
            c348100DkmLIZIZ.LIZ.resetHead();
            function0.invoke();
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void Mn2(int i) {
        F4().x11().LJIIJ(Integer.valueOf(i));
    }

    public final void P4(Context context) {
        C5();
        C12QW c12qw = this.LLJJJJLIIL;
        if (c12qw == null) {
            c12qw = null;
        }
        if (c12qw.LLLLZLLLI() == 3) {
            C0E3C c0e3c = C0E3C.LIZ;
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 250);
            c0e3c.getClass();
            C0E3C.LIZ(context, videoPublishEditModelLJJJLIIL, awS573S0100000_29);
            return;
        }
        Z4();
    }

    public final void T4(Context context) {
        this.LLJJIJI.LIZJ("ae_volume");
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LJ("enter_method", "click_audio_editing_panel");
        C20684815ws.LJIILLIIL("edit_volume", c0lab.LIZ);
    }

    public final void M5(int i, boolean z) {
        if (z) {
            v5().GM(((long) LSPassThroughRecordSizeConfig.DEFAULT) * ((long) i), "");
            return;
        }
        v5().bd0(((long) i) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), "");
    }

    public final void R5(int i, String str) {
        v5().GM(i, str);
    }

    public C19753112Qf(C19A3 c19a3, C1DRG c1drg, C12PU c12pu) {
        super(c19a3, c1drg, c12pu);
        this.LLJJIII = c1drg;
        this.LLJJIJI = c12pu;
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19668811xO.class, null);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 251));
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753012Qe.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), C12SF.class, null);
        this.LLJJL = new AwS573S0100000_29(this, 253);
    }
}
