package X;

import Y.AcS496S0100000_15;
import Y.AfS1S0110100_15;
import Y.AfS45S1100000_12;
import Y.AfS4S0200100_15;
import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkAnchorOpenOrClickUserCardEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorCancelInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestUserChangedEvent;
import com.bytedance.android.live.liveinteract.api.OnlyPushRtcEngineAlreadyCloseChannel;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.VoiceChatAnchorInviteForJsb;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorMuteGuestOp;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorInProgressEvent;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagCountDownRemindEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multilive_biz.BizInviteParams;

/* JADX INFO: renamed from: X.0a5O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921440a5O extends AbstractC921450a5P implements OnMessageListener {
    public final Room LLILLL;
    public final DataChannel LLILZ;
    public InterfaceC924270a9x LLILZIL;
    public Boolean LLILZLL;
    public final HashMap<String, Boolean> LLIZ;
    public final C11NJ LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final List<Long> LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C919540a2K LLJJIII;
    public final C921650a5j LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    @Override // X.InterfaceC919200a1m
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC919200a1m
    public final boolean LJJIIZ(String str, Function1<? super String, Unit> function1) {
        return false;
    }

    public final C920310a3Z LJJLIIIIJ() {
        return (C920310a3Z) this.LLJI.getValue();
    }

    public final Unit LJJLIIIJ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            InterfaceC302401Fe interfaceC302401Fe = this.LLILLJJLI;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                abstractC928510aGnLIZ.LJIJJLI();
            }
            interfaceC921460a5Q.OU0(null, null, C2097608Jq.LJ());
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        String strU3;
        RtcUserInfo rtcUserInfoG0;
        String str;
        if (!((ArrayList) this.LLJILJIL).isEmpty()) {
            List<Long> list = this.LLJILJIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            String str2 = "";
            if (interfaceC954180awCLLJLL2 == null || (strU3 = interfaceC954180awCLLJLL2.U3()) == null) {
                strU3 = "";
            }
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL3 != null && (rtcUserInfoG0 = interfaceC954180awCLLJLL3.G0()) != null && (str = rtcUserInfoG0.linkMicId) != null) {
                str2 = str;
            }
            C925600aC6.LJIILLIIL(strU3, str2, this.LL.getStreamType().logStreamingType, arrayList);
        }
        C921920a6A.LJI(null, null);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(OnlyPushRtcEngineAlreadyCloseChannel.class, "voice_chat_anchor_widget_destroy");
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLJJIJI);
        if (C931780aM4.LIZ() && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
            interfaceC954180awCLLJLL.LJJZ(null);
        }
        C914580ZuK.LIZ = null;
        ((C922200a6c) this.LLJILLL.getValue()).LIZIZ();
        ((C922540a7A) this.LLJJ.getValue()).LIZIZ();
        C921640a5i.LIZLLL();
        ((LinkedHashMap) C921640a5i.LLILZLL).clear();
        C1EOY.LIZ.LJIJJ();
        super.detachView();
        DataChannelGlobal.LLILZ.zQ2(this);
        this.LLIZLLLIL.LJ();
        C922820a7c.LIZJ(null);
        if (C931780aM4.LIZJ()) {
            C948450amx.LIZIZ.LJI("ZOOM_SERVICE");
        }
    }

    public final MultiGuestDataHolder getMultiGuestDataHolder() {
        return (MultiGuestDataHolder) this.LLJ.getValue();
    }

    public final void onEnterBackground() {
        this.LLILZLL = Boolean.TRUE;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.pause();
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.LIZJ("onEnterBackground");
        }
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC921460a5Q interfaceC921460a5Q) {
        Boolean boolValueOf;
        InterfaceC926460aDU interfaceC926460aDU;
        Room room;
        IMessageManager iMessageManager;
        super.attachView(interfaceC921460a5Q);
        if (C931780aM4.LIZJ()) {
            C948450amx.LIZIZ.LJFF(new ZoomServiceV2(this.LLILZ), "ZOOM_SERVICE");
        }
        C924810aAp.LJ().LJIIIIZZ = true;
        C924810aAp.LJ().LJJIZ = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            AnchorBusinessUserManager anchorBusinessUserManager = new AnchorBusinessUserManager(room, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), iMessageManager, (LifecycleOwner) this.mView);
            anchorBusinessUserManager.setDataChannel(this.LLILZ);
            anchorBusinessUserManager.init();
            C948450amx.LIZIZ.LJFF(anchorBusinessUserManager, "MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
            if (multiGuestDataHolder != null) {
                anchorBusinessUserManager.LLJILLL = multiGuestDataHolder;
            }
            this.LLILLJJLI = anchorBusinessUserManager;
            InterfaceC926460aDU interfaceC926460aDU2 = (InterfaceC926460aDU) dataChannel.gg0(C956960b0g.class);
            if (interfaceC926460aDU2 != null) {
                interfaceC926460aDU2.LIZ(anchorBusinessUserManager);
            }
            anchorBusinessUserManager.LJJIJIL(this.LLJJIII);
        }
        IMessageManager iMessageManager2 = (IMessageManager) this.LLILZ.gg0(C776250Uch.class);
        this.mMessageManager = iMessageManager2;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.mMessageManager;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
            iMessageManager3.addMessageListener(C001A.LINK_MIC_SIGNAL.getIntType(), this);
            iMessageManager3.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
            if (C917860Zzc.LIZIZ()) {
                iMessageManager3.addMessageListener(C001A.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
            }
            iMessageManager3.addMessageListener(C001A.MULTI_GUEST_PUNISH_CENTER_ACTION_MSG.getIntType(), this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (interfaceC926460aDU = (InterfaceC926460aDU) dataChannel2.gg0(C956960b0g.class)) != null) {
            interfaceC926460aDU.LIZ(new C920840a4Q(true));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJJIJI);
        C914580ZuK.LIZ = this.dataChannel;
        ((C922200a6c) this.LLJILLL.getValue()).LIZ();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJZ(new InterfaceC969870bLV() { // from class: X.0aPi
                @Override // X.InterfaceC969870bLV
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC969870bLV
                public final List<PosIdentity> LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final long LJFF(String str) {
                    return 0L;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJI(String str) {
                    return true;
                }

                @Override // X.InterfaceC969870bLV
                public final double LJIIIIZZ(Layout layout, String str) {
                    return 0.0d;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIIIZ(String str, String str2, String str3, RectF rectF) {
                    return true;
                }

                @Override // X.InterfaceC969870bLV
                public final int LJIIJJI() {
                    return 0;
                }

                @Override // X.InterfaceC969870bLV
                public final void LJIILIIL(C966870bGf c966870bGf) {
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIILJJIL(String str) {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIILL() {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIILLIIL(String str) {
                    return true;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIJI() {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final double LJIJJ(String str) {
                    return 0.0d;
                }

                @Override // X.InterfaceC969870bLV
                public final ImageModel LJJI(String str) {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJJIFFI(Layout layout, String str, RectF rectF) {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final RectF LJJII(RectF rectF) {
                    return rectF;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIIZILJ() {
                    return C925150aBN.LJJIII();
                }

                @Override // X.InterfaceC969870bLV
                public final EnumC1276740jKS LJIJJLI() {
                    return EnumC1276740jKS.RENDER_HIDDEN;
                }

                @Override // X.InterfaceC969870bLV
                public final LinkUserState L8(String str) {
                    return new LinkUserState();
                }

                @Override // X.InterfaceC969870bLV
                public final int LIZLLL(String str) {
                    InterfaceC665370Q7z interfaceC665370Q7zF3;
                    ILinkStateAbility iLinkStateAbility;
                    UserState userStateL8;
                    if (Intrinsics.LJFF(str, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
                        if (C500260Jjc.LJJJI(this.LIZ.LLILZLL)) {
                            return 2;
                        }
                        return 1;
                    }
                    InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) this.LIZ.mView;
                    if (interfaceC921460a5Q2 != null && (interfaceC665370Q7zF3 = interfaceC921460a5Q2.F3()) != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zF3, ILinkStateAbility.class, null)) != null && (userStateL8 = iLinkStateAbility.L8(str)) != null) {
                        return userStateL8.onlineUserState;
                    }
                    return 0;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJ(String str) {
                    InterfaceC922070a6P interfaceC922070a6P;
                    DataChannel dataChannel3 = this.LIZ.dataChannel;
                    if (dataChannel3 != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel3, InterfaceC922070a6P.class)) != null) {
                        return interfaceC922070a6P.LJIJI(str);
                    }
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final int LJIIL(String str) {
                    InterfaceC922070a6P interfaceC922070a6P;
                    DataChannel dataChannel3 = this.LIZ.dataChannel;
                    if (dataChannel3 != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel3, InterfaceC922070a6P.class)) != null) {
                        return interfaceC922070a6P.LJIIZILJ(str);
                    }
                    return 0;
                }

                @Override // X.InterfaceC969870bLV
                public final int LJIL(String str) {
                    InterfaceC922070a6P interfaceC922070a6P;
                    DataChannel dataChannel3 = this.LIZ.dataChannel;
                    if (dataChannel3 != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel3, InterfaceC922070a6P.class)) != null) {
                        return interfaceC922070a6P.LJJIIZI(str);
                    }
                    return 0;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJJIII(String str) {
                    if (LJIIL(str) >= LiveSeiTalkSetting.INSTANCE.volumeThreshold()) {
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final ImageModel LJIIJ(String str, boolean z) {
                    AbstractC928510aGn abstractC928510aGnLIZ;
                    LinkPlayerInfo linkPlayerInfo;
                    User user;
                    InterfaceC302401Fe interfaceC302401Fe = this.LIZ.LLILLJJLI;
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJFF(str)) != null && (user = linkPlayerInfo.mUser) != null) {
                        if (z) {
                            ImageModel avatarThumb = user.getAvatarThumb();
                            if (avatarThumb == null) {
                                return user.getAvatarMedium();
                            }
                            return avatarThumb;
                        }
                        ImageModel avatarMedium = user.getAvatarMedium();
                        if (avatarMedium != null) {
                            return avatarMedium;
                        }
                        return user.getAvatarThumb();
                    }
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final RectF LJIJ(RectF rectF, long j, long j2) {
                    return C933980aPc.LIZLLL(rectF, j, j2);
                }

                @Override // X.InterfaceC969870bLV
                public final RectF LJJ(RectF rectF, long j, long j2) {
                    return C933980aPc.LIZLLL(rectF, j, j2);
                }

                @Override // X.InterfaceC969870bLV
                public final JSONObject LJII(C1275030jHh c1275030jHh, List<? extends C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, HashMap<String, Map<String, JSONObject>> map4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3) {
                    InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL2 != null) {
                        layout.setScene(interfaceC954180awCLLJLL2.scene());
                        layout.setVersion(interfaceC954180awCLLJLL2.getSessionVersion());
                    }
                    return C969340bKe.LIZLLL(c1275030jHh, list, map, layout, str, str2, interfaceC969870bLV, map3, i3);
                }
            });
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        Context context = null;
        if (interfaceC954180awCLLJLL2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC954180awCLLJLL2.A0());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LJJLIIIJLJLI(true, this.LLILLL);
        } else {
            Room room2 = this.LLILLL;
            C20441214yg.LIZIZ("VoiceChatAnchorPresenter", "changeLayout");
            InterfaceC924270a9x interfaceC924270a9x = this.LLILZIL;
            if (interfaceC924270a9x != null) {
                InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
                if (interfaceC919320a1y != null) {
                    context = interfaceC919320a1y.getContext();
                }
                interfaceC924270a9x.LIZ(room2, context, this.dataChannel, new AwS416S0200000_15(this, room2, 70));
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, MuteMicChannel.class, new AwS594S0100000_15(this, 822));
            dataChannel3.CQ2(LinkInRoomAnchorInviteGuestEvent.class, this, new AwS594S0100000_15(this, 823));
            dataChannel3.CQ2(LinkInRoomAnchorCancelInviteGuestEvent.class, this, new AwS594S0100000_15(this, 824));
            dataChannel3.CQ2(AnchorKickOutGuestByWindowEvent.class, this, new AwS594S0100000_15(this, 825));
            dataChannel3.CQ2(LinkInRoomAnchorKickOutGuestEvent.class, this, new AwS594S0100000_15(this, 826));
            dataChannel3.CQ2(LinkAnchorOpenOrClickUserCardEvent.class, this, new AwS594S0100000_15(this, 827));
            dataChannel3.CQ2(LinkInRoomAnchorPermitGuestEvent.class, this, new AwS594S0100000_15(this, 828));
            dataChannel3.CQ2(FeaturedHashTagCountDownRemindEvent.class, this, new AwS594S0100000_15(this, 829));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(AnchorMuteGuestOp.class, this, new AwS594S0100000_15(this, 830));
        dataChannelGlobal.CQ2(VoiceChatAnchorInviteForJsb.class, this, new AwS594S0100000_15(this, 820));
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(AnchorKickOutGuestByWindowEvent.class, this, new AwS594S0100000_15(this, 821));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.zW(FeaturedHashTagChangedChannel.class, Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL(com.bytedance.android.livesdk.comp.api.linkcore.model.UnifiedReplyInviteMessage r36) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921440a5O.LJJLIIIJILLIZJL(com.bytedance.android.livesdk.comp.api.linkcore.model.UnifiedReplyInviteMessage):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void LJJLIIIJJIZ(C919670a2X c919670a2X) {
        User user;
        Set<Long> setLLIIJI;
        List<LinkUser> listLIZLLL;
        AbstractC928510aGn abstractC928510aGnLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkInRoomAnchorInviteGuestEvent invite source:");
        sbLIZ.append(c919670a2X.LIZIZ);
        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
        try {
            user = c919670a2X.LIZ;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C919310a1x.LIZJ("VoiceChatAnchorPresenter", "invite failed, ", e);
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C919310a1x.LIZJ("VoiceChatAnchorPresenter", "invite failed, ", e2);
        }
        if (user != null) {
            long id = user.getId();
            if (id != 0) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room == null) {
                    room = (Room) dataChannelGlobal.gg0(C930930aKh.class);
                }
                LinkPlayerInfo linkPlayerInfoLJIIIZ = null;
                if (room != null && Long.valueOf(room.getId()) != null) {
                    if (c919670a2X.LIZIZ != null) {
                        InterfaceC302401Fe interfaceC302401Fe = this.LLILLJJLI;
                        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                            linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ, id);
                        }
                        String strLIZ = C0KVU.LIZ(c919670a2X.LIZ);
                        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                        C307001Gy.LIZ().getClass();
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL == null || (setLLIIJI = interfaceC954180awCLLJLL.LLIIJI()) == null) {
                            setLLIIJI = C08CX.INSTANCE;
                        }
                        if (setLLIIJI.contains(Long.valueOf(id)) && (!Intrinsics.LJFF(c919670a2X.LIZIZ, "invitation_tab_viewers"))) {
                            C766270U4b.LIZLLL(2131842764);
                        } else if (linkPlayerInfoLJIIIZ != null && linkPlayerInfoLJIIIZ.LIZ == 1 && linkPlayerInfoLJIIIZ.mRoleType == 2) {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842750, strLIZ));
                        } else {
                            int i = C924810aAp.LJ().LJJII;
                            C307001Gy.LIZ().getClass();
                            if (i >= C927600aFK.LJIIL()) {
                                new AwS381S0200000_15(this, c919670a2X, 112);
                                C766270U4b.LIZLLL(2131842763);
                                C924630aAX.LJJIZ(true);
                            } else if (linkPlayerInfoLJIIIZ != null && linkPlayerInfoLJIIIZ.LIZ == 2) {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842745, strLIZ));
                            } else {
                                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                                if (interfaceC954180awCLLJLL2 != null && (listLIZLLL = interfaceC954180awCLLJLL2.LIZLLL()) != null) {
                                    Iterator<LinkUser> it2 = listLIZLLL.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        LinkUser next = it2.next();
                                        Long l = next.userId;
                                        if (l != null && l.longValue() == id) {
                                            if (next != null) {
                                            }
                                        }
                                    }
                                }
                                if (((HashSet) C924810aAp.LJ().LJJIFFI).contains(Long.valueOf(id))) {
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842749, strLIZ));
                                } else {
                                    LJJLIIIJLLLLLLLZ(this, c919670a2X);
                                    return;
                                }
                            }
                        }
                        ?? r1 = c919670a2X.LJI;
                        if (r1 != 0) {
                            r1.invoke(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJJLJ(boolean z) {
        int i;
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        InterfaceC922070a6P interfaceC922070a6P;
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            interfaceC922070a6P.LJJII(i, strLJIIJ);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LIZJ("voice chat anchor switch audio");
        }
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC665370Q7zF3 = interfaceC921460a5Q.F3();
        } else {
            interfaceC665370Q7zF3 = null;
        }
        if (changeMediaState(interfaceC665370Q7zF3, 3, i) || !LinkMicStateSetting.INSTANCE.enableRTCSend()) {
            return;
        }
        this.LLJJIJIIJIL.getValue().getClass();
        String strLIZ = C921550a5Z.LIZ(strLJIIJ, z);
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.sendRoomMessage(strLIZ);
        }
    }

    @Override // X.AbstractC921450a5P
    public final void Lc2(C977800bYI c977800bYI) {
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC921460a5Q.Lc2(c977800bYI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r15) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921440a5O.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // X.AbstractC938410aWl
    public final void onUserMediaStateListChanged(C922130a6V c922130a6V) {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfo;
        int i;
        super.onUserMediaStateListChanged(c922130a6V);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC922070a6P interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(this.dataChannel, InterfaceC922070a6P.class);
        if (interfaceC922070a6P != null) {
            List<UserState> list = c922130a6V.LIZIZ;
            ArrayList<UserState> arrayList = new ArrayList();
            for (UserState userState : list) {
                if (true ^ Intrinsics.LJFF(userState.linkMicId, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
                    arrayList.add(userState);
                }
            }
            for (UserState userState2 : arrayList) {
                int i2 = c922130a6V.LIZ;
                if (i2 == 2 || i2 == 3) {
                    int iLJIIJ = interfaceC922070a6P.LJIIJ(userState2.linkMicId);
                    int iLJJIIZI = interfaceC922070a6P.LJJIIZI(userState2.linkMicId);
                    int i3 = userState2.audioMuted;
                    int i4 = userState2.onlineUserState;
                    int i5 = userState2.rtcConnection;
                    int i6 = userState2.networkState;
                    interfaceC922070a6P.LJJII(i3, userState2.linkMicId);
                    interfaceC922070a6P.LJIILL(i4, userState2.linkMicId);
                    interfaceC922070a6P.LJJIII(i5, userState2.linkMicId);
                    interfaceC922070a6P.LJJIZ(i6, userState2.linkMicId);
                    int iLJIIJ2 = interfaceC922070a6P.LJIIJ(userState2.linkMicId);
                    boolean zLJIJI = interfaceC922070a6P.LJIJI(userState2.linkMicId);
                    if (iLJIIJ != iLJIIJ2) {
                        linkedHashMap.put(userState2.linkMicId, Boolean.valueOf(zLJIJI));
                    }
                    InterfaceC302401Fe interfaceC302401Fe = this.LLILLJJLI;
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJIIZILJ(userState2.linkMicId)) != null && iLJJIIZI != i3) {
                        long id = linkPlayerInfo.mUser.getId();
                        String str = linkPlayerInfo.mInteractIdStr;
                        if (i3 == 1) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        C917690ZzL.LIZ(0, i, false, str, id);
                    }
                }
            }
            boolean zFilterStateType = LinkMicStateSetting.INSTANCE.filterStateType();
            if ((c922130a6V.LIZJ || zFilterStateType) && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
                interfaceC954180awCLLJLL.LIZJ("onRemoteMediaChanged");
            }
            this.LLILZ.LC0(MultiLiveUserMediaEvent.class, c922130a6V);
        }
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC921460a5Q.At2(linkedHashMap);
        }
    }

    public static final void LJJLIIIJJI(C921440a5O c921440a5O, long j) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfoLJIIIZ;
        InterfaceC302401Fe interfaceC302401Fe = c921440a5O.LLILLJJLI;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ, j)) != null) {
            long id = linkPlayerInfoLJIIIZ.mUser.getId();
            String secUid = linkPlayerInfoLJIIIZ.mUser.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            c921440a5O.LJIIIZ(id, secUid, "kickout_with_popup_confirm", null);
            return;
        }
        C1AZW.LJIILL("VoiceChatAnchorPresenter", "handlePerceptionMessage Failed, receive perception Message, but multi guest uid is unavailable", null, null);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static void LJJLIIIJLLLLLLLZ(final C921440a5O c921440a5O, final C919670a2X c919670a2X) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLIZJ;
        final String str = "normal_invite";
        c921440a5O.getClass();
        String strLJIIIZ = C921180a4y.LJIIIZ(C915980Zwa.LJIIIIZZ());
        if (strLJIIIZ.length() == 0) {
            C1AZW.LJFF("VoiceChatAnchorPresenter", "layoutId is null", null, null);
            ?? r1 = c919670a2X.LJI;
            if (r1 != 0) {
                r1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        long id = c921440a5O.LLILLL.getId();
        long id2 = c919670a2X.LIZ.getId();
        BizInviteParams bizInviteParams = new BizInviteParams();
        bizInviteParams.source = c919670a2X.LIZLLL;
        bizInviteParams.noticeConfirmed = c919670a2X.LIZJ;
        C949850apD c949850apD = new C949850apD(id, id2, bizInviteParams, strLJIIIZ, c919670a2X.LJFF, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), c919670a2X.LIZLLL, null, null, 1792);
        final long id3 = c919670a2X.LIZ.getId();
        C921640a5i.LIZ(1, c919670a2X.LIZIZ, id3, "room");
        final int iIntValue = -1;
        if (Intrinsics.LJFF(c919670a2X.LIZIZ, "panel_plus") || Intrinsics.LJFF(c919670a2X.LIZIZ, "panel_Golive")) {
            InterfaceC302401Fe interfaceC302401Fe = c921440a5O.LLILLJJLI;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLIZJ = abstractC928510aGnLIZ.LIZJ()) != null) {
                iIntValue = ((Number) C500260Jjc.LJI(listLIZJ, new AwS594S0100000_15(c919670a2X, 832)).getSecond()).intValue();
            }
            iIntValue++;
        }
        c921440a5O.LJJLIIIIJ().LIZ(String.valueOf(id3));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null) {
            return;
        }
        interfaceC954180awCLLJLL.LJLJJI(c949850apD, new InterfaceC920680a4A<InviteResult>() { // from class: X.0a0X
            /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.functions.Function1] */
            @Override // X.InterfaceC920680a4A
            public final void onSuccess(InviteResult inviteResult) {
                String strLJIILIIL;
                ?? r2 = c919670a2X.LJI;
                if (r2 != 0) {
                    r2.invoke(Boolean.TRUE);
                }
                C921640a5i.LLILZLL.put(Long.valueOf(id3), C0KVU.LIZ(c919670a2X.LIZ));
                C766270U4b.LIZLLL(2131842764);
                List listLIZJ2 = C932140aMe.LIZJ(id3);
                List listLIZLLL = C932140aMe.LIZLLL(id3);
                c921440a5O.getMultiGuestDataHolder();
                long id4 = c919670a2X.LIZ.getId();
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                String str2 = str;
                Gson gson = C19748512Ol.LIZJ;
                String json = GsonProtectorUtils.toJson(gson, listLIZLLL);
                String json2 = GsonProtectorUtils.toJson(gson, listLIZJ2);
                int size = listLIZJ2.size();
                int followStatus = (int) c919670a2X.LIZ.getFollowInfo().getFollowStatus();
                int i = iIntValue;
                MultiGuestDataHolder multiGuestDataHolder = c921440a5O.getMultiGuestDataHolder();
                if (multiGuestDataHolder != null) {
                    strLJIILIIL = multiGuestDataHolder.LJIILIIL();
                } else {
                    strLJIILIIL = null;
                }
                c921440a5O.getClass();
                C925600aC6.LJIIJ(id4, enumC918970a1PLJII, str2, json, json2, size, followStatus, true, i, strLJIILIIL, false, false, CardStruct.IStatusCode.DEFAULT, false, null, c919670a2X.LJII, false);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.09AY, kotlin.jvm.functions.Function1] */
            @Override // X.InterfaceC920680a4A
            public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                ?? r12 = c919670a2X.LJI;
                if (r12 != 0) {
                    r12.invoke(Boolean.FALSE);
                }
                if (th instanceof C501470JlZ) {
                    if (linkCoreError.errorCode == 4004528) {
                        c921440a5O.LJJLIL(C0KVU.LIZ(c919670a2X.LIZ), new AwS416S0200000_15(c921440a5O, c919670a2X, 71));
                    } else {
                        C501540Jlg.LIZJ(C497740JfY.LJII(), th);
                    }
                } else {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842749, C0KVU.LIZ(c919670a2X.LIZ)));
                }
                C921640a5i.LJII(id3, false);
            }
        });
    }

    public final void LJJLIIIJLJLI(boolean z, Room room) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", "requestUpdateSetting");
        MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
        Context context = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (multiGuestDataHolder != null) {
            multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ();
        } else {
            multiLiveAnchorPanelSettingsLIZIZ = null;
        }
        long jLiveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
        if (multiLiveAnchorPanelSettingsLIZIZ != null) {
            long jLIZIZ = C963140bAe.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestUpdateSetting revenueShare:");
            sbLIZ.append(multiLiveAnchorPanelSettingsLIZIZ.LIZ);
            sbLIZ.append(" anchorPanelSettings:");
            MultiGuestDataHolder multiGuestDataHolder2 = getMultiGuestDataHolder();
            if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder2.LIZIZ()) != null) {
                numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ2.hashCode());
            }
            sbLIZ.append(numValueOf);
            C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
            C480460Ism.LIZ().getClass();
            MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
            long id = room.getId();
            long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
            int i2 = multiLiveAnchorPanelSettingsLIZIZ.layoutType;
            int i3 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
            int i4 = multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq;
            int i5 = multiLiveAnchorPanelSettingsLIZIZ.onlyAllowFollowerReq;
            int i6 = multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting;
            int i7 = multiLiveAnchorPanelSettingsLIZIZ.LIZ;
            int i8 = multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFriends;
            int i9 = multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFollowers;
            int i10 = multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromOthers;
            int i11 = multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout;
            if (C931790aM5.LIZIZ()) {
                i = 4;
            } else {
                i = 0;
            }
            C19487311Lz.LIZIZ(multiLiveApi.updateAnchorPanelSettings(id, jLJIILL, jLiveId, i2, i3, i4, i5, null, "", i, i6, 0L, i7, i8, i9, i10, 0, i11, C924810aAp.LJ().LJJIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LLIZLLLIL, new AfS4S0200100_15(jLIZIZ, this, multiLiveAnchorPanelSettingsLIZIZ, 4), new AfS1S0110100_15(jLIZIZ, this, z, 2), null, null, 56);
            return;
        }
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
        if (interfaceC919320a1y != null) {
            context = interfaceC919320a1y.getContext();
        }
        C501540Jlg.LIZLLL(context, new Throwable("param illegal."), 2131851936);
    }

    public final void LJJLIL(String str, Function0<Unit> function0) {
        Context context;
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
        if (interfaceC919320a1y != null && (context = interfaceC919320a1y.getContext()) != null) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = u.LJJIFFI(context.getString(2131842406), "{0}", str, false);
            c782110Um9.LJII(2131840710);
            c782110Um9.LJFF(R.drawable.epr);
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILL(context.getString(2131842404), new InterfaceC743640TFa() { // from class: X.0a0Z
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILLIIL(context.getString(2131842405), new AcS496S0100000_15(function0, 48));
            C786410Ut5.E4(c782110Um9.LIZ());
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0a2K] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0a5j] */
    public C921440a5O(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(room, lifecycleOwner);
        this.LLILLL = room;
        this.LLILZ = dataChannel;
        this.LLIZ = new HashMap<>();
        this.LLIZLLLIL = new C11NJ();
        this.LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(322));
        this.LLJI = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(321));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 852));
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(320));
        this.LLJILLL = C452501pT.LIZIZ(new AwS416S0200000_15(lifecycleOwner, this, 69));
        this.LLJJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(323));
        this.LLJJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 853));
        this.LLJJIII = new C01G1() { // from class: X.0a2K
            public final List<Long> LL = new ArrayList();

            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.LLILLJJLI.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.k02();
                }
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                HashMap<String, String> map;
                this.LLILLJJLI.LLILZ.FQ2(MultiGuestUserChangedEvent.class);
                MultiLiveGuestInfoList source = interfaceC921200a50.getSource();
                if (source != null && (map = source.userTagMap) != null) {
                    C932140aMe.LJIIJJI(map);
                }
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.LLILLJJLI.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.B2(interfaceC921200a50.LIZIZ());
                }
                Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZ().iterator();
                while (it2.hasNext()) {
                    ((ArrayList) this.LL).contains(Long.valueOf(it2.next().mUser.getId()));
                }
                ((ArrayList) this.LL).clear();
                List<Long> list = this.LL;
                List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                Iterator<LinkPlayerInfo> it3 = listLIZ.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Long.valueOf(it3.next().mUser.getId()));
                }
                ((ArrayList) list).addAll(arrayList);
            }
        };
        this.LLJJIJI = new InterfaceC964770bDH() { // from class: X.0a5j
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
            public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
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
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
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
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
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
            public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
                DataChannel dataChannel2 = this.LL.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(InteractStateChangeEvent.class, new C924400aAA(7));
                }
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LJJLIIIJL(true, null, "voice_chat_mute", false, false);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJJI(String str, SurfaceView surfaceView) {
                if (surfaceView != null) {
                    C439101nJ.LJI(surfaceView);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIZ(String str, long j) {
                long followStatus;
                AbstractC928510aGn abstractC928510aGnLIZ;
                LinkPlayerInfo linkPlayerInfoLJII;
                User user;
                C921440a5O c921440a5O = this.LL;
                if (c921440a5O.mView != 0) {
                    InterfaceC302401Fe interfaceC302401Fe = c921440a5O.LLILLJJLI;
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfoLJII = C921170a4x.LJII(abstractC928510aGnLIZ, str)) != null && (user = linkPlayerInfoLJII.mUser) != null) {
                        String idStr = user.getIdStr();
                        if (idStr != null) {
                            c921440a5O.LJJLIIIIJ().LIZIZ(idStr);
                        }
                        FollowInfo followInfo = linkPlayerInfoLJII.mUser.getFollowInfo();
                        if (followInfo != null) {
                            followStatus = followInfo.getFollowStatus();
                        } else {
                            followStatus = 0;
                        }
                        if (j == 1) {
                            long id = linkPlayerInfoLJII.mUser.getId();
                            String secUid = linkPlayerInfoLJII.mUser.getSecUid();
                            if (secUid == null) {
                                secUid = "";
                            }
                            c921440a5O.LJIIIZ(id, secUid, "kickout_with_rtc_user_leaved", null);
                        }
                        if (!linkPlayerInfoLJII.LIZLLL) {
                            C766270U4b.LIZLLL(2131852849);
                        }
                    } else {
                        followStatus = -1;
                    }
                    InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921440a5O.mView;
                    if (interfaceC921460a5Q != null) {
                        interfaceC921460a5Q.CD();
                    }
                    long jLIZIZ = C20632086k.LIZ.LIZIZ(str);
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    C921920a6A.LJFF(jLIZIZ, followStatus, C927600aFK.LJII(), c921440a5O.dataChannel);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
                C921440a5O c921440a5O = this.LL;
                if (!Intrinsics.LJFF(c921440a5O.LLILZLL, Boolean.TRUE) && c921440a5O.mView != 0 && c949400aoU != null) {
                    C949400aoU c949400aoU2 = new C949400aoU(c949400aoU.LIZ, c949400aoU.LIZIZ, new InterfaceC965060bDk() { // from class: X.0a5n
                        @Override // X.InterfaceC965060bDk
                        public final InterfaceC754220TiG create() {
                            return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createVoiceChatVideoClientFactory();
                        }
                    }, c949400aoU.LIZLLL, c949400aoU.LJ, "#000000", c949400aoU.LJI, true, null, null, null, null, 7936);
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL != null) {
                        interfaceC954180awCLLJLL.b9(c949400aoU2);
                    }
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
                if (rtcStartResultMessage.startSuccess) {
                    C1EOY c1eoy = C1EOY.LIZ;
                    C930480aJy.LIZ.getClass();
                    AwS100S1000000_15 awS100S1000000_15LJIILIIL = C930480aJy.LJIILIIL();
                    if (!Intrinsics.LJFF(C1EOY.LJIILJJIL, "linkmic_anchor_period")) {
                        c1eoy.LJJI();
                        C1EOY.LJIILJJIL = "linkmic_anchor_period";
                        c1eoy.LJIIJJI(awS100S1000000_15LJIILIIL);
                        c1eoy.LJIILLIIL();
                    }
                    C922240a6g.LIZIZ(true, false);
                    ((C922540a7A) this.LL.LLJJ.getValue()).LIZ();
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
                C784440Upu.LIZ().LIZIZ(new C465900IOu(7));
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
                long jLJIILIIL;
                LinkPlayerInfo linkPlayerInfoLJIIIZ;
                String strLIZIZ;
                AbstractC928510aGn abstractC928510aGnLIZ;
                AbstractC928510aGn abstractC928510aGnLIZ2;
                AbstractC928510aGn abstractC928510aGnLIZ3;
                AbstractC928510aGn abstractC928510aGnLIZ4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive guest[");
                sbLIZ.append(str);
                sbLIZ.append("] firstRemoteAudioFrame");
                C919310a1x.LIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                C921440a5O c921440a5O = this.LL;
                if (c921440a5O.mView != 0) {
                    InterfaceC302401Fe interfaceC302401Fe = c921440a5O.LLILLJJLI;
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ4 = interfaceC302401Fe.LIZ()) != null) {
                        jLJIILIIL = C921170a4x.LJIILIIL(abstractC928510aGnLIZ4, str);
                    } else {
                        jLJIILIIL = 0;
                    }
                    C921920a6A.LJ(jLJIILIIL, C921640a5i.LJI(jLJIILIIL), str);
                    InterfaceC302401Fe interfaceC302401Fe2 = c921440a5O.LLILLJJLI;
                    if (interfaceC302401Fe2 != null && (abstractC928510aGnLIZ3 = interfaceC302401Fe2.LIZ()) != null) {
                        linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ3, jLJIILIIL);
                    } else {
                        linkPlayerInfoLJIIIZ = null;
                    }
                    InterfaceC302401Fe interfaceC302401Fe3 = c921440a5O.LLILLJJLI;
                    if (interfaceC302401Fe3 == null || (strLIZIZ = interfaceC302401Fe3.LIZIZ(jLJIILIIL)) == null) {
                        strLIZIZ = "";
                    }
                    InterfaceC302401Fe interfaceC302401Fe4 = c921440a5O.LLILLJJLI;
                    if (interfaceC302401Fe4 != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe4.LIZ()) != null) {
                        C921170a4x.LIZJ(abstractC928510aGnLIZ2);
                    }
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                    String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
                    C930480aJy.LIZ.getClass();
                    int iLJIIJJI = C930480aJy.LJIIJJI(linkPlayerInfoLJIIIZ);
                    InterfaceC302401Fe interfaceC302401Fe5 = c921440a5O.LLILLJJLI;
                    if (interfaceC302401Fe5 != null && (abstractC928510aGnLIZ = interfaceC302401Fe5.LIZ()) != null) {
                        C921170a4x.LJIILL(abstractC928510aGnLIZ, str);
                    }
                    C925600aC6.LJJIFFI(jLJIILIIL, enumC918970a1PLJII, str, strLJIILLIIL, iLJIIJJI, strLIZIZ, 0, C930160aJS.LIZ(String.valueOf(jLJIILIIL)), c921440a5O.dataChannel);
                    C921640a5i.LJII(jLJIILIIL, false);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
                C921440a5O c921440a5O = this.LL;
                c921440a5O.getClass();
                c921440a5O.LJJLIIIJILLIZJL(directJoinMessage.toUnifiedReplyInviteMessage());
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
                Long lValueOf;
                Long lValueOf2;
                BusinessContent businessContent;
                MultiLiveContent multiLiveContent;
                InviteBizContent inviteBizContent;
                C921440a5O c921440a5O = this.LL;
                c921440a5O.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleReceiveModeratorInviteMessage, message=");
                sbLIZ.append(inviteMessage);
                C919310a1x.LIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                User user = inviteMessage.inviteeUserInfo;
                User user2 = null;
                if (user != null) {
                    lValueOf = Long.valueOf(user.getId());
                } else {
                    lValueOf = null;
                }
                User user3 = inviteMessage.inviteeUserInfo;
                if (lValueOf != null && user3 != null) {
                    C921640a5i.LLILZLL.put(Long.valueOf(lValueOf.longValue()), C0KVU.LIZ(user3));
                }
                C920310a3Z c920310a3ZLJJLIIIIJ = c921440a5O.LJJLIIIIJ();
                User user4 = inviteMessage.inviteeUserInfo;
                if (user4 != null) {
                    lValueOf2 = Long.valueOf(user4.getId());
                } else {
                    lValueOf2 = null;
                }
                c920310a3ZLJJLIIIIJ.LIZ(String.valueOf(lValueOf2));
                BizContentWrapper bizContentWrapper = inviteMessage.customMessage.bizContentWrapper;
                if (bizContentWrapper != null && (businessContent = bizContentWrapper.bizContent) != null && (multiLiveContent = businessContent.multiLiveContent) != null && (inviteBizContent = multiLiveContent.inviteIMContent) != null) {
                    user2 = inviteBizContent.operatorUserInfo;
                }
                C01I3.LIZIZ(2131843145, "sent_invitation", user2, inviteMessage.inviteeUserInfo);
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC964770bDH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LLJJIJIIJIL(X.InterfaceC954180awC r12, com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage r13) {
                /*
                    Method dump skipped, instruction units count: 220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C921650a5j.LLJJIJIIJIL(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage):void");
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCancelInviteMessageReceived message=");
                sbLIZ.append(cancelInviteMessage);
                C20441214yg.LIZIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                Player player = cancelInviteMessage.invitee;
                if (player != null) {
                    this.LL.LJJLIIIIJ().LIZIZ(String.valueOf(player.uid));
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
                Long l = leaveMessage.leftUser.userId;
                if (l != null) {
                    this.LL.LJJLIIIIJ().LIZIZ(String.valueOf(l.longValue()));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
            @Override // X.InterfaceC964770bDH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LLLLLLJ(X.InterfaceC954180awC r32, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage r33) {
                /*
                    Method dump skipped, instruction units count: 403
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C921650a5j.LLLLLLJ(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage):void");
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
                this.LL.LJJLIIIJILLIZJL(replyInviteMessage.toUnifiedReplyInviteMessage());
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
                if (z) {
                    C1EOY.LIZ.LJIJJ();
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
                String str = linkUser.linkMicId;
                if (str != null) {
                    C920830a4P.LJ.put(str, Long.valueOf(SystemClock.uptimeMillis()));
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
                C784440Upu.LIZ().LIZIZ(new C465900IOu(7));
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
                List<LinkUser> listLIZIZ = C925600aC6.LIZIZ(this.LL.LLJILJIL, interfaceC958070b2T.LIZLLL());
                C921440a5O c921440a5O = this.LL;
                for (LinkUser linkUser : (ArrayList) listLIZIZ) {
                    Long l = linkUser.userId;
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    if (l == null || l.longValue() != currentUserId) {
                        Long l2 = linkUser.userId;
                        if (l2 != null) {
                            long jLongValue = l2.longValue();
                            ((ArrayList) c921440a5O.LLJILJIL).add(Long.valueOf(jLongValue));
                        }
                    }
                }
            }
        };
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(324));
        C948450amx.LIZIZ.LIZJ(this);
    }

    @Override // X.AbstractC921450a5P
    public final void LJJJJLI(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
        Long lValueOf;
        final User user;
        User user2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchorMuteGuest ");
        final String strLIZIZ = null;
        if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (C922570a7D.LIZ(this.dataChannel) && !C922570a7D.LIZIZ(this.dataChannel)) {
            C20441214yg.LJIIIZ("VoiceChatAnchorPresenter", "[anchorMuteGuest] isInViewerLimit");
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            InterfaceC302401Fe interfaceC302401Fe = this.LLILLJJLI;
            if (interfaceC302401Fe != null) {
                strLIZIZ = interfaceC302401Fe.LIZIZ(user.getId());
            }
            if (i != 1) {
                if (i == 2) {
                    ((C01GD) this.LLJJI.getValue()).LIZ(0, user);
                    C922800a7a.LIZ(0, 2, strLIZIZ, C920830a4P.LJI, "toast_show", false, user.getId());
                    return;
                }
                return;
            }
            final C01GD c01gd = (C01GD) this.LLJJI.getValue();
            c01gd.getClass();
            if (!InterfaceC1106030et7.i7.LIZIZ().booleanValue()) {
                c01gd.LIZ(2, user);
                C922800a7a.LIZ(0, 1, strLIZIZ, C920830a4P.LJI, "panel_click", false, user.getId());
                return;
            }
            C782110Um9 c782110Um9 = new C782110Um9(c01gd.LIZ);
            c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843487, C0KVU.LIZ(user));
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843486));
            c782110Um9.LJIILIIL(2131843485, new InterfaceC743640TFa() { // from class: X.01Hu
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    InterfaceC1106030et7.i7.LJFF(Boolean.FALSE);
                    c01gd.LIZ(2, user);
                    C922800a7a.LIZ(0, 1, strLIZIZ, C920830a4P.LJI, "click", false, user.getId());
                }
            });
            c782110Um9.LJIIJ(2131843484, new InterfaceC743640TFa() { // from class: X.0a5S
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            C786410Ut5.E4(c782110Um9.LIZ());
            C922800a7a.LIZ(0, 1, strLIZIZ, C920830a4P.LJI, "show", false, user.getId());
        }
    }

    public final void LJJLIIJ(String str, String str2, Map<String, String> map) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            InterfaceC302401Fe interfaceC302401Fe = this.LLILLJJLI;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                abstractC928510aGnLIZ.LJIJJLI();
            }
            interfaceC921460a5Q.OU0(str, str2, map);
        }
    }

    @Override // X.AbstractC921450a5P, X.InterfaceC919200a1m
    public final void LJIIIZ(final long j, String str, String str2, LinkPlayerInfo linkPlayerInfo) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        final LinkPlayerInfo linkPlayerInfo2;
        long followStatus;
        if (this.mView == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId:");
        sbLIZ.append(this.LL.getId());
        sbLIZ.append("; userId:");
        sbLIZ.append(j);
        sbLIZ.append("; secUserId:");
        sbLIZ.append(str);
        C944240agA.LJFF("LinkIn_kickOut", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC302401Fe interfaceC302401Fe = this.LLILLJJLI;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo2 = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(j)) != null) {
            User user = linkPlayerInfo2.mUser;
            if (user != null) {
                followStatus = user.getFollowInfo().getFollowStatus();
            } else {
                followStatus = -1;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C921920a6A.LIZ(j, followStatus, C927600aFK.LJII(), null);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LLIIIL(new C920420a3k(AbstractC921450a5P.LJJJJZI(str2), this.LL.getId(), j, linkPlayerInfo2.mInteractIdStr), new InterfaceC920680a4A<KickOutResult>() { // from class: X.0a1r
                    @Override // X.InterfaceC920680a4A
                    public final void onSuccess(KickOutResult kickOutResult) {
                        C944240agA.LJ("LinkIn_kickOut_Success");
                        C921440a5O c921440a5O = this.LIZ;
                        c921440a5O.getClass();
                        linkPlayerInfo2.LIZLLL = true;
                        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921440a5O.mView;
                        if (interfaceC921460a5Q != null) {
                            interfaceC921460a5Q.vP1(j);
                        }
                    }

                    @Override // X.InterfaceC920680a4A
                    public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                        Boolean boolValueOf;
                        if (th != null) {
                            this.LIZ.logThrowable(th);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("throwable:");
                        sbLIZ2.append(th);
                        C944240agA.LJFF("LinkIn_kickOut_Failed", C2188811AlT.LIZIZ(sbLIZ2));
                        C921440a5O c921440a5O = this.LIZ;
                        c921440a5O.getClass();
                        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921440a5O.mView;
                        if (interfaceC921460a5Q != null) {
                            interfaceC921460a5Q.Aw2(th);
                        }
                        InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) this.LIZ.mView;
                        Context context = null;
                        if (interfaceC921460a5Q2 != null) {
                            boolValueOf = Boolean.valueOf(interfaceC921460a5Q2.isViewValid());
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf)) {
                            InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.LIZ.mView;
                            if (interfaceC919320a1y != null) {
                                context = interfaceC919320a1y.getContext();
                            }
                            C501540Jlg.LIZLLL(context, th, 2131853456);
                        }
                    }
                });
            }
        }
    }

    public final void LJJLIIIJL(final int i, final long j, final String str, Boolean bool) {
        boolean zBooleanValue = false;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
        }
        String strLJFF = C933980aPc.LJFF();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        BizPermitParams bizPermitParams = new BizPermitParams(1800L, zBooleanValue, 0);
        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", "permit apply");
        LJJLIIIIJ().LIZIZ(String.valueOf(j));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJJJZ(new C920410a3j(this.LL.getId(), j, strLJFF, str, i2, bizPermitParams, 64), new InterfaceC920680a4A<PermitResult>() { // from class: X.0a2F
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(PermitResult permitResult) {
                    int i3;
                    Object objGg0;
                    AbstractC928510aGn abstractC928510aGnLIZ;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
                    int i4 = i;
                    if (i4 == 2) {
                        C919310a1x.LIZ("VoiceChatAnchorPresenter", "reject apply from guest succ");
                        C921440a5O c921440a5O = this;
                        long j2 = j;
                        c921440a5O.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onRejectApplySuccess userId:");
                        sbLIZ.append(j2);
                        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921440a5O.mView;
                        if (interfaceC921460a5Q != null) {
                            interfaceC921460a5Q.ud1(j2);
                            return;
                        }
                        return;
                    }
                    if (i4 != 1) {
                        return;
                    }
                    C919310a1x.LIZ("VoiceChatAnchorPresenter", "permit apply from guest succ");
                    C921440a5O c921440a5O2 = this;
                    long j3 = j;
                    String str2 = str;
                    c921440a5O2.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPermitApplySuccess userId:");
                    sbLIZ2.append(j3);
                    sbLIZ2.append(", interactId:");
                    sbLIZ2.append(str2);
                    C20441214yg.LIZIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                    C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.MULTI_GUEST_START, null);
                    C919310a1x.LIZ("VoiceChatAnchorPresenter", "permit apply from guest succ");
                    C20632086k.LIZ.LIZLLL(j3, str2);
                    InterfaceC302401Fe interfaceC302401Fe = c921440a5O2.LLILLJJLI;
                    if (interfaceC302401Fe != null) {
                        interfaceC302401Fe.LJIJJ(j3, "guest_apply_anchor");
                    }
                    MultiGuestDataHolder multiGuestDataHolder = c921440a5O2.getMultiGuestDataHolder();
                    int i5 = -1;
                    if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder.LIZIZ()) != null) {
                        i3 = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
                    } else {
                        i3 = -1;
                    }
                    MultiGuestDataHolder multiGuestDataHolder2 = c921440a5O2.getMultiGuestDataHolder();
                    if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder2.LIZIZ()) != null) {
                        i5 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
                    }
                    EnumC918970a1P enumC918970a1PLJFF = C917140ZyS.LJFF(i3, i5);
                    InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) c921440a5O2.mView;
                    if (interfaceC921460a5Q2 != null) {
                        interfaceC921460a5Q2.Zh(j3, false);
                    }
                    String strValueOf = String.valueOf(j3);
                    DataChannel dataChannel = c921440a5O2.dataChannel;
                    LinkPlayerInfo linkPlayerInfoLJIIIZ = null;
                    if (dataChannel != null) {
                        objGg0 = dataChannel.gg0(C956880b0Y.class);
                    } else {
                        objGg0 = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(strValueOf, objGg0);
                    List listLIZJ = C932140aMe.LIZJ(j3);
                    InterfaceC302401Fe interfaceC302401Fe2 = c921440a5O2.LLILLJJLI;
                    if (interfaceC302401Fe2 != null && (abstractC928510aGnLIZ = interfaceC302401Fe2.LIZ()) != null) {
                        linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ, j3);
                    }
                    String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
                    Gson gson = C19748512Ol.LIZJ;
                    String json = GsonProtectorUtils.toJson(gson, C932140aMe.LIZLLL(j3));
                    String json2 = GsonProtectorUtils.toJson(gson, listLIZJ);
                    int size = listLIZJ.size();
                    C930480aJy.LIZ.getClass();
                    int iLJIIJJI = C930480aJy.LJIIJJI(linkPlayerInfoLJIIIZ);
                    Map<String, String> mapLIZ = C930160aJS.LIZ(String.valueOf(j3));
                    c921440a5O2.getClass();
                    C925600aC6.LJIIL(j3, enumC918970a1PLJFF, zLJFF, str2, strLJIILLIIL, json, json2, size, iLJIIJJI, -1L, -1, -1, null, mapLIZ, false, false, false, false, false, null, c921440a5O2.dataChannel);
                    if (zLJFF) {
                        C921920a6A.LIZLLL(j3);
                    }
                    C766270U4b.LIZLLL(2131843423);
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    Boolean boolValueOf;
                    InterfaceC921460a5Q interfaceC921460a5Q;
                    User user;
                    AbstractC928510aGn abstractC928510aGnLIZ;
                    LinkPlayerInfo linkPlayerInfo;
                    int i3 = i;
                    if (i3 == 2) {
                        this.getClass();
                        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", "onRejectApplyFail");
                        return;
                    }
                    if (i3 != 1) {
                        return;
                    }
                    C921440a5O c921440a5O = this;
                    long j2 = j;
                    String str2 = str;
                    c921440a5O.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPermitApplyFail userId:");
                    sbLIZ.append(j2);
                    sbLIZ.append(", interactId:");
                    sbLIZ.append(str2);
                    sbLIZ.append(", error:");
                    sbLIZ.append(linkCoreError.errorMsg);
                    C20441214yg.LIZIZ("VoiceChatAnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    if (th != null && (!(th instanceof C501470JlZ) || ((C501520Jle) th).getErrorCode() != 4004599)) {
                        c921440a5O.logThrowable(th);
                    }
                    c921440a5O.LLIZ.remove(str2);
                    Context context = null;
                    if (th instanceof C501470JlZ) {
                        int errorCode = ((C501520Jle) th).getErrorCode();
                        if (errorCode == 4004528) {
                            InterfaceC302401Fe interfaceC302401Fe = c921440a5O.LLILLJJLI;
                            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(j2)) != null) {
                                user = linkPlayerInfo.mUser;
                            } else {
                                user = null;
                            }
                            c921440a5O.LJJLIL(C0KVU.LIZ(user), new C919500a2G(i3, j2, c921440a5O, str2));
                        } else if (errorCode != 4004026 && errorCode != 4004029) {
                            if (errorCode == 4004599 && (interfaceC921460a5Q = (InterfaceC921460a5Q) c921440a5O.mView) != null) {
                                interfaceC921460a5Q.AF();
                            }
                        } else {
                            InterfaceC302401Fe interfaceC302401Fe2 = c921440a5O.LLILLJJLI;
                            if (interfaceC302401Fe2 != null) {
                                interfaceC302401Fe2.LJJIJ("permit_failed", 4, null, null);
                            }
                        }
                    }
                    InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) c921440a5O.mView;
                    if (interfaceC921460a5Q2 != null) {
                        boolValueOf = Boolean.valueOf(interfaceC921460a5Q2.isViewValid());
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) c921440a5O.mView;
                        if (interfaceC919320a1y != null) {
                            context = interfaceC919320a1y.getContext();
                        }
                        C501540Jlg.LIZLLL(context, th, 2131853457);
                    }
                    InterfaceC921460a5Q interfaceC921460a5Q3 = (InterfaceC921460a5Q) c921440a5O.mView;
                    if (interfaceC921460a5Q3 == null) {
                        return;
                    }
                    interfaceC921460a5Q3.of0(j2, th);
                }
            });
        }
    }

    @Override // X.AbstractC921450a5P
    public final C931860aMC LJJJZ(final DataChannel dataChannel, final InterfaceC931760aM2 interfaceC931760aM2, final MultiGuestDataHolder multiGuestDataHolder, final LinkControlDataHolder linkControlDataHolder, final int i, C921060a4m c921060a4m, C920520a3u c920520a3u, String str, C928710aH7 c928710aH7) {
        return new C931860aMC(dataChannel, interfaceC931760aM2, multiGuestDataHolder, linkControlDataHolder, i) { // from class: X.0aMD
            @Override // X.C931860aMC, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return LJIIJ(layoutInflater, viewGroup);
            }

            @Override // X.C931860aMC
            /* JADX INFO: renamed from: LJIIIZ */
            public final C931830aM9 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i2;
                if (C932490aND.LIZIZ()) {
                    i2 = R.layout.hek;
                } else {
                    i2 = R.layout.hel;
                }
                return new C931840aMA(C485880J3q.LIZ.LIZJ(i2, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
            }
        };
    }

    @Override // X.AbstractC921450a5P, X.InterfaceC919200a1m
    public final void LJIJI(long j, String str, int i, boolean z, String str2, String str3, InterfaceC923280a8M interfaceC923280a8M, LinkPlayerInfo linkPlayerInfo, Integer num, Function1 function1) {
        if (this.mView == 0) {
            return;
        }
        if (i == 2) {
            LJJLIIIJL(2, j, str, Boolean.FALSE);
            return;
        }
        if (z) {
            if (this.LLIZ.containsKey(str)) {
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.of0(j, new Throwable("Current user is permitting"));
                    return;
                }
                return;
            }
            this.LLIZ.put(str, Boolean.TRUE);
            C19487311Lz.LIZIZ(C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(5L).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LLIZLLLIL, new AfS45S1100000_12(this, str, 3), null, null, null, 60);
        }
        C20632086k.LIZ.LIZLLL(j, str);
        C924810aAp.LJ().LJIIJJI(true);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(MultiGuestAnchorInProgressEvent.class);
        }
        C924810aAp c924810aAp = (C924810aAp) this.LLJILJILJ.getValue();
        if (c924810aAp != null) {
            c924810aAp.LJIIIIZZ(j);
        }
        if (this.mView != 0) {
            C924810aAp.LJ().LJJIIZI = true;
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            System.currentTimeMillis();
            c924810aApLJ.getClass();
        }
        LJJLIIIJL(i, j, str, Boolean.FALSE);
    }
}
