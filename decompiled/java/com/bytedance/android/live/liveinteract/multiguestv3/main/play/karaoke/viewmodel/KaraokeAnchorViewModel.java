package com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel;

import X.C09JN;
import X.C0UO0;
import X.C1161920gLG;
import X.C11RD;
import X.C1946707jt;
import X.C480460Ism;
import X.C915980Zwa;
import X.C917720ZzO;
import X.C925150aBN;
import X.C930540aK4;
import X.C939230aY5;
import X.InterfaceC500100JjM;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import Y.AfS0S1301100_15;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.service.KaraokeApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget.KaraokeAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multilive.model.ManageViewerSingReq;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class KaraokeAnchorViewModel extends ViewModel {
    public final DataChannel LL;
    public boolean LLILLJJLI;

    public KaraokeAnchorViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void vQ2(final KaraokeAnchorWidget karaokeAnchorWidget, long j, long j2, final int i, Function1 function1, final Function1 function12) {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        String strU3;
        Long lLIZIZ;
        int i2;
        InterfaceC954180awC interfaceC954180awCLLJLL2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C939230aY5 c939230aY5LJJJLZIJ;
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            long jLongValue = lLJIIJ.longValue();
            long jLJIIL = C930540aK4.LJIIL();
            ManageViewerSingReq manageViewerSingReq = new ManageViewerSingReq();
            LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, "", "", 0, "");
            linkCommon.scene = 4;
            linkCommon.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
            linkCommon.live_id = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
            manageViewerSingReq.common = linkCommon;
            IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ = C915980Zwa.LJIIIIZZ();
            if (iMultiGuestV3InternalServiceV2LJIIIIZZ != null && (interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2LJIIIIZZ.LLJLL()) != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null && (lLIZIZ = C1946707jt.LIZIZ(strU3)) != null) {
                manageViewerSingReq.channelId = lLIZIZ.longValue();
                manageViewerSingReq.permiter = new Player(jLongValue, jLJIIL);
                manageViewerSingReq.applier = new Player(jLongValue, j);
                manageViewerSingReq.replyStatus = i;
                String strLIZLLL = C925150aBN.LIZLLL();
                if (strLIZLLL == null) {
                    C917720ZzO.LIZ.getClass();
                    C917720ZzO.LJII("KaraokeAnchorViewModel", "manageView failed, because layoutId is null", null);
                    if (function12 != null) {
                        function12.invoke(new Throwable("manageView failed, because layoutId is null"));
                        return;
                    }
                    return;
                }
                IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ2 = C915980Zwa.LJIIIIZZ();
                if (iMultiGuestV3InternalServiceV2LJIIIIZZ2 != null && (interfaceC954180awCLLJLL2 = iMultiGuestV3InternalServiceV2LJIIIIZZ2.LLJLL()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL2.LLIIJLIL()) != null && (c939230aY5LJJJLZIJ = interfaceC937900aVwLLIIJLIL.LJJJLZIJ()) != null) {
                    i2 = c939230aY5LJJJLZIJ.LIZ;
                } else {
                    i2 = 0;
                }
                LayoutDSLConfig layoutDSLConfig = new LayoutDSLConfig(i2, strLIZLLL);
                String str = layoutDSLConfig.layoutId;
                if (str == null) {
                    str = "";
                }
                manageViewerSingReq.dsl = new DSLConfig(layoutDSLConfig.sceneVersion, str);
                manageViewerSingReq.operator = new Player(jLongValue, jLJIIL);
                manageViewerSingReq.songId = j2;
                manageViewerSingReq.multiGuestReqExtra = new BizPermitParams(1800L, false, 0);
                this.LLILLJJLI = true;
                C480460Ism.LIZ().getClass();
                ((InterfaceC500100JjM) ((KaraokeApi) C480460Ism.LIZLLL(KaraokeApi.class)).manageViewerSing(manageViewerSingReq).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(karaokeAnchorWidget))).LIZ(new AfS0S1301100_15(this, i, j, manageViewerSingReq, function1, 1), new C09JN() { // from class: X.0a3g
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        int errorCode;
                        C1C7U.LIZ("KaraokeAnchorViewModel@ea0.manageViewerSingInternal$2");
                        Throwable th = (Throwable) obj;
                        this.LL.LLILLJJLI = false;
                        C917720ZzO.LIZ.getClass();
                        C917720ZzO.LJII("KaraokeAnchorViewModel", "manage viewer apply failed,", th);
                        Function1<Throwable, Unit> function13 = function12;
                        if (function13 != null) {
                            function13.invoke(th);
                        }
                        int i3 = i;
                        if (i3 != 2 && i3 == 1) {
                            KaraokeAnchorViewModel karaokeAnchorViewModel = this.LL;
                            KaraokeAnchorWidget karaokeAnchorWidget2 = karaokeAnchorWidget;
                            karaokeAnchorViewModel.getClass();
                            if ((th instanceof C501470JlZ) && ((errorCode = ((C501520Jle) th).getErrorCode()) == 31101 || errorCode == 4004026 || errorCode == 4004029)) {
                                AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                                if (abstractC922600a7G != null) {
                                    abstractC922600a7G.LJJIJ("permit_failed", 4, null, null);
                                }
                                if (errorCode == 31101) {
                                    String strLJIJI = C497740JfY.LJIJI(2131842763);
                                    HashMap map = new HashMap();
                                    C01Z4.LIZ(null, map);
                                    map.put("user_type", "anchor");
                                    map.put("msg_content", strLJIJI);
                                    map.put("msg_id", "pm_live_invitelimit");
                                    map.put("extra", "accept_viewer_to_sing_toast");
                                    C0KX4.LIZ("livesdk_toast_msg_show", map, null, true);
                                }
                            }
                            if (C500260Jjc.LJJJI(Boolean.valueOf(karaokeAnchorWidget2.isViewValid))) {
                                C501540Jlg.LIZLLL(karaokeAnchorWidget2.context, th, 2131840684);
                            }
                        }
                        C1C7U.LIZIZ("KaraokeAnchorViewModel@ea0.manageViewerSingInternal$2");
                    }
                });
                return;
            }
            C917720ZzO.LIZ.getClass();
            C917720ZzO.LJII("KaraokeAnchorViewModel", "manageView failed, because  channelId is null", null);
            if (function12 != null) {
                function12.invoke(new Throwable("manageView failed, because  channelId is null"));
                return;
            }
            return;
        }
        C917720ZzO.LIZ.getClass();
        C917720ZzO.LJII("KaraokeAnchorViewModel", "manageView failed, because roomId is null", null);
        if (function12 != null) {
            function12.invoke(new Throwable("manageView failed, because roomId is null"));
        }
    }
}
