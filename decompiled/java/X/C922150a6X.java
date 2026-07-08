package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.MaxMultiGuestReservationBubbleShowTimesChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAgreeGuideEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestCancelReservationMsgReceivedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestHideReservationBubbleEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestReservationMsgReceivedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestShowReservationBubbleEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RequestFrequencyEndEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicMultiGuestSimplifyReservationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicUserManagerReservationFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.model.message.AudienceCancelContent;
import com.bytedance.android.livesdk.model.message.AudienceReserveContent;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserStateMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922150a6X extends AbstractC921450a5P implements OnMessageListener, C0TBL {
    public final C919550a2L LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public long LLILZLL;

    @InterfaceC948490an1(name = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
    public InterfaceC302401Fe userManager;

    @Override // X.InterfaceC919200a1m
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC919200a1m
    public final boolean LJJIIZ(String str, Function1<? super String, Unit> function1) {
        return false;
    }

    public final Unit LJJLIIIIJ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                abstractC928510aGnLIZ.LJIJJLI();
            }
            interfaceC921460a5Q.OU0(null, null, C2097608Jq.LJ());
        }
        return Unit.LIZ;
    }

    public final void LJJLIIIJILLIZJL() {
        final User user;
        if (this.LLILZLL == 0 && (user = (User) ((LinkedList) this.LLILZIL.getValue()).pollFirst()) != null) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(MultiGuestShowReservationBubbleEvent.class, new InterfaceC934490aQR() { // from class: X.0a6a
                    @Override // X.InterfaceC934490aQR
                    public final String LIZJ() {
                        return C497740JfY.LJIJJ(2131842072, C0KVU.LIZ(user));
                    }

                    @Override // X.InterfaceC934490aQR
                    public final void LIZIZ() {
                        C922150a6X c922150a6X = this;
                        c922150a6X.LLILZLL = 0L;
                        c922150a6X.LJJLIIIJILLIZJL();
                    }

                    @Override // X.InterfaceC934490aQR
                    public final List<ImageModel> LIZLLL() {
                        return Collections.singletonList(user.getAvatarThumb());
                    }

                    @Override // X.InterfaceC934490aQR
                    public final void LIZ(String str) {
                        C921340a5E.LIZIZ(user.getId(), "show", str);
                    }

                    @Override // X.InterfaceC934490aQR
                    public final void LJ(String str) {
                        String str2;
                        C921340a5E.LIZIZ(user.getId(), "click", str);
                        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable()) {
                            C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "multiGuestPopup");
                            c927240aEk.LIZJ.put("link_page_entrance", "multi_guest_popup");
                            c927240aEk.LIZJ.put("request_page", "multi_guest_popup");
                            c927240aEk.LIZ();
                            C922150a6X c922150a6X = this;
                            c922150a6X.getClass();
                            InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(c922150a6X.dataChannel);
                            if ((interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) || C0UIM.LJFF()) {
                                str2 = "more_panel";
                            } else {
                                str2 = "interaction_panel";
                            }
                            c922150a6X.LJJLIIIJ("multi_guest_popup", str2, C2097608Jq.LJ());
                        } else {
                            this.LJJLIIIIJ();
                        }
                        DataChannel dataChannel2 = this.dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.SX0(C956700b0G.class, Boolean.TRUE);
                        }
                    }
                });
            }
            Integer num = (Integer) this.dataChannel.gg0(MaxMultiGuestReservationBubbleShowTimesChannel.class);
            this.dataChannel.zW(MaxMultiGuestReservationBubbleShowTimesChannel.class, Integer.valueOf((num != null ? num.intValue() : 0) - 1));
            this.LLILZLL = user.getId();
        }
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        C20441214yg.LIZIZ("MultiGuestV3AnchorReservationPresenter", "detachView");
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIIJ(this.LLILLL);
        }
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorReservationPresenter", "do not release userManager for union session is true.");
        } else {
            InterfaceC302401Fe interfaceC302401Fe2 = this.userManager;
            if (interfaceC302401Fe2 != null) {
                interfaceC302401Fe2.release();
            }
        }
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.dataChannel.zQ2(this);
        super.detachView();
    }

    @Override // X.AbstractC921450a5P
    public final InterfaceC302401Fe LJJL() {
        return this.userManager;
    }

    @Override // X.C0TBL
    public final void LJJII(User user) {
        this.dataChannel.zW(RequestFrequencyEndEvent.class, user);
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC921460a5Q interfaceC921460a5Q) {
        super.attachView(interfaceC921460a5Q);
        C20441214yg.LIZIZ("MultiGuestV3AnchorReservationPresenter", "attachView");
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJIILJJIL(1);
            interfaceC302401Fe.LJJIJIL(this.LLILLL);
            if (LinkmicUserManagerReservationFixSetting.INSTANCE.isEnabled()) {
                interfaceC302401Fe.init();
            }
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.mMessageManager = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
        }
        ((InterfaceC922160a6Y) this.LLILZ.getValue()).LIZIZ();
        this.dataChannel.CQ2(MultiGuestAgreeGuideEvent.class, this, new AwS594S0100000_15(this, 673));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        User user;
        FollowInfo followInfo;
        Integer num;
        AudienceCancelContent audienceCancelContent;
        User user2;
        DataChannel dataChannel;
        String string;
        Long lValueOf;
        long j;
        String string2;
        if (iMessage instanceof AudienceReserveUserStateMessage) {
            AudienceReserveUserStateMessage audienceReserveUserStateMessage = (AudienceReserveUserStateMessage) iMessage;
            C20441214yg.LIZIZ("MultiGuestV3AnchorReservationPresenter", "handleReservationMessage");
            if (audienceReserveUserStateMessage.type == 1) {
                AudienceReserveContent audienceReserveContent = audienceReserveUserStateMessage.audienceReserveContent;
                String str = "";
                if (audienceReserveContent == null || (string = Long.valueOf(audienceReserveContent.fromUserId).toString()) == null) {
                    string = "";
                }
                Room room = this.LL;
                AudienceReserveUserInfo audienceReserveUserInfo = audienceReserveUserStateMessage.audienceReserveUserInfo;
                if (audienceReserveUserInfo != null && (string2 = Long.valueOf(audienceReserveUserInfo.reserveId).toString()) != null) {
                    str = string2;
                }
                C955400ayA.LJLJLJ(string, room, str, false);
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
                if (interfaceC921460a5Q != null && interfaceC921460a5Q.qa0()) {
                    AudienceReserveContent audienceReserveContent2 = audienceReserveUserStateMessage.audienceReserveContent;
                    if (audienceReserveContent2 != null) {
                        lValueOf = Long.valueOf(audienceReserveContent2.fromUserId);
                    } else {
                        lValueOf = null;
                    }
                    AudienceReserveUserInfo audienceReserveUserInfo2 = audienceReserveUserStateMessage.audienceReserveUserInfo;
                    if (audienceReserveUserInfo2 != null) {
                        j = audienceReserveUserInfo2.reserveId;
                    } else {
                        j = 0;
                    }
                    C921340a5E.LIZ("cohost", lValueOf, j, "not_response");
                }
            }
            InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) this.mView;
            if ((interfaceC921460a5Q2 != null && interfaceC921460a5Q2.qa0()) || 0 != 0) {
                InterfaceC302401Fe interfaceC302401Fe = this.userManager;
                if (interfaceC302401Fe != null) {
                    interfaceC302401Fe.LJJIJ("reserve_message", 2, null, null);
                    return;
                }
                return;
            }
            int i = audienceReserveUserStateMessage.type;
            if (i != 1) {
                if (i != 2 || (audienceCancelContent = audienceReserveUserStateMessage.audienceCancelContent) == null || (user2 = audienceCancelContent.user) == null) {
                    return;
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(MultiGuestCancelReservationMsgReceivedEvent.class, Long.valueOf(user2.getId()));
                }
                ((InterfaceC922160a6Y) this.LLILZ.getValue()).LIZJ(user2);
                if (!LinkmicMultiGuestSimplifyReservationSetting.INSTANCE.enable() || this.LLILZLL != user2.getId() || (dataChannel = this.dataChannel) == null) {
                    return;
                }
                dataChannel.FQ2(MultiGuestHideReservationBubbleEvent.class);
                return;
            }
            AudienceReserveContent audienceReserveContent3 = audienceReserveUserStateMessage.audienceReserveContent;
            if (audienceReserveContent3 == null || (user = audienceReserveContent3.user) == null) {
                return;
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.LC0(MultiGuestReservationMsgReceivedEvent.class, Long.valueOf(user.getId()));
            }
            DataChannel dataChannel4 = this.dataChannel;
            if ((dataChannel4 != null && Intrinsics.LJFF(dataChannel4.gg0(C956770b0N.class), Boolean.TRUE)) || (followInfo = user.getFollowInfo()) == null || ((int) followInfo.getFollowStatus()) != 2) {
                return;
            }
            ((InterfaceC922160a6Y) this.LLILZ.getValue()).LIZ(user);
            if (!LinkmicMultiGuestSimplifyReservationSetting.INSTANCE.enable() || (num = (Integer) this.dataChannel.gg0(MaxMultiGuestReservationBubbleShowTimesChannel.class)) == null || num.intValue() <= 0) {
                return;
            }
            ((LinkedList) this.LLILZIL.getValue()).push(user);
            LJJLIIIJILLIZJL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0a2L] */
    public C922150a6X(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        boolean z;
        super(room, lifecycleOwner);
        this.LLILLL = new C01G1() { // from class: X.0a2L
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.LL.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.k02();
                }
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                HashMap<String, String> map;
                InterfaceC921460a5Q interfaceC921460a5Q;
                if (i != 3 && (interfaceC921460a5Q = (InterfaceC921460a5Q) this.LL.mView) != null) {
                    interfaceC921460a5Q.B2(interfaceC921200a50.LIZIZ());
                }
                MultiLiveGuestInfoList source = interfaceC921200a50.getSource();
                if (source != null && (map = source.userTagMap) != null) {
                    C932140aMe.LJIIJJI(map);
                }
            }
        };
        this.LLILZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 610));
        this.LLILZIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(242));
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER") != null) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init needProvideUserManager: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiGuestV3AnchorReservationPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            C948450amx c948450amx = C948450amx.LIZIZ;
            AnchorBusinessUserManager anchorBusinessUserManager = new AnchorBusinessUserManager(this.LL, 0L, iMessageManager);
            anchorBusinessUserManager.setDataChannel(dataChannel);
            c948450amx.LJFF(anchorBusinessUserManager, "MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        }
        C948450amx.LIZIZ.LIZJ(this);
    }

    public final void LJJLIIIJ(String str, String str2, Map<String, String> map) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                abstractC928510aGnLIZ.LJIJJLI();
            }
            interfaceC921460a5Q.OU0(str, str2, map);
        }
    }
}
