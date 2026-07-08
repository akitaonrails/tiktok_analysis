package X;

import Y.AfS0S0111100_15;
import Y.AfS1S1210100_15;
import Y.AfS5S0100100_15;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS29S0200100_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS3S0101200_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976180bVg implements InterfaceC976360bVy {
    public final MatchBaseWidget LIZ;
    public final DataChannel LIZIZ;
    public InteractDisconnectDialog LIZJ;
    public LiveSheetFragment LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC976360bVy
    public final void LJJIFFI(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJII(C954460awe c954460awe, AwS381S0200000_15 awS381S0200000_15) {
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIL(long j, C13BV c13bv) {
    }

    @Override // X.InterfaceC976360bVy
    public final void LJI() {
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget == null || matchBaseWidget.getView() == null) {
            return;
        }
        MatchBaseWidget matchBaseWidget2 = this.LIZ;
        C16FS c16fs = matchBaseWidget2 != null ? (C16FS) matchBaseWidget2.findViewById(R.id.cnn) : null;
        MatchBaseWidget matchBaseWidget3 = this.LIZ;
        C985030bjx c985030bjx = matchBaseWidget3 != null ? (C985030bjx) matchBaseWidget3.findViewById(R.id.cnl) : null;
        if (c16fs != null) {
            C786410Ut5.LLJJJ(c16fs, 8);
        }
        if (c985030bjx != null) {
            C786410Ut5.LLJL(c985030bjx, 8);
            c985030bjx.LIZIZ();
        }
    }

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
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LIZIZ);
        if (c0utjPl1 != null) {
            c0utjPl1.LJIL(EnumC20429414wm.DETAIL, "match_playbook_entrance", null);
        }
        LiveSheetFragment liveSheetFragment = this.LIZLLL;
        if (liveSheetFragment != null) {
            liveSheetFragment.close();
        }
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZ("match_management_panel_dialog");
    }

    @Override // X.InterfaceC976360bVy
    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss dialog ");
        sbLIZ.append((Object) null);
        sbLIZ.append(" and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LJ("TwoMatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        InteractDisconnectDialog interactDisconnectDialog = this.LIZJ;
        if (interactDisconnectDialog != null) {
            interactDisconnectDialog.dismiss();
        }
    }

    public C976180bVg(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZIZ = dataChannelProvideDataChannel;
    }

    @Override // X.InterfaceC976360bVy
    public final void LJII(int i) {
        int height;
        MatchBaseWidget matchBaseWidget;
        View viewFindViewById;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MatchBaseWidget matchBaseWidget2 = this.LIZ;
        View view = null;
        if (matchBaseWidget2 != null) {
            view = matchBaseWidget2.getView();
        }
        boolean z = false;
        if (view != null && (matchBaseWidget = this.LIZ) != null && (viewFindViewById = matchBaseWidget.findViewById(R.id.mbw)) != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i2 = marginLayoutParams.topMargin;
            } else {
                i2 = 0;
            }
            height = i2 + (viewFindViewById.getHeight() / 2);
        } else {
            height = -1;
        }
        if (i != 0) {
            z = true;
        }
        C948560an8 c948560an8 = new C948560an8(height, z, EnumC919170a1j.MATCH_TYPE_1V1.getType(), 4);
        MatchBaseWidget matchBaseWidget3 = this.LIZ;
        if (matchBaseWidget3 != null && matchBaseWidget3.dataChannel != null) {
            DataChannel dataChannel = matchBaseWidget3.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(TwoMatchCutShortEvent.class, c948560an8);
                return;
            }
            return;
        }
        C784440Upu.LIZ().LIZIZ(c948560an8);
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIZ(int i, AwS224S0300000_15 awS224S0300000_15) {
        FragmentManager fragmentManager;
        InteractDisconnectDialog interactDisconnectDialog;
        if (this.LIZ == null) {
            return;
        }
        InteractDisconnectDialog interactDisconnectDialog2 = new InteractDisconnectDialog();
        this.LIZJ = interactDisconnectDialog2;
        interactDisconnectDialog2.LLIZLLLIL = C497740JfY.LJIJI(2131842771);
        interactDisconnectDialog2.LLJ = C497740JfY.LJIJI(2131842772);
        interactDisconnectDialog2.LLJI = 3;
        interactDisconnectDialog2.LLJILJIL = C497740JfY.LJIJI(2131842737);
        interactDisconnectDialog2.LLJIJIL = C497740JfY.LJIJI(2131842773);
        interactDisconnectDialog2.LLJJ = new AwS559S0100000_15(awS224S0300000_15, 1074);
        interactDisconnectDialog2.LLJILJILJ = false;
        interactDisconnectDialog2.LLJJI = AFwS203S0000000_15.get$arr$(443);
        interactDisconnectDialog2.onCancelListener = new DialogInterfaceOnCancelListenerC986960bn4(awS224S0300000_15, 9);
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (interactDisconnectDialog = this.LIZJ) != null) {
            interactDisconnectDialog.show(fragmentManager, "InteractDisconnectDialog");
        }
    }

    @Override // X.InterfaceC976360bVy
    public final void LJIILL(long j, AwS29S0200100_15 awS29S0200100_15, AwS594S0100000_15 awS594S0100000_15) {
        long channelId = C915980Zwa.LJII().getChannelId();
        C974540bT2.LIZ.LJLIL();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).quit(j, channelId).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS5S0100100_15(j, awS29S0200100_15, 12), new AfS5S0100100_15(j, awS594S0100000_15, 13));
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIJIIJI(boolean z, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
        C979690bbL c979690bbL;
        LiveSheetFragment liveSheetFragmentLJIIL;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        String str = null;
        if (matchBaseWidget != null && matchBaseWidget.context != null) {
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
            if ((!C915980Zwa.LIZLLL().UN0() || (C915980Zwa.LIZLLL().UN0() && C915980Zwa.LIZLLL().AR0())) && (C500260Jjc.LJJJI(Boolean.valueOf(C915980Zwa.LIZLLL().qp0())) || C163000js.LIZ())) {
                if (C918210a0B.LIZLLL) {
                    C978360bZC.LJIIL = "match_panel";
                    str = "playbook_guide_icon";
                    C978360bZC.LJIIJJI = "playbook_guide_icon";
                } else {
                    C978360bZC.LJIIJJI = "match_icon";
                }
                DataChannel dataChannel2 = this.LIZIZ;
                AwS594S0100000_15 awS594S0100000_152 = new AwS594S0100000_15(awS594S0100000_15, 1081);
                C976780bWe c976780bWe = new C976780bWe();
                c976780bWe.LIZIZ = awS594S0100000_152;
                c976780bWe.LIZJ = c979690bbL;
                c976780bWe.LIZLLL = awS559S0100000_15;
                c976780bWe.LJ = z;
                c976780bWe.LJFF = str;
                liveSheetFragmentLJIIL = C961300b7g.LJIIL(dataChannel2, c976780bWe);
            } else {
                liveSheetFragmentLJIIL = C961300b7g.LJIILIIL(this.LIZIZ, new C961680b8I(new AwS594S0100000_15(awS594S0100000_15, 1082), c979690bbL));
            }
            this.LIZLLL = liveSheetFragmentLJIIL;
        }
    }

    @Override // X.InterfaceC976360bVy
    public final void LJJIJIL(long j, List list, boolean z, boolean z2) {
        List<C954460awe> listLLILZLL;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        if (list != null) {
            for (C976800bWg c976800bWg : (ArrayList) list) {
                MatchBaseWidget matchBaseWidget = this.LIZ;
                if (matchBaseWidget != null) {
                    viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(c976800bWg.LIZ);
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
                MatchBaseWidget matchBaseWidget2 = this.LIZ;
                if (matchBaseWidget2 != null) {
                    String str = c954460awe.LJIIJJI;
                    MultiCoHostWindowManager multiCoHostWindowManager = matchBaseWidget2.LLILLJJLI;
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
            r0 = 188(0xbc, float:2.63E-43)
            r1 = r17
            r2.<init>(r1, r0)
            Y.AfS57S0110000_15 r1 = new Y.AfS57S0110000_15
            r0 = 24
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
        throw new UnsupportedOperationException("Method not decompiled: X.C976180bVg.LJJIIZ(int, int, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean):void");
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
        ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).leaveLinkMic(j2, j, j3, i, str, zIsAppBackground ? 1 : 0, i2, -1L).LJIILIIL(new C0UO0()).LJJLL(new AfS1S1210100_15(this, j, z, str, awS3S0101200_15, 1), new AfS0S0111100_15(i, j, c976310bVt, z, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0234  */
    @Override // X.InterfaceC976360bVy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(final long r33, final boolean r35, final long r36, final int r38, java.lang.String r39, long r40, final com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage r42, kotlin.jvm.internal.AwS0S0111300_15 r43, final kotlin.jvm.internal.AwS0S0111300_15 r44, kotlin.jvm.internal.AwS559S0100000_15 r45, X.C976210bVj r46) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976180bVg.LJIJI(long, boolean, long, int, java.lang.String, long, com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage, kotlin.jvm.internal.AwS0S0111300_15, kotlin.jvm.internal.AwS0S0111300_15, kotlin.jvm.internal.AwS559S0100000_15, X.0bVj):void");
    }
}
