package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAICommentEntranceCheckBugfixSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987290bnb extends C1143950fsH {
    public final int $t;
    public Object l0;

    @Override // X.C1143950fsH
    public final void LIZIZ(Throwable th) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, th);
                break;
            case 1:
                LIZIZ$1(this, th);
                break;
            case 2:
                LIZIZ$2(this, th);
                break;
            case 3:
                LIZIZ$3(this, th);
                break;
            case 4:
                LIZIZ$4(this, th);
                break;
            default:
                super.LIZIZ(th);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LIZJ(int i) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i);
                break;
            case 1:
                LIZJ$1(this, i);
                break;
            default:
                super.LIZJ(i);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LIZLLL() {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this);
                break;
            case 1:
                LIZLLL$1(this);
                break;
            case 2:
            case 3:
            default:
                super.LIZLLL();
                break;
            case 4:
                LIZLLL$2(this);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LJ(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, animatable);
                break;
            case 1:
                LJ$1(this, animatable);
                break;
            case 2:
                C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Small->Big start");
                break;
            case 3:
                C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Big->Small start");
                break;
            case 4:
                C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Entrance transition onStart");
                break;
            default:
                super.LJ(animatable);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LJFF(Animatable animatable) {
        switch (this.$t) {
            case 2:
                LJFF$0(this, animatable);
                break;
            case 3:
                LJFF$1(this, animatable);
                break;
            case 4:
                LJFF$2(this, animatable);
                break;
            case 5:
                LJFF$3(this, animatable);
                break;
            case 6:
                LJFF$4(this, animatable);
                break;
            default:
                super.LJFF(animatable);
                break;
        }
    }

    public static final void LIZLLL$0(C987290bnb c987290bnb) {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Small loop resource ready");
        ((C986580bmS) c987290bnb.l0).LLJJIII = true;
        if (LiveMatchAICommentEntranceCheckBugfixSetting.INSTANCE.isEnabled()) {
            C986580bmS c986580bmS = (C986580bmS) c987290bnb.l0;
            if (!c986580bmS.LLJL && !c986580bmS.LLJJLIIIJLLLLLLLZ && !c986580bmS.LJ()) {
                C986580bmS c986580bmS2 = (C986580bmS) c987290bnb.l0;
                if (!c986580bmS2.LLJZ) {
                    c986580bmS2.LJIIIIZZ();
                    return;
                }
                return;
            }
            return;
        }
        if (((C986580bmS) c987290bnb.l0).LJ()) {
            return;
        }
        C986580bmS c986580bmS3 = (C986580bmS) c987290bnb.l0;
        if (c986580bmS3.LLJZ) {
            return;
        }
        c986580bmS3.LJIIIIZZ();
    }

    public static final void LIZLLL$1(C987290bnb c987290bnb) {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Big loop resource ready");
        ((C986580bmS) c987290bnb.l0).LLJJIJI = true;
        if (LiveMatchAICommentEntranceCheckBugfixSetting.INSTANCE.isEnabled()) {
            C986580bmS c986580bmS = (C986580bmS) c987290bnb.l0;
            if (!c986580bmS.LLJL && !c986580bmS.LLJJLIIIJLLLLLLLZ && !c986580bmS.LJ()) {
                C986580bmS c986580bmS2 = (C986580bmS) c987290bnb.l0;
                if (c986580bmS2.LLJZ) {
                    c986580bmS2.LJI();
                    return;
                }
                return;
            }
            return;
        }
        if (((C986580bmS) c987290bnb.l0).LJ()) {
            return;
        }
        C986580bmS c986580bmS3 = (C986580bmS) c987290bnb.l0;
        if (!c986580bmS3.LLJZ) {
            return;
        }
        c986580bmS3.LJI();
    }

    public static final void LIZLLL$2(C987290bnb c987290bnb) {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Entrance transition resource ready");
        C986580bmS c986580bmS = (C986580bmS) c987290bnb.l0;
        c986580bmS.LLJJIJIIJIL = true;
        if (c986580bmS.getVisibility() == 0) {
            C986580bmS c986580bmS2 = (C986580bmS) c987290bnb.l0;
            if (c986580bmS2.LLJJLIIIJLLLLLLLZ) {
                c986580bmS2.LJFF();
            }
        }
    }

    public C987290bnb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C987290bnb c987290bnb, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Small loop failed to load due to ");
        if (th == null || (message = th.getMessage()) == null) {
            message = "unknown";
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ$1(C987290bnb c987290bnb, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Big loop failed to load due to ");
        if (th == null || (message = th.getMessage()) == null) {
            message = "unknown";
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ$2(C987290bnb c987290bnb, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Small->Big failed to load due to ");
        if (th == null || (message = th.getMessage()) == null) {
            message = "unknown";
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ$3(C987290bnb c987290bnb, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Big->Small failed to load due to ");
        if (th == null || (message = th.getMessage()) == null) {
            message = "unknown";
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ$4(C987290bnb c987290bnb, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entrance transition failed: ");
        if (th == null || (message = th.getMessage()) == null) {
            message = "unknown";
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        ((C986580bmS) c987290bnb.l0).LLJLIL = true;
    }

    public static final void LIZJ$0(C987290bnb c987290bnb, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Small loop onRepeat count=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        ((C986580bmS) c987290bnb.l0).LIZLLL();
    }

    public static final void LIZJ$1(C987290bnb c987290bnb, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Big loop onRepeat count=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        ((C986580bmS) c987290bnb.l0).LIZLLL();
    }

    public static final void LJ$0(C987290bnb c987290bnb, Animatable animatable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Small loop onStart ");
        sbLIZ.append(animatable);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJ$1(C987290bnb c987290bnb, Animatable animatable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Big loop onStart ");
        sbLIZ.append(animatable);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJFF$0(C987290bnb c987290bnb, Animatable animatable) {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Small->Big stop -> switch to Big loop");
        ((C986580bmS) c987290bnb.l0).LJI();
    }

    public static final void LJFF$1(C987290bnb c987290bnb, Animatable animatable) {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Big->Small stop -> switch to Small loop");
        ((C986580bmS) c987290bnb.l0).LJIIIIZZ();
    }

    public static final void LJFF$2(C987290bnb c987290bnb, Animatable animatable) {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Entrance transition onStop");
        C986580bmS c986580bmS = (C986580bmS) c987290bnb.l0;
        c986580bmS.LLJLIL = true;
        if (c986580bmS.LLJLILLLLZIIL) {
            c986580bmS.LIZJ();
        }
    }

    public static final void LJFF$3(C987290bnb c987290bnb, Animatable animatable) {
        ((C940120aZW) c987290bnb.l0).LJIIL();
    }

    public static final void LJFF$4(C987290bnb c987290bnb, Animatable animatable) {
        C940110aZV c940110aZV = ((C939710aYr) c987290bnb.l0).LLLIL;
        if (c940110aZV != null && Intrinsics.LJFF(c940110aZV.LIZIZ(), Boolean.TRUE)) {
            ((C939710aYr) c987290bnb.l0).LJJI();
        } else {
            ((C939710aYr) c987290bnb.l0).LJJIZ();
        }
    }
}
