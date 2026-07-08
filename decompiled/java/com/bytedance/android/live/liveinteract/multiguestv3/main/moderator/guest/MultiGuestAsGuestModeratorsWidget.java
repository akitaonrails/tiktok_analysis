package com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest;

import X.AbstractC1143290frD;
import X.C01GW;
import X.C01HZ;
import X.C1143300frE;
import X.C1161920gLG;
import X.C11JF;
import X.C13LE;
import X.C19322110iZ;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C304201Fw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C786410Ut5;
import X.C915900ZwS;
import X.C915980Zwa;
import X.C917140ZyS;
import X.C917650ZzH;
import X.C919310a1x;
import X.C919390a25;
import X.C923330a8R;
import X.C924810aAp;
import X.C925150aBN;
import X.C927420aF2;
import X.C927440aF4;
import X.C927450aF5;
import X.C927460aF6;
import X.C930450aJv;
import X.C930480aJy;
import X.C930540aK4;
import X.C940770aaZ;
import X.C942200acs;
import X.DialogInterfaceOnDismissListenerC987010bn9;
import X.EnumC499801x6;
import X.EnumC977660bY4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC919300a1w;
import X.InterfaceC923360a8U;
import X.InterfaceC928190aGH;
import X.InterfaceC940760aaY;
import X.InterfaceC958970b3v;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.linkroom.toolbarsheet.MultiGuestToolAndPlayFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.OpenMultiGuestModeratorDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.LinkMicSettingMessageUpdatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestManagePanelOpenUserListDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestModeratorGuideMessageReceivedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveDialogBackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestInvitePreApprovedChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicZoomMoreLayoutIdConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicZoomLayoutIdConfig;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAsGuestModeratorsWidget extends LiveWidget implements InterfaceC919300a1w, InterfaceC928190aGH {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final Room LL;
    public final MultiGuestV3GuestWidget LLILLJJLI;
    public LinkDialog LLILLL;
    public C919390a25 LLILZ;
    public MultiGuestAsGuestModeratorManageDialog LLILZIL;
    public C11JF LLILZLL;
    public LiveShowModeratorWidget LLIZLLLIL;
    public int LLJI;
    public C930450aJv LLJILJILJ;
    public final C304201Fw LLIZ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
    public final C01GW LLJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public boolean LLJIJIL = true;
    public final C927420aF2 LLJILJIL = new C927420aF2(this);
    public final C927450aF5 LLJILLL = new InterfaceC958970b3v() { // from class: X.0aF5
        @Override // X.InterfaceC958970b3v
        public final void LIZJ(int i, List list) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJIJL(C2180891AWx c2180891AWx) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJJI() {
        }

        @Override // X.InterfaceC958970b3v
        public final boolean LJJJIL() {
            return true;
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIIIL(Map map) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJJJ() {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLLL(List list, boolean z) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLJ(LinkUser linkUser) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            this.LL.B1();
        }
    };
    public final C927440aF4 LLJJ = new InterfaceC940760aaY() { // from class: X.0aF4
        @Override // X.InterfaceC940760aaY
        public final void LJFF(int i, String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJI(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJII(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIII(List<C957020b0m> list) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIJ(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIJIIJIL(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIIJZLJL(C942080acg c942080acg) {
            this.LIZ.C1(null, "moderator onLayoutRenderSuccessEnd");
        }

        @Override // X.InterfaceC940760aaY
        public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            this.LIZ.C1(layoutState, "moderator onLayoutInfoUpdated");
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiGuestAsGuestModeratorsWidget.class, "dataHolder", "getDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void B1() {
        String str;
        Pair<Integer, Integer> pairLIZLLL;
        MultiGuestDataHolder multiGuestDataHolderX1;
        Map<Integer, String> map;
        Map<Integer, String> map2;
        if (this.LLJIJIL) {
            C930480aJy.LIZ.getClass();
            Layout layoutLJIILLIIL = C930480aJy.LJIILLIIL();
            C923330a8R c923330a8R = C923330a8R.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLayout businessType:");
            sbLIZ.append(layoutLJIILLIIL != null ? layoutLJIILLIIL.businessType : null);
            sbLIZ.append(" layoutId:");
            sbLIZ.append(layoutLJIILLIIL != null ? layoutLJIILLIIL.layoutId : null);
            C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
            if (layoutLJIILLIIL == null || (str = layoutLJIILLIIL.businessType) == null || (pairLIZLLL = C917140ZyS.LIZLLL(str)) == null) {
                return;
            }
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF == null) {
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLayout anchorSetting:");
                sbLIZ2.append(pairLIZLLL);
                sbLIZ2.append(" return as anchorPanelSettings is null!");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c1143300frELJIIJJI.getClass();
                AbstractC1143290frD.LIZLLL("MultiGuestAsGuestModeratorsWidget", strLIZIZ);
                return;
            }
            multiLiveAnchorPanelSettingsLJFF.layoutType = pairLIZLLL.getFirst().intValue();
            multiLiveAnchorPanelSettingsLJFF.fixMicNumAction = pairLIZLLL.getSecond().intValue();
            String str2 = layoutLJIILLIIL.layoutId;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onLayoutSwitch layoutId:");
            sbLIZ3.append(str);
            sbLIZ3.append(" layoutType:");
            sbLIZ3.append(pairLIZLLL.getFirst().intValue());
            sbLIZ3.append(" fixMicNumAction:");
            sbLIZ3.append(pairLIZLLL.getSecond().intValue());
            C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ3));
            if (!LinkMicZoomMoreLayoutIdConfig.INSTANCE.isDoubleZoomLayoutId(str2) && !LinkMicZoomLayoutIdConfig.INSTANCE.isZoomLayoutId(str2) && !LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig.INSTANCE.isInFilter(str2) && multiLiveAnchorPanelSettingsLJFF.fixMicNumAction == 0) {
                int i = multiLiveAnchorPanelSettingsLJFF.layoutType;
                if (i == 1) {
                    MultiGuestDataHolder multiGuestDataHolderX12 = x1();
                    if (multiGuestDataHolderX12 != null && (map2 = multiGuestDataHolderX12.LJIJJLI) != null) {
                        ((ConcurrentHashMap) map2).put(1, str2);
                    }
                } else if (i == 0 && (multiGuestDataHolderX1 = x1()) != null && (map = multiGuestDataHolderX1.LJIJJLI) != null) {
                    ((ConcurrentHashMap) map).put(2, str2);
                }
            }
            MultiGuestDataHolder multiGuestDataHolderX13 = x1();
            if (multiGuestDataHolderX13 != null) {
                boolean zLJFF = Intrinsics.LJFF(multiGuestDataHolderX13.LIZIZ(), multiLiveAnchorPanelSettingsLJFF);
                multiGuestDataHolderX13.LJJ(multiLiveAnchorPanelSettingsLJFF);
                if (zLJFF) {
                    multiGuestDataHolderX13.LJJ.setValue(multiLiveAnchorPanelSettingsLJFF);
                }
            }
        }
    }

    @Override // X.InterfaceC928190aGH
    public final void c0() {
        A1("go_live_page", true);
    }

    @Override // X.InterfaceC919300a1w
    public final void sc2() {
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1008);
        if (isViewValid()) {
            awS559S0100000_15.invoke();
        }
    }

    public final MultiGuestDataHolder x1() {
        C304201Fw c304201Fw = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (MultiGuestDataHolder) c304201Fw.LIZ();
    }

    public final void y1() {
        C20441214yg.LIZIZ("MultiGuestAsGuestModeratorsWidget", "hideLiveShowBtn");
        if (MultiGuestLiveShowSetting.INSTANCE.isV1() && this.LLIZLLLIL != null) {
            C20441214yg.LIZIZ("MultiGuestAsGuestModeratorsWidget", "unloadLiveShowWidget");
            try {
                this.subWidgetManager.unload(this.LLIZLLLIL);
                this.LLIZLLLIL = null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("MultiGuestAsGuestModeratorsWidget", String.valueOf(e));
            }
        }
        this.dataChannel.zW(MultiGuestToolAndPlayFragment.LiveShowIconShowChannel.class, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget.z1():void");
    }

    @Override // X.InterfaceC919300a1w
    public final void z21() {
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1008);
        if (isViewValid()) {
            awS559S0100000_15.invoke();
        }
    }

    @Override // X.InterfaceC919300a1w
    public final /* bridge */ /* synthetic */ Boolean isViewValid() {
        return Boolean.valueOf(isViewValid());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorsWidget", "onCreate");
        super.onCreate();
        C919390a25 c919390a25 = new C919390a25(this.LL, this.dataChannel, this);
        this.LLILZ = c919390a25;
        c919390a25.attachView(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, OpenMultiGuestModeratorsManageDialogEvent.class, new AwS594S0100000_15(this, 369));
            dataChannel.BQ2(this, MultiLiveDialogBackEvent.class, new AwS594S0100000_15(this, 370));
            dataChannel.BQ2(this, MultiGuestManagePanelOpenUserListDialogEvent.class, new AwS594S0100000_15(this, 371));
            dataChannel.BQ2(this, LinkMicSettingMessageUpdatedEvent.class, new AwS594S0100000_15(this, 372));
            dataChannel.BQ2(this, MultiGuestInvitePreApprovedChannel.class, new AwS594S0100000_15(this, 373));
            dataChannel.BQ2(this, MultiGuestModeratorGuideMessageReceivedEvent.class, new AwS594S0100000_15(this, 374));
        }
        DataChannelGlobal.LLILZ.CQ2(OpenMultiGuestModeratorDialogEvent.class, this, new AwS594S0100000_15(this, 375));
        C923330a8R c923330a8R = C923330a8R.LIZ;
        Object value = this.LLJ.getValue();
        if (value != null) {
            C923330a8R.LIZLLL.add((InterfaceC923360a8U) value);
        }
        if (C923330a8R.LJI()) {
            z1();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestAsGuestModeratorsWidget", "onDestroy");
        super.onDestroy();
        C20441214yg.LIZIZ("MultiGuestAsGuestModeratorsWidget", "unloadWidgetAsHasNotModeratorAbility");
        y1();
        C924810aAp.LJ().LJII = null;
        C915980Zwa.LJIIIIZZ().vq0(this.LLJILLL);
        C940770aaZ.LIZ().LJJ(this.LLJJ);
        LinkDialog linkDialog = this.LLILLL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        this.LLILLL = null;
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LLILZIL;
        if (multiGuestAsGuestModeratorManageDialog != null) {
            C500260Jjc.LJJLIIIJL(multiGuestAsGuestModeratorManageDialog);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C923330a8R c923330a8R = C923330a8R.LIZ;
        Object value = this.LLJ.getValue();
        if (value != null) {
            C923330a8R.LIZLLL.remove(value);
        }
        C919390a25 c919390a25 = this.LLILZ;
        if (c919390a25 != null) {
            c919390a25.detachView();
        }
        C11JF c11jf = this.LLILZLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZLL = null;
        C930450aJv c930450aJv = this.LLJILJILJ;
        if (c930450aJv != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy size:");
            sbLIZ.append(((ArrayList) c930450aJv.LIZLLL).size());
            C20441214yg.LIZIZ("ModeratorInviteGuideHelper", C2188811AlT.LIZIZ(sbLIZ));
            c930450aJv.LJ.dispose();
            Iterator it2 = new ArrayList(c930450aJv.LIZLLL).iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            ((ArrayList) c930450aJv.LIZLLL).clear();
            c930450aJv.LIZ.zQ2(c930450aJv);
        }
    }

    @Override // X.InterfaceC919300a1w
    public final void Gv(String str) {
        AwS100S1000000_15 awS100S1000000_15 = new AwS100S1000000_15(str, 3);
        if (isViewValid()) {
            awS100S1000000_15.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0aF5] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0aF4] */
    public MultiGuestAsGuestModeratorsWidget(Room room, MultiGuestV3GuestWidget multiGuestV3GuestWidget) {
        this.LL = room;
        this.LLILLJJLI = multiGuestV3GuestWidget;
    }

    public final void A1(String str, boolean z) {
        FragmentManager fragmentManager;
        LinkDialog linkDialog;
        if (this.LLILLL == null) {
            LinkDialog linkDialog2 = new LinkDialog(this);
            EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.MULTI_LIVE_MODERATOR_SETTING_FRAGMENT;
            C927460aF6 c927460aF6 = new C927460aF6();
            c927460aF6.LIZIZ = false;
            c927460aF6.LJIIJJI = z;
            c927460aF6.LJIIL = str;
            linkDialog2.LLILZIL = enumC977660bY4;
            linkDialog2.LLILZLL = c927460aF6;
            this.LLILLL = linkDialog2;
            linkDialog2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 26));
        }
        C919310a1x.LIZ("MultiGuestAsGuestModeratorsWidget", "showLayoutSettingDialog");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (linkDialog = this.LLILLL) != null) {
            linkDialog.show(fragmentManager, "LinkDialog");
        }
    }

    public final void C1(LayoutState layoutState, String str) {
        if (!this.LLJIJIL) {
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
        if (multiLiveAnchorPanelSettingsLJFF == null) {
            C20441214yg.LJ("MultiGuestAsGuestModeratorsWidget", "updateLayoutSettingV2 return as anchorPanelSettings is null!");
            return;
        }
        Integer numLJIIIIZZ = C917650ZzH.LJIIIIZZ(C940770aaZ.LIZ().getDataSource().LJII());
        if (numLJIIIIZZ != null) {
            multiLiveAnchorPanelSettingsLJFF.layoutType = numLJIIIIZZ.intValue();
            Integer numLJI = C917650ZzH.LJI(C940770aaZ.LIZ().getDataSource().LJII());
            if (numLJI != null) {
                multiLiveAnchorPanelSettingsLJFF.fixMicNumAction = numLJI.intValue();
                MultiGuestDataHolder multiGuestDataHolderX1 = x1();
                if (multiGuestDataHolderX1 != null) {
                    boolean zLJFF = Intrinsics.LJFF(multiGuestDataHolderX1.LIZIZ(), multiLiveAnchorPanelSettingsLJFF);
                    multiGuestDataHolderX1.LJJ(multiLiveAnchorPanelSettingsLJFF);
                    if (zLJFF) {
                        multiGuestDataHolderX1.LJJ.setValue(multiLiveAnchorPanelSettingsLJFF);
                    }
                }
                C942200acs.LJ(layoutState, str);
            }
        }
    }

    @Override // X.InterfaceC928190aGH
    public final void N0(String str, String str2) {
        FragmentManager fragmentManager;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILIIL("openPlayModeDialog");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            if (c01hzKi1 != null) {
                c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ(str2), null);
            }
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.LIZ(0, null);
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("com.bytedance.android.live.liveinteract.multiguestv3.main.common.SOURCE", str, bundle);
            C786410Ut5.LJJJI("com.bytedance.android.live.liveinteract.multiguestv3.main.common.FROM_PAGE", str2, bundle);
            C19322110iZ.LIZLLL(fragmentManager, MultiGuestToolAndPlayFragment.class, "multi_guest_tool_and_play", sheetOptions, bundle);
        }
    }
}
