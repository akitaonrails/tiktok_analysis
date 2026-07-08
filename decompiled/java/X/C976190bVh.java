package X;

import Y.AcS496S0100000_15;
import Y.AfS0S0111100_15;
import Y.AfS0S0211100_15;
import Y.AfS1S1210100_15;
import Y.AfS5S0100100_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.room.DismissUserProfileEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiBattleFinishResponse;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS0S0111300_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS29S0200100_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS3S0101200_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C976190bVh implements InterfaceC976360bVy {
    public final MatchBaseWidget LIZ;
    public final DataChannel LIZIZ;
    public LinkDialog LIZJ;
    public LiveDialog LIZLLL;
    public LiveSheetFragment LJ;
    public InteractDisconnectDialog LJFF;
    public boolean LJI;

    @Override // X.InterfaceC976360bVy
    public final void LJIIIIZZ() {
        IMessageManager iMessageManager;
        BattleNoticeAnchorGiftGuide battleNoticeAnchorGiftGuide = new BattleNoticeAnchorGiftGuide();
        BattleNoticeText battleNoticeText = new BattleNoticeText();
        battleNoticeText.text = C497740JfY.LJIJI(2131842752);
        battleNoticeAnchorGiftGuide.content = battleNoticeText;
        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = new LinkMicBattleNoticeMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZIZ);
        commonMessageData.roomId = roomLJJLIIIIJ != null ? roomLJJLIIIIJ.getId() : 0L;
        commonMessageData.showMsg = true;
        linkMicBattleNoticeMessage.baseMessage = commonMessageData;
        linkMicBattleNoticeMessage.noticeType = 3;
        linkMicBattleNoticeMessage.anchorGiftGuide = battleNoticeAnchorGiftGuide;
        linkMicBattleNoticeMessage.LL = true;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.insertMessage(linkMicBattleNoticeMessage);
    }

    @Override // X.InterfaceC976360bVy
    public final void LJIIL() {
        C20441214yg.LIZIZ("MatchMatchingCoordinator", "dismissPanel, Closing match managememt panel");
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LIZIZ);
        if (c0utjPl1 != null) {
            c0utjPl1.LJIL(EnumC20429414wm.DETAIL, "match_playbook_entrance", null);
        }
        LiveSheetFragment liveSheetFragment = this.LJ;
        if (liveSheetFragment != null) {
            liveSheetFragment.close();
        }
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZ("match_management_panel_dialog");
    }

    public final int LIZJ() {
        MatchBaseWidget matchBaseWidgetLJIILJJIL;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MatchBaseWidget matchBaseWidgetLJIILJJIL2 = LJIILJJIL();
        if ((matchBaseWidgetLJIILJJIL2 != null ? matchBaseWidgetLJIILJJIL2.getView() : null) == null || (matchBaseWidgetLJIILJJIL = LJIILJJIL()) == null || (viewFindViewById = matchBaseWidgetLJIILJJIL.findViewById(R.id.mbw)) == null) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        return ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams.topMargin) + (viewFindViewById.getHeight() / 2);
    }

    @Override // X.InterfaceC976360bVy
    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss dialog ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LJ("MatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        LinkDialog linkDialog = this.LIZJ;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        LiveDialog liveDialog = this.LIZLLL;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        InteractDisconnectDialog interactDisconnectDialog = this.LJFF;
        if (interactDisconnectDialog != null) {
            interactDisconnectDialog.dismiss();
        }
    }

    @Override // X.InterfaceC976360bVy
    public final void LJI() {
        MatchBaseWidget matchBaseWidgetLJIILJJIL = LJIILJJIL();
        if (matchBaseWidgetLJIILJJIL == null || matchBaseWidgetLJIILJJIL.getView() == null) {
            return;
        }
        MatchBaseWidget matchBaseWidgetLJIILJJIL2 = LJIILJJIL();
        C16FS c16fs = matchBaseWidgetLJIILJJIL2 != null ? (C16FS) matchBaseWidgetLJIILJJIL2.findViewById(R.id.cnn) : null;
        MatchBaseWidget matchBaseWidgetLJIILJJIL3 = LJIILJJIL();
        C985030bjx c985030bjx = matchBaseWidgetLJIILJJIL3 != null ? (C985030bjx) matchBaseWidgetLJIILJJIL3.findViewById(R.id.cnl) : null;
        if (c16fs != null) {
            C786410Ut5.LLJJJ(c16fs, 8);
        }
        if (c985030bjx != null) {
            C786410Ut5.LLJL(c985030bjx, 8);
            c985030bjx.LIZIZ();
        }
    }

    public MatchBaseWidget LJIILJJIL() {
        return this.LIZ;
    }

    public C976190bVh(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        MatchBaseWidget matchBaseWidgetLJIILJJIL = LJIILJJIL();
        if (matchBaseWidgetLJIILJJIL != null) {
            dataChannelProvideDataChannel = matchBaseWidgetLJIILJJIL.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZIZ = dataChannelProvideDataChannel;
    }

    @Override // X.InterfaceC976360bVy
    public final void LJII(int i) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (i == 1) {
            C20441214yg.LJIIIZ("MatchMatchingCoordinator", "post MatchCutShortEvent lose");
            MatchBaseWidget matchBaseWidgetLJIILJJIL = LJIILJJIL();
            if (matchBaseWidgetLJIILJJIL != null && (dataChannel2 = matchBaseWidgetLJIILJJIL.dataChannel) != null) {
                dataChannel2.LC0(MatchCutShortEvent.class, new C948560an8(LIZJ(), true, 0, 12));
                return;
            }
            return;
        }
        if (i == 0) {
            C20441214yg.LJIIIZ("MatchMatchingCoordinator", "post MatchCutShortEvent win");
            MatchBaseWidget matchBaseWidgetLJIILJJIL2 = LJIILJJIL();
            if (matchBaseWidgetLJIILJJIL2 != null && (dataChannel = matchBaseWidgetLJIILJJIL2.dataChannel) != null) {
                dataChannel.LC0(MatchCutShortEvent.class, new C948560an8(LIZJ(), false, 0, 12));
            }
        }
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIFFI(boolean z, boolean z2) {
        DataChannel dataChannel;
        C962900bAG c962900bAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matching setTeamPairFlag ");
        sbLIZ.append(false);
        C20441214yg.LIZIZ("MatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel2 = this.LIZIZ;
        if ((dataChannel2 != null && (c962900bAG = (C962900bAG) dataChannel2.gg0(BattleIsInTeamPairing.class)) != null && !c962900bAG.LIZ) || (dataChannel = this.LIZIZ) == null) {
            return;
        }
        dataChannel.zW(BattleIsInTeamPairing.class, new C962900bAG(false, false, 4));
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJII(C954460awe c954460awe, AwS381S0200000_15 awS381S0200000_15) {
        Boolean boolValueOf;
        LiveDialog liveDialog;
        MatchBaseWidget matchBaseWidgetLJIILJJIL = LJIILJJIL();
        if (matchBaseWidgetLJIILJJIL != null) {
            LiveDialog liveDialog2 = this.LIZLLL;
            FragmentManager fragmentManager = null;
            if (liveDialog2 != null) {
                boolValueOf = Boolean.valueOf(liveDialog2.isShowing());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (liveDialog = this.LIZLLL) != null) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
            C961300b7g.LIZ.getClass();
            C961300b7g.LIZIZ("MatchMatchingCoordinator showOthersRequestQuitDialog");
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null) {
                dataChannel.FQ2(DismissUserProfileEvent.class);
            }
            AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(awS381S0200000_15, 653);
            LinkDialog linkDialog = new LinkDialog(matchBaseWidgetLJIILJJIL);
            EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TYPE_INDIVIDUAL_MATCH_QUIT_REQUEST;
            C976790bWf c976790bWf = new C976790bWf(matchBaseWidgetLJIILJJIL);
            c976790bWf.LIZJ = c954460awe;
            c976790bWf.LIZLLL = awS594S0100000_15;
            linkDialog.LLILZIL = enumC977660bY4;
            linkDialog.LLILZLL = c976790bWf;
            DataChannel dataChannel2 = this.LIZIZ;
            if (dataChannel2 != null) {
                fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
            }
            linkDialog.show(fragmentManager, "LinkDialog");
            this.LIZJ = linkDialog;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC976360bVy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(long r12, X.C13BV r14) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976190bVh.LJJIL(long, X.13BV):void");
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIZ(int i, AwS224S0300000_15 awS224S0300000_15) {
        Boolean boolValueOf;
        String strLJIJI;
        int i2;
        int i3;
        FragmentManager fragmentManager;
        InteractDisconnectDialog interactDisconnectDialog;
        if (LJIILJJIL() == null) {
            return;
        }
        if (LiveMatchDropOffSetting.INSTANCE.isEnable() && C970370bMJ.LJIIIZ()) {
            if (LJIILJJIL() != null) {
                InteractDisconnectDialog interactDisconnectDialog2 = new InteractDisconnectDialog();
                this.LJFF = interactDisconnectDialog2;
                interactDisconnectDialog2.LLIZLLLIL = C497740JfY.LJIJI(2131842771);
                interactDisconnectDialog2.LLJ = C497740JfY.LJIJI(2131842772);
                interactDisconnectDialog2.LLJI = 3;
                interactDisconnectDialog2.LLJILJIL = C497740JfY.LJIJI(2131842737);
                interactDisconnectDialog2.LLJIJIL = C497740JfY.LJIJI(2131842773);
                interactDisconnectDialog2.LLJJ = new AwS559S0100000_15(awS224S0300000_15, 592);
                interactDisconnectDialog2.LLJILJILJ = false;
                interactDisconnectDialog2.LLJJI = AFwS203S0000000_15.get$arr$(217);
                interactDisconnectDialog2.onCancelListener = new DialogInterfaceOnCancelListenerC986960bn4(awS224S0300000_15, 8);
                DataChannel dataChannel = this.LIZIZ;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (interactDisconnectDialog = this.LJFF) != null) {
                    interactDisconnectDialog.show(fragmentManager, "InteractDisconnectDialog");
                    return;
                }
                return;
            }
            return;
        }
        LiveDialog liveDialog = this.LIZLLL;
        Context context = null;
        if (liveDialog != null) {
            boolValueOf = Boolean.valueOf(liveDialog.isShowing());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return;
        }
        if (i == 1) {
            strLJIJI = C497740JfY.LJIJI(2131853283);
        } else if (!C970370bMJ.LJ() && C970370bMJ.LJIIIIZZ()) {
            int iLIZJ = C970370bMJ.LIZJ();
            if (iLIZJ != 3 && iLIZJ != 4) {
                strLJIJI = C497740JfY.LJIJI(2131853274);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131853273);
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131853321);
        }
        MatchBaseWidget matchBaseWidgetLJIILJJIL = LJIILJJIL();
        if (matchBaseWidgetLJIILJJIL != null) {
            context = matchBaseWidgetLJIILJJIL.context;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131843061);
        c782110Um9.LJIIIZ(strLJIJI);
        c782110Um9.LJIILL = false;
        if (C970370bMJ.LJIIIIZZ()) {
            i2 = 2131853279;
        } else {
            i2 = 2131853323;
        }
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(i2), new AcS496S0100000_15(awS224S0300000_15, 37));
        if (C970370bMJ.LJIIIIZZ()) {
            i3 = 2131853280;
        } else {
            i3 = 2131853322;
        }
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(i3), new InterfaceC743640TFa() { // from class: X.0bWn
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog2) {
                liveDialog2.cancel();
            }
        });
        c782110Um9.LJIJI = new DialogInterfaceOnCancelListenerC986960bn4(awS224S0300000_15, 7);
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        C786410Ut5.E4(liveDialogLIZ);
        this.LIZLLL = liveDialogLIZ;
    }

    @Override // X.InterfaceC976360bVy
    public final void LJIILL(long j, AwS29S0200100_15 awS29S0200100_15, AwS594S0100000_15 awS594S0100000_15) {
        long channelId = C915980Zwa.LJII().getChannelId();
        C974540bT2.LIZ.LJLIL();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).quit(j, channelId).LIZJ(C11RD.LJ(LJIILJJIL()))).LIZ(new AfS5S0100100_15(j, awS29S0200100_15, 6), new AfS5S0100100_15(j, awS594S0100000_15, 7));
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIJIIJI(boolean z, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
        C979690bbL c979690bbL;
        LiveSheetFragment liveSheetFragmentLJIIL;
        MatchBaseWidget matchBaseWidgetLJIILJJIL = LJIILJJIL();
        String str = null;
        if (matchBaseWidgetLJIILJJIL != null && matchBaseWidgetLJIILJJIL.context != null) {
            C961300b7g.LIZ.getClass();
            if (C961300b7g.LJII("match_management_panel_dialog")) {
                return;
            }
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null) {
                c979690bbL = (C979690bbL) dataChannel.gg0(C962520b9e.class);
            } else {
                c979690bbL = null;
            }
            if (!C500260Jjc.LJJJI(Boolean.valueOf(C915980Zwa.LIZLLL().qp0())) && !C163000js.LIZ()) {
                liveSheetFragmentLJIIL = C961300b7g.LJIILIIL(this.LIZIZ, new C961680b8I(new AwS594S0100000_15(awS594S0100000_15, 652), c979690bbL));
            } else {
                if (C918210a0B.LIZLLL) {
                    C978360bZC.LJIIL = "match_panel";
                    str = "playbook_guide_icon";
                    C978360bZC.LJIIJJI = "playbook_guide_icon";
                } else {
                    C978360bZC.LJIIJJI = "match_icon";
                }
                DataChannel dataChannel2 = this.LIZIZ;
                AwS594S0100000_15 awS594S0100000_152 = new AwS594S0100000_15(awS594S0100000_15, 651);
                C976780bWe c976780bWe = new C976780bWe();
                c976780bWe.LIZIZ = awS594S0100000_152;
                c976780bWe.LIZJ = c979690bbL;
                c976780bWe.LIZLLL = awS559S0100000_15;
                c976780bWe.LJ = z;
                c976780bWe.LJFF = str;
                liveSheetFragmentLJIIL = C961300b7g.LJIIL(dataChannel2, c976780bWe);
            }
            this.LJ = liveSheetFragmentLJIIL;
        }
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIJIL(long j, List list, boolean z, boolean z2) {
        List<C954460awe> listLLILZLL;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        if (list != null) {
            for (C976800bWg c976800bWg : (ArrayList) list) {
                MatchBaseWidget matchBaseWidgetLJIILJJIL = LJIILJJIL();
                if (matchBaseWidgetLJIILJJIL != null) {
                    viewOnClickListenerC986770bmlX1 = matchBaseWidgetLJIILJJIL.x1(c976800bWg.LIZ);
                } else {
                    viewOnClickListenerC986770bmlX1 = null;
                }
                if (z2) {
                    if (viewOnClickListenerC986770bmlX1 != null) {
                        viewOnClickListenerC986770bmlX1.l0(C915980Zwa.LJII().LLILZLL(true).size());
                        viewOnClickListenerC986770bmlX1.t2(c976800bWg.LJ, z, j, C915980Zwa.LJFF().xB0(), c976800bWg.LJII);
                    }
                } else if (viewOnClickListenerC986770bmlX1 != null) {
                    viewOnClickListenerC986770bmlX1.t2(c976800bWg.LJ, z, j, C915980Zwa.LJFF().xB0(), c976800bWg.LJII);
                }
            }
            if (!((ArrayList) list).isEmpty()) {
                return;
            }
        }
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        if (iMultiHostServiceLJII != null && (listLLILZLL = iMultiHostServiceLJII.LLILZLL(true)) != null) {
            for (C954460awe c954460awe : listLLILZLL) {
                MatchBaseWidget matchBaseWidgetLJIILJJIL2 = LJIILJJIL();
                if (matchBaseWidgetLJIILJJIL2 != null) {
                    String str = c954460awe.LJIIJJI;
                    MultiCoHostWindowManager multiCoHostWindowManager = matchBaseWidgetLJIILJJIL2.LLILLJJLI;
                    if (multiCoHostWindowManager != null && (viewOnClickListenerC986770bmlLJ = multiCoHostWindowManager.LJ(str)) != null) {
                        viewOnClickListenerC986770bmlLJ.t2(0L, z, j, C915980Zwa.LJFF().xB0(), 0L);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC976360bVy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(int r13, int r14, long r15, kotlin.jvm.functions.Function1 r17, kotlin.jvm.functions.Function1 r18, boolean r19) {
        /*
            r12 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r12.LIZIZ
            r5 = 0
            if (r0 == 0) goto L9
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = X.C500260Jjc.LJJLIIIIJ(r0)
        L9:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            long r3 = r0.getChannelId()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6c
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            long r0 = r0.getChannelId()
        L1f:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L7c
            long r6 = r0.longValue()
        L29:
            if (r5 == 0) goto L6b
            X.0bT2 r0 = X.C974540bT2.LIZ
            r8 = r19
            r0.LJJZZIII(r13, r8)
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi> r0 = com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi.class
            r1.getClass()
            java.lang.Object r3 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi r3 = (com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi) r3
            long r4 = r5.getId()
            r10 = r15
            r9 = r14
            X.11NZ r1 = r3.punishFinish(r4, r6, r8, r9, r10)
            if (r1 == 0) goto L6b
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11NZ r3 = r1.LJIILIIL(r0)
            Y.AfS184S0100000_15 r2 = new Y.AfS184S0100000_15
            r0 = 100
            r1 = r17
            r2.<init>(r1, r0)
            Y.AfS57S0110000_15 r1 = new Y.AfS57S0110000_15
            r0 = 21
            r4 = r18
            r1.<init>(r4, r8, r0)
            r3.LJJLL(r2, r1)
        L6b:
            return
        L6c:
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r1 = X.C915980Zwa.LJFF()
            r0 = 0
            X.0bRj r0 = r1.yf2(r0)
            if (r0 == 0) goto L7c
            long r0 = r0.LJJL()
            goto L1f
        L7c:
            r6 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976190bVh.LJJIIZ(int, int, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean):void");
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJJ(long j, long j2, long j3, int i, String str, AwS3S0101200_15 awS3S0101200_15, C976310bVt c976310bVt) {
        boolean zIsAppBackground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
        int i2 = C954660awy.LJII;
        boolean z = true;
        if (C915980Zwa.LJII().LLILZLL(true).size() >= 3) {
            z = false;
        }
        C974540bT2.LIZ.LJJLIIIJLJLI(str, z);
        C480460Ism.LIZ().getClass();
        ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).leaveLinkMic(j2, j, j3, i, str, zIsAppBackground ? 1 : 0, i2, -1L).LJIILIIL(new C0UO0()).LJJLL(new AfS1S1210100_15(this, j, z, str, awS3S0101200_15, 0), new AfS0S0111100_15(i, j, c976310bVt, z, 1));
    }

    @Override // X.InterfaceC976360bVy
    public final void LJIJI(final long j, final boolean z, final long j2, final int i, String str, long j3, final CustomLinkMessage customLinkMessage, final AwS0S0111300_15 awS0S0111300_15, AwS0S0111300_15 awS0S0111300_152, AwS559S0100000_15 awS559S0100000_15, C976210bVj c976210bVj) {
        Long lValueOf;
        long jLongValue;
        InterfaceC500940Jki interfaceC500940JkiUser;
        if (this.LJI) {
            return;
        }
        Room roomLJJLIIIIJ = null;
        if (C915980Zwa.LJII().getChannelId() != 0) {
            lValueOf = Long.valueOf(C915980Zwa.LJII().getChannelId());
        } else {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJL());
            } else {
                lValueOf = null;
            }
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        }
        final int iLJJIJIIJI = C974540bT2.LJJIJIIJI(i, j2, roomLJJLIIIIJ);
        boolean zIsAppBackground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
        int i2 = C954660awy.LJII;
        if (!LiveMatchDropOffSetting.INSTANCE.battleFinishDisabledForOthers() || j2 == 0 || ((interfaceC500940JkiUser = UserService.getInstance().user()) != null && j2 == interfaceC500940JkiUser.getCurrentUserId())) {
            this.LJI = true;
            c974540bT2.LJJJZ(iLJJIJIIJI, z);
            C480460Ism.LIZ().getClass();
            MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            multiMatchApi.multiFinishPb(jLongValue, j, j2, str, zIsAppBackground ? 1 : 0, i2, -1L, 1).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0bT5
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Long lValueOf2;
                    BattleTeamResult battleTeamResult;
                    ExtraDataWrapper extraDataWrapper;
                    LinkMessage linkMessage;
                    BattleTeamResult battleTeamResult2;
                    Map<Long, BattleTeamResult> map;
                    Map<Long, BattleTeamResult> map2;
                    C1C7U.LIZ("MatchMatchingCoordinator@f28c.requestSettleFinishApi$finishDispose$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    this.LL.LJI = false;
                    C974540bT2 c974540bT22 = C974540bT2.LIZ;
                    long j4 = j;
                    boolean z2 = z;
                    int i3 = i;
                    JSONObject jSONObject = new JSONObject();
                    C0K04.LIZLLL(z2, "cut_short", jSONObject);
                    C0K04.LIZLLL(i3, "source", jSONObject);
                    C0K04.LJFF("logid", baseResponse.LIZIZ, jSONObject);
                    C0K04.LJ("battle_id", j4, jSONObject);
                    C974540bT2.LJIJJLI(jSONObject, false);
                    JSONObject jSONObject2 = new JSONObject();
                    C0K04.LIZLLL(z2, "cut_short", jSONObject2);
                    C0K04.LIZLLL(i3, "source", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    C0K04.LJ("cost", C158B.LIZ() - C974540bT2.LJIIIZ, jSONObject3);
                    c974540bT22.LLIIIJ("battle_finish_succeed", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
                    MultiBattleFinishResponse multiBattleFinishResponse = (MultiBattleFinishResponse) baseResponse.data;
                    Long lValueOf3 = null;
                    if (multiBattleFinishResponse != null && multiBattleFinishResponse.teamBattleResult != null) {
                        C0K04.LJFF("battle_result", GsonProtectorUtils.toJson(C19748512Ol.LIZJ, multiBattleFinishResponse.teamBattleResult), jSONObject);
                    }
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    long jLongValue2 = 0;
                    if (Room.isValid(room)) {
                        if (room != null) {
                            lValueOf2 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            lValueOf2 = null;
                        }
                    } else {
                        lValueOf2 = 0L;
                    }
                    Map<Long, BattleTeamUserArmies> map3 = ((MultiBattleFinishResponse) baseResponse.data).teamArmies;
                    if (map3 != null) {
                        for (Map.Entry<Long, BattleTeamUserArmies> entry : map3.entrySet()) {
                            List<BattleTeamUser> list = entry.getValue().teamUsers;
                            if (list != null) {
                                Iterator<BattleTeamUser> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        BattleTeamUser next = it2.next();
                                        if (Intrinsics.LJFF(lValueOf2, next.userId)) {
                                            if (next != null) {
                                                jLongValue2 = entry.getKey().longValue();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    MultiBattleFinishResponse multiBattleFinishResponse2 = (MultiBattleFinishResponse) baseResponse.data;
                    if (multiBattleFinishResponse2 != null && (map2 = multiBattleFinishResponse2.teamBattleResult) != null) {
                        battleTeamResult = map2.get(Long.valueOf(jLongValue2));
                    } else {
                        battleTeamResult = null;
                    }
                    if (C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_2V2) {
                        long j5 = 1;
                        if (jLongValue2 == 1) {
                            j5 = 2;
                        }
                        MultiBattleFinishResponse multiBattleFinishResponse3 = (MultiBattleFinishResponse) baseResponse.data;
                        if (multiBattleFinishResponse3 != null && (map = multiBattleFinishResponse3.teamBattleResult) != null) {
                            battleTeamResult2 = map.get(Long.valueOf(j5));
                        } else {
                            battleTeamResult2 = null;
                        }
                        C974540bT2.LJJ(jSONObject, battleTeamResult, battleTeamResult2);
                    } else {
                        C974540bT2.LJJ(jSONObject, battleTeamResult, null);
                    }
                    C0K04.LJFF(Scene.SCENE_SERVICE, "finish_response", jSONObject);
                    c974540bT22.LLIIIJ("update_result", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
                    Map<Long, BattleTeamResult> map4 = ((MultiBattleFinishResponse) baseResponse.data).teamBattleResult;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("finish, battleResult = ");
                    sbLIZ.append(map4);
                    C20441214yg.LJIIIZ("MatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
                    C974540bT2 c974540bT23 = C974540bT2.LIZ;
                    int i4 = iLJJIJIIJI;
                    long j6 = j2;
                    CustomLinkMessage customLinkMessage2 = customLinkMessage;
                    if (customLinkMessage2 != null && (extraDataWrapper = customLinkMessage2.extra) != null && (linkMessage = extraDataWrapper.getLinkMessage()) != null) {
                        lValueOf3 = Long.valueOf(linkMessage.getMessageId());
                    }
                    c974540bT23.LLI(i4, j6, lValueOf3);
                    awS0S0111300_15.invoke((MultiBattleFinishResponse) baseResponse.data);
                    C20441214yg.LIZIZ("MatchMatchingCoordinator", "finish, success, callback");
                    C1C7U.LIZIZ("MatchMatchingCoordinator@f28c.requestSettleFinishApi$finishDispose$1");
                }
            }, new AfS0S0211100_15(this, j, z, i, c976210bVj, 0));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestSettleFinishApi: return cutShortUid: ");
        sbLIZ.append(j2);
        C20441214yg.LJIIIZ("MatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
    }
}
