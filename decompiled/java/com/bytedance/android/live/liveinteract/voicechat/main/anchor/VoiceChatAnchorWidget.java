package com.bytedance.android.live.liveinteract.voicechat.main.anchor;

import X.AbstractC922600a7G;
import X.C01GW;
import X.C13IQ;
import X.C13LE;
import X.C1555540qa8;
import X.C1558360qeg;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C465900IOu;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C724750Sbp;
import X.C737770Swp;
import X.C748880TZe;
import X.C766270U4b;
import X.C785410UrT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917750ZzR;
import X.C921440a5O;
import X.C922130a6V;
import X.C924410aAB;
import X.C924810aAp;
import X.C925640aCA;
import X.C926770aDz;
import X.C927330aEt;
import X.C927390aEz;
import X.C927410aF1;
import X.C930540aK4;
import X.C933520aOs;
import X.C934690aQl;
import X.C940900aam;
import X.C946803n0;
import X.C948450amx;
import X.C956790b0P;
import X.C977650bY3;
import X.C977800bYI;
import X.C987103tV;
import X.DialogInterfaceOnDismissListenerC987010bn9;
import X.InterfaceC1097170eep;
import X.InterfaceC302401Fe;
import X.InterfaceC665370Q7z;
import X.InterfaceC921460a5Q;
import X.InterfaceC922630a7J;
import X.InterfaceC927720aFW;
import X.InterfaceC947260al2;
import X.InterfaceC954180awC;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestApplyNumChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.GuidenceAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.MultiGuestGuidenceViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenListDialogWithPositionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.InvokeGiftPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAnchorSideShowGuidenceEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestHideGuideLinkMicEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveDialogBackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveOpenModeratorListEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestAnchorShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ShareRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.AnchorQuickConnectAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.IAnchorQuickConnectAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.MultiGuestShowLayoutSettingDialogEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorQuickConnectSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiguestAnchorQuickConnectForVoiceChatSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatAnchorWidget extends AbsVoiceChatWidget implements InterfaceC921460a5Q {
    public C921440a5O LLILLJJLI;
    public MultiLiveAsAnchorListDialogV2 LLILLL;
    public LinkDialog LLILZ;
    public C927330aEt LLILZIL;
    public MultiGuestGuidenceViewModel LLIZ;
    public MultiGuestAnchorShareRevenueViewModel LLIZLLLIL;
    public MultiGuestAnchorQuickConnectViewModel LLJ;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;
    public final C01GW LLILZLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 529));
    public final C01GW LLJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 528));

    @Override // X.InterfaceC921460a5Q
    public final void Aw2(Throwable th) {
    }

    @Override // X.InterfaceC921460a5Q
    public final void CD() {
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ void D2(long j, String str) {
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ void VP0(C922130a6V c922130a6V) {
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ void XP(String str, String str2, String str3) {
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ void Y6() {
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ MultiLiveAsAnchorListDialogV2 eZ0() {
        return null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hsw;
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ void k02() {
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ void on2() {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC921460a5Q
    public final /* synthetic */ void ul() {
    }

    @Override // X.InterfaceC921460a5Q
    public final void vk0() {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean x1(Runnable runnable, boolean z, C465900IOu c465900IOu, boolean z2) {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean y1() {
        return true;
    }

    @Override // X.InterfaceC921460a5Q
    public final void AF() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C500260Jjc.LJJLIIIJL(multiLiveAsAnchorListDialogV2);
        }
    }

    public final C924410aAB B1() {
        return (C924410aAB) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC921460a5Q
    public final void Ul2() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.LLD();
            if (multiLiveAsAnchorListDialogV2.isShowing()) {
                multiLiveAsAnchorListDialogV2.dismiss();
                C785410UrT.LIZ(multiLiveAsAnchorListDialogV2);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        ViewGroup viewGroup;
        Fragment fragmentLIZ;
        MultiGuestGuidenceViewModel multiGuestGuidenceViewModel;
        Boolean bool;
        InterfaceC921460a5Q interfaceC921460a5Q;
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        ILinkStateAbility iLinkStateAbility;
        Fragment fragmentLIZ2;
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel;
        Fragment fragmentLIZ3;
        Fragment fragmentLIZ4;
        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel;
        Fragment fragmentLIZ5;
        MultiGuestGuidenceViewModel viewModel;
        MultiGuestGuidenceViewModel viewModel2;
        MultiGuestGuidenceViewModel viewModel3;
        InterfaceC665370Q7z interfaceC665370Q7z;
        Fragment fragmentLIZ6;
        Fragment fragmentLIZ7;
        super.onCreate();
        MultiGuestAnchorPanelTypeSetting.INSTANCE.setDisable();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C921440a5O c921440a5O = new C921440a5O(room, this.dataChannel, this);
            this.LLILLJJLI = c921440a5O;
            c921440a5O.LLILZIL = B1();
            c921440a5O.attachView(this);
            View view = getView();
            if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C926770aDz.LIZIZ(this);
                if (interfaceC665370Q7zLIZIZ != null) {
                    C926770aDz.LIZ(interfaceC665370Q7zLIZIZ, true);
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
                    dataChannel2.SX0(C956790b0P.class, ((interfaceC1097170eep == null || (fragmentLIZ7 = interfaceC1097170eep.getFragment()) == null) && (fragmentLIZ7 = C946803n0.LIZ(getView())) == null) ? null : C1558360qeg.LJFF(fragmentLIZ7, "linkMicScope"));
                }
                InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
                if (interfaceC1097170eep2 == null || (fragmentLIZ = interfaceC1097170eep2.getFragment()) == null) {
                    fragmentLIZ = C946803n0.LIZ(getView());
                }
                boolean zBooleanValue = false;
                if (fragmentLIZ != null) {
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiGuestGuidenceViewModel.class);
                    multiGuestGuidenceViewModel = (MultiGuestGuidenceViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ), C724750Sbp.LJIIIZ(fragmentLIZ), new C940900aam(), new AwS134S0110000_16(fragmentLIZ, 7), new AwS134S0110000_16(fragmentLIZ, 6), new C987103tV(fragmentLIZ, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ);
                    InterfaceC1097170eep interfaceC1097170eep3 = this.widgetCallback;
                    if ((interfaceC1097170eep3 != null && (fragmentLIZ6 = interfaceC1097170eep3.getFragment()) != null) || (fragmentLIZ6 = C946803n0.LIZ(getView())) != null) {
                        C1555540qa8.LIZ(C1558360qeg.LJFF(fragmentLIZ6, "linkMicScope"), new GuidenceAbilityImpl(multiGuestGuidenceViewModel), IGuidenceAbility.class, null);
                    }
                } else {
                    multiGuestGuidenceViewModel = null;
                }
                this.LLIZ = multiGuestGuidenceViewModel;
                final C933520aOs c933520aOs = (C933520aOs) this.LLJI.getValue();
                DataChannel dataChannel3 = c933520aOs.LIZ;
                IGuidenceAbility iGuidenceAbility = (dataChannel3 == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel3.gg0(C956790b0P.class)) == null) ? null : (IGuidenceAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuidenceAbility.class, null);
                c933520aOs.LIZJ = iGuidenceAbility;
                if (iGuidenceAbility != null && (viewModel3 = iGuidenceAbility.getViewModel()) != null) {
                    MultiGuestGuidenceViewModel.vQ2(viewModel3, new C2217371BqR() { // from class: X.0aOn
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C933680aP8) obj).LL;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C933680aP8) obj).LL = (C933460aOm) obj2;
                        }
                    }, c933520aOs.LIZIZ, new AwS594S0100000_15(c933520aOs, 864));
                }
                IGuidenceAbility iGuidenceAbility2 = c933520aOs.LIZJ;
                if (iGuidenceAbility2 != null && (viewModel2 = iGuidenceAbility2.getViewModel()) != null) {
                    MultiGuestGuidenceViewModel.vQ2(viewModel2, new C2217371BqR() { // from class: X.0aOy
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C933680aP8) obj).LLILLJJLI;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C933680aP8) obj).LLILLJJLI = (C933690aP9) obj2;
                        }
                    }, c933520aOs.LIZIZ, new AwS594S0100000_15(c933520aOs, 865));
                }
                IGuidenceAbility iGuidenceAbility3 = c933520aOs.LIZJ;
                if (iGuidenceAbility3 != null && (viewModel = iGuidenceAbility3.getViewModel()) != null) {
                    MultiGuestGuidenceViewModel.vQ2(viewModel, new C2217381BqS() { // from class: X.0aOu
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C933680aP8) obj).LLILLL;
                        }
                    }, c933520aOs.LIZIZ, new AwS594S0100000_15(c933520aOs, 866));
                }
                C948450amx c948450amx = C948450amx.LIZIZ;
                AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) c948450amx.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (abstractC922600a7G != null) {
                    abstractC922600a7G.LJJIJIL(new InterfaceC922630a7J() { // from class: X.0a4u
                        @Override // X.InterfaceC922630a7J
                        public final void Ue(Throwable th) {
                        }

                        @Override // X.InterfaceC922630a7J
                        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LJIILL().iterator();
                            while (it2.hasNext()) {
                                arrayList.add(it2.next().mUser);
                            }
                            c933520aOs.LIZIZ(arrayList);
                        }

                        @Override // X.InterfaceC922630a7J
                        public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<LinkListUser> it2 = interfaceC921200a50.LJIILL().iterator();
                            while (it2.hasNext()) {
                                User user = it2.next().user;
                                if (user != null) {
                                    arrayList.add(user);
                                }
                            }
                            c933520aOs.LIZIZ(arrayList);
                        }
                    });
                }
                LinkControlDataHolder linkControlDataHolder = (LinkControlDataHolder) c948450amx.LJIIJJI("LINK_CONTROL_DATA_HOLDER");
                if (linkControlDataHolder != null) {
                    linkControlDataHolder.LIZ.add((InterfaceC927720aFW) c933520aOs.LJFF.getValue());
                }
                DataChannel dataChannel4 = c933520aOs.LIZ;
                if (dataChannel4 != null) {
                    dataChannel4.BQ2(c933520aOs.LIZIZ, MultiGuestAnchorSideShowGuidenceEvent.class, new AwS594S0100000_15(c933520aOs, 867));
                }
                DataChannel dataChannel5 = c933520aOs.LIZ;
                if (dataChannel5 != null) {
                    dataChannel5.BQ2(c933520aOs.LIZIZ, MultiGuestHideGuideLinkMicEvent.class, new AwS594S0100000_15(c933520aOs, 862));
                    dataChannel5.BQ2(c933520aOs.LIZIZ, LinkInRoomAnchorInviteGuestEvent.class, new AwS594S0100000_15(c933520aOs, 863));
                }
                if (C917750ZzR.LJI(true)) {
                    InterfaceC1097170eep interfaceC1097170eep4 = this.widgetCallback;
                    if ((interfaceC1097170eep4 == null || (fragmentLIZ4 = interfaceC1097170eep4.getFragment()) == null) && (fragmentLIZ4 = C946803n0.LIZ(getView())) == null) {
                        multiGuestAnchorShareRevenueViewModel = null;
                    } else {
                        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiGuestAnchorShareRevenueViewModel.class);
                        multiGuestAnchorShareRevenueViewModel = (MultiGuestAnchorShareRevenueViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ4), C724750Sbp.LJIIIZ(fragmentLIZ4), new C940900aam(), new AwS134S0110000_16(fragmentLIZ4, 7), new AwS134S0110000_16(fragmentLIZ4, 6), new C987103tV(fragmentLIZ4, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ2);
                        InterfaceC1097170eep interfaceC1097170eep5 = this.widgetCallback;
                        if ((interfaceC1097170eep5 != null && (fragmentLIZ5 = interfaceC1097170eep5.getFragment()) != null) || (fragmentLIZ5 = C946803n0.LIZ(getView())) != null) {
                            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ5, "linkMicScope");
                            C1555540qa8.LIZ(interfaceC665370Q7zLJFF, new ShareRevenueAbility(multiGuestAnchorShareRevenueViewModel, null), ISharedRevenueAbility.class, null);
                            multiGuestAnchorShareRevenueViewModel.iT0(interfaceC665370Q7zLJFF);
                        }
                    }
                    this.LLIZLLLIL = multiGuestAnchorShareRevenueViewModel;
                }
                if (MultiguestAnchorQuickConnectForVoiceChatSetting.INSTANCE.enable() && MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnable()) {
                    InterfaceC1097170eep interfaceC1097170eep6 = this.widgetCallback;
                    if ((interfaceC1097170eep6 == null || (fragmentLIZ2 = interfaceC1097170eep6.getFragment()) == null) && (fragmentLIZ2 = C946803n0.LIZ(getView())) == null) {
                        multiGuestAnchorQuickConnectViewModel = null;
                    } else {
                        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MultiGuestAnchorQuickConnectViewModel.class);
                        multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ3, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ2), C724750Sbp.LJIIIZ(fragmentLIZ2), new C940900aam(), new AwS134S0110000_16(fragmentLIZ2, 7), new AwS134S0110000_16(fragmentLIZ2, 6), new C987103tV(fragmentLIZ2, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ3);
                        InterfaceC1097170eep interfaceC1097170eep7 = this.widgetCallback;
                        if ((interfaceC1097170eep7 != null && (fragmentLIZ3 = interfaceC1097170eep7.getFragment()) != null) || (fragmentLIZ3 = C946803n0.LIZ(getView())) != null) {
                            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLIZ3, "linkMicScope");
                            C1555540qa8.LIZ(interfaceC665370Q7zLJFF2, new AnchorQuickConnectAbilityImpl(multiGuestAnchorQuickConnectViewModel), IAnchorQuickConnectAbility.class, null);
                            multiGuestAnchorQuickConnectViewModel.LL = this.dataChannel;
                            multiGuestAnchorQuickConnectViewModel.iT0(interfaceC665370Q7zLJFF2);
                        }
                    }
                    this.LLJ = multiGuestAnchorQuickConnectViewModel;
                }
                C924410aAB c924410aABB1 = B1();
                DataChannel dataChannel6 = this.dataChannel;
                C921440a5O c921440a5O2 = this.LLILLJJLI;
                c924410aABB1.LJJIL(dataChannel6, viewGroup, c921440a5O2 != null ? c921440a5O2.LLILLJJLI : null, this);
                B1().rc();
                C921440a5O c921440a5O3 = this.LLILLJJLI;
                if (c921440a5O3 != null && (interfaceC921460a5Q = (InterfaceC921460a5Q) c921440a5O3.mView) != null && (interfaceC665370Q7zF3 = interfaceC921460a5Q.F3()) != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zF3, ILinkStateAbility.class, null)) != null) {
                    c921440a5O3.subscribeStateChange(iLinkStateAbility);
                }
                C921440a5O c921440a5O4 = this.LLILLJJLI;
                if (c921440a5O4 != null) {
                    DataChannel dataChannel7 = c921440a5O4.dataChannel;
                    if (dataChannel7 != null && (bool = (Boolean) dataChannel7.gg0(MuteMicChannel.class)) != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    c921440a5O4.LJJLJ(zBooleanValue);
                }
            }
        }
        DataChannel dataChannel8 = this.dataChannel;
        if (dataChannel8 != null) {
            dataChannel8.BQ2(this, MultiLiveDialogBackEvent.class, new AwS594S0100000_15(this, 532));
            dataChannel8.CQ2(AnchorOpenListDialogWithPositionEvent.class, this, new AwS594S0100000_15(this, 533));
            dataChannel8.CQ2(ShowUserListDialog.class, this, new AwS594S0100000_15(this, 534));
            dataChannel8.BQ2(this, PlayerPauseLiveForAnchorDialogEvent.class, new AwS594S0100000_15(this, 535));
            dataChannel8.BQ2(this, AudioStateChangeEvent.class, new AwS594S0100000_15(this, 536));
            dataChannel8.BQ2(this, MultiLiveOpenModeratorListEvent.class, new AwS594S0100000_15(this, 537));
            dataChannel8.BQ2(this, MultiGuestShowLayoutSettingDialogEvent.class, new AwS594S0100000_15(this, 538));
            dataChannel8.BQ2(this, InvokeGiftPanelEvent.class, new AwS594S0100000_15(this, 539));
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final boolean qa0() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        return multiLiveAsAnchorListDialogV2 != null && multiLiveAsAnchorListDialogV2.isShowing();
    }

    public VoiceChatAnchorWidget() throws IllegalAccessException {
        C948450amx.LIZIZ.LIZLLL(this);
    }

    @Override // X.InterfaceC921460a5Q
    public final InterfaceC665370Q7z F3() {
        View view = getView();
        if (!(view instanceof FrameLayout) || view == null) {
            return null;
        }
        return C1555540qa8.LJ(view);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        B1().If();
        C924410aAB c924410aABB1 = B1();
        View view = getView();
        c924410aABB1.LJJIJLIJ(view instanceof FrameLayout ? (ViewGroup) view : null);
        C921440a5O c921440a5O = this.LLILLJJLI;
        if (c921440a5O != null) {
            c921440a5O.detachView();
        }
        LinkDialog linkDialog = this.LLILZ;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C500260Jjc.LJJLIIIJL(multiLiveAsAnchorListDialogV2);
        }
        super.onDestroy();
        View view2 = getView();
        if (view2 != null) {
            if (this.LLIZ != null) {
                C1555540qa8.LIZLLL(view2);
            }
            MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel = this.LLIZLLLIL;
            if (multiGuestAnchorShareRevenueViewModel != null) {
                multiGuestAnchorShareRevenueViewModel.eB1(C1555540qa8.LIZLLL(view2));
            }
            MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = this.LLJ;
            if (multiGuestAnchorQuickConnectViewModel != null) {
                multiGuestAnchorQuickConnectViewModel.eB1(C1555540qa8.LIZLLL(view2));
            }
        }
        C934690aQl.LIZ.LIZIZ();
        C933520aOs c933520aOs = (C933520aOs) this.LLJI.getValue();
        c933520aOs.getClass();
        LinkControlDataHolder linkControlDataHolder = (LinkControlDataHolder) C948450amx.LIZIZ.LJIIJJI("LINK_CONTROL_DATA_HOLDER");
        if (linkControlDataHolder != null) {
            linkControlDataHolder.LIZ.remove(c933520aOs.LJFF.getValue());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        B1().onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C921440a5O c921440a5O = this.LLILLJJLI;
        if (c921440a5O != null) {
            c921440a5O.LLILZLL = Boolean.FALSE;
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.resume();
            }
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null) {
                interfaceC954180awCLLJLL2.LIZJ("onEnterForeground");
            }
        }
        B1().onResume();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C921440a5O c921440a5O = this.LLILLJJLI;
        if (c921440a5O != null) {
            c921440a5O.onEnterBackground();
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void At2(Map map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV2 != null) {
                String str = (String) entry.getKey();
                ((Boolean) entry.getValue()).booleanValue();
                multiLiveAsAnchorListDialogV2.onEvent(new C927410aF1(str));
            }
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void B2(List<LinkPlayerInfo> list) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22;
        if (this.isViewValid && (multiLiveAsAnchorListDialogV2 = this.LLILLL) != null && multiLiveAsAnchorListDialogV2.isShowing() && (multiLiveAsAnchorListDialogV22 = this.LLILLL) != null) {
            multiLiveAsAnchorListDialogV22.B2(list);
        }
    }

    public final void C1(String str) {
        if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup() && str.length() > 0) {
            C921440a5O c921440a5O = this.LLILLJJLI;
            if (c921440a5O != null) {
                c921440a5O.LJJLIIJ(str, null, C2097608Jq.LJ());
                return;
            }
            return;
        }
        C921440a5O c921440a5O2 = this.LLILLJJLI;
        if (c921440a5O2 == null) {
            return;
        }
        c921440a5O2.LJJLIIIJ();
    }

    @Override // X.InterfaceC921460a5Q
    public final void FE0(Throwable th) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.LLD();
            C501540Jlg.LIZLLL(multiLiveAsAnchorListDialogV2.getContext(), th, 2131853465);
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void Gv(String str) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842749, str));
    }

    @Override // X.InterfaceC921460a5Q
    public final void Lc2(C977800bYI c977800bYI) {
        FragmentManager fragmentManager;
        LinkDialog linkDialog;
        LinkDialog linkDialog2 = this.LLILZ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        LinkDialog linkDialogLJ = C977650bY3.LJ(this, c977800bYI);
        if (MultiGuestMemoryLeakOptSetting.isEnable()) {
            linkDialogLJ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 10));
        }
        this.LLILZ = linkDialogLJ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (linkDialog = this.LLILZ) != null) {
            linkDialog.show(fragmentManager, "LinkDialog");
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void rM0(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.rM0(j);
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void ud1(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.ud1(j);
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void vP1(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null && multiLiveAsAnchorListDialogV2.LLIZLLLIL) {
            multiLiveAsAnchorListDialogV2.s = true;
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void yJ0(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null && multiLiveAsAnchorListDialogV2.LLIZLLLIL && multiLiveAsAnchorListDialogV2.isShowing()) {
            multiLiveAsAnchorListDialogV2.dismiss();
            C785410UrT.LIZ(multiLiveAsAnchorListDialogV2);
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void TP1(long j, Throwable th) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.TP1(j, th);
        }
    }

    @Override // X.InterfaceC921460a5Q, X.InterfaceC921510a5V
    public final void Zh(long j, boolean z) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.Zh(j, z);
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void of0(long j, Throwable th) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.of0(j, th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void z1(String str, boolean z) {
        int i;
        if (!isViewValid()) {
            return;
        }
        String strLJFF = C925640aCA.LJFF(C924810aAp.LJ().LJJII);
        C927390aEz c927390aEz = (C927390aEz) this.dataChannel.gg0(MultiGuestApplyNumChangedEvent.class);
        if (c927390aEz != null) {
            i = c927390aEz.LIZIZ;
        } else {
            i = 0;
        }
        DataChannel dataChannel = null;
        C925640aCA.LJIJI(i, null, "golive_window", strLJFF, "button_icon");
        C921440a5O c921440a5O = this.LLILLJJLI;
        if (c921440a5O != null) {
            if (this.LLILLL == null) {
                Context context = this.context;
                C921440a5O c921440a5O2 = this.LLILLJJLI;
                if (c921440a5O2 != null) {
                    dataChannel = c921440a5O2.dataChannel;
                }
                this.LLILLL = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c921440a5O, this.widgetCallback.getRootLifeCycleOwner(), (InterfaceC302401Fe) null, 40);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV2 != null) {
                multiLiveAsAnchorListDialogV2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 23));
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV22 != null) {
                C786410Ut5.G4(multiLiveAsAnchorListDialogV22);
            }
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void OU0(String str, String str2, Map map) {
        C921440a5O c921440a5O;
        int i;
        DataChannel dataChannel;
        if (isViewValid() && (c921440a5O = this.LLILLJJLI) != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            InterfaceC302401Fe interfaceC302401Fe = null;
            if (multiGuestDataHolder == null) {
                multiGuestDataHolder = null;
            }
            C927330aEt c927330aEt = this.LLILZIL;
            if (c927330aEt != null) {
                i = c927330aEt.LIZ;
            } else {
                i = -1;
            }
            multiGuestDataHolder.LJJJJJ = i;
            if (this.LLILLL == null) {
                Context context = this.context;
                C921440a5O c921440a5O2 = this.LLILLJJLI;
                if (c921440a5O2 != null) {
                    dataChannel = c921440a5O2.dataChannel;
                } else {
                    dataChannel = null;
                }
                this.LLILLL = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c921440a5O, this.widgetCallback.getRootLifeCycleOwner(), interfaceC302401Fe, 40);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV2 != null) {
                multiLiveAsAnchorListDialogV2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 24));
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV22 != null) {
                multiLiveAsAnchorListDialogV22.LLJJJJLIIL(str);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV23 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV23 != null) {
                multiLiveAsAnchorListDialogV23.LLJJIJIIJIL(str2, map);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV24 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV24 != null) {
                C786410Ut5.G4(multiLiveAsAnchorListDialogV24);
            }
            this.LLILZIL = null;
        }
    }
}
