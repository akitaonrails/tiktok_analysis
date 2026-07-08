package X;

import Y.AcS496S0100000_15;
import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkInRoomModeratorCancelInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ModeratorMuteGuestOp;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.ModeratorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.moderator.ModeratorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ReplyBizContent;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorInviteCapabilitySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS0S2101100_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multilive_biz.BizInviteParams;

/* JADX INFO: renamed from: X.0a25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919390a25 extends C0JSV<InterfaceC919300a1w> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final Room LL;
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final HashSet<String> LLILZ = new HashSet<>();
    public final HashSet<String> LLILZIL = new HashSet<>();
    public final C11NJ LLILZLL = new C11NJ();
    public MultiGuestAsGuestModeratorManageDialog LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C304201Fw LLJI;
    public final C304201Fw LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C919450a2B LLJJ;
    public final C921670a5l LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C919390a25.class, "userManager", "getUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IModeratorUserManager;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C919390a25.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final InterfaceC917530Zz5 LJJJJLL() {
        C304201Fw c304201Fw = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (InterfaceC917530Zz5) c304201Fw.LIZ();
    }

    public final MultiGuestDataHolder getMultiGuestDataHolder() {
        C304201Fw c304201Fw = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (MultiGuestDataHolder) c304201Fw.LIZ();
    }

    @Override // X.C0JSV
    public final void detachView() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", "detachView");
        super.detachView();
        this.LLILLJJLI.FQ2(ResetRedDotNumEvent.class);
        C919400a26 c919400a26 = (C919400a26) this.LLJILJIL.getValue();
        InterfaceC917530Zz5 interfaceC917530Zz5 = c919400a26.LLILLJJLI;
        if (interfaceC917530Zz5 != null) {
            interfaceC917530Zz5.LJJIIJ(c919400a26);
        }
        c919400a26.LL.zQ2(c919400a26);
        C915980Zwa.LJIIIIZZ().a9(this.LLJJI);
        InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL = LJJJJLL();
        if (interfaceC917530Zz5LJJJJLL != null) {
            interfaceC917530Zz5LJJJJLL.LJJIIJ(this.LLJJ);
        }
        InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL2 = LJJJJLL();
        if (interfaceC917530Zz5LJJJJLL2 != null) {
            interfaceC917530Zz5LJJJJLL2.release();
        }
        this.LLILZ.clear();
        this.LLILZIL.clear();
        this.LLILZLL.LJ();
        InterfaceC918930a1L interfaceC918930a1LLIZ = C914870Zun.LIZ();
        if (!(interfaceC918930a1LLIZ instanceof InterfaceC918930a1L) || interfaceC918930a1LLIZ == null) {
            return;
        }
        interfaceC918930a1LLIZ.onDestroy();
        C948450amx.LIZIZ.LJI("DATA_MULTI_GUEST_INVITE_ROUTING_CAPABILITY");
    }

    @Override // X.C0JSV
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC919300a1w interfaceC919300a1w) {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", "attachView");
        super.attachView(interfaceC919300a1w);
        C919400a26 c919400a26 = (C919400a26) this.LLJILJIL.getValue();
        InterfaceC917530Zz5 interfaceC917530Zz5 = c919400a26.LLILLJJLI;
        if (interfaceC917530Zz5 != null) {
            interfaceC917530Zz5.LJJIJIL(c919400a26);
        }
        c919400a26.LL.CQ2(ResetRedDotNumEvent.class, c919400a26, new AwS594S0100000_15(c919400a26, 885));
        C915980Zwa.LJIIIIZZ().Fe(this.LLJJI);
        DataChannel dataChannel = this.LLILLJJLI;
        dataChannel.BQ2(this.LLILLL, MultiGuestModeratorInviteGuestEvent.class, new AwS594S0100000_15(this, 953));
        dataChannel.BQ2(this.LLILLL, LinkInRoomModeratorCancelInviteGuestEvent.class, new AwS594S0100000_15(this, 954));
        dataChannel.BQ2(this.LLILLL, MultiGuestModeratorKickOutGuestEvent.class, new AwS594S0100000_15(this, 955));
        dataChannel.BQ2(this.LLILLL, MultiGuestModeratorPermitGuestEvent.class, new AwS594S0100000_15(this, 956));
        dataChannel.BQ2(this.LLILLL, ModeratorKickOutGuestByWindowEvent.class, new AwS594S0100000_15(this, 957));
        dataChannel.BQ2(this.LLILLL, ModeratorMuteGuestOp.class, new AwS594S0100000_15(this, 958));
    }

    public static void LJJJLZIJ(final C919390a25 c919390a25, final C919280a1u c919280a1u) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLIZJ;
        final String str = "normal_invite";
        c919390a25.getClass();
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", "sendInvite");
        long id = c919390a25.LL.getId();
        long id2 = c919280a1u.LIZ.getId();
        BizInviteParams bizInviteParams = new BizInviteParams();
        bizInviteParams.source = c919280a1u.LIZLLL;
        bizInviteParams.noticeConfirmed = c919280a1u.LIZJ;
        C949850apD c949850apD = new C949850apD(id, id2, bizInviteParams, null, c919280a1u.LJ, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), c919280a1u.LIZLLL, null, null, 1792);
        final long id3 = c919280a1u.LIZ.getId();
        final int iIntValue = -1;
        if (Intrinsics.LJFF(c919280a1u.LIZIZ, "panel_plus") || Intrinsics.LJFF(c919280a1u.LIZIZ, "panel_Golive")) {
            InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL = c919390a25.LJJJJLL();
            if (interfaceC917530Zz5LJJJJLL != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJJJJLL.LIZ()) != null && (listLIZJ = abstractC928510aGnLIZ.LIZJ()) != null) {
                iIntValue = ((Number) C500260Jjc.LJI(listLIZJ, new AwS594S0100000_15(c919280a1u, 960)).getSecond()).intValue();
            }
            iIntValue++;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJLJLLL(c949850apD, new InterfaceC920680a4A<InviteResult>() { // from class: X.0a1t
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(InviteResult inviteResult) {
                    String strLJIILIIL;
                    AwS224S0300000_15 awS224S0300000_15 = c919280a1u.LJFF;
                    if (awS224S0300000_15 != null) {
                        awS224S0300000_15.invoke(Boolean.TRUE);
                    }
                    MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = c919390a25.LLIZ;
                    if (multiGuestAsGuestModeratorManageDialog != null) {
                        multiGuestAsGuestModeratorManageDialog.LJLIL(id3);
                    }
                    C766270U4b.LIZLLL(2131842764);
                    List listLIZJ2 = C932140aMe.LIZJ(id3);
                    List listLIZLLL = C932140aMe.LIZLLL(id3);
                    long id4 = c919280a1u.LIZ.getId();
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                    String str2 = str;
                    Gson gson = C19748512Ol.LIZJ;
                    String json = GsonProtectorUtils.toJson(gson, listLIZLLL);
                    String json2 = GsonProtectorUtils.toJson(gson, listLIZJ2);
                    int size = listLIZJ2.size();
                    int followStatus = (int) c919280a1u.LIZ.getFollowInfo().getFollowStatus();
                    int i = iIntValue;
                    MultiGuestDataHolder multiGuestDataHolder = c919390a25.getMultiGuestDataHolder();
                    if (multiGuestDataHolder != null) {
                        strLJIILIIL = multiGuestDataHolder.LJIILIIL();
                    } else {
                        strLJIILIIL = "panel_Golive";
                    }
                    C925600aC6.LJIIJ(id4, enumC918970a1PLJII, str2, json, json2, size, followStatus, true, i, strLJIILIIL, false, false, CardStruct.IStatusCode.DEFAULT, false, null, null, false);
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    AwS224S0300000_15 awS224S0300000_15 = c919280a1u.LJFF;
                    if (awS224S0300000_15 != null) {
                        awS224S0300000_15.invoke(Boolean.FALSE);
                    }
                    if (th instanceof C501470JlZ) {
                        if (linkCoreError.errorCode == 4004528) {
                            c919390a25.LJJJZ(C0KVU.LIZ(c919280a1u.LIZ), new AwS416S0200000_15(c919280a1u, c919390a25, 84));
                            return;
                        } else {
                            C501540Jlg.LIZJ(C497740JfY.LJII(), th);
                            return;
                        }
                    }
                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842749, C0KVU.LIZ(c919280a1u.LIZ)));
                }
            });
        }
    }

    public final void LJJJZ(String str, Function0<Unit> function0) {
        Context context;
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
        if (interfaceC919320a1y != null && (context = interfaceC919320a1y.getContext()) != null) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = u.LJJIFFI(context.getString(2131842406), "{0}", str, false);
            c782110Um9.LJII(2131840710);
            c782110Um9.LJFF(R.drawable.epr);
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILL(context.getString(2131842404), new InterfaceC743640TFa() { // from class: X.0a1v
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILLIIL(context.getString(2131842405), new AcS496S0100000_15(function0, 61));
            C786410Ut5.E4(c782110Um9.LIZ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0a5l] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0a2B, X.0a7J] */
    public C919390a25(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        this.LL = room;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = lifecycleOwner;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(378));
        this.LLIZLLLIL = c01gwLIZIZ;
        this.LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(377));
        this.LLJI = new C304201Fw("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        this.LLJIJIL = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
        this.LLJILJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1006));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1007));
        this.LLJILLL = C452501pT.LIZIZ(new C5182020e(this, 464));
        ?? r5 = new C01G1() { // from class: X.0a2B
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", "onFetchFailed");
                InterfaceC919300a1w interfaceC919300a1w = (InterfaceC919300a1w) this.LL.mView;
                if (interfaceC919300a1w != null) {
                    interfaceC919300a1w.sc2();
                }
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                InterfaceC919300a1w interfaceC919300a1w;
                HashMap<String, String> map;
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", "onListChangeByFetch");
                MultiLiveGuestInfoList source = interfaceC921200a50.getSource();
                if (source != null && (map = source.userTagMap) != null) {
                    C932140aMe.LJIIJJI(map);
                }
                if (i != 3 && (interfaceC919300a1w = (InterfaceC919300a1w) this.LL.mView) != null) {
                    interfaceC919300a1w.z21();
                }
            }
        };
        this.LLJJ = r5;
        this.LLJJI = new InterfaceC964770bDH() { // from class: X.0a5l
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
            public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
                BizContentWrapper bizContentWrapper;
                BusinessContent businessContent;
                MultiLiveContent multiLiveContent;
                ReplyBizContent replyBizContent;
                LinkUser linkUser;
                InterfaceC919300a1w interfaceC919300a1w;
                C919390a25 c919390a25 = this.LL;
                c919390a25.getClass();
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleReceiveReplyInviteMessage, message=");
                sbLIZ.append(replyInviteMessage);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1143300frELJIIJJI.getClass();
                AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", strLIZIZ);
                if (c919390a25.mView != 0 && (bizContentWrapper = replyInviteMessage.customMessage.bizContentWrapper) != null && (businessContent = bizContentWrapper.bizContent) != null && (multiLiveContent = businessContent.multiLiveContent) != null && (replyBizContent = multiLiveContent.replyIMContent) != null && replyBizContent.isTurnOffInvitation == 1 && (linkUser = replyInviteMessage.inviteOperator) != null) {
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    Long l = linkUser.userId;
                    if (l != null && currentUserId == l.longValue() && (interfaceC919300a1w = (InterfaceC919300a1w) c919390a25.mView) != null) {
                        interfaceC919300a1w.Gv(C0KVU.LIZ(replyInviteMessage.replyUserInfo));
                    }
                }
            }
        };
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LJFF(new ModeratorBusinessUserManager(room, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), iMessageManager, lifecycleOwner), "MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL = LJJJJLL();
        if (interfaceC917530Zz5LJJJJLL != 0) {
            interfaceC917530Zz5LJJJJLL.LJIILJJIL(0);
            interfaceC917530Zz5LJJJJLL.LJJIJIL(r5);
            interfaceC917530Zz5LJJJJLL.init();
            interfaceC917530Zz5LJJJJLL.setDataChannel(dataChannel);
        }
        if (LinkMicModeratorInviteCapabilitySetting.INSTANCE.enable()) {
            c948450amx.LJFF(new C918650a0t(room, dataChannel, new AwS559S0100000_15(this, 1004), new AwS559S0100000_15(this, 1005), null, (C920310a3Z) c01gwLIZIZ.getValue()), "DATA_MULTI_GUEST_INVITE_ROUTING_CAPABILITY");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0a1s] */
    public final void LJJJJZI(final long j, final String str, String str2) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        final LinkPlayerInfo linkPlayerInfo;
        long followStatus;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kickOut, userId=");
        sbLIZ.append(j);
        sbLIZ.append(", source=");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", strLIZIZ);
        if (this.mView == 0 || this.LLILZIL.contains(str)) {
            return;
        }
        this.LLILZIL.add(str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("roomId:");
        sbLIZ2.append(this.LL.getId());
        sbLIZ2.append("; userId:");
        sbLIZ2.append(j);
        sbLIZ2.append("; secUserId:");
        sbLIZ2.append(str);
        C944240agA.LJFF("moderator kickOut", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL = LJJJJLL();
        if (interfaceC917530Zz5LJJJJLL != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJJJJLL.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(j)) != null) {
            User user = linkPlayerInfo.mUser;
            if (user != null) {
                followStatus = user.getFollowInfo().getFollowStatus();
            } else {
                followStatus = -1;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C921920a6A.LIZ(j, followStatus, C927600aFK.LJII(), null);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != 0) {
                interfaceC954180awCLLJLL.LJZL(new C920420a3k(5, this.LL.getId(), j, linkPlayerInfo.mInteractIdStr), new InterfaceC920680a4A<KickOutResult>() { // from class: X.0a1s
                    @Override // X.InterfaceC920680a4A
                    public final void onSuccess(KickOutResult kickOutResult) {
                        C944240agA.LJ("moderator kickOut_Success");
                        this.LIZ.LLILZIL.remove(str);
                        linkPlayerInfo.LIZLLL = true;
                        if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
                            C766270U4b.LIZLLL(2131843133);
                        }
                        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LIZ.LLIZ;
                        if (multiGuestAsGuestModeratorManageDialog != null) {
                            multiGuestAsGuestModeratorManageDialog.vP1(j);
                        }
                    }

                    @Override // X.InterfaceC920680a4A
                    public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                        Context context;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("throwable:");
                        sbLIZ3.append(th);
                        C944240agA.LJFF("LinkIn_kickOut_Failed", C2188811AlT.LIZIZ(sbLIZ3));
                        this.LIZ.LLILZIL.remove(str);
                        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LIZ.LLIZ;
                        if (multiGuestAsGuestModeratorManageDialog != null) {
                            multiGuestAsGuestModeratorManageDialog.Aw2(th);
                        }
                        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.LIZ.mView;
                        if (interfaceC919320a1y != null) {
                            context = interfaceC919320a1y.getContext();
                        } else {
                            context = null;
                        }
                        C501540Jlg.LIZLLL(context, th, 2131853456);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0a2E] */
    public final void LJJJLIIL(final long j, final String str, final int i, final String str2, Boolean bool, final Function1<? super Boolean, Unit> function1) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("permit, userId=");
        sbLIZ.append(j);
        sbLIZ.append(", interactId=");
        sbLIZ.append(str);
        sbLIZ.append(", linkMicPermitStatus=");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorPresenter", strLIZIZ);
        this.LLILZ.add(str);
        boolean zBooleanValue = false;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        BizPermitParams bizPermitParams = new BizPermitParams(1800L, zBooleanValue, 0);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != 0) {
            interfaceC954180awCLLJLL.LJJJZ(new C920410a3j(this.LL.getId(), j, null, str, i2, bizPermitParams, 64), new InterfaceC920680a4A<PermitResult>() { // from class: X.0a2E
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(PermitResult permitResult) {
                    int i3;
                    LinkPlayerInfo linkPlayerInfo;
                    boolean z;
                    AbstractC928510aGn abstractC928510aGnLIZ;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.TRUE);
                    }
                    this.LLILZ.remove(str);
                    int i4 = i;
                    if (i4 == 2) {
                        C919310a1x.LIZ("MultiGuestAsGuestModeratorPresenter", "moderator reject apply from guest succ");
                        C919390a25 c919390a25 = this;
                        long j2 = j;
                        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = c919390a25.LLIZ;
                        if (multiGuestAsGuestModeratorManageDialog != null) {
                            multiGuestAsGuestModeratorManageDialog.LJLJJL(j2);
                            return;
                        }
                        return;
                    }
                    if (i4 != 1) {
                        return;
                    }
                    C919310a1x.LIZ("MultiGuestAsGuestModeratorPresenter", "moderator permit apply from guest succ");
                    C919390a25 c919390a252 = this;
                    long j3 = j;
                    String str3 = str;
                    c919390a252.getClass();
                    C919310a1x.LIZ("MultiGuestAsGuestModeratorPresenter", "moderator permit apply from guest succ");
                    C20632086k.LIZ.LIZLLL(j3, str3);
                    InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL = c919390a252.LJJJJLL();
                    if (interfaceC917530Zz5LJJJJLL != null) {
                        interfaceC917530Zz5LJJJJLL.LJIJJ(j3, "guest_apply_anchor");
                    }
                    InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL2 = c919390a252.LJJJJLL();
                    if (interfaceC917530Zz5LJJJJLL2 != null) {
                        interfaceC917530Zz5LJJJJLL2.LJIIIZ(j3, "moderator");
                    }
                    MultiGuestDataHolder multiGuestDataHolder = c919390a252.getMultiGuestDataHolder();
                    int i5 = -1;
                    if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder.LIZIZ()) != null) {
                        i3 = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
                    } else {
                        i3 = -1;
                    }
                    MultiGuestDataHolder multiGuestDataHolder2 = c919390a252.getMultiGuestDataHolder();
                    if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder2.LIZIZ()) != null) {
                        i5 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
                    }
                    EnumC918970a1P enumC918970a1PLJFF = C917140ZyS.LJFF(i3, i5);
                    MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog2 = c919390a252.LLIZ;
                    if (multiGuestAsGuestModeratorManageDialog2 != null) {
                        multiGuestAsGuestModeratorManageDialog2.LJLJI(j3);
                    }
                    boolean zLJFF = Intrinsics.LJFF(String.valueOf(j3), c919390a252.LLILLJJLI.gg0(C956880b0Y.class));
                    List listLIZJ = C932140aMe.LIZJ(j3);
                    InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL3 = c919390a252.LJJJJLL();
                    if (interfaceC917530Zz5LJJJJLL3 != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJJJJLL3.LIZ()) != null) {
                        linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(j3);
                    } else {
                        linkPlayerInfo = null;
                    }
                    String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
                    Gson gson = C19748512Ol.LIZJ;
                    String json = GsonProtectorUtils.toJson(gson, C932140aMe.LIZLLL(j3));
                    String json2 = GsonProtectorUtils.toJson(gson, listLIZJ);
                    int size = listLIZJ.size();
                    C930480aJy.LIZ.getClass();
                    int iLJIIJJI = C930480aJy.LJIIJJI(linkPlayerInfo);
                    Map<String, String> mapLIZ = C930160aJS.LIZ(String.valueOf(j3));
                    if (linkPlayerInfo != null && linkPlayerInfo.linkUserType == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C925600aC6.LJIIL(j3, enumC918970a1PLJFF, zLJFF, str3, strLJIILLIIL, json, json2, size, iLJIIJJI, -1L, -1, -1, null, mapLIZ, z, true, false, false, false, null, c919390a252.LLILLJJLI);
                    if (zLJFF) {
                        C921920a6A.LIZLLL(j3);
                    }
                    if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
                        Object[] objArr = new Object[1];
                        String str4 = str2;
                        if (str4 == null) {
                            str4 = "";
                        }
                        objArr[0] = str4;
                        C766270U4b.LJII(2131843132, objArr);
                        return;
                    }
                    C766270U4b.LIZLLL(2131843423);
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL;
                    User user;
                    AbstractC928510aGn abstractC928510aGnLIZ;
                    LinkPlayerInfo linkPlayerInfo;
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                    this.LLILZ.remove(str);
                    int i3 = i;
                    Context context = null;
                    if (i3 == 2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("moderator reject apply from guest fail, throwable=");
                        sbLIZ2.append(th);
                        C919310a1x.LIZ("MultiGuestAsGuestModeratorPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                        C919390a25 c919390a25 = this;
                        long j2 = j;
                        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = c919390a25.LLIZ;
                        if (multiGuestAsGuestModeratorManageDialog != null) {
                            multiGuestAsGuestModeratorManageDialog.LJLJJI(j2, th);
                        }
                        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
                        if (interfaceC919320a1y != null) {
                            context = interfaceC919320a1y.getContext();
                        }
                        C501540Jlg.LIZJ(context, th);
                        return;
                    }
                    if (i3 != 1) {
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("moderator permit apply from guest fail, throwable=");
                    sbLIZ3.append(th);
                    C919310a1x.LIZ("MultiGuestAsGuestModeratorPresenter", C2188811AlT.LIZIZ(sbLIZ3));
                    C919390a25 c919390a252 = this;
                    long j3 = j;
                    String str3 = str;
                    int i4 = i;
                    String str4 = str2;
                    c919390a252.getClass();
                    if (th instanceof C501470JlZ) {
                        int errorCode = ((C501520Jle) th).getErrorCode();
                        if (errorCode == 4004528) {
                            InterfaceC917530Zz5 interfaceC917530Zz5LJJJJLL2 = c919390a252.LJJJJLL();
                            if (interfaceC917530Zz5LJJJJLL2 != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJJJJLL2.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(j3)) != null) {
                                user = linkPlayerInfo.mUser;
                            } else {
                                user = null;
                            }
                            c919390a252.LJJJZ(C0KVU.LIZ(user), new AwS0S2101100_15(c919390a252, j3, str3, i4, str4, 1));
                        } else if ((errorCode == 4004026 || errorCode == 4004029) && (interfaceC917530Zz5LJJJJLL = c919390a252.LJJJJLL()) != null) {
                            interfaceC917530Zz5LJJJJLL.LJJIJ("fetch_on_moderator_permit_failed", 1002, null, null);
                        }
                    }
                    MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog2 = c919390a252.LLIZ;
                    if (multiGuestAsGuestModeratorManageDialog2 != null) {
                        multiGuestAsGuestModeratorManageDialog2.of0(j3, th);
                    }
                    InterfaceC919320a1y interfaceC919320a1y2 = (InterfaceC919320a1y) this.mView;
                    if (interfaceC919320a1y2 != null) {
                        context = interfaceC919320a1y2.getContext();
                    }
                    C501540Jlg.LIZLLL(context, th, 2131853457);
                }
            });
        }
    }
}
