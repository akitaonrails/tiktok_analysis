package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.guest;

import X.C01GW;
import X.C19EH;
import X.C20441214yg;
import X.C292401Bi;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C922310a6n;
import X.C943120aeM;
import X.C948750anR;
import X.InterfaceC948760anS;
import X.InterfaceC954180awC;
import X.InterfaceC964770bDH;
import Y.ACListenerS118S0200000_15;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcKeyBoardChangeStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperSwitchPageEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
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
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperGuestCreateDialog extends AbsAigcBottomDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTHELIOSxiPi4/JDUtOSohZjMlLDh9LCwtJSA0ZiI5LDwnZgQlLiwEKSkgOS4jLTcLPCogPAY+LC4nLQElKCM8Lw==";
    public AigcWallpaperGuestViewModel LLILLJJLI;
    public LiveBaseFragment LLILLL;
    public final C01GW LLILZ;
    public C948750anR LLILZIL;
    public View LLILZLL;
    public FrameLayout LLIZ;
    public final C01GW LLIZLLLIL;
    public final C922310a6n LLJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0a6n] */
    public AigcWallpaperGuestCreateDialog() {
        super(false);
        this.LLILZ = C292401Bi.LIZ(new AwS559S0100000_15(this, 344));
        this.LLIZLLLIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 345));
        this.LLJ = new InterfaceC964770bDH() { // from class: X.0a6n
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
            public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLinkMicStateChanged: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("AigcWallpaperGuestCreateDialog", C2188811AlT.LIZIZ(sbLIZ));
                if (i != 0 && i != 1) {
                    return;
                }
                AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LL.LLILLJJLI;
                if (aigcWallpaperGuestViewModel != null) {
                    aigcWallpaperGuestViewModel.FQ2();
                }
                C930540aK4.LJJIZ(this.LL);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
                Long l = kickOutMessage.owner.userId;
                long jLJIIL = C930540aK4.LJIIL();
                if (l != null && l.longValue() == jLJIIL) {
                    C930540aK4.LJJIZ(this.LL);
                    AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LL.LLILLJJLI;
                    if (aigcWallpaperGuestViewModel != null) {
                        aigcWallpaperGuestViewModel.FQ2();
                    }
                }
            }
        };
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void MR() {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final int getLayoutId() {
        return R.layout.hbo;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void initData() {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLILLJJLI;
        if (aigcWallpaperGuestViewModel != null) {
            aigcWallpaperGuestViewModel.FQ2();
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C948750anR c948750anR = this.LLILZIL;
        if (c948750anR != null) {
            c948750anR.LIZ();
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        super.onDestroy();
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ = C915980Zwa.LJIIIIZZ();
        if (iMultiGuestV3InternalServiceV2LJIIIIZZ == null || (interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2LJIIIIZZ.LLJLL()) == null) {
            return;
        }
        interfaceC954180awCLLJLL.LLIFFJFJJ(this.LLJ);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void NR(View view) {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ = C915980Zwa.LJIIIIZZ();
        if (iMultiGuestV3InternalServiceV2LJIIIIZZ != null && (interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2LJIIIIZZ.LLJLL()) != null) {
            interfaceC954180awCLLJLL.LJJZZIII(this.LLJ);
        }
        this.LLILZLL = view.findViewById(R.id.yg_);
        this.LLIZ = (FrameLayout) view.findViewById(R.id.asw);
        View viewFindViewById = view.findViewById(R.id.trr);
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS118S0200000_15(this, view, 27), view2);
        }
        this.LLILZIL = new C948750anR(viewFindViewById);
        C948750anR c948750anR = this.LLILZIL;
        if (c948750anR != null) {
            c948750anR.LIZIZ(new InterfaceC948760anS() { // from class: X.0ait
                @Override // X.InterfaceC948760anS
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC948760anS
                public final void LIZ() {
                    this.LIZ.OR(0.3f, 0.7f);
                    DataChannel dataChannel = this.LIZ.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(AigcKeyBoardChangeStatus.class, Boolean.FALSE);
                    }
                }

                @Override // X.InterfaceC948760anS
                public final void LIZJ() {
                    this.LIZ.OR(0.1f, 0.9f);
                    DataChannel dataChannel = this.LIZ.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(AigcKeyBoardChangeStatus.class, Boolean.TRUE);
                    }
                }
            });
        }
    }

    public final void PR(AbsAigcWallpaperFragment absAigcWallpaperFragment) {
        try {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            if (c19ehLJIIJ != null) {
                LiveBaseFragment liveBaseFragment = this.LLILLL;
                if (liveBaseFragment != null) {
                    if (liveBaseFragment != absAigcWallpaperFragment) {
                        if (!absAigcWallpaperFragment.isAdded()) {
                            c19ehLJIIJ.LJIILL(liveBaseFragment);
                            c19ehLJIIJ.LIZIZ(R.id.asw, absAigcWallpaperFragment);
                            c19ehLJIIJ.LJIIIZ();
                        } else {
                            c19ehLJIIJ.LJIILL(liveBaseFragment);
                            c19ehLJIIJ.LJJIFFI(absAigcWallpaperFragment);
                            c19ehLJIIJ.LJIIIZ();
                        }
                        this.LLILLL = absAigcWallpaperFragment;
                        return;
                    }
                    return;
                }
                if (!absAigcWallpaperFragment.isAdded()) {
                    c19ehLJIIJ.LIZIZ(R.id.asw, absAigcWallpaperFragment);
                    c19ehLJIIJ.LJIIIZ();
                } else {
                    c19ehLJIIJ.LJJIFFI(absAigcWallpaperFragment);
                    c19ehLJIIJ.LJIIIZ();
                }
                this.LLILLL = absAigcWallpaperFragment;
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("AigcWallpaperGuestCreateDialog", "childFragmentManager failed,", th);
        }
        C20441214yg.LJ("AigcWallpaperGuestCreateDialog", "switchFragment return, because  transaction is null");
    }

    public final void OR(float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.LLILZLL;
        LinearLayout.LayoutParams layoutParams4 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.weight = f;
            }
        } else {
            layoutParams2 = null;
        }
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            layoutParams3 = frameLayout.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams4 = (LinearLayout.LayoutParams) layoutParams3) != null) {
            layoutParams4.weight = f2;
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams2);
        }
        FrameLayout frameLayout2 = this.LLIZ;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams4);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C943120aeM.LIZ = 0;
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLILLJJLI;
        if (aigcWallpaperGuestViewModel != null) {
            aigcWallpaperGuestViewModel.LLJJIJIL = "";
            aigcWallpaperGuestViewModel.LLJJJ = "";
            aigcWallpaperGuestViewModel.getClass();
        }
        PR((AbsAigcWallpaperFragment) this.LLILZ.getValue());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(AigcWallpaperSwitchPageEvent.class, this, new AwS594S0100000_15(this, 411));
        }
    }
}
