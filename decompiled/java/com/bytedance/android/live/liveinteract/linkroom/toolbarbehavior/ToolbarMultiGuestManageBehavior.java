package com.bytedance.android.live.liveinteract.linkroom.toolbarbehavior;

import X.C01GW;
import X.C0GZA;
import X.C1113800f5e;
import X.C11IW;
import X.C11NJ;
import X.C16F5;
import X.C497740JfY;
import X.C500260Jjc;
import X.C750160Tbi;
import X.C785230UrB;
import X.C785270UrF;
import X.C785410UrT;
import X.C923330a8R;
import X.C924030a9Z;
import X.C925640aCA;
import X.C926450aDT;
import X.C930540aK4;
import X.C931780aM4;
import X.C932420aN6;
import X.C933010aO3;
import X.C933070aO9;
import X.C933130aOF;
import X.C934020aPg;
import X.C948450amx;
import X.C952600ate;
import X.EnumC1120860fH2;
import X.InterfaceC1103130eoR;
import X.InterfaceC1106030et7;
import X.InterfaceC254600ye;
import X.InterfaceC785120Ur0;
import X.InterfaceC923350a8T;
import X.InterfaceC933880aPS;
import X.InterfaceC948490an1;
import X.InterfaceViewOnClickListenerC1102800enu;
import Y.ACListenerS118S0200000_15;
import Y.AfS151S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AvatarToolTipsShowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowInviteGuestBackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplicantNumChangedForModeratorChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestManageBehaviorRedDotSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWavePrivilegeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class ToolbarMultiGuestManageBehavior implements InterfaceViewOnClickListenerC1102800enu, InterfaceC923350a8T {
    public static final /* synthetic */ int LLJILLL = 0;
    public final boolean LL;
    public DataChannel LLILLJJLI;
    public C16F5 LLILLL;
    public InterfaceC1103130eoR LLILZ;
    public C933070aO9 LLILZIL;
    public List<C933130aOF> LLILZLL;
    public LiveActionSheetDialog LLJ;
    public C932420aN6 LLJI;
    public boolean LLJIJIL;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mMultiGuestDataHolder;
    public final C01GW LLIZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(37));
    public final C01GW LLIZLLLIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(38));
    public final C11NJ LLJILJIL = new C11NJ();
    public final List<TextView> LLJILJILJ = new ArrayList();

    public static final class ShowMultiGuestMenuEvent extends Event<C926450aDT> {
        public static final int $stable = 8;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    public final boolean LIZLLL() {
        if (C931780aM4.LJFF(null) && C931780aM4.LIZJ()) {
            C932420aN6 c932420aN6 = this.LLJI;
            return C500260Jjc.LJJJI(c932420aN6 != null ? Boolean.valueOf(c932420aN6.isShowing()) : null);
        }
        LiveActionSheetDialog liveActionSheetDialog = this.LLJ;
        return C500260Jjc.LJJJI(liveActionSheetDialog != null ? Boolean.valueOf(liveActionSheetDialog.isShowing()) : null);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
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

    public final MultiGuestDataHolder LIZIZ() {
        MultiGuestDataHolder multiGuestDataHolder = this.mMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final C933070aO9 LIZJ() {
        Integer num;
        C933010aO3 c933010aO3 = new C933010aO3();
        Object[] objArr = new Object[1];
        DataChannel dataChannel = this.LLILLJJLI;
        objArr[0] = Integer.valueOf((dataChannel == null || (num = (Integer) dataChannel.gg0(MultiGuestApplicantNumChangedForModeratorChannel.class)) == null) ? 0 : num.intValue());
        c933010aO3.LIZ = C497740JfY.LJIJJ(2131843399, objArr);
        c933010aO3.LIZJ = new InterfaceC933880aPS() { // from class: X.0aEM
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(OpenMultiGuestModeratorsManageDialogEvent.class, new C926940aEG(EnumC926990aEL.LINKED_POP_ACTION_SHEET_DIALOG, 0, 6));
                }
            }
        };
        C933070aO9 c933070aO9 = new C933070aO9(c933010aO3);
        this.LLILZIL = c933070aO9;
        return c933070aO9;
    }

    public ToolbarMultiGuestManageBehavior(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC923350a8T
    public final void LIZ(boolean z) {
        if (LIZLLL()) {
            LiveActionSheetDialog liveActionSheetDialog = this.LLJ;
            if (liveActionSheetDialog != null) {
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
            C932420aN6 c932420aN6 = this.LLJI;
            if (c932420aN6 != null) {
                c932420aN6.dismiss();
            }
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.LC0(ShowMultiGuestMenuEvent.class, new C926450aDT(false));
            }
        }
    }

    public final void LJ(int i) {
        InterfaceC785120Ur0 interfaceC785120Ur0;
        View viewLIZJ;
        if (!MultiGuestManageBehaviorRedDotSetting.INSTANCE.enable()) {
            return;
        }
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLILZ;
        View viewLJ = null;
        if ((interfaceC1103130eoR instanceof InterfaceC785120Ur0) && (interfaceC785120Ur0 = (InterfaceC785120Ur0) interfaceC1103130eoR) != null && (viewLIZJ = interfaceC785120Ur0.LIZJ()) != null) {
            viewLJ = viewLIZJ;
        } else {
            InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILZ;
            if (interfaceC1103130eoR2 != null) {
                viewLJ = interfaceC1103130eoR2.LJ();
            }
        }
        if (i > 0) {
            if (viewLJ != null) {
                float fLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
                float fLIZIZ2 = (int) C497740JfY.LIZIZ(8.0f);
                if (LiveToolbarUIConfig.noText()) {
                    fLIZIZ = (int) C497740JfY.LIZIZ(14.0f);
                    fLIZIZ2 = (int) C497740JfY.LIZIZ(6.0f);
                }
                C0GZA.LIZ(viewLJ, i, fLIZIZ, fLIZIZ2);
                ViewParent parent = viewLJ.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).setClipChildren(false);
                    return;
                }
                return;
            }
            return;
        }
        if (viewLJ == null) {
            return;
        }
        C0GZA.LIZIZ(viewLJ);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long followStatus;
        DataChannel dataChannel;
        Room room;
        User owner;
        FollowInfo followInfo;
        if (this.LLJIJIL) {
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C925640aCA.LJIJJ("connection_button", followStatus, true, "multi_guest", this.LLILLJJLI, "liveHome", "multiguestBtn");
            if (this.LLJIJIL && (dataChannel = this.LLILLJJLI) != null) {
                dataChannel.SX0(C750160Tbi.class, Boolean.TRUE);
            }
            DataChannel dataChannel3 = this.LLILLJJLI;
            if (dataChannel3 != null) {
                dataChannel3.LC0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C924030a9Z(null, "guest_icon", "button_icon"));
                return;
            }
            return;
        }
        DataChannel dataChannel4 = this.LLILLJJLI;
        if (dataChannel4 == null) {
            return;
        }
        dataChannel4.LC0(ShowMultiGuestMenuEvent.class, new C926450aDT(true));
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        View viewLJ;
        InterfaceC785120Ur0 interfaceC785120Ur0;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILJJIL(this);
        if (((interfaceC1103130eoR instanceof InterfaceC785120Ur0) && (interfaceC785120Ur0 = (InterfaceC785120Ur0) interfaceC1103130eoR) != null && (viewLJ = interfaceC785120Ur0.LIZJ()) != null) || (viewLJ = interfaceC1103130eoR.LJ()) != null) {
            C0GZA.LIZIZ(viewLJ);
        }
        this.LLILZ = null;
        LiveActionSheetDialog liveActionSheetDialog = this.LLJ;
        if (liveActionSheetDialog != null) {
            liveActionSheetDialog.dismiss();
            C785410UrT.LIZ(liveActionSheetDialog);
        }
        this.LLJ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        C932420aN6 c932420aN6 = this.LLJI;
        if (c932420aN6 != null) {
            c932420aN6.dismiss();
        }
        this.LLJI = null;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C934020aPg.LIZ.getClass();
        C934020aPg.LIZIZ(4);
        this.LLJILJIL.LJ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        int iIntValue;
        Integer num;
        InterfaceC1103130eoR interfaceC1103130eoR2;
        View contentView;
        C948450amx.LIZIZ.LIZJ(this);
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(ShowMultiGuestMenuEvent.class, this, new AwS381S0200000_15(this, interfaceC1103130eoR, 28));
        }
        this.LLILZ = interfaceC1103130eoR;
        this.LLILLL = (C16F5) interfaceC1103130eoR.findViewById(R.id.view_red_dot_num);
        TextView textView = (TextView) interfaceC1103130eoR.findViewById(R.id.y7s);
        if (textView != null) {
            textView.setText(2131853927);
        }
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestApplicantNumChangedForModeratorChannel.class, this, new AwS594S0100000_15(this, 122));
            dataChannel.CQ2(AvatarToolTipsShowEvent.class, this, new AwS224S0300000_15(interfaceC1103130eoR, dataChannel, this, 5));
            dataChannel.CQ2(ShowInviteGuestBackEvent.class, this, new AwS381S0200000_15(interfaceC1103130eoR, dataChannel, 29));
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LIZ(this);
        C934020aPg c934020aPg = C934020aPg.LIZ;
        C16F5 c16f5 = this.LLILLL;
        c934020aPg.getClass();
        C934020aPg.LIZ(4, c16f5, true);
        if (C952600ate.LIZ) {
            this.LLJILJIL.LIZ(new C11IW(MultiGuestLayoutRenderV2.LLJJIII.LJJIJIIJIL(new AfS151S0200000_15(this, interfaceC1103130eoR, 19))).LJIILL().LJIIZILJ());
        }
        if (MultiGuestVoiceWavePrivilegeSetting.INSTANCE.enable() && !InterfaceC1106030et7.y8.LIZIZ().booleanValue() && (interfaceC1103130eoR2 = this.LLILZ) != null && (contentView = interfaceC1103130eoR2.getContentView()) != null) {
            C785230UrB c785230UrB = new C785230UrB(contentView);
            c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785230UrB.LJIIIZ = true;
            c785230UrB.LIZLLL(2131854233);
            c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0aPJ
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    C20441214yg.LIZIZ("ToolbarMultiGuestManageBehavior", "show voiceWave bubble for guest");
                    InterfaceC1106030et7.y8.LJFF(Boolean.TRUE);
                }
            };
            c785230UrB.LJ = new ACListenerS118S0200000_15(this, contentView, 71);
            C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.MULTI_GUEST_VOICE_WAVE_GUIDE, this.LLILLJJLI);
        }
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(MultiGuestApplicantNumChangedForModeratorChannel.class)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        LJ(iIntValue);
    }
}
