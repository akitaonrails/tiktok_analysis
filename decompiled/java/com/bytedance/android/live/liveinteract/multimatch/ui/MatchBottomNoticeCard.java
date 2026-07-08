package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.AbstractC1145640fv0;
import X.C019F;
import X.C01GW;
import X.C0GY9;
import X.C1144460ft6;
import X.C1144530ftD;
import X.C1144600ftK;
import X.C1144880ftm;
import X.C1144890ftn;
import X.C1144900fto;
import X.C1144910ftp;
import X.C1144920ftq;
import X.C1145580fuu;
import X.C1145590fuv;
import X.C1145600fuw;
import X.C1145610fux;
import X.C1145620fuy;
import X.C1145680fv4;
import X.C1145690fv5;
import X.C1145700fv6;
import X.C1145710fv7;
import X.C1145730fv9;
import X.C1146260fw0;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C423250Gih;
import X.C473410IhP;
import X.C485950J3x;
import X.C497740JfY;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C948770anT;
import X.C954460awe;
import X.C970370bMJ;
import X.C973320bR4;
import X.C973660bRc;
import X.C985030bjx;
import X.EnumC1144450ft5;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.InterfaceC1145720fv8;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC500940Jki;
import X.InterfaceC973730bRj;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.AAListenerS269S0200000_17;
import Y.ACListenerS120S0200000_17;
import Y.ACListenerS150S0100000_15;
import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS12S0200000_17;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS23S0201000_17;
import Y.ARunnableS25S0400000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.api.BattleBottomLayoutShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleArmiesTop1to3ChangeChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpContainerViewShowEventForReductionPhase2;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowIcyClashGuideEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowMatchItemGuideEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowMatchTop2ItemGuideEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowMultiMatchStreakGuideEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTeamArmiesTop1to3ChangeChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleUsePowerupsGuideShowEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleUserInTop23GuideShowEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleUserTop23GuideShowChannel;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.BattleShowVirtualTicketCrossRoomClaimTipChannel;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.BattleShowVirtualTicketOnboardingChannel;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomClaimTipDismissChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchBottomNoticeCard extends UIContentAssem implements IBottomNoticeAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1144600ftK.class, null), checkSupervisorPrepared());
    public ConstraintLayout LLJ;
    public C1146260fw0 LLJI;
    public C16FS LLJIJIL;
    public C985030bjx LLJILJIL;
    public FrameLayout LLJILJILJ;
    public boolean LLJILLL;
    public DataChannel LLJJ;
    public boolean LLJJI;
    public EnumC964170bCJ LLJJIII;
    public C1145620fuy LLJJIJI;
    public AwS261S0300000_17 LLJJIJIIJIL;
    public Function1<? super Context, Unit> LLJJIJIL;
    public Function1<? super Context, Unit> LLJJJ;
    public ARunnableS23S0201000_17 LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final C423250Gih LLJJJJJIL;
    public final AwS561S0100000_17 LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MatchBottomNoticeCard.class, "viewModel", "getViewModel()Lcom/bytedance/android/live/liveinteract/multimatch/ui/MatchBottomNoticeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MatchBottomNoticeCard() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MatchBottomNoticeViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 40), AFwS254S0000000_17.get$arr$(38), null, true);
        this.LLJJJJJIL = new C423250Gih(new AwS561S0100000_17(this, 60), new AwS561S0100000_17(this, 61), "MatchBottomNoticeCard");
        this.LLJJJJLIIL = new AwS561S0100000_17(this, 62);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1086323985) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IBottomNoticeAbility
    public final void Br0() {
        C20441214yg.LIZIZ("MatchBottomNoticeCard", "receive ability callback mvp animation end");
    }

    public final void Ho() {
        ARunnableS23S0201000_17 aRunnableS23S0201000_17 = this.LLJJJIL;
        if (aRunnableS23S0201000_17 != null) {
            ConstraintLayout constraintLayout = this.LLJ;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            HandlerHook.viewRemoveCallbacks(constraintLayout, aRunnableS23S0201000_17);
        }
        this.LLJJJIL = null;
    }

    public final MatchBottomNoticeViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (MatchBottomNoticeViewModel) assemVMLazy.getValue();
    }

    public final boolean Oo() {
        return this.LLJJI || C948770anT.LJ();
    }

    public final void Zo() {
        EnumC964170bCJ enumC964170bCJ = this.LLJJIII;
        if (enumC964170bCJ == null) {
            enumC964170bCJ = EnumC964170bCJ.NONE;
        }
        if (enumC964170bCJ.compareTo(EnumC964170bCJ.MATCH_START) >= 0) {
            if (!this.LLJILLL) {
                DataChannel dataChannel = this.LLJJ;
                if (dataChannel != null) {
                    dataChannel.zW(BattleMvpContainerViewShowEventForReductionPhase2.class, Boolean.TRUE);
                    return;
                }
                return;
            }
            C1146260fw0 c1146260fw0 = this.LLJI;
            if (c1146260fw0 != null) {
                int visibility = c1146260fw0.getVisibility();
                c1146260fw0.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1146260fw0);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C20441214yg.LIZIZ("MatchBottomNoticeCard", "onDestroy");
        ConstraintLayout constraintLayout = this.LLJ;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        HandlerHook.viewRemoveCallbacks(constraintLayout, new ARunnableS113S0100000_13(this.LLJJJJLIIL, (Function0<Unit>) 49));
        AwS261S0300000_17 awS261S0300000_17 = this.LLJJIJIIJIL;
        if (awS261S0300000_17 != null) {
            ConstraintLayout constraintLayout2 = this.LLJ;
            if (constraintLayout2 == null) {
                constraintLayout2 = null;
            }
            HandlerHook.viewRemoveCallbacks(constraintLayout2, new ARunnableS113S0100000_13(awS261S0300000_17, (Function0<Unit>) 49));
        }
        C1145620fuy c1145620fuy = this.LLJJIJI;
        if (c1145620fuy != null && C500260Jjc.LJJJJIZL(c1145620fuy)) {
            C1145620fuy c1145620fuy2 = this.LLJJIJI;
            if (c1145620fuy2 != null) {
                C500260Jjc.LJIILLIIL(c1145620fuy2);
            }
            Zo();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy bannerStatus=");
        sbLIZ.append(C973320bR4.LIZIZ);
        C20441214yg.LIZIZ("MultiMatchStreakGuide", C2188811AlT.LIZIZ(sbLIZ));
        if (C973320bR4.LIZIZ != -1) {
            C973320bR4.LIZIZ = 0;
        }
        this.LLJJIII = EnumC964170bCJ.NONE;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IBottomNoticeAbility
    public final void ri() {
        this.LLJJJJJIL.LIZ();
        cp();
    }

    public final boolean No() {
        return C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6();
    }

    public final void cp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePosition in assem, isMulti = ");
        sbLIZ.append(Oo());
        C20441214yg.LIZIZ("MatchBottomNoticeCard", C2188811AlT.LIZIZ(sbLIZ));
        ConstraintLayout constraintLayout = this.LLJ;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        HandlerHook.viewPost(constraintLayout, new ARunnableS117S0100000_17(this, 33));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IBottomNoticeAbility.class, null, this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IBottomNoticeAbility.class, null, this);
    }

    public final void Go(boolean z) {
        int i;
        View view;
        C1146260fw0 c1146260fw0;
        if (!LiveMatchTop2Top3CardSettings.INSTANCE.getValue() || Oo()) {
            return;
        }
        if (z) {
            int i2 = C1146260fw0.LLLIIIL;
            i = C1146260fw0.LLLIIIL;
        } else {
            int i3 = C1146260fw0.LLLIIIL;
            i = C1146260fw0.LLLIILIL;
        }
        FrameLayout frameLayout = this.LLJILJILJ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (frameLayout.getHeight() != i) {
            FrameLayout frameLayout2 = this.LLJILJILJ;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            C500260Jjc.LJJZ(i, frameLayout2);
        }
        if (!z && (c1146260fw0 = this.LLJI) != null && c1146260fw0.LLLIIII > 0) {
            C20441214yg.LJIIIZ("MatchBottomNoticeCard", "adjustParentHeight: battleMvpContainer is showing top23 powerup");
            return;
        }
        FrameLayout frameLayout3 = this.LLJILJILJ;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        Object parent = frameLayout3.getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null || view.getHeight() == i) {
            return;
        }
        C500260Jjc.LJJZ(i, view);
    }

    public final void Jo(EnumC964170bCJ enumC964170bCJ) {
        Long lValueOf;
        Room roomLJJLIIIIJ;
        Room roomLJJLIIIIJ2;
        EnumC964170bCJ enumC964170bCJ2 = EnumC964170bCJ.MATCH_START;
        Long lValueOf2 = null;
        if (enumC964170bCJ.compareTo(enumC964170bCJ2) >= 0 && enumC964170bCJ.compareTo(EnumC964170bCJ.MATCH_END) < 0 && C915980Zwa.LJFF().xB0().compareTo(EnumC919170a1j.UNKNOWN) > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("battleState ");
            sbLIZ.append(enumC964170bCJ);
            sbLIZ.append(" && currentMatchType = ");
            sbLIZ.append(C915980Zwa.LJFF().xB0());
            C20441214yg.LIZIZ("MatchBottomNoticeCard", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJJI = C970370bMJ.LJII();
            cp();
        } else {
            Ho();
            ConstraintLayout constraintLayout = this.LLJ;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            C786410Ut5.LL(8, constraintLayout);
            DataChannel dataChannel = this.LLJJ;
            if (dataChannel != null) {
                int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
                DataChannel dataChannel2 = this.LLJJ;
                if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null) {
                    lValueOf = Long.valueOf(roomLJJLIIIIJ.getId());
                } else {
                    lValueOf = null;
                }
                dataChannel.zW(BattleBottomLayoutShowChannel.class, new C1145730fv9(iLIZIZ, lValueOf));
            }
        }
        if (enumC964170bCJ == EnumC964170bCJ.NONE) {
            Ho();
            ConstraintLayout constraintLayout2 = this.LLJ;
            if (constraintLayout2 == null) {
                constraintLayout2 = null;
            }
            C786410Ut5.LL(8, constraintLayout2);
            DataChannel dataChannel3 = this.LLJJ;
            if (dataChannel3 != null) {
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(8.0f);
                DataChannel dataChannel4 = this.LLJJ;
                if (dataChannel4 != null && (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel4)) != null) {
                    lValueOf2 = Long.valueOf(roomLJJLIIIIJ2.getId());
                }
                dataChannel3.zW(BattleBottomLayoutShowChannel.class, new C1145730fv9(iLIZIZ2, lValueOf2));
            }
        }
        if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue() && enumC964170bCJ == enumC964170bCJ2) {
            C473410IhP.LIZJ(new ARunnableS117S0100000_17(this, 31), 3000L);
        }
    }

    public final void So(View view) {
        float measuredHeight;
        C1145620fuy c1145620fuy;
        C20441214yg.LIZIZ("MatchBottomNoticeCard", "layoutPullInAnimation");
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[2];
        Oo();
        fArr[0] = 0.0f;
        if (Oo()) {
            measuredHeight = view.getMeasuredHeight() * (-1.0f);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        fArr[1] = measuredHeight;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        if ((view instanceof C1145620fuy) && (c1145620fuy = (C1145620fuy) view) != null) {
            c1145620fuy.LIZLLL();
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(333L);
        animatorSet.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        animatorSet.addListener(new AAListenerS269S0200000_17(this, view, 0));
        animatorSet.start();
        C20441214yg.LIZIZ("MatchBottomNoticeCard", "pull in animation");
        Lo().LL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC964170bCJ enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJ2;
        super.onViewCreated(view);
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue() && C500260Jjc.LJJ()) {
            int i = 0;
            do {
                C01GW c01gw = C485950J3x.LIZ;
                C485950J3x.LIZLLL(R.layout.h7t, view.getContext());
                i++;
            } while (i < 6);
        }
        this.LLJILLL = ((C1144600ftK) this.LLIZLLLIL.getValue()).LL;
        this.LLJJ = ((C1144600ftK) this.LLIZLLLIL.getValue()).LLILLJJLI;
        this.LLJ = (ConstraintLayout) view;
        this.LLJI = (C1146260fw0) view.findViewById(R.id.mdj);
        this.LLJIJIL = (C16FS) view.findViewById(R.id.cnn);
        this.LLJILJIL = (C985030bjx) view.findViewById(R.id.cnl);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.mbi);
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel != null) {
            enumC964170bCJ = (EnumC964170bCJ) dataChannel.gg0(BattleStateChannel.class);
        } else {
            enumC964170bCJ = null;
        }
        this.LLJJIII = enumC964170bCJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentBattleState = ");
        sbLIZ.append(this.LLJJIII);
        C20441214yg.LIZIZ("MatchBottomNoticeCard", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJILLL && (enumC964170bCJ2 = this.LLJJIII) != null) {
            Jo(enumC964170bCJ2);
        }
        DataChannel dataChannel2 = this.LLJJ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleStateChannel.class, this, new AwS596S0100000_17(this, 57));
            dataChannel2.CQ2(BattleShowMatchItemGuideEvent.class, this, new AwS596S0100000_17(this, 58));
            dataChannel2.CQ2(BattleUsePowerupsGuideShowEvent.class, this, new AwS596S0100000_17(this, 59));
            dataChannel2.CQ2(BattleUserInTop23GuideShowEvent.class, this, new AwS596S0100000_17(this, 60));
            dataChannel2.CQ2(BattleArmiesTop1to3ChangeChannel.class, this, new AwS594S0100000_15(this, 520));
            dataChannel2.CQ2(BattleTeamArmiesTop1to3ChangeChannel.class, this, new AwS594S0100000_15(this, 521));
            dataChannel2.CQ2(BattleShowIcyClashGuideEvent.class, this, new AwS596S0100000_17(this, 61));
            dataChannel2.CQ2(BattleShowMatchTop2ItemGuideEvent.class, this, new AwS596S0100000_17(this, 52));
            dataChannel2.CQ2(BattleShowMultiMatchStreakGuideEvent.class, this, new AwS596S0100000_17(this, 53));
            dataChannel2.DQ2(BattleShowVirtualTicketCrossRoomClaimTipChannel.class, this, new AwS596S0100000_17(this, 54));
            dataChannel2.DQ2(BattleShowVirtualTicketOnboardingChannel.class, this, new AwS596S0100000_17(this, 55));
            dataChannel2.CQ2(VirtualTicketCrossRoomClaimTipDismissChannel.class, this, new AwS596S0100000_17(this, 56));
        }
        DataChannel dataChannel3 = this.LLJJ;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(BattleBonusTaskShowChannel.class, this, new AwS596S0100000_17(this, 366));
        }
        this.LLJJJJJIL.LIZ();
    }

    public final void ap(C1145600fuw c1145600fuw, int i) {
        Ho();
        ConstraintLayout constraintLayout = null;
        if (Lo().vQ2(c1145600fuw)) {
            bp(c1145600fuw, null);
            return;
        }
        if (i <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Surface B give up: slot still busy after retries, contentType=");
            sbLIZ.append(c1145600fuw.LIZ);
            C20441214yg.LJIIL("MatchBottomNoticeCard", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ARunnableS23S0201000_17 aRunnableS23S0201000_17 = new ARunnableS23S0201000_17(i, c1145600fuw, this, 2);
        this.LLJJJIL = aRunnableS23S0201000_17;
        ConstraintLayout constraintLayout2 = this.LLJ;
        if (constraintLayout2 != null) {
            constraintLayout = constraintLayout2;
        }
        HandlerHook.viewPostDelay(constraintLayout, aRunnableS23S0201000_17, 300L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bp(C1145600fuw c1145600fuw, Function0<Unit> function0) {
        String str;
        Long lValueOf;
        Long lValueOf2;
        String string;
        String str2;
        DataChannel dataChannel;
        if (!Lo().vQ2(c1145600fuw)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateInnerContentConfig REJECTED contentType=");
            sbLIZ.append(c1145600fuw.LIZ);
            sbLIZ.append(" currentShowing=");
            Lo();
            sbLIZ.append("MatchBottomNoticeViewModel");
            C20441214yg.LJIIL("MatchBottomNoticeCard", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateInnerContentConfig ACCEPTED contentType=");
        sbLIZ2.append(c1145600fuw.LIZ);
        C20441214yg.LJIIIZ("MatchBottomNoticeCard", C2188811AlT.LIZIZ(sbLIZ2));
        FrameLayout frameLayout = this.LLJILJILJ;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        FrameLayout frameLayout3 = this.LLJILJILJ;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        if (frameLayout3.getChildCount() == 0) {
            AbstractC1145640fv0 abstractC1145640fv0 = c1145600fuw.LIZ;
            if (!Intrinsics.LJFF(abstractC1145640fv0, C1145700fv6.LIZ) && !(abstractC1145640fv0 instanceof C1144890ftn) && !(abstractC1145640fv0 instanceof C1144920ftq)) {
                if (!Intrinsics.LJFF(abstractC1145640fv0, C1145710fv7.LIZ) && !(abstractC1145640fv0 instanceof C1144900fto) && !(abstractC1145640fv0 instanceof C1145680fv4)) {
                    if (Intrinsics.LJFF(abstractC1145640fv0, C1145690fv5.LIZ)) {
                        FrameLayout frameLayout4 = this.LLJILJILJ;
                        if (frameLayout4 == null) {
                            frameLayout4 = null;
                        }
                        ConstraintLayout constraintLayout = this.LLJ;
                        if (constraintLayout == null) {
                            constraintLayout = null;
                        }
                        frameLayout4.addView(new C1145610fux(constraintLayout.getContext()));
                    } else if (abstractC1145640fv0 instanceof C1144910ftp) {
                        if (Oo() && (dataChannel = this.LLJJ) != null) {
                            dataChannel.zW(BattleUserTop23GuideShowChannel.class, Boolean.TRUE);
                        }
                        Go(true);
                        ConstraintLayout constraintLayout2 = this.LLJ;
                        if (constraintLayout2 == null) {
                            constraintLayout2 = null;
                        }
                        C1145620fuy c1145620fuy = new C1145620fuy(constraintLayout2.getContext(), this.LLJJ);
                        this.LLJJIJI = c1145620fuy;
                        FrameLayout frameLayout5 = this.LLJILJILJ;
                        if (frameLayout5 == null) {
                            frameLayout5 = null;
                        }
                        frameLayout5.addView(c1145620fuy);
                        FrameLayout frameLayout6 = this.LLJILJILJ;
                        if (frameLayout6 == null) {
                            frameLayout6 = null;
                        }
                        FrameLayout frameLayout7 = new FrameLayout(frameLayout6.getContext());
                        C786410Ut5.a6(frameLayout7, new ViewGroup.LayoutParams(-1, -1));
                        FrameLayout frameLayout8 = this.LLJILJILJ;
                        if (frameLayout8 == null) {
                            frameLayout8 = null;
                        }
                        frameLayout8.addView(frameLayout7);
                        C1145620fuy c1145620fuy2 = this.LLJJIJI;
                        if (c1145620fuy2 != null) {
                            c1145620fuy2.LLJJIJIIJIL = frameLayout7;
                        }
                    }
                } else {
                    FrameLayout frameLayout9 = this.LLJILJILJ;
                    if (frameLayout9 == null) {
                        frameLayout9 = null;
                    }
                    ConstraintLayout constraintLayout3 = this.LLJ;
                    if (constraintLayout3 == null) {
                        constraintLayout3 = null;
                    }
                    frameLayout9.addView(new C1145590fuv(constraintLayout3.getContext()));
                }
            } else {
                FrameLayout frameLayout10 = this.LLJILJILJ;
                if (frameLayout10 == null) {
                    frameLayout10 = null;
                }
                ConstraintLayout constraintLayout4 = this.LLJ;
                if (constraintLayout4 == null) {
                    constraintLayout4 = null;
                }
                frameLayout10.addView(new C1145580fuu(constraintLayout4.getContext()));
            }
        }
        FrameLayout frameLayout11 = this.LLJILJILJ;
        if (frameLayout11 == null) {
            frameLayout11 = null;
        }
        if (frameLayout11.getChildAt(0) instanceof InterfaceC1145720fv8) {
            FrameLayout frameLayout12 = this.LLJILJILJ;
            if (frameLayout12 == null) {
                frameLayout12 = null;
            }
            InterfaceC1145720fv8 interfaceC1145720fv8 = (InterfaceC1145720fv8) frameLayout12.getChildAt(0);
            interfaceC1145720fv8.LIZ(c1145600fuw, new AwS146S0400000_17(c1145600fuw, (C1145600fuw) this, (MatchBottomNoticeCard) interfaceC1145720fv8, (InterfaceC1145720fv8) function0, (Function0<Unit>) 0));
            this.LLJJJJJIL.LIZIZ(0);
            Vo((View) interfaceC1145720fv8, c1145600fuw, true);
            if (!Intrinsics.LJFF(c1145600fuw.LIZ, C1145700fv6.LIZ) && !Intrinsics.LJFF(c1145600fuw.LIZ, C1145710fv7.LIZ)) {
                AbstractC1145640fv0 abstractC1145640fv02 = c1145600fuw.LIZ;
                if (abstractC1145640fv02 instanceof C1144900fto) {
                    C973660bRc c973660bRc = C973660bRc.LIZ;
                    C1144530ftD.LJIIIIZZ(c1145600fuw.LJ);
                    FrameLayout frameLayout13 = this.LLJILJILJ;
                    if (frameLayout13 != null) {
                        frameLayout2 = frameLayout13;
                    }
                    C786410Ut5.O7(frameLayout2, new View.OnClickListener() { // from class: X.0fv2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    });
                } else if (abstractC1145640fv02 instanceof C1144910ftp) {
                    C973660bRc c973660bRc2 = C973660bRc.LIZ;
                    C1144880ftm c1144880ftm = c1145600fuw.LJ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C973660bRc.LJIIZILJ(c973660bRc2, linkedHashMap, false, false, null, 14);
                    C973660bRc.LJJIIJZLJL(linkedHashMap);
                    C973660bRc.LJIJ(c973660bRc2, linkedHashMap, false, false, false, 12);
                    linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
                    String str3 = C973660bRc.LJJII;
                    if (C973660bRc.LJLLLL()) {
                        str = "anchor";
                    } else {
                        str = "user";
                    }
                    linkedHashMap.put(str3, str);
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 != null) {
                        lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
                    } else {
                        lValueOf = null;
                    }
                    linkedHashMap.put("pk_id", String.valueOf(lValueOf));
                    InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf22 != null) {
                        lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJL());
                    } else {
                        lValueOf2 = null;
                    }
                    linkedHashMap.put("channel_id", String.valueOf(lValueOf2));
                    InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                    String str4 = "";
                    if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                        string = "";
                    }
                    linkedHashMap.put("user_id", string);
                    if (c1144880ftm != null) {
                        if (Intrinsics.LJFF(c1144880ftm.LJFF, "count_down")) {
                            str2 = "countdown";
                        } else {
                            str2 = c1144880ftm.LJFF;
                            if (str2 == null) {
                                str2 = "";
                            }
                        }
                        linkedHashMap.put("trigger_type", str2);
                        String str5 = c1144880ftm.LJI;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        linkedHashMap.put("notification_request_id", str4);
                        C1144460ft6 c1144460ft6 = EnumC1144450ft5.Companion;
                        int i = (int) (c1144880ftm.LIZIZ / ((long) 10000));
                        c1144460ft6.getClass();
                        linkedHashMap.put("match_item_type", String.valueOf(C1144460ft6.LIZ(i)));
                    }
                    C1144530ftD.LIZ(c973660bRc2, linkedHashMap);
                    String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
                    if (strLIZIZ == null) {
                        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                        int size = C915980Zwa.LJII().LLILZLL(true).size();
                        c917350Zyn.getClass();
                        strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
                    }
                    if (C970370bMJ.LJII()) {
                        C973660bRc.LJZ(c973660bRc2, "livesdk_match_item_effect_notice_send_show", linkedHashMap, strLIZIZ);
                    } else {
                        C973660bRc.LJZI(c973660bRc2, "livesdk_match_item_effect_notice_send_show", linkedHashMap, strLIZIZ);
                    }
                    FrameLayout frameLayout14 = this.LLJILJILJ;
                    if (frameLayout14 != null) {
                        frameLayout2 = frameLayout14;
                    }
                    C786410Ut5.O7(frameLayout2, new View.OnClickListener() { // from class: X.0fv1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    });
                } else if (abstractC1145640fv02 instanceof C1145680fv4) {
                    FrameLayout frameLayout15 = this.LLJILJILJ;
                    if (frameLayout15 != null) {
                        frameLayout2 = frameLayout15;
                    }
                    C786410Ut5.O7(frameLayout2, new ACListenerS150S0100000_15(this, 165));
                } else if (abstractC1145640fv02 instanceof C1145690fv5) {
                    FrameLayout frameLayout16 = this.LLJILJILJ;
                    if (frameLayout16 != null) {
                        frameLayout2 = frameLayout16;
                    }
                    C786410Ut5.O7(frameLayout2, new ACListenerS150S0100000_15(this, 166));
                } else if (abstractC1145640fv02 instanceof C1144890ftn) {
                    FrameLayout frameLayout17 = this.LLJILJILJ;
                    if (frameLayout17 != null) {
                        frameLayout2 = frameLayout17;
                    }
                    C786410Ut5.O7(frameLayout2, new ACListenerS152S0100000_17(this, 9));
                } else if (abstractC1145640fv02 instanceof C1144920ftq) {
                    FrameLayout frameLayout18 = this.LLJILJILJ;
                    if (frameLayout18 != null) {
                        frameLayout2 = frameLayout18;
                    }
                    C786410Ut5.O7(frameLayout2, new ACListenerS152S0100000_17(this, 10));
                }
            } else {
                FrameLayout frameLayout19 = this.LLJILJILJ;
                if (frameLayout19 != null) {
                    frameLayout2 = frameLayout19;
                }
                C786410Ut5.O7(frameLayout2, new ACListenerS120S0200000_17(c1145600fuw, this, 5));
                C973660bRc c973660bRc3 = C973660bRc.LIZ;
                C1144530ftD.LJIIIIZZ(c1145600fuw.LJ);
            }
            Lo().LL = c1145600fuw.LIZ;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IBottomNoticeAbility
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        if (No()) {
            cp();
        }
    }

    public final void Vo(View view, C1145600fuw c1145600fuw, boolean z) {
        float measuredHeight;
        long j;
        Long lValueOf;
        Room roomLJJLIIIIJ;
        C1145620fuy c1145620fuy;
        if (z && view.getMeasuredHeight() == 0) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS25S0400000_17(view, this, view, c1145600fuw, 0));
            return;
        }
        if (!this.LLJILLL) {
            DataChannel dataChannel = this.LLJJ;
            if (dataChannel != null) {
                dataChannel.zW(BattleMvpContainerViewShowEventForReductionPhase2.class, Boolean.FALSE);
            }
        } else {
            C1146260fw0 c1146260fw0 = this.LLJI;
            if (c1146260fw0 != null) {
                int visibility = c1146260fw0.getVisibility();
                c1146260fw0.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1146260fw0);
            }
        }
        if (!Intrinsics.LJFF(view, this.LLJJIJI) && (c1145620fuy = this.LLJJIJI) != null) {
            c1145620fuy.LIZLLL();
        }
        C16FS c16fs = this.LLJIJIL;
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = null;
        if (c16fs == null) {
            c16fs = null;
        }
        C786410Ut5.LLJJJ(c16fs, 8);
        C985030bjx c985030bjx = this.LLJILJIL;
        if (c985030bjx == null) {
            c985030bjx = null;
        }
        C786410Ut5.LLJL(c985030bjx, 8);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLayout Y = ");
        sbLIZ.append(view.getY());
        sbLIZ.append(" and height = ");
        sbLIZ.append(view.getMeasuredHeight());
        C20441214yg.LIZIZ("MatchBottomNoticeCard", C2188811AlT.LIZIZ(sbLIZ));
        if (!Oo()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("layoutPullout 33 animation post height, bottomNoticeLayout.measuredHeight + ResUtil.dp2Px(6f) = ");
            ConstraintLayout constraintLayout = this.LLJ;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            sbLIZ2.append(constraintLayout.getMeasuredHeight() + ((int) C497740JfY.LIZIZ(6.0f)));
            C20441214yg.LIZIZ("MatchRedesign", C2188811AlT.LIZIZ(sbLIZ2));
            DataChannel dataChannel2 = this.LLJJ;
            if (dataChannel2 != null) {
                ConstraintLayout constraintLayout2 = this.LLJ;
                if (constraintLayout2 == null) {
                    constraintLayout2 = null;
                }
                int measuredHeight2 = constraintLayout2.getMeasuredHeight() + ((int) C497740JfY.LIZIZ(6.0f));
                DataChannel dataChannel3 = this.LLJJ;
                if (dataChannel3 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel3)) != null) {
                    lValueOf = Long.valueOf(roomLJJLIIIIJ.getId());
                } else {
                    lValueOf = null;
                }
                dataChannel2.zW(BattleBottomLayoutShowChannel.class, new C1145730fv9(measuredHeight2, lValueOf));
            }
        }
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[2];
        if (Oo()) {
            measuredHeight = view.getMeasuredHeight() * (-1.0f);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        fArr[0] = measuredHeight;
        Oo();
        fArr[1] = 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(333L);
        animatorSet.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        animatorSet.addListener(new ALAdapterS12S0200000_17(c1145600fuw, view, 1));
        animatorSet.start();
        C20441214yg.LIZIZ("MatchBottomNoticeCard", "pull out animation");
        this.LLJJIJIIJIL = new AwS261S0300000_17(c1145600fuw, this, view, 1);
        if (Intrinsics.LJFF(c1145600fuw.LIZ, C1145690fv5.LIZ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onBannerShow bannerStatus=");
            sbLIZ3.append(C973320bR4.LIZIZ);
            C20441214yg.LIZIZ("MultiMatchStreakGuide", C2188811AlT.LIZIZ(sbLIZ3));
            if (C973320bR4.LIZIZ == 1) {
                C973320bR4.LIZIZ = 2;
                C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS115S0100000_15(91));
            }
            j = 10000;
        } else {
            j = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        ConstraintLayout constraintLayout3 = this.LLJ;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        AwS261S0300000_17 awS261S0300000_17 = this.LLJJIJIIJIL;
        if (awS261S0300000_17 != null) {
            aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(awS261S0300000_17, (Function0<Unit>) 49);
        }
        HandlerHook.viewPostDelay(constraintLayout3, aRunnableS113S0100000_13, j);
    }
}
