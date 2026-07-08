package X;

import Y.AAListenerS138S0300000_15;
import Y.AAListenerS265S0200000_13;
import Y.AAListenerS267S0200000_15;
import Y.ARunnableS115S0100000_15;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.MultiGuestStatusEvent;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.linkroom.toolbarbehavior.ToolbarMultiGuestManageBehavior;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.live.setting.LiveToolbarLoadOptimizeSetting;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0ard, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951350ard {
    public static boolean LJI;
    public final DataChannel LIZ;
    public final InterfaceC924460aAG LIZIZ;
    public final LifecycleOwner LIZJ;
    public final Room LIZLLL;
    public final List<ObjectAnimator> LJ = new ArrayList();
    public final C951360are LJFF = new InterfaceC964770bDH() { // from class: X.0are
        @Override // X.InterfaceC964770bDH
        public final void LIZ(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJFF(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJJI(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIZILJ(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIJJLI(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJ(Map<String, String> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJI(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIFFI(int i, int i2, int i3) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIIZI(String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIJIIJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIZ(String str, long j) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJ(String str, float f, float f2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJL(int i, C965030bDh c965030bDh) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJZI(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLL(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJZ(int i, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJLIIIJJIZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJLJLI() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIL() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLL(int i, int i2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJZZI(C965210bDz c965210bDz) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
            return null;
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIILZL() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIL(List<LinkUser> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LLJI(String str, boolean z, boolean z2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            Interpolator interpolatorLIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GameLinkStateChangedChannel state=");
            sbLIZ.append(i);
            C20441214yg.LJIIIZ("GameLinkToolbar", C2188811AlT.LIZIZ(sbLIZ));
            if (i == 5) {
                InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LL.LIZ);
                if (interfaceC1088880eRSMn1 != null) {
                    interfaceC1088880eRSMn1.LJI(this.LL.LIZ, EnumC951410arj.MULTI_GUEST);
                }
                C951350ard.LJI = true;
                C951350ard c951350ard = this.LL;
                c951350ard.getClass();
                if (C0UIM.LIZJ()) {
                    EnumC1102740eno enumC1102740eno = EnumC1102740eno.VOTE;
                    if (enumC1102740eno.isShowing(c951350ard.LIZ) || enumC1102740eno.isShowingInInteractionDialog(c951350ard.LIZ)) {
                        ARunnableS115S0100000_15 aRunnableS115S0100000_15 = new ARunnableS115S0100000_15(c951350ard, 4);
                        if (LiveToolbarLoadOptimizeSetting.INSTANCE.enableAnimationOptimize(c951350ard.LIZ)) {
                            aRunnableS115S0100000_15.run();
                        } else {
                            View view = enumC1102740eno.getView(c951350ard.LIZ);
                            if (view != null) {
                                List<ObjectAnimator> list = c951350ard.LJ;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                                if (C951350ard.LJI) {
                                    interpolatorLIZIZ = C0GY9.LIZIZ(0.0f, 0.0f, 0.58f, 1.0f);
                                } else {
                                    interpolatorLIZIZ = C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f);
                                }
                                objectAnimatorOfFloat.setInterpolator(interpolatorLIZIZ);
                                objectAnimatorOfFloat.setDuration(250L);
                                objectAnimatorOfFloat.addListener(new AAListenerS265S0200000_13(view, aRunnableS115S0100000_15, 0));
                                C786410Ut5.Pd(objectAnimatorOfFloat);
                                ((ArrayList) list).add(objectAnimatorOfFloat);
                            }
                        }
                    }
                } else {
                    EnumC1102750enp enumC1102750enp = EnumC1102750enp.CUSTOM_POLL;
                    if (enumC1102750enp.isShowing(c951350ard.LIZ) || enumC1102750enp.isShowingInInteractionDialog(c951350ard.LIZ)) {
                        c951350ard.LIZIZ(EnumC1102750enp.CUSTOM_POLL, new ARunnableS115S0100000_15(c951350ard, 5));
                    }
                }
                C951350ard c951350ard2 = this.LL;
                c951350ard2.LIZIZ(EnumC1102750enp.MULTIGUEST, new ARunnableS115S0100000_15(c951350ard2, 6));
                C951350ard c951350ard3 = this.LL;
                EnumC1102750enp enumC1102750enp2 = EnumC1102750enp.MULTI_GUEST_MIC;
                final LifecycleOwner lifecycleOwner = this.LL.LIZJ;
                enumC1102750enp2.load(c951350ard3.LIZ, new InterfaceViewOnClickListenerC1102800enu(lifecycleOwner) { // from class: X.0aMu
                    public final LifecycleOwner LL;
                    public DataChannel LLILLJJLI;

                    @Override // X.InterfaceViewOnClickListenerC1102800enu
                    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
                    }

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
                    public final /* synthetic */ boolean x0(View view2) {
                        return false;
                    }

                    {
                        this.LL = lifecycleOwner;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (C924250a9v.LIZ().LJJJLL != 1 && C924250a9v.LIZ().LJJJLL != 0 && C924250a9v.LIZ().LJJJLL != -1) {
                            C924650aAZ.LIZ.LJIIIZ(C924250a9v.LIZ().LJJJLIIL, C924250a9v.LIZ().LJL, "button_icon", !C924250a9v.LIZ().LJIIIZ);
                            C924250a9v.LIZ().LJIIIZ = true ^ C924250a9v.LIZ().LJIIIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onClick isAudioEnable = ");
                            sbLIZ2.append(C924250a9v.LIZ().LJIIIZ);
                            C20441214yg.LJIIIZ("ToolbarGameLinkMicBehavior", C2188811AlT.LIZIZ(sbLIZ2));
                            DataChannel dataChannel = this.LLILLJJLI;
                            if (dataChannel != null) {
                                dataChannel.LC0(GameLinkGuestMuteAudioEvent.class, new C922430a6z(C924250a9v.LIZ().LJIIIZ, "business_mute_click_toolbar"));
                                return;
                            }
                            return;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onClick permission error = ");
                        sbLIZ3.append(C924250a9v.LIZ().LJJJLL);
                        C20441214yg.LJIIIZ("ToolbarGameLinkMicBehavior", C2188811AlT.LIZIZ(sbLIZ3));
                    }

                    @Override // X.InterfaceViewOnClickListenerC1102800enu
                    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
                        this.LLILLJJLI = dataChannel;
                        if (dataChannel != null) {
                            dataChannel.EQ2(this.LL, GameLinkGuestMuteAudioEvent.class, new AwS594S0100000_15(interfaceC1103130eoR, 639));
                            dataChannel.EQ2(this.LL, MultiGuestAudioVolumeEvent.class, new AwS594S0100000_15(interfaceC1103130eoR, 640));
                        }
                        C1103220eoa c1103220eoa = (C1103220eoa) interfaceC1103130eoR.findViewById(R.id.oat);
                        if (c1103220eoa != null) {
                            c1103220eoa.setAudioEnabled(C924250a9v.LIZ().LJIIIZ);
                        }
                    }
                });
                enumC1102750enp2.hide(c951350ard3.LIZ);
                c951350ard3.LIZ(enumC1102750enp2);
                C951350ard c951350ard4 = this.LL;
                EnumC1102750enp enumC1102750enp3 = EnumC1102750enp.MULTI_GUEST_MANAGE;
                enumC1102750enp3.load(c951350ard4.LIZ, new ToolbarMultiGuestManageBehavior(true));
                enumC1102750enp3.hide(c951350ard4.LIZ);
                c951350ard4.LIZ(enumC1102750enp3);
                this.LL.LIZ.LC0(MultiGuestStatusEvent.class, Boolean.TRUE);
                return;
            }
            if (!C951350ard.LJI) {
                return;
            }
            InterfaceC1088880eRS interfaceC1088880eRSMn12 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LL.LIZ);
            if (interfaceC1088880eRSMn12 != null) {
                interfaceC1088880eRSMn12.LJI(this.LL.LIZ, EnumC951410arj.NORMAL);
            }
            this.LL.LIZJ();
        }
    };

    public final void LIZJ() {
        C1086960eOM c1086960eOMLI;
        LJI = false;
        LIZIZ(EnumC1102750enp.MULTI_GUEST_MIC, new ARunnableS115S0100000_15(this, 2));
        LIZIZ(EnumC1102750enp.MULTI_GUEST_MANAGE, new ARunnableS115S0100000_15(this, 3));
        LIZ(EnumC1102750enp.MULTIGUEST);
        if (!C0UIM.LIZJ() && this.LIZLLL != null && (c1086960eOMLI = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).lI()) != null && c1086960eOMLI.LIZIZ(this.LIZLLL.getId())) {
            EnumC1102750enp enumC1102750enp = EnumC1102750enp.CUSTOM_POLL;
            if (!enumC1102750enp.isShowing(this.LIZ) && !enumC1102750enp.isShowingInInteractionDialog(this.LIZ)) {
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).AV0(this.LIZ);
                LIZ(EnumC1102750enp.CUSTOM_POLL);
            }
        }
        this.LIZ.LC0(MultiGuestStatusEvent.class, Boolean.FALSE);
    }

    public final void LIZ(EnumC1102750enp enumC1102750enp) {
        Interpolator interpolatorLIZIZ;
        if (LiveToolbarLoadOptimizeSetting.INSTANCE.enableAnimationOptimize(this.LIZ)) {
            if (enumC1102750enp == EnumC1102750enp.MULTIGUEST) {
                DataChannel dataChannel = this.LIZ;
                if (C925050aBD.LJIIJ()) {
                    C925050aBD.LJII(dataChannel);
                    return;
                } else {
                    C925050aBD.LIZLLL(dataChannel);
                    return;
                }
            }
            enumC1102750enp.show(this.LIZ);
            return;
        }
        View view = enumC1102750enp.getView(this.LIZ);
        if (view != null) {
            List<ObjectAnimator> list = this.LJ;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            if (LJI) {
                interpolatorLIZIZ = C0GY9.LIZIZ(0.0f, 0.0f, 0.58f, 1.0f);
            } else {
                interpolatorLIZIZ = C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f);
            }
            objectAnimatorOfFloat.setInterpolator(interpolatorLIZIZ);
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.addListener(new AAListenerS138S0300000_15(this, enumC1102750enp, view, 0));
            objectAnimatorOfFloat.setStartDelay(100L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            ((ArrayList) list).add(objectAnimatorOfFloat);
        }
    }

    public final void LIZIZ(EnumC1102750enp enumC1102750enp, Runnable runnable) {
        Interpolator interpolatorLIZIZ;
        if (LiveToolbarLoadOptimizeSetting.INSTANCE.enableAnimationOptimize(this.LIZ)) {
            runnable.run();
            return;
        }
        View view = enumC1102750enp.getView(this.LIZ);
        if (view != null) {
            List<ObjectAnimator> list = this.LJ;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            if (LJI) {
                interpolatorLIZIZ = C0GY9.LIZIZ(0.0f, 0.0f, 0.58f, 1.0f);
            } else {
                interpolatorLIZIZ = C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f);
            }
            objectAnimatorOfFloat.setInterpolator(interpolatorLIZIZ);
            objectAnimatorOfFloat.setDuration(250L);
            objectAnimatorOfFloat.addListener(new AAListenerS267S0200000_15(runnable, view, 0));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            ((ArrayList) list).add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0are] */
    public C951350ard(GameLinkV2Widget gameLinkV2Widget, InterfaceC924460aAG interfaceC924460aAG, Room room, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC924460aAG;
        this.LIZJ = gameLinkV2Widget;
        this.LIZLLL = room;
    }
}
