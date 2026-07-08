package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base;

import X.C01E5;
import X.C01E9;
import X.C01EB;
import X.C01EG;
import X.C01FQ;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C299601Ec;
import X.C421201kQ;
import X.C421601kU;
import X.C421701kV;
import X.C422301kb;
import X.C500260Jjc;
import X.C513601zK;
import X.C5183020f;
import X.C766270U4b;
import X.C785410UrT;
import X.C915980Zwa;
import X.C921990a6H;
import X.C948450amx;
import X.DialogC20518615Qq;
import X.DialogC423101kj;
import X.InterfaceC1097170eep;
import X.InterfaceC302601Fg;
import X.InterfaceC421301kR;
import X.InterfaceC423001ki;
import X.InterfaceC927510aFB;
import X.InterfaceC941870acL;
import X.InterfaceC964770bDH;
import android.view.SurfaceView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
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
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownTimerPlayModeConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.CountdownUser;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseVmWidget<VM extends BaseCountdownViewModel> extends LiveWidget implements InterfaceC941870acL {
    public VM LL;
    public C422301kb LLILLJJLI;
    public DialogC423101kj LLILLL;
    public DialogC20518615Qq LLILZ;
    public final C421601kU LLILZIL = new InterfaceC423001ki(this) { // from class: X.01kU
        public final /* synthetic */ BaseVmWidget<VM> LIZ;

        @Override // X.InterfaceC423001ki
        public final void LIZ() {
            String str;
            InterfaceC421301kR interfaceC421301kRLIZIZ;
            Long lLJIJ;
            C422301kb c422301kb = this.LIZ.LLILLJJLI;
            if (c422301kb == null || (str = c422301kb.LIZIZ) == null || (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) == null || (lLJIJ = interfaceC421301kRLIZIZ.LJIJ(str)) == null) {
                return;
            }
            long jLongValue = lLJIJ.longValue();
            VM vm = this.LIZ.LL;
            if (vm != 0) {
                CountdownEndParams countdownEndParams = new CountdownEndParams();
                countdownEndParams.roomId = vm.yQ2();
                countdownEndParams.channelId = vm.getChannelId();
                countdownEndParams.countdownId = jLongValue;
                countdownEndParams.endReason = 1;
                InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
                if (interfaceC421301kRLIZIZ2 != null) {
                    interfaceC421301kRLIZIZ2.endOneCountdownPlay(countdownEndParams);
                }
            }
            DialogC423101kj dialogC423101kj = this.LIZ.LLILLL;
            if (dialogC423101kj != null) {
                dialogC423101kj.dismiss();
                C785410UrT.LIZ(dialogC423101kj);
            }
        }

        {
            this.LIZ = this;
        }
    };
    public final C513601zK LLILZLL = new C513601zK(this, 1);
    public final C513601zK LLIZ = new C513601zK(this, 2);
    public final C921990a6H LLIZLLLIL = new InterfaceC964770bDH(this) { // from class: X.0a6H
        public final /* synthetic */ BaseVmWidget<VM> LL;

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
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
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

        {
            this.LL = this;
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIZ(String str, long j) {
            this.LL.x1();
            InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
            if (interfaceC421301kRLIZIZ != null) {
                interfaceC421301kRLIZIZ.LJIILJJIL(str);
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            InterfaceC421301kR interfaceC421301kRLIZIZ;
            this.LL.x1();
            String str = kickOutMessage.owner.linkMicId;
            if (str != null && (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) != null) {
                interfaceC421301kRLIZIZ.LJIILJJIL(str);
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            InterfaceC421301kR interfaceC421301kRLIZIZ;
            this.LL.x1();
            String str = leaveMessage.leftUser.linkMicId;
            if (str != null && (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) != null) {
                interfaceC421301kRLIZIZ.LJIILJJIL(str);
            }
        }
    };

    public abstract String A1();

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "count_down_single";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract Class<VM> z1();

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        InterfaceC421301kR interfaceC421301kRLIZIZ;
        List<C01E5> listLJIILLIIL;
        String str;
        C1AZW c1azw = C1AZW.LIZ;
        String strA1 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA1, "on onDestroy", null, null);
        C915980Zwa.LJIIIIZZ().a9(this.LLIZLLLIL);
        if (this.LL != null && (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) != null && (listLJIILLIIL = interfaceC421301kRLIZIZ.LJIILLIIL()) != null) {
            Iterator<C01E5> it2 = listLJIILLIIL.iterator();
            while (it2.hasNext()) {
                CountdownUser countdownUser = it2.next().LIZ.countdownUser;
                if (countdownUser != null && (str = countdownUser.linkmicId) != null) {
                    this.dataChannel.LC0(RemoveCountDownPlayMaskEvent.class, new C421201kQ(str));
                }
            }
        }
        VM vm = this.LL;
        if (vm != null) {
            vm.vQ2("on onDestroy");
        }
        super.onDestroy();
    }

    public final void x1() {
        if (this.LLILZ == null && this.LLILLL == null) {
            return;
        }
        C766270U4b.LIZLLL(2131843232);
        DialogC20518615Qq dialogC20518615Qq = this.LLILZ;
        if (dialogC20518615Qq != null) {
            dialogC20518615Qq.dismiss();
            C785410UrT.LIZ(dialogC20518615Qq);
        }
        DialogC423101kj dialogC423101kj = this.LLILLL;
        if (dialogC423101kj != null) {
            dialogC423101kj.dismiss();
            C785410UrT.LIZ(dialogC423101kj);
        }
    }

    @Override // X.InterfaceC941870acL
    public final void end() {
        InterfaceC421301kR interfaceC421301kRLIZIZ;
        C20441214yg.LIZIZ(A1(), "ILinkMicAbility#end");
        VM vm = this.LL;
        if (vm == null || (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) == null) {
            return;
        }
        interfaceC421301kRLIZIZ.LJIIJ(vm.yQ2(), vm.getChannelId());
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        return (interfaceC421301kRLIZIZ != null ? interfaceC421301kRLIZIZ.LJIIIZ() : null) == C01EB.ONGOING;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Fragment fragment;
        super.onCreate();
        C1AZW c1azw = C1AZW.LIZ;
        String strA1 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA1, "on Create", null, null);
        String strA12 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA12, "initViewModel", null, null);
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            if (fragment.isAdded() && !fragment.isRemoving() && !fragment.isDetached() && fragment.getView() != null) {
                this.LL = (VM) ViewModelProviders.of(fragment).get(z1());
            }
            VM vm = this.LL;
            if (vm != null) {
                DataChannel dataChannel = this.dataChannel;
                C1AZW.LJIIJ(12, vm.getTag(), "addCountdownStateChangeListener", null, null);
                vm.LL = dataChannel;
                InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
                if (interfaceC421301kRLIZIZ != null) {
                    interfaceC421301kRLIZIZ.LJIL(vm.LLIZ);
                }
                InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                if (interfaceC302601FgLIZ != null) {
                    interfaceC302601FgLIZ.LJFF(vm.LLILZLL);
                }
            }
        }
        VM vm2 = this.LL;
        if (vm2 != null) {
            vm2.LLILZ.observe(this, this.LLILZLL);
            vm2.LLILZIL.observe(this, this.LLIZ);
        }
        this.dataChannel.BQ2(this, CountdownIconOnClickEvent.class, new C5183020f((BaseVmWidget) this, (BaseVmWidget<BaseCountdownViewModel>) 191));
        C915980Zwa.LJIIIIZZ().Fe(this.LLIZLLLIL);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C1AZW c1azw = C1AZW.LIZ;
        String strA1 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA1, "on pause", null, null);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C1AZW c1azw = C1AZW.LIZ;
        String strA1 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA1, "on resume", null, null);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C1AZW c1azw = C1AZW.LIZ;
        String strA1 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA1, "on stop", null, null);
    }

    public void B1(C299601Ec c299601Ec) {
        C1AZW c1azw = C1AZW.LIZ;
        String strA1 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA1, "widget call onStateIdle", null, null);
        DialogC423101kj dialogC423101kj = this.LLILLL;
        if (dialogC423101kj != null) {
            dialogC423101kj.dismiss();
            C785410UrT.LIZ(dialogC423101kj);
        }
        this.dataChannel.LC0(RemoveCountDownPlayMaskEvent.class, new C421201kQ(c299601Ec.LIZJ));
    }

    public void C1(C299601Ec c299601Ec) {
        Long lWQ2;
        C1AZW c1azw = C1AZW.LIZ;
        String strA1 = A1();
        c1azw.getClass();
        C1AZW.LIZ(strA1, "call onStateOnGoing", null, null);
        if (this.LLILZ != null) {
            C766270U4b.LIZLLL(2131843234);
            DialogC20518615Qq dialogC20518615Qq = this.LLILZ;
            if (dialogC20518615Qq != null) {
                dialogC20518615Qq.dismiss();
                C785410UrT.LIZ(dialogC20518615Qq);
            }
            this.LLILZ = null;
        }
        if (this.LL != null && (lWQ2 = BaseCountdownViewModel.wQ2(c299601Ec.LIZJ)) != null) {
            long jLongValue = lWQ2.longValue();
            String strA12 = A1();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStateOnGoing, remainTime = ");
            sbLIZ.append(jLongValue);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ(strA12, strLIZIZ, null, null);
            if (jLongValue > 0) {
                long j = c299601Ec.LJII;
                if (j > 0) {
                    this.dataChannel.LC0(CountdownFanTicketEvent.class, new C01E9(c299601Ec.LIZ, c299601Ec.LIZIZ, j, c299601Ec.LJI, c299601Ec.LJIIIIZZ, c299601Ec.LIZJ));
                }
            }
        }
    }

    public final void y1(C299601Ec c299601Ec) {
        InterfaceC927510aFB interfaceC927510aFB;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
        if (objLJIIIZ instanceof InterfaceC927510aFB) {
            interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ;
        } else {
            interfaceC927510aFB = null;
        }
        long jEnlargeImBackupDelayTime = LinkmicCountDownTimerPlayModeConfig.INSTANCE.enlargeImBackupDelayTime();
        if (jEnlargeImBackupDelayTime > 0) {
            C500260Jjc.LJJLIIIJJI(jEnlargeImBackupDelayTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT), new C421701kV(interfaceC927510aFB, c299601Ec, this));
        }
    }
}
