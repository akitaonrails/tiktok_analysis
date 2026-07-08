package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLinkedAnchorNumChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPlaybooksGuidanceSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973580bRU implements InterfaceViewOnClickListenerC1102800enu {
    public final LifecycleOwner LL;
    public InterfaceC1103130eoR LLILLJJLI;
    public LiveIconView LLILLL;
    public C1126540fQC LLILZ;
    public AppCompatImageView LLILZIL;
    public C16F5 LLILZLL;
    public MultiMatchAnchorWidget LLIZ;
    public boolean LLIZLLLIL;
    public C20743416Fc LLJ;
    public LiveIconView LLJI;
    public DataChannel LLJIJIL;
    public C973600bRW LLJILJIL;
    public EnumC973650bRb LLJILJILJ = EnumC973650bRb.UNKNOWN;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public static C918210a0B LIZ() {
        Integer numLIZ;
        C918210a0B c918210a0B = C918210a0B.LIZ;
        if (!LiveMatchPlaybooksGuidanceSetting.INSTANCE.isEnabled() || ((numLIZ = InterfaceC980390bcT.Ta.LIZ()) != null && numLIZ.intValue() >= 1)) {
            return null;
        }
        return c918210a0B;
    }

    public final void LIZJ() {
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            liveIconView.setImageResource(R.drawable.eq1);
        }
        LiveIconView liveIconView2 = this.LLJI;
        if (liveIconView2 != null) {
            liveIconView2.setIcon(R.drawable.eq1);
        }
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.UNKNOWN;
        C20743416Fc c20743416Fc = this.LLJ;
        if (c20743416Fc != null) {
            int i = C969850bLT.LIZIZ[enumC919170a1j.ordinal()];
            c20743416Fc.setText(i != 1 ? i != 2 ? C497740JfY.LJIJI(2131842923) : C497740JfY.LJIJI(2131851818) : C497740JfY.LJIJI(2131851529));
        }
        EnumC973650bRb enumC973650bRb = EnumC973650bRb.NORMAL;
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLILLJJLI;
        if (interfaceC1103130eoR == null || interfaceC1103130eoR.getVisibility() != 0 || enumC973650bRb == this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = enumC973650bRb;
        C973660bRc.LIZ.LJLIIL("pk_icon", true);
    }

    public C973580bRU(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public final void LIZLLL(int i) {
        InterfaceC1103130eoR interfaceC1103130eoR;
        if (i == 0 && ((interfaceC1103130eoR = this.LLILLJJLI) == null || interfaceC1103130eoR.getVisibility() != 0)) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("event_id", "battle_icon_show", jSONObject);
            C0K04.LJ("channel_id", C915980Zwa.LJI().LJIIJ().getChannelId(), jSONObject);
            C944730agx.LJIIJ(null, jSONObject);
            C0K04.LIZLLL(C974480bSw.LIZIZ ? 1 : 0, "is_sdk", jSONObject);
            C0K04.LJFF("match_progress_opt", "1", jSONObject);
            C1CC2.LJIIIIZZ("ttlive_client_anchor_match_icon_monitor", 0, jSONObject);
        }
        InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLJJLI;
        if (interfaceC1103130eoR2 != null) {
            interfaceC1103130eoR2.setVisibility(i);
        }
        EnumC973650bRb enumC973650bRb = this.LLJILJILJ;
        if (enumC973650bRb == EnumC973650bRb.UNKNOWN) {
            enumC973650bRb = EnumC973650bRb.NORMAL;
        }
        InterfaceC1103130eoR interfaceC1103130eoR3 = this.LLILLJJLI;
        if (interfaceC1103130eoR3 != null && interfaceC1103130eoR3.getVisibility() == 0 && enumC973650bRb != this.LLJILJILJ) {
            this.LLJILJILJ = enumC973650bRb;
            C973660bRc.LIZ.LJLIIL("pk_icon", true);
        }
    }

    public final void LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showAnimation, funcSource = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("ToolbarInteractBattleBehavior", C2188811AlT.LIZIZ(sbLIZ));
        C1126540fQC c1126540fQC = this.LLILZ;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
        }
        C1126540fQC c1126540fQC2 = this.LLILZ;
        if (c1126540fQC2 != null) {
            c1126540fQC2.LLJILJIL = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_lottie_icon_time_countdown.webp");
        }
        C1126540fQC c1126540fQC3 = this.LLILZ;
        if (c1126540fQC3 != null) {
            c1126540fQC3.LJII();
        }
        AppCompatImageView appCompatImageView = this.LLILZIL;
        if (appCompatImageView != null) {
            C786410Ut5.LLILIL(appCompatImageView, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC1120860fH2 enumC1120860fH2;
        if (C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_SCREEN_SHARE) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853126));
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LLFII(EnumC973450bRH.COHOST_MODE_SCREEN_SHARE, EnumC974510bSz.ICON, 12);
            return;
        }
        C973890bRz.LIZ.LJIIJ = false;
        MultiMatchAnchorWidget multiMatchAnchorWidget = this.LLIZ;
        if (multiMatchAnchorWidget != null) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C973600bRW c973600bRW = this.LLJILJIL;
            if (c973600bRW != null) {
                enumC1120860fH2 = c973600bRW.LIZLLL;
            } else {
                enumC1120860fH2 = null;
            }
            String str = "pk_icon";
            if (enumC1120860fH2 != null) {
                int i = C973610bRX.LIZ[enumC1120860fH2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        str = "take_stage_guide_v2";
                    }
                } else {
                    str = "catch_bean_guide";
                }
            }
            multiMatchAnchorWidget.S1(str, null);
        }
        C973600bRW c973600bRW2 = this.LLJILJIL;
        if (c973600bRW2 != null) {
            c973600bRW2.LJ();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLIZ = null;
        if (LIZ() != null) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LIZJ(EnumC1120860fH2.MATCH_PLAYBOOK_GUIDE_BUBBLE);
        }
        C973600bRW c973600bRW = this.LLJILJIL;
        if (c973600bRW != null) {
            c973600bRW.LIZLLL(false);
            C473410IhP.LIZ().removeCallbacks(c973600bRW.LJFF);
            c973600bRW.LIZ();
            C473410IhP.LIZ().removeCallbacks(c973600bRW.LJ);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        boolean zBooleanValue;
        View viewLJ;
        Boolean bool;
        this.LLJIJIL = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C780690Ujr.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLIZLLLIL = zBooleanValue;
        this.LLILLJJLI = interfaceC1103130eoR;
        this.LLILLL = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.lkw);
        this.LLILZ = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.ll0);
        this.LLILZIL = (AppCompatImageView) interfaceC1103130eoR.findViewById(R.id.ll3);
        this.LLILZLL = (C16F5) interfaceC1103130eoR.findViewById(R.id.f14);
        if (this.LLIZLLLIL) {
            C20743416Fc c20743416Fc = (C20743416Fc) interfaceC1103130eoR.findViewById(R.id.y7s);
            this.LLJ = c20743416Fc;
            if (c20743416Fc != null) {
                c20743416Fc.setText(C497740JfY.LJIJI(2131842923));
            }
            this.LLJI = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
        }
        interfaceC1103130eoR.getContext();
        LIZJ();
        if (dataChannel != null) {
            C975230bU9.LJI(dataChannel, this.LL, new AwS664S0100000_15(this, 21));
            dataChannel.BQ2(this.LL, BattleInvitingTimeLeftChannel.class, new AwS381S0200000_15(this, dataChannel, 170));
        }
        InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLJJLI;
        if (interfaceC1103130eoR2 != null) {
            viewLJ = interfaceC1103130eoR2.LJ();
        } else {
            viewLJ = null;
        }
        C973600bRW c973600bRW = new C973600bRW(viewLJ, dataChannel, "pk_icon");
        this.LLJILJIL = c973600bRW;
        c973600bRW.LJFF();
    }

    public static void LIZIZ(C973580bRU c973580bRU, EnumC964170bCJ enumC964170bCJ, boolean z, int i) {
        C973600bRW c973600bRW;
        Integer num;
        View viewLJ;
        if ((i & 4) != 0) {
            z = false;
        }
        if (enumC964170bCJ != null) {
            EnumC964170bCJ enumC964170bCJ2 = EnumC964170bCJ.MATCH_START;
            if ((enumC964170bCJ == enumC964170bCJ2 || enumC964170bCJ == EnumC964170bCJ.INVITED || enumC964170bCJ == EnumC964170bCJ.RECEIVED) && (c973600bRW = c973580bRU.LLJILJIL) != null) {
                c973600bRW.LIZ();
            }
            if (enumC964170bCJ == enumC964170bCJ2) {
                C786410Ut5.LJLIIL(8000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS115S0100000_15(c973580bRU, 207));
            }
            if (enumC964170bCJ == EnumC964170bCJ.INVITED) {
                if (!InterfaceC934710aQn.wb.LIZIZ().booleanValue()) {
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    InterfaceC1103130eoR interfaceC1103130eoR = c973580bRU.LLILLJJLI;
                    if (interfaceC1103130eoR != null) {
                        viewLJ = interfaceC1103130eoR.LJ();
                    } else {
                        viewLJ = null;
                    }
                    C785230UrB c785230UrB = new C785230UrB(viewLJ);
                    String strLJIJI = C497740JfY.LJIJI(2131842884);
                    if (strLJIJI == null) {
                        strLJIJI = "";
                    }
                    c785230UrB.LJIJJ = strLJIJI;
                    c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0anN
                        @Override // X.InterfaceC254600ye
                        public final void onShow() {
                            InterfaceC934710aQn.wb.LJFF(Boolean.TRUE);
                        }
                    };
                    c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.ANCHOR_BATTLE, c973580bRU.LLJIJIL);
                }
                c973580bRU.LIZJ();
                c973580bRU.LJ("handleBattleState_invited");
                return;
            }
            if (enumC964170bCJ != EnumC964170bCJ.RECEIVED && enumC964170bCJ != EnumC964170bCJ.ACCEPTED) {
                if ((enumC964170bCJ.compareTo(enumC964170bCJ2) < 0 || enumC964170bCJ.compareTo(EnumC964170bCJ.MATCH_END) >= 0) && !z) {
                    if (LIZ() != null) {
                        if (C918210a0B.LIZIZ && !C918210a0B.LIZJ) {
                            InterfaceC980390bcT.Ua.LIZJ(Boolean.TRUE);
                        }
                        C918210a0B.LIZIZ = false;
                        C918210a0B.LIZJ = false;
                    }
                    C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
                    C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_BATTLE);
                    C1126540fQC c1126540fQC = c973580bRU.LLILZ;
                    if (c1126540fQC != null) {
                        c1126540fQC.clearAnimation();
                    }
                    C1126540fQC c1126540fQC2 = c973580bRU.LLILZ;
                    if (c1126540fQC2 != null) {
                        C786410Ut5.LLJJI(c1126540fQC2, 8);
                    }
                    AppCompatImageView appCompatImageView = c973580bRU.LLILZIL;
                    if (appCompatImageView != null) {
                        C786410Ut5.LLILIL(appCompatImageView, 8);
                    }
                    c973580bRU.LIZJ();
                    DataChannel dataChannel = c973580bRU.LLJIJIL;
                    if (dataChannel == null || (num = (Integer) dataChannel.gg0(BattleLinkedAnchorNumChannel.class)) == null || num.intValue() != 2) {
                        return;
                    }
                    C973890bRz.LJI();
                    return;
                }
                C1113800f5e c1113800f5e3 = C1113800f5e.LIZ;
                C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_BATTLE);
                C1126540fQC c1126540fQC3 = c973580bRU.LLILZ;
                if (c1126540fQC3 != null) {
                    c1126540fQC3.clearAnimation();
                }
                C1126540fQC c1126540fQC4 = c973580bRU.LLILZ;
                if (c1126540fQC4 != null) {
                    C786410Ut5.LLJJI(c1126540fQC4, 8);
                }
                AppCompatImageView appCompatImageView2 = c973580bRU.LLILZIL;
                if (appCompatImageView2 == null) {
                    return;
                }
                C786410Ut5.LLILIL(appCompatImageView2, 8);
                return;
            }
            c973580bRU.LIZJ();
            c973580bRU.LJ("handleBattleState_received");
        }
    }
}
