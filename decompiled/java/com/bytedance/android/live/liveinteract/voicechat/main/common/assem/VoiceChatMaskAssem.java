package com.bytedance.android.live.liveinteract.voicechat.main.common.assem;

import X.AbstractC738140SxQ;
import X.AbstractC938650aX9;
import X.C01GW;
import X.C0QSJ;
import X.C11JF;
import X.C13IQ;
import X.C13LE;
import X.C1554890qZ5;
import X.C1555540qa8;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C20441214yg;
import X.C452070Ho5;
import X.C452501pT;
import X.C497740JfY;
import X.C5182020e;
import X.C673150Qan;
import X.C687700QyG;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C737770Swp;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C916840Zxy;
import X.C921180a4y;
import X.C921980a6G;
import X.C924640aAY;
import X.C930540aK4;
import X.C930940aKi;
import X.C933770aPH;
import X.C933980aPc;
import X.C937910aVx;
import X.C938050aWB;
import X.C938080aWE;
import X.C938620aX6;
import X.C938660aXA;
import X.C946500ajo;
import X.C956790b0P;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC937840aVq;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import X.InterfaceC958970b3v;
import X.InterfaceC964770bDH;
import X.ViewOnClickListenerC939670aYn;
import X.ViewOnLayoutChangeListenerC986920bn0;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.ApplyGuideViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
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
import com.bytedance.android.livesdk.dataChannel.TopLiveSkylightTransYChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizeLayoutManagerStreamPlayer;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class VoiceChatMaskAssem extends UISlotAssem implements VoiceChatMaskAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public IApplyGuideAbility LLJJIII;
    public C11JF LLJJIJI;
    public DataChannel LLJJIJIIJIL;
    public C946500ajo LLJJIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C938080aWE.class, null), checkSupervisorPrepared());
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 531));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(153));
    public final C921980a6G LLJJJJ = new InterfaceC964770bDH() { // from class: X.0a6G
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
        public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
            InterfaceC922070a6P interfaceC922070a6P;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InteractAudioVolumeInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().linkMicId);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InteractAudioVolumeInfo> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Boolean.valueOf(it3.next().isTalk()));
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InteractAudioVolumeInfo> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Integer.valueOf(it4.next().volume));
            }
            VoiceChatMaskAssem voiceChatMaskAssem = this.LL;
            voiceChatMaskAssem.getClass();
            if (!arrayList.isEmpty() && !arrayList2.isEmpty() && !arrayList3.isEmpty()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) ListProtector.get(arrayList, i);
                    DataChannel dataChannel = voiceChatMaskAssem.LLJJIJIIJIL;
                    if (dataChannel != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
                        interfaceC922070a6P.LJJIJIIJI(((Number) ListProtector.get(arrayList3, i)).intValue(), str);
                    }
                }
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            ILinkStateAbility iLinkStateAbilityUp = this.LL.up();
            if (iLinkStateAbilityUp != null) {
                iLinkStateAbilityUp.NV0(i);
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            DataChannel dataChannel = this.LL.LLJJIJIIJIL;
            if (dataChannel != null) {
                dataChannel.zW(LinkGuestCountChangeChannel.class, Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
            }
        }
    };
    public final C937910aVx LLJJJJJIL = new InterfaceC958970b3v() { // from class: X.0aVx
        @Override // X.InterfaceC958970b3v
        public final void LJJIJL(C2180891AWx c2180891AWx) {
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
        public final void LJJJI() {
            InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
            List<InterfaceC937840aVq> allLayoutWindows;
            VoiceChatMaskAssem voiceChatMaskAssem = this.LL;
            voiceChatMaskAssem.getClass();
            InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
            if (interfaceC937900aVwLJIIIIZZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null) {
                AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(216);
                AFwS250S0000000_15 aFwS250S0000000_152 = AFwS250S0000000_15.get$arr$(217);
                ArrayList arrayList = new ArrayList();
                for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
                    if (((Boolean) aFwS250S0000000_15.invoke(interfaceC937840aVq)).booleanValue()) {
                        arrayList.add(aFwS250S0000000_152.invoke(interfaceC937840aVq));
                    }
                }
                ArrayList<String> arrayList2 = new ArrayList();
                for (Map.Entry<String, C938660aXA> entry : voiceChatMaskAssem.sp().entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        arrayList2.add(entry.getKey());
                        entry.getValue().LJIIJ();
                        ((LinkedList) voiceChatMaskAssem.LLJJLIIIJLLLLLLLZ.getValue()).add(entry.getValue());
                    }
                }
                DataChannel dataChannel = voiceChatMaskAssem.LLJJIJIIJIL;
                InterfaceC922070a6P interfaceC922070a6P = dataChannel != null ? (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class) : null;
                for (String str : arrayList2) {
                    if (interfaceC922070a6P != null) {
                        interfaceC922070a6P.remove(str);
                    }
                    voiceChatMaskAssem.sp().remove(str);
                    AbstractC938650aX9 abstractC938650aX9Remove = voiceChatMaskAssem.mp().remove(str);
                    if (abstractC938650aX9Remove != null) {
                        abstractC938650aX9Remove.LJIILIIL();
                    }
                }
            }
            this.LL.yp();
        }

        @Override // X.InterfaceC958970b3v
        public final void LIZJ(int i, List list) {
            VoiceChatMaskAssem voiceChatMaskAssem = this.LL;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                voiceChatMaskAssem.tp((InterfaceC937840aVq) it2.next());
            }
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
            Rect containerActualRange;
            VoiceChatMaskAssem voiceChatMaskAssem = this.LL;
            voiceChatMaskAssem.getClass();
            InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
            if (interfaceC937900aVwLJIIIIZZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) != null && (containerActualRange = interfaceC937820aVoLJJJJZ.getContainerActualRange()) != null) {
                C938170aWN c938170aWN = new C938170aWN(voiceChatMaskAssem.getContentView().getHeight() - containerActualRange.bottom);
                DataChannel dataChannel = voiceChatMaskAssem.LLJJIJIIJIL;
                if (dataChannel != null) {
                    dataChannel.zW(VoiceChatLayoutChannel.class, c938170aWN);
                }
            }
        }

        @Override // X.InterfaceC958970b3v
        public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            this.LL.tp(interfaceC937840aVq);
        }
    };
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(154));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(157));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(155));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(156));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LinkMicScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1567676036) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public void yp() {
    }

    public final Map<String, AbstractC938650aX9> mp() {
        return (Map) this.LLJJJJLIIL.getValue();
    }

    public final Map<Integer, C933770aPH> op() {
        return (Map) this.LLJL.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility
    public final void rc() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LinkStatusViewModel.class);
        LinkStatusViewModel linkStatusViewModel = (LinkStatusViewModel) C737770Swp.LIZ(new C5182020e((C13IQ) c19719912DlLIZ, 224), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS559S0100000_15((AbstractC738140SxQ) this, 964), new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this), AFwS250S0000000_15.get$arr$(132), c19719912DlLIZ);
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            linkStatusViewModel.iT0(C1555540qa8.LIZLLL(viewLJJIJL));
        }
    }

    public final Map<String, C938660aXA> sp() {
        return (Map) this.LLJJL.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility
    public final void If() {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        LinkStatusViewModel linkStatusViewModel;
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL == null || (interfaceC665370Q7zLJ = C1555540qa8.LJ(viewLJJIJL)) == null) {
            return;
        }
        InterfaceC494301wD interfaceC494301wDLIZIZ = C1555540qa8.LIZIZ(interfaceC665370Q7zLJ, ILinkStateAbility.class, null);
        if (!(interfaceC494301wDLIZIZ instanceof LinkStatusViewModel) || (linkStatusViewModel = (LinkStatusViewModel) interfaceC494301wDLIZIZ) == null) {
            return;
        }
        linkStatusViewModel.eB1(interfaceC665370Q7zLJ);
    }

    public int lp() {
        return C497740JfY.LIZLLL(R.attr.exe, getContext());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        super.onDestroy();
        if (this.LLJJIJIL != null) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LLILZIL(null, "VoiceChatMaskAssem_onDestroy");
            }
            this.LLJJIJIL = null;
        }
        C915980Zwa.LJIIIIZZ().vq0(this.LLJJJJJIL);
        C915980Zwa.LJIIIIZZ().a9(this.LLJJJJ);
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        Iterator<Map.Entry<String, AbstractC938650aX9>> it2 = mp().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LJIILIIL();
        }
        ((C938050aWB) this.LLJJJIL.getValue()).LIZ.clear();
        C11JF c11jf = this.LLJJIJI;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        C11JF c11jf2 = this.LLJJIJI;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLJJIJI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        List<LinkUser> listLIZLLL;
        ILinkStateAbility iLinkStateAbilityUp;
        super.onResume();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null) {
            return;
        }
        for (LinkUser linkUser : listLIZLLL) {
            Long l = linkUser.userId;
            long jLIZIZ = C933980aPc.LIZIZ();
            if (l != null && l.longValue() == jLIZIZ) {
                if (linkUser == null || (iLinkStateAbilityUp = up()) == null) {
                    return;
                }
                iLinkStateAbilityUp.Ny(1, null);
                return;
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        List<LinkUser> listLIZLLL;
        ILinkStateAbility iLinkStateAbilityUp;
        super.onStop();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null) {
            return;
        }
        for (LinkUser linkUser : listLIZLLL) {
            Long l = linkUser.userId;
            long jLIZIZ = C933980aPc.LIZIZ();
            if (l != null && l.longValue() == jLIZIZ) {
                if (linkUser == null || (iLinkStateAbilityUp = up()) == null) {
                    return;
                }
                iLinkStateAbilityUp.Ny(2, null);
                return;
            }
        }
    }

    public final ILinkStateAbility up() {
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1555540qa8.LJ(LJJIJL());
        if (interfaceC665370Q7zLJ != null) {
            return (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zLJ, ILinkStateAbility.class, null);
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hp(InterfaceC937840aVq interfaceC937840aVq) {
        AbstractC938650aX9 abstractC938650aX9Kp;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        if (mp().containsKey(interfaceC937840aVq.LJ())) {
            C938660aXA c938660aXA = sp().get(interfaceC937840aVq.LJ());
            if (c938660aXA != null) {
                viewGroup = c938660aXA.LLJ;
            } else {
                viewGroup = null;
            }
            if (viewGroup == interfaceC937840aVq.LJJIIJ()) {
                return;
            }
        }
        if (mp().get(interfaceC937840aVq.LJ()) == null && (abstractC938650aX9Kp = kp(interfaceC937840aVq.LJ())) != null) {
            abstractC938650aX9Kp.LJIIL();
            mp().put(abstractC938650aX9Kp.LIZIZ, abstractC938650aX9Kp);
        }
        if (!interfaceC937840aVq.LIZJ()) {
            AbstractC938650aX9 abstractC938650aX9 = mp().get(interfaceC937840aVq.LJ());
            if (abstractC938650aX9 != null) {
                C938660aXA c938660aXA2 = sp().get(interfaceC937840aVq.LJ());
                if (c938660aXA2 != null) {
                    viewGroup2 = c938660aXA2.LLJ;
                }
                if (viewGroup2 != interfaceC937840aVq.LJJIIJ()) {
                    C938660aXA c938660aXA3 = sp().get(abstractC938650aX9.LIZIZ);
                    if (c938660aXA3 == null && (!(!((AbstractCollection) this.LLJJLIIIJLLLLLLLZ.getValue()).isEmpty()) || (c938660aXA3 = (ViewOnClickListenerC939670aYn) ((LinkedList) this.LLJJLIIIJLLLLLLLZ.getValue()).pop()) == null)) {
                        c938660aXA3 = new C938660aXA(getContext(), this);
                    }
                    c938660aXA3.LJIIJ();
                    c938660aXA3.LIZIZ(abstractC938650aX9, interfaceC937840aVq.LJJIIJ());
                    sp().put(abstractC938650aX9.LIZIZ, c938660aXA3);
                    return;
                }
                return;
            }
            return;
        }
        AbstractC938650aX9 abstractC938650aX92 = mp().get(interfaceC937840aVq.LJ());
        if (abstractC938650aX92 == null || ((ViewOnClickListenerC939670aYn) this.LLJJJ.getValue()).LLJ == interfaceC937840aVq.LJJIIJ()) {
            return;
        }
        ((ViewOnClickListenerC939670aYn) this.LLJJJ.getValue()).LJIIJ();
        ((ViewOnClickListenerC939670aYn) this.LLJJJ.getValue()).LIZIZ(abstractC938650aX92, interfaceC937840aVq.LJJIIJ());
    }

    public AbstractC938650aX9 kp(String str) {
        if (str == null) {
            return null;
        }
        return new C938620aX6(this.LLJJIJIIJIL, str);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ApplyGuideViewModel viewModel;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        float fFloatValue;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ;
        super.onViewCreated(view);
        if (!(view instanceof FrameLayout)) {
            return;
        }
        C1554890qZ5 tree = new LinkMicScope(LJJIJL()).getTree();
        if (tree != null && (interfaceC665370Q7zLJIIIIZZ = tree.LJIIIIZZ()) != null) {
            C1555540qa8.LIZ(interfaceC665370Q7zLJIIIIZZ, this, VoiceChatMaskAbility.class, null);
        }
        this.LLJJIJIIJIL = ((C938080aWE) this.LLJJI.getValue()).LL;
        view.setBackgroundColor(lp());
        ((ViewGroup) view).setClipChildren(false);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            Float f = (Float) DataChannelGlobal.LLILZ.gg0(TopLiveSkylightTransYChannel.class);
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            interfaceC937900aVwLLIIJLIL2.LJLILLLLZI(viewGroup, false, false, "voice_chat_room", null, fFloatValue);
        }
        if (LinkmicRtcRatioOptimizeLayoutManagerStreamPlayer.isEnable() && !LinkCoreModelKt.currentUserIsAnchor()) {
            C946500ajo c946500ajo = new C946500ajo(this, null, this.LLJJIJIIJIL, null);
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL2.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LLILZIL(c946500ajo, null);
                this.LLJJIJIL = c946500ajo;
            }
        }
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, MultiGuestV3VideoSizeChannel.class, new AwS594S0100000_15(this, 971));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJJJJ);
        C915980Zwa.LJIIIIZZ().VE2(this.LLJJJJJIL);
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) != null && !LinkCoreModelKt.currentUserIsAnchor()) {
            IApplyGuideAbility iApplyGuideAbility = (IApplyGuideAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IApplyGuideAbility.class, null);
            this.LLJJIII = iApplyGuideAbility;
            if (iApplyGuideAbility != null && (viewModel = iApplyGuideAbility.getViewModel()) != null) {
                ApplyGuideViewModel.yQ2(viewModel, this, new AwS594S0100000_15(this, 546));
            }
        }
    }

    public final void tp(InterfaceC937840aVq interfaceC937840aVq) {
        long followStatus;
        User owner;
        FollowInfo followInfo;
        Object parent;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i = C916840Zxy.LIZ[interfaceC937840aVq.state().ordinal()];
        Integer numValueOf = null;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    op().remove(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()));
                    C20441214yg.LJIIIZ("bindMaskLinked", String.valueOf(interfaceC937840aVq.LJJIIJ().hashCode()));
                    C20441214yg.LJIIIZ("bindMaskLinked", String.valueOf(mp().containsKey(interfaceC937840aVq.LJ())));
                    C938660aXA c938660aXA = sp().get(interfaceC937840aVq.LJ());
                    if (c938660aXA != null && (viewGroup2 = c938660aXA.LLJ) != null) {
                        numValueOf = Integer.valueOf(viewGroup2.hashCode());
                    }
                    C20441214yg.LJIIIZ("bindMaskLinked", String.valueOf(numValueOf));
                    hp(interfaceC937840aVq);
                    AbstractC938650aX9 abstractC938650aX9 = mp().get(interfaceC937840aVq.LJ());
                    if (abstractC938650aX9 != null) {
                        abstractC938650aX9.LJ(true);
                    }
                    C938050aWB c938050aWB = (C938050aWB) this.LLJJJIL.getValue();
                    int iLJIIIIZZ = interfaceC937840aVq.LJIIIIZZ();
                    String strLJ = interfaceC937840aVq.LJ();
                    c938050aWB.getClass();
                    int iLJIIJJI = C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ());
                    if (iLJIIJJI != 0 && iLJIIJJI != 1) {
                        if (Intrinsics.LJFF(strLJ, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
                            c938050aWB.LIZ.remove(Integer.valueOf(iLJIIIIZZ));
                            return;
                        }
                        return;
                    }
                    c938050aWB.LIZ.remove(Integer.valueOf(iLJIIIIZZ));
                    return;
                }
                return;
            }
            op().remove(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()));
            C20441214yg.LJIIIZ("bindMaskJoin", String.valueOf(interfaceC937840aVq.LJJIIJ().hashCode()));
            C20441214yg.LJIIIZ("bindMaskJoin", String.valueOf(mp().containsKey(interfaceC937840aVq.LJ())));
            C938660aXA c938660aXA2 = sp().get(interfaceC937840aVq.LJ());
            if (c938660aXA2 != null && (viewGroup = c938660aXA2.LLJ) != null) {
                numValueOf = Integer.valueOf(viewGroup.hashCode());
            }
            C20441214yg.LJIIIZ("bindMaskJoin", String.valueOf(numValueOf));
            hp(interfaceC937840aVq);
            AbstractC938650aX9 abstractC938650aX92 = mp().get(interfaceC937840aVq.LJ());
            if (abstractC938650aX92 == null) {
                return;
            }
            abstractC938650aX92.LJ(false);
            return;
        }
        C933770aPH c933770aPH = op().get(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()));
        if (c933770aPH != null) {
            FrameLayout frameLayoutLJJIIJ = interfaceC937840aVq.LJJIIJ();
            ViewGroup viewGroup3 = c933770aPH.LLILLL;
            if (viewGroup3 != null) {
                parent = viewGroup3.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof ViewGroup) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (frameLayoutLJJIIJ.indexOfChild(view) != -1) {
                C930540aK4.LJJIJLIJ(interfaceC937840aVq.LJJIIJ(), new AwS594S0100000_15(c933770aPH, 547));
                return;
            }
        }
        DataChannel dataChannel = this.LLJJIJIIJIL;
        Context context = getContext();
        C933770aPH c933770aPH2 = new C933770aPH(interfaceC937840aVq, context, this);
        op().put(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()), c933770aPH2);
        FrameLayout frameLayoutLJJIIJ2 = interfaceC937840aVq.LJJIIJ();
        c933770aPH2.LLILZ = dataChannel;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hwk, null, false);
        C786410Ut5.W5(viewTd, new FrameLayout.LayoutParams(-1, -1));
        ViewGroup viewGroup4 = (ViewGroup) viewTd;
        if (C497740JfY.LJJ()) {
            viewGroup4.setLayoutDirection(1);
            viewGroup4.setTextDirection(4);
        }
        C930540aK4.LJJIL(-1, viewGroup4, frameLayoutLJJIIJ2);
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(frameLayoutLJJIIJ2, c933770aPH2, viewGroup4, 50);
        if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
            if (frameLayoutLJJIIJ2.isLaidOut() && !frameLayoutLJJIIJ2.isLayoutRequested()) {
                awS259S0300000_15.invoke();
            } else {
                frameLayoutLJJIIJ2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(awS259S0300000_15, 7));
            }
        } else {
            C930540aK4.LJJJ(frameLayoutLJJIIJ2, new ARunnableS106S0100000_6((Object) awS259S0300000_15, 282));
        }
        c933770aPH2.LLILLL = viewGroup4;
        DataChannel dataChannel2 = c933770aPH2.LLILZ;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, IsViewerLimitedStatusChannel.class, new AwS594S0100000_15(c933770aPH2, 1051));
        }
        C938050aWB c938050aWB2 = (C938050aWB) this.LLJJJIL.getValue();
        int iLJIIIIZZ2 = interfaceC937840aVq.LJIIIIZZ();
        c938050aWB2.getClass();
        int iLJIIJJI2 = C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ());
        if ((iLJIIJJI2 != 0 && iLJIIJJI2 != 1) || c938050aWB2.LIZ.contains(Integer.valueOf(iLJIIIIZZ2))) {
            return;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C924640aAY.LIZIZ(followStatus, dataChannel, "plus_button", false);
        c938050aWB2.LIZ.add(Integer.valueOf(iLJIIIIZZ2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0073, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem.ip(java.lang.String, boolean):void");
    }
}
