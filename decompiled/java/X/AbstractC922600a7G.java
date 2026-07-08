package X;

import Y.AfS184S0100000_15;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.CohostGuestListChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
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
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS594S0100000_15;
import org.json.JSONObject;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC922600a7G implements InterfaceC921620a5g, OnMessageListener, InterfaceC924420aAC {
    public static final ArrayList<Integer> LLJJI = C1697810uHb.LJ(19, 20, 21);
    public final Room LL;
    public long LLILLJJLI;
    public final IMessageManager LLILLL;
    public final LifecycleOwner LLILZ;
    public C11JL LLILZIL;
    public int LLIZ;
    public Function0<Integer> LLIZLLLIL;
    public DataChannel LLJ;
    public MultiGuestDataHolder LLJILLL;
    public final ConcurrentHashMap<String, InterfaceC420801kM> LLILZLL = new ConcurrentHashMap<>();
    public final C921940a6C LLJI = new InterfaceC964770bDH() { // from class: X.0a6C
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
        public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
            this.LL.LJJJJZI();
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
            this.LL.LJJJJLI();
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
            this.LL.LJJJJLL();
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            this.LL.LJJJLIIL();
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            this.LL.LJJJJIZL(interfaceC958070b2T.LIZLLL(), interfaceC958070b2T.LJJJJL(), interfaceC958070b2T.Kh());
        }

        @Override // X.InterfaceC964770bDH
        public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInnerUserListChange changeFlag=");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("LinkUserInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                LLJLLIL(interfaceC954180awC, i, c967130bH5, str, customLinkMessage);
            }
        }
    };
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(220));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(219));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(221));
    public final boolean LLJJ = true;

    public abstract AbstractC928510aGn LJJJI();

    public abstract void LJJJJIZL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3);

    public abstract void LJJJJJ(LinkMessage linkMessage);

    public abstract List<Integer> LJJJJL(String str);

    public void LJJJJLI() {
    }

    public void LJJJJLL() {
    }

    public abstract void LJJJJZ(C923390a8X c923390a8X);

    public void LJJJJZI() {
    }

    public void LJJJLIIL() {
    }

    public final List<InterfaceC922630a7J> LJJJIL() {
        return (List) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC921620a5g
    public void init() {
        IMessageManager iMessageManager = this.LLILLL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJI);
    }

    @Override // X.InterfaceC921620a5g
    public void release() {
        C11JL c11jl = this.LLILZIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
        Iterator<Map.Entry<String, InterfaceC420801kM>> it2 = this.LLILZLL.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().dispose();
        }
        this.LLILZLL.clear();
        IMessageManager iMessageManager = this.LLILLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLJI);
        LJJJIL().clear();
        ((HashMap) this.LLJIJIL.getValue()).clear();
        ((HashMap) this.LLJILJIL.getValue()).clear();
        LJJJI().LJJIJIL();
        if (LJJJJJL()) {
            C924810aAp.LJ().LJJII = 0;
            MultiGuestDataHolder multiGuestDataHolder = this.LLJILLL;
            if (multiGuestDataHolder != null) {
                multiGuestDataHolder.LJJIII(0);
            }
            ((Map) C920500a3s.LIZJ.getValue()).clear();
            C920500a3s.LIZ = "";
        }
        this.LLJILLL = null;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLJ = null;
    }

    public boolean LJJJJJL() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC921620a5g
    public final String LIZIZ(long j) {
        return (String) ((HashMap) this.LLJIJIL.getValue()).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC921620a5g
    public final void LJI(AwS557S0100000_13 awS557S0100000_13) {
        this.LLIZLLLIL = awS557S0100000_13;
    }

    @Override // X.InterfaceC921620a5g
    public final void LJIIJJI(long j) {
        ((HashMap) this.LLJILJIL.getValue()).remove(Long.valueOf(j));
    }

    @Override // X.InterfaceC921620a5g
    public final void LJIILIIL(MultiGuestDataHolder multiGuestDataHolder) {
        this.LLJILLL = multiGuestDataHolder;
    }

    @Override // X.InterfaceC921620a5g
    public final void LJIILJJIL(int i) {
        this.LLIZ = i;
    }

    @Override // X.InterfaceC921620a5g
    public final String LJIL(long j) {
        String str = (String) ((HashMap) this.LLJILJIL.getValue()).get(Long.valueOf(j));
        if (str == null) {
            return "anchor";
        }
        return str;
    }

    @Override // X.InterfaceC921620a5g
    public final C11L6 LJJIFFI(GuestApplyStillInLineParams guestApplyStillInLineParams) {
        C480460Ism.LIZ().getClass();
        return ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getStillInLineData(guestApplyStillInLineParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS184S0100000_15(this, 103));
    }

    @Override // X.InterfaceC921620a5g
    public final void LJJIIJ(InterfaceC922630a7J interfaceC922630a7J) {
        LJJJIL().remove(interfaceC922630a7J);
    }

    @Override // X.InterfaceC921620a5g
    public final void LJJIJIL(InterfaceC922630a7J interfaceC922630a7J) {
        LJJJIL().add(interfaceC922630a7J);
    }

    public void LJJJJ(Throwable th) {
        Iterator<InterfaceC922630a7J> it2 = LJJJIL().iterator();
        while (it2.hasNext()) {
            it2.next().Ue(th);
        }
    }

    public final void LJJJLL(int i) {
        Iterator<InterfaceC922630a7J> it2 = LJJJIL().iterator();
        while (it2.hasNext()) {
            it2.next().L2(LJJJI(), i);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LinkMessage linkMessage;
        if ((iMessage instanceof LinkMessage) && (linkMessage = (LinkMessage) iMessage) != null && LLJJI.contains(Integer.valueOf(linkMessage.messageType)) && linkMessage.LIZIZ() == C001L.AUDIENCE_LINKMIC) {
            LJJJJJ(linkMessage);
        }
    }

    @Override // X.InterfaceC921620a5g
    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJ = dataChannel;
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ() && dataChannel != null) {
            dataChannel.DQ2(CohostGuestListChangeChannel.class, this, new AwS594S0100000_15(this, 658));
        }
    }

    @Override // X.InterfaceC921620a5g
    public final void LJIIIZ(long j, String str) {
        if (j == 0) {
            return;
        }
        ((HashMap) this.LLJILJIL.getValue()).put(Long.valueOf(j), str);
    }

    @Override // X.InterfaceC921620a5g
    public final void LJIJJ(long j, String str) {
        if (j == 0) {
            return;
        }
        ((HashMap) this.LLJIJIL.getValue()).put(Long.valueOf(j), str);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.SX0(C749200TaA.class, C2097608Jq.LJIIZILJ((HashMap) this.LLJIJIL.getValue()));
        }
    }

    public void LJJJJI(MultiLiveGuestInfoList multiLiveGuestInfoList, String str) {
        Integer numValueOf;
        long id;
        Long lValueOf;
        MultiGuestDataHolder multiGuestDataHolder;
        if (!TextUtils.isEmpty(multiLiveGuestInfoList.fanTicketIconUrl) && (multiGuestDataHolder = this.LLJILLL) != null) {
            multiGuestDataHolder.LJJJLZIJ = multiLiveGuestInfoList.fanTicketIconUrl;
        }
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : LJJJI().LJIJJLI()) {
            final long id2 = linkPlayerInfo.mUser.getId();
            final String str2 = linkPlayerInfo.mInteractIdStr;
            final int i = linkPlayerInfo.LIZ;
            arrayList.add(new Object(id2, str2, i) { // from class: X.0a7H
                public final long LIZ;
                public final String LIZIZ;
                public final int LIZJ;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("userId=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", linkmicId='");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append("', status=");
                    sbLIZ.append(this.LIZJ);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = id2;
                    this.LIZIZ = str2;
                    this.LIZJ = i;
                }
            });
        }
        boolean zLIZJ = C930540aK4.LIZJ();
        boolean z = false;
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (zLIZJ) {
                        JSONObject jSONObject = new JSONObject();
                        C0K04.LJFF("source", str, jSONObject);
                        C0K04.LJFF("user_list", arrayList.toString(), jSONObject);
                        C924630aAX.LIZ.LJJJLIIL(0, "refresh_user_list", jSONObject, zLIZJ);
                    } else {
                        "Failed requirement.".toString();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else {
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C924630aAX.LJJIJL(LJJJI().LJIJJLI(), C930540aK4.LIZJ());
        ((HashSet) C924810aAp.LJ().LJJIFFI).clear();
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        if (C921170a4x.LIZJ(LJJJI()) > 0) {
            z = true;
        }
        c924810aApLJ.LJIIIZ(z);
        C924810aAp.LJ().LJIIL(C921170a4x.LIZJ(LJJJI()));
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("afterFetch linkedGuestNum:");
        sbLIZ.append(C921170a4x.LIZJ(LJJJI()));
        sbLIZ.append(" dataHolder:");
        MultiGuestDataHolder multiGuestDataHolder2 = this.LLJILLL;
        if (multiGuestDataHolder2 != null) {
            numValueOf = Integer.valueOf(multiGuestDataHolder2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("voice_chat", strLIZIZ, null, null);
        MultiGuestDataHolder multiGuestDataHolder3 = this.LLJILLL;
        if (multiGuestDataHolder3 != null) {
            multiGuestDataHolder3.LJJIII(C921170a4x.LIZJ(LJJJI()));
        }
        if (this.LLJILLL != null) {
            C921170a4x.LIZJ(LJJJI());
        }
        for (LinkPlayerInfo linkPlayerInfo2 : LJJJI().LJIJJLI()) {
            C20631086j c20631086j = C20632086k.LIZ;
            User user = linkPlayerInfo2.mUser;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            c20631086j.LIZLLL(id, linkPlayerInfo2.mInteractIdStr);
            int i2 = linkPlayerInfo2.LIZ;
            if (i2 == 2 || (i2 == 1 && linkPlayerInfo2.mRoleType == 4)) {
                Set<Long> set = C924810aAp.LJ().LJJIFFI;
                User user2 = linkPlayerInfo2.mUser;
                if (user2 != null) {
                    lValueOf = Long.valueOf(user2.getId());
                } else {
                    lValueOf = null;
                }
                ((HashSet) set).add(lValueOf);
            }
            if (linkPlayerInfo2.mRoleType == 1) {
                C924810aAp.LJ().LJIILJJIL = linkPlayerInfo2.mInteractIdStr;
            }
        }
        if (!TextUtils.equals(str, "message_linked_list_change") && !TextUtils.equals(str, "fetch_on_moderator_by_message") && !TextUtils.equals(str, "reserve_message")) {
            if (TextUtils.equals(str, "fetch_on_mix_mode_apply_msg_receive")) {
                LJJJLL(5);
                return;
            }
            if (TextUtils.equals(str, "fetch_on_mix_mode_cancel_apply_msg_receive")) {
                LJJJLL(6);
                return;
            } else if (TextUtils.equals(str, "fetch_on_mix_mode_p2p_group_chg_msg_receive")) {
                LJJJLL(7);
                return;
            } else {
                LJJJLL(1);
                return;
            }
        }
        LJJJLL(4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0a6C] */
    public AbstractC922600a7G(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        this.LL = room;
        this.LLILLJJLI = j;
        this.LLILLL = iMessageManager;
        this.LLILZ = lifecycleOwner;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    @Override // X.InterfaceC921620a5g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(final java.lang.String r30, int r31, final kotlin.jvm.functions.Function1<? super X.InterfaceC921200a50<com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList>, kotlin.Unit> r32, final kotlin.jvm.functions.Function1<? super X.InterfaceC921200a50<com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList>, kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC922600a7G.LJJIJ(java.lang.String, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }
}
