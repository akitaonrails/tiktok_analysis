package X;

import Y.AObjectS530S0100000_15;
import Y.ARunnableS112S0100000_12;
import Y.AfS184S0100000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.InteractCallPlayerEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestJoinDirectSuccessEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkMicAudienceCancelEvent;
import com.bytedance.android.live.liveinteract.api.OnSelfWindowCreatedEvent;
import com.bytedance.android.live.liveinteract.api.RequestSettingSuccessEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3GuestCheckAndShowInvitedDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3GuestOpenLiveSettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.voicechat.main.common.BackgroundTimeOutEvent;
import com.bytedance.android.live.liveinteract.voicechat.main.common.FanTicketIconUrlChannel;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagRequestEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.VoiceChatLayoutFinishEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionOptDelaySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionOptInitSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionRequestGuestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.MultiGuestCallPlayerEventOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLiveFluencyTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVoiceChatLiveCoreRelease;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestOptGetSettingsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatPermissionMgrDetachOpt;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: renamed from: X.0a8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923650a8x extends AbstractC945390ai1<InterfaceC923660a8y> implements OnMessageListener {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public final Room LL;
    public InterfaceC923890a9L LLILLL;
    public boolean LLILZ;
    public Long LLILZIL;
    public boolean LLILZLL;
    public VoiceChatUserInfoFragment LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public MultiGuestV3GuestBeInvitedDialog LLJILJIL;
    public GuestBusinessUserManager LLJILJILJ;
    public String LLJJI;
    public C925490aBv LLJJIII;
    public boolean LLJJIJI;
    public C0THQ LLJJJ;
    public C924670aAb LLJJJIL;
    public boolean LLJJJJ;
    public long LLJJJJJIL;
    public String LLJJJJLIIL;
    public User LLJJL;
    public String LLJL;
    public Boolean LLJLIL;
    public PthreadTimer LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public final C923640a8w LLJZ;
    public EnumC922900a7k LLILLJJLI = EnumC922900a7k.NONE;
    public boolean LLIZ = true;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(160));
    public final C924790aAn LLJILLL = C924790aAn.LIZLLL();
    public String LLJJ = "";
    public boolean LLJJIJIIJIL = true;
    public final C01GW LLJJIJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 541));
    public final C01GW LLJJLIIIJLLLLLLLZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 540));
    public final C923480a8g LLJLLL = new AbstractC923490a8h() { // from class: X.0a8g
        public boolean LL = true;

        @Override // X.InterfaceC922630a7J
        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
            MultiLiveGuestInfoList source;
            String str;
            DataChannel dataChannel;
            MultiLiveGuestInfoList source2 = interfaceC921200a50.getSource();
            if (source2 != null && (str = source2.fanTicketIconUrl) != null && (dataChannel = this.LLILLJJLI.dataChannel) != null) {
                dataChannel.zW(FanTicketIconUrlChannel.class, str);
            }
            if (this.LL) {
                if (this.LLILLJJLI.LLJJIJIIJIL && (source = interfaceC921200a50.getSource()) != null) {
                    Integer numValueOf = Integer.valueOf(source.requestUserStatus);
                    if (C1697810uHb.LJIIJJI(2, 3, 4).contains(Integer.valueOf(numValueOf.intValue()))) {
                        C923650a8x c923650a8x = this.LLILLJJLI;
                        numValueOf.intValue();
                        BizLeaveParams bizLeaveParams = new BizLeaveParams(c923650a8x.LL.getOwner().getId());
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL != null) {
                            interfaceC954180awCLLJLL.LJJLIIIJILLIZJL(new C923520a8k("leave_source_when_enter_room", bizLeaveParams, 10011), new C987180bnQ(c923650a8x, interfaceC921200a50, 7));
                        }
                    }
                }
                this.LL = false;
            }
            InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) this.LLILLJJLI.mView;
            if (interfaceC923660a8y != null) {
                interfaceC923660a8y.B2(interfaceC921200a50.LIZIZ());
            }
        }

        @Override // X.InterfaceC922630a7J
        public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
            ArrayList arrayList = new ArrayList();
            Iterator<LinkListUser> it2 = interfaceC921200a50.LIZIZ().iterator();
            while (it2.hasNext()) {
                arrayList.add(C930540aK4.LIZ(it2.next()));
            }
            InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) this.LLILLJJLI.mView;
            if (interfaceC923660a8y != null) {
                interfaceC923660a8y.B2(arrayList);
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923650a8x.LJJJLIIL():void");
    }

    public final MultiGuestDataHolder getMultiGuestDataHolder() {
        return (MultiGuestDataHolder) this.LLJIJIL.getValue();
    }

    public final void resetStateToNormal() {
        InterfaceC923660a8y interfaceC923660a8y;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestCallPlayerEventOptSetting.getValue() ? InteractCallPlayerEvent.class : InteractStateChangeEvent.class, new C924400aAA(4));
        }
        if (LinkMicLiveFluencyTechSwitchSetting.INSTANCE.isEnable()) {
            C1EOY.LIZ.LJJIFFI();
        }
        C924790aAn.LIZLLL().LJII(0);
        T t = this.mView;
        if (t == 0 || (interfaceC923660a8y = (InterfaceC923660a8y) t) == null) {
            return;
        }
        interfaceC923660a8y.FL2(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        InterfaceC921620a5g interfaceC921620a5g;
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 2) {
            stopInteract("leave_with_detach_view", false, false, 0);
        } else if (LinkMicVoiceChatLiveCoreRelease.INSTANCE.enable()) {
            C500260Jjc.LJJLIIIJJIZ(new AwS559S0100000_15(this, 1097));
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLJZ);
        resetStateToNormal();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C925490aBv c925490aBv = this.LLJJIII;
        if ((c925490aBv instanceof AbstractC945390ai1) && c925490aBv != null) {
            c925490aBv.detachView();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (interfaceC921620a5g = (InterfaceC921620a5g) C933980aPc.LJII(dataChannel2, InterfaceC917640ZzG.class)) != null) {
            interfaceC921620a5g.LJJIIJ(this.LLJLLL);
            interfaceC921620a5g.release();
        }
        if (VoiceChatPermissionMgrDetachOpt.INSTANCE.getValue()) {
            C925090aBH.LIZ = false;
            C925090aBH.LIZIZ = false;
            C925090aBH.LIZJ = null;
            ((C11NJ) C925090aBH.LIZLLL.getValue()).LJ();
        }
        if (!LinkMicLiveFluencyTechSwitchSetting.INSTANCE.isEnable()) {
            C1EOY.LIZ.LJJIFFI();
        }
        C1EOY.LIZ.LJIJJLI();
        C924810aAp.LJ().LJIIIIZZ = true;
        C924670aAb c924670aAb = this.LLJJJIL;
        if (c924670aAb != null) {
            c924670aAb.LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceChatWatchPresenter");
        sbLIZ.append(hashCode());
        C0IK5.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        super.detachView();
    }

    public final long getUserId() {
        return UserService.getInstance().user().getCurrentUserId();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0a8g] */
    public C923650a8x(Room room) {
        this.LL = room;
        C948450amx.LIZIZ.LIZJ(this);
        this.LLJZ = new C923640a8w(this);
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC923660a8y interfaceC923660a8y) {
        Context context;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        IMessageManager iMessageManager;
        MultiLiveUserSettings multiLiveUserSettings;
        String str;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        InterfaceC926460aDU interfaceC926460aDU;
        Room room;
        IMessageManager iMessageManager2;
        super.attachView(interfaceC923660a8y);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (iMessageManager2 = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            GuestBusinessUserManager guestBusinessUserManager = new GuestBusinessUserManager(room, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), iMessageManager2, (LifecycleOwner) this.mView);
            this.LLJILJILJ = guestBusinessUserManager;
            C948450amx.LIZIZ.LJFF(guestBusinessUserManager, "MULTI_GUEST_V3_GUEST_USER_MANAGER");
            MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
            if (multiGuestDataHolder != null) {
                guestBusinessUserManager.LLJILLL = multiGuestDataHolder;
            }
            guestBusinessUserManager.LJJIJIL(this.LLJLLL);
            guestBusinessUserManager.setDataChannel(dataChannel);
            guestBusinessUserManager.init();
            InterfaceC926460aDU interfaceC926460aDU2 = (InterfaceC926460aDU) dataChannel.gg0(C956960b0g.class);
            if (interfaceC926460aDU2 != null) {
                interfaceC926460aDU2.LIZ(guestBusinessUserManager);
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (interfaceC926460aDU = (InterfaceC926460aDU) dataChannel2.gg0(C956960b0g.class)) != null) {
            interfaceC926460aDU.LIZ(new C920840a4Q(true));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJZ);
        Room room2 = this.LL;
        DataChannel dataChannel3 = this.dataChannel;
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2 = null;
        if (interfaceC919320a1y != null) {
            context = interfaceC919320a1y.getContext();
        } else {
            context = null;
        }
        C925490aBv c925490aBv = new C925490aBv(new C925550aC1(context, room2, dataChannel3), this);
        c925490aBv.attachView(interfaceC923660a8y);
        this.LLJJIII = c925490aBv;
        if (MultiGuestOptGetSettingsSetting.INSTANCE.isEnable() && (multiLiveUserSettings = this.LL.multiLiveUserSettings) != null && multiLiveUserSettings.isRoomPackSucAbSettings()) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("VoiceChatWatchPresenter", "getAnchorAbSetting abParam by RoomInfo", null, null);
            Room room3 = this.LL;
            MultiLiveUserSettings multiLiveUserSettings2 = room3.multiLiveUserSettings;
            if (multiLiveUserSettings2 != null && (multiLiveUserApplySettings = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) != null) {
                str = roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam;
            } else {
                str = null;
            }
            String idStr = room3.getIdStr();
            if (idStr == null) {
                idStr = "";
            }
            C931820aM8.LJI(str, idStr);
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.FQ2(RequestSettingSuccessEvent.class);
            }
            C925150aBN.LJII(this.dataChannel);
        } else {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("VoiceChatWatchPresenter", "getAnchorAbSetting abParam by LinkApi", null, null);
            User owner = this.LL.getOwner();
            C480460Ism.LIZ().getClass();
            ((C0J1N) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).isShowGuestLinkHint(this.LL.getId(), owner.getId(), owner.getSecUid(), true).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(autoDispose())).LIZ(new AfS184S0100000_15(this, 201), new C09JN() { // from class: X.0ZxK
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VoiceChatWatchPresenter@8e7f.getAnchorAbSetting$2");
                    C1AZW.LJFF("VoiceChatWatchPresenter", "isShowGuestLinkHint request failed:", ((Throwable) obj).getMessage(), null);
                    C1C7U.LIZIZ("VoiceChatWatchPresenter@8e7f.getAnchorAbSetting$2");
                }
            });
        }
        C924810aAp.LJ().LJIIIIZZ = true;
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null && (iMessageManager = (IMessageManager) dataChannel5.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.CQ2(LinkInRoomGuestReplySucceedEvent.class, this, new AwS594S0100000_15(this, 557));
            dataChannel6.CQ2(LinkInRoomGuestReplyFailedEvent.class, this, new AwS594S0100000_15(this, 558));
            dataChannel6.CQ2(MultiGuestV3GuestOpenLiveSettingEvent.class, this, new AwS594S0100000_15(this, 559));
            dataChannel6.CQ2(BackgroundTimeOutEvent.class, this, new AwS594S0100000_15(this, 560));
            dataChannel6.CQ2(OnSelfWindowCreatedEvent.class, this, new AwS594S0100000_15(this, 561));
            dataChannel6.CQ2(LinkMicAudienceCancelEvent.class, this, new AwS594S0100000_15(this, 562));
            dataChannel6.CQ2(FeaturedHashTagRequestEvent.class, this, new AwS594S0100000_15(this, 563));
            dataChannel6.CQ2(LinkInRoomGuestJoinDirectSuccessEvent.class, this, new AwS594S0100000_15(this, 564));
            dataChannel6.CQ2(MultiGuestV3GuestCheckAndShowInvitedDialogEvent.class, this, new AwS594S0100000_15(this, 556));
        }
        Room room4 = this.LL;
        DataChannel dataChannel7 = this.dataChannel;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL.LLIIJLIL();
        }
        this.LLJJJIL = new C924670aAb(room4, dataChannel7, interfaceC937900aVwLLIIJLIL2, this.LLJILJILJ);
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL2.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJJL(new InterfaceC958970b3v() { // from class: X.0ZzU
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
                public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
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
                    InterfaceC937900aVw interfaceC937900aVwLLIIJLIL3;
                    DataChannel dataChannel8 = this.LL.dataChannel;
                    if (dataChannel8 != null) {
                        dataChannel8.FQ2(VoiceChatLayoutFinishEvent.class);
                    }
                    InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL3 != null && (interfaceC937900aVwLLIIJLIL3 = interfaceC954180awCLLJLL3.LLIIJLIL()) != null) {
                        interfaceC937900aVwLLIIJLIL3.LJLJLJ(this);
                    }
                }
            });
        }
        if (DeleteBluetoothPermissionRequestGuestSetting.INSTANCE.enable()) {
            if (DeleteBluetoothPermissionOptInitSetting.INSTANCE.disable()) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 35);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VoiceChatWatchPresenter");
                sbLIZ.append(hashCode());
                C486790J7d.LIZLLL(aRunnableS112S0100000_12, C2188811AlT.LIZIZ(sbLIZ), DeleteBluetoothPermissionOptDelaySetting.INSTANCE.delayDuration());
                return;
            }
            return;
        }
        C779660UiC.LIZ.LJI();
    }

    public final void cancel(String str) {
        if (!this.LLJJIJI && this.mView != 0) {
            this.LLJJIJI = true;
            C920360a3e.LIZ.getClass();
            C920360a3e.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("position:cancel; roomId:");
            sbLIZ.append(this.LL.getId());
            C944240agA.LJFF("LinkIn_leave", C2188811AlT.LIZIZ(sbLIZ));
            C944730agx.LJIILJJIL(false);
            BizCancelApplyParams bizCancelApplyParams = new BizCancelApplyParams(this.LL.getOwner().getId());
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LJJJJIZL(new C920430a3l(bizCancelApplyParams, 23), new C987190bnR(this, 6));
            }
        }
    }

    public final void leaveAction(boolean z) {
        LiveDialogFragment liveDialogFragment;
        if (this.mView == 0) {
            return;
        }
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = this.LLIZLLLIL;
        if (voiceChatUserInfoFragment != null && (liveDialogFragment = voiceChatUserInfoFragment.LLILLL) != null) {
            liveDialogFragment.dismiss();
        }
        C924790aAn.LIZLLL().LIZLLL = 0L;
        resetStateToNormal();
        C925150aBN.LJIIJ(this.dataChannel);
        if (z) {
            C924810aAp.LJ().getClass();
        }
    }

    public final String logTAG(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_VoiceChatWatchPresenter_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean needForceCallLeaveChannel(String str) {
        if (!Intrinsics.LJFF(str, "leave_source_user_click_cancel_in_preview") && !Intrinsics.LJFF(str, "leave_source_user_timeout_cancel_in_preview") && !Intrinsics.LJFF(str, "play_pip_window")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        PerceptionMessage perceptionMessage;
        PerceptionDialogInfo perceptionDialogInfo;
        InterfaceC919320a1y interfaceC919320a1y;
        C0THQ c0thq;
        C0THQ c0thq2 = null;
        if ((iMessage instanceof PerceptionMessage) && (perceptionMessage = (PerceptionMessage) iMessage) != null) {
            PerceptionMessage perceptionMessage2 = (PerceptionMessage) iMessage;
            if (C922570a7D.LJ(this.dataChannel, perceptionMessage2) != 1 && perceptionMessage2 != null && (perceptionDialogInfo = perceptionMessage2.dialog) != null) {
                int i = perceptionDialogInfo.scene;
                if ((i != 1 && i != 7 && i != 4 && i != 5) || (interfaceC919320a1y = (InterfaceC919320a1y) this.mView) == null) {
                    return;
                }
                if (i == 7) {
                    c0thq2 = new C0THQ(getUserId(), this.LL.getId(), this.dataChannel);
                }
                this.LLJJJ = c0thq2;
                PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
                if (perceptionDialogInfo2 != null) {
                    C782130UmB.LIZJ(perceptionDialogInfo2, interfaceC919320a1y.getContext(), (LifecycleOwner) this.mView, (InterfaceC777420Uea) this.LLJJIJIL.getValue(), new AObjectS530S0100000_15(this, 2), new AObjectS530S0100000_15(this, 3), new AwS629S0100000_15(perceptionMessage, 47), this.dataChannel);
                }
                PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage2.dialog;
                if (perceptionDialogInfo3 == null || (c0thq = this.LLJJJ) == null) {
                    return;
                }
                c0thq.LIZIZ(perceptionDialogInfo3.countDownTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
        }
    }

    public static void LJJJJLL(C923650a8x c923650a8x, int i) {
        if (i != 0) {
            if (i == 1) {
                LJJJJZI(c923650a8x, 1, null, new AwS629S0100000_15(c923650a8x, 48), 30);
                return;
            }
            return;
        }
        LJJJJZI(c923650a8x, 0, new AwS629S0100000_15(c923650a8x, 49), null, 46);
    }

    public final void tryToShowInvitedDialogForFirstFrameTimeout(String str, boolean z) {
        User owner;
        String strLIZ;
        ImageModel avatarThumb;
        long id;
        boolean z2;
        User user = this.LLJJL;
        if ((user == null || (strLIZ = C0KVU.LIZ(user)) == null) && ((owner = this.LL.getOwner()) == null || (strLIZ = C0KVU.LIZ(owner)) == null)) {
            strLIZ = "";
        }
        User user2 = this.LLJJL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = null;
        if (user2 == null || (avatarThumb = user2.getAvatarThumb()) == null) {
            User owner2 = this.LL.getOwner();
            if (owner2 != null) {
                avatarThumb = owner2.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
        }
        User owner3 = this.LLJJL;
        if (owner3 == null && (owner3 = this.LL.getOwner()) == null) {
            id = 0;
        } else {
            id = owner3.getId();
        }
        User user3 = this.LLJJL;
        boolean z3 = false;
        if (user3 != null) {
            User owner4 = this.LL.getOwner();
            if (owner4 != null && user3.getId() == owner4.getId()) {
                z3 = true;
            }
            z2 = !z3;
        } else {
            z2 = false;
        }
        C923640a8w c923640a8w = this.LLJZ;
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ();
        }
        c923640a8w.LIZIZ(new C923670a8z(str, strLJIILLIIL, multiLiveAnchorPanelSettingsLIZIZ, true, z2, strLIZ, avatarThumb, id, 0L, 0, 0, 0L, 15408), str, z);
        C924700aAe.LIZIZ = "anchor_invite_guest";
    }

    public final void exitInteractInNormalWay(String str, boolean z, int i) {
        long followStatus;
        FollowInfo followInfo;
        if (this.mView == 0) {
            return;
        }
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        User owner = this.LL.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 2, null, followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
        stopInteract(str, z, needForceCallLeaveChannel(str), i);
    }

    public final void stopInteract(String str, final boolean z, boolean z2, final int i) {
        String str2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (this.mView == 0) {
            return;
        }
        this.LLJLL = false;
        this.LLJLLIL = false;
        DataChannel dataChannel = this.dataChannel;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C924630aAX.LJJIL(dataChannel, str, C927600aFK.LJII(), false);
        if (Intrinsics.LJFF(str, "quick_leave_normally")) {
            str2 = "leave_normally";
        } else {
            str2 = str;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJLJ(true);
        }
        MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJJLL = -1;
        }
        C924810aAp.LJ().LJIIJJI(false);
        if ((z2 || (this.LLJI && !Intrinsics.LJFF(str, "leave_with_kicked_out") && !Intrinsics.LJFF(str, "leave_with_detach_view"))) && this.LLIZ) {
            if (!this.LLJ) {
                C924810aAp.LJ().LJJIJIL = true;
                this.LLJ = true;
                C920360a3e.LIZ.getClass();
                C920360a3e.LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("position:leaveChannel; roomId:");
                sbLIZ.append(this.LL.getId());
                C944240agA.LJFF("LinkIn_leave", C2188811AlT.LIZIZ(sbLIZ));
                BizLeaveParams bizLeaveParams = new BizLeaveParams(this.LL.getOwner().getId());
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    interfaceC954180awCLLJLL2.LJJLIIIJILLIZJL(new C923520a8k(str2, bizLeaveParams, i), new InterfaceC920680a4A<LeaveChannelResult>() { // from class: X.0a4I
                        @Override // X.InterfaceC920680a4A
                        public final void onSuccess(LeaveChannelResult leaveChannelResult) {
                            long followStatus;
                            FollowInfo followInfo;
                            C944240agA.LJFF("LinkIn_leave_Success", "position:leaveChannel");
                            C923650a8x c923650a8x = this.LIZ;
                            c923650a8x.LLJ = false;
                            c923650a8x.LLJI = false;
                            C924810aAp.LJ().LJJIJIL = true;
                            this.LIZ.leaveAction(z);
                            String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
                            String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
                            String strValueOf = String.valueOf(i);
                            User owner = this.LIZ.LL.getOwner();
                            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                                followStatus = followInfo.getFollowStatus();
                            } else {
                                followStatus = 0;
                            }
                            C01GW<C927600aFK> c01gw2 = C927600aFK.LIZIZ;
                            C307001Gy.LIZ().getClass();
                            C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 6, strValueOf, followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
                        }

                        @Override // X.InterfaceC920680a4A
                        public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                            C923650a8x c923650a8x = this.LIZ;
                            c923650a8x.LLJ = false;
                            if (th != null && c923650a8x.mView != 0) {
                                c923650a8x.logThrowable(th);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("position:leaveChannel; throwable:");
                            sbLIZ2.append(th);
                            C944240agA.LJFF("LinkIn_leave_Failed", C2188811AlT.LIZIZ(sbLIZ2));
                            C924810aAp.LJ().LJJIJIL = false;
                            this.LIZ.leaveAction(z);
                        }
                    });
                }
            }
        } else {
            leaveAction(false);
            this.LLIZ = true;
        }
        C0UEX.LIZIZ(this.dataChannel, str, false);
        this.LLJI = false;
        C924810aAp.LJ().LJII();
        C944240agA.LJI("LinkIn_turnOffEngine", "");
        C917620ZzE.LIZ("connection_end");
        C500260Jjc.LJJLIIIJJIZ(new AwS559S0100000_15(this, 1097));
        MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
        if (multiGuestDialogManagerLIZ != null) {
            multiGuestDialogManagerLIZ.yQ2(AFwS250S0000000_15.get$arr$(80));
        }
        C924700aAe.LIZIZ = "";
        C929810aIt.LIZLLL = 0L;
    }

    public static void LJJJJZI(C923650a8x c923650a8x, int i, AwS629S0100000_15 awS629S0100000_15, AwS629S0100000_15 awS629S0100000_152, int i2) {
        AwS629S0100000_15 awS629S0100000_153 = awS629S0100000_152;
        AwS629S0100000_15 awS629S0100000_154 = awS629S0100000_15;
        if ((i2 & 16) != 0) {
            awS629S0100000_154 = null;
        }
        if ((i2 & 32) != 0) {
            awS629S0100000_153 = null;
        }
        boolean z = C925090aBH.LIZ;
        C925090aBH.LIZIZ(c923650a8x.LL, c923650a8x.dataChannel, (InterfaceC923660a8y) c923650a8x.mView, i, false, null, null, awS629S0100000_154, awS629S0100000_153);
    }
}
