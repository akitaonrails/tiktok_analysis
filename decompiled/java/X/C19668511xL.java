package X;

import Y.AObjectS247S0100000_29;
import android.graphics.Rect;
import ge.i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11xL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19668511xL extends i<InterfaceC19669111xR, C19667811xE, C19668111xH, C19668311xJ> implements InterfaceC19669111xR, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final C12PU LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19668511xL.class, "volumeComponentAPI", "getVolumeComponentAPI()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/volume/VoiceVolumeApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19668511xL.class, "voicePlayControl", "getVoicePlayControl()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/player/VoicePlayControlApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19668511xL.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19668511xL.class, "voiceEventComponent", "getVoiceEventComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/VoiceEventApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19668511xL.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJJIL = 8;
    }

    private final InterfaceC19753012Qe K4() {
        return (InterfaceC19753012Qe) this.LLJJIII.getValue(this, LLJJJ[2]);
    }

    private final InterfaceC19753412Qi O4() {
        return (InterfaceC19753412Qi) this.LLJJIJI.getValue(this, LLJJJ[3]);
    }

    private final InterfaceC19668911xP T4() {
        return (InterfaceC19668911xP) this.LLJJ.getValue(this, LLJJJ[0]);
    }

    public final InterfaceC1455860nzM H4() {
        return (InterfaceC1455860nzM) this.LLJJIJIL.getValue(this, LLJJJ[4]);
    }

    public final InterfaceC19668811xO P4() {
        return (InterfaceC19668811xO) this.LLJJI.getValue(this, LLJJJ[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19668111xH> o2() {
        return AFwS218S0000000_29.get$arr$(160);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19668311xJ> w2() {
        return new AwS573S0100000_29(this, 232);
    }

    public final boolean F4() {
        Integer numLJI = O4().x11().LJI();
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

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJILLL.LIZ(new C12PR() { // from class: X.11xM
            @Override // X.C12PR
            public final void LIZJ() {
                Rect rectLLJLLIL;
                InterfaceC1452170ntP value = this.LIZ.H4().g().getValue();
                if (value == null || (rectLLJLLIL = value.LLJLLIL()) == null) {
                    return;
                }
                this.LIZ.i3(new AwS608S0100000_29(new Pair(Integer.valueOf(rectLLJLLIL.right), Integer.valueOf(rectLLJLLIL.bottom)), (Pair<Integer, Integer>) 168));
            }

            @Override // X.C12PR
            public final void LIZ(String str) {
                if (Intrinsics.LJFF(str, "ae_record")) {
                    this.LIZ.P4().HK0(true);
                } else {
                    if (!Intrinsics.LJFF(str, "ae_volume")) {
                        return;
                    }
                    this.LIZ.P4().kI0("");
                }
            }

            @Override // X.C12PR
            public final void LIZIZ(String str) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1820644148) {
                    if (iHashCode != -1696618603) {
                        if (iHashCode == 1780549607 && str.equals("ae_voiceChange")) {
                            this.LIZ.P4().HK0(true);
                            this.LIZ.P4().GM(0L, "");
                            this.LIZ.P4().pause("");
                            InterfaceC19668811xO interfaceC19668811xOP4 = this.LIZ.P4();
                            final C19668511xL c19668511xL = this.LIZ;
                            interfaceC19668811xOP4.LQ1(new InterfaceC19765012Uu() { // from class: X.11xN
                                @Override // X.InterfaceC19765012Uu
                                public final void LIZ(C19759112Sn c19759112Sn) {
                                }

                                @Override // X.InterfaceC19765012Uu
                                public final void LIZJ(C19759212So c19759212So) {
                                }

                                @Override // X.InterfaceC19765012Uu
                                public final void onPlayEnd() {
                                }

                                @Override // X.InterfaceC19765012Uu
                                public final void LJJZZI() {
                                    c19668511xL.i3(AFwS273S0000000_29.get$arr$(119));
                                }

                                @Override // X.InterfaceC19765012Uu
                                public final void LJLIIIL() {
                                    c19668511xL.i3(AFwS273S0000000_29.get$arr$(120));
                                }

                                @Override // X.InterfaceC19765012Uu
                                public final boolean LIZIZ(C19758912Sl c19758912Sl) {
                                    if (!c19668511xL.F4() && !Intrinsics.LJFF(c19758912Sl.LIZLLL, "pause") && !Intrinsics.LJFF(c19758912Sl.LIZLLL, "seek")) {
                                        return true;
                                    }
                                    return false;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!str.equals("ae_volume")) {
                        return;
                    }
                    this.LIZ.P4().GM(0L, "");
                    this.LIZ.P4().pause("");
                    return;
                }
                if (!str.equals("ae_record")) {
                    return;
                }
                this.LIZ.P4().HK0(false);
                this.LIZ.P4().GM(0L, "");
                this.LIZ.P4().pause("");
            }
        });
        O4().x11().LIZ(this, new AObjectS247S0100000_29(this, 47));
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (P4().isPlaying()) {
            this.LLJJIJIIJIL = true;
            P4().pause("");
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        boolean zMP1 = T4().mP1();
        if (this.LLJJIJIIJIL && !zMP1) {
            P4().Lf("play_on_resume");
        }
        this.LLJJIJIIJIL = false;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    public final boolean Z4(boolean z) {
        K4().D8(new AtomicBoolean(!z));
        if (z) {
            if (P4().getDuration() >= P4().ip2() && P4().getDuration() <= P4().ip2() + 50) {
                return P4().kI0("click_play_btn");
            }
            return P4().Lf("click_play_btn");
        }
        return P4().pause("click_play_btn");
    }

    public C19668511xL(C19A3 c19a3, C1DRG c1drg, C12PU c12pu) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c12pu;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19668911xP.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19668811xO.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753012Qe.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753412Qi.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    }
}
