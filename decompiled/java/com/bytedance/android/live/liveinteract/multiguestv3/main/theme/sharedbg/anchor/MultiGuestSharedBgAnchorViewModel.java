package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor;

import X.C01GW;
import X.C0U4R;
import X.C0U58;
import X.C0U59;
import X.C0UX6;
import X.C1161920gLG;
import X.C11S5;
import X.C1338270kvh;
import X.C1533950q1J;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452501pT;
import X.C480460Ism;
import X.C748880TZe;
import X.C758560TpG;
import X.C766270U4b;
import X.C766720U5u;
import X.C915980Zwa;
import X.C916150Zwr;
import X.C916490ZxP;
import X.C917290Zyh;
import X.C917650ZzH;
import X.C917810ZzX;
import X.C919310a1x;
import X.C921180a4y;
import X.C922250a6h;
import X.C923170a8B;
import X.C924230a9t;
import X.C924810aAp;
import X.C930930aKh;
import X.C930940aKi;
import X.C931790aM5;
import X.C931800aM6;
import X.C935480aS2;
import X.C935490aS3;
import X.C935500aS4;
import X.C935530aS7;
import X.C935540aS8;
import X.C935550aS9;
import X.C935560aSA;
import X.C935570aSB;
import X.C935600aSE;
import X.C936270aTJ;
import X.C939000aXi;
import X.C940770aaZ;
import X.C942200acs;
import X.C946050aj5;
import X.C946060aj6;
import X.C956680b0E;
import X.C963140bAe;
import X.DialogInterfaceOnDismissListenerC987000bn8;
import X.EnumC918990a1R;
import X.EnumC936960aUQ;
import X.EnumC937290aUx;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.InterfaceC760840Tsw;
import X.InterfaceC934710aQn;
import X.InterfaceC937900aVw;
import X.InterfaceC938950aXd;
import X.InterfaceC954180awC;
import X.InterfaceC958970b3v;
import X.InterfaceC964770bDH;
import Y.ACListenerS150S0100000_15;
import Y.AcS187S0300000_15;
import Y.AcS84S0400000_15;
import Y.AfS0S0410100_15;
import Y.AfS34S1000000_15;
import Y.AfS4S0200100_15;
import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperUrlEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
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
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperResetStaleSessionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidBackgroundOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.model.ShareBgMultiEffectChannel;
import com.bytedance.android.livesdk.model.SharedBgStatusChangeEvent;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.AwS99S1200000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class MultiGuestSharedBgAnchorViewModel extends AssemViewModel<C935540aS8> implements InterfaceC938950aXd {
    public static final String LLJJIII = EnumC937290aUx.MULTI_SETTING.getValue();
    public DataChannel LL;
    public LiveEffect LLILLJJLI;
    public C935480aS2 LLILLL;
    public String LLILZIL;
    public AigcWallpaperAnchorViewModel LLILZLL;
    public boolean LLIZ;
    public boolean LLJIJIL;
    public LiveDialogFragment LLJJ;
    public boolean LLJJI;
    public String LLILZ = LLJJIII;
    public final C922250a6h LLIZLLLIL = new InterfaceC964770bDH() { // from class: X.0a6h
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
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
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
        public final void LJJJJZI(C954780axA c954780axA) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCrossArchLinkStateChanged state=");
            sbLIZ.append(c954780axA);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LQ2("onCrossArchLinkStateChanged");
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLL(C954780axA c954780axA) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInnerArchLinkStateChanged state=");
            sbLIZ.append(c954780axA);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LQ2("onInnerArchLinkStateChanged");
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJZZI(C965210bDz c965210bDz) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkRtcStateChanged state=");
            sbLIZ.append(c965210bDz);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LQ2("onLinkRtcStateChanged");
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLL(int i, int i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkerModeChanged oldLinkerMode=");
            sbLIZ.append(i);
            sbLIZ.append(", newLinkerMode=");
            sbLIZ.append(i2);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LQ2("onLinkerModeChanged");
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkMicStateChanged state=");
            sbLIZ.append(i);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LQ2("onLinkMicStateChanged");
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            int iLJJIL = interfaceC958070b2T.LJJIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkedCountChange linkedUserSize=");
            sbLIZ.append(iLJJIL);
            C919310a1x.LIZ("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            C935480aS2 c935480aS2 = this.LL.LLILLL;
            if (c935480aS2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLinkedCountChange, linkedCount=");
                sbLIZ2.append(iLJJIL);
                C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ2));
                if (C935480aS2.LIZ()) {
                    if (iLJJIL > 1) {
                        c935480aS2.LIZIZ();
                    } else {
                        c935480aS2.LIZLLL();
                    }
                }
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInnerUserListChange changeFlag=");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                LLJLLIL(interfaceC954180awC, i, c967130bH5, str, customLinkMessage);
            }
        }
    };
    public final C935530aS7 LLJ = new InterfaceC958970b3v() { // from class: X.0aS7
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutSwitch layout=");
            sbLIZ.append(interfaceC937820aVo.getLayoutId());
            C919310a1x.LIZ("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.FQ2();
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LL;
            multiGuestSharedBgAnchorViewModel.setState(new AwS594S0100000_15(multiGuestSharedBgAnchorViewModel, 430));
        }
    };
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 358));
    public final C935500aS4 LLJILJIL = new C0U58() { // from class: X.0aS4
        @Override // X.C0U58
        public final void release() {
        }

        @Override // X.C0U58
        public final void LIZ() {
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "reportLiveEffectUseTime");
        }

        @Override // X.C0U58
        public final void LIZIZ(LiveEffect liveEffect) {
            String resourceId;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportButtonClickAction liveEffect=");
            if (liveEffect != null) {
                resourceId = liveEffect.getResourceId();
            } else {
                resourceId = null;
            }
            sbLIZ.append(resourceId);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.C0U58
        public final void LIZJ(int i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportEffectPanelDuration liveEffect=");
            sbLIZ.append(i);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            HashMap map = new HashMap();
            C935470aS1.LIZJ(map);
            C935470aS1.LIZIZ(map, null);
            map.put("use_time", String.valueOf(i));
            C935470aS1.LJI("livesdk_anchor_shared_background_panel_duration", map);
        }

        @Override // X.C0U58
        public final void LJ(LiveEffect liveEffect) {
            String resourceId;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportLiveEffectiveUse liveEffect=");
            if (liveEffect != null) {
                resourceId = liveEffect.getResourceId();
            } else {
                resourceId = null;
            }
            sbLIZ.append(resourceId);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.C0U58
        public final void LJFF(LiveEffect liveEffect) {
            String str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportShareBackgroundClick liveEffect=");
            sbLIZ.append(liveEffect.getResourceId());
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            String resourceId = liveEffect.getResourceId();
            C935540aS8 state = this.LIZ.getState();
            if (state != null) {
                str = state.LLILZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(resourceId, str)) {
                C935470aS1.LIZLLL(1, liveEffect, this.LIZ.LLILZ);
            } else {
                C935470aS1.LIZLLL(0, liveEffect, this.LIZ.LLILZ);
            }
        }

        @Override // X.C0U58
        public final void LJI(LiveEffect liveEffect) {
            String resourceId;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportLiveEffectSelected liveEffect=");
            if (liveEffect != null) {
                resourceId = liveEffect.getResourceId();
            } else {
                resourceId = null;
            }
            sbLIZ.append(resourceId);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.C0U58
        public final void LIZLLL(TreeMap<Integer, C781670UlR> treeMap, List<? extends LiveEffect> list, Boolean bool) {
            long effectId;
            String resourceId;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportAggregateLiveEffectShow visibleItemCount=");
            sbLIZ.append(Integer.valueOf(treeMap.size()));
            sbLIZ.append(" stickerListSize=");
            sbLIZ.append(Integer.valueOf(list.size()));
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry<Integer, C781670UlR> entry : treeMap.entrySet()) {
                arrayList.add(Integer.valueOf(entry.getValue().LIZ + 1));
                LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLZIJ(entry.getValue().LIZ, list);
                if (liveEffect != null) {
                    effectId = liveEffect.getEffectId();
                } else {
                    effectId = 0;
                }
                arrayList2.add(Long.valueOf(effectId));
                LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLZIJ(entry.getValue().LIZ, list);
                if (liveEffect2 == null || (resourceId = liveEffect2.getResourceId()) == null) {
                    resourceId = "";
                }
                arrayList3.add(resourceId);
            }
            C935470aS1.LJ(this.LIZ.LLILZ, arrayList, arrayList2, arrayList3);
        }
    };
    public final ACListenerS150S0100000_15 LLJILJILJ = new ACListenerS150S0100000_15(this, 123);
    public final C935550aS9 LLJILLL = new C0U59() { // from class: X.0aS9
        @Override // X.C0U59
        public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
            String resourceId;
            String resourceId2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select effect, oldSticker=");
            String strLJJ = null;
            if (liveEffect != null) {
                resourceId = liveEffect.getResourceId();
            } else {
                resourceId = null;
            }
            sbLIZ.append(resourceId);
            sbLIZ.append(" effect=");
            if (liveEffect2 != null) {
                resourceId2 = liveEffect2.getResourceId();
            } else {
                resourceId2 = null;
            }
            sbLIZ.append(resourceId2);
            sbLIZ.append(", image has download to ");
            if (liveEffect2 != null) {
                strLJJ = liveEffect2.LJJ();
            }
            sbLIZ.append(strLJJ);
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
            AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = multiGuestSharedBgAnchorViewModel.LLILZLL;
            if (aigcWallpaperAnchorViewModel != null) {
                BaseAigcWallpaperViewModel.vQ2(aigcWallpaperAnchorViewModel, "", "", "", "", 4, true, null, new AwS416S0200000_15(multiGuestSharedBgAnchorViewModel, liveEffect2, 39), true, 64);
            } else {
                multiGuestSharedBgAnchorViewModel.LLILLJJLI = liveEffect2;
                multiGuestSharedBgAnchorViewModel.DQ2(liveEffect2, null, null, true);
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean CQ2() {
        /*
            r3 = 1
            boolean r0 = X.C936270aTJ.LIZJ(r3)
            r5 = 0
            if (r0 != 0) goto L9
            return r5
        L9:
            boolean r0 = X.C931790aM5.LIZIZ()
            if (r0 == 0) goto L32
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            boolean r0 = r0.LJIILJJIL()
            if (r0 != 0) goto L1e
            return r3
        L1e:
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            int r1 = r0.LJII()
            r0 = 4
            if (r1 == r0) goto L31
            r0 = 3
            if (r1 == r0) goto L31
            r3 = 0
        L31:
            return r3
        L32:
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "ZOOM_SERVICE"
            java.lang.Object r4 = r1.LJIIIZ(r0)
            boolean r0 = r4 instanceof X.InterfaceC927510aFB
            r2 = 0
            if (r0 == 0) goto L65
            X.0aFB r4 = (X.InterfaceC927510aFB) r4
            if (r4 == 0) goto L66
            java.util.List r0 = r4.LIZIZ()
            if (r0 == 0) goto L66
            int r1 = r0.size()
            r0 = 2
            if (r1 != r0) goto L66
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L54:
            if (r4 == 0) goto L9c
            boolean r0 = r4.LJIIIIZZ()
            if (r0 != r3) goto L9c
            if (r2 == 0) goto L9a
            int r0 = r2.intValue()
            if (r0 != 0) goto L9a
            return r3
        L65:
            r4 = r2
        L66:
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0aVw r0 = X.C921180a4y.LJIIIIZZ(r0)
            if (r0 == 0) goto L8b
            com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r0 = r0.LJJLIIIJLLLLLLLZ()
            if (r0 == 0) goto L8b
            kotlin.Pair r0 = X.C930540aK4.LJIIIIZZ(r0)
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L86:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L54
        L8b:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = X.C916490ZxP.LIZJ()
            if (r0 == 0) goto L54
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LIZIZ()
            if (r0 == 0) goto L54
            int r0 = r0.layoutType
            goto L86
        L9a:
            r3 = 0
            return r3
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel.CQ2():boolean");
    }

    public static boolean AQ2() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        C931800aM6.LIZ.getClass();
        return !(C931800aM6.LIZIZ() && C917810ZzX.LJIIIIZZ()) && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && interfaceC954180awCLLJLL.LJLJLJ() && C936270aTJ.LIZLLL();
    }

    public final void FQ2() {
        if (MultiGuestAigcWallpaperResetStaleSessionSetting.INSTANCE.isEnable()) {
            if (AQ2()) {
                this.LLJIJIL = false;
                return;
            }
            DataChannel dataChannel = this.LL;
            if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(AigcWallpaperStatus.class), Boolean.TRUE) || this.LLJIJIL) {
                return;
            }
            this.LLJIJIL = true;
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "resetAigcLocalStateOnLayoutForceRemoveIfNeed: layout no longer supports wallpaper, reset anchor local aigc state");
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.zW(AigcWallpaperStatus.class, Boolean.FALSE);
            }
            DataChannel dataChannel3 = this.LL;
            if (dataChannel3 != null) {
                dataChannel3.SX0(C956680b0E.class, -1L);
            }
            DataChannel dataChannel4 = this.LL;
            if (dataChannel4 != null) {
                dataChannel4.zW(AigcWallpaperUrlEvent.class, "");
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C935540aS8(null, "", null, CQ2(), C936270aTJ.LIZJ(true) && InterfaceC934710aQn.cc.LIZIZ().booleanValue(), false, AQ2());
    }

    public static void wQ2(String str) {
        Long lValueOf;
        int i;
        int i2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearSharedBgInSettings ");
        sbLIZ.append(str);
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(room.getId());
        }
        long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        if (lValueOf == null) {
            return;
        }
        C480460Ism.LIZ().getClass();
        MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
        long jLongValue = lValueOf.longValue();
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
            i = multiLiveAnchorPanelSettingsLIZIZ2.applierSortSetting;
        } else {
            i = 0;
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
            i2 = multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout;
        } else {
            i2 = 4;
        }
        multiLiveApi.updateAnchorPanelSettings(jLongValue, jLJIILL, -1L, -1, -1, -1, -1, null, CardStruct.IStatusCode.DEFAULT, 1, i, 0L, 0, 0, 0, 0, 0, i2, C924810aAp.LJ().LJJIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS34S1000000_15(str, 4), new AfS34S1000000_15(str, 5));
    }

    public static C946060aj6 xQ2(DataChannel dataChannel) {
        return (C946060aj6) dataChannel.gg0(ShareBgMultiEffectChannel.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean BQ2(boolean r10) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel.BQ2(boolean):boolean");
    }

    public final void LQ2(String str) {
        boolean zBQ2 = BQ2(!TextUtils.isEmpty(getState().LLILZ));
        boolean zAQ2 = AQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSharedBgUI source=");
        sbLIZ.append(str);
        sbLIZ.append(" enable=");
        sbLIZ.append(zBQ2);
        C20441214yg.LIZIZ("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        setState(new C935600aSE(zBQ2, zAQ2));
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        DataChannel dataChannel;
        C919310a1x.LIZ("anchor_shared_bg_viewmodel", "onDestroy");
        C935480aS2 c935480aS2 = this.LLILLL;
        if (c935480aS2 != null) {
            c935480aS2.LIZJ();
        }
        if (C758560TpG.LIZ() && (dataChannel = this.LL) != null) {
            dataChannel.LC0(ToolsTypeStateUpdateEvent.class, new C935490aS3(EnumC936960aUQ.WALLPAPER, false));
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLIZLLLIL);
        C915980Zwa.LJIIIIZZ().vq0(this.LLJ);
        C940770aaZ.LIZ().LJJ((C935560aSA) this.LLJI.getValue());
        this.LL = null;
        onCleared();
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        C919310a1x.LIZ("anchor_shared_bg_viewmodel", "onCreate");
        AssemViewModel.subscribeInternal$default(this, null, null, null, new AwS381S0200000_15(interfaceC665370Q7z, this, 48), 7, null);
        C915980Zwa.LJIIIIZZ().Fe(this.LLIZLLLIL);
        C915980Zwa.LJIIIIZZ().VE2(this.LLJ);
        C940770aaZ.LIZ().LJIIZILJ((C935560aSA) this.LLJI.getValue());
    }

    public final void vQ2(ILinkStateAbility iLinkStateAbility) {
        iLinkStateAbility.cx0(new C2217381BqS() { // from class: X.0aSC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C490701vd) obj).LLILZLL;
            }
        }, null, new AwS594S0100000_15(this, 429));
        iLinkStateAbility.cx0(new C2217381BqS() { // from class: X.0aSD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C490701vd) obj).LLILZIL;
            }
        }, null, new AwS381S0200000_15(iLinkStateAbility, this, 47));
    }

    public static void KQ2(EnumC918990a1R enumC918990a1R, String str) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        int iLJII;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        if (C931790aM5.LIZIZ()) {
            float f = C942200acs.LIZ;
            MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
            if (multiGuestDataHolderLJJIFFI != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLJJIFFI.LIZIZ()) != null) {
                iLJII = C917650ZzH.LJII(multiLiveAnchorPanelSettingsLIZIZ);
            } else {
                iLJII = 0;
            }
            Pair pairLIZIZ = C942200acs.LIZIZ(iLJII);
            C940770aaZ.LIZ().getAction().LJII(((Number) pairLIZIZ.getFirst()).intValue(), ((Number) pairLIZIZ.getSecond()).intValue(), null, null);
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LJJJJIZL(str, false, false, true, false, new C916150Zwr());
            }
        }
        C917290Zyh c917290Zyh = C917290Zyh.LIZ;
        C917290Zyh.LJIIL = "share_background";
        C917290Zyh.LJIILIIL = "share_background";
        c917290Zyh.LJIIIZ(enumC918990a1R, false);
    }

    public final void GQ2(Boolean bool, final String str) {
        List urls;
        ImageModel imageModel;
        if (!C936270aTJ.LIZJ(true)) {
            C939000aXi.LIZ.getClass();
            if (!C939000aXi.LJ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("anchor resumeSharedBg, ignore when feat disable, aigcEnable = ");
                sbLIZ.append(C939000aXi.LJ());
                C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
                if (LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_shared_bg_version") <= 0 || !C939000aXi.LJ()) {
                    C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "anchor resumeSharedBg, clear the saved effect when feature setting disable.");
                    wQ2(str);
                    return;
                }
                return;
            }
        }
        if (MultiGuestAndroidBackgroundOptSetting.INSTANCE.isOptSetBg()) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && (imageModel = room.background) != null) {
                urls = imageModel.getUrls();
            } else {
                urls = null;
            }
            if (Intrinsics.LJFF(bool, Boolean.FALSE) && urls != null && !urls.isEmpty()) {
                C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "anchor resumeSharedBg, ignore when using opt bg");
                wQ2(str);
                return;
            }
        }
        if (C924230a9t.LIZ(128)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("anchor resumeSharedBg, sharedBgStickerId=");
        sbLIZ2.append(str);
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ2));
        if (str == null) {
            return;
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJIILIIL(str, false, new InterfaceC760840Tsw() { // from class: X.0aSK
            @Override // X.InterfaceC760840Tsw
            public final void onFail() {
                this.LIZ.setState(AFwS250S0000000_15.get$arr$(63));
                C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "anchor resumeSharedBg, clear the saved effect when fetch effect fail from loki.");
                MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
                String str2 = str;
                multiGuestSharedBgAnchorViewModel.getClass();
                MultiGuestSharedBgAnchorViewModel.wQ2(str2);
            }

            @Override // X.InterfaceC760840Tsw
            public final void LIZ(final LiveEffect liveEffect) {
                if (liveEffect == null) {
                    this.LIZ.setState(AFwS250S0000000_15.get$arr$(64));
                    C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "anchor resumeSharedBg, clear the saved effect when it have been removed in loki.");
                    MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
                    String str2 = str;
                    multiGuestSharedBgAnchorViewModel.getClass();
                    MultiGuestSharedBgAnchorViewModel.wQ2(str2);
                    return;
                }
                if (!TextUtils.isEmpty(liveEffect.LJJ())) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("anchor resumeSharedBg, use cache image success, shareImagePath = ");
                    sbLIZ3.append(liveEffect.LJJ());
                    C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ3));
                    C935480aS2 c935480aS2 = this.LIZ.LLILLL;
                    if (c935480aS2 != null) {
                        c935480aS2.LIZJ();
                    }
                    MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel2 = this.LIZ;
                    multiGuestSharedBgAnchorViewModel2.LLILLL = new C935480aS2(liveEffect, multiGuestSharedBgAnchorViewModel2.LLILZ, true);
                    multiGuestSharedBgAnchorViewModel2.LLILLJJLI = liveEffect;
                    multiGuestSharedBgAnchorViewModel2.setState(new AwS99S1200000_15(multiGuestSharedBgAnchorViewModel2, liveEffect, str, 1));
                    return;
                }
                String strLJJLIIIJLLLLLLLZ = liveEffect.LJJLIIIJLLLLLLLZ();
                String strLLJLLIL = liveEffect.LLJLLIL();
                final MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel3 = this.LIZ;
                final String str3 = str;
                C936270aTJ.LIZIZ(strLJJLIIIJLLLLLLLZ, strLLJLLIL, new Function1<C0U3O, Unit>() { // from class: X.0aSM
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(C0U3O c0u3o) {
                        C0U3O c0u3o2 = c0u3o;
                        c0u3o2.LIZLLL(AFwS250S0000000_15.get$arr$(65));
                        c0u3o2.LJFF(new AwS99S1200000_15(multiGuestSharedBgAnchorViewModel3, liveEffect, str3, 2));
                        c0u3o2.LIZJ(AFwS250S0000000_15.get$arr$(66));
                        c0u3o2.LIZIZ(new AwS629S0100000_15(multiGuestSharedBgAnchorViewModel3, 27));
                        return Unit.LIZ;
                    }
                });
            }
        });
    }

    public final void JQ2(int i, String str) {
        C0U4R c0u4r = new C0U4R();
        c0u4r.LIZLLL = i;
        c0u4r.LJFF = true;
        c0u4r.LJII = this.LL;
        c0u4r.LIZJ = str;
        C766270U4b.LJIIJ(c0u4r);
    }

    public final boolean yQ2(final Context context, EnumC937290aUx enumC937290aUx) {
        int i;
        String value;
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel;
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "handleClickSharedBgSettingItem");
        if (enumC937290aUx == null) {
            i = -1;
        } else {
            i = C935570aSB.LIZ[enumC937290aUx.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                value = LLJJIII;
            } else {
                value = EnumC937290aUx.PLAYBOOK.getValue();
            }
        } else {
            value = EnumC937290aUx.DESIGN_PAGE.getValue();
        }
        this.LLILZ = value;
        C935540aS8 state = getState();
        if (state != null && state.LLILLJJLI) {
            InterfaceC934710aQn.cc.LJFF(Boolean.FALSE);
            RedDotExtensionKt.LIZ(C0UX6.RED_DOT_ANCHOR_SHARE_BACKGROUND_BUTTON);
            setState(AFwS250S0000000_15.get$arr$(61));
        }
        C935540aS8 state2 = getState();
        if (state2 != null && !state2.LL) {
            JQ2(2131843394, "pm_mt_multiWallpaper_panelScreen_wallpaperEntry_toast");
            return false;
        }
        if (this.LLIZ && (aigcWallpaperAnchorViewModel = this.LLILZLL) != null) {
            BaseAigcWallpaperViewModel.vQ2(aigcWallpaperAnchorViewModel, null, null, null, null, 4, true, null, null, false, 448);
        }
        LiveEffect currentBgEffect = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getCurrentBgEffect();
        if (currentBgEffect != null) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJIILIIL(currentBgEffect.getResourceId(), false, new InterfaceC760840Tsw() { // from class: X.0aS6
                @Override // X.InterfaceC760840Tsw
                public final void onFail() {
                    MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
                    multiGuestSharedBgAnchorViewModel.IQ2(context, multiGuestSharedBgAnchorViewModel.LL, false);
                }

                @Override // X.InterfaceC760840Tsw
                public final void LIZ(LiveEffect liveEffect) {
                    if (liveEffect != null && !this.LIZ.getState().LLILLL) {
                        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
                        Context context2 = context;
                        DataChannel dataChannel = multiGuestSharedBgAnchorViewModel.LL;
                        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show quick apply dialog");
                        C935470aS1.LJFF("grid_shared_panel_used", "show");
                        C782110Um9 c782110Um9 = new C782110Um9(context2);
                        c782110Um9.LJIIZILJ(2131843388);
                        c782110Um9.LJII(2131843387);
                        c782110Um9.LJIIJ(2131843386, new AcS187S0300000_15(context2, multiGuestSharedBgAnchorViewModel, dataChannel, 6));
                        c782110Um9.LJIILIIL(2131843389, new AcS84S0400000_15(liveEffect, dataChannel, multiGuestSharedBgAnchorViewModel, context2, 4));
                        c782110Um9.LJIILL = false;
                        C786410Ut5.E4(c782110Um9.LIZ());
                        return;
                    }
                    MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel2 = this.LIZ;
                    multiGuestSharedBgAnchorViewModel2.IQ2(context, multiGuestSharedBgAnchorViewModel2.LL, false);
                }
            });
            return true;
        }
        IQ2(context, this.LL, false);
        return true;
    }

    public final void IQ2(Context context, DataChannel dataChannel, boolean z) {
        String str;
        boolean z2;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        EnumC918990a1R enumC918990a1RLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        FragmentManager fragmentManager;
        C946060aj6 c946060aj6XQ2;
        C946050aj5 c946050aj5LIZIZ;
        C946050aj5 c946050aj5LIZIZ2;
        C946060aj6 c946060aj6XQ22;
        SharedEffect sharedEffect;
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "showSelectSharedBgDialog");
        String strLIZ = null;
        if (dataChannel != null && (c946060aj6XQ22 = xQ2(dataChannel)) != null && (sharedEffect = (SharedEffect) c946060aj6XQ22.LIZ()) != null) {
            str = sharedEffect.id;
        } else {
            str = null;
        }
        String str2 = getState().LLILZ;
        if (C1533950q1J.LJ(str) && (str2 == null || a0.LJJJIL(str2))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (str2 != null && !a0.LJJJIL(str2) && !Intrinsics.LJFF(str2, str)) {
            if (dataChannel != null) {
                C946060aj6 c946060aj6XQ23 = xQ2(dataChannel);
                if (c946060aj6XQ23 != null && (c946050aj5LIZIZ2 = c946060aj6XQ23.LIZIZ()) != null) {
                    c946050aj5LIZIZ2.LIZLLL("has_params");
                }
                dataChannel.LC0(SharedBgStatusChangeEvent.class, null);
            }
            z2 = false;
        }
        LiveDialogFragment liveDialogFragment = this.LLJJ;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        C935500aS4 c935500aS4 = this.LLJILJIL;
        ACListenerS150S0100000_15 aCListenerS150S0100000_15 = this.LLJILJILJ;
        C935550aS9 c935550aS9 = this.LLJILLL;
        if (!z2) {
            str = getState().LLILZ;
        }
        this.LLJJ = iEffectService.getLiveBgDialogFragment(context, dataChannel, "multi", c935500aS4, null, aCListenerS150S0100000_15, c935550aS9, str, Boolean.valueOf(z2));
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show select dialog");
            LiveDialogFragment liveDialogFragment2 = this.LLJJ;
            if (liveDialogFragment2 != null) {
                liveDialogFragment2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987000bn8(dataChannel, this, 1));
            }
            LiveDialogFragment liveDialogFragment3 = this.LLJJ;
            if (liveDialogFragment3 != null) {
                liveDialogFragment3.show(fragmentManager, "link_select_shared_bg_dialog");
            }
            if (dataChannel != null && (c946060aj6XQ2 = xQ2(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6XQ2.LIZIZ()) != null) {
                c946050aj5LIZIZ.LJFF(0);
            }
        }
        boolean z3 = !TextUtils.isEmpty(getState().LLILZ);
        if (z && !C936270aTJ.LIZLLL() && z3 && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && (enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) != null) {
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show select dialog, auto switch to grid layout");
            MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
                strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ2);
            }
            KQ2(enumC918990a1RLIZ, strLIZ);
        }
        if (!BQ2(z3) && z3) {
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show select dialog, show current invalid toast");
            JQ2(2131843385, "pm_mt_multiWallpaper_liveScreen_finishedState_toast");
        }
    }

    public static void HQ2(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, C2217371BqR c2217371BqR, LifecycleOwner lifecycleOwner, Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select state Subscribe [");
        sbLIZ.append(c2217371BqR);
        sbLIZ.append("] ");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(true);
        AssemViewModel.selectSubscribe$default(multiGuestSharedBgAnchorViewModel, c2217371BqR, c1770850wBP, lifecycleOwner, null, function1, 8, null);
    }

    public final void DQ2(LiveEffect liveEffect, Function0<Unit> function0, Function0<Unit> function02, boolean z) {
        String resourceId;
        Long lValueOf;
        int i;
        int i2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        C946060aj6 c946060aj6XQ2;
        C946050aj5 c946050aj5LIZIZ;
        if (liveEffect != null && PlayEntityUtilKt.LJIIJ("shared_background")) {
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "onSelectedSharedBg abort, mutex scene running");
            if (function02 != null) {
                function02.invoke();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applySelectedSharedBg stickerId=");
        String resourceId2 = null;
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        sbLIZ.append(resourceId);
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = liveEffect;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(room.getId());
        }
        long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        if (lValueOf == null) {
            DataChannel dataChannel = this.LL;
            if (dataChannel != null && (c946060aj6XQ2 = xQ2(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6XQ2.LIZIZ()) != null) {
                c946050aj5LIZIZ.LIZLLL("roomId is null");
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(SharedBgStatusChangeEvent.class, null);
                return;
            }
            return;
        }
        long jLIZIZ = C963140bAe.LIZIZ();
        C480460Ism.LIZ().getClass();
        MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
        long jLongValue = lValueOf.longValue();
        if (liveEffect != null) {
            resourceId2 = liveEffect.getResourceId();
        }
        String strLIZ = C936270aTJ.LIZ(resourceId2);
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
            i = multiLiveAnchorPanelSettingsLIZIZ2.applierSortSetting;
        } else {
            i = 0;
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
            i2 = multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout;
        } else {
            i2 = 4;
        }
        multiLiveApi.updateAnchorPanelSettings(jLongValue, jLJIILL, -1L, -1, -1, -1, -1, null, strLIZ, 1, i, 0L, 0, 0, 0, 0, 0, i2, C924810aAp.LJ().LJJIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S0410100_15(liveEffect, function02, this, z, function0, jLIZIZ, 3), new AfS4S0200100_15(jLIZIZ, function02, this, 2));
    }

    public final void zQ2(final String str, final String str2, final Function0<Unit> function0, final Function0<Unit> function02) {
        String value;
        int iHashCode = str2.hashCode();
        if (iHashCode != -902905744) {
            value = iHashCode != 398788705 ? EnumC937290aUx.PLAYBOOK.getValue() : EnumC937290aUx.PLAYBOOK.getValue();
        } else if (!str2.equals("design_page")) {
            value = LLJJIII;
        } else {
            value = EnumC937290aUx.DESIGN_PAGE.getValue();
        }
        this.LLILZ = value;
        if (str.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleApplySharedBg stickerId=");
            sbLIZ.append(str);
            sbLIZ.append(" source=");
            sbLIZ.append(str2);
            sbLIZ.append(" | clear");
            C1AZW.LJIIJ(12, "anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ), null, null);
            DQ2(null, function0, function02, true);
            return;
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJIILIIL(str, false, new InterfaceC760840Tsw() { // from class: X.0aS5
            @Override // X.InterfaceC760840Tsw
            public final void onFail() {
                C946060aj6 c946060aj6XQ2;
                C946050aj5 c946050aj5LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleApplySharedBg stickerId=");
                sbLIZ2.append(str);
                sbLIZ2.append(" source=");
                sbLIZ2.append(str2);
                sbLIZ2.append(" | fetchEffect fail");
                C1AZW.LJFF("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                DataChannel dataChannel = this.LL;
                if (dataChannel != null && (c946060aj6XQ2 = MultiGuestSharedBgAnchorViewModel.xQ2(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6XQ2.LIZIZ()) != null) {
                    c946050aj5LIZIZ.LIZLLL("fetch effect fail");
                }
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(SharedBgStatusChangeEvent.class, null);
                }
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // X.InterfaceC760840Tsw
            public final void LIZ(LiveEffect liveEffect) {
                if (str != null && PlayEntityUtilKt.LJIIJ("shared_background")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleApplySharedBg stickerId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" source=");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" | abort, mutex scene running after fetchEffect");
                    C1AZW.LJIIJ(12, "anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    Function0<Unit> function03 = function02;
                    if (function03 != null) {
                        function03.invoke();
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("handleApplySharedBg stickerId=");
                sbLIZ3.append(str);
                sbLIZ3.append(" source=");
                sbLIZ3.append(str2);
                sbLIZ3.append(" | fetchEffect success");
                C1AZW.LJIIJ(12, "anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ3), null, null);
                this.DQ2(liveEffect, function0, function02, true);
            }
        });
    }
}
