package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.guest;

import X.C01GW;
import X.C0IMT;
import X.C0UI0;
import X.C0UV2;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C921180a4y;
import X.C922420a6y;
import X.C923970a9T;
import X.C924790aAn;
import X.C945730aiZ;
import X.C946940akW;
import X.C947120ako;
import X.C947590alZ;
import X.C949030ant;
import X.C949390aoT;
import X.EnumC942260acy;
import X.EnumC947020ake;
import X.EnumC947440alK;
import X.InterfaceC769000UEo;
import X.InterfaceC934710aQn;
import X.InterfaceC940910aan;
import X.InterfaceC946970akZ;
import X.InterfaceC964770bDH;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.guest.LetsDanceGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
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
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEffectInitSuccessChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenRankPageEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceShowFinishBgEvent;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public final class LetsDanceGuestViewModel extends LetsDanceBaseViewModel {
    public Boolean LLJJIJIL;
    public final C922420a6y LLJJJ = new InterfaceC964770bDH() { // from class: X.0a6y
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
        public final void LJJJLL(C954780axA c954780axA) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInnerArchLinkStateChanged, ");
            sbLIZ.append(c954780axA.LIZJ);
            sbLIZ.append(" -> ");
            sbLIZ.append(c954780axA.LIZIZ);
            C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkMicStateChanged, state: ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public final C946940akW LLJJJIL = new C0IMT() { // from class: X.0akW
        @Override // X.C0IMT
        public final void onChanged(Object obj) {
            EnumC947440alK second;
            EnumC947440alK enumC947440alK;
            DataChannel dataChannel;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LinkPlayerState.inst() ");
            sbLIZ.append(obj);
            C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
            Pair<EnumC947440alK, EnumC947440alK> value = this.LL.LLJILLL.getValue();
            EnumC947440alK second2 = null;
            if (value != null && (second = value.getSecond()) != null && second != (enumC947440alK = EnumC947440alK.NONE)) {
                boolean zLJFF = C924790aAn.LIZLLL().LJFF();
                if (zLJFF) {
                    LetsDanceGuestViewModel letsDanceGuestViewModel = this.LL;
                    InterfaceC946970akZ interfaceC946970akZXQ2 = letsDanceGuestViewModel.xQ2();
                    if (interfaceC946970akZXQ2 != null) {
                        interfaceC946970akZXQ2.LJII();
                    }
                    Pair<EnumC947440alK, EnumC947440alK> value2 = letsDanceGuestViewModel.LLJILLL.getValue();
                    if (value2 != null) {
                        second2 = value2.getSecond();
                    }
                    InterfaceC946970akZ interfaceC946970akZXQ22 = letsDanceGuestViewModel.xQ2();
                    if (interfaceC946970akZXQ22 != null) {
                        interfaceC946970akZXQ22.LJIILLIIL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("audienceBecomeOnline, curGamePhase=");
                    sbLIZ2.append(second2);
                    C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                    if (second2 != null) {
                        if (second2 != enumC947440alK) {
                            C01GW<C949390aoT> c01gw = C949390aoT.LIZJ;
                            if (C923970a9T.LIZ().LIZLLL() != null) {
                                letsDanceGuestViewModel.MQ2(true);
                            }
                            letsDanceGuestViewModel.vQ2();
                        }
                        int i = C947120ako.LIZ[second2.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3 && (dataChannel = letsDanceGuestViewModel.LL) != null) {
                                    dataChannel.FQ2(MultiLetsDanceShowFinishBgEvent.class);
                                }
                            } else if (letsDanceGuestViewModel.EQ2()) {
                                letsDanceGuestViewModel.HQ2();
                            }
                        } else if (letsDanceGuestViewModel.EQ2()) {
                            letsDanceGuestViewModel.HQ2();
                        }
                    }
                } else if (Intrinsics.LJFF(this.LL.LLJJIJIL, Boolean.TRUE)) {
                    LetsDanceGuestViewModel letsDanceGuestViewModel2 = this.LL;
                    Pair<EnumC947440alK, EnumC947440alK> value3 = letsDanceGuestViewModel2.LLJILLL.getValue();
                    if (value3 != null) {
                        second2 = value3.getSecond();
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("audienceBecomeOffline, curGamePhase=");
                    sbLIZ3.append(second2);
                    C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ3));
                    if (second2 != null) {
                        if (second2 != enumC947440alK) {
                            letsDanceGuestViewModel2.IQ2();
                            letsDanceGuestViewModel2.MQ2(false);
                        }
                        int[] iArr = C947120ako.LIZ;
                        second2.ordinal();
                    }
                    DataChannel dataChannel2 = this.LL.LL;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(MultiLetsDanceEffectInitSuccessChannel.class, Boolean.FALSE);
                    }
                }
                this.LL.LLJJIJIL = Boolean.valueOf(zLJFF);
            }
        }
    };
    public InterfaceC940910aan LLJJJJ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final String getTag() {
        return "LetsDanceGuestViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final void QQ2() {
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJIIZI(true);
        }
        MultiGuestDataHolder multiGuestDataHolder2 = this.dataHolder;
        if (multiGuestDataHolder2 != null) {
            multiGuestDataHolder2.LJIILIIL = 1;
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.LC0(MultiLiveGuestMuteVideoEvent.class, new C0UI0(true, "business_lets_dance_open_camera"));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final List<EnumC947020ake> BQ2() {
        return DQ2() ? C1697810uHb.LJIIJJI(EnumC947020ake.GAME_MATERIAL, EnumC947020ake.SCORE_EFFECT, EnumC947020ake.LAYOUT_RESOURCE) : Collections.singletonList(EnumC947020ake.LAYOUT_RESOURCE);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C924790aAn.LIZLLL().LIZJ(this.LLJJJIL);
        C915980Zwa.LJIIIIZZ().a9(this.LLJJJ);
        InterfaceC940910aan interfaceC940910aan = this.LLJJJJ;
        if (interfaceC940910aan != null) {
            interfaceC940910aan.unsubscribe();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final InterfaceC769000UEo wQ2() {
        return C0UV2.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final void GQ2(DataChannel dataChannel) {
        C949030ant c949030antLJIIIZ;
        super.GQ2(dataChannel);
        C924790aAn.LIZLLL().LIZ(this.LLJJJIL);
        C915980Zwa.LJIIIIZZ().Fe(this.LLJJJ);
        InterfaceC946970akZ interfaceC946970akZXQ2 = xQ2();
        if (interfaceC946970akZXQ2 != null) {
            c949030antLJIIIZ = interfaceC946970akZXQ2.LJIIIZ(new AwS664S0100000_15(this, 8));
        } else {
            c949030antLJIIIZ = null;
        }
        this.LLJJJJ = c949030antLJIIIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final void FQ2(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2) throws JSONException {
        String strZQ2;
        C947590alZ c947590alZLJIILLIIL;
        DataChannel dataChannel;
        super.FQ2(enumC947440alK, enumC947440alK2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGamePhaseChanged ");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC947440alK2);
        sbLIZ.append(", isGuest=");
        sbLIZ.append(DQ2());
        C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        int i = C947120ako.LIZ[enumC947440alK2.ordinal()];
        if (i != 1) {
            EnumC942260acy enumC942260acy = null;
            if (i != 3) {
                if (i == 4 && enumC947440alK != null && enumC947440alK != EnumC947440alK.NONE) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onGamePhaseChanged ");
                    sbLIZ2.append(enumC947440alK);
                    sbLIZ2.append(" -> ");
                    sbLIZ2.append(enumC947440alK2);
                    sbLIZ2.append(", Quit Game!");
                    C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                    MQ2(false);
                    IQ2();
                    PQ2();
                    JQ2();
                    InterfaceC934710aQn.Nc.LJFF(Boolean.FALSE);
                    C945730aiZ c945730aiZ = C945730aiZ.LIZ;
                    DataChannel dataChannel2 = this.LL;
                    Long l = this.LLIZLLLIL;
                    this.LLIZLLLIL = null;
                    c945730aiZ.getClass();
                    C945730aiZ.LJFF(dataChannel2, l);
                    if (enumC947440alK == EnumC947440alK.PREPARING) {
                        C945730aiZ.LJ(this.LL, "mode_end", null, this.LLJ, this.LLJI);
                        return;
                    }
                    String strZQ22 = zQ2();
                    if (strZQ22 == null) {
                        return;
                    }
                    C945730aiZ.LJ(this.LL, "play_end", strZQ22, this.LLJ, this.LLJI);
                    return;
                }
                return;
            }
            OQ2();
            PQ2();
            KQ2(1, "");
            JQ2();
            if (C924790aAn.LIZLLL().LJFF() && (dataChannel = this.LL) != null) {
                dataChannel.FQ2(MultiLetsDanceOpenRankPageEvent.class);
            }
            if (enumC947440alK == null) {
                return;
            }
            C945730aiZ c945730aiZ2 = C945730aiZ.LIZ;
            DataChannel dataChannel3 = this.LL;
            Long l2 = this.LLIZLLLIL;
            this.LLIZLLLIL = null;
            c945730aiZ2.getClass();
            C945730aiZ.LJFF(dataChannel3, l2);
            InterfaceC946970akZ interfaceC946970akZXQ2 = xQ2();
            if (interfaceC946970akZXQ2 != null && (c947590alZLJIILLIIL = interfaceC946970akZXQ2.LJIILLIIL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) != null) {
                enumC942260acy = c947590alZLJIILLIIL.LIZJ;
            }
            if (enumC942260acy != EnumC942260acy.READY || (strZQ2 = zQ2()) == null) {
                return;
            }
            C945730aiZ.LJ(this.LL, "play_end", strZQ2, this.LLJ, this.LLJI);
            return;
        }
        if (!DQ2()) {
            return;
        }
        C01GW<C949390aoT> c01gw = C949390aoT.LIZJ;
        if (C923970a9T.LIZ().LIZLLL() == null) {
            return;
        }
        MQ2(true);
    }
}
