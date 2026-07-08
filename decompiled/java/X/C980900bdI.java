package X;

import Y.ACListenerS81S0300000_15;
import android.view.View;
import avg.f;
import com.bytedance.android.live.liveinteract.match.business.event.BattleAICommentaryNoticeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleAICommentaryPlayChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostWindowViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;
import mf.a;

/* JADX INFO: renamed from: X.0bdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C980900bdI extends AbstractC977390bXd {
    public final MatchBaseWidget LLILZ;
    public final DataChannel LLILZIL;
    public C986580bmS LLILZLL;
    public C980910bdJ LLIZ = new C980910bdJ(false, false, false);

    @Override // X.AbstractC977390bXd, X.InterfaceC977420bXg
    public final void reset() {
        this.LL = false;
        this.LLIZ = new C980910bdJ(false, false, false);
        C986580bmS c986580bmS = this.LLILZLL;
        if (c986580bmS != null) {
            int visibility = c986580bmS.getVisibility();
            c986580bmS.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c986580bmS);
        }
    }

    public final void LJIIIIZZ() {
        C954460awe c954460aweLLILL;
        String str;
        MultiCoHostWindowManager multiCoHostWindowManager;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ;
        C986580bmS c986580bmS;
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel == null || (c954460aweLLILL = C915980Zwa.LJII().LLILL(C500260Jjc.LIZIZ(dataChannel))) == null || (str = c954460aweLLILL.LJIIJJI) == null || str.length() == 0 || (multiCoHostWindowManager = this.LLILZ.LLILLJJLI) == null || (viewOnClickListenerC986770bmlLJ = multiCoHostWindowManager.LJ(str)) == null || (c986580bmS = (C986580bmS) viewOnClickListenerC986770bmlLJ.findViewById(R.id.vsy)) == null) {
            return;
        }
        if (c986580bmS != this.LLILZLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolveAnchorIndicatorView: binding fresh view instance, window tag=");
            sbLIZ.append(viewOnClickListenerC986770bmlLJ.getTag());
            C20441214yg.LIZIZ("TwoMatchSpeakingIndicatorComponent", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setWebpResources channel=");
            sbLIZ2.append("tiktok_live_interaction_ai_commentary_resource");
            sbLIZ2.append(", smallLoopFile=");
            sbLIZ2.append("not_talking_cycle.webp");
            sbLIZ2.append(", smallToBigTransitionFile=");
            sbLIZ2.append("start_talking_transition.webp");
            sbLIZ2.append(", bigToSmallTransitionFile=");
            sbLIZ2.append("finish_talking_transition.webp");
            sbLIZ2.append(", bigLoopFile=");
            sbLIZ2.append("talking_cycle.webp");
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ2));
            c986580bmS.LLJIJIL = "tiktok_live_interaction_ai_commentary_resource";
            c986580bmS.LLJILJIL = "not_talking_cycle.webp";
            c986580bmS.LLJILJILJ = "start_talking_transition.webp";
            c986580bmS.LLJILLL = "finish_talking_transition.webp";
            c986580bmS.LLJJ = "talking_cycle.webp";
            c986580bmS.LLJJI = "entrance_transition.webp";
            float f = c986580bmS.LLJZ ? c986580bmS.LLJJJ : c986580bmS.LLJJIJIL;
            C786410Ut5.cc(c986580bmS, f);
            C786410Ut5.zc(c986580bmS, f);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Initial scale applied target=");
            sbLIZ3.append(f);
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ3));
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "loadAll, start");
            String str2 = c986580bmS.LLJIJIL;
            if (str2 != null) {
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LIZ = c986580bmS.LL;
                c1143920fsE.LIZIZ = str2;
                String str3 = c986580bmS.LLJILJIL;
                if (str3 != null) {
                    c1143920fsE.LIZJ = str3;
                    c1143920fsE.LJFF = false;
                    c1143920fsE.LJIIJJI = true;
                    c1143920fsE.LJI = Integer.MAX_VALUE;
                    c1143920fsE.LJ = new C987290bnb(c986580bmS, 0);
                    c986580bmS.LLILZLL = c1143920fsE;
                    c1143920fsE.LIZLLL();
                    C1143920fsE c1143920fsE2 = new C1143920fsE();
                    c1143920fsE2.LIZ = c986580bmS.LLILZ;
                    c1143920fsE2.LIZIZ = str2;
                    String str4 = c986580bmS.LLJJ;
                    if (str4 != null) {
                        c1143920fsE2.LIZJ = str4;
                        c1143920fsE2.LJFF = false;
                        c1143920fsE2.LJIIJJI = true;
                        c1143920fsE2.LJI = Integer.MAX_VALUE;
                        c1143920fsE2.LJ = new C987290bnb(c986580bmS, 1);
                        c986580bmS.LLJ = c1143920fsE2;
                        c1143920fsE2.LIZLLL();
                        C1143920fsE c1143920fsE3 = new C1143920fsE();
                        c1143920fsE3.LIZ = c986580bmS.LLILLJJLI;
                        c1143920fsE3.LIZIZ = str2;
                        String str5 = c986580bmS.LLJILJILJ;
                        if (str5 != null) {
                            c1143920fsE3.LIZJ = str5;
                            c1143920fsE3.LJFF = false;
                            c1143920fsE3.LJIIJJI = true;
                            c1143920fsE3.LJI = 1;
                            c1143920fsE3.LJ = new C987290bnb(c986580bmS, 2);
                            c986580bmS.LLIZ = c1143920fsE3;
                            c1143920fsE3.LIZLLL();
                            C1143920fsE c1143920fsE4 = new C1143920fsE();
                            c1143920fsE4.LIZ = c986580bmS.LLILLL;
                            c1143920fsE4.LIZIZ = str2;
                            String str6 = c986580bmS.LLJILLL;
                            if (str6 != null) {
                                c1143920fsE4.LIZJ = str6;
                                c1143920fsE4.LJFF = false;
                                c1143920fsE4.LJIIJJI = true;
                                c1143920fsE4.LJI = 1;
                                c1143920fsE4.LJ = new C987290bnb(c986580bmS, 3);
                                c986580bmS.LLIZLLLIL = c1143920fsE4;
                                c1143920fsE4.LIZLLL();
                                C1143920fsE c1143920fsE5 = new C1143920fsE();
                                c1143920fsE5.LIZ = c986580bmS.LLILZIL;
                                c1143920fsE5.LIZIZ = str2;
                                String str7 = c986580bmS.LLJJI;
                                if (str7 != null) {
                                    c1143920fsE5.LIZJ = str7;
                                    c1143920fsE5.LJFF = false;
                                    c1143920fsE5.LJIIJJI = true;
                                    c1143920fsE5.LJI = 1;
                                    c1143920fsE5.LJ = new C987290bnb(c986580bmS, 4);
                                    c986580bmS.LLJI = c1143920fsE5;
                                    c1143920fsE5.LIZLLL();
                                    C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "loadAll, finish");
                                }
                            }
                        }
                    }
                }
            }
            View.OnClickListener aCListenerS81S0300000_15 = new ACListenerS81S0300000_15(dataChannel, c986580bmS, this, 5);
            if (C1848410yCV.LIZ) {
                aCListenerS81S0300000_15 = new f(aCListenerS81S0300000_15);
            }
            a aVar = new a(aCListenerS81S0300000_15);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c986580bmS);
            }
            c986580bmS.setOnClickListener(aVar);
            this.LLILZLL = c986580bmS;
        }
        C980910bdJ c980910bdJ = this.LLIZ;
        int i = (c980910bdJ.LIZ && c980910bdJ.LIZJ) ? 0 : 8;
        if (c986580bmS.getVisibility() != i) {
            int visibility = c986580bmS.getVisibility();
            c986580bmS.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c986580bmS);
            if (i == 0) {
                C973660bRc.LIZ.LJJJJIZL(this.LLILZIL, false);
            }
        }
        boolean z = c986580bmS.LLJLLIL;
        boolean z2 = c980910bdJ.LIZIZ;
        if (z != z2) {
            c986580bmS.setTalking(z2);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        C986580bmS c986580bmS = this.LLILZLL;
        if (c986580bmS != null) {
            int visibility = c986580bmS.getVisibility();
            c986580bmS.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c986580bmS);
        }
        this.LLIZ = C980910bdJ.LIZ(this.LLIZ, false, false, false, 3);
    }

    @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
    public final void onUnload() {
        super.onUnload();
        C986580bmS c986580bmS = this.LLILZLL;
        if (c986580bmS != null) {
            int visibility = c986580bmS.getVisibility();
            c986580bmS.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c986580bmS);
        }
        this.LLILZLL = null;
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLIZ = new C980910bdJ(false, false, false);
    }

    public C980900bdI(MatchBaseWidget matchBaseWidget) {
        this.LLILZ = matchBaseWidget;
        this.LLILZIL = matchBaseWidget.dataChannel;
    }

    @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        super.LIZLLL(matchBaseWidget);
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.CQ2(BattleAICommentaryPlayChannel.class, this, new AwS594S0100000_15(this, 613));
        }
        DataChannel dataChannel2 = this.LLILZIL;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleAICommentaryNoticeEvent.class, this, new AwS594S0100000_15(this, 615));
        }
        DataChannel dataChannel3 = this.LLILZIL;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(MultiCoHostWindowViewStateChangeEvent.class, this, new AwS594S0100000_15(this, 620));
        }
    }

    @Override // X.AbstractC977390bXd
    public final void LJI(C975960bVK c975960bVK) {
        this.LLIZ = C980910bdJ.LIZ(this.LLIZ, C915980Zwa.LJ().jG(), false, true, 2);
        LJIIIIZZ();
    }
}
