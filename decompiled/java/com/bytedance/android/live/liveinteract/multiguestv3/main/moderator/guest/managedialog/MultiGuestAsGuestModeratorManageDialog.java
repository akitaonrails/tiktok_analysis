package com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog;

import X.AbstractC1143290frD;
import X.AbstractC928510aGn;
import X.AbstractDialogC972150bPB;
import X.C013C;
import X.C01GW;
import X.C01JX;
import X.C01Z5;
import X.C0IJT;
import X.C0KVU;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1085120eLO;
import X.C1117360fBO;
import X.C1143300frE;
import X.C1161920gLG;
import X.C11JF;
import X.C11NJ;
import X.C11PQ;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C16FZ;
import X.C19719612Di;
import X.C19GI;
import X.C19GN;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C307001Gy;
import X.C410901il;
import X.C439101nJ;
import X.C474500IjA;
import X.C481280Iu6;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C782110Um9;
import X.C784440Upu;
import X.C785410UrT;
import X.C786410Ut5;
import X.C914870Zun;
import X.C915190ZvJ;
import X.C915880ZwQ;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C916860Zy0;
import X.C917140ZyS;
import X.C917750ZzR;
import X.C917810ZzX;
import X.C918220a0C;
import X.C918240a0E;
import X.C918350a0P;
import X.C918360a0Q;
import X.C918380a0S;
import X.C918510a0f;
import X.C919280a1u;
import X.C919380a24;
import X.C919440a2A;
import X.C920500a3s;
import X.C920830a4P;
import X.C921170a4x;
import X.C921180a4y;
import X.C921240a54;
import X.C921740a5s;
import X.C922800a7a;
import X.C923220a8G;
import X.C923240a8I;
import X.C924230a9t;
import X.C924350aA5;
import X.C924630aAX;
import X.C924790aAn;
import X.C924810aAp;
import X.C924950aB3;
import X.C924960aB4;
import X.C924970aB5;
import X.C924980aB6;
import X.C924990aB7;
import X.C925320aBe;
import X.C925640aCA;
import X.C926520aDa;
import X.C926940aEG;
import X.C927240aEk;
import X.C927600aFK;
import X.C928050aG3;
import X.C928070aG5;
import X.C928260aGO;
import X.C929150aHp;
import X.C930130aJP;
import X.C930320aJi;
import X.C930480aJy;
import X.C930540aK4;
import X.C931820aM8;
import X.C932140aMe;
import X.C948450amx;
import X.C978360bZC;
import X.EnumC918970a1P;
import X.EnumC926990aEL;
import X.InterfaceC21676519sR;
import X.InterfaceC481300Iu8;
import X.InterfaceC743640TFa;
import X.InterfaceC914680ZuU;
import X.InterfaceC917530Zz5;
import X.InterfaceC918930a1L;
import X.InterfaceC928190aGH;
import X.InterfaceC928270aGP;
import X.InterfaceC931940aMK;
import X.InterfaceC948490an1;
import X.InterfaceC964770bDH;
import X.RunnableC781530UlD;
import Y.AcS354S0200000_15;
import Y.AfS181S0100000_12;
import Y.AsS42S0100000_15;
import android.content.Context;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplyFailEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomModeratorCancelInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ModeratorSeiMediaUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithConfirmEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorPanelSettingChangeFromIMEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestInvitePreApprovedChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestInvitePreApprovedHeadNumChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestPreApprovedChannel;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
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
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorExposeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorInviteCapabilitySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorPanelExpandInviteTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorTrackerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPanelVideoPermissionIconStatus;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS55S0310000_15;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAsGuestModeratorManageDialog extends AbstractDialogC972150bPB implements InterfaceC931940aMK, InterfaceC481300Iu8, InterfaceC21676519sR, GenericLifecycleObserver {
    public final DataChannel LLJI;
    public final C926940aEG LLJIJIL;
    public final InterfaceC928190aGH LLJILJIL;
    public final C11PQ<Long> LLJILJILJ;
    public C11JF LLJILLL;
    public final BPEAHandler LLJJ;
    public RunnableC781530UlD LLJJI;
    public C16FZ LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public LiveIconView LLJJIJIL;
    public C16F5 LLJJJ;
    public C16F5 LLJJJIL;
    public C16FS LLJJJJ;
    public C16F5 LLJJJJJIL;
    public final C1117360fBO LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public final C481280Iu6 LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public C928050aG3 LLL;
    public final CopyOnWriteArrayList<String> LLLF;
    public final Map<String, C929150aHp> LLLFF;
    public final List<LinkPlayerInfo> LLLFFI;
    public final Map<String, Integer> LLLFZ;
    public final List<LinkPlayerInfo> LLLI;
    public final List<LinkPlayerInfo> LLLII;
    public final List<LinkPlayerInfo> LLLIIII;
    public final List<LinkPlayerInfo> LLLIIIIL;
    public final List<LinkPlayerInfo> LLLIIIL;
    public List<GuestApplyStillInLineResponse.GuestApplyItem> LLLIIL;
    public final boolean LLLIILIL;
    public final AsS42S0100000_15 LLLIL;
    public final C921740a5s LLLILZ;
    public final C919380a24 LLLILZJ;
    public final C928260aGO LLLILZLLLI;
    public C928070aG5 LLLIZZ;
    public C16F5 LLLJ;

    @InterfaceC948490an1(name = "LINK_CONTROL_DATA_HOLDER")
    public LinkControlDataHolder linkControlDataHolder;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    @InterfaceC948490an1(name = "MULTI_GUEST_V3_MODERATOR_USER_MANAGER")
    public InterfaceC917530Zz5 userManager;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g97;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC931940aMK
    public final int LIZIZ() {
        return ((ArrayList) this.LLLI).size();
    }

    public final InterfaceC917530Zz5 LJLI() {
        InterfaceC917530Zz5 interfaceC917530Zz5 = this.userManager;
        if (interfaceC917530Zz5 != null) {
            return interfaceC917530Zz5;
        }
        return null;
    }

    public final void LJLIIL() {
        int i;
        int iNextIndex;
        List<?> list = this.LLJJJJLIIL.LL;
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (true) {
            i = -1;
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            Object objPrevious = listIterator.previous();
            if ((objPrevious instanceof LinkPlayerInfo) && ((LinkPlayerInfo) objPrevious).LIZIZ == 1) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        Iterator<?> it2 = this.LLJJJJLIIL.LL.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((next instanceof LinkPlayerInfo) && ((LinkPlayerInfo) next).LIZIZ == 1) {
                i = i2;
                break;
            }
            i2++;
        }
        if (iNextIndex < i || iNextIndex < 0 || i < 0) {
            return;
        }
        this.LLJJJJLIIL.notifyItemRangeChanged(i, (iNextIndex - i) + 1);
    }

    public final void LJLJJLL() {
        C20441214yg.LIZIZ("MultiGuestModeratorsManageDialog", "showAnchorOnly");
        C410901il c410901il = new C410901il();
        C930480aJy.LIZ.getClass();
        LinkPlayerInfo linkPlayerInfoLJIIJ = C930480aJy.LJIIJ();
        if (linkPlayerInfoLJIIJ != null) {
            c410901il.add(linkPlayerInfoLJIIJ);
        }
        c410901il.add(new Object() { // from class: X.0aGM
        });
        C1117360fBO c1117360fBO = this.LLJJJJLIIL;
        c1117360fBO.LL = c410901il;
        c1117360fBO.notifyDataSetChanged();
    }

    @Override // X.InterfaceC931940aMK
    public final void LJJIL() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", "onDisConnectClicked");
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.LC0(GuestDisconnectByWindowWithConfirmEvent.class, new Pair("guest_icon", 10002));
        }
        dismiss();
        C785410UrT.LIZ(this);
    }

    @Override // X.C19GI, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", "dismiss");
        super.dismiss();
        ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
        C20441214yg.LIZIZ("TrackerHelper", "clear");
        C924950aB3.LIZ.clear();
        C928070aG5 c928070aG5 = this.LLLIZZ;
        if (c928070aG5 != null) {
            LJLI().LJJIIJ(c928070aG5);
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLJLLL.getClass();
        C928260aGO c928260aGO = this.LLLILZLLLI;
        c928260aGO.LIZIZ = false;
        C11JF c11jf = c928260aGO.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c928260aGO.LJI = null;
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        (multiGuestDataHolder != null ? multiGuestDataHolder : null).getClass();
    }

    @Override // X.AbstractDialogC972150bPB, X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        C928050aG3 c928050aG3;
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", "onAttachedToWindow");
        super.onAttachedToWindow();
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkInRoomGuestApplySucceedEvent.class, this, new AwS594S0100000_15(this, 990));
            dataChannel.CQ2(LinkInRoomAudienceCancelApplySucceedEvent.class, this, new AwS594S0100000_15(this, 991));
            dataChannel.CQ2(LinkInRoomAudienceCancelApplyFailEvent.class, this, new AwS591S0100000_12(this, 1077));
            dataChannel.CQ2(MultiLiveUserMediaEvent.class, this, new AwS594S0100000_15(this, 992));
            dataChannel.CQ2(ModeratorSeiMediaUpdateEvent.class, this, new AwS594S0100000_15(this, 993));
            dataChannel.CQ2(MultiGuestInvitePreApprovedChannel.class, this, new AwS594S0100000_15(this, 994));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLLILZ);
        this.LLJILLL = (C11JF) C784440Upu.LIZ().LJ(C1085120eLO.class).LJJLJLI(new AfS181S0100000_12(this, 276));
        C926940aEG c926940aEG = this.LLJIJIL;
        if (c926940aEG != null) {
            this.LLL = new C928050aG3();
            C928050aG3 c928050aG32 = this.LLL;
            if (c928050aG32 != null) {
                View viewFindViewById = findViewById(R.id.mek);
                DataChannel dataChannel2 = this.LLJI;
                Context context = getContext();
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "init");
                c928050aG32.LLIZ = new C11NJ();
                c928050aG32.LLILZIL = c926940aEG;
                c928050aG32.LLILZLL = context;
                c928050aG32.LL = viewFindViewById.findViewById(R.id.tb2);
                C16FS c16fs = (C16FS) viewFindViewById.findViewById(R.id.tb3);
                c928050aG32.LLILLJJLI = c16fs;
                if (c16fs != null) {
                    C500260Jjc.LJLILLLLZI(c16fs, R.id.tb3, 1000L, new AwS594S0100000_15(c928050aG32, 989));
                }
                c928050aG32.LLILZ = dataChannel2;
                if (dataChannel2 != null) {
                    dataChannel2.CQ2(MultiGuestAnchorPanelSettingChangeFromIMEvent.class, c928050aG32, new AwS594S0100000_15(c928050aG32, 988));
                }
                C924790aAn.LIZLLL().LIZ(c928050aG32);
                c928050aG32.LIZLLL();
                DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ();
                if (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ != null) {
                    deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LJ(new AwS559S0100000_15(c928050aG32, 1030));
                }
            }
            C928050aG3 c928050aG33 = this.LLL;
            if (c928050aG33 != null) {
                AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(this, 89);
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "setCancelReserveListener");
                c928050aG33.LLIZLLLIL = awS592S0100000_13;
            }
            if (this.LLJIJIL.LIZ != EnumC926990aEL.AUTO_REQUEST || (c928050aG3 = this.LLL) == null) {
                return;
            }
            c928050aG3.LIZIZ(true);
        }
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C19GN c19gn;
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLLILZ);
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Z42(this.LLLILZJ);
        C11JF c11jf = this.LLJILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILLL = null;
        C928050aG3 c928050aG3 = this.LLL;
        if (c928050aG3 != null) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "destroy");
            DataChannel dataChannel2 = c928050aG3.LLILZ;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(c928050aG3);
            }
            C924790aAn.LIZLLL().LIZJ(c928050aG3);
            C19GN c19gn2 = c928050aG3.LLILLL;
            if (c19gn2 != null && c19gn2.isShowing() && (c19gn = c928050aG3.LLILLL) != null) {
                c19gn.dismiss();
                C785410UrT.LIZ(c19gn);
            }
            C11NJ c11nj = c928050aG3.LLIZ;
            if (c11nj != null) {
                c11nj.LJ();
            }
            c928050aG3.LLIZLLLIL = null;
        }
        this.LLL = null;
        this.LLJJJJLIIL.LL = new C410901il();
        RunnableC781530UlD runnableC781530UlD = this.LLJJI;
        (runnableC781530UlD != null ? runnableC781530UlD : null).getRecycledViewPool().clear();
        ((LinkedHashMap) this.LLLFF).clear();
        ((LinkedHashMap) this.LLLFZ).clear();
        this.LLLF.clear();
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", "show");
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT/CWsUo1iBY5V9wyFjXxa9pzZZxamWHDxtf4dMzirOfvqaXZW1Met5UFGW9/7lMeynIyd2Tv9cyHgoybAL1kyJfhmtU=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        this.LLJZIJLIL = true;
        if (this.LLJLLIL) {
            return;
        }
        this.LLJLLIL = true;
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI = LJLI();
        AbstractC928510aGn abstractC928510aGnLIZ = interfaceC917530Zz5LJLI != null ? interfaceC917530Zz5LJLI.LIZ() : null;
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        C922800a7a.LIZJ("guest_icon", "", abstractC928510aGnLIZ, (multiGuestDataHolder != null ? multiGuestDataHolder : null).LIZIZ(), null, 0, 0, null, 0, 0L, 0, null, false, false, null, 32752);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z21() {
        DataChannel dataChannel;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJIL;
        Integer num;
        Pair pair;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        AbstractC928510aGn abstractC928510aGnLIZ4;
        AbstractC928510aGn abstractC928510aGnLIZ5;
        AbstractC928510aGn abstractC928510aGnLIZ6;
        AbstractC928510aGn abstractC928510aGnLIZ7;
        Integer num2;
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", "onPlayerListChange");
        if ((LinkMicModeratorTrackerSetting.INSTANCE.opt() || (num2 = (Integer) C924790aAn.LIZLLL().LIZIZ) == null || num2.intValue() != 2) && !this.LLJLL && (dataChannel = this.LLJI) != null && dataChannel.gg0(RoomChannel.class) != null) {
            this.LLJLL = true;
            InterfaceC917530Zz5 interfaceC917530Zz5LJLI = LJLI();
            C924980aB6.LIZ((interfaceC917530Zz5LJLI == null || (abstractC928510aGnLIZ = interfaceC917530Zz5LJLI.LIZ()) == null || (listLJIL = abstractC928510aGnLIZ.LJIL()) == null) ? 0 : listLJIL.size(), 0, null, null, this.LLJI, null, null, null, 238);
        }
        Boolean boolLIZLLL = C931820aM8.LIZLLL("manage_panel_refresh_optimize");
        boolean zBooleanValue = boolLIZLLL != null ? boolLIZLLL.booleanValue() : false;
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI2 = LJLI();
        List<? extends LinkPlayerInfo> listLJJIII = (interfaceC917530Zz5LJLI2 == null || (abstractC928510aGnLIZ7 = interfaceC917530Zz5LJLI2.LIZ()) == null) ? null : abstractC928510aGnLIZ7.LJJIII();
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI3 = LJLI();
        List<? extends LinkPlayerInfo> listLJIILLIIL = (interfaceC917530Zz5LJLI3 == null || (abstractC928510aGnLIZ6 = interfaceC917530Zz5LJLI3.LIZ()) == null) ? null : abstractC928510aGnLIZ6.LJIILLIIL();
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI4 = LJLI();
        List<? extends LinkPlayerInfo> listLJIJI = (interfaceC917530Zz5LJLI4 == null || (abstractC928510aGnLIZ5 = interfaceC917530Zz5LJLI4.LIZ()) == null) ? null : abstractC928510aGnLIZ5.LJIJI();
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI5 = LJLI();
        List<? extends LinkPlayerInfo> listLJIIJJI = (interfaceC917530Zz5LJLI5 == null || (abstractC928510aGnLIZ4 = interfaceC917530Zz5LJLI5.LIZ()) == null) ? null : abstractC928510aGnLIZ4.LJIIJJI();
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI6 = LJLI();
        List<? extends LinkPlayerInfo> listLJJIIJZLJL = (interfaceC917530Zz5LJLI6 == null || (abstractC928510aGnLIZ3 = interfaceC917530Zz5LJLI6.LIZ()) == null) ? null : abstractC928510aGnLIZ3.LJJIIJZLJL();
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI7 = LJLI();
        LJLJLJ(zBooleanValue, listLJJIII, listLJIILLIIL, listLJIJI, listLJIIJJI, listLJJIIJZLJL, (interfaceC917530Zz5LJLI7 == null || (abstractC928510aGnLIZ2 = interfaceC917530Zz5LJLI7.LIZ()) == null) ? null : abstractC928510aGnLIZ2.LJJIIZ());
        if (C924990aB7.LIZ(this.LLJI)) {
            DataChannel dataChannel2 = this.LLJI;
            int iIntValue = (dataChannel2 == null || (pair = (Pair) dataChannel2.gg0(MultiGuestPreApprovedChannel.class)) == null) ? 0 : ((Number) pair.getSecond()).intValue();
            C16F5 c16f5 = this.LLLJ;
            if (c16f5 != null) {
                C500260Jjc.LLFFF(c16f5);
                c16f5.setText(C497740JfY.LJIIL(2131755938, iIntValue, Integer.valueOf(iIntValue)));
            }
        } else {
            C925320aBe c925320aBe = C925320aBe.LIZ;
            DataChannel dataChannel3 = this.LLJI;
            c925320aBe.getClass();
            if (C925320aBe.LIZJ(dataChannel3)) {
                DataChannel dataChannel4 = this.LLJI;
                int iIntValue2 = (dataChannel4 == null || (num = (Integer) dataChannel4.gg0(MultiGuestInvitePreApprovedHeadNumChannel.class)) == null) ? 0 : num.intValue();
                C16F5 c16f52 = this.LLLJ;
                if (c16f52 != null) {
                    C500260Jjc.LLFFF(c16f52);
                    c16f52.setText(C497740JfY.LJIIL(2131755938, iIntValue2, Integer.valueOf(iIntValue2)));
                }
            } else {
                C16F5 c16f53 = this.LLLJ;
                if (c16f53 != null) {
                    C500260Jjc.LJIILIIL(c16f53);
                }
            }
        }
        C16FZ c16fz = this.LLJJIII;
        if (c16fz == null) {
            c16fz = null;
        }
        C786410Ut5.LLLIZZ(c16fz, 8);
        RunnableC781530UlD runnableC781530UlD = this.LLJJI;
        C786410Ut5.LLLILZJ(runnableC781530UlD != null ? runnableC781530UlD : null, 0);
    }

    @Override // X.InterfaceC481300Iu8
    public final DataChannel getDataChannel() {
        return this.LLJI;
    }

    @Override // X.C19GI, android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    public final void Aw2(Throwable th) {
        String message;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserKickOutFailed, throwable=");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
    }

    @Override // X.InterfaceC931940aMK
    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        String idStr;
        String idStr2;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("permit, uid=");
        User user = linkPlayerInfo.mUser;
        if (user != null) {
            idStr = user.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        C920500a3s.LIZIZ(linkPlayerInfo.mUser.getId());
        C932140aMe.LJIIIIZZ(linkPlayerInfo);
        C927240aEk c927240aEk = new C927240aEk("anchorMgrV", "permit");
        User user2 = linkPlayerInfo.mUser;
        if (user2 == null || (idStr2 = user2.getIdStr()) == null) {
            idStr2 = "";
        }
        c927240aEk.LJ = idStr2;
        c927240aEk.LIZ();
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestModeratorPermitGuestEvent.class, new C919440a2A(linkPlayerInfo.mUser, 1, null, 4));
        }
    }

    @Override // X.InterfaceC931940aMK
    public final void LIZLLL(LinkPlayerInfo linkPlayerInfo) {
        boolean z;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfo2;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRejectClicked, uid=");
        sbLIZ.append(linkPlayerInfo.mUser.getId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        DataChannel dataChannel = this.LLJI;
        Integer numValueOf = null;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestModeratorPermitGuestEvent.class, new C919440a2A(linkPlayerInfo.mUser, 2, null, 4));
        }
        ((HashSet) C924810aAp.LJ().LJJIFFI).remove(Long.valueOf(linkPlayerInfo.mUser.getId()));
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI = LJLI();
        if (interfaceC917530Zz5LJLI != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJLI.LIZ()) != null && (linkPlayerInfo2 = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(linkPlayerInfo.mUser.getId())) != null) {
            linkPlayerInfo2.LIZ = 0;
        }
        int iIndexOf = this.LLJJJJLIIL.LL.indexOf(linkPlayerInfo);
        long followStatus = linkPlayerInfo.mUser.getFollowInfo().getFollowStatus();
        User user = linkPlayerInfo.mUser;
        Integer numValueOf2 = Integer.valueOf(LIZIZ());
        if (iIndexOf >= 0) {
            numValueOf = Integer.valueOf(iIndexOf);
        }
        if (linkPlayerInfo.linkUserType == 1) {
            z = true;
        } else {
            z = false;
        }
        C925640aCA.LJIIJJI("click", followStatus, user, null, null, null, null, numValueOf2, numValueOf, z);
    }

    @Override // X.InterfaceC931940aMK
    public final List<LinkPlayerInfo> LJIIIZ(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 6) {
                    return this.LLLIIII;
                }
                return this.LLLIIIL;
            }
            return this.LLLIIIIL;
        }
        return this.LLLII;
    }

    public final int LJJIJIL(String str) {
        List<List> listLJIIJJI = C1697810uHb.LJIIJJI(this.LLLFFI, this.LLLI, this.LLLII, this.LLLIIII, this.LLLIIIIL, this.LLLIIIL);
        ArrayList arrayList = new ArrayList();
        for (List list : listLJIIJJI) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof LinkPlayerInfo) {
                    arrayList2.add(obj);
                }
            }
            C19719612Di.LJJI(arrayList2, arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            Integer numValueOf = Integer.valueOf(((LinkPlayerInfo) obj2).LIZIZ);
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Number) entry.getKey()).intValue();
            int i = 0;
            for (Object obj3 : (List) entry.getValue()) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (Intrinsics.LJFF(String.valueOf(((LinkPlayerInfo) obj3).mUser.getId()), str)) {
                        return i2;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return 0;
    }

    @Override // X.InterfaceC931940aMK
    public final void LJJJJI(LinkPlayerInfo linkPlayerInfo) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLIZJ;
        Object next;
        C927240aEk c927240aEk = new C927240aEk("anchorMgrV", "inviteInRoomBtn");
        c927240aEk.LJ = linkPlayerInfo.mUser.getIdStr();
        c927240aEk.LIZ();
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInviteClicked, uid=");
        sbLIZ.append(linkPlayerInfo.mUser.getId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        C920500a3s.LIZIZ(linkPlayerInfo.mUser.getId());
        C932140aMe.LJIIIIZZ(linkPlayerInfo);
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI = LJLI();
        MultiGuestDataHolder multiGuestDataHolder = null;
        if (interfaceC917530Zz5LJLI != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJLI.LIZ()) != null && (listLIZJ = abstractC928510aGnLIZ.LIZJ()) != null) {
            Iterator it2 = listLIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((LinkPlayerInfo) next).mUser.getId() == linkPlayerInfo.mUser.getId()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) next;
            if (linkPlayerInfo2 != null) {
                linkPlayerInfo2.mRoleType = 3;
            }
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            User user = linkPlayerInfo.mUser;
            MultiGuestDataHolder multiGuestDataHolder2 = this.multiGuestDataHolder;
            if (multiGuestDataHolder2 == null) {
                multiGuestDataHolder2 = null;
            }
            String strLJIILIIL = multiGuestDataHolder2.LJIILIIL();
            MultiGuestDataHolder multiGuestDataHolder3 = this.multiGuestDataHolder;
            if (multiGuestDataHolder3 != null) {
                multiGuestDataHolder = multiGuestDataHolder3;
            }
            dataChannel.LC0(MultiGuestModeratorInviteGuestEvent.class, new C919280a1u(user, strLJIILIIL, multiGuestDataHolder.LJJJJJ));
        }
    }

    @Override // X.InterfaceC931940aMK
    public final void LJJJLIIL(User user) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kickOut, uid=");
        sbLIZ.append(user.getId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        if (!this.LLIZLLLIL) {
            return;
        }
        String strLJIJJ = C497740JfY.LJIJJ(2131841439, C0KVU.LIZ(user));
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LIZJ = strLJIJJ;
        c782110Um9.LJII(2131841440);
        c782110Um9.LJIILIIL(2131843832, new AcS354S0200000_15(this, user, 8));
        c782110Um9.LJIIJ(2131841087, new InterfaceC743640TFa() { // from class: X.0a29
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                C924630aAX.LJJ(0);
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
        C924630aAX.LIZ.LJJJLIIL(0, "disconnect_popup_show", new JSONObject(), true);
    }

    public final Pair<Integer, LinkPlayerInfo> LJL(long j) {
        int i = 0;
        for (Object obj : this.LLJJJJLIIL.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                if ((obj instanceof LinkPlayerInfo) && ((LinkPlayerInfo) obj).mUser.getId() == j) {
                    return new Pair<>(Integer.valueOf(i), obj);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new Pair<>(-1, new LinkPlayerInfo());
    }

    public final void LJLIL(long j) {
        Pair pair;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLIZJ;
        Object next;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInviteSuccess, uid=");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI = LJLI();
        int i = 0;
        if (interfaceC917530Zz5LJLI != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJLI.LIZ()) != null && (listLIZJ = abstractC928510aGnLIZ.LIZJ()) != null) {
            Iterator it2 = listLIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((LinkPlayerInfo) next).mUser.getId() == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
            if (linkPlayerInfo != null) {
                linkPlayerInfo.mRoleType = 3;
            }
        }
        C1117360fBO c1117360fBO = this.LLJJJJLIIL;
        Iterator<?> it3 = c1117360fBO.LL.iterator();
        while (true) {
            if (it3.hasNext()) {
                Object next2 = it3.next();
                int i2 = i + 1;
                if (i >= 0) {
                    if ((next2 instanceof LinkPlayerInfo) && ((LinkPlayerInfo) next2).mUser.getId() == j) {
                        pair = new Pair(Integer.valueOf(i), next2);
                        break;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                pair = new Pair(-1, new LinkPlayerInfo());
                break;
            }
        }
        c1117360fBO.notifyItemChanged(((Number) pair.getFirst()).intValue());
    }

    public final void LJLJI(long j) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserPermitSuccess, uid=");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        if (!this.LLIZLLLIL) {
            return;
        }
        if (isShowing()) {
            dismiss();
            C785410UrT.LIZ(this);
        }
        int iLJIIL = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925640aCA.LJIIIZ(true, j, iLJIIL, C927600aFK.LJII());
    }

    public final void LJLJJL(long j) {
        C930130aJP c930130aJP;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserRejectApplySuccess, uid=");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        int iIntValue = LJL(j).getFirst().intValue();
        if (iIntValue == -1) {
            return;
        }
        List<?> list = this.LLJJJJLIIL.LL;
        C500260Jjc.LJI(list, AFwS250S0000000_15.get$arr$(54));
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (ListProtector.get(list, i) instanceof C930130aJP) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = 0;
                break;
            }
        }
        C1117360fBO c1117360fBO = this.LLJJJJLIIL;
        C930320aJi.LJIILJJIL((C410901il) c1117360fBO.LL, iIntValue, c1117360fBO);
        int i2 = this.LLJZ - 1;
        this.LLJZ = i2;
        if (i2 <= 0) {
            C1117360fBO c1117360fBO2 = this.LLJJJJLIIL;
            C930320aJi.LJIILJJIL((C410901il) c1117360fBO2.LL, i, c1117360fBO2);
            if (list.size() == 1) {
                LJLJJLL();
                return;
            }
            return;
        }
        Object obj = ListProtector.get(list, i);
        if (obj instanceof C930130aJP) {
            c930130aJP = (C930130aJP) obj;
        } else {
            c930130aJP = null;
        }
        int i3 = this.LLJZ;
        if (i3 == 1) {
            if (c930130aJP != null) {
                c930130aJP.LIZ = C497740JfY.LJIJJ(2131842070, Integer.valueOf(i3));
                c930130aJP.LIZIZ = 0;
            }
        } else if (c930130aJP != null) {
            c930130aJP.LIZ = C497740JfY.LJIJJ(2131842071, Integer.valueOf(i3));
            c930130aJP.LIZIZ = 0;
        }
        this.LLJJJJLIIL.notifyItemChanged(i);
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        String str;
        C929150aHp c929150aHp;
        Integer num;
        boolean z;
        String string;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfoLJIIJ;
        String str2;
        Long lValueOf;
        Long lValueOf2;
        String strLIZIZ;
        Long lValueOf3;
        String str3;
        Long lValueOf4;
        boolean z2;
        int iIndexOf;
        long followStatus;
        boolean z3;
        boolean z4;
        Integer numValueOf;
        boolean z5;
        FollowInfo followInfo;
        FollowInfo followInfo2;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfoLJIIJ2;
        String str4;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        Object tag = view.getTag(R.id.yo6);
        if ((tag instanceof String) && (str = (String) tag) != null) {
            this.LLLFZ.put(str, Integer.valueOf(view.hashCode()));
            Object tag2 = view.getTag(R.id.yo7);
            if (tag2 instanceof C929150aHp) {
                c929150aHp = (C929150aHp) tag2;
            } else {
                c929150aHp = null;
            }
            if (c929150aHp != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewAttached ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                sbLIZ.append(view.hashCode());
                C20441214yg.LJIIIZ("MultiGuestModeratorsManageDialog", C2188811AlT.LIZIZ(sbLIZ));
                num = c929150aHp.LJ;
                if (!this.LLLFF.containsKey(str)) {
                    C20441214yg.LJIIIZ("MultiGuestModeratorsManageDialog", "not contains");
                    this.LLLFF.put(str, c929150aHp);
                } else if (Intrinsics.LJFF(((LinkedHashMap) this.LLLFF).get(str), c929150aHp) && this.LLJZIJLIL) {
                    C20441214yg.LJIIIZ("MultiGuestModeratorsManageDialog", "contains but not changed");
                } else {
                    C20441214yg.LJIIIZ("MultiGuestModeratorsManageDialog", "contains but not check");
                    this.LLLFF.put(str, c929150aHp);
                }
            } else {
                num = null;
            }
            if (this.LLLF.contains(str)) {
                this.LLLF.remove(str);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            int size = 0;
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            String str5 = "";
            if (!z) {
                string = "";
            } else {
                string = num.toString();
            }
            sbLIZ2.append(string);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (num != null && num.intValue() == 2) {
                InterfaceC917530Zz5 interfaceC917530Zz5LJLI = LJLI();
                if (interfaceC917530Zz5LJLI != null && (abstractC928510aGnLIZ3 = interfaceC917530Zz5LJLI.LIZ()) != null) {
                    linkPlayerInfoLJIIJ2 = C921170a4x.LJIIJ(abstractC928510aGnLIZ3, str);
                } else {
                    linkPlayerInfoLJIIJ2 = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                if (linkPlayerInfoLJIIJ2 == null || (str4 = linkPlayerInfoLJIIJ2.mInteractIdStr) == null) {
                    str4 = str;
                }
                sbLIZ3.append(str4);
                sbLIZ3.append(num);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            }
            C20441214yg.LIZIZ("MultiGuestModeratorsManageDialog", "uniqueIdWithType=" + strLIZIZ2);
            if (LinkMicModeratorExposeSetting.INSTANCE.opt()) {
                ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
                if (C924950aB3.LIZ(strLIZIZ2)) {
                    C20441214yg.LIZIZ("MultiGuestModeratorsManageDialog", "userId{" + str + "} has showed ");
                    return;
                }
            }
            InterfaceC917530Zz5 interfaceC917530Zz5LJLI2 = LJLI();
            if (interfaceC917530Zz5LJLI2 == null || (abstractC928510aGnLIZ = interfaceC917530Zz5LJLI2.LIZ()) == null || (linkPlayerInfoLJIIJ = C921170a4x.LJIIJ(abstractC928510aGnLIZ, str)) == null) {
                return;
            }
            if (linkPlayerInfoLJIIJ.LIZ == 1) {
                long id = linkPlayerInfoLJIIJ.mUser.getId();
                EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
                InterfaceC917530Zz5 interfaceC917530Zz5LJLI3 = LJLI();
                if (interfaceC917530Zz5LJLI3 != null && (abstractC928510aGnLIZ2 = interfaceC917530Zz5LJLI3.LIZ()) != null) {
                    iIndexOf = abstractC928510aGnLIZ2.LJIL().indexOf(linkPlayerInfoLJIIJ);
                } else {
                    iIndexOf = -1;
                }
                int i = iIndexOf + 1;
                List listLIZIZ = C932140aMe.LIZIZ(0, linkPlayerInfoLJIIJ);
                List<String> list = linkPlayerInfoLJIIJ.tagKeyList;
                String strLJFF = C925640aCA.LJFF(C924810aAp.LJ().LJJII);
                User user = linkPlayerInfoLJIIJ.mUser;
                long followStatus2 = 0;
                if (user != null && (followInfo2 = user.getFollowInfo()) != null) {
                    followStatus = followInfo2.getFollowStatus();
                } else {
                    followStatus = 0;
                }
                int size2 = ((ArrayList) this.LLLI).size();
                if (linkPlayerInfoLJIIJ.linkUserType == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (MultiGuestPanelVideoPermissionIconStatus.INSTANCE.getValue() > 0 && C916490ZxP.LIZIZ(linkPlayerInfoLJIIJ.linkTypePermission)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C924350aA5.LIZIZ(id, enumC918970a1PLJI, i, listLIZIZ, list, strLJFF, followStatus, size2, linkPlayerInfoLJIIJ, null, null, null, z3, z4, null, null, null, null, null, 1035776);
                if (linkPlayerInfoLJIIJ.LIZJ) {
                    return;
                }
                int iIndexOf2 = this.LLJJJJLIIL.LL.indexOf(linkPlayerInfoLJIIJ);
                User user2 = linkPlayerInfoLJIIJ.mUser;
                if (user2 != null && (followInfo = user2.getFollowInfo()) != null) {
                    followStatus2 = followInfo.getFollowStatus();
                }
                User user3 = linkPlayerInfoLJIIJ.mUser;
                Integer numValueOf2 = Integer.valueOf(LIZIZ());
                if (iIndexOf2 >= 0) {
                    numValueOf = Integer.valueOf(iIndexOf2);
                } else {
                    numValueOf = null;
                }
                if (linkPlayerInfoLJIIJ.linkUserType == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C925640aCA.LJIIJJI("show", followStatus2, user3, null, null, null, null, numValueOf2, numValueOf, z5);
            }
            if (linkPlayerInfoLJIIJ.LIZ == 0 && linkPlayerInfoLJIIJ.LIZIZ == 3) {
                if (linkPlayerInfoLJIIJ.mRoleType != 3) {
                    str3 = "normal";
                } else {
                    str3 = "abnormal";
                }
                User user4 = linkPlayerInfoLJIIJ.mUser;
                if (user4 != null) {
                    lValueOf4 = Long.valueOf(user4.getId());
                } else {
                    lValueOf4 = null;
                }
                int iLJJIJIL = LJJIJIL(String.valueOf(lValueOf4));
                List listLIZIZ2 = C932140aMe.LIZIZ(0, linkPlayerInfoLJIIJ);
                List<String> list2 = linkPlayerInfoLJIIJ.tagKeyList;
                String strLJFF2 = C925640aCA.LJFF(C924810aAp.LJ().LJJII);
                if (MultiGuestPanelVideoPermissionIconStatus.INSTANCE.getValue() > 0 && C916490ZxP.LIZIZ(linkPlayerInfoLJIIJ.linkTypePermission)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C923220a8G.LIZIZ(linkPlayerInfoLJIIJ, str3, iLJJIJIL, listLIZIZ2, list2, strLJFF2, null, z2, ((ArrayList) this.LLLIIII).size(), null, null);
            }
            int i2 = linkPlayerInfoLJIIJ.LIZIZ;
            if (i2 == 4 || i2 == 6) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                int i3 = linkPlayerInfoLJIIJ.LIZIZ;
                if (i3 == 4) {
                    str2 = "outroom_friend";
                } else if (i3 != 6) {
                    str2 = "";
                } else {
                    str2 = "outroom_recommend_user";
                }
                sbLIZ4.append(str2);
                sbLIZ4.append('_');
                sbLIZ4.append(linkPlayerInfoLJIIJ.mUser.getId());
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                ConcurrentHashSet<String> concurrentHashSet2 = C924950aB3.LIZ;
                if (!C924950aB3.LIZ(strLIZIZ3)) {
                    String idStr = linkPlayerInfoLJIIJ.mUser.getIdStr();
                    int i4 = linkPlayerInfoLJIIJ.LIZIZ;
                    if (i4 == 4) {
                        str5 = "outroom_friend";
                    } else if (i4 == 6) {
                        str5 = "outroom_recommend_user";
                    }
                    C924950aB3.LIZLLL(new C924960aB4(str5, "show", LJIIIZ(i4).size(), LJJIJIL(String.valueOf(linkPlayerInfoLJIIJ.mUser.getId())), "normal", idStr, null, null, null, null, null, null, Long.valueOf(linkPlayerInfoLJIIJ.mUser.getFollowInfo().getFollowStatus()), C923240a8I.LIZ(Long.valueOf(linkPlayerInfoLJIIJ.linkTypePermission)), null, null, null, null, null, C930540aK4.LJIILJJIL(linkPlayerInfoLJIIJ), linkPlayerInfoLJIIJ.trackMap, null, 10473408));
                }
            }
            if (linkPlayerInfoLJIIJ.LIZ == 2 && !linkPlayerInfoLJIIJ.LIZLLL && linkPlayerInfoLJIIJ.mRoleType != 1) {
                C920830a4P.LJI = "go_live_panel";
                InterfaceC917530Zz5 interfaceC917530Zz5LJLI4 = LJLI();
                if (interfaceC917530Zz5LJLI4 != null) {
                    strLIZIZ = interfaceC917530Zz5LJLI4.LIZIZ(linkPlayerInfoLJIIJ.mUser.getId());
                } else {
                    strLIZIZ = null;
                }
                C930480aJy c930480aJy = C930480aJy.LIZ;
                MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
                if (multiGuestDataHolder == null) {
                    multiGuestDataHolder = null;
                }
                c930480aJy.getClass();
                int iLIZJ = C930480aJy.LIZJ(linkPlayerInfoLJIIJ, multiGuestDataHolder);
                MultiGuestDataHolder multiGuestDataHolder2 = this.multiGuestDataHolder;
                if (multiGuestDataHolder2 == null) {
                    multiGuestDataHolder2 = null;
                }
                int iLIZ = C930480aJy.LIZ(linkPlayerInfoLJIIJ, multiGuestDataHolder2);
                ArrayList arrayList = new ArrayList();
                User user5 = linkPlayerInfoLJIIJ.mUser;
                if (user5 != null) {
                    lValueOf3 = Long.valueOf(user5.getId());
                } else {
                    lValueOf3 = null;
                }
                C922800a7a.LJFF(iLIZJ, iLIZ, lValueOf3, strLIZIZ, null, arrayList);
            }
            if (((ArrayList) this.LLLFFI).size() < 2 || linkPlayerInfoLJIIJ.LIZ != 2 || C930540aK4.LJIJJ(linkPlayerInfoLJIIJ.mUser)) {
                return;
            }
            List<LinkPlayerInfo> list3 = this.LLLFFI;
            if (list3 != null) {
                size = ((ArrayList) list3).size();
            }
            int i5 = size - 1;
            User user6 = linkPlayerInfoLJIIJ.mUser;
            if (user6 != null) {
                lValueOf = Long.valueOf(user6.getId());
            } else {
                lValueOf = null;
            }
            int iLJJIJIL2 = LJJIJIL(String.valueOf(lValueOf));
            User user7 = linkPlayerInfoLJIIJ.mUser;
            if (user7 != null) {
                lValueOf2 = Long.valueOf(user7.getId());
            } else {
                lValueOf2 = null;
            }
            C924970aB5.LIZ(i5, iLJJIJIL2, "show", String.valueOf(lValueOf2), null, linkPlayerInfoLJIIJ.trackMap);
        }
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        String str;
        Object tag = view.getTag(R.id.yo6);
        if ((tag instanceof String) && (str = (String) tag) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewDetached ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(view.hashCode());
            C20441214yg.LJIIIZ("MultiGuestModeratorsManageDialog", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLLFZ.containsKey(str)) {
                Integer num = (Integer) ((LinkedHashMap) this.LLLFZ).get(str);
                int iHashCode = view.hashCode();
                if (num != null && num.intValue() == iHashCode) {
                    C20441214yg.LJIIIZ("MultiGuestModeratorsManageDialog", "RealDetached");
                    this.LLLFF.remove(str);
                    this.LLLFZ.remove(str);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.0a7J, X.0aG5] */
    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog.onCreate(android.os.Bundle):void");
    }

    public final void vP1(long j) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserKickOutSuccess, uid=");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
    }

    @Override // X.InterfaceC931940aMK
    public final void LJI(LinkPlayerInfo linkPlayerInfo, long j) {
        User user = linkPlayerInfo.mUser;
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        C918510a0f c918510a0f = new C918510a0f(user, j, multiGuestDataHolder.LJIILIIL(), 1);
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomModeratorCancelInviteGuestEvent.class, c918510a0f);
        }
    }

    @Override // X.InterfaceC931940aMK
    public final void LJJII(LinkPlayerInfo linkPlayerInfo, AwS559S0100000_15 awS559S0100000_15) {
        String str;
        LinkPlayerInfo linkPlayerInfo2;
        boolean z;
        boolean z2;
        LinkControlDataHolder linkControlDataHolder;
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC918930a1L interfaceC918930a1LLIZ = C914870Zun.LIZ();
        if (interfaceC918930a1LLIZ == null) {
            C20441214yg.LJIIL("MultiGuestModeratorsManageDialog", "onInviteClickFusion capability=null");
            awS559S0100000_15.invoke();
            return;
        }
        int i = linkPlayerInfo.LIZIZ;
        if (i != 4) {
            if (i != 6) {
                str = "inviteInRoomBtn";
            } else {
                str = "inviteSuggestBtn";
            }
        } else {
            str = "inviteOutroomFriendBtn";
        }
        C927240aEk c927240aEk = new C927240aEk("anchorMgrV", str);
        c927240aEk.LJ = linkPlayerInfo.mUser.getIdStr();
        c927240aEk.LIZ();
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInviteClickFusion, uid=");
        sbLIZ.append(linkPlayerInfo.mUser.getId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        C920500a3s.LIZIZ(linkPlayerInfo.mUser.getId());
        C932140aMe.LJIIIIZZ(linkPlayerInfo);
        InterfaceC917530Zz5 interfaceC917530Zz5LJLI = LJLI();
        if (interfaceC917530Zz5LJLI == null || (abstractC928510aGnLIZ = interfaceC917530Zz5LJLI.LIZ()) == null || (linkPlayerInfo2 = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(linkPlayerInfo.mUser.getId())) == null) {
            linkPlayerInfo2 = linkPlayerInfo;
        }
        int i2 = linkPlayerInfo2.mRoleType;
        List<String> list = linkPlayerInfo.recommendTagList;
        if (list != null && list.contains("randmatch_guest")) {
            z = true;
        } else {
            z = false;
        }
        int i3 = linkPlayerInfo.LIZIZ;
        if (i3 == 4 || (i3 == 6 && !z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        long id = linkPlayerInfo.mUser.getId();
        C013C c013c = new C013C();
        C921240a54 c921240a54 = new C921240a54(linkPlayerInfo2, i2, z2, this, id, awS559S0100000_15);
        linkPlayerInfo2.mRoleType = 3;
        if (z2 && (linkControlDataHolder = this.linkControlDataHolder) != null) {
            linkControlDataHolder.LIZ(id);
        }
        interfaceC918930a1LLIZ.LIZIZ(C918220a0C.LIZ(C918240a0E.LIZ(new C918350a0P(new C918380a0S(Collections.singletonList(new C916860Zy0(linkPlayerInfo2.mUser.getId(), linkPlayerInfo2.LJII)), Collections.singletonList(linkPlayerInfo2)), new C915880ZwQ(null, false, 7), new C918360a0Q(new AwS55S0310000_15(z2, c013c, this, c921240a54, 4), new AwS381S0200000_15(c013c, c921240a54, 152), new AwS381S0200000_15(c013c, c921240a54, 153)), 8)), AFwS250S0000000_15.get$arr$(220)));
    }

    public final void LJLILLLLZI(int i, Integer num) {
        if (i == 0 && num == null) {
            C16F5 c16f5 = this.LLJJJJJIL;
            if (c16f5 != null) {
                C439101nJ.LJI(c16f5);
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLJJJJJIL;
        if (c16f52 != null) {
            c16f52.setText(C917750ZzR.LIZLLL(i, num));
        }
        C16F5 c16f53 = this.LLJJJJJIL;
        if (c16f53 != null) {
            C500260Jjc.LJLJLJ(c16f53, C01JX.LJIIJ());
        }
    }

    public final void LJLJJI(long j, Throwable th) {
        String message;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserRejectApplyFail, uid=");
        sbLIZ.append(j);
        sbLIZ.append(", throwable=");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
    }

    public final void of0(long j, Throwable th) {
        String message;
        C501520Jle c501520Jle;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserPermitFailed, uid=");
        sbLIZ.append(j);
        sbLIZ.append(", throwable=");
        Integer numValueOf = null;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
        if (!this.LLIZLLLIL) {
            return;
        }
        if ((th instanceof C501470JlZ) && (c501520Jle = (C501520Jle) th) != null) {
            numValueOf = Integer.valueOf(c501520Jle.getErrorCode());
        }
        if (numValueOf != null && (numValueOf.intValue() == 10004 || numValueOf.intValue() == 31007)) {
            C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserPermitFailed, removeApplierByUid, uid=");
            sbLIZ2.append(j);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1143300frELJIIJJI2.getClass();
            AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ2);
            int iIntValue = LJL(j).getFirst().intValue();
            if (iIntValue != -1) {
                List<?> list = this.LLJJJJLIIL.LL;
                int size = list.size();
                int i = 0;
                int i2 = -1;
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = ListProtector.get(list, i3);
                    if ((obj instanceof C930130aJP) && ((C930130aJP) obj).LIZIZ == 0) {
                        i2 = i3;
                    }
                    if ((obj instanceof LinkPlayerInfo) && ((LinkPlayerInfo) obj).mRoleType == 4) {
                        i++;
                    }
                }
                C1117360fBO c1117360fBO = this.LLJJJJLIIL;
                C930320aJi.LJIILJJIL((C410901il) c1117360fBO.LL, iIntValue, c1117360fBO);
                if (i <= 1 && i2 != -1) {
                    C1117360fBO c1117360fBO2 = this.LLJJJJLIIL;
                    C930320aJi.LJIILJJIL((C410901il) c1117360fBO2.LL, i2, c1117360fBO2);
                }
            }
        } else {
            C1143300frE c1143300frELJIIJJI3 = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onUserPermitFailed, MultiLiveHostAcceptGuestResultDialogEvent, uid=");
            sbLIZ3.append(j);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c1143300frELJIIJJI3.getClass();
            AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ3);
        }
        int iLJIIL = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925640aCA.LJIIIZ(false, j, iLJIIL, C927600aFK.LJII());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Boolean] */
    public static final void LJLIIIL(C259800zU<Boolean> c259800zU, MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog, int i) {
        boolean z;
        boolean z2 = true;
        if (!C924230a9t.LIZ(2) && MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            z = true;
        } else {
            z = false;
        }
        if (i > 0 && z) {
            if (!Intrinsics.LJFF(c259800zU.element, true)) {
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                C978360bZC.LJIIIZ("show", "anchor_connection_panel");
                HashMap map = new HashMap();
                C01Z5.LIZ(map);
                map.put("action_type", "show");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_multi_tools_icon");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        } else {
            z2 = false;
        }
        c259800zU.element = Boolean.valueOf(z2);
        View view = multiGuestAsGuestModeratorManageDialog.LLJJIJIIJIL;
        if (view == null) {
            view = null;
        }
        C500260Jjc.LJLJLJ(view, z2);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0a5s] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0a24] */
    public MultiGuestAsGuestModeratorManageDialog(Context context, DataChannel dataChannel, C926940aEG c926940aEG, MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget, C11PQ c11pq) {
        super(context);
        this.LLJI = dataChannel;
        this.LLJIJIL = c926940aEG;
        this.LLJILJIL = multiGuestAsGuestModeratorsWidget;
        this.LLJILJILJ = c11pq;
        this.LLJJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJJLIIL = new C1117360fBO();
        this.LLJLLL = new C481280Iu6(this);
        this.LLJZIJLIL = true;
        this.LLLF = new CopyOnWriteArrayList<>();
        this.LLLFF = new LinkedHashMap();
        this.LLLFFI = new ArrayList();
        this.LLLFZ = new LinkedHashMap();
        this.LLLI = new ArrayList();
        this.LLLII = new ArrayList();
        this.LLLIIII = new ArrayList();
        this.LLLIIIIL = new ArrayList();
        this.LLLIIIL = new ArrayList();
        this.LLLIILIL = LinkMicModeratorPanelExpandInviteTypeSetting.INSTANCE.enable() && LinkMicModeratorInviteCapabilitySetting.INSTANCE.enable() && !C917810ZzX.LJIIIIZZ() && !C930540aK4.LJJIJ();
        this.LLLIL = new AsS42S0100000_15(this, 12);
        this.LLLILZ = new InterfaceC964770bDH() { // from class: X.0a5s
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
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onInviteMessageReceived, message=");
                sbLIZ.append(inviteMessage);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1143300frELJIIJJI.getClass();
                AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
                C786410Ut5.LJFF(this.LL);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPermitApplyMessageReceived, message=");
                sbLIZ.append(permitApplyMessage);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1143300frELJIIJJI.getClass();
                AbstractC1143290frD.LIZ("MultiGuestModeratorsManageDialog", strLIZIZ);
                if (permitApplyMessage.permitStatus == 1) {
                    C786410Ut5.LJFF(this.LL);
                }
            }
        };
        this.LLLILZJ = new InterfaceC914680ZuU() { // from class: X.0a24
            @Override // X.InterfaceC914680ZuU
            public final void LIZ(boolean z) {
                InterfaceC665370Q7z interfaceC665370Q7z;
                ISharedRevenueAbility iSharedRevenueAbility;
                MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModelMB;
                C917930Zzj state;
                if (z) {
                    C16F5 c16f5 = this.LIZ.LLJJJJJIL;
                    if (c16f5 != null) {
                        C439101nJ.LJI(c16f5);
                        return;
                    }
                    return;
                }
                DataChannel dataChannel2 = this.LIZ.LLJI;
                if (dataChannel2 == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) == null || (iSharedRevenueAbility = (ISharedRevenueAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedRevenueAbility.class, null)) == null || (multiGuestGuestShareRevenueViewModelMB = iSharedRevenueAbility.MB()) == null || (state = multiGuestGuestShareRevenueViewModelMB.getState()) == null) {
                    return;
                }
                this.LIZ.LJLILLLLZI(state.LL, state.LLILLJJLI);
            }
        };
        this.LLLILZLLLI = new C928260aGO(new InterfaceC928270aGP() { // from class: X.0aG6
            @Override // X.InterfaceC928270aGP
            public final void LIZ(List<? extends LinkPlayerInfo> list, List<? extends LinkPlayerInfo> list2) {
                List<? extends LinkPlayerInfo> listLJJIII;
                List<? extends LinkPlayerInfo> listLJIIJJI;
                List<? extends LinkPlayerInfo> listLJJIIJZLJL;
                AbstractC928510aGn abstractC928510aGnLIZ;
                AbstractC928510aGn abstractC928510aGnLIZ2;
                AbstractC928510aGn abstractC928510aGnLIZ3;
                AbstractC928510aGn abstractC928510aGnLIZ4;
                MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LIZ;
                InterfaceC917530Zz5 interfaceC917530Zz5LJLI = multiGuestAsGuestModeratorManageDialog.LJLI();
                List<? extends LinkPlayerInfo> listLJJIIZ = null;
                if (interfaceC917530Zz5LJLI != null && (abstractC928510aGnLIZ4 = interfaceC917530Zz5LJLI.LIZ()) != null) {
                    listLJJIII = abstractC928510aGnLIZ4.LJJIII();
                } else {
                    listLJJIII = null;
                }
                InterfaceC917530Zz5 interfaceC917530Zz5LJLI2 = multiGuestAsGuestModeratorManageDialog.LJLI();
                if (interfaceC917530Zz5LJLI2 != null && (abstractC928510aGnLIZ3 = interfaceC917530Zz5LJLI2.LIZ()) != null) {
                    listLJIIJJI = abstractC928510aGnLIZ3.LJIIJJI();
                } else {
                    listLJIIJJI = null;
                }
                InterfaceC917530Zz5 interfaceC917530Zz5LJLI3 = multiGuestAsGuestModeratorManageDialog.LJLI();
                if (interfaceC917530Zz5LJLI3 != null && (abstractC928510aGnLIZ2 = interfaceC917530Zz5LJLI3.LIZ()) != null) {
                    listLJJIIJZLJL = abstractC928510aGnLIZ2.LJJIIJZLJL();
                } else {
                    listLJJIIJZLJL = null;
                }
                InterfaceC917530Zz5 interfaceC917530Zz5LJLI4 = multiGuestAsGuestModeratorManageDialog.LJLI();
                if (interfaceC917530Zz5LJLI4 != null && (abstractC928510aGnLIZ = interfaceC917530Zz5LJLI4.LIZ()) != null) {
                    listLJJIIZ = abstractC928510aGnLIZ.LJJIIZ();
                }
                multiGuestAsGuestModeratorManageDialog.LJLJLJ(false, listLJJIII, list, list2, listLJIIJJI, listLJJIIJZLJL, listLJJIIZ);
            }
        });
        C948450amx.LIZIZ.LIZJ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0377, code lost:
    
        if (r5.isEmpty() == false) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0461  */
    /* JADX WARN: Type inference failed for: r0v133, types: [X.0aGO] */
    /* JADX WARN: Type inference failed for: r0v136, types: [X.0aGO] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLJ(boolean r16, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r17, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r18, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r19, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r20, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r21, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r22) {
        /*
            Method dump skipped, instruction units count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog.LJLJLJ(boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }
}
