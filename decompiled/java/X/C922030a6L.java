package X;

import android.content.Context;
import android.os.Message;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.live.liveinteract.voicechat.main.common.BackgroundTimeOutEvent;
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
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a6L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922030a6L extends AbstractC938410aWl<InterfaceC922040a6M> implements WeakHandler.IHandler, OnMessageListener {
    public final InterfaceC923890a9L LL;
    public boolean LLILLJJLI;
    public MultiGuestDataHolder LLILLL;
    public C924110a9h LLILZ;
    public WeakHandler LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C922020a6K LLIZLLLIL;

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        LinkMessageCenter linkMessageCenter;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C924110a9h c924110a9h = this.LLILZ;
        if (c924110a9h != null && (linkMessageCenter = (LinkMessageCenter) C948450amx.LIZIZ.LJIIJJI("LINK_MESSAGE_CENTER")) != null) {
            linkMessageCenter.LJ(c924110a9h);
        }
        MultiGuestDataHolder multiGuestDataHolder = this.LLILLL;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIIIZ = true;
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLIZLLLIL);
        C920460a3o.LJIIIZ(false);
        C922820a7c.LIZJ(null);
        ((C922540a7A) this.LLIZ.getValue()).LIZIZ();
        super.detachView();
        if (C931780aM4.LIZJ()) {
            C948450amx.LIZIZ.LJI("ZOOM_SERVICE");
        }
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC922040a6M interfaceC922040a6M) {
        InterfaceC922070a6P interfaceC922070a6P;
        Room room;
        DataChannel dataChannel;
        InterfaceC917640ZzG interfaceC917640ZzG;
        LinkMessageCenter linkMessageCenter;
        MultiGuestDataHolder multiGuestDataHolder;
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        ILinkStateAbility iLinkStateAbility;
        super.attachView(interfaceC922040a6M);
        C948450amx c948450amx = C948450amx.LIZIZ;
        this.LLILLL = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (C931780aM4.LIZJ()) {
            c948450amx.LJFF(new ZoomServiceV2(this.dataChannel), "ZOOM_SERVICE");
        }
        InterfaceC922040a6M interfaceC922040a6M2 = (InterfaceC922040a6M) this.mView;
        if (interfaceC922040a6M2 != null && (interfaceC665370Q7zF3 = interfaceC922040a6M2.F3()) != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zF3, ILinkStateAbility.class, null)) != null) {
            subscribeStateChange(iLinkStateAbility);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(MultiLiveGuestMuteAudioEvent.class, this, new AwS594S0100000_15(this, 555));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null && (dataChannel = this.dataChannel) != null && (interfaceC917640ZzG = (InterfaceC917640ZzG) C933980aPc.LJII(dataChannel, InterfaceC917640ZzG.class)) != null && (linkMessageCenter = (LinkMessageCenter) c948450amx.LJIIJJI("LINK_MESSAGE_CENTER")) != null && (multiGuestDataHolder = this.LLILLL) != null) {
            C924110a9h c924110a9h = new C924110a9h(UserService.getInstance().user().getCurrentUserId(), room.liveRoomMode, multiGuestDataHolder, interfaceC917640ZzG, this.dataChannel, new AwS559S0100000_15(this, 539));
            linkMessageCenter.LIZ(c924110a9h);
            this.LLILZ = c924110a9h;
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel4, InterfaceC922070a6P.class)) != null) {
            interfaceC922070a6P.LJJII(1, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
        }
        this.LLILZIL = new WeakHandler(this);
        C915980Zwa.LJIIIIZZ().Fe(this.LLIZLLLIL);
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.zW(FeaturedHashTagChangedChannel.class, Boolean.TRUE);
        }
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Boolean boolValueOf;
        DataChannel dataChannel;
        InterfaceC922040a6M interfaceC922040a6M = (InterfaceC922040a6M) this.mView;
        if (interfaceC922040a6M != null) {
            boolValueOf = Boolean.valueOf(interfaceC922040a6M.isValid());
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIJIIJIL(boolValueOf) && message != null && message.what == 123110 && (dataChannel = this.dataChannel) != null) {
            dataChannel.FQ2(BackgroundTimeOutEvent.class);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Context context;
        LifecycleOwner lifecycleOwner;
        if (iMessage instanceof PerceptionMessage) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            if (C922570a7D.LJ(this.dataChannel, perceptionMessage) == 1) {
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
                if (interfaceC919320a1y != null) {
                    context = interfaceC919320a1y.getContext();
                } else {
                    context = null;
                }
                T t = this.mView;
                if (t instanceof LifecycleOwner) {
                    lifecycleOwner = (LifecycleOwner) t;
                } else {
                    lifecycleOwner = null;
                }
                C922570a7D.LIZLLL(false, currentUserId, perceptionMessage, context, lifecycleOwner, (InterfaceC777420Uea) this.LLILZLL.getValue(), new AwS629S0100000_15(this, 95), AFwS299S0000000_15.get$arr$(48));
            }
        }
    }

    @Override // X.AbstractC938410aWl
    public final void onUserMediaStateListChanged(C922130a6V c922130a6V) {
        InterfaceC922070a6P interfaceC922070a6P;
        super.onUserMediaStateListChanged(c922130a6V);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            List<UserState> list = c922130a6V.LIZIZ;
            ArrayList<UserState> arrayList = new ArrayList();
            for (UserState userState : list) {
                if (!Intrinsics.LJFF(userState.linkMicId, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
                    arrayList.add(userState);
                }
            }
            for (UserState userState2 : arrayList) {
                int i = c922130a6V.LIZ;
                if (i == 2 || i == 3) {
                    int i2 = userState2.audioMuted;
                    int i3 = userState2.onlineUserState;
                    int i4 = userState2.rtcConnection;
                    int i5 = userState2.networkState;
                    interfaceC922070a6P.LJJII(i2, userState2.linkMicId);
                    interfaceC922070a6P.LJIILL(i3, userState2.linkMicId);
                    interfaceC922070a6P.LJJIII(i4, userState2.linkMicId);
                    interfaceC922070a6P.LJJIZ(i5, userState2.linkMicId);
                }
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(MultiLiveUserMediaEvent.class, c922130a6V);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0a6K] */
    public C922030a6L(LifecycleOwner lifecycleOwner, InterfaceC923890a9L interfaceC923890a9L) {
        super(lifecycleOwner);
        this.LL = interfaceC923890a9L;
        this.LLILZLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 538));
        this.LLIZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(159));
        this.LLIZLLLIL = new InterfaceC964770bDH() { // from class: X.0a6K
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
            public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
                return null;
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
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
                if (rtcStartResultMessage.startSuccess) {
                    C922240a6g.LIZIZ(true, false);
                    ((C922540a7A) this.LL.LLIZ.getValue()).LIZ();
                }
                boolean z = rtcStartResultMessage.startSuccess;
                if (z) {
                    C924810aAp.LJ().LJJIJIIJI = true;
                } else {
                    if (!z) {
                        C924810aAp.LJ().LJJIJIIJI = false;
                        return;
                    }
                    throw new C1954807lC();
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
                this.LL.getClass();
                C920460a3o.LJIIIZ(false);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
                boolean zBooleanValue;
                Boolean bool;
                C922030a6L c922030a6L = this.LL;
                c922030a6L.getClass();
                if (permitApplyMessage != null && permitApplyMessage.permitStatus == 1) {
                    C930540aK4.LJJJI(null);
                }
                DataChannel dataChannel = c922030a6L.dataChannel;
                if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(PIPStatusData.class)) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (!c922030a6L.LLILLJJLI) {
                    if (!zBooleanValue) {
                        return;
                    }
                } else if (!zBooleanValue) {
                    return;
                }
                C920460a3o.LJIIIZ(false);
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
                C922820a7c.LIZJ(null);
                ((C922540a7A) this.LL.LLIZ.getValue()).LIZIZ();
            }
        };
    }
}
