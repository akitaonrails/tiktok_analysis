package com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest;

import X.C01GW;
import X.C0IEG;
import X.C0UO0;
import X.C0UTB;
import X.C0UTD;
import X.C1121670fIL;
import X.C1161920gLG;
import X.C12ES;
import X.C1304660k3U;
import X.C1388190mED;
import X.C1555540qa8;
import X.C158B;
import X.C1819560xRy;
import X.C19322110iZ;
import X.C19490011Na;
import X.C1954807lC;
import X.C19EG;
import X.C19ME;
import X.C1EOY;
import X.C20441214yg;
import X.C20736316Cj;
import X.C20744116Fj;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C307001Gy;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C439101nJ;
import X.C464790IKn;
import X.C492400JSs;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C500980Jkm;
import X.C781520UlC;
import X.C782110Um9;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915110ZvB;
import X.C916490ZxP;
import X.C917750ZzR;
import X.C917810ZzX;
import X.C922410a6x;
import X.C924400aAA;
import X.C924660aAa;
import X.C925140aBM;
import X.C925150aBN;
import X.C925310aBd;
import X.C925660aCC;
import X.C926630aDl;
import X.C927600aFK;
import X.C929860aIy;
import X.C929930aJ5;
import X.C930540aK4;
import X.C930940aKi;
import X.C932290aMt;
import X.C943990afl;
import X.C948450amx;
import X.C956720b0I;
import X.C956790b0P;
import X.EnumC926600aDi;
import X.InterfaceC1118490fDD;
import X.InterfaceC2262081DgM;
import X.InterfaceC420801kM;
import X.InterfaceC500940Jki;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import X.InterfaceC925420aBo;
import X.InterfaceC925670aCD;
import X.InterfaceC934710aQn;
import X.InterfaceC948490an1;
import Y.ACListenerS150S0100000_15;
import Y.ACListenerS9S0401000_15;
import Y.AcS81S0110000_15;
import Y.AfS184S0100000_15;
import Y.AfS5S0100100_15;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomBeInvitedShowEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.BeInvitedDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestPanelUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreviewPanelOptimizeConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicFixBeInvitedDialogNoClickableComebackFromBackground;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestOutsideInviteOptimize;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLinkButtonSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS123S0101000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestV3GuestBeInvitedDialog extends LiveDialogFragment implements InterfaceC925420aBo, Parcelable {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyM6Ji5iICElITEpZygmLTY4ZwImJDElDjo2OzEaeggmLTY4CyoaJjMlPSo3DCwtJSA0";
    public TextView agreeButton;
    public BeInvitedDialogUICtrlCmd beInvitedDialogUICtrlCmd;
    public ConstraintLayout contentContainer;
    public LiveDialog deClineDialog;
    public C20744116Fj deClineDialogCbTurnOffInvitation;
    public boolean deClineDialogIsDistributeType;
    public TextView declineBtn;
    public long dialogStayDuration;
    public InterfaceC420801kM disMissDialogDisposable;
    public MultiGuestLiveSettingDialog distributeDialog;
    public boolean gameAutoAccept;
    public MultiGuestGuestShareRevenueViewModel guestShareRevenueViewModel;
    public boolean hasCheckPermissionSucc;
    public long invitationTimestamp;
    public int inviterRole;
    public long inviterUserId;
    public boolean isDialogStopped;
    public boolean isEnterBackGroundWhenTryShowDialog;
    public boolean isGameLink;
    public boolean isJoinDirectInvitedDialog;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;
    public boolean mIsInReply;
    public Companion.OnInviteResultListener mOnLinkMicBuiltListener;
    public InterfaceC925670aCD<MultiGuestV3GuestBeInvitedDialog> mPresenter;
    public boolean makeVibrateOnce;
    public long maxCountDownValue;
    public ImageModel operatorAvatarImageModel;
    public boolean operatorIsModerator;
    public long operatorUid;
    public String originLinkId;
    public DataChannel outerDataChannel;
    public boolean showInOuterPage;
    public TextView tvInviteTips;
    public View vgTitle;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public String beInvitedSharePlatform = "";
    public String anchorInvitationPosition = "";
    public String operatorDisplayName = "";
    public final C01GW isPortrait$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 276));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.InterfaceC925420aBo
    public final void jv() {
        this.mIsInReply = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.isDialogStopped = true;
        super.onStop();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    @Override // X.InterfaceC925420aBo
    public final void JE() {
        C924660aAa.LJIILIIL("click", "accept", Long.valueOf(this.dialogStayDuration), this.isJoinDirectInvitedDialog ? "outside_liveroom" : "in_liveroom", this.showInOuterPage, Boolean.valueOf(fu()), C932290aMt.LIZ(), "mg_link", this.dataChannel, true, getArguments(), this.originLinkId);
        C925150aBN.LJIIJJI((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class), this.dataChannel, true);
        Companion.OnInviteResultListener onInviteResultListener = this.mOnLinkMicBuiltListener;
        if (onInviteResultListener != null) {
            onInviteResultListener.fw();
        }
        C943990afl.LIZ().LIZ("multi_guest_guest_preview_page", "agree_invite");
        DataChannel dataChannel = this.dataChannel;
        PR().LJJIIJZLJL("reply");
        if (dataChannel != null) {
            C924400aAA c924400aAA = new C924400aAA(1);
            c924400aAA.LIZIZ = EnumC926600aDi.GO_LIVE;
            dataChannel.LC0(InteractStateChangeEvent.class, c924400aAA);
        }
        C929860aIy.LIZ.LIZJ(this);
        this.mIsInReply = false;
    }

    public final void OR() {
        MultiGuestLiveSettingDialog multiGuestLiveSettingDialog = this.distributeDialog;
        if (multiGuestLiveSettingDialog != null) {
            C929860aIy.LIZ.LIZLLL(multiGuestLiveSettingDialog);
        }
        this.distributeDialog = null;
    }

    public final MultiGuestDataHolder PR() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final boolean RR() {
        C20744116Fj c20744116Fj = this.deClineDialogCbTurnOffInvitation;
        return c20744116Fj != null && c20744116Fj.isChecked();
    }

    public final void UR() {
        C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "reportTimeoutEvent");
        LiveDialog liveDialog = this.deClineDialog;
        if (liveDialog != null && liveDialog.isShowing()) {
            if (this.deClineDialogIsDistributeType) {
                C925140aBM.LIZ("timeout", CardStruct.IStatusCode.DEFAULT);
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C924660aAa.LJIIJJI("timeout", CardStruct.IStatusCode.DEFAULT, C927600aFK.LJII(), Boolean.valueOf(fu()));
        }
        C924660aAa.LJIILIIL("timeout", "timeout", Long.valueOf(this.dialogStayDuration), this.isJoinDirectInvitedDialog ? "outside_liveroom" : "in_liveroom", this.showInOuterPage, Boolean.valueOf(fu()), C932290aMt.LIZ(), null, this.dataChannel, false, getArguments(), this.originLinkId);
    }

    public final void ZR() {
        if (this.disMissDialogDisposable != null) {
            C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "stopDismissCountdown");
            InterfaceC420801kM interfaceC420801kM = this.disMissDialogDisposable;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS() {
        /*
            r4 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel r0 = r4.guestShareRevenueViewModel
            r3 = 0
            if (r0 == 0) goto L3b
            X.002o r2 = r0.getState()
            X.0Zzj r2 = (X.C917930Zzj) r2
            if (r2 == 0) goto L3c
            int r1 = r2.LLILZ
        Lf:
            boolean r0 = X.C917810ZzX.LJIIIIZZ()
            if (r0 == 0) goto L32
            boolean r0 = X.C917810ZzX.LJIIIIZZ()
            if (r0 == 0) goto L2a
            r0 = 2131851845(0x7f117a45, float:1.9337292E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
        L22:
            android.widget.TextView r0 = r4.tvInviteTips
            if (r0 == 0) goto L29
            r0.setText(r1)
        L29:
            return
        L2a:
            r0 = 2131842780(0x7f1156dc, float:1.9318906E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            goto L22
        L32:
            if (r2 == 0) goto L36
            java.lang.Integer r3 = r2.LLILZIL
        L36:
            java.lang.String r1 = X.C917750ZzR.LIZLLL(r1, r3)
            goto L22
        L3b:
            r2 = r3
        L3c:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog.bS():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7c);
        c500980Jkm.LIZJ = R.style.aji;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJ = false;
        c500980Jkm.LJFF = false;
        return c500980Jkm;
    }

    public final boolean fu() {
        return ((Boolean) this.isPortrait$delegate.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        C500950Jkj c500950Jkj = new C500950Jkj(R.layout.g7c);
        c500950Jkj.LIZIZ = false;
        return c500950Jkj;
    }

    @Override // X.InterfaceC925420aBo
    public final boolean iN() {
        boolean zIsShowing;
        C929860aIy.LIZ.getClass();
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C929860aIy.LJIIIIZZ())) {
            Long l = C929860aIy.LIZIZ.get("multi_guest_be_invited");
            zIsShowing = C464790IKn.LIZ.LIZIZ(l != null ? l.longValue() : 0L);
        } else {
            zIsShowing = isShowing();
        }
        if (zIsShowing || ((LinkMicFixBeInvitedDialogNoClickableComebackFromBackground.INSTANCE.isEnable() && this.isViewValid && !isShowing() && this.isDialogStopped) || this.showInOuterPage)) {
            return true;
        }
        return this.isGameLink && this.gameAutoAccept;
    }

    public MultiGuestV3GuestBeInvitedDialog() {
        try {
            C948450amx.LIZIZ.LIZJ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().LJIIZILJ();
            C948450amx.LIZIZ.LIZJ(this);
            C1304660k3U.LIZ.LIZIZ(70001, "LinkInjector.inject error", th, null);
        }
        if (this.mDataHolder == null) {
            try {
                GameLinkDataHolder gameLinkDataHolder = (GameLinkDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                if (gameLinkDataHolder != null) {
                    this.mDataHolder = gameLinkDataHolder;
                }
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("test_lzk", e);
            }
        }
        if (PR() instanceof GameLinkDataHolder) {
            this.isGameLink = true;
        }
    }

    public final void MR() {
        if (RR()) {
            try {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    long id = room.getId();
                    if (id != 0) {
                        InterfaceC925670aCD<MultiGuestV3GuestBeInvitedDialog> interfaceC925670aCD = this.mPresenter;
                        if (interfaceC925670aCD != null) {
                            interfaceC925670aCD.turnOffInvitation(id);
                        }
                    }
                }
                throw new IllegalStateException("Check failed.");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LiveDialog liveDialog = this.deClineDialog;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
    }

    public final void WR() {
        long value = LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue();
        this.maxCountDownValue = value;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startDismissCountDown maxCountDownValue:");
        sbLIZ.append(this.maxCountDownValue);
        C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC420801kM interfaceC420801kMLJJLL = C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS5S0100100_15(value - 1, this, 2), new AfS184S0100000_15(this, 51));
        ZR();
        this.disMissDialogDisposable = interfaceC420801kMLJJLL;
    }

    public final void aS() {
        DataChannel dataChannel;
        ZR();
        C929860aIy.LIZ.LIZJ(this);
        if (!this.isGameLink || LiveGameLinkButtonSetting.INSTANCE.isExperimentGroup() || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.SX0(C956720b0I.class, null);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            multiGuestDataHolderLIZJ.LJJIII = false;
        }
        MR();
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ZR();
        MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
        if (multiGuestDialogManagerLIZ != null) {
            multiGuestDialogManagerLIZ.Ll1(8);
        }
        MultiGuestLiveSettingDialog multiGuestLiveSettingDialog = this.distributeDialog;
        if (multiGuestLiveSettingDialog != null) {
            C929860aIy.LIZ.LIZLLL(multiGuestLiveSettingDialog);
        }
        this.distributeDialog = null;
        InterfaceC925670aCD<MultiGuestV3GuestBeInvitedDialog> interfaceC925670aCD = this.mPresenter;
        if (interfaceC925670aCD != null) {
            interfaceC925670aCD.onDestroy();
        }
        this.mPresenter = null;
        LiveDialog liveDialog = this.deClineDialog;
        if (liveDialog != null) {
            C500260Jjc.LJJLIIIJL(liveDialog);
        }
        this.deClineDialog = null;
        C1EOY.LIZ.LJJII("multi_guest_be_invite_page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        if (this.disMissDialogDisposable == null && (z = this.isEnterBackGroundWhenTryShowDialog)) {
            C930540aK4.LJJJI(Boolean.valueOf(!z));
            WR();
            this.isEnterBackGroundWhenTryShowDialog = false;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(LinkInRoomBeInvitedShowEvent.class);
        }
        if (this.makeVibrateOnce) {
            this.makeVibrateOnce = false;
            C915110ZvB.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        this.isDialogStopped = false;
        if (this.isGameLink && this.gameAutoAccept) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                dialog.dismiss();
                C785410UrT.LIZ(dialog);
            }
        } else {
            C924660aAa.LJIILIIL("show", CardStruct.IStatusCode.DEFAULT, Long.valueOf(this.dialogStayDuration), this.isJoinDirectInvitedDialog ? "outside_liveroom" : "in_liveroom", this.showInOuterPage, Boolean.valueOf(fu()), C932290aMt.LIZ(), null, this.dataChannel, false, getArguments(), this.originLinkId);
        }
        if (MultiGuestPreviewPanelOptimizeConfigSetting.INSTANCE.enableShake()) {
            this.makeVibrateOnce = true;
            if (!LinkMicFixBeInvitedDialogNoClickableComebackFromBackground.INSTANCE.isEnable() || !this.isViewValid || isShowing() || !this.isDialogStopped) {
                C915110ZvB.LIZ();
                this.makeVibrateOnce = false;
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.InterfaceC925420aBo
    public final void Jk(boolean z) {
        DataChannel dataChannel;
        C929860aIy.LIZ.LIZJ(this);
        this.mIsInReply = false;
        if (z && (dataChannel = this.dataChannel) != null) {
            C925150aBN.LJIIJJI((Room) dataChannel.gg0(RoomChannel.class), dataChannel, false);
        }
    }

    public final void SR(int i) {
        boolean z;
        Context context = getContext();
        DataChannel dataChannel = this.dataChannel;
        MultiGuestDataHolder multiGuestDataHolderPR = PR();
        InterfaceC925670aCD<MultiGuestV3GuestBeInvitedDialog> interfaceC925670aCD = this.mPresenter;
        long j = this.operatorUid;
        boolean z2 = this.isJoinDirectInvitedDialog;
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, i, 277);
        AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(this, 278);
        C929930aJ5 c929930aJ5 = new C929930aJ5(this);
        String str = this.originLinkId;
        if (this.isJoinDirectInvitedDialog && this.operatorIsModerator) {
            z = true;
        } else {
            z = false;
        }
        C925660aCC.LIZ(context, dataChannel, multiGuestDataHolderPR, interfaceC925670aCD, i, j, z2, awS559S0100000_15, awS559S0100000_152, c929930aJ5, "MultiGuestV3GuestBeInvitedDialog_realAgree", str, z, this.inviterRole, this.inviterUserId, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }

    public final void VR(String str) {
        long jLongValue;
        C20441214yg.LIZIZ("Connect_Distribute", "showStatusSettingDialog");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.hide();
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        MultiGuestLiveSettingDialog multiGuestLiveSettingDialogLIZ = this.distributeDialog;
        if (multiGuestLiveSettingDialogLIZ == null) {
            multiGuestLiveSettingDialogLIZ = C1819560xRy.LIZ(MultiGuestLiveSettingDialog.Companion, str, false, false, 26);
            C926630aDl.LIZIZ(multiGuestLiveSettingDialogLIZ, 8, false, false, false, null, 1, 122);
        }
        C929860aIy c929860aIy = C929860aIy.LIZ;
        c929860aIy.getClass();
        LiveSheetMigrationMultiWatchLinkedMicSetting liveSheetMigrationMultiWatchLinkedMicSetting = LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE;
        if (liveSheetMigrationMultiWatchLinkedMicSetting.enable(C929860aIy.LJIIIIZZ())) {
            HashMap<String, Long> map = C929860aIy.LIZIZ;
            Long l = map.get("multi_guest_distribute");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (!C464790IKn.LIZ.LIZIZ(jLongValue)) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "multi_guest_distribute", multiGuestLiveSettingDialogLIZ);
                SheetOptions sheetOptions = new SheetOptions();
                sheetOptions.draggable = liveSheetMigrationMultiWatchLinkedMicSetting.enableDraggableClose(C929860aIy.LJIIIIZZ());
                map.put("multi_guest_distribute", Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, MultiGuestV3OuterSheetFragment.class, "multi_guest_distribute", sheetOptions, bundle)));
            }
        } else {
            C492400JSs.LIZ(multiGuestLiveSettingDialogLIZ, fragmentManager, "MultiGuestLiveSettingDialog");
            C929860aIy.LJIIJ(c929860aIy, "multi_guest_distribute", true);
        }
        this.distributeDialog = multiGuestLiveSettingDialogLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    @Override // X.InterfaceC925420aBo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f4(java.lang.Throwable r20) {
        /*
            r19 = this;
            r2 = 0
            r3 = r20
            if (r3 == 0) goto La0
            int r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJIIL(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        Ld:
            r1 = 4004614(0x3d1b06, float:5.61166E-39)
            r0 = 4004613(0x3d1b05, float:5.611658E-39)
            if (r5 == 0) goto L9c
            int r4 = r5.intValue()
            if (r4 != r0) goto L93
            java.lang.String r14 = "add_waitlist"
        L1d:
            java.lang.String r7 = "click"
            java.lang.String r8 = "accept"
            r4 = r19
            long r5 = r4.dialogStayDuration
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            boolean r5 = r4.isJoinDirectInvitedDialog
            if (r5 == 0) goto L90
            java.lang.String r10 = "outside_liveroom"
        L2f:
            boolean r11 = r4.showInOuterPage
            boolean r5 = r4.fu()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            java.util.Map r13 = X.C932290aMt.LIZ()
            com.bytedance.ies.sdk.datachannel.DataChannel r15 = r4.dataChannel
            android.os.Bundle r17 = r4.getArguments()
            java.lang.String r6 = r4.originLinkId
            r5 = 0
            r18 = r6
            r16 = r5
            X.C924660aAa.LJIILIIL(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L85
            int r6 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJIIL(r3)
            if (r6 == r0) goto L5b
            int r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJIIL(r3)
            if (r0 != r1) goto L85
        L5b:
            X.0aIy r0 = X.C929860aIy.LIZ
            r0.LIZJ(r4)
            r4.mIsInReply = r5
            X.0frE r4 = X.C1143300frE.LJIIJJI()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "doRequestReplyAnchor:"
            r1.append(r0)
            if (r3 == 0) goto L75
            java.lang.String r2 = r3.getMessage()
        L75:
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r4.getClass()
            java.lang.String r0 = "invite_issue_check"
            X.AbstractC1143290frD.LIZ(r0, r1)
            return
        L85:
            android.content.Context r1 = r4.getContext()
            r0 = 2131853452(0x7f11808c, float:1.9340551E38)
            X.C501540Jlg.LIZLLL(r1, r3, r0)
            goto L5b
        L90:
            java.lang.String r10 = "in_liveroom"
            goto L2f
        L93:
            int r4 = r5.intValue()
            if (r4 != r1) goto L9c
            java.lang.String r14 = "add_waitlist_fail"
            goto L1d
        L9c:
            java.lang.String r14 = "fail"
            goto L1d
        La0:
            r5 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog.f4(java.lang.Throwable):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModelMB;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ISharedRevenueAbility iSharedRevenueAbility;
        C943990afl.LIZ().LJ();
        super.onCreate(bundle);
        DataChannel dataChannel = this.outerDataChannel;
        if (dataChannel != null) {
            this.dataChannel = dataChannel;
        }
        C925310aBd c925310aBd = null;
        if (C917750ZzR.LJI(false)) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) != null && (iSharedRevenueAbility = (ISharedRevenueAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedRevenueAbility.class, null)) != null) {
                multiGuestGuestShareRevenueViewModelMB = iSharedRevenueAbility.MB();
            } else {
                multiGuestGuestShareRevenueViewModelMB = null;
            }
            this.guestShareRevenueViewModel = multiGuestGuestShareRevenueViewModelMB;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            c925310aBd = new C925310aBd(this, dataChannel3);
        }
        this.mPresenter = c925310aBd;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Object obj;
        Companion.OnInviteResultListener onInviteResultListener;
        String string;
        String string2;
        boolean z;
        ImageModel imageModel;
        long j;
        int i;
        long j2;
        long j3;
        String strLIZIZ;
        char c;
        String strLJIJJ;
        boolean z2;
        IHostAction iHostAction;
        int i2;
        C19EG topFragmentActivity;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        TuxIconDrawable tuxIconDrawable;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19ME c19me;
        C19ME c19me2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        InterfaceC2262081DgM currentUser;
        User owner;
        String strLJIJI;
        String string3;
        C1EOY c1eoy = C1EOY.LIZ;
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        c1eoy.LJIJI(window, "multi_guest_be_invite_page");
        C943990afl.LIZ().LIZIZ();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                obj = arguments.get("OnLinkMicBuiltListener");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj instanceof Companion.OnInviteResultListener) {
            onInviteResultListener = (Companion.OnInviteResultListener) obj;
        } else {
            onInviteResultListener = null;
        }
        this.mOnLinkMicBuiltListener = onInviteResultListener;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 == null || (string = arguments2.getString("beInvitedSharePlatform", "")) == null) {
            string = "";
        }
        this.beInvitedSharePlatform = string;
        MultiGuestDataHolder multiGuestDataHolderPR = PR();
        if (multiGuestDataHolderPR != null) {
            multiGuestDataHolderPR.LJFF = string;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("anchorInvitationPosition", "")) == null) {
            string2 = "";
        }
        this.anchorInvitationPosition = string2;
        MultiGuestDataHolder multiGuestDataHolderPR2 = PR();
        if (multiGuestDataHolderPR2 != null) {
            multiGuestDataHolderPR2.LJ = string2;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null) {
            C929860aIy.LIZ.LIZJ(this);
            return;
        }
        final long id = room.getId();
        final long ownerUserId = room.getOwnerUserId();
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z = arguments4.getBoolean("operatorIsModerator", false);
        } else {
            z = false;
        }
        this.operatorIsModerator = z;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string3 = arguments5.getString("operatorDisplayName", "")) != null) {
            str = string3;
        }
        this.operatorDisplayName = str;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            imageModel = (ImageModel) arguments6.getParcelable("operatorAvatarImageModel");
        } else {
            imageModel = null;
        }
        this.operatorAvatarImageModel = imageModel;
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            j = arguments7.getLong("operator_uid", ownerUserId);
        } else {
            j = ownerUserId;
        }
        this.operatorUid = j;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            i = arguments8.getInt("inviter_role", 0);
        } else {
            i = 0;
        }
        this.inviterRole = i;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            j2 = arguments9.getLong("inviter_user_id", 0L);
        } else {
            j2 = 0;
        }
        this.inviterUserId = j2;
        Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            j3 = arguments10.getLong("invitation_timestamp");
        } else {
            j3 = 0;
        }
        this.invitationTimestamp = j3;
        long jLIZJ = C158B.LIZJ() - this.invitationTimestamp;
        TextView textView = (TextView) view.findViewById(R.id.v1i);
        if (textView != null) {
            if (C917810ZzX.LJIIIIZZ()) {
                strLJIJI = C497740JfY.LJIJI(2131851845);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131842780);
            }
            textView.setText(strLJIJI);
        } else {
            textView = null;
        }
        this.tvInviteTips = textView;
        View viewFindViewById = view.findViewById(R.id.pwd);
        if (viewFindViewById != null) {
            if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(room))) {
                C439101nJ.LJI(viewFindViewById);
            } else {
                C12ES.LJIILL(0, viewFindViewById);
            }
        }
        bS();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.kz8);
        if (constraintLayout != null) {
            Activity activityLIZ = C1388190mED.LIZ(constraintLayout.getContext());
            if (activityLIZ != null && C500260Jjc.LJJII(activityLIZ.getRequestedOrientation())) {
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.height = -1;
                C786410Ut5.m6(constraintLayout, layoutParams);
            } else {
                constraintLayout.setMaxHeight((int) (((double) C497740JfY.LJIILLIIL()) * 0.6d));
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                layoutParams2.height = -2;
                C786410Ut5.m6(constraintLayout, layoutParams2);
            }
        }
        TextView textView2 = (TextView) view.findViewById(R.id.kzy);
        if (LinkMicGuestPanelUiOptSetting.isEnabled() && this.operatorDisplayName.length() > 15) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.operatorDisplayName.substring(0, 15));
            sbLIZ.append("...");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = this.operatorDisplayName;
        }
        int i3 = 1;
        if (C917810ZzX.LJIIIIZZ()) {
            strLJIJJ = C497740JfY.LJIJJ(2131851846, strLIZIZ);
        } else if (this.operatorIsModerator) {
            strLJIJJ = C497740JfY.LJIJJ(2131843147, strLIZIZ);
        } else {
            if (MultiGuestOutsideInviteOptimize.INSTANCE.isEnable()) {
                if (this.invitationTimestamp > 0 && jLIZJ > 0) {
                    if (jLIZJ >= 3600) {
                        int i4 = (int) (jLIZJ / ((long) 3600));
                        strLJIJJ = C497740JfY.LJIJJ(2131853926, strLIZIZ, C497740JfY.LJIIL(2131755906, i4, Integer.valueOf(i4)));
                    } else if (jLIZJ > 60) {
                        int i5 = (int) (jLIZJ / ((long) 60));
                        strLJIJJ = C497740JfY.LJIJJ(2131853926, strLIZIZ, C497740JfY.LJIIL(2131755907, i5, Integer.valueOf(i5)));
                    } else {
                        strLJIJJ = C497740JfY.LJIJJ(2131853926, strLIZIZ, C497740JfY.LJIIL(2131755907, 1, 1));
                    }
                } else {
                    c = 0;
                    i3 = 1;
                }
            } else {
                c = 0;
            }
            Object[] objArr = new Object[i3];
            objArr[c] = strLIZIZ;
            strLJIJJ = C497740JfY.LJIJJ(2131842746, objArr);
        }
        textView2.setText(strLJIJJ);
        ImageView imageView = (ImageView) view.findViewById(R.id.aza);
        if (this.isGameLink) {
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 != null && (owner = room2.getOwner()) != null) {
                C1121670fIL.LJIILIIL(imageView, owner.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), R.drawable.el_);
            }
        } else {
            ImageModel imageModel2 = this.operatorAvatarImageModel;
            if (imageModel2 != null) {
                C1121670fIL.LJIILIIL(imageView, imageModel2, imageView.getWidth(), imageView.getHeight(), R.drawable.el_);
            }
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.j9x);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            C1121670fIL.LJIILIIL(imageView2, currentUser.getAvatarThumb(), imageView2.getWidth(), imageView2.getHeight(), R.drawable.el_);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.tv_refuse_invite);
        C12ES.LJIILL(0, textView3);
        C786410Ut5.T7(textView3, new View.OnClickListener() { // from class: X.0aFw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                DataChannel dataChannel;
                MultiGuestV3GuestBeInvitedDialog.NR(this.LL, id, ownerUserId);
                Long lValueOf = Long.valueOf(this.LL.dialogStayDuration);
                MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = this.LL;
                if (multiGuestV3GuestBeInvitedDialog.isJoinDirectInvitedDialog) {
                    str2 = "outside_liveroom";
                } else {
                    str2 = "in_liveroom";
                }
                boolean z3 = multiGuestV3GuestBeInvitedDialog.showInOuterPage;
                Boolean boolValueOf = Boolean.valueOf(multiGuestV3GuestBeInvitedDialog.fu());
                Map mapLIZ = C932290aMt.LIZ();
                MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2 = this.LL;
                C924660aAa.LJIILIIL("click", "cancel", lValueOf, str2, z3, boolValueOf, mapLIZ, null, multiGuestV3GuestBeInvitedDialog2.dataChannel, false, multiGuestV3GuestBeInvitedDialog2.getArguments(), this.LL.originLinkId);
                if (this.LL.isGameLink && !LiveGameLinkButtonSetting.INSTANCE.isExperimentGroup() && (dataChannel = this.LL.dataChannel) != null) {
                    dataChannel.SX0(C956720b0I.class, null);
                }
            }
        });
        this.declineBtn = textView3;
        View viewFindViewById2 = view.findViewById(R.id.vg_title);
        C12ES.LJIILL(0, viewFindViewById2);
        this.vgTitle = viewFindViewById2;
        ImageView imageView3 = (ImageView) view.findViewById(R.id.lvu);
        C12ES.LJIILL(0, imageView3);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(24.0f);
        c419910GdJ.LIZJ = (int) C497740JfY.LIZIZ(24.0f);
        c419910GdJ.LIZ = C20736316Cj.LJ(R.attr.dt3, imageView3.getContext());
        c419910GdJ.LIZLLL = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.ezq, imageView3.getContext()));
        imageView3.setImageDrawable(c419910GdJ.LIZ(imageView3.getContext()));
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        if ((layoutParams3 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(14.0f);
            marginLayoutParams2.bottomMargin = (int) C497740JfY.LIZIZ(10.0f);
        }
        C786410Ut5.Q7(imageView3, new ACListenerS150S0100000_15(this, 260));
        TextView textView4 = (TextView) view.findViewById(R.id.z8q);
        C12ES.LJIILL(0, textView4);
        boolean z3 = this.isGameLink;
        C786410Ut5.I7(new ACListenerS9S0401000_15(this, new C0UTB(), z3 ? 1 : 0, new C0UTD(getContext(), this.dataChannel, new AwS123S0101000_15(this, z3 ? 1 : 0, 6), new AwS559S0100000_15(this, 1003), z3 ? 1 : 0, 32), null, 1), textView4);
        this.agreeButton = textView4;
        if ((!this.isGameLink || !this.gameAutoAccept) && !this.hasCheckPermissionSucc) {
            z2 = false;
        } else {
            z2 = true;
        }
        textView4.setEnabled(z2);
        if (!this.isEnterBackGroundWhenTryShowDialog) {
            WR();
        }
        if (LinkMicGuestPanelUiOptSetting.isEnabled()) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.kzy);
            tuxTextView.setMaxLines(3);
            tuxTextView.setTuxFont(23);
            TextView textView5 = this.tvInviteTips;
            if (textView5 != null) {
                textView5.setTextSize(1, 11.0f);
                ViewGroup.LayoutParams layoutParams4 = textView5.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (c19me2 = (C19ME) layoutParams4) != null) {
                    c19me2.topToBottom = R.id.kzy;
                    ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    c19me2.bottomToBottom = -1;
                }
            }
            View viewFindViewById3 = view.findViewById(R.id.kzv);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setPadding(viewFindViewById3.getPaddingStart(), viewFindViewById3.getPaddingTop(), viewFindViewById3.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                ViewGroup.LayoutParams layoutParams5 = viewFindViewById3.getLayoutParams();
                if ((layoutParams5 instanceof C19ME) && (c19me = (C19ME) layoutParams5) != null) {
                    c19me.topToBottom = R.id.v1i;
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
            }
            ImageView imageView4 = (ImageView) view.findViewById(R.id.lvu);
            if (imageView4 != null) {
                Drawable drawable = imageView4.getDrawable();
                if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable = (TuxIconDrawable) drawable) != null) {
                    int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezl, imageView4.getContext());
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(iLIZIZ);
                    gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(16.0f));
                    imageView4.setBackground(gradientDrawable);
                    tuxIconDrawable.LJII((int) C497740JfY.LIZIZ(20.0f));
                    tuxIconDrawable.LJ((int) C497740JfY.LIZIZ(20.0f));
                    ViewGroup.LayoutParams layoutParams6 = imageView4.getLayoutParams();
                    if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    }
                }
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, CheckPermissionSucc.class, new AwS594S0100000_15(this, 331));
        }
        C943990afl.LIZ().LIZLLL(view);
        IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction2 != null && (topFragmentActivity = iHostAction2.getTopFragmentActivity()) != null && (supportFragmentManager = topFragmentActivity.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C0IEG) {
                    break;
                }
            }
            iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null) {
                this.showInOuterPage = true;
            }
        } else {
            iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null && !iHostAction.isLivePlayActivityOnTop()) {
                this.showInOuterPage = true;
            }
        }
        if (C917750ZzR.LJI(false)) {
            C917750ZzR.LJII("MultiGuestV3GuestBeInvitedDialog initDataChannel");
            MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel = this.guestShareRevenueViewModel;
            if (multiGuestGuestShareRevenueViewModel != null) {
                i2 = 2;
                MultiGuestGuestShareRevenueViewModel.BQ2(multiGuestGuestShareRevenueViewModel, new C2217371BqR() { // from class: X.0aGC
                    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((C917930Zzj) obj2).LLILZ);
                    }

                    @Override // X.C2217371BqR, X.AbstractC2217331BqN
                    public final void set(Object obj2, Object obj3) {
                        ((C917930Zzj) obj2).LLILZ = ((Number) obj3).intValue();
                    }
                }, this, new AwS594S0100000_15(this, 951), 2);
            } else {
                i2 = 2;
            }
            MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel2 = this.guestShareRevenueViewModel;
            if (multiGuestGuestShareRevenueViewModel2 != null) {
                MultiGuestGuestShareRevenueViewModel.BQ2(multiGuestGuestShareRevenueViewModel2, new C2217371BqR() { // from class: X.0aGF
                    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C917930Zzj) obj2).LLILZIL;
                    }

                    @Override // X.C2217371BqR, X.AbstractC2217331BqN
                    public final void set(Object obj2, Object obj3) {
                        ((C917930Zzj) obj2).LLILZIL = (Integer) obj3;
                    }
                }, this, new AwS594S0100000_15(this, 952), i2);
            }
        }
        if (this.isGameLink && this.gameAutoAccept) {
            SR(0);
        }
    }

    public static final void NR(final MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, final long j, final long j2) {
        boolean z;
        int i;
        int i2;
        int i3;
        C20744116Fj c20744116Fj = null;
        View viewSd = C786410Ut5.Sd(R.layout.got, C786410Ut5.ne(multiGuestV3GuestBeInvitedDialog.getContext()), null);
        if (viewSd != null) {
            c20744116Fj = (C20744116Fj) viewSd.findViewById(R.id.dk0);
        }
        multiGuestV3GuestBeInvitedDialog.deClineDialogCbTurnOffInvitation = c20744116Fj;
        if (!InterfaceC934710aQn.Kb.LIZIZ().booleanValue() && !InterfaceC934710aQn.Lb.LIZIZ().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        final boolean z2 = !z;
        C20744116Fj c20744116Fj2 = multiGuestV3GuestBeInvitedDialog.deClineDialogCbTurnOffInvitation;
        if (c20744116Fj2 != null) {
            if (z2) {
                i3 = 2131843470;
            } else if (!z2) {
                i3 = 2131844610;
            } else {
                throw new C1954807lC();
            }
            c20744116Fj2.setText(C497740JfY.LJIJI(i3));
        }
        TextView textView = (TextView) viewSd.findViewById(R.id.fhg);
        if (z2) {
            i = 2131843467;
        } else if (!z2) {
            i = 2131843466;
        } else {
            throw new C1954807lC();
        }
        textView.setText(i);
        multiGuestV3GuestBeInvitedDialog.deClineDialogIsDistributeType = z2;
        C782110Um9 c782110Um9 = new C782110Um9(multiGuestV3GuestBeInvitedDialog.getContext());
        c782110Um9.LIZIZ = multiGuestV3GuestBeInvitedDialog;
        c782110Um9.LJIIZILJ(2131843471);
        c782110Um9.LJIILJJIL = z2;
        c782110Um9.LJIIIIZZ(viewSd);
        c782110Um9.LJIILIIL(2131843463, new InterfaceC743640TFa() { // from class: X.0aFx
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                if (z2) {
                    InterfaceC934710aQn.Lb.LJFF(Boolean.TRUE);
                    C925140aBM.LIZ("click", "confirm");
                }
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                C924660aAa.LJIIJJI("click", "confirm", C927600aFK.LJII(), Boolean.valueOf(multiGuestV3GuestBeInvitedDialog.fu()));
                MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2 = multiGuestV3GuestBeInvitedDialog;
                InterfaceC925670aCD<MultiGuestV3GuestBeInvitedDialog> interfaceC925670aCD = multiGuestV3GuestBeInvitedDialog2.mPresenter;
                long j3 = j;
                long j4 = j2;
                boolean z3 = multiGuestV3GuestBeInvitedDialog2.isJoinDirectInvitedDialog;
                AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(multiGuestV3GuestBeInvitedDialog2, 279);
                AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(multiGuestV3GuestBeInvitedDialog, 280);
                if (!((Boolean) awS559S0100000_15.invoke()).booleanValue()) {
                    awS559S0100000_152.invoke();
                    if (interfaceC925670aCD != null) {
                        interfaceC925670aCD.LIZ(j3, j4, z3);
                    }
                }
                liveDialog.dismiss();
            }
        });
        if (z2) {
            i2 = 2131843464;
        } else {
            i2 = 2131843462;
        }
        c782110Um9.LJIIJ(i2, new AcS81S0110000_15(multiGuestV3GuestBeInvitedDialog, z2, 2));
        c782110Um9.LJIILL = false;
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        multiGuestV3GuestBeInvitedDialog.deClineDialog = liveDialogLIZ;
        C786410Ut5.E4(liveDialogLIZ);
        if (z2) {
            C925140aBM.LIZ("show", CardStruct.IStatusCode.DEFAULT);
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C924660aAa.LJIIJJI("show", CardStruct.IStatusCode.DEFAULT, C927600aFK.LJII(), Boolean.valueOf(multiGuestV3GuestBeInvitedDialog.fu()));
    }

    public static final class Companion {

        public interface OnInviteResultListener extends Parcelable {
            void fw();
        }

        public static MultiGuestV3GuestBeInvitedDialog LIZ(Companion companion, OnInviteResultListener onInviteResultListener, boolean z, String str, String str2, BeInvitedDialogUICtrlCmd beInvitedDialogUICtrlCmd, boolean z2, String str3, long j, ImageModel imageModel, long j2, DataChannel dataChannel, boolean z3, boolean z4, boolean z5, String str4, int i, long j3, int i2) {
            String str5 = str2;
            String str6 = str;
            boolean z6 = z;
            boolean z7 = z2;
            ImageModel imageModel2 = imageModel;
            BeInvitedDialogUICtrlCmd beInvitedDialogUICtrlCmd2 = beInvitedDialogUICtrlCmd;
            long j4 = j3;
            int i3 = i;
            boolean z8 = z5;
            boolean z9 = z4;
            boolean z10 = z3;
            if ((i2 & 2) != 0) {
                z6 = false;
            }
            String str7 = "";
            if ((i2 & 4) != 0) {
                str6 = "";
            }
            if ((i2 & 8) != 0) {
                str5 = "";
            }
            String str8 = null;
            if ((i2 & 16) != 0) {
                beInvitedDialogUICtrlCmd2 = null;
            }
            if ((i2 & 32) != 0) {
                z7 = false;
            }
            if ((i2 & 64) == 0) {
                str7 = str3;
            }
            if ((i2 & 256) != 0) {
                imageModel2 = null;
            }
            if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                z10 = false;
            }
            if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                z9 = false;
            }
            if ((i2 & 8192) != 0) {
                z8 = false;
            }
            if ((i2 & 16384) == 0) {
                str8 = str4;
            }
            if ((32768 & i2) != 0) {
                i3 = 0;
            }
            if ((i2 & 65536) != 0) {
                j4 = 0;
            }
            companion.getClass();
            MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = new MultiGuestV3GuestBeInvitedDialog();
            MultiGuestV3GuestBeInvitedDialog.Companion.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "OnLinkMicBuiltListener", onInviteResultListener);
            C786410Ut5.LJJJI("beInvitedSharePlatform", str6, bundle);
            C786410Ut5.LJJJI("anchorInvitationPosition", str5, bundle);
            bundle.putBoolean("operatorIsModerator", z7);
            C786410Ut5.LJJJI("operatorDisplayName", str7, bundle);
            bundle.putLong("operator_uid", j);
            C786410Ut5.LJJIJL(bundle, "operatorAvatarImageModel", imageModel2);
            bundle.putLong("invitation_timestamp", j2);
            bundle.putBoolean("is_from_share_invite", z8);
            bundle.putInt("inviter_role", i3);
            bundle.putLong("inviter_user_id", j4);
            multiGuestV3GuestBeInvitedDialog.setArguments(bundle);
            multiGuestV3GuestBeInvitedDialog.beInvitedDialogUICtrlCmd = beInvitedDialogUICtrlCmd2;
            multiGuestV3GuestBeInvitedDialog.outerDataChannel = dataChannel;
            multiGuestV3GuestBeInvitedDialog.gameAutoAccept = z10;
            multiGuestV3GuestBeInvitedDialog.isEnterBackGroundWhenTryShowDialog = z9;
            multiGuestV3GuestBeInvitedDialog.isJoinDirectInvitedDialog = z6;
            multiGuestV3GuestBeInvitedDialog.originLinkId = str8;
            return multiGuestV3GuestBeInvitedDialog;
        }
    }
}
