package X;

import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.broadcast.api.FloatWindowEnterForegroundEvent;
import com.bytedance.android.live.broadcast.api.OpenMorePanelAndScrollEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiCoHostIconGroupChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestApplyCountChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIconGroupChangeChannel;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.toolbar.HideShareLeadEvent;
import com.bytedance.android.live.toolbar.ToolbarButtonMoreDialogNew;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMorePanelViewModel;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.LiveHostToolbarMoreSheet;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.LiveToolbarMoreSheet;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.ToolbarButtonMoreDialog;
import com.bytedance.android.livesdk.broadcast.setting.LiveShowCampaignGuideInRoom;
import com.bytedance.android.livesdk.dataChannel.LiveDismissMoreDialogEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveShowMoreDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFansClubSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2EventTrackingOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UXF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UXF implements InterfaceViewOnClickListenerC1102800enu, InterfaceC1141530foN {
    public Room LL;
    public ToolbarButtonMoreDialogNew LLIZ;
    public LiveToolbarMoreSheet LLIZLLLIL;
    public DataChannel LLJ;
    public LiveMode LLJI;
    public InterfaceC1103130eoR LLJIJIL;
    public C0UXI LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public boolean LLJJIJIL;
    public final List<EnumC1102750enp> LLILLJJLI = new ArrayList();
    public final List<EnumC1102750enp> LLILLL = new ArrayList();
    public final List<EnumC1102750enp> LLILZ = new ArrayList();
    public final List<EnumC1102750enp> LLILZIL = new ArrayList();
    public final List<EnumC1102750enp> LLILZLL = new ArrayList();
    public final C11NJ LLJILJIL = new C11NJ();
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(262));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 728));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 727));
    public final ARunnableS112S0100000_12 LLJJIJIIJIL = new ARunnableS112S0100000_12(this, 251);

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    public final void LIZIZ() {
        if (this.LLJJ > 0 && LiveHostSettingsUIConfig.enable()) {
            C19322110iZ.LIZ(this.LLJJ);
        }
        if (C0UIM.LIZ()) {
            LiveToolbarMoreSheet liveToolbarMoreSheet = this.LLIZLLLIL;
            if (liveToolbarMoreSheet != null) {
                liveToolbarMoreSheet.dismiss();
                return;
            }
            return;
        }
        ToolbarButtonMoreDialogNew toolbarButtonMoreDialogNew = this.LLIZ;
        if (toolbarButtonMoreDialogNew != null) {
            toolbarButtonMoreDialogNew.dismiss();
        }
    }

    public final String LIZJ() {
        ArrayList arrayList = new ArrayList();
        if (this.LLJI == LiveMode.SCREEN_RECORD && (!C0W78.LJFF(C497740JfY.LJII()))) {
            arrayList.add("float_window");
        }
        return arrayList.isEmpty() ? "null" : arrayList.toString();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLJJIII.getValue()).booleanValue();
    }

    public final void LJFF() {
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLJIJIL;
        C500260Jjc.LJLJLJ(interfaceC1103130eoR != null ? interfaceC1103130eoR.findViewById(R.id.mx8) : null, true);
        this.LLJILJIL.LIZ(C11NZ.LJLJJLL(30L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 159)));
    }

    /* JADX WARN: Removed duplicated region for block: B:430:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0944  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 2731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UXF.LJIIIIZZ():void");
    }

    public final void LJ() {
        if (!LIZLLL() || ((IQAService) C781270Ukn.LJJI.getValue()).L12() <= 0) {
            EnumC1102750enp.MORE.hideRedDot(this.LLJ);
            return;
        }
        if (this.LLJI == LiveMode.SCREEN_RECORD) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_more_red_dot_show");
            c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LLJJI.getValue()).longValue()), "anchor_id");
            c474500IjALIZ.LJJII(LIZJ(), "type");
            c474500IjALIZ.LIZ();
        }
        EnumC1102750enp.MORE.showRedDot(this.LLJ);
    }

    public static final void LJI(C0UX6 c0ux6) {
        c0ux6.setValid(true);
        String currentId = c0ux6.getCurrentId();
        if (currentId.length() != 0 || (currentId = (String) C13LQ.LJJIIZ(0, c0ux6.getIds())) != null) {
            RedDotExtensionKt.LJIIL(c0ux6, "3", currentId);
        }
    }

    public final void LJII(C773830UXd c773830UXd) {
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        LiveToolbarMoreSheet liveToolbarMoreSheet;
        FragmentManager fragmentManager2;
        Room room;
        Context context;
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C0UXK.class, c773830UXd);
        }
        BroadcastMorePanelViewModel broadcastMorePanelViewModel = (BroadcastMorePanelViewModel) C0U61.LIZ(new C0UNS()).get(BroadcastMorePanelViewModel.class);
        broadcastMorePanelViewModel.getClass();
        if (LiveShowCampaignGuideInRoom.INSTANCE.getValue() != 0) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(broadcastMorePanelViewModel), C0PEM.LIZJ, null, new C0UNO(broadcastMorePanelViewModel, null), 2);
        }
        C1ALS c1als = C1ALS.LIZ;
        C1ALS.LIZ();
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            int i = 0;
            do {
                C01GW c01gw = C485950J3x.LIZ;
                InterfaceC1103130eoR interfaceC1103130eoR = this.LLJIJIL;
                if (interfaceC1103130eoR != null) {
                    context = interfaceC1103130eoR.getContext();
                } else {
                    context = null;
                }
                C485950J3x.LIZLLL(R.layout.h5q, context);
                i++;
            } while (i < 6);
        }
        DataChannel dataChannel3 = this.LLJ;
        if (dataChannel3 != null) {
            dataChannel3.LC0(HideShareLeadEvent.class, Boolean.TRUE);
        }
        DataChannel dataChannel4 = this.LLJ;
        if (dataChannel4 != null && Intrinsics.LJFF(dataChannel4.gg0(C750220Tbo.class), Boolean.FALSE) && (room = this.LL) != null) {
            ((ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class)).BW0(Long.valueOf(room.getId()), room.getOwner().getSecUid(), this.LLJ, null, false);
        }
        LJIIIIZZ();
        if (LiveHostSettingsUIConfig.enable()) {
            DataChannel dataChannel5 = this.LLJ;
            if (dataChannel5 != null && (fragmentManager2 = (FragmentManager) dataChannel5.gg0(C748880TZe.class)) != null) {
                this.LLJJ = C19322110iZ.LJFF(fragmentManager2, new LiveHostToolbarMoreSheet(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, c773830UXd, this.LLJ), "live_toolbar_more_sheet", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
                return;
            }
            return;
        }
        if (C0UIM.LIZ()) {
            DataChannel dataChannel6 = this.LLJ;
            if (dataChannel6 == null || dataChannel6.gg0(C748880TZe.class) == null) {
                return;
            }
            this.LLIZLLLIL = new LiveToolbarMoreSheet(this.LLILLL, this.LLILZ, c773830UXd);
            DataChannel dataChannel7 = this.LLJ;
            if (dataChannel7 == null || (fragmentManager = (FragmentManager) dataChannel7.gg0(C748880TZe.class)) == null || (liveToolbarMoreSheet = this.LLIZLLLIL) == null) {
                return;
            }
            liveToolbarMoreSheet.show(fragmentManager, "LiveToolbarMoreSheet");
            return;
        }
        LiveMode liveMode = this.LLJI;
        if ((liveMode == LiveMode.VIDEO || liveMode == LiveMode.LIVE_VOICE) && !C0IKQ.LIZ(this.LLILLL) && !C0IKQ.LIZ(this.LLILZ)) {
            DataChannel dataChannel8 = this.LLJ;
            if (dataChannel8 == null) {
                return;
            }
            ToolbarButtonMoreDialogNew toolbarButtonMoreDialogNew = new ToolbarButtonMoreDialogNew(this.LLILLL, this.LLILZ, dataChannel8);
            FragmentManager fragmentManager3 = (FragmentManager) dataChannel8.gg0(C748880TZe.class);
            if (fragmentManager3 != null) {
                toolbarButtonMoreDialogNew.show(fragmentManager3, "ToolbarButtonMoreDialogNew");
            }
            this.LLIZ = toolbarButtonMoreDialogNew;
            return;
        }
        if (C0IKQ.LIZ(this.LLILLJJLI) || (dataChannel = this.LLJ) == null) {
            return;
        }
        ToolbarButtonMoreDialog toolbarButtonMoreDialog = new ToolbarButtonMoreDialog(dataChannel, this.LLILLJJLI);
        FragmentManager fragmentManager4 = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager4 != null) {
            toolbarButtonMoreDialog.show(fragmentManager4, "ToolbarButtonMoreDialog");
        }
        toolbarButtonMoreDialog.onCancelListener = new DialogInterfaceOnCancelListenerC786010UsR(this, 2);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        View viewLJ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "campaign_banner_registration_hide")) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            InterfaceC1103130eoR interfaceC1103130eoR = this.LLJIJIL;
            if (interfaceC1103130eoR != null) {
                viewLJ = interfaceC1103130eoR.LJ();
            } else {
                viewLJ = null;
            }
            C785230UrB c785230UrB = new C785230UrB(viewLJ);
            c785230UrB.LIZLLL(2131828292);
            c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.ANCHOR_CAMPAIGN_CONFIGURATION, this.LLJ);
            C0UX6.LIVE_BROADCAST_CAMPAIGN_CENTER.setValid(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C773830UXd c773830UXd;
        String str;
        int iIntValue;
        View view2;
        String str2;
        Room room;
        Integer num;
        LiveMode streamType;
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_MORE);
        if (C0UIM.LIZJ() && C0UIM.LJFF()) {
            RedDotExtensionKt.LIZ(C0UX6.RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT);
        }
        String strLIZ = "";
        if (this.LLJILLL) {
            C0UVE.LJFF = "bubble_guidence";
            c773830UXd = new C773830UXd("FLOAT_WINDOW");
        } else {
            c773830UXd = new C773830UXd("");
        }
        LJII(c773830UXd);
        HashMap map = new HashMap(6);
        Map map2 = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
        DataChannel dataChannel = this.LLJ;
        Map map3 = null;
        if (dataChannel != null) {
            map3 = (Map) dataChannel.gg0(C754590Tir.class);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (map2 != null) {
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                if (Intrinsics.LJFF(map2.get(Long.valueOf(jLongValue)), Boolean.TRUE)) {
                    arrayList.add(Long.valueOf(jLongValue));
                }
            }
        }
        if (map3 != null) {
            Iterator it3 = map3.keySet().iterator();
            while (it3.hasNext()) {
                long jLongValue2 = ((Number) it3.next()).longValue();
                if (Intrinsics.LJFF(map3.get(Long.valueOf(jLongValue2)), Boolean.TRUE)) {
                    arrayList2.add(Long.valueOf(jLongValue2));
                }
            }
        }
        map.put("envelope_permission", arrayList.toString());
        map.put("goody_bag_permission", arrayList2.toString());
        if (this.LLJJIJIL) {
            str = "long_press";
        } else {
            str = "click";
        }
        this.LLJJIJIL = false;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_more_function_click");
        c474500IjALIZ.LJIJJLI(this.LLJ);
        Room room2 = this.LL;
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(str, "method");
        c474500IjALIZ.LJJII(Integer.valueOf(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJII()), "guest_cnt");
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(MultiGuestApplyCountChannel.class)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "red_dot_cnt");
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).xt1(c474500IjALIZ);
        DataChannel dataChannel3 = this.LLJ;
        if (dataChannel3 != null && (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null && room.existedTtlsGoods) {
            c474500IjALIZ.LJJII("1", "is_local_service_live");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(EnumC1102750enp.MORE.isRedDotShowing(this.LLJ))) ? 1 : 0), "is_red_dot");
        c474500IjALIZ.LJJIIZI(map);
        if (CohostWithGuestPhase2EventTrackingOpt.INSTANCE.isEnabled()) {
            int iUh = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Uh();
            if (iUh != 0) {
                if (iUh == 1) {
                    str2 = "guest";
                }
            } else {
                str2 = "normal";
            }
            c474500IjALIZ.LJJII(str2, "connection_type");
        }
        c474500IjALIZ.LIZ();
        if (this.LLJI == LiveMode.SCREEN_RECORD) {
            int i = !Intrinsics.LJFF(LIZJ(), "null") ? 1 : 0;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_more_click");
            c474500IjALIZ2.LJJII(Long.valueOf(((Number) this.LLJJI.getValue()).longValue()), "anchor_id");
            c474500IjALIZ2.LJJII(Integer.valueOf(i), "is_red_dot");
            c474500IjALIZ2.LJJII(LIZJ(), "type");
            c474500IjALIZ2.LIZ();
        }
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (view2 = (View) this.LLJJIJI.getValue()) != null) {
            C0GZA.LIZIZ(view2);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        this.LLJJIJIL = true;
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LIZIZ();
        C1548820qPI.LJIIIIZZ("campaign_banner_registration_hide", this);
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this.LLJILJILJ);
            this.LLJILJILJ = null;
        }
        dataChannel.zQ2(this);
        this.LLJILJIL.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r9, java.util.List r10) {
        /*
            r8 = this;
            r7 = 0
            r5 = 1
            if (r9 == 0) goto L1d
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r9.mRoomAuthStatus
            if (r0 == 0) goto Lf
            boolean r0 = r0.isAnchorGiftEnable()
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r9.getRoomAuthStatus()
            if (r0 == 0) goto L1d
            boolean r0 = r0.isEnableGift()
            if (r0 != r5) goto L1d
            r6 = 1
            goto L1e
        L1d:
            r6 = 0
        L1e:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            long r3 = r0.No0()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L35
            r7 = 1
        L35:
            X.0fCu r0 = X.C1118310fCv.LIZIZ(r5, r7, r6)
            int[] r1 = X.C0UXH.LIZIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r5) goto L5f
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.gift.IGiftService r1 = (com.bytedance.android.live.gift.IGiftService) r1
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r8.LLJ
            boolean r0 = r1.isGiftSuspended(r0)
            if (r0 != 0) goto L5c
            X.0enp r0 = X.EnumC1102750enp.BROADCAST_GIFT
        L58:
            r10.add(r0)
            return
        L5c:
            X.0enp r0 = X.EnumC1102750enp.DUMMY_BROADCAST_GIFT
            goto L58
        L5f:
            X.0enp r0 = X.EnumC1102750enp.DUMMY_BROADCAST_GIFT
            r10.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UXF.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0UXI, com.ss.ugc.live.sdk.message.interfaces.OnMessageListener] */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(final InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        DataChannel dataChannel2;
        LifecycleOwner lifecycleOwnerLJJIFFI;
        RoomAuthStatus roomAuthStatus;
        Room room;
        Room room2;
        this.LLJ = dataChannel;
        this.LL = (Room) dataChannel.gg0(RoomChannel.class);
        this.LLJI = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad mLiveMode:");
        sbLIZ.append(this.LLJI);
        C20441214yg.LIZIZ("ToolbarMoreBehavior", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJIJIL = interfaceC1103130eoR;
        C1548820qPI.LIZLLL("campaign_banner_registration_hide", this);
        dataChannel.CQ2(BroadcastEndShowEvent.class, this, new AwS591S0100000_12(this, 743));
        dataChannel.DQ2(RefreshMoreRedDotEvent.class, this, new AwS591S0100000_12(this, 744));
        dataChannel.DQ2(LiveDismissMoreDialogEvent.class, this, new AwS591S0100000_12(this, 745));
        dataChannel.CQ2(LiveShowMoreDialogEvent.class, this, new AwS591S0100000_12(this, 746));
        dataChannel.CQ2(FloatWindowEnterForegroundEvent.class, this, new AwS591S0100000_12(this, 747));
        dataChannel.CQ2(OpenMorePanelAndScrollEvent.class, this, new AwS591S0100000_12(this, 748));
        LJIIIIZZ();
        LJ();
        ?? r2 = new OnMessageListener() { // from class: X.0UXI
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage instanceof LiveEventMessage) {
                    int i = ((LiveEventMessage) iMessage).actionType;
                    if (i == 1) {
                        this.LL.LJFF();
                    } else {
                        if (i != 2) {
                            return;
                        }
                        C500260Jjc.LJLJLJ(interfaceC1103130eoR.findViewById(R.id.mx8), false);
                    }
                }
            }
        };
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != 0) {
            this.LLJILJILJ = r2;
            iMessageManager.addMessageListener(C001A.LIVE_EVENT_MESSAGE.getIntType(), (OnMessageListener) r2);
        }
        DataChannel dataChannel3 = this.LLJ;
        if (dataChannel3 != null && (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) != null && room2.liveEventCard != null) {
            LJFF();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_more_function_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        DataChannel dataChannel4 = this.LLJ;
        if (dataChannel4 != null && (room = (Room) dataChannel4.gg0(RoomChannel.class)) != null && room.existedTtlsGoods) {
            c474500IjALIZ.LJJII("1", "is_local_service_live");
        }
        c474500IjALIZ.LIZ();
        LifecycleOwner lifecycleOwnerLJJIFFI2 = C520010KaN.LJJIFFI(interfaceC1103130eoR.getContext(), false);
        if (lifecycleOwnerLJJIFFI2 != null) {
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_MORE;
            RedDotExtensionKt.LJI(interfaceC1103130eoR.findViewById(R.id.y7r), lifecycleOwnerLJJIFFI2, null, c0ux6, null);
            RedDotExtensionKt.LJIILJJIL(c0ux6, interfaceC1103130eoR.findViewById(R.id.y7r), true);
            if (C0UIM.LIZJ() && C0UIM.LJFF()) {
                Room room3 = this.LL;
                if (room3 != null && (roomAuthStatus = room3.getRoomAuthStatus()) != null) {
                    if (roomAuthStatus.customizablegiftpoll == 1) {
                        LJI(C0UX6.RED_DOT_LIVE_BROADCAST_CUSTOM_GIFT_VOTE);
                    }
                    if (roomAuthStatus.enableGiftPoll == 1) {
                        LJI(C0UX6.RED_DOT_LIVE_BROADCAST_QUICK_GIFT_VOTE);
                    }
                    if (roomAuthStatus.emotepoll == 1) {
                        LJI(C0UX6.RED_DOT_LIVE_BROADCAST_EMOTE_POLL);
                    } else {
                        C0UX6.RED_DOT_LIVE_BROADCAST_EMOTE_POLL.setValid(false);
                    }
                }
                RedDotExtensionKt.LJII(C0UX6.RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT, null, null, null, new AwS591S0100000_12(dataChannel, 749), false);
            }
        }
        if (GoodyBagFansClubSetting.INSTANCE.getValue() && C0UIM.LJFF() && (lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(interfaceC1103130eoR.getContext(), false)) != null) {
            RedDotExtensionKt.LJI(interfaceC1103130eoR.findViewById(R.id.y7r), lifecycleOwnerLJJIFFI, null, C0UX6.LIVE_BROADCAST_GOODYBAG_MORE, null);
        }
        C0UX6.LIVE_BROADCAST_CAMPAIGN_CENTER.setValid(false);
        DataChannel dataChannel5 = this.LLJ;
        if (dataChannel5 != null) {
            dataChannel5.CQ2(MultiCoHostIconGroupChangeChannel.class, this, new AwS378S0200000_12(this, interfaceC1103130eoR, 51));
        }
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (dataChannel2 = this.LLJ) != null) {
            dataChannel2.CQ2(MultiGuestIconGroupChangeChannel.class, this, new AwS378S0200000_12(this, interfaceC1103130eoR, 53));
        }
    }
}
