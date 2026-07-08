package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common;

import X.AbstractC923750a97;
import X.AbstractC928510aGn;
import X.AbstractC929640aIc;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IMT;
import X.C0K04;
import X.C0KVU;
import X.C0UTB;
import X.C0UTD;
import X.C0UX6;
import X.C1113800f5e;
import X.C11NJ;
import X.C12ES;
import X.C1304660k3U;
import X.C1338270kvh;
import X.C1546210qL5;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C16FZ;
import X.C189200o6;
import X.C19GN;
import X.C19GO;
import X.C19ME;
import X.C19WF;
import X.C19WJ;
import X.C19WM;
import X.C1AZW;
import X.C1EOY;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C305801Gm;
import X.C307001Gy;
import X.C410901il;
import X.C439101nJ;
import X.C470590Icr;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C520010KaN;
import X.C785230UrB;
import X.C785270UrF;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915980Zwa;
import X.C917750ZzR;
import X.C917810ZzX;
import X.C917930Zzj;
import X.C921170a4x;
import X.C921180a4y;
import X.C921390a5J;
import X.C922680a7O;
import X.C922760a7W;
import X.C922770a7X;
import X.C922800a7a;
import X.C923130a87;
import X.C923760a98;
import X.C924630aAX;
import X.C924790aAn;
import X.C924810aAp;
import X.C924980aB6;
import X.C924990aB7;
import X.C925320aBe;
import X.C925600aC6;
import X.C925640aCA;
import X.C925770aCN;
import X.C926350aDJ;
import X.C926520aDa;
import X.C926630aDl;
import X.C927240aEk;
import X.C927600aFK;
import X.C928340aGW;
import X.C929810aIt;
import X.C929830aIv;
import X.C930140aJQ;
import X.C930540aK4;
import X.C930940aKi;
import X.C945740aia;
import X.C945770aid;
import X.C948450amx;
import X.C950220apo;
import X.C951190arN;
import X.C986860bmu;
import X.DialogInterfaceOnClickListenerC986970bn5;
import X.EnumC1120860fH2;
import X.EnumC1303240k1C;
import X.EnumC926600aDi;
import X.EnumC929650aId;
import X.InterfaceC254600ye;
import X.InterfaceC500100JjM;
import X.InterfaceC917640ZzG;
import X.InterfaceC920780a4K;
import X.InterfaceC921410a5L;
import X.InterfaceC925780aCO;
import X.InterfaceC928000aFy;
import X.InterfaceC929970aJ9;
import X.InterfaceC934710aQn;
import X.InterfaceC948490an1;
import X.InterfaceC951240arS;
import X.InterfaceC954180awC;
import X.RunnableC781530UlD;
import Y.ALAdapterS10S0200000_15;
import Y.ARunnableS113S0100000_13;
import Y.AfS184S0100000_15;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveSucceedEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.gamelink.model.ShowGuestDisconnectDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AutoOpenGuestApplyDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestFirstApplyFromNormalRoom;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.ApplyDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryRefreshLinkPlayerStateEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestPreApprovedChannel;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyHangupSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestPanelUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStatFieldSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnhanceInviteSenseSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveRoomMatchConfigSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestUserInfoFragment extends PreviewFragment implements InterfaceC929970aJ9, InterfaceC925780aCO, InterfaceC920780a4K, C0IMT<Integer>, Parcelable {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZzogLTclJyk8ZiYjJCI8JmsBPCMnIQI5LDwnHTYpOwY9LioKOy40JSAiPQ==";
    public C19GN activeModalDialog;
    public ImageView anchorTopAvatarIm;
    public C16F5 animationApplyTv;
    public C16F5 animationDescTv;
    public C945740aia applyInfoView;
    public ConstraintLayout applyInfoViewContainer;
    public InterfaceC928000aFy applyInterceptor;
    public List<GuestApplyStillInLineResponse.GuestApplyItem> applyListFilterCurRoom;
    public ApplyDialogUICtrlCmd applyUIOptCtrlCmd;
    public Animator avatarShowAnim;
    public ViewGroup avatarTopContainer;
    public List<GuestApplyStillInLineResponse.GuestInvitedItem> beInviteListFilterCurRoom;
    public View beautyRedDotView;
    public LiveIconView beautyView;
    public C0UTD checkParam;
    public C0UTD checkParamForReservation;
    public String closeWay;
    public boolean compensateHandlerWaitCount;
    public C16FS connectSwitchBtn;
    public ViewGroup contentView;
    public DataChannel dataChannel;
    public C16F5 descText;
    public C19WM dragDismissHelper;
    public boolean enableDragDismiss;
    public final C01GW fansRequiredInterceptor$delegate;
    public LiveIconView faqIcon;
    public final C01GW gifterApplyAlphaOutAnim$delegate;
    public C945740aia gifterApplyInfoTopView;
    public C945740aia gifterApplyInfoView;
    public final C01GW gifterApplyTopAlphaInAnim$delegate;
    public ViewGroup gifterAvatarContainer;
    public ViewGroup gifterBtnContainer;
    public C16FS gifterCancelRequestBtn;
    public ViewGroup gifterContainer;
    public C16FS gifterSendGiftBtn;
    public FrameLayout guestMatchEntryContainer;
    public final C01GW guestShareRevenueViewModel$delegate;
    public ImageView guestTopAvatarIm;
    public boolean hasLogPanelOpen;
    public boolean hasObserveAvatar;
    public boolean hasScrollAndChangeUi;
    public boolean hasScrollAnimatorEnd;
    public boolean hasShowAvatarRedDot;
    public boolean hasShowGifterUi;
    public boolean isAnimationApplyTV;
    public boolean isGameLink;
    public final C01GW isShowGifterStyle$delegate;
    public List<? extends LinkPlayerInfo> lastGuestLinkPlayerList;
    public RecyclerView listView;
    public C16FZ loadingView;
    public C925770aCN mApplyInfo;
    public AbstractC929640aIc mApplyPresenter;
    public EnumC926600aDi mApplyType;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;
    public LiveDialogFragment mDialog;
    public WeakReference<AbstractC923750a97> mGuestPresenter;
    public final C410901il mOldOnlineItems;
    public final C410901il mOldWaitingItems;
    public View mRootView;
    public boolean mUpdatedAll;
    public C16F5 maxApplyCountHint;
    public int ownRank;
    public Integer preApprovePeopleInWaitlist;
    public int scene;
    public final boolean shouldShowStillInLineList;
    public String source;
    public LiveIconView statusSettingView;
    public final C951190arN stillInLineAdapter;
    public RunnableC781530UlD stillInLineRecyclerView;
    public C16F5 stillInLineTitle;
    public C16F5 stillInLineTv;
    public final C01GW uid2ScoreMap$delegate;
    public boolean useFakeStateFirstTime;

    @InterfaceC948490an1(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
    public InterfaceC917640ZzG userManager;
    public static final C929830aIv Companion = new Object() { // from class: X.0aIv
    };
    public static final int $stable = 8;
    public int waitingCount = -1;
    public Integer currentLinkState = -1;
    public final C951190arN adapter = new C951190arN();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC920780a4K
    public final void mh() {
        RR(false);
    }

    @Override // X.InterfaceC920780a4K
    public final void onCancelSuccess() {
        RR(false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FS() {
        Integer num;
        C16F5 c16f5;
        Long l;
        if (C924990aB7.LIZ(this.dataChannel)) {
            C16F5 c16f52 = this.animationApplyTv;
            if (c16f52 != null) {
                C12ES.LJIILL(0, c16f52);
            }
            C16F5 c16f53 = this.descText;
            if (c16f53 != null) {
                C439101nJ.LJI(c16f53);
                return;
            }
            return;
        }
        if (C922770a7X.LIZIZ() && (num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 1) {
            long jLIZJ = C923130a87.LIZJ(aS());
            if (jLIZJ > 0) {
                C16F5 c16f54 = this.animationApplyTv;
                if (c16f54 != null) {
                    C439101nJ.LJI(c16f54);
                }
                String strJ4 = C786410Ut5.j4(C497740JfY.LJIIJJI(2131755575, (int) jLIZJ), Arrays.copyOf(new Object[]{Long.valueOf(jLIZJ)}, 1));
                DataChannel dataChannel = this.dataChannel;
                int iLongValue = (dataChannel == null || (l = (Long) dataChannel.gg0(MultiGuestGuestSelfSendGiftData.class)) == null) ? 0 : (int) l.longValue();
                C16F5 c16f55 = this.descText;
                if (c16f55 != null) {
                    c16f55.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(2131755574, iLongValue), Arrays.copyOf(new Object[]{Integer.valueOf(iLongValue), strJ4}, 2)));
                }
                if (LinkMicGuestPanelUiOptSetting.isEnabled() || (c16f5 = this.descText) == null) {
                    return;
                }
                c16f5.setTextSize(15.0f);
            }
        }
    }

    public final void JS() {
        if (this.isAnimationApplyTV) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.animationApplyTv, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.addListener(new ALAdapterS10S0200000_15(objectAnimatorOfFloat, this, 2));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void NS() {
        C16FS c16fs = this.connectSwitchBtn;
        if (c16fs != null) {
            c16fs.setClickable(true);
        }
        C925320aBe c925320aBe = C925320aBe.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c925320aBe.getClass();
        if (C925320aBe.LIZJ(dataChannel)) {
            QS();
            return;
        }
        if (!nS()) {
            ConstraintLayout constraintLayout = this.applyInfoViewContainer;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            C786410Ut5.LL(0, constraintLayout);
            int i = C929810aIt.LIZ;
            if (i != 1) {
                if (i == 2) {
                    C16F5 c16f5 = this.animationDescTv;
                    if (c16f5 != null) {
                        c16f5.setText(C497740JfY.LJIJI(2131842119));
                    }
                } else if (i == 3) {
                    C16F5 c16f52 = this.animationDescTv;
                    if (c16f52 != null) {
                        c16f52.setText(C497740JfY.LJIJI(2131841206));
                    }
                    C16F5 c16f53 = this.animationApplyTv;
                    if (c16f53 != null) {
                        c16f53.setText(C497740JfY.LJIJI(2131841202));
                    }
                    JS();
                }
            } else if (oS()) {
                hT(null);
            } else {
                C16F5 c16f54 = this.animationDescTv;
                if (c16f54 != null) {
                    c16f54.setText(C497740JfY.LJIJI(2131842120));
                }
            }
            PS(this);
            return;
        }
        ConstraintLayout constraintLayout2 = this.applyInfoViewContainer;
        C786410Ut5.LL(0, constraintLayout2 != null ? constraintLayout2 : null);
        int i2 = C929810aIt.LIZ;
        if (i2 == 1) {
            C16F5 c16f55 = this.animationDescTv;
            if (c16f55 != null) {
                c16f55.setText(C497740JfY.LJIJI(2131841201));
            }
            C16F5 c16f56 = this.animationApplyTv;
            if (c16f56 != null) {
                c16f56.setText(C497740JfY.LJIJI(2131841200));
            }
        } else if (i2 == 2) {
            C16F5 c16f57 = this.animationDescTv;
            if (c16f57 != null) {
                c16f57.setText(C497740JfY.LJIJI(2131841220));
            }
            C16F5 c16f58 = this.animationApplyTv;
            if (c16f58 != null) {
                c16f58.setText(C497740JfY.LJIJI(2131841219));
            }
        } else if (i2 == 3) {
            C16F5 c16f59 = this.animationDescTv;
            if (c16f59 != null) {
                c16f59.setText(C497740JfY.LJIJI(2131841206));
            }
            C16F5 c16f510 = this.animationApplyTv;
            if (c16f510 != null) {
                c16f510.setText(C497740JfY.LJIJI(2131841202));
            }
        }
        JS();
        PS(this);
    }

    public final void OR() {
        AbstractC929640aIc abstractC929640aIc = this.mApplyPresenter;
        if (abstractC929640aIc != null) {
            C921390a5J c921390a5J = C921390a5J.LIZ;
            Context context = getContext();
            DataChannel dataChannel = this.dataChannel;
            Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
            C11NJ c11njLJ = abstractC929640aIc.LJ();
            InterfaceC921410a5L interfaceC921410a5L = new InterfaceC921410a5L() { // from class: X.0aIZ
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                @Override // X.InterfaceC921410a5L
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse.ResponseData r8) {
                    /*
                        r7 = this;
                        com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment r6 = r7.LIZ
                        r4 = 0
                        if (r8 == 0) goto L2f
                        r6.getClass()
                        com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo r0 = r8.reserveUserInfo
                        if (r0 == 0) goto L2f
                        long r2 = r0.reserveId
                    Lf:
                        java.lang.String r1 = "click"
                        r0 = 1
                        r6.rS(r2, r1, r0)
                        X.C929810aIt.LIZIZ(r0)
                        X.C929810aIt.LIZLLL = r4
                        boolean r0 = r6.nS()
                        if (r0 == 0) goto L2c
                        X.0aDi r0 = X.EnumC926600aDi.SEND_RESERVATION
                    L22:
                        r6.mApplyType = r0
                        com.bytedance.android.livesdk.LiveDialogFragment r0 = r6.mDialog
                        if (r0 == 0) goto L2b
                        r0.dismiss()
                    L2b:
                        return
                    L2c:
                        X.0aDi r0 = X.EnumC926600aDi.SEND_REQUEST
                        goto L22
                    L2f:
                        r2 = 0
                        goto Lf
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C929610aIZ.LIZ(com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse$ResponseData):void");
                }

                @Override // X.InterfaceC921410a5L
                public final void onFailed(Throwable th) {
                    MultiGuestUserInfoFragment multiGuestUserInfoFragment = this.LIZ;
                    multiGuestUserInfoFragment.getClass();
                    multiGuestUserInfoFragment.rS(C929810aIt.LIZLLL, "click", true);
                    multiGuestUserInfoFragment.YS();
                    multiGuestUserInfoFragment.NS();
                }
            };
            c921390a5J.getClass();
            C921390a5J.LIZIZ(context, room, c11njLJ, interfaceC921410a5L);
            rS(C929810aIt.LIZLLL, "show", true);
        }
    }

    public final void PR() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        Map<Long, Long> mapLJJIIZI;
        Long l;
        Room room;
        C19GN c19gn;
        AbstractC923750a97 abstractC923750a97;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkListUser linkListUserLJIIJJI;
        C948450amx c948450amx = C948450amx.LIZIZ;
        Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        User owner = null;
        InterfaceC917640ZzG interfaceC917640ZzG = objLJIIIZ instanceof InterfaceC917640ZzG ? (InterfaceC917640ZzG) objLJIIIZ : null;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ2 = interfaceC917640ZzG.LIZ()) != null && (linkListUserLJIIJJI = C921170a4x.LJIIJJI(abstractC928510aGnLIZ2, currentUserId)) != null) {
            C922800a7a.LIZLLL(currentUserId, "guest", "go_live_panel", aS().LJJLIIIJILLIZJL, linkListUserLJIIJJI.linkMicId);
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            this.closeWay = "disconnect_icon";
            WeakReference<AbstractC923750a97> weakReference = this.mGuestPresenter;
            if (weakReference != null && (abstractC923750a97 = weakReference.get()) != null) {
                abstractC923750a97.exitInteractWithConfirm("go_live_panel", "leave_normally", 10002);
            }
        } else {
            C19GN c19gn2 = this.activeModalDialog;
            if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.activeModalDialog) != null) {
                c19gn.dismiss();
                C785410UrT.LIZ(c19gn);
            }
            String str = EnumC929650aId.PANEL.value;
            MultiGuestSlardarMonitorOptSetting multiGuestSlardarMonitorOptSetting = MultiGuestSlardarMonitorOptSetting.INSTANCE;
            if (multiGuestSlardarMonitorOptSetting.isEnable()) {
                JSONObject jSONObject = new JSONObject();
                C0K04.LJFF("type", str, jSONObject);
                C924630aAX.LIZ.LJJJLIIL(0, "leave_click", jSONObject, false);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                owner = room.getOwner();
            }
            String strLIZ = C0KVU.LIZ(owner);
            if (strLIZ == null) {
                strLIZ = "";
            }
            String strLJIJJ = C497740JfY.LJIJJ(2131841439, strLIZ);
            InterfaceC917640ZzG interfaceC917640ZzG2 = (InterfaceC917640ZzG) c948450amx.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            boolean z = (interfaceC917640ZzG2 == null || (abstractC928510aGnLIZ = interfaceC917640ZzG2.LIZ()) == null || (mapLJJIIZI = abstractC928510aGnLIZ.LJJIIZI()) == null || (l = mapLJJIIZI.get(Long.valueOf(C950220apo.LJFF()))) == null || l.longValue() != 0) ? false : true;
            boolean zJq1 = C915980Zwa.LIZLLL().jq1();
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            String strLJIJI = (c924810aApLJ == null || c924810aApLJ.LJJIIJ != 3 || zJq1 || z) ? C497740JfY.LJIJI(2131842392) : C497740JfY.LJIJI(2131836674);
            C19GO c19go = new C19GO(getContext());
            c19go.LIZLLL = strLJIJJ;
            c19go.LJII = strLJIJI;
            c19go.LJ(2131843832, new DialogInterfaceOnClickListenerC986970bn5(this, 1), false);
            c19go.LIZJ(2131843838, new DialogInterface.OnClickListener() { // from class: X.0aIl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C924630aAX.LJJIJ(0);
                    dialogInterface.dismiss();
                }
            }, false);
            this.activeModalDialog = c19go.LIZ();
            if (multiGuestSlardarMonitorOptSetting.isEnable()) {
                C924630aAX.LIZ.LJJJLIIL(0, "leave_popup_show", new JSONObject(), false);
            }
            C19GN c19gn3 = this.activeModalDialog;
            if (c19gn3 != null) {
                C926630aDl.LIZ(c19gn3, 5, true, false, false, 120);
            }
            C19GN c19gn4 = this.activeModalDialog;
            if (c19gn4 != null) {
                C786410Ut5.M4(c19gn4);
            }
        }
        if (!this.isGameLink || this.dataChannel == null) {
            return;
        }
        Pair pair = new Pair("go_live_panel", 10002);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(ShowGuestDisconnectDialogEvent.class, pair);
        }
    }

    public final void SR() {
        AbstractC923750a97 abstractC923750a97;
        InterfaceC500100JjM<C470590Icr<MultiLiveGuestInfoList>> interfaceC500100JjMFetchUserListData;
        WeakReference<AbstractC923750a97> weakReference = this.mGuestPresenter;
        if (weakReference == null || (abstractC923750a97 = weakReference.get()) == null || (interfaceC500100JjMFetchUserListData = abstractC923750a97.fetchUserListData(qS())) == null) {
            return;
        }
        interfaceC500100JjMFetchUserListData.LIZ(new AfS184S0100000_15(this, 74), new AfS184S0100000_15(this, 75));
    }

    public final Integer VR() {
        C923760a98 c923760a98;
        List<LinkUser> listLIZLLL;
        int size;
        if (!this.isGameLink) {
            return Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()));
        }
        WeakReference<AbstractC923750a97> weakReference = this.mGuestPresenter;
        AbstractC923750a97 abstractC923750a97 = weakReference != null ? weakReference.get() : null;
        if (!(abstractC923750a97 instanceof C923760a98) || (c923760a98 = (C923760a98) abstractC923750a97) == null) {
            return null;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = c923760a98.LL.LLJLL();
        int i = 0;
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null && (size = listLIZLLL.size()) != 0) {
            i = size - 1;
        }
        return Integer.valueOf(i);
    }

    public final Animator WR() {
        return (Animator) this.gifterApplyAlphaOutAnim$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void XS() {
        Integer num;
        C925770aCN c925770aCN;
        EnumC926600aDi enumC926600aDi = this.mApplyType;
        boolean z = false;
        if (enumC926600aDi != EnumC926600aDi.SEND_RESERVATION && enumC926600aDi != EnumC926600aDi.RESERVING && !C929810aIt.LIZ() && (((num = (Integer) C924790aAn.LIZLLL().LIZIZ) == null || num.intValue() != 1) && (c925770aCN = this.mApplyInfo) != null && c925770aCN.LIZJ == 5)) {
            C0UTD c0utd = new C0UTD(C520010KaN.LJIJ(getContext(), true), this.dataChannel, AFwS250S0000000_15.get$arr$(77), AFwS203S0000000_15.get$arr$(128), 0, 32);
            InterfaceC928000aFy interfaceC928000aFy = this.applyInterceptor;
            if ((interfaceC928000aFy == null || !interfaceC928000aFy.LIZ(c0utd, true)) && !((InterfaceC928000aFy) this.fansRequiredInterceptor$delegate.getValue()).LIZ(c0utd, true)) {
                z = true;
            }
        }
        this.useFakeStateFirstTime = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void YS() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        C16FS c16fs = this.connectSwitchBtn;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        C16FS c16fs2 = this.connectSwitchBtn;
        if (c16fs2 != null) {
            c16fs2.setClickable(true);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GuestMatchEntryRefreshLinkPlayerStateEvent.class, C924790aAn.LIZLLL().LIZIZ);
        }
        this.currentLinkState = (Integer) C924790aAn.LIZLLL().LIZIZ;
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null) {
            if (num.intValue() != 0) {
                if (num.intValue() != 2) {
                    if (num.intValue() == 1) {
                        ZS();
                        return;
                    }
                    return;
                }
                BS();
                C16FS c16fs3 = this.connectSwitchBtn;
                if (c16fs3 != null) {
                    C12ES.LJIILL(0, c16fs3);
                }
                NR(R.style.a82);
                ES(C497740JfY.LJIJI(2131841435));
                C16FS c16fs4 = this.connectSwitchBtn;
                ViewGroup.LayoutParams layoutParams = c16fs4 != null ? c16fs4.getLayoutParams() : null;
                if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return;
                }
                marginLayoutParams.bottomMargin = 28;
                C16FS c16fs5 = this.connectSwitchBtn;
                if (c16fs5 != null) {
                    C786410Ut5.x6(c16fs5, marginLayoutParams);
                }
                C16F5 c16f5 = this.descText;
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 8);
                    return;
                }
                return;
            }
            BS();
            EnumC926600aDi enumC926600aDi = this.mApplyType;
            if (enumC926600aDi == null) {
                i = -1;
            } else {
                i = C926350aDJ.LIZ[enumC926600aDi.ordinal()];
                if (i == 2) {
                    ES(C497740JfY.LJIJI(2131851630));
                    NR(R.style.a7b);
                    return;
                }
            }
            if (i == 3) {
                ES(C497740JfY.LJIJI(2131841218));
                NR(R.style.a7g);
                C16FS c16fs6 = this.connectSwitchBtn;
                if (c16fs6 != null) {
                    C12ES.LJIILL(0, c16fs6);
                    return;
                }
                return;
            }
            if (i == 4) {
                ES(C497740JfY.LJIJI(2131841110));
                NR(R.style.a82);
                C16FS c16fs7 = this.connectSwitchBtn;
                if (c16fs7 != null) {
                    C12ES.LJIILL(0, c16fs7);
                    return;
                }
                return;
            }
            C925320aBe c925320aBe = C925320aBe.LIZ;
            DataChannel dataChannel2 = this.dataChannel;
            c925320aBe.getClass();
            if (C925320aBe.LIZJ(dataChannel2)) {
                QS();
                return;
            }
            if (C929810aIt.LIZ()) {
                ES(C497740JfY.LJIJI(2131841110));
                NR(R.style.a82);
                C16FS c16fs8 = this.connectSwitchBtn;
                if (c16fs8 != null) {
                    C12ES.LJIILL(0, c16fs8);
                    return;
                }
                return;
            }
            NR(R.style.a7g);
            ES(oS() ? C497740JfY.LJIJI(2131853891) : C497740JfY.LJIJI(2131843980));
            C16FS c16fs9 = this.connectSwitchBtn;
            if (c16fs9 != null) {
                C12ES.LJIILL(0, c16fs9);
            }
            C16F5 c16f52 = this.descText;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
            fT();
        }
    }

    public final Animator ZR() {
        return (Animator) this.gifterApplyTopAlphaInAnim$delegate.getValue();
    }

    public final MultiGuestDataHolder aS() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final HashMap<Integer, Long> bS() {
        return (HashMap) this.uid2ScoreMap$delegate.getValue();
    }

    public final void fT() {
        int i;
        Integer num;
        C19ME c19me;
        C16F5 c16f5;
        AssemViewModel assemViewModel = (AssemViewModel) this.guestShareRevenueViewModel$delegate.getValue();
        C917930Zzj c917930Zzj = assemViewModel != null ? (C917930Zzj) assemViewModel.getState() : null;
        if (c917930Zzj != null) {
            i = c917930Zzj.LL;
            num = c917930Zzj.LLILLJJLI;
        } else {
            i = 0;
            num = null;
        }
        String strLIZLLL = C917750ZzR.LIZLLL(i, num);
        C16F5 c16f52 = this.descText;
        if (c16f52 != null) {
            c16f52.setText(strLIZLLL);
        }
        if (!nS()) {
            FS();
        }
        if (C917810ZzX.LJIIIIZZ() && C917810ZzX.LJIIJ() && (c16f5 = this.descText) != null) {
            c16f5.setText(C497740JfY.LJIJI(2131851845));
        }
        if (!this.shouldShowStillInLineList) {
            ConstraintLayout constraintLayout = this.applyInfoViewContainer;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            } else {
                c19me.bottomToTop = R.id.ja3;
            }
        }
        if (!LinkMicGuestPanelUiOptSetting.isEnabled()) {
            C16F5 c16f53 = this.animationApplyTv;
            if (c16f53 != null) {
                C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(14.0f), c16f53);
                return;
            }
            return;
        }
        C16F5 c16f54 = this.animationApplyTv;
        if (c16f54 != null) {
            C500260Jjc.LJJLJ(0, c16f54);
        }
        ConstraintLayout constraintLayout2 = this.applyInfoViewContainer;
        ConstraintLayout constraintLayout3 = constraintLayout2 != null ? constraintLayout2 : null;
        int paddingStart = constraintLayout3.getPaddingStart();
        int paddingTop = constraintLayout3.getPaddingTop();
        int paddingEnd = constraintLayout3.getPaddingEnd();
        C1546210qL5.LIZ.getClass();
        constraintLayout3.setPadding(paddingStart, paddingTop, paddingEnd, C814420VxA.LIZIZ(C1546210qL5.LIZ(32)));
    }

    public final void iS() {
        C16FZ c16fz = this.loadingView;
        if (c16fz != null) {
            C439101nJ.LJI(c16fz);
        }
        ViewGroup viewGroup = this.gifterBtnContainer;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        ConstraintLayout constraintLayout = this.applyInfoViewContainer;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(0, constraintLayout);
        ViewGroup viewGroup2 = this.gifterContainer;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
    }

    public final void iT() {
        C16F5 c16f5 = this.animationDescTv;
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
        }
        C16F5 c16f52 = this.animationApplyTv;
        if (c16f52 != null) {
            C500260Jjc.LLFFF(c16f52);
        }
        C16F5 c16f53 = this.animationDescTv;
        if (c16f53 != null) {
            c16f53.setText(C497740JfY.LJIJI(2131854564));
        }
        C16F5 c16f54 = this.animationApplyTv;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJI(2131854563));
        }
        C945740aia c945740aia = this.applyInfoView;
        if (c945740aia == null) {
            c945740aia = null;
        }
        C925770aCN c925770aCN = this.mApplyInfo;
        C500260Jjc.LJJJI(c925770aCN != null ? Boolean.valueOf(c925770aCN.LJFF) : null);
        c945740aia.LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean kS() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            r5 = 0
            if (r1 == 0) goto L53
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestFirstApplyFromNormalRoom> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestFirstApplyFromNormalRoom.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L53
            X.0INV r0 = X.C0IL2.LIZ
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r0 = r0.LIZ()
            r4 = 0
            if (r0 == 0) goto L50
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r3 = r0.mEnterRoomConfig
            if (r3 == 0) goto L51
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r3.mRoomsData
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.isFromMgTopLive
        L26:
            java.lang.String r1 = "1"
            boolean r2 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r3 == 0) goto L4e
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r3.mRoomsData
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.enterForMultiLive
        L34:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r3 == 0) goto L40
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r3.mRoomsData
            if (r0 == 0) goto L40
            java.lang.String r4 = r0.actionTypeForMultiLive
        L40:
            java.lang.String r0 = "5"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r2 == 0) goto L4d
            if (r1 == 0) goto L4d
            if (r0 == 0) goto L4d
            r5 = 1
        L4d:
            return r5
        L4e:
            r0 = r4
            goto L34
        L50:
            r3 = r4
        L51:
            r0 = r4
            goto L26
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment.kS():boolean");
    }

    public final boolean nS() {
        WeakReference<AbstractC923750a97> weakReference = this.mGuestPresenter;
        return (weakReference != null ? weakReference.get() : null) instanceof C922680a7O;
    }

    public final void o() {
        C19GN c19gn;
        C19GN c19gn2 = this.activeModalDialog;
        if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.activeModalDialog) != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        C19GO c19go = new C19GO(getContext());
        c19go.LJI(2131844676);
        c19go.LIZIZ(C924990aB7.LIZ(this.dataChannel) ? 2131855392 : 2131844677);
        c19go.LJ(2131844675, new DialogInterfaceOnClickListenerC986970bn5(this, 0), false);
        c19go.LIZJ(2131843825, new DialogInterface.OnClickListener() { // from class: X.0aIr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, false);
        C19GN c19gnLIZ = c19go.LIZ();
        this.activeModalDialog = c19gnLIZ;
        c19gnLIZ.setCanceledOnTouchOutside(false);
        C19GN c19gn3 = this.activeModalDialog;
        if (c19gn3 != null) {
            C926630aDl.LIZ(c19gn3, 5, true, false, false, 120);
        }
        C19GN c19gn4 = this.activeModalDialog;
        if (c19gn4 != null) {
            C786410Ut5.M4(c19gn4);
        }
        rS(0L, "show", false);
    }

    @Override // X.InterfaceC925780aCO
    public final void oE() {
        InterfaceC917640ZzG interfaceC917640ZzG = this.userManager;
        if (interfaceC917640ZzG != null) {
            interfaceC917640ZzG.LJIJJ(C950220apo.LJFF(), "anchor_invite_guest");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        LiveDialogFragment liveDialogFragment = this.mDialog;
        if (liveDialogFragment == null) {
            return true;
        }
        liveDialogFragment.dismissAllowingStateLoss();
        return true;
    }

    public final boolean qS() {
        return ((Boolean) this.isShowGifterStyle$delegate.getValue()).booleanValue();
    }

    public final void sS() {
        try {
            C16FS c16fs = this.connectSwitchBtn;
            if (c16fs != null) {
                c16fs.setEnabled(true);
            }
            C16F5 c16f5 = this.maxApplyCountHint;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            if (LinkMicGuestPanelUiOptSetting.isEnabled()) {
                YS();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void zS() {
        C925770aCN c925770aCN = this.mApplyInfo;
        if (c925770aCN == null || c925770aCN.LIZJ != 5) {
            return;
        }
        c925770aCN.LIZJ = -1;
    }

    public MultiGuestUserInfoFragment() {
        this.shouldShowStillInLineList = LinkMicApplyHangupSetting.isEnable() || MultiGuestEnhanceInviteSenseSetting.isEnabled();
        this.stillInLineAdapter = new C951190arN();
        this.fansRequiredInterceptor$delegate = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(129));
        this.mOldOnlineItems = new C410901il();
        this.mOldWaitingItems = new C410901il();
        this.gifterApplyAlphaOutAnim$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 378));
        this.gifterApplyTopAlphaInAnim$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 379));
        this.closeWay = "outside";
        this.uid2ScoreMap$delegate = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(127));
        this.guestShareRevenueViewModel$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 380));
        try {
            C948450amx.LIZIZ.LIZJ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().LJIIZILJ();
            C948450amx.LIZIZ.LIZJ(this);
            C1304660k3U.LIZ.LIZIZ(70001, "LinkInjector.inject error", th, null);
        }
        if (aS() instanceof GameLinkDataHolder) {
            this.isGameLink = true;
        }
        C20441214yg.LIZIZ("MultiGuestUserInfoFragment", "init useFakeStateFirstTime from init");
        XS();
        this.isShowGifterStyle$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 381));
    }

    public final void BS() {
        LiveIconView liveIconView;
        if (nS() || this.isGameLink || (liveIconView = this.beautyView) == null) {
            return;
        }
        C786410Ut5.LLJJIJIL(liveIconView, 0);
    }

    public final void QS() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toStateIdleWhenInvitePreApprove ");
        C925770aCN c925770aCN = this.mApplyInfo;
        sbLIZ.append(C500260Jjc.LJJJI(c925770aCN != null ? Boolean.valueOf(c925770aCN.LJFF) : null));
        C20441214yg.LIZIZ("MultiGuestUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
        C16F5 c16f5 = this.animationDescTv;
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
        }
        C16F5 c16f52 = this.animationApplyTv;
        if (c16f52 != null) {
            C500260Jjc.LLFFF(c16f52);
        }
        C16F5 c16f53 = this.descText;
        if (c16f53 != null) {
            C500260Jjc.LJIILIIL(c16f53);
        }
        C16F5 c16f54 = this.animationDescTv;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJI(2131855395));
        }
        C16F5 c16f55 = this.animationApplyTv;
        if (c16f55 != null) {
            Integer num = this.preApprovePeopleInWaitlist;
            int iIntValue = num != null ? num.intValue() : 0;
            Object[] objArr = new Object[1];
            Integer num2 = this.preApprovePeopleInWaitlist;
            objArr[0] = Integer.valueOf(num2 != null ? num2.intValue() : 0);
            c16f55.setText(C497740JfY.LJIIL(2131755938, iIntValue, objArr));
        }
        C16FS c16fs = this.connectSwitchBtn;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131841110));
            NR(R.style.a85);
        }
        C945740aia c945740aia = this.applyInfoView;
        if (c945740aia == null) {
            c945740aia = null;
        }
        C925770aCN c925770aCN2 = this.mApplyInfo;
        C500260Jjc.LJJJI(c925770aCN2 != null ? Boolean.valueOf(c925770aCN2.LJFF) : null);
        c945740aia.LJI();
    }

    public final void RS() {
        Pair pair;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toStateRequesting isShowGifterStyle:");
        sbLIZ.append(qS());
        C20441214yg.LIZIZ("MultiGuestUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (MultiTopLiveRoomMatchConfigSetting.isEnableRandomMatch() && kS()) {
            iT();
        } else {
            if (C924990aB7.LIZ(this.dataChannel)) {
                DataChannel dataChannel = this.dataChannel;
                int iIntValue = (dataChannel == null || (pair = (Pair) dataChannel.gg0(MultiGuestPreApprovedChannel.class)) == null) ? 0 : ((Number) pair.getSecond()).intValue();
                C16F5 c16f5 = this.animationDescTv;
                if (c16f5 != null) {
                    C500260Jjc.LLFFF(c16f5);
                }
                C16F5 c16f52 = this.animationApplyTv;
                if (c16f52 != null) {
                    C500260Jjc.LLFFF(c16f52);
                }
                C16F5 c16f53 = this.descText;
                if (c16f53 != null) {
                    C500260Jjc.LJIILIIL(c16f53);
                }
                C16F5 c16f54 = this.animationDescTv;
                if (c16f54 != null) {
                    c16f54.setText(C497740JfY.LJIJI(2131855395));
                }
                C16F5 c16f55 = this.animationApplyTv;
                if (c16f55 != null) {
                    c16f55.setText(C497740JfY.LJIIL(2131755938, iIntValue, Integer.valueOf(iIntValue)));
                }
                C945740aia c945740aia = this.applyInfoView;
                if (c945740aia == null) {
                    c945740aia = null;
                }
                C925770aCN c925770aCN = this.mApplyInfo;
                C500260Jjc.LJJJI(c925770aCN != null ? Boolean.valueOf(c925770aCN.LJFF) : null);
                c945740aia.LJI();
            } else if (qS()) {
                C945740aia c945740aia2 = this.gifterApplyInfoView;
                if (c945740aia2 != null) {
                    c945740aia2.LJI();
                }
            } else {
                ConstraintLayout constraintLayout = this.applyInfoViewContainer;
                if (constraintLayout == null) {
                    constraintLayout = null;
                }
                C786410Ut5.LL(0, constraintLayout);
                RecyclerView recyclerView = this.listView;
                if (recyclerView != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView, 8);
                }
                C16F5 c16f56 = this.animationDescTv;
                if (c16f56 != null) {
                    c16f56.setText(C497740JfY.LJIJI(2131842119));
                }
                C945740aia c945740aia3 = this.applyInfoView;
                if (c945740aia3 == null) {
                    c945740aia3 = null;
                }
                C925770aCN c925770aCN2 = this.mApplyInfo;
                C500260Jjc.LJJJI(c925770aCN2 != null ? Boolean.valueOf(c925770aCN2.LJFF) : null);
                c945740aia3.LJI();
            }
        }
        if (!MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility() || this.hasObserveAvatar) {
            return;
        }
        RedDotExtensionKt.LJI(this.beautyRedDotView, this, null, C0UX6.MULTI_GUEST_AVATAR, new AwS594S0100000_15(this, 452));
        this.hasObserveAvatar = true;
    }

    public final int UR() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = aS().LIZIZ();
        if (multiLiveAnchorPanelSettingsLIZIZ != null) {
            return multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) {
            return 0;
        }
        return (int) multiLiveUserApplyPermission.applierSortSetting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void VS() {
        YS();
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null) {
            if (num.intValue() == 1) {
                RS();
            } else if (num.intValue() == 0 || num.intValue() == -1) {
                NS();
            }
        }
    }

    @Override // X.InterfaceC925780aCO
    public final void ZK() {
        DataChannel dataChannel;
        C925770aCN c925770aCN;
        DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ;
        C305801Gm.LIZIZ(2131842112);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
        C925770aCN c925770aCN2 = this.mApplyInfo;
        c927600aFKLIZ.getClass();
        if (!C927600aFK.LJIILJJIL(c925770aCN2) && (((c925770aCN = this.mApplyInfo) == null || (c925770aCN.LIZJ != 5 && c925770aCN.LIZJ != 6 && c925770aCN.LIZJ != 10 && c925770aCN.LIZJ != 15)) && (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ()) != null)) {
            boolean z = deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZLLL == 2;
            deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZLLL = -1;
            if (!z) {
                RR(false);
            }
        }
        zS();
        aS().LJI = System.currentTimeMillis();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(LinkInRoomGuestApplySucceedEvent.class, new Pair("", Boolean.FALSE));
        }
        YS();
        RS();
        if (!C922760a7W.LIZLLL() || nS() || mS() || C930540aK4.LJJIJ() || UR() != 1 || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.FQ2(AutoOpenGuestApplyDialogEvent.class);
    }

    public final void ZS() {
        if (qS()) {
            C16F5 c16f5 = this.descText;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
        } else {
            NR(R.style.a85);
            ES(C497740JfY.LJIJI(2131840602));
            C16F5 c16f52 = this.descText;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
            fT();
            C16FS c16fs = this.connectSwitchBtn;
            if (c16fs != null) {
                C12ES.LJIILL(0, c16fs);
            }
        }
        BS();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS() {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment.dS():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hS() {
        Context context;
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initApplyState useFakeStateFirstTime:");
        sbLIZ.append(this.useFakeStateFirstTime);
        C20441214yg.LIZIZ("MultiGuestUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (this.useFakeStateFirstTime) {
            ZS();
            RS();
        } else {
            C925320aBe c925320aBe = C925320aBe.LIZ;
            DataChannel dataChannel = this.dataChannel;
            c925320aBe.getClass();
            if (C925320aBe.LIZJ(dataChannel)) {
                QS();
            } else {
                YS();
                if (num != null) {
                    if (num.intValue() == 1) {
                        RS();
                    } else if (num.intValue() == 0 || num.intValue() == -1) {
                        NS();
                    }
                }
            }
        }
        C925770aCN c925770aCN = this.mApplyInfo;
        if (c925770aCN != null && ((c925770aCN.LIZJ == 5 || c925770aCN.LIZJ == 6 || c925770aCN.LIZJ == 10) && (context = getContext()) != null)) {
            gS(context);
        }
        C924790aAn.LIZLLL().LIZ(this);
    }

    @Override // X.InterfaceC925780aCO
    public final void ht() {
        C305801Gm.LIZIZ(2131841221);
        C929810aIt.LIZIZ(2);
        aS().LJII = System.currentTimeMillis();
        this.mApplyType = EnumC926600aDi.RESERVING;
        C925770aCN c925770aCN = this.mApplyInfo;
        if (c925770aCN == null || c925770aCN.LIZJ != 1) {
            LiveDialogFragment liveDialogFragment = this.mDialog;
            if (liveDialogFragment != null) {
                liveDialogFragment.dismiss();
                return;
            }
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(LinkInRoomGuestReserveSucceedEvent.class);
        }
    }

    public final boolean mS() {
        return !nS() && C929810aIt.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean oS() {
        return (C924790aAn.LIZLLL().LJ() || ((Integer) C924790aAn.LIZLLL().LIZIZ).intValue() == -1) && !nS() && !mS() && C924810aAp.LJ().LJJJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC923750a97 abstractC923750a97;
        C19GN c19gn;
        Integer num;
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestFirstApplyFromNormalRoom.class, Boolean.FALSE);
        }
        this.compensateHandlerWaitCount = true;
        this.adapter.LLLIIIIL();
        C925770aCN c925770aCN = this.mApplyInfo;
        if (c925770aCN != null && c925770aCN.LIZJ == 2 && ((num = (Integer) C924790aAn.LIZLLL().LIZIZ) == null || num.intValue() != 1)) {
            C925600aC6.LJIJJLI("in_liveroom");
        }
        C19GN c19gn2 = this.activeModalDialog;
        if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.activeModalDialog) != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        WeakReference<AbstractC923750a97> weakReference = this.mGuestPresenter;
        if (weakReference != null && (abstractC923750a97 = weakReference.get()) != null) {
            abstractC923750a97.setDialogView(null);
        }
        C924790aAn.LIZLLL().LIZJ(this);
        AbstractC929640aIc abstractC929640aIc = this.mApplyPresenter;
        if (abstractC929640aIc != null) {
            abstractC929640aIc.LIZIZ();
        }
        C1EOY.LIZ.LJJII("multi_guest_apply_page");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C19WM c19wm = this.dragDismissHelper;
        if (c19wm != null) {
            Window window = c19wm.LJIILJJIL;
            if (window != null && (window.getCallback() instanceof C19WJ)) {
                window.setCallback(c19wm.LJIILIIL);
            }
            c19wm.LJIILJJIL = null;
            c19wm.LJIILIIL = null;
            C19WF c19wf = c19wm.LJIIL;
            if (c19wf != null) {
                c19wf.LIZIZ();
            }
        }
        this.mOldOnlineItems.clear();
        this.mOldWaitingItems.clear();
        this.mUpdatedAll = false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC923750a97 abstractC923750a97;
        String strU3;
        Long lLJIILIIL;
        LiveDialogFragment liveDialogFragment;
        Dialog dialog;
        Window window;
        super.onResume();
        final C19WM c19wm = this.dragDismissHelper;
        Object c098200Yq = null;
        if (c19wm != null && (liveDialogFragment = this.mDialog) != null && (dialog = liveDialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            c19wm.LJIILJJIL = window;
            final Window.Callback callback = window.getCallback();
            c19wm.LJIILIIL = callback;
            window.setCallback(new Window.Callback(callback) { // from class: X.19WJ
                public final /* synthetic */ Window.Callback LL;
                public final Window.Callback LLILLJJLI;

                @Override // android.view.Window.Callback
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                    return this.LL.dispatchGenericMotionEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    return this.LL.dispatchKeyEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                    return this.LL.dispatchKeyShortcutEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                    return this.LL.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                    return this.LL.dispatchTrackballEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeFinished(ActionMode actionMode) {
                    this.LL.onActionModeFinished(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeStarted(ActionMode actionMode) {
                    this.LL.onActionModeStarted(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onAttachedToWindow() {
                    this.LL.onAttachedToWindow();
                }

                @Override // android.view.Window.Callback
                public final void onContentChanged() {
                    this.LL.onContentChanged();
                }

                @Override // android.view.Window.Callback
                public final boolean onCreatePanelMenu(int i, Menu menu) {
                    return this.LL.onCreatePanelMenu(i, menu);
                }

                @Override // android.view.Window.Callback
                public final View onCreatePanelView(int i) {
                    return this.LL.onCreatePanelView(i);
                }

                @Override // android.view.Window.Callback
                public final void onDetachedFromWindow() {
                    this.LL.onDetachedFromWindow();
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
                    return this.LL.onMenuItemSelected(i, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i, Menu menu) {
                    return this.LL.onMenuOpened(i, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i, Menu menu) {
                    this.LL.onPanelClosed(i, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPointerCaptureChanged(boolean z) {
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i, View view, Menu menu) {
                    return this.LL.onPreparePanel(i, view, menu);
                }

                @Override // android.view.Window.Callback
                public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested() {
                    return this.LL.onSearchRequested();
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested(SearchEvent searchEvent) {
                    return this.LL.onSearchRequested(searchEvent);
                }

                @Override // android.view.Window.Callback
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                    this.LL.onWindowAttributesChanged(layoutParams);
                }

                @Override // android.view.Window.Callback
                public final void onWindowFocusChanged(boolean z) {
                    this.LL.onWindowFocusChanged(z);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2) {
                    return this.LL.onWindowStartingActionMode(callback2);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2, int i) {
                    return this.LL.onWindowStartingActionMode(callback2, i);
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
                @Override // android.view.Window.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean dispatchTouchEvent(android.view.MotionEvent r13) {
                    /*
                        Method dump skipped, instruction units count: 489
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19WJ.dispatchTouchEvent(android.view.MotionEvent):boolean");
                }

                {
                    Window.Callback callback2;
                    if (callback == null) {
                        callback2 = new Window.Callback() { // from class: X.19WS
                            @Override // android.view.Window.Callback
                            public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final void onActionModeFinished(ActionMode actionMode) {
                            }

                            @Override // android.view.Window.Callback
                            public final void onActionModeStarted(ActionMode actionMode) {
                            }

                            @Override // android.view.Window.Callback
                            public final void onAttachedToWindow() {
                            }

                            @Override // android.view.Window.Callback
                            public final void onContentChanged() {
                            }

                            @Override // android.view.Window.Callback
                            public final boolean onCreatePanelMenu(int i, Menu menu) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final View onCreatePanelView(int i) {
                                return null;
                            }

                            @Override // android.view.Window.Callback
                            public final void onDetachedFromWindow() {
                            }

                            @Override // android.view.Window.Callback
                            public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean onMenuOpened(int i, Menu menu) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final void onPanelClosed(int i, Menu menu) {
                            }

                            @Override // android.view.Window.Callback
                            public final boolean onPreparePanel(int i, View view, Menu menu) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean onSearchRequested() {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final boolean onSearchRequested(SearchEvent searchEvent) {
                                return false;
                            }

                            @Override // android.view.Window.Callback
                            public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                            }

                            @Override // android.view.Window.Callback
                            public final void onWindowFocusChanged(boolean z) {
                            }

                            @Override // android.view.Window.Callback
                            public final /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback3) {
                                return null;
                            }

                            @Override // android.view.Window.Callback
                            public final /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback3, int i) {
                                return null;
                            }
                        };
                    } else {
                        callback2 = callback;
                    }
                    this.LL = callback2;
                    this.LLILLJJLI = callback;
                }
            });
        }
        if (!InterfaceC934710aQn.nc.LIZIZ().booleanValue()) {
            C785230UrB c785230UrB = new C785230UrB(this.beautyView);
            c785230UrB.LJFF = 80;
            c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785230UrB.LJIIIZ = true;
            c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0aIm
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    InterfaceC934710aQn.nc.LJFF(Boolean.TRUE);
                }
            };
            c785230UrB.LIZLLL(2131841483);
            C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.ANCHOR_PREVIEW, this.dataChannel);
        }
        if (this.shouldShowStillInLineList) {
            try {
                WeakReference<AbstractC923750a97> weakReference = this.mGuestPresenter;
                if (weakReference != null && (abstractC923750a97 = weakReference.get()) != null) {
                    GuestApplyStillInLineParams guestApplyStillInLineParams = new GuestApplyStillInLineParams();
                    guestApplyStillInLineParams.userId = UserService.getInstance().user().getCurrentUserId();
                    Long lLJIIJ = C930540aK4.LJIIJ();
                    long jLongValue = 0;
                    guestApplyStillInLineParams.roomId = lLJIIJ != null ? lLJIIJ.longValue() : 0L;
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) != null) {
                        jLongValue = lLJIILIIL.longValue();
                    }
                    guestApplyStillInLineParams.channelId = jLongValue;
                    InterfaceC500100JjM<C470590Icr<GuestApplyStillInLineResponse.ResponseData>> interfaceC500100JjMFetchStillInLineData = abstractC923750a97.fetchStillInLineData(guestApplyStillInLineParams);
                    if (interfaceC500100JjMFetchStillInLineData != null) {
                        c098200Yq = interfaceC500100JjMFetchStillInLineData.LIZ(new AfS184S0100000_15(this, 93), new C09JN() { // from class: X.00Ru
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("MultiGuestUserInfoFragment@21f9.fetchStillInLineData$1$3");
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("fetchStillInLineData fail: ");
                                sbLIZ.append(((Throwable) obj).getMessage());
                                C20441214yg.LJ("MultiGuestUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
                                C1C7U.LIZIZ("MultiGuestUserInfoFragment@21f9.fetchStillInLineData$1$3");
                            }
                        });
                    }
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchStillInLineData fail: ");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                C20441214yg.LJ("MultiGuestUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        EnumC926600aDi enumC926600aDi = this.mApplyType;
        if (enumC926600aDi != EnumC926600aDi.SEND_RESERVATION && enumC926600aDi != EnumC926600aDi.RESERVING) {
            SR();
        }
        MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel = (MultiGuestGuestShareRevenueViewModel) this.guestShareRevenueViewModel$delegate.getValue();
        if (multiGuestGuestShareRevenueViewModel != null) {
            multiGuestGuestShareRevenueViewModel.vQ2();
        }
    }

    @Override // X.InterfaceC925780aCO
    public final LiveDialogFragment getDialog() {
        return this.mDialog;
    }

    public static final void PS(MultiGuestUserInfoFragment multiGuestUserInfoFragment) {
        C945740aia c945740aia = null;
        Boolean boolValueOf = null;
        if (C929810aIt.LIZ == 2) {
            C945740aia c945740aia2 = multiGuestUserInfoFragment.applyInfoView;
            if (c945740aia2 == null) {
                c945740aia2 = null;
            }
            C925770aCN c925770aCN = multiGuestUserInfoFragment.mApplyInfo;
            if (c925770aCN != null) {
                boolValueOf = Boolean.valueOf(c925770aCN.LJFF);
            }
            C500260Jjc.LJJJI(boolValueOf);
            c945740aia2.LJI();
            return;
        }
        C945740aia c945740aia3 = multiGuestUserInfoFragment.applyInfoView;
        if (c945740aia3 != null) {
            c945740aia = c945740aia3;
        }
        c945740aia.LJFF();
    }

    @Override // X.InterfaceC925780aCO
    public final void BP(Throwable th) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomGuestReplyFailedEvent.class, "");
        }
        C501540Jlg.LIZJ(C497740JfY.LJII(), th);
        RR(false);
    }

    public final void ES(CharSequence charSequence) {
        C16FS c16fs;
        C16FS c16fs2;
        if ((!LinkMicGuestPanelUiOptSetting.isEnabled() || (c16fs2 = this.connectSwitchBtn) == null || c16fs2.isEnabled()) && (c16fs = this.connectSwitchBtn) != null) {
            c16fs.setText(charSequence);
        }
    }

    public final void GS(C925770aCN c925770aCN) {
        String strLJJJJ;
        if (c925770aCN != null) {
            strLJJJJ = C930540aK4.LJJJJ(c925770aCN.LIZJ);
        } else {
            strLJJJJ = null;
        }
        this.source = strLJJJJ;
        this.mApplyInfo = c925770aCN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void HS(int i) {
        C16F5 c16f5;
        String strLJIJI;
        String strLJIIL;
        Integer num;
        if (i == this.waitingCount && !this.compensateHandlerWaitCount) {
            return;
        }
        this.compensateHandlerWaitCount = false;
        if (!oS()) {
            if (i <= 0 && (num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 1) {
                i = 1;
            } else if (mS()) {
                i++;
            }
        }
        this.waitingCount = i;
        if (MultiTopLiveRoomMatchConfigSetting.isEnableRandomMatch() && kS()) {
            iT();
        } else if (!C924990aB7.LIZ(this.dataChannel)) {
            C925320aBe c925320aBe = C925320aBe.LIZ;
            DataChannel dataChannel = this.dataChannel;
            c925320aBe.getClass();
            if (!C925320aBe.LIZJ(dataChannel)) {
                if (oS()) {
                    C16F5 c16f52 = this.animationApplyTv;
                    if (c16f52 != null) {
                        int i2 = this.waitingCount;
                        if (i2 == 0) {
                            strLJIIL = C497740JfY.LJIJI(2131853890);
                        } else {
                            strLJIIL = C497740JfY.LJIIL(2131755905, i2, Integer.valueOf(i2));
                        }
                        c16f52.setText(strLJIIL);
                    }
                } else if ((!nS() || mS() || this.isGameLink) && (c16f5 = this.animationApplyTv) != null) {
                    int i3 = this.waitingCount;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            strLJIJI = C497740JfY.LJIIL(2131755543, 2, Integer.valueOf(i3));
                        } else {
                            strLJIJI = C497740JfY.LJIIL(2131755543, 1, 1);
                        }
                    } else {
                        Integer numVR = VR();
                        if (numVR != null) {
                            if (numVR.intValue() >= 2) {
                                strLJIJI = C497740JfY.LJIJI(2131851629);
                            } else {
                                strLJIJI = C497740JfY.LJIJI(2131842117);
                            }
                        } else {
                            strLJIJI = null;
                        }
                    }
                    c16f5.setText(strLJIJI);
                }
            }
        }
        JS();
    }

    @Override // X.InterfaceC925780aCO
    public final void Kh(Throwable th) {
        YS();
        NS();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomGuestReserveFailedEvent.class, th);
        }
    }

    public final void NR(int i) {
        C16FS c16fs;
        C16FS c16fs2 = this.connectSwitchBtn;
        if (c16fs2 != null) {
            c16fs2.j0(i);
        }
        if (LinkMicGuestPanelUiOptSetting.isEnabled() && (c16fs = this.connectSwitchBtn) != null) {
            C1546210qL5.LIZ.getClass();
            c16fs.setRadius(C814420VxA.LIZIZ(C1546210qL5.LIZ(999)));
        }
    }

    public final void RR(boolean z) {
        LiveDialogFragment liveDialogFragment = this.mDialog;
        if ((liveDialogFragment != null && liveDialogFragment.isShowing()) || z) {
            LiveDialogFragment liveDialogFragment2 = this.mDialog;
            if (liveDialogFragment2 != null) {
                liveDialogFragment2.dismiss();
            }
            this.mDialog = null;
        }
    }

    public final List<LinkPlayerInfo> cS(List<? extends LinkPlayerInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : list) {
            if (linkPlayerInfo.LIZ == 1) {
                arrayList.add(linkPlayerInfo);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC920780a4K
    public final void eg(Throwable th) {
        C501540Jlg.LIZLLL(getContext(), th, 2131853460);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gS(Context context) {
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiGuestUserInfoFragment_");
        sbLIZ.append(851);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleConnect mApplyType:");
        sbLIZ2.append(this.mApplyType);
        sbLIZ2.append(", from source: ");
        sbLIZ2.append(this.source);
        C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        EnumC926600aDi enumC926600aDi = this.mApplyType;
        if (enumC926600aDi != null) {
            int i = C926350aDJ.LIZ[enumC926600aDi.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    yS(false);
                }
            } else {
                if (num == null || num.intValue() != 0) {
                    return;
                }
                C925320aBe c925320aBe = C925320aBe.LIZ;
                DataChannel dataChannel = this.dataChannel;
                c925320aBe.getClass();
                if (C925320aBe.LIZJ(dataChannel)) {
                    C20441214yg.LJ("MultiGuestUserInfoFragment", "handleConnect skip, isCurrentSelfPreApproved");
                    return;
                }
                AbstractC929640aIc abstractC929640aIc = this.mApplyPresenter;
                if (abstractC929640aIc == null || abstractC929640aIc.LJIIIIZZ()) {
                    return;
                }
                uS(context, 0, false);
            }
        }
    }

    public final void hT(Long l) {
        C16F5 c16f5 = this.animationDescTv;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131853892));
        }
        ES(C497740JfY.LJIJI(2131853891));
        if (l != null) {
            HS((int) l.longValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().LIZ(this, new C986860bmu(this, 1));
    }

    @Override // X.C0IMT
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (this.useFakeStateFirstTime) {
            this.useFakeStateFirstTime = false;
            return;
        }
        if (num2 != null) {
            if (num2.intValue() == 1) {
                RS();
            } else if (num2.intValue() == 0) {
                if (this.hasShowGifterUi) {
                    LiveDialogFragment liveDialogFragment = this.mDialog;
                    if (liveDialogFragment != null) {
                        liveDialogFragment.dismiss();
                    }
                } else {
                    NS();
                }
            }
        }
        YS();
    }

    public final void yS(boolean z) {
        boolean z2;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
        C925770aCN c925770aCN = this.mApplyInfo;
        c927600aFKLIZ.getClass();
        boolean z3 = true;
        if (C927600aFK.LJIILJJIL(c925770aCN) && !z) {
            this.applyInterceptor = new C0UTB();
            this.checkParamForReservation = new C0UTD(C520010KaN.LJIJ(getContext(), true), this.dataChannel, new AwS594S0100000_15(this, 451), new AwS559S0100000_15(this, 377), 0, 32);
        }
        C0UTD c0utd = this.checkParamForReservation;
        if (c0utd == null) {
            return;
        }
        InterfaceC928000aFy interfaceC928000aFy = this.applyInterceptor;
        if ((interfaceC928000aFy != null && interfaceC928000aFy.LIZ(c0utd, false)) || ((InterfaceC928000aFy) this.fansRequiredInterceptor$delegate.getValue()).LIZ(c0utd, false)) {
            return;
        }
        new C927240aEk("applyV", "applyBtn").LIZ();
        AbstractC929640aIc abstractC929640aIc = this.mApplyPresenter;
        if (abstractC929640aIc == null) {
            return;
        }
        C925770aCN c925770aCN2 = this.mApplyInfo;
        if (c925770aCN2 != null && c925770aCN2.LIZJ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0utd.LJFF != 101) {
            z3 = false;
        }
        abstractC929640aIc.LJIIJ(z2, z3);
    }

    @Override // X.InterfaceC925780aCO
    public final void zo(Throwable th) {
        zS();
        if (th == null || PlaybookUtilKt.LJIIL(th) != 4004624) {
            C501540Jlg.LIZLLL(getContext(), th, 2131853452);
        }
        YS();
        NS();
        RR(false);
    }

    public final void US(EnumC926600aDi enumC926600aDi, C925770aCN c925770aCN) {
        this.mApplyType = enumC926600aDi;
        GS(c925770aCN);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateApplyInfo applyType:");
        sbLIZ.append(enumC926600aDi);
        sbLIZ.append(" mApplyInfo:");
        sbLIZ.append(this.mApplyInfo);
        C20441214yg.LIZIZ("MultiGuestUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
        XS();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void eT(int i, List list, List list2) {
        Integer num;
        CharSequence text;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guestApplyItemList.size=");
        sbLIZ.append(list.size());
        sbLIZ.append(", beInvitedList.size=");
        sbLIZ.append(list2.size());
        C20441214yg.LJIIIZ("MultiGuestUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (list.isEmpty() && list2.isEmpty()) {
            C16F5 c16f5 = this.stillInLineTitle;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            C16F5 c16f52 = this.stillInLineTv;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
            RunnableC781530UlD runnableC781530UlD = this.stillInLineRecyclerView;
            if (runnableC781530UlD != null) {
                C786410Ut5.LLLILZJ(runnableC781530UlD, 8);
                return;
            }
            return;
        }
        if (qS()) {
            C16F5 c16f53 = this.stillInLineTv;
            if (c16f53 != null) {
                C786410Ut5.LLJJJJ(c16f53, 0);
                return;
            }
            return;
        }
        this.stillInLineAdapter.LLLII(C928340aGW.LJ(i, list, list2));
        RunnableC781530UlD runnableC781530UlD2 = this.stillInLineRecyclerView;
        if (runnableC781530UlD2 != null) {
            C786410Ut5.LLLILZJ(runnableC781530UlD2, 0);
        }
        C16F5 c16f54 = this.stillInLineTitle;
        if (c16f54 != null) {
            HandlerHook.viewPost(c16f54, new ARunnableS113S0100000_13(this, 143));
        }
        if (list.size() >= LinkMicApplyHangupSetting.getMaxApplyCount() && (num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 0) {
            if (LinkMicGuestPanelUiOptSetting.isEnabled()) {
                C16FS c16fs = this.connectSwitchBtn;
                if (c16fs != null) {
                    C16F5 c16f55 = this.maxApplyCountHint;
                    if (c16f55 != null) {
                        text = c16f55.getText();
                    } else {
                        text = null;
                    }
                    c16fs.setText(text);
                }
                C16FS c16fs2 = this.connectSwitchBtn;
                if (c16fs2 == null) {
                    return;
                }
                c16fs2.setEnabled(false);
                return;
            }
            C16F5 c16f56 = this.maxApplyCountHint;
            if (c16f56 != null) {
                C786410Ut5.LLJJJJ(c16f56, 0);
            }
            C16FS c16fs3 = this.connectSwitchBtn;
            if (c16fs3 == null) {
                return;
            }
            c16fs3.setEnabled(false);
            return;
        }
        C16F5 c16f57 = this.maxApplyCountHint;
        if (c16f57 != null) {
            C786410Ut5.LLJJJJ(c16f57, 8);
        }
        C16FS c16fs4 = this.connectSwitchBtn;
        if (c16fs4 != null) {
            c16fs4.setEnabled(true);
        }
        if (!LinkMicGuestPanelUiOptSetting.isEnabled()) {
            return;
        }
        YS();
    }

    /* JADX WARN: Removed duplicated region for block: B:376:0x07ac  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 2229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void rS(long j, String str, boolean z) {
        long jCurrentTimeMillis;
        String str2;
        long jLongValue;
        Long l;
        MultiGuestDataHolder multiGuestDataHolderAS = aS();
        if (multiGuestDataHolderAS != null) {
            jCurrentTimeMillis = multiGuestDataHolderAS.LJI;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (z) {
            MultiGuestDataHolder multiGuestDataHolderAS2 = aS();
            if (multiGuestDataHolderAS2 != null) {
                jCurrentTimeMillis = multiGuestDataHolderAS2.LJII;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            str2 = "reservation";
        } else {
            str2 = "apply";
        }
        Integer numVR = VR();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        Integer numValueOf = Integer.valueOf(this.waitingCount);
        if (LinkMicStatFieldSetting.enable()) {
            numVR = null;
        }
        int iUR = UR();
        int i = this.ownRank;
        MultiGuestDataHolder multiGuestDataHolderAS3 = aS();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(MultiGuestGuestSelfSendGiftData.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C925640aCA.LJIIZILJ(str, jCurrentTimeMillis2, j, str2, numValueOf, numVR, iUR, i, C923130a87.LIZIZ(multiGuestDataHolderAS3, jLongValue), null, this.dataChannel, 512);
        if (Intrinsics.LJFF(str, "click")) {
            aS().LJI = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uS(android.content.Context r20, int r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment.uS(android.content.Context, int, boolean):void");
    }

    @Override // X.InterfaceC929970aJ9
    public final void rB(long j, long j2, List list, List list2, List list3) {
        int size;
        Room room;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((LinkPlayerInfo) it2.next()).LIZ = 2;
            }
        }
        boolean z = true;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((LinkPlayerInfo) it3.next()).LIZ = 1;
            }
        }
        gT(this, list2, list3, j, j2, false, 16);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (list != null) {
            size = list.size();
        } else {
            size = 1;
        }
        int i = size - 1;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            int size2 = 0;
            if (list2 != null) {
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((LinkPlayerInfo) next).mUser.getId() == currentUserId) {
                        if (next == null) {
                            break;
                        }
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (list2 != null) {
                size2 = list2.size();
            }
            C924980aB6.LIZLLL(size2, i, room.liveRoomMode, z);
        }
    }

    public static void gT(MultiGuestUserInfoFragment multiGuestUserInfoFragment, List list, List list2, long j, long j2, boolean z, int i) {
        boolean z2;
        int size;
        long j3 = j;
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        long jIntValue = 0;
        if ((i & 4) != 0) {
            j3 = 0;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        if (multiGuestUserInfoFragment.oS()) {
            C925320aBe c925320aBe = C925320aBe.LIZ;
            DataChannel dataChannel = multiGuestUserInfoFragment.dataChannel;
            c925320aBe.getClass();
            if (!C925320aBe.LIZJ(dataChannel)) {
                multiGuestUserInfoFragment.hT(Long.valueOf(j2));
                return;
            }
        }
        if (z) {
            if (list != null) {
                size = list.size();
            } else if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            multiGuestUserInfoFragment.HS(size);
        }
        if (multiGuestUserInfoFragment.useFakeStateFirstTime && multiGuestUserInfoFragment.waitingCount == 0) {
            multiGuestUserInfoFragment.HS(1);
        }
        multiGuestUserInfoFragment.useFakeStateFirstTime = false;
        if (!multiGuestUserInfoFragment.qS()) {
            return;
        }
        C16FZ c16fz = multiGuestUserInfoFragment.loadingView;
        if (c16fz != null) {
            C439101nJ.LJI(c16fz);
        }
        C951190arN c951190arN = multiGuestUserInfoFragment.adapter;
        C410901il c410901il = new C410901il();
        c410901il.add(new InterfaceC951240arS<Object>() { // from class: X.00UR
            public final int LIZ = 1;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C00UR) && this.LIZ == ((C00UR) obj).LIZ;
            }

            public final int hashCode() {
                return this.LIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ApplierGifterBlockInfo(blockType=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC951240arS
            public final boolean LIZIZ(Object obj) {
                if (!(obj instanceof C00UR) || ((C00UR) obj).LIZ != this.LIZ) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC951240arS
            public final boolean LJII(Object obj) {
                return obj instanceof C00UR;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        Pair pairLJI = C500260Jjc.LJI(arrayList, AFwS250S0000000_15.get$arr$(103));
        if (pairLJI.getFirst() == null) {
            ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser = new ListByTypeResponse.GiftScoreAppliedUser();
            LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
            linkPlayerInfo.mUser = UserService.getInstance().user().LJIJJLI();
            giftScoreAppliedUser.listUser = linkPlayerInfo;
            giftScoreAppliedUser.giftScore = j3;
            Pair pairLJI2 = C500260Jjc.LJI(arrayList, new AwS30S0000100_15(j3, 7));
            if (pairLJI2.getFirst() == null) {
                arrayList.add(giftScoreAppliedUser);
            } else {
                jIntValue = ((Number) pairLJI2.getSecond()).intValue();
                ListProtector.add(arrayList, ((Number) pairLJI2.getSecond()).intValue(), giftScoreAppliedUser);
            }
            pairLJI = new Pair(giftScoreAppliedUser, Integer.valueOf((int) jIntValue));
        }
        ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser2 = (ListByTypeResponse.GiftScoreAppliedUser) pairLJI.getFirst();
        if (giftScoreAppliedUser2 == null) {
            return;
        }
        int iIntValue = ((Number) pairLJI.getSecond()).intValue() + 1;
        c410901il.add(new C930140aJQ(((Number) pairLJI.getSecond()).intValue() + 1, giftScoreAppliedUser2, true, false, Integer.valueOf(iIntValue), 8));
        multiGuestUserInfoFragment.ownRank = iIntValue;
        multiGuestUserInfoFragment.bS().clear();
        if (arrayList.size() > 1) {
            int iIntValue2 = ((Number) pairLJI.getSecond()).intValue();
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser3 = (ListByTypeResponse.GiftScoreAppliedUser) obj;
                    if (i3 == arrayList.size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c410901il.add(new C930140aJQ(i3, giftScoreAppliedUser3, false, z2, Integer.valueOf(iIntValue2 + 1), 4));
                    multiGuestUserInfoFragment.bS().put(Integer.valueOf(i3), Long.valueOf(giftScoreAppliedUser3.giftScore));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        c951190arN.LLLII(c410901il);
    }
}
