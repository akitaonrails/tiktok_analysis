package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS117S0100000_17;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForMaskEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
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
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C932410aN5 extends AbstractC937370aV5 {
    public final C11NZ<List<User>> LLIZ;
    public final DataChannel LLIZLLLIL;
    public final Runnable LLJ;
    public User LLJI;
    public LiveIconView LLJIJIL;
    public C1324720kZq LLJILJIL;
    public LiveIconView LLJILJILJ;
    public LiveIconView LLJILLL;
    public LiveIconView LLJJ;
    public C16F5 LLJJI;
    public LiveIconView LLJJIII;
    public LiveIconView LLJJIJI;
    public C498540Jgq LLJJIJIIJIL;
    public C11NJ LLJJIJIL;
    public Room LLJJJ;
    public boolean LLJJJIL;
    public User LLJJJJ;
    public Animatable LLJJJJJIL;
    public LifecycleOwner LLJJJJLIIL;
    public final C11NJ LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final String LLJLL;
    public final C922000a6I LLJLLIL;
    public final C932580aNM LLJLLL;
    public final int LLJZ;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder oMultiGuestDataHolder;

    @InterfaceC947260al2(name = "ZOOM_SERVICE")
    public InterfaceC927510aFB oZoomService;

    public static final String LJJJJI() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return String.valueOf((room == null || (owner = room.getOwner()) == null) ? null : Long.valueOf(owner.getId()));
    }

    @Override // X.AbstractC1100450ek7
    public final void LJIILJJIL() {
        C20441214yg.LJIIIZ("MultiGuestLeafTrace", "Triggered onEnd");
        this.LLJJJIL = false;
    }

    @Override // X.AbstractC1100450ek7
    public final void LJIL() {
        C11NJ c11nj = this.LLJJIJIL;
        if (c11nj == null) {
            c11nj = null;
        }
        c11nj.LJ();
    }

    @Override // X.AbstractC1100450ek7
    public void LJJIIZ() {
        C20441214yg.LJIIIZ("MultiGuestLeafTrace", "Triggered onRegister");
        this.LLJI = UserService.getInstance().user().LJIJJLI();
        C1324720kZq c1324720kZq = this.LLJILJIL;
        if (c1324720kZq == null) {
            c1324720kZq = null;
        }
        C786410Ut5.e8(c1324720kZq, new ACListenerS150S0100000_15(this, 234));
        LiveIconView liveIconView = this.LLJIJIL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 235));
        C16F5 c16f5 = this.LLJJI;
        if (c16f5 == null) {
            c16f5 = null;
        }
        C786410Ut5.l8(c16f5, new ACListenerS150S0100000_15(this, 236));
        C498540Jgq c498540Jgq = this.LLJJIJIIJIL;
        if (c498540Jgq == null) {
            c498540Jgq = null;
        }
        C786410Ut5.A8(c498540Jgq, new ACListenerS150S0100000_15(this, 237));
        LiveIconView liveIconView2 = this.LLJJIII;
        if (liveIconView2 == null) {
            liveIconView2 = null;
        }
        C786410Ut5.g8(liveIconView2, new ACListenerS150S0100000_15(this, 238));
        LiveIconView liveIconView3 = this.LLJJIJI;
        if (liveIconView3 == null) {
            liveIconView3 = null;
        }
        C786410Ut5.g8(liveIconView3, new ACListenerS150S0100000_15(this, 239));
        LiveIconView liveIconView4 = this.LLJILJILJ;
        if (liveIconView4 == null) {
            liveIconView4 = null;
        }
        C786410Ut5.g8(liveIconView4, new ACListenerS150S0100000_15(this, 240));
        LiveIconView liveIconView5 = this.LLJILLL;
        if (liveIconView5 == null) {
            liveIconView5 = null;
        }
        C786410Ut5.g8(liveIconView5, new ACListenerS150S0100000_15(this, 241));
        LiveIconView liveIconView6 = this.LLJJ;
        C786410Ut5.g8(liveIconView6 != null ? liveIconView6 : null, new ACListenerS150S0100000_15(this, 242));
        if (this.LLJJJJLIIL != null) {
            DataChannel dataChannel = this.LLIZLLLIL;
            dataChannel.CQ2(MultiLiveUserMediaEvent.class, this, new AwS594S0100000_15(this, 878));
            dataChannel.CQ2(MemberMessageChannel.class, this, new AwS586S0100000_7(this, 462));
            dataChannel.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new AwS594S0100000_15(this, 879));
            dataChannel.CQ2(PlayerPauseLiveForAnchorDialogEvent.class, this, new AwS594S0100000_15(this, 880));
            dataChannel.CQ2(PlayerPauseLiveForMaskEvent.class, this, new AwS594S0100000_15(this, 873));
            dataChannel.CQ2(AudioStateChangeEvent.class, this, new AwS594S0100000_15(this, 874));
            dataChannel.CQ2(MicClickableEvent.class, this, new AwS594S0100000_15(this, 875));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJLLIL);
        this.LLJJL.LIZ(C433601mQ.LJ(new InterfaceC434201mW() { // from class: X.0aNN
            @Override // X.InterfaceC434201mW
            public final void LIZ() {
                if (this.LIZ.LJJJZ()) {
                    try {
                        if (this.LIZ.LLJJJJJIL == null || !(!r0.isRunning())) {
                            throw new IllegalStateException("Check failed.");
                        }
                        Animatable animatable = this.LIZ.LLJJJJJIL;
                        if (animatable != null) {
                            animatable.start();
                        }
                        C932410aN5 c932410aN5 = this.LIZ;
                        C1324720kZq c1324720kZq2 = c932410aN5.LLJILJIL;
                        if (c1324720kZq2 == null) {
                            c1324720kZq2 = null;
                        }
                        HandlerHook.viewPostDelay(c1324720kZq2, new ARunnableS115S0100000_15(c932410aN5, 161), 1240L);
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // X.InterfaceC434201mW
            public final void LIZIZ() {
                if (this.LIZ.LJJJZ()) {
                    C1324720kZq c1324720kZq2 = this.LIZ.LLJILJIL;
                    if (c1324720kZq2 == null) {
                        c1324720kZq2 = null;
                    }
                    C786410Ut5.LLJJIII(c1324720kZq2, 0);
                }
            }

            @Override // X.InterfaceC434201mW
            public final User LIZJ() {
                User user = this.LIZ.LLJJJJ;
                if (user == null) {
                    return null;
                }
                return user;
            }
        }));
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).sX1(this.LLJLLL);
        this.LLJJL.LIZ(this.LLIZ.LJJLL(new AfS176S0100000_7(this, 254), new C09JN() { // from class: X.0JlV
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestGiftLeaf@e6cd.onRegister$11");
                C20441214yg.LJFF("MultiGuestLeaf", "onRegister failed,exception:", (Throwable) obj);
                C1C7U.LIZIZ("MultiGuestGiftLeaf@e6cd.onRegister$11");
            }
        }));
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZI() {
        C20441214yg.LJIIIZ("MultiGuestLeafTrace", "Triggered onStart");
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
        this.oZoomService = objLJIIIZ instanceof InterfaceC927510aFB ? (InterfaceC927510aFB) objLJIIIZ : null;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        this.LLJJJIL = true;
    }

    @Override // X.AbstractC1100450ek7
    public void LJJIZ() {
        this.LLJJL.LJ();
        this.LLIZLLLIL.zQ2(this);
        C915980Zwa.LJIIIIZZ().a9(this.LLJLLIL);
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Lv0(this.LLJLLL);
        super.LJJIZ();
        C20441214yg.LJIIIZ("MultiGuestLeafTrace", "Triggered onUnRegister");
    }

    public final InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> LJJJJIZL() {
        InterfaceC917530Zz5 interfaceC917530Zz5;
        InterfaceC302401Fe interfaceC302401Fe;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User user = this.LLJI;
        if (user == null) {
            user = null;
        }
        c930480aJy.getClass();
        if (C930480aJy.LJIJI(user)) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (!(objLJIIIZ instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) == null) {
                return null;
            }
            return interfaceC302401Fe.LIZ();
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        if (!(objLJIIIZ2 instanceof InterfaceC917530Zz5) || (interfaceC917530Zz5 = (InterfaceC917530Zz5) objLJIIIZ2) == null) {
            return null;
        }
        return interfaceC917530Zz5.LIZ();
    }

    public final int LJJJJJ() {
        Boolean boolValueOf;
        String str;
        InterfaceC927510aFB interfaceC927510aFB = this.oZoomService;
        if (interfaceC927510aFB != null) {
            User user = this.LLJJJJ;
            if (user == null) {
                user = null;
            }
            LinkPlayerInfo linkPlayerInfoLJJJJJL = LJJJJJL(user);
            if (linkPlayerInfoLJJJJJL == null || (str = linkPlayerInfoLJJJJJL.mInteractIdStr) == null) {
                str = "";
            }
            boolValueOf = Boolean.valueOf(interfaceC927510aFB.LIZJ(str));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return 1;
        }
        InterfaceC927510aFB interfaceC927510aFB2 = this.oZoomService;
        if (C500260Jjc.LJJJI(interfaceC927510aFB2 != null ? Boolean.valueOf(interfaceC927510aFB2.LJFF()) : null)) {
            return 2;
        }
        User user2 = this.LLJJJJ;
        if (user2 == null) {
            user2 = null;
        }
        LinkPlayerInfo linkPlayerInfoLJJJJJL2 = LJJJJJL(user2);
        String str2 = linkPlayerInfoLJJJJJL2 != null ? linkPlayerInfoLJJJJJL2.mInteractIdStr : null;
        InterfaceC927510aFB interfaceC927510aFB3 = this.oZoomService;
        return Intrinsics.LJFF(str2, interfaceC927510aFB3 != null ? interfaceC927510aFB3.LJIILIIL() : null) ? 3 : 0;
    }

    public final void LJJJJLI() {
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C500260Jjc.LJIILIIL(liveIconView);
        LiveIconView liveIconView2 = this.LLJIJIL;
        if (liveIconView2 == null) {
            liveIconView2 = null;
        }
        C500260Jjc.LJIILIIL(liveIconView2);
        LiveIconView liveIconView3 = this.LLJJIII;
        if (liveIconView3 == null) {
            liveIconView3 = null;
        }
        C500260Jjc.LJIILIIL(liveIconView3);
        LiveIconView liveIconView4 = this.LLJILLL;
        if (liveIconView4 == null) {
            liveIconView4 = null;
        }
        C500260Jjc.LJIILIIL(liveIconView4);
        LiveIconView liveIconView5 = this.LLJJIJI;
        C500260Jjc.LJIILIIL(liveIconView5 != null ? liveIconView5 : null);
    }

    public final void LJJJJZI() {
        C930480aJy.LIZ.getClass();
        if (!C930480aJy.LJIIL() || C781520UlC.LJ((LiveMode) this.LLIZLLLIL.gg0(LiveModeChannel.class))) {
            LiveIconView liveIconView = this.LLJJIII;
            if (liveIconView == null) {
                liveIconView = null;
            }
            C500260Jjc.LLFFF(liveIconView);
            LiveIconView liveIconView2 = this.LLJILLL;
            C500260Jjc.LJIILIIL(liveIconView2 != null ? liveIconView2 : null);
            return;
        }
        LiveIconView liveIconView3 = this.LLJJIII;
        if (liveIconView3 == null) {
            liveIconView3 = null;
        }
        C500260Jjc.LJIILIIL(liveIconView3);
        if (!this.LLJLIL) {
            User user = this.LLJJJJ;
            if (user == null) {
                user = null;
            }
            if (!C930480aJy.LJIJJ(Long.valueOf(user.getId()))) {
                this.LLJLIL = true;
                String strLJJJJI = LJJJJI();
                User user2 = this.LLJJJJ;
                if (user2 == null) {
                    user2 = null;
                }
                C919870a2r.LIZLLL(LJJJJJ(), strLJJJJI, String.valueOf(user2.getId()), "show", "guest", null);
            }
        }
        LiveIconView liveIconView4 = this.LLJILLL;
        C500260Jjc.LLFFF(liveIconView4 != null ? liveIconView4 : null);
        LJJLIIIJJIZ();
    }

    public final boolean LJJJZ() {
        return this.LLJJJJ != null && this.LLJJJIL;
    }

    public final void LJJL() {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Context context = this.LL;
        C11NJ c11nj = this.LLJJIJIL;
        if (c11nj == null) {
            c11nj = null;
        }
        c930480aJy.getClass();
        if (C930480aJy.LJ("openUserProfile", context, c11nj)) {
            String str = C930480aJy.LJIJJ(Long.valueOf(UserService.getInstance().user().getCurrentUserId())) ? "live_anchor_c_audience" : "live_audience_c_audience";
            User user = this.LLJJJJ;
            UserProfileEvent userProfileEvent = new UserProfileEvent(user != null ? user : null, str);
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mSource = "guest_connection";
            userProfileEvent.mClickUserPosition = "gift_panel";
            userProfileEvent.clickModule = "multi_guest_gift_panel";
            C784440Upu.LIZ().LIZIZ(userProfileEvent);
        }
    }

    public final void LJJLIIIJ() {
        LiveMode liveMode;
        User user = this.LLJJJJ;
        if (user == null) {
            user = null;
        }
        LinkPlayerInfo linkPlayerInfoLJJJJJL = LJJJJJL(user);
        boolean zLJJJJL = LJJJJL(linkPlayerInfoLJJJJJL != null ? linkPlayerInfoLJJJJJL.mInteractIdStr : null);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        c930480aJy.getClass();
        int iLIZJ = C930480aJy.LIZJ(linkPlayerInfoLJJJJJL, multiGuestDataHolder);
        this.LLJJLIIIJLLLLLLLZ = iLIZJ;
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView == null) {
            liveIconView = null;
        }
        Context context = this.LL;
        DataChannel dataChannel = this.LLIZLLLIL;
        C930480aJy.LJJIZ(liveIconView, iLIZJ, context, zLJJJJL, (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? null : Boolean.valueOf(C781520UlC.LJ(liveMode)));
        this.LLJL = LJJJJ(linkPlayerInfoLJJJJJL);
        LiveIconView liveIconView2 = this.LLJIJIL;
        if (liveIconView2 == null) {
            liveIconView2 = null;
        }
        C500260Jjc.LLFFF(liveIconView2);
        boolean zLJJJLIIL = LJJJLIIL(null, linkPlayerInfoLJJJJJL != null ? linkPlayerInfoLJJJJJL.mInteractIdStr : null);
        LiveIconView liveIconView3 = this.LLJIJIL;
        if (liveIconView3 == null) {
            liveIconView3 = null;
        }
        C930480aJy.LJJIL(liveIconView3, this.LLJL, this.LL, zLJJJJL, zLJJJLIIL);
        LiveIconView liveIconView4 = this.LLJILJILJ;
        (liveIconView4 != null ? liveIconView4 : null).setClickable(!zLJJJJL);
        LJJLI();
    }

    public final void LJJLIIIJILLIZJL() {
        if (!C781520UlC.LJ((LiveMode) this.LLIZLLLIL.gg0(LiveModeChannel.class))) {
            C930480aJy.LIZ.getClass();
            if ((C930480aJy.LJIIIIZZ() && C918090Zzz.LIZIZ()) || (C930540aK4.LIZJ() && C918090Zzz.LIZ())) {
                LJJJJLI();
                return;
            }
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User user = this.LLJI;
        if (user == null) {
            user = null;
        }
        c930480aJy.getClass();
        if (!C930480aJy.LJIJI(user)) {
            LJJJJLI();
            LiveIconView liveIconView = this.LLJJIJI;
            if (liveIconView == null) {
                liveIconView = null;
            }
            C500260Jjc.LLFFF(liveIconView);
            LiveIconView liveIconView2 = this.LLJJIJI;
            (liveIconView2 != null ? liveIconView2 : null).setIconAttr(R.attr.e0k);
            LJJJJLL();
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Bl1()) {
                LJJJJZI();
                LJJLIIIJ();
                return;
            }
            return;
        }
        User user2 = this.LLJI;
        if (user2 == null) {
            user2 = null;
        }
        if (Intrinsics.LJFF(LJJJLZIJ(user2), Boolean.TRUE)) {
            DataChannel dataChannel = this.LLIZLLLIL;
            if (C781520UlC.LJ(dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null)) {
                LiveIconView liveIconView3 = this.LLJILJILJ;
                if (liveIconView3 == null) {
                    liveIconView3 = null;
                }
                C500260Jjc.LJIILIIL(liveIconView3);
            } else {
                LiveIconView liveIconView4 = this.LLJILJILJ;
                if (liveIconView4 == null) {
                    liveIconView4 = null;
                }
                C500260Jjc.LLFFF(liveIconView4);
            }
            LiveIconView liveIconView5 = this.LLJIJIL;
            if (liveIconView5 == null) {
                liveIconView5 = null;
            }
            C500260Jjc.LLFFF(liveIconView5);
        } else {
            LiveIconView liveIconView6 = this.LLJILJILJ;
            if (liveIconView6 == null) {
                liveIconView6 = null;
            }
            C500260Jjc.LJIILIIL(liveIconView6);
            LiveIconView liveIconView7 = this.LLJIJIL;
            if (liveIconView7 == null) {
                liveIconView7 = null;
            }
            C500260Jjc.LJIILIIL(liveIconView7);
        }
        LiveIconView liveIconView8 = this.LLJJIJI;
        if (liveIconView8 == null) {
            liveIconView8 = null;
        }
        C786410Ut5.LLJJIJIL(liveIconView8, 0);
        LiveIconView liveIconView9 = this.LLJJIJI;
        (liveIconView9 != null ? liveIconView9 : null).setIconAttr(R.attr.e0k);
        LJJJJZI();
        LJJJJLL();
        LJJLIIIJ();
    }

    public final void LJJLIIIJJIZ() {
        EnumC920250a3T enumC920250a3TLJIL;
        String str;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        LiveIconView liveIconView = this.LLJILLL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        InterfaceC927510aFB interfaceC927510aFB = this.oZoomService;
        if (interfaceC927510aFB == null) {
            enumC920250a3TLJIL = EnumC920250a3T.ZOOM_DISABLED;
        } else {
            User user = this.LLJJJJ;
            LinkPlayerInfo linkPlayerInfoLJJJJJL = LJJJJJL(user != null ? user : null);
            enumC920250a3TLJIL = (linkPlayerInfoLJJJJJL == null || (str = linkPlayerInfoLJJJJJL.mInteractIdStr) == null) ? EnumC920250a3T.ZOOM_DISABLED : interfaceC927510aFB.LJIL(str);
        }
        Context context = this.LL;
        int iLIZJ = C439101nJ.LIZJ(R.color.a51);
        int iLIZJ2 = C439101nJ.LIZJ(R.color.bh);
        c930480aJy.getClass();
        C930480aJy.LJJJ(liveIconView, enumC920250a3TLJIL, context, iLIZJ, iLIZJ2, false);
    }

    public final void LJJJJLL() {
        String str;
        if (!C927800aFe.LIZIZ() || C781520UlC.LJ((LiveMode) this.LLIZLLLIL.gg0(LiveModeChannel.class))) {
            LiveIconView liveIconView = this.LLJJ;
            C439101nJ.LJI(liveIconView != null ? liveIconView : null);
            return;
        }
        LiveIconView liveIconView2 = this.LLJJ;
        if (liveIconView2 == null) {
            liveIconView2 = null;
        }
        C12ES.LJIILL(0, liveIconView2);
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).bH2(this.LLIZLLLIL)) {
            LiveIconView liveIconView3 = this.LLJJ;
            if (liveIconView3 == null) {
                liveIconView3 = null;
            }
            C786410Ut5.i5(liveIconView3, 0.5f);
        } else {
            LiveIconView liveIconView4 = this.LLJJ;
            if (liveIconView4 == null) {
                liveIconView4 = null;
            }
            C786410Ut5.i5(liveIconView4, 1.0f);
        }
        if (this.LLJLILLLLZIIL) {
            return;
        }
        User user = this.LLJJJJ;
        if (user == null) {
            user = null;
        }
        LinkPlayerInfo linkPlayerInfoLJJJJJL = LJJJJJL(user);
        if (linkPlayerInfoLJJJJJL == null || (str = linkPlayerInfoLJJJJJL.mInteractIdStr) == null) {
            str = "";
        }
        User user2 = this.LLJJJJ;
        if (user2 == null) {
            user2 = null;
        }
        C320501Md.LIZLLL("show", String.valueOf(user2.getId()), str, null);
        this.LLJLILLLLZIIL = true;
    }

    public final void LJJLI() {
        if (C930540aK4.LIZJ() && C918090Zzz.LIZ()) {
            LiveIconView liveIconView = this.LLJILJILJ;
            if (liveIconView == null) {
                liveIconView = null;
            }
            C439101nJ.LJI(liveIconView);
        }
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJIIIIZZ() && C918090Zzz.LIZIZ()) {
            LiveIconView liveIconView2 = this.LLJILJILJ;
            C439101nJ.LJI(liveIconView2 != null ? liveIconView2 : null);
        }
    }

    public int LJJJJ(LinkPlayerInfo linkPlayerInfo) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        c930480aJy.getClass();
        return C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
    }

    public final LinkPlayerInfo LJJJJJL(User user) {
        InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50LJJJJIZL = LJJJJIZL();
        if (interfaceC921200a50LJJJJIZL != null) {
            return C921170a4x.LJIIIZ(interfaceC921200a50LJJJJIZL, user.getId());
        }
        return null;
    }

    public boolean LJJJJL(String str) {
        MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        if (multiGuestDataHolder.LJIIJJI(str) == 2) {
            return true;
        }
        return false;
    }

    public final Boolean LJJJLZIJ(User user) {
        List<LinkPlayerInfo> listLIZ;
        InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50LJJJJIZL = LJJJJIZL();
        if (interfaceC921200a50LJJJJIZL != null && (listLIZ = interfaceC921200a50LJJJJIZL.LIZ()) != null) {
            boolean z = false;
            if (!listLIZ.isEmpty()) {
                Iterator<LinkPlayerInfo> it2 = listLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().mUser.getId() == user.getId()) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final void LJJLIIIJJI(C927380aEy c927380aEy) {
        String str;
        boolean z;
        if (LJJJZ()) {
            User user = this.LLJJJJ;
            LiveIconView liveIconView = null;
            if (user == null) {
                user = null;
            }
            LinkPlayerInfo linkPlayerInfoLJJJJJL = LJJJJJL(user);
            String str2 = c927380aEy.LIZIZ;
            if (linkPlayerInfoLJJJJJL != null) {
                str = linkPlayerInfoLJJJJJL.mInteractIdStr;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                this.LLJL = LJJJJ(linkPlayerInfoLJJJJJL);
                String str3 = linkPlayerInfoLJJJJJL.mInteractIdStr;
                Integer numValueOf = Integer.valueOf(c927380aEy.LIZ);
                if (str3 != null && (LJJJJL(str3) || LJJJLIIL(numValueOf, str3))) {
                    z = true;
                } else {
                    z = false;
                }
                C930480aJy c930480aJy = C930480aJy.LIZ;
                LiveIconView liveIconView2 = this.LLJIJIL;
                if (liveIconView2 != null) {
                    liveIconView = liveIconView2;
                }
                int i = this.LLJL;
                Context context = this.LL;
                c930480aJy.getClass();
                C930480aJy.LJJIL(liveIconView, i, context, z, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 1349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932410aN5.onClick(android.view.View):void");
    }

    public boolean LJJJLIIL(Integer num, String str) {
        int iLIZJ;
        if (str == null) {
            return false;
        }
        if (num != null) {
            iLIZJ = num.intValue();
        } else {
            MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
            if (multiGuestDataHolder == null) {
                multiGuestDataHolder = null;
            }
            iLIZJ = multiGuestDataHolder.LIZJ(str);
        }
        if (iLIZJ != 4 && iLIZJ != 3) {
            return false;
        }
        return true;
    }

    public final void LJJLIIIIJ(String str, boolean z) {
        String str2;
        Boolean boolValueOf;
        String str3;
        LiveMode liveMode;
        if (LJJJZ()) {
            User user = this.LLJJJJ;
            LiveIconView liveIconView = null;
            if (user == null) {
                user = null;
            }
            LinkPlayerInfo linkPlayerInfoLJJJJJL = LJJJJJL(user);
            if (linkPlayerInfoLJJJJJL != null) {
                str2 = linkPlayerInfoLJJJJJL.mInteractIdStr;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str, str2)) {
                C930480aJy c930480aJy = C930480aJy.LIZ;
                MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
                if (multiGuestDataHolder == null) {
                    multiGuestDataHolder = null;
                }
                c930480aJy.getClass();
                this.LLJJLIIIJLLLLLLLZ = C930480aJy.LIZJ(linkPlayerInfoLJJJJJL, multiGuestDataHolder);
                this.LLJL = LJJJJ(linkPlayerInfoLJJJJJL);
                LiveIconView liveIconView2 = this.LLJILJILJ;
                if (liveIconView2 == null) {
                    liveIconView2 = null;
                }
                int i = this.LLJJLIIIJLLLLLLLZ;
                Context context = this.LL;
                DataChannel dataChannel = this.LLIZLLLIL;
                if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                    boolValueOf = Boolean.valueOf(C781520UlC.LJ(liveMode));
                } else {
                    boolValueOf = null;
                }
                C930480aJy.LJJIZ(liveIconView2, i, context, z, boolValueOf);
                LJJLI();
                if (linkPlayerInfoLJJJJJL != null) {
                    str3 = linkPlayerInfoLJJJJJL.mInteractIdStr;
                } else {
                    str3 = null;
                }
                boolean zLJJJLIIL = LJJJLIIL(null, str3);
                LiveIconView liveIconView3 = this.LLJIJIL;
                if (liveIconView3 == null) {
                    liveIconView3 = null;
                }
                C930480aJy.LJJIL(liveIconView3, this.LLJL, this.LL, z, zLJJJLIIL);
                LiveIconView liveIconView4 = this.LLJILJILJ;
                if (liveIconView4 != null) {
                    liveIconView = liveIconView4;
                }
                liveIconView.setClickable(!z);
            }
        }
    }

    @Override // X.AbstractC1100450ek7
    public final Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), this.LLJZ, viewGroup, false);
        this.LLJILJIL = (C1324720kZq) viewTd.findViewById(R.id.iet);
        this.LLJIJIL = (LiveIconView) viewTd.findViewById(R.id.cl2);
        this.LLJJI = (C16F5) viewTd.findViewById(R.id.y50);
        this.LLJJIJIIJIL = (C498540Jgq) viewTd.findViewById(R.id.user_avatar);
        this.LLJJIII = (LiveIconView) viewTd.findViewById(R.id.cl3);
        this.LLJJIJI = (LiveIconView) viewTd.findViewById(R.id.cl1);
        this.LLJILJILJ = (LiveIconView) viewTd.findViewById(R.id.cky);
        this.LLJILLL = (LiveIconView) viewTd.findViewById(R.id.cl4);
        this.LLJJ = (LiveIconView) viewTd.findViewById(R.id.cl0);
        this.LLJJJ = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        this.LLJJIJIL = new C11NJ();
        C1324720kZq c1324720kZq = this.LLJILJIL;
        if (c1324720kZq == null) {
            c1324720kZq = null;
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_rank_follow_anim.webp"));
        c1320810kTXLIZJ.LJIIIIZZ = new C987310bnd(this, 0);
        c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
        this.LLJJJJLIIL = C520010KaN.LJJIFFI(context, false);
        return new Pair<>(viewTd, null);
    }

    public final void LJJLIIIJL(String str, final LiveDialog liveDialog, final boolean z) {
        C1143300frE.LJIIJJI().LJII(this.LLJLL, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "entrance")));
        InterfaceC927510aFB interfaceC927510aFB = this.oZoomService;
        if (interfaceC927510aFB != null) {
            interfaceC927510aFB.LJI(str, new InterfaceC920110a3F() { // from class: X.0aMS
                @Override // X.InterfaceC920110a3F
                public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZJ(String str2) {
                    C1143300frE.LJIIJJI().LJII(this.LIZ.LLJLL, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "onZoomSuccess")));
                    if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
                        if (z) {
                            C766270U4b.LIZLLL(2131843136);
                        } else {
                            C766270U4b.LIZLLL(2131843134);
                        }
                    }
                    DialogInterface dialogInterface = liveDialog;
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZ(int i, String str2, String str3, Throwable th) {
                    String message;
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    String str4 = this.LIZ.LLJLL;
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("action", "zoom");
                    pairArr[1] = new Pair("step", "onZoomFail");
                    pairArr[2] = new Pair("errorCode", Integer.valueOf(i));
                    pairArr[3] = new Pair("errorMessage", str3);
                    User user = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    pairArr[4] = new Pair("throwable", message);
                    c1143300frELJIIJJI.LJII(str4, C2097608Jq.LJIIJ(pairArr));
                    DialogInterface dialogInterface = liveDialog;
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    C932410aN5 c932410aN5 = this.LIZ;
                    Context context = c932410aN5.LL;
                    DataChannel dataChannel = c932410aN5.LLIZLLLIL;
                    User user2 = c932410aN5.LLJJJJ;
                    if (user2 != null) {
                        user = user2;
                    }
                    C917140ZyS.LJII(numValueOf, str3, th, context, dataChannel, user);
                }
            }, true, false, true, true, EnumC919910a2v.FROM_MULTI_GUEST_GIFT_LEAF, null);
        }
        this.LLJ.run();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0a6I] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0aNM] */
    public C932410aN5(Context context, C11RK c11rk, int i, DataChannel dataChannel, ARunnableS117S0100000_17 aRunnableS117S0100000_17) throws IllegalAccessException {
        InterfaceC421301kR interfaceC421301kRLIZIZ;
        super(context, i);
        this.LLIZ = c11rk;
        this.LLIZLLLIL = dataChannel;
        this.LLJ = aRunnableS117S0100000_17;
        this.LLJJL = new C11NJ();
        this.LLJJLIIIJLLLLLLLZ = 1;
        this.LLJL = 1;
        this.LLJLL = "Zoom/MultiGuestGiftLeaf";
        this.LLJLLIL = new InterfaceC964770bDH() { // from class: X.0a6I
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
            public final void LJJIFFI(int i2, int i3, int i4) {
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
            public final void LJJJJJL(int i2, C965030bDh c965030bDh) {
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
            public final void LJJJZ(int i2, String str) {
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
            public final void LJJLL(int i2, int i3) {
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
            public final void LJLJLLL(int i2, InterfaceC954180awC interfaceC954180awC) {
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
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i2) {
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
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i2, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i2, int i3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i2, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i2, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
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
            public final void LJJIZ(String str, long j) {
                C932410aN5 c932410aN5 = this.LL;
                User user = c932410aN5.LLJJJJ;
                String str2 = null;
                if (user == null) {
                    user = null;
                }
                LinkPlayerInfo linkPlayerInfoLJJJJJL = c932410aN5.LJJJJJL(user);
                if (linkPlayerInfoLJJJJJL != null) {
                    str2 = linkPlayerInfoLJJJJJL.mInteractIdStr;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    this.LL.LLJ.run();
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
                Long l = kickOutMessage.owner.userId;
                User user = this.LL.LLJJJJ;
                if (user == null) {
                    user = null;
                }
                long id = user.getId();
                if (l != null && l.longValue() == id) {
                    this.LL.LLJ.run();
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
                Long l = leaveMessage.leftUser.userId;
                User user = this.LL.LLJJJJ;
                if (user == null) {
                    user = null;
                }
                long id = user.getId();
                if (l != null && l.longValue() == id) {
                    this.LL.LLJ.run();
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
                this.LL.LLJ.run();
            }
        };
        this.LLJLLL = new InterfaceC923350a8T() { // from class: X.0aNM
            @Override // X.InterfaceC923350a8T
            public final void LIZ(boolean z) {
                if (!z) {
                    this.LL.LLJ.run();
                }
            }
        };
        if (C927800aFe.LIZIZ() && dataChannel.gg0(C956850b0V.class) == null && (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) != null) {
            GetUserPlaySettingsParams getUserPlaySettingsParams = new GetUserPlaySettingsParams();
            getUserPlaySettingsParams.settingKeys = C1697810uHb.LJIILJJIL("countdown_duration", "countdown_auto_expand", "countdown_target_score");
            interfaceC421301kRLIZIZ.LJII(getUserPlaySettingsParams, new AwS594S0100000_15(this, 877));
        }
        C948450amx.LIZIZ.LIZLLL(this);
        this.LLJZ = R.layout.hrw;
    }
}
