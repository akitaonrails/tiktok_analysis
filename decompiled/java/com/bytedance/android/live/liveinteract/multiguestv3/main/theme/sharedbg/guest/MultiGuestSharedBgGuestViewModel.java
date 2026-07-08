package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest;

import X.C01GW;
import X.C098J;
import X.C1158050gF1;
import X.C1161920gLG;
import X.C11H9;
import X.C1338270kvh;
import X.C1548820qPI;
import X.C1770850wBP;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C443120HZe;
import X.C452501pT;
import X.C463380IFc;
import X.C500260Jjc;
import X.C762030Tur;
import X.C766150U3p;
import X.C766270U4b;
import X.C766720U5u;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917030ZyH;
import X.C917040ZyI;
import X.C921710a5p;
import X.C930540aK4;
import X.C935650aSJ;
import X.C936270aTJ;
import X.C938970aXf;
import X.C938990aXh;
import X.C939020aXk;
import X.C939210aY3;
import X.C940770aaZ;
import X.C945350ahx;
import X.EnumC1156220gC4;
import X.EnumC485960J3y;
import X.InterfaceC0148002o;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC760840Tsw;
import X.InterfaceC938950aXd;
import X.InterfaceC958970b3v;
import X.InterfaceC964770bDH;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.monitor.MultiGuestMonitorExternalEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.MultiGuestSharedBgServerFetchSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.room.SharedBgCacheChannel;
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
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.MultiGuestLayoutMonitorSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperAudienceSideSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSharebgFlickOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSharedBgFlickConfigSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS13S1210000_15;
import kotlin.jvm.internal.AwS155S1200000_15;
import kotlin.jvm.internal.AwS30S0010000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class MultiGuestSharedBgGuestViewModel extends AssemViewModel<C935650aSJ> implements InterfaceC938950aXd {
    public static long LLJILJIL;
    public static C098J<String, C935650aSJ> LLJILJILJ;
    public static int LLJILLL;
    public static volatile C938970aXf LLJJ;
    public DataChannel LL;
    public MultiGuestThemeViewModel LLILLJJLI;
    public long LLILLL;
    public volatile String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public C945350ahx LLIZ;
    public boolean LLIZLLLIL;
    public final C921710a5p LLJ = new InterfaceC964770bDH() { // from class: X.0a5p
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
        public final void LJJLL(int i, int i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkerModeChanged oldLinkerMode=");
            sbLIZ.append(i);
            sbLIZ.append(", newLinkerMode=");
            sbLIZ.append(i2);
            C919310a1x.LIZLLL("MultiGuestSharedBgGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.FQ2("onLinkerModeChanged");
        }
    };
    public final C917040ZyI LLJI = new InterfaceC958970b3v() { // from class: X.0ZyI
        @Override // X.InterfaceC958970b3v
        public final void LIZJ(int i, List list) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJIJL(C2180891AWx c2180891AWx) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJJI() {
        }

        @Override // X.InterfaceC958970b3v
        public final boolean LJJJIL() {
            return true;
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIIIL(Map map) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJJJ() {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLLL(List list, boolean z) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLJ(LinkUser linkUser) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            C915980Zwa.LJIIIIZZ();
            if (!C921180a4y.LJII()) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guest onLayoutSwitch, layout=");
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            sbLIZ.append(C927600aFK.LJII());
            C919310a1x.LIZLLL("MultiGuestSharedBgGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.FQ2("onLayoutSwitch");
        }
    };
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 361));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C935650aSJ(false, null, "", null);
    }

    public static String wQ2() {
        User owner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        Long lValueOf = null;
        sbLIZ.append(roomLJIIIZ != null ? Long.valueOf(roomLJIIIZ.getId()) : null);
        sbLIZ.append('_');
        Room roomLJIIIZ2 = C930540aK4.LJIIIZ();
        if (roomLJIIIZ2 != null && (owner = roomLJIIIZ2.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        }
        sbLIZ.append(lValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void BQ2(String str) {
        if (!C936270aTJ.LIZJ(false)) {
            str = "";
        }
        AQ2(str, "state_changed", true);
    }

    public final void FQ2(String str) {
        boolean zXQ2 = xQ2(!TextUtils.isEmpty(getState().LLILLJJLI));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSharedBgUI source=");
        sbLIZ.append(str);
        sbLIZ.append(" enable=");
        sbLIZ.append(zXQ2);
        C20441214yg.LIZIZ("MultiGuestSharedBgGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS30S0010000_15(zXQ2, 1));
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        yQ2("onDestroy");
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LL = null;
        this.LLILLJJLI = null;
        onCleared();
        this.LLILLL = 0L;
        this.LLILZ = "";
        C915980Zwa.LJIIIIZZ().a9(this.LLJ);
        C915980Zwa.LJIIIIZZ().vq0(this.LLJI);
        C940770aaZ.LIZ().LJJ((C917030ZyH) this.LLJIJIL.getValue());
        this.LLILZIL = null;
        C945350ahx c945350ahx = this.LLIZ;
        if (c945350ahx != null) {
            C1548820qPI.LJIIIIZZ("multi_guest_banner_ready", c945350ahx.LJIIJ);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C786410Ut5.LJLIIL(10000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0aXm
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiGuestSharedBgGuestViewModel@7a2d.delayClearCache$1");
                try {
                    if (MultiGuestSharedBgGuestViewModel.LLJILLL > 0 || jCurrentTimeMillis < MultiGuestSharedBgGuestViewModel.LLJILJIL) {
                        this.yQ2("delayClearCache, ignore for new cache, wait to clear next time.");
                    } else {
                        this.yQ2("delayClearCache, clear cache");
                        C098J<String, C935650aSJ> c098j = MultiGuestSharedBgGuestViewModel.LLJILJILJ;
                        if (c098j != null) {
                            c098j.LIZIZ();
                        }
                        MultiGuestSharedBgGuestViewModel.LLJILJILJ = null;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiGuestSharedBgGuestViewModel@7a2d.delayClearCache$1");
            }
        });
        C938970aXf c938970aXf = LLJJ;
        if (c938970aXf != null) {
            long j = c938970aXf.LIZ;
            if (j <= 0) {
                j = 3600000;
            }
            if (System.currentTimeMillis() - c938970aXf.LIZJ > j) {
                c938970aXf.LIZIZ = false;
                c938970aXf.LIZLLL = false;
                c938970aXf.LJ = 0L;
                c938970aXf.LJFF(null);
                c938970aXf.LJI.clear();
                C938970aXf.LJIIIIZZ.LIZIZ();
                LLJJ = null;
            }
        }
        LLJILLL--;
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        Long lValueOf;
        DataChannel dataChannel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate room_id = ");
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2));
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        yQ2(C2188811AlT.LIZIZ(sbLIZ));
        if (LLJJ == null && C463380IFc.LIZ()) {
            LLJJ = new C938970aXf();
        }
        C938970aXf c938970aXf = LLJJ;
        if (c938970aXf != null) {
            c938970aXf.LJI();
            if (!((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
                C20441214yg.LIZIZ("GuestSharedBgLoadHelper", "ve plugin missing");
                if (C939210aY3.LIZJ()) {
                    C766270U4b.LJIIJJI("ve plugin missing");
                }
            } else if (!c938970aXf.LIZIZ) {
                c938970aXf.LIZIZ = true;
                if (!c938970aXf.LIZLLL || System.currentTimeMillis() - c938970aXf.LJ >= 60000) {
                    c938970aXf.LIZLLL = true;
                    c938970aXf.LJ = System.currentTimeMillis();
                    if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider() != null) {
                        C766720U5u.LJI((C939020aXk) c938970aXf.LJII.getValue(), false);
                    }
                }
            }
        }
        AssemViewModel.subscribeInternal$default(this, null, null, null, new AwS381S0200000_15(this, interfaceC665370Q7z, 51), 7, null);
        if (MultiGuestSharebgFlickOptSetting.INSTANCE.isEnable() && MultiGuestSharedBgFlickConfigSetting.INSTANCE.getValue().optRoomEnter && (dataChannel = this.LL) != null) {
            dataChannel.CQ2(RoomChannel.class, this, new AwS594S0100000_15(this, 433));
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(PIPModeChangeEvent.class, this, new AwS381S0200000_15(this, interfaceC665370Q7z, 52));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJ);
        C915980Zwa.LJIIIIZZ().VE2(this.LLJI);
        C940770aaZ.LIZ().LJIIZILJ((C917030ZyH) this.LLJIJIL.getValue());
        LLJILLL++;
    }

    public final void vQ2(ILinkStateAbility iLinkStateAbility) {
        if (MultiGuestAigcWallpaperAudienceSideSetting.INSTANCE.isEnable()) {
            iLinkStateAbility.cx0(new C2217381BqS() { // from class: X.0aSF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C490701vd) obj).LLILZLL;
                }
            }, null, new AwS381S0200000_15(this, iLinkStateAbility, 49));
            iLinkStateAbility.cx0(new C2217381BqS() { // from class: X.0aSG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C490701vd) obj).LLILZIL;
                }
            }, null, new AwS381S0200000_15(this, iLinkStateAbility, 50));
        } else {
            iLinkStateAbility.cx0(new C2217381BqS() { // from class: X.0aSH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C490701vd) obj).LLILZIL;
                }
            }, null, new AwS594S0100000_15(this, 432));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean xQ2(boolean r5) {
        /*
            r4 = this;
            X.0aM6 r0 = X.C931800aM6.LIZ
            r0.getClass()
            boolean r0 = X.C931800aM6.LIZIZ()
            java.lang.String r3 = "MultiGuestSharedBgGuestViewModel"
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = X.C917810ZzX.LJIIIIZZ()
            if (r0 == 0) goto L1a
            java.lang.String r0 = "isSharedBgEnable return false, for co-host scene"
            X.C919310a1x.LIZLLL(r3, r0)
            return r2
        L1a:
            if (r5 == 0) goto L34
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.MultiGuestSharedBgOptForAudienceSideSetting r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.MultiGuestSharedBgOptForAudienceSideSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L2d
            X.C915980Zwa.LJIIIIZZ()
            boolean r0 = X.C921180a4y.LJII()
            if (r0 == 0) goto L33
        L2d:
            boolean r0 = X.C936270aTJ.LIZLLL()
            if (r0 == 0) goto L34
        L33:
            r2 = 1
        L34:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isSharedBgEnable "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " stickyId:"
            r1.append(r0)
            X.002o r0 = r4.getState()
            X.0aSJ r0 = (X.C935650aSJ) r0
            java.lang.String r0 = r0.LLILLJJLI
            r1.append(r0)
            java.lang.String r0 = " layoutType:"
            r1.append(r0)
            X.01GW<X.0aFK> r0 = X.C927600aFK.LIZIZ
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            X.0a1P r0 = X.C927600aFK.LJII()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel.xQ2(boolean):boolean");
    }

    public final void yQ2(String str) {
        Object objValueOf;
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestSharedBgGuestViewModel-");
        sbLIZ.append(System.identityHashCode(this));
        sbLIZ.append(" room_id = ");
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            objValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
        } else {
            objValueOf = "null";
        }
        sbLIZ.append(objValueOf);
        sbLIZ.append(" msg = ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("shared_bg", strLIZIZ, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(com.bytedance.android.livesdk.sei.SeiAppData r22, com.bytedance.ies.sdk.datachannel.DataChannel r23) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel.CQ2(com.bytedance.android.livesdk.sei.SeiAppData, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public final void DQ2(String str, C935650aSJ c935650aSJ) {
        String string;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zW(SharedBgCacheChannel.class, new C443120HZe(c935650aSJ.LLILLJJLI, c935650aSJ.LLILLL, c935650aSJ.LLILZ));
        }
        if (LLJILJILJ == null) {
            LLJILJILJ = new C098J<>(3);
        }
        C098J<String, C935650aSJ> c098j = LLJILJILJ;
        if (c098j != null) {
            c098j.put(str, c935650aSJ);
        }
        LLJILJIL = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add cache ");
        sbLIZ.append(str);
        sbLIZ.append(", current lru cache =");
        C098J<String, C935650aSJ> c098j2 = LLJILJILJ;
        if (c098j2 != null) {
            string = c098j2.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        yQ2(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void zQ2(String str, EnumC1156220gC4 enumC1156220gC4) {
        DataChannel dataChannel;
        String str2 = str;
        if (MultiGuestLayoutMonitorSwitchSetting.INSTANCE.isSwitch() && (dataChannel = this.LL) != null) {
            String strWQ2 = wQ2();
            EnumC485960J3y enumC485960J3y = EnumC485960J3y.SHARED_BG_FETCH;
            if (str2 == null) {
                str2 = "";
            }
            dataChannel.LC0(MultiGuestMonitorExternalEvent.class, new C1158050gF1(strWQ2, enumC485960J3y, enumC1156220gC4, 0, str2, 44));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Tsw, X.0aXh] */
    public final void AQ2(final String str, String str2, final boolean z) {
        boolean z2;
        LiveEffect liveEffectLIZJ;
        C443120HZe c443120HZe;
        C935650aSJ c935650aSJ;
        DataChannel dataChannel;
        if (Intrinsics.LJFF(getState().LLILLJJLI, str)) {
            return;
        }
        String str3 = getState().LLILLJJLI;
        boolean zXQ2 = true;
        if ((str3 == null || str3.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onApplySharedBg, sharedBgStickerId = ");
        sbLIZ.append(str);
        sbLIZ.append(", source = ");
        sbLIZ.append(str2);
        sbLIZ.append(" settingEnable = ");
        sbLIZ.append(C936270aTJ.LIZJ(false));
        yQ2(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            yQ2("onApplySharedBg, clear shared bg");
            setStateImmediate(AFwS250S0000000_15.get$arr$(141));
            this.LLILZ = null;
            C938970aXf c938970aXf = LLJJ;
            if (c938970aXf != null) {
                c938970aXf.LIZLLL(null, false);
            }
            if (MultiGuestLayoutMonitorSwitchSetting.INSTANCE.isSwitch() && (dataChannel = this.LL) != null) {
                dataChannel.LC0(MultiGuestMonitorExternalEvent.class, new C1158050gF1(wQ2(), EnumC485960J3y.SHARED_BG_STICKER, null, 0, null, 124));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LLILZ, str)) {
            yQ2("onApplySharedBg, ignore duplicate loading");
            return;
        }
        C938970aXf c938970aXf2 = LLJJ;
        if (c938970aXf2 != null) {
            if (z) {
                zXQ2 = xQ2(true);
            }
            c938970aXf2.LIZLLL(str, zXQ2);
        }
        C098J<String, C935650aSJ> c098j = LLJILJILJ;
        if (c098j == null || (c935650aSJ = c098j.get(str)) == null) {
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null && (c443120HZe = (C443120HZe) dataChannel2.gg0(SharedBgCacheChannel.class)) != null && TextUtils.equals(str, (CharSequence) c443120HZe.getFirst())) {
                c935650aSJ = new C935650aSJ(false, (String) c443120HZe.getFirst(), (String) c443120HZe.getSecond(), (String) c443120HZe.getThird());
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onApplySharedBg, ");
                sbLIZ2.append(str);
                sbLIZ2.append(" without cache");
                yQ2(C2188811AlT.LIZIZ(sbLIZ2));
                this.LLILZ = str;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onApplySharedBg, fetchSingleEffect ");
                sbLIZ3.append(str);
                yQ2(C2188811AlT.LIZIZ(sbLIZ3));
                boolean zLIZ = C463380IFc.LIZ();
                ?? r2 = new InterfaceC760840Tsw() { // from class: X.0aXh
                    @Override // X.InterfaceC760840Tsw
                    public final void onFail() {
                        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = this.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("onApplySharedBg, fetchSingleEffect ");
                        sbLIZ4.append(str);
                        sbLIZ4.append(" fail");
                        multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ4));
                        if (Intrinsics.LJFF(this.LIZ.LLILZ, str)) {
                            this.LIZ.yQ2("onApplySharedBg, sharedBgStickerId = null imageFilePath = null");
                            this.LIZ.setState(AFwS250S0000000_15.get$arr$(68));
                            this.LIZ.LLILZ = null;
                        }
                    }

                    @Override // X.InterfaceC760840Tsw
                    public final void LIZ(final LiveEffect liveEffect) {
                        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = this.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("onApplySharedBg, fetchSingleEffect ");
                        sbLIZ4.append(str);
                        sbLIZ4.append(" success");
                        multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ4));
                        if (liveEffect == null) {
                            this.LIZ.yQ2("onApplySharedBg, fetchSingleEffect, has not match effect");
                            if (Intrinsics.LJFF(this.LIZ.LLILZ, str)) {
                                this.LIZ.yQ2("onApplySharedBg, sharedBgStickerId = null imageFilePath = null");
                                this.LIZ.setState(AFwS250S0000000_15.get$arr$(69));
                                this.LIZ.LLILZ = null;
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(liveEffect.LJJ())) {
                            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel2 = this.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("onApplySharedBg, fetchSingleEffect, use cache image success, shareImagePath = ");
                            sbLIZ5.append(liveEffect.LJJ());
                            multiGuestSharedBgGuestViewModel2.yQ2(C2188811AlT.LIZIZ(sbLIZ5));
                            if (!Intrinsics.LJFF(str, this.LIZ.LLILZ)) {
                                return;
                            }
                            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel3 = this.LIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("onApplySharedBg, ");
                            sbLIZ6.append(str);
                            sbLIZ6.append(' ');
                            sbLIZ6.append(liveEffect.LJJ());
                            multiGuestSharedBgGuestViewModel3.yQ2(C2188811AlT.LIZIZ(sbLIZ6));
                            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel4 = this.LIZ;
                            multiGuestSharedBgGuestViewModel4.setState(new AwS13S1210000_15(multiGuestSharedBgGuestViewModel4, liveEffect, str, z, 0));
                            this.LIZ.LLILZ = null;
                            return;
                        }
                        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel5 = this.LIZ;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("onApplySharedBg, download image ");
                        sbLIZ7.append(str);
                        sbLIZ7.append(' ');
                        sbLIZ7.append(liveEffect.LLJLLIL());
                        multiGuestSharedBgGuestViewModel5.yQ2(C2188811AlT.LIZIZ(sbLIZ7));
                        String strLJJLIIIJLLLLLLLZ = liveEffect.LJJLIIIJLLLLLLLZ();
                        String strLLJLLIL = liveEffect.LLJLLIL();
                        final MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel6 = this.LIZ;
                        final String str4 = str;
                        final boolean z3 = z;
                        C936270aTJ.LIZIZ(strLJJLIIIJLLLLLLLZ, strLLJLLIL, new Function1<C0U3O, Unit>() { // from class: X.0aXl
                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(C0U3O c0u3o) {
                                C0U3O c0u3o2 = c0u3o;
                                c0u3o2.LIZLLL(new AwS129S1100000_15(multiGuestSharedBgGuestViewModel6, str4, 2));
                                c0u3o2.LJFF(new AwS13S1210000_15(multiGuestSharedBgGuestViewModel6, liveEffect, str4, z3, 1));
                                c0u3o2.LIZJ(AFwS250S0000000_15.get$arr$(70));
                                c0u3o2.LIZIZ(new AwS155S1200000_15(multiGuestSharedBgGuestViewModel6, str4, liveEffect, 0));
                                return Unit.LIZ;
                            }
                        });
                    }
                };
                if (!((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("onApplySharedBg, ve plugin missing, fallback to server fetch ");
                    sbLIZ4.append(str);
                    yQ2(C2188811AlT.LIZIZ(sbLIZ4));
                    if (!MultiGuestSharedBgServerFetchSetting.INSTANCE.isEnable()) {
                        r2.onFail();
                        return;
                    }
                    C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS559S0100000_15((C938990aXh) r2, 1100));
                    if (!((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
                        C01GW c01gw = C762030Tur.LIZ;
                        C762030Tur.LIZLLL(ViewModelKt.getViewModelScope(this), "livebackground", str, (C766150U3p) c01gwLIZIZ.getValue());
                    } else {
                        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
                        C766720U5u.LJIILIIL(str, C463380IFc.LIZ(), r2);
                    }
                    zQ2(str, EnumC1156220gC4.DISK);
                    return;
                }
                C938970aXf c938970aXf3 = LLJJ;
                if (c938970aXf3 != null && (liveEffectLIZJ = c938970aXf3.LIZJ(str)) != null) {
                    zQ2(str, EnumC1156220gC4.MEMORY);
                    r2.LIZ(liveEffectLIZJ);
                    return;
                } else {
                    ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
                    C766720U5u.LJIILIIL(str, zLIZ, r2);
                    zQ2(str, EnumC1156220gC4.DISK);
                    return;
                }
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("onApplySharedBg, use ");
        sbLIZ5.append(str);
        sbLIZ5.append(" quickly with cache");
        yQ2(C2188811AlT.LIZIZ(sbLIZ5));
        setStateImmediate(new AwS13S1210000_15(z, this, str, c935650aSJ, 3));
    }

    public final <A> void EQ2(InterfaceC2217241BqE<C935650aSJ, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, LifecycleOwner lifecycleOwner, Function1<? super A, Unit> function1) {
        C1770850wBP<C11H9<A>> c1770850wBP2 = c1770850wBP;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select state Subscribe [");
        sbLIZ.append(interfaceC2217241BqE);
        sbLIZ.append("] ");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        if (c1770850wBP2 == null) {
            c1770850wBP2 = new C1770850wBP<>();
            c1770850wBP2.LIZ(true);
        }
        AssemViewModel.selectSubscribe$default(this, interfaceC2217241BqE, c1770850wBP2, lifecycleOwner, null, function1, 8, null);
    }
}
